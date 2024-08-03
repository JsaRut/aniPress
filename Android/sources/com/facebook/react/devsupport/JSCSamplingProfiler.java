package com.facebook.react.devsupport;

import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import p139d.p143b.p208m.p212d.p213a.InterfaceC2073a;

@InterfaceC2073a(name = "JSCSamplingProfiler", needsEagerInit = true)
/* loaded from: classes.dex */
public class JSCSamplingProfiler extends ReactContextBaseJavaModule {
    private static final HashSet<JSCSamplingProfiler> sRegisteredDumpers = new HashSet<>();
    private String mOperationError;
    private boolean mOperationInProgress;
    private int mOperationToken;
    private SamplingProfiler mSamplingProfiler;
    private String mSamplingProfilerResult;

    /* loaded from: classes.dex */
    public interface SamplingProfiler extends JavaScriptModule {
        void poke(int i);
    }

    /* renamed from: com.facebook.react.devsupport.JSCSamplingProfiler$a */
    /* loaded from: classes.dex */
    public static class C1110a extends Exception {
        C1110a(String str) {
            super(str);
        }
    }

    public JSCSamplingProfiler(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mSamplingProfiler = null;
        this.mOperationInProgress = false;
        this.mOperationToken = 0;
        this.mOperationError = null;
        this.mSamplingProfilerResult = null;
    }

    private int getOperationToken() {
        if (this.mOperationInProgress) {
            throw new C1110a("Another operation already in progress.");
        }
        this.mOperationInProgress = true;
        int i = this.mOperationToken + 1;
        this.mOperationToken = i;
        return i;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public static synchronized List<String> poke(long j) {
        LinkedList linkedList;
        synchronized (JSCSamplingProfiler.class) {
            linkedList = new LinkedList();
            if (sRegisteredDumpers.isEmpty()) {
                throw new C1110a("No JSC registered");
            }
            Iterator<JSCSamplingProfiler> it = sRegisteredDumpers.iterator();
            while (it.hasNext()) {
                JSCSamplingProfiler next = it.next();
                next.pokeHelper(j);
                linkedList.add(next.mSamplingProfilerResult);
            }
        }
        return linkedList;
    }

    private synchronized void pokeHelper(long j) {
        if (this.mSamplingProfiler == null) {
            throw new C1110a("SamplingProfiler.js module not connected");
        }
        this.mSamplingProfiler.poke(getOperationToken());
        waitForOperation(j);
    }

    private static synchronized void registerSamplingProfiler(JSCSamplingProfiler jSCSamplingProfiler) {
        synchronized (JSCSamplingProfiler.class) {
            if (sRegisteredDumpers.contains(jSCSamplingProfiler)) {
                throw new RuntimeException("a JSCSamplingProfiler registered more than once");
            }
            sRegisteredDumpers.add(jSCSamplingProfiler);
        }
    }

    private static synchronized void unregisterSamplingProfiler(JSCSamplingProfiler jSCSamplingProfiler) {
        synchronized (JSCSamplingProfiler.class) {
            sRegisteredDumpers.remove(jSCSamplingProfiler);
        }
    }

    private void waitForOperation(long j) {
        try {
            wait(j);
            if (this.mOperationInProgress) {
                this.mOperationInProgress = false;
                throw new C1110a("heap capture timed out.");
            }
            String str = this.mOperationError;
            if (str != null) {
                throw new C1110a(str);
            }
        } catch (InterruptedException e2) {
            throw new C1110a("Waiting for heap capture failed: " + e2.getMessage());
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "JSCSamplingProfiler";
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void initialize() {
        super.initialize();
        this.mSamplingProfiler = (SamplingProfiler) getReactApplicationContext().getJSModule(SamplingProfiler.class);
        registerSamplingProfiler(this);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        super.onCatalystInstanceDestroy();
        unregisterSamplingProfiler(this);
        this.mSamplingProfiler = null;
    }

    @ReactMethod
    public synchronized void operationComplete(int i, String str, String str2) {
        if (i != this.mOperationToken) {
            throw new RuntimeException("Completed operation is not in progress.");
        }
        this.mOperationInProgress = false;
        this.mSamplingProfilerResult = str;
        this.mOperationError = str2;
        notify();
    }
}
