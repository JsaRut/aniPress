package com.facebook.react.devsupport;

import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import java.io.File;
import p139d.p143b.p208m.p212d.p213a.InterfaceC2073a;

@InterfaceC2073a(name = "JSCHeapCapture", needsEagerInit = true)
/* loaded from: classes.dex */
public class JSCHeapCapture extends ReactContextBaseJavaModule {
    private InterfaceC1108a mCaptureInProgress;

    /* loaded from: classes.dex */
    public interface HeapCapture extends JavaScriptModule {
        void captureHeap(String str);
    }

    /* renamed from: com.facebook.react.devsupport.JSCHeapCapture$a */
    /* loaded from: classes.dex */
    public interface InterfaceC1108a {
        /* renamed from: a */
        void m5194a(C1109b c1109b);

        /* renamed from: a */
        void m5195a(File file);
    }

    /* renamed from: com.facebook.react.devsupport.JSCHeapCapture$b */
    /* loaded from: classes.dex */
    public static class C1109b extends Exception {
        /* JADX INFO: Access modifiers changed from: package-private */
        public C1109b(String str) {
            super(str);
        }
    }

    public JSCHeapCapture(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mCaptureInProgress = null;
    }

    @ReactMethod
    public synchronized void captureComplete(String str, String str2) {
        if (this.mCaptureInProgress != null) {
            if (str2 == null) {
                this.mCaptureInProgress.m5195a(new File(str));
            } else {
                this.mCaptureInProgress.m5194a(new C1109b(str2));
            }
            this.mCaptureInProgress = null;
        }
    }

    public synchronized void captureHeap(String str, InterfaceC1108a interfaceC1108a) {
        if (this.mCaptureInProgress != null) {
            interfaceC1108a.m5194a(new C1109b("Heap capture already in progress."));
            return;
        }
        File file = new File(str + "/capture.json");
        file.delete();
        HeapCapture heapCapture = (HeapCapture) getReactApplicationContext().getJSModule(HeapCapture.class);
        if (heapCapture == null) {
            interfaceC1108a.m5194a(new C1109b("Heap capture js module not registered."));
        } else {
            this.mCaptureInProgress = interfaceC1108a;
            heapCapture.captureHeap(file.getPath());
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "JSCHeapCapture";
    }
}
