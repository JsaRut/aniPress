package com.facebook.react.modules.image;

import android.net.Uri;
import android.os.AsyncTask;
import android.util.SparseArray;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import p139d.p143b.p148c.p150b.C1673a;
import p139d.p143b.p161d.InterfaceC1736e;
import p139d.p143b.p169g.p170a.p171a.C1763c;
import p139d.p143b.p184i.p201o.C2024d;
import p139d.p143b.p208m.p212d.p213a.InterfaceC2073a;

@InterfaceC2073a(name = ImageLoaderModule.NAME)
/* loaded from: classes.dex */
public class ImageLoaderModule extends ReactContextBaseJavaModule implements LifecycleEventListener {
    private static final String ERROR_GET_SIZE_FAILURE = "E_GET_SIZE_FAILURE";
    private static final String ERROR_INVALID_URI = "E_INVALID_URI";
    private static final String ERROR_PREFETCH_FAILURE = "E_PREFETCH_FAILURE";
    public static final String NAME = "ImageLoader";
    private final Object mCallerContext;
    private final Object mEnqueuedRequestMonitor;
    private final SparseArray<InterfaceC1736e<Void>> mEnqueuedRequests;

    public ImageLoaderModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mEnqueuedRequestMonitor = new Object();
        this.mEnqueuedRequests = new SparseArray<>();
        this.mCallerContext = this;
    }

    public ImageLoaderModule(ReactApplicationContext reactApplicationContext, Object obj) {
        super(reactApplicationContext);
        this.mEnqueuedRequestMonitor = new Object();
        this.mEnqueuedRequests = new SparseArray<>();
        this.mCallerContext = obj;
    }

    private void registerRequest(int i, InterfaceC1736e<Void> interfaceC1736e) {
        synchronized (this.mEnqueuedRequestMonitor) {
            this.mEnqueuedRequests.put(i, interfaceC1736e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public InterfaceC1736e<Void> removeRequest(int i) {
        InterfaceC1736e<Void> interfaceC1736e;
        synchronized (this.mEnqueuedRequestMonitor) {
            interfaceC1736e = this.mEnqueuedRequests.get(i);
            this.mEnqueuedRequests.remove(i);
        }
        return interfaceC1736e;
    }

    @ReactMethod
    public void abortRequest(int i) {
        InterfaceC1736e<Void> removeRequest = removeRequest(i);
        if (removeRequest != null) {
            removeRequest.close();
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void getSize(String str, Promise promise) {
        if (str == null || str.isEmpty()) {
            promise.reject(ERROR_INVALID_URI, "Cannot get the size of an image for an empty URI");
        } else {
            C1763c.m7207a().m7683a(C2024d.m8255a(Uri.parse(str)).m8257a(), this.mCallerContext).mo7111a(new C1191a(this, promise), C1673a.m6936a());
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        synchronized (this.mEnqueuedRequestMonitor) {
            int size = this.mEnqueuedRequests.size();
            for (int i = 0; i < size; i++) {
                InterfaceC1736e<Void> valueAt = this.mEnqueuedRequests.valueAt(i);
                if (valueAt != null) {
                    valueAt.close();
                }
            }
            this.mEnqueuedRequests.clear();
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
    }

    @ReactMethod
    public void prefetchImage(String str, int i, Promise promise) {
        if (str == null || str.isEmpty()) {
            promise.reject(ERROR_INVALID_URI, "Cannot prefetch an image for an empty URI");
            return;
        }
        InterfaceC1736e<Void> m7691b = C1763c.m7207a().m7691b(C2024d.m8255a(Uri.parse(str)).m8257a(), this.mCallerContext);
        C1192b c1192b = new C1192b(this, i, promise);
        registerRequest(i, m7691b);
        m7691b.mo7111a(c1192b, C1673a.m6936a());
    }

    @ReactMethod
    public void queryCache(ReadableArray readableArray, Promise promise) {
        new AsyncTaskC1193c(this, getReactApplicationContext(), readableArray, promise).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }
}
