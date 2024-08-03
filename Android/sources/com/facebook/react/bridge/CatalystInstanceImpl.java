package com.facebook.react.bridge;

import android.content.res.AssetManager;
import android.os.AsyncTask;
import android.util.Log;
import com.facebook.jni.HybridData;
import com.facebook.react.bridge.queue.MessageQueueThread;
import com.facebook.react.bridge.queue.QueueThreadExceptionHandler;
import com.facebook.react.bridge.queue.ReactQueueConfiguration;
import com.facebook.react.bridge.queue.ReactQueueConfigurationImpl;
import com.facebook.react.bridge.queue.ReactQueueConfigurationSpec;
import com.facebook.systrace.C1550a;
import com.facebook.systrace.TraceListener;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import p139d.p143b.p148c.p153e.C1700a;
import p139d.p143b.p204k.p205a.C2038a;
import p139d.p143b.p206l.p207a.InterfaceC2039a;
import p139d.p143b.p208m.p212d.p213a.InterfaceC2073a;

@InterfaceC2039a
/* loaded from: classes.dex */
public class CatalystInstanceImpl implements CatalystInstance {
    private static final AtomicInteger sNextInstanceIdForTrace;
    private volatile boolean mAcceptCalls;
    private final CopyOnWriteArrayList<NotThreadSafeBridgeIdleDebugListener> mBridgeIdleListeners;
    private volatile boolean mDestroyed;
    private final HybridData mHybridData;
    private boolean mInitialized;
    private boolean mJSBundleHasLoaded;
    private final JSBundleLoader mJSBundleLoader;
    private final ArrayList<PendingJSCall> mJSCallsPendingInit;
    private final Object mJSCallsPendingInitLock;
    private final JSIModuleRegistry mJSIModuleRegistry;
    private final JavaScriptModuleRegistry mJSModuleRegistry;
    private JavaScriptContextHolder mJavaScriptContextHolder;
    private final String mJsPendingCallsTitleForTrace;
    private final NativeModuleCallExceptionHandler mNativeModuleCallExceptionHandler;
    private final NativeModuleRegistry mNativeModuleRegistry;
    private final MessageQueueThread mNativeModulesQueueThread;
    private final AtomicInteger mPendingJSCalls;
    private final ReactQueueConfigurationImpl mReactQueueConfiguration;
    private String mSourceURL;
    private final TraceListener mTraceListener;

    /* loaded from: classes.dex */
    private static class BridgeCallback implements ReactCallback {
        private final WeakReference<CatalystInstanceImpl> mOuter;

        BridgeCallback(CatalystInstanceImpl catalystInstanceImpl) {
            this.mOuter = new WeakReference<>(catalystInstanceImpl);
        }

        @Override // com.facebook.react.bridge.ReactCallback
        public void decrementPendingJSCalls() {
            CatalystInstanceImpl catalystInstanceImpl = this.mOuter.get();
            if (catalystInstanceImpl != null) {
                catalystInstanceImpl.decrementPendingJSCalls();
            }
        }

        @Override // com.facebook.react.bridge.ReactCallback
        public void incrementPendingJSCalls() {
            CatalystInstanceImpl catalystInstanceImpl = this.mOuter.get();
            if (catalystInstanceImpl != null) {
                catalystInstanceImpl.incrementPendingJSCalls();
            }
        }

        @Override // com.facebook.react.bridge.ReactCallback
        public void onBatchComplete() {
            CatalystInstanceImpl catalystInstanceImpl = this.mOuter.get();
            if (catalystInstanceImpl != null) {
                catalystInstanceImpl.mNativeModuleRegistry.onBatchComplete();
            }
        }
    }

    /* loaded from: classes.dex */
    public static class Builder {
        private JSBundleLoader mJSBundleLoader;
        private JavaScriptExecutor mJSExecutor;
        private NativeModuleCallExceptionHandler mNativeModuleCallExceptionHandler;
        private ReactQueueConfigurationSpec mReactQueueConfigurationSpec;
        private NativeModuleRegistry mRegistry;

        public CatalystInstanceImpl build() {
            ReactQueueConfigurationSpec reactQueueConfigurationSpec = this.mReactQueueConfigurationSpec;
            C2038a.m8318a(reactQueueConfigurationSpec);
            ReactQueueConfigurationSpec reactQueueConfigurationSpec2 = reactQueueConfigurationSpec;
            JavaScriptExecutor javaScriptExecutor = this.mJSExecutor;
            C2038a.m8318a(javaScriptExecutor);
            JavaScriptExecutor javaScriptExecutor2 = javaScriptExecutor;
            NativeModuleRegistry nativeModuleRegistry = this.mRegistry;
            C2038a.m8318a(nativeModuleRegistry);
            NativeModuleRegistry nativeModuleRegistry2 = nativeModuleRegistry;
            JSBundleLoader jSBundleLoader = this.mJSBundleLoader;
            C2038a.m8318a(jSBundleLoader);
            JSBundleLoader jSBundleLoader2 = jSBundleLoader;
            NativeModuleCallExceptionHandler nativeModuleCallExceptionHandler = this.mNativeModuleCallExceptionHandler;
            C2038a.m8318a(nativeModuleCallExceptionHandler);
            return new CatalystInstanceImpl(reactQueueConfigurationSpec2, javaScriptExecutor2, nativeModuleRegistry2, jSBundleLoader2, nativeModuleCallExceptionHandler);
        }

        public Builder setJSBundleLoader(JSBundleLoader jSBundleLoader) {
            this.mJSBundleLoader = jSBundleLoader;
            return this;
        }

        public Builder setJSExecutor(JavaScriptExecutor javaScriptExecutor) {
            this.mJSExecutor = javaScriptExecutor;
            return this;
        }

        public Builder setNativeModuleCallExceptionHandler(NativeModuleCallExceptionHandler nativeModuleCallExceptionHandler) {
            this.mNativeModuleCallExceptionHandler = nativeModuleCallExceptionHandler;
            return this;
        }

        public Builder setReactQueueConfigurationSpec(ReactQueueConfigurationSpec reactQueueConfigurationSpec) {
            this.mReactQueueConfigurationSpec = reactQueueConfigurationSpec;
            return this;
        }

        public Builder setRegistry(NativeModuleRegistry nativeModuleRegistry) {
            this.mRegistry = nativeModuleRegistry;
            return this;
        }
    }

    /* loaded from: classes.dex */
    private static class JSProfilerTraceListener implements TraceListener {
        private final WeakReference<CatalystInstanceImpl> mOuter;

        public JSProfilerTraceListener(CatalystInstanceImpl catalystInstanceImpl) {
            this.mOuter = new WeakReference<>(catalystInstanceImpl);
        }

        public void onTraceStarted() {
            CatalystInstanceImpl catalystInstanceImpl = this.mOuter.get();
            if (catalystInstanceImpl != null) {
                ((Systrace) catalystInstanceImpl.getJSModule(Systrace.class)).setEnabled(true);
            }
        }

        public void onTraceStopped() {
            CatalystInstanceImpl catalystInstanceImpl = this.mOuter.get();
            if (catalystInstanceImpl != null) {
                ((Systrace) catalystInstanceImpl.getJSModule(Systrace.class)).setEnabled(false);
            }
        }
    }

    /* loaded from: classes.dex */
    private class NativeExceptionHandler implements QueueThreadExceptionHandler {
        private NativeExceptionHandler() {
        }

        @Override // com.facebook.react.bridge.queue.QueueThreadExceptionHandler
        public void handleException(Exception exc) {
            CatalystInstanceImpl.this.onNativeException(exc);
        }
    }

    /* loaded from: classes.dex */
    public static class PendingJSCall {
        public NativeArray mArguments;
        public String mMethod;
        public String mModule;

        public PendingJSCall(String str, String str2, NativeArray nativeArray) {
            this.mModule = str;
            this.mMethod = str2;
            this.mArguments = nativeArray;
        }

        void call(CatalystInstanceImpl catalystInstanceImpl) {
            NativeArray nativeArray = this.mArguments;
            if (nativeArray == null) {
                nativeArray = new WritableNativeArray();
            }
            catalystInstanceImpl.jniCallJSFunction(this.mModule, this.mMethod, nativeArray);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.mModule);
            sb.append(".");
            sb.append(this.mMethod);
            sb.append("(");
            NativeArray nativeArray = this.mArguments;
            sb.append(nativeArray == null ? "" : nativeArray.toString());
            sb.append(")");
            return sb.toString();
        }
    }

    static {
        ReactBridge.staticInit();
        sNextInstanceIdForTrace = new AtomicInteger(1);
    }

    private CatalystInstanceImpl(ReactQueueConfigurationSpec reactQueueConfigurationSpec, JavaScriptExecutor javaScriptExecutor, NativeModuleRegistry nativeModuleRegistry, JSBundleLoader jSBundleLoader, NativeModuleCallExceptionHandler nativeModuleCallExceptionHandler) {
        this.mPendingJSCalls = new AtomicInteger(0);
        this.mJsPendingCallsTitleForTrace = "pending_js_calls_instance" + sNextInstanceIdForTrace.getAndIncrement();
        this.mDestroyed = false;
        this.mJSCallsPendingInit = new ArrayList<>();
        this.mJSCallsPendingInitLock = new Object();
        this.mJSIModuleRegistry = new JSIModuleRegistry();
        this.mInitialized = false;
        this.mAcceptCalls = false;
        Log.d("ReactNative", "Initializing React Xplat Bridge.");
        C1550a.m6454a(0L, "createCatalystInstanceImpl");
        this.mHybridData = initHybrid();
        this.mReactQueueConfiguration = ReactQueueConfigurationImpl.create(reactQueueConfigurationSpec, new NativeExceptionHandler());
        this.mBridgeIdleListeners = new CopyOnWriteArrayList<>();
        this.mNativeModuleRegistry = nativeModuleRegistry;
        this.mJSModuleRegistry = new JavaScriptModuleRegistry();
        this.mJSBundleLoader = jSBundleLoader;
        this.mNativeModuleCallExceptionHandler = nativeModuleCallExceptionHandler;
        this.mNativeModulesQueueThread = this.mReactQueueConfiguration.getNativeModulesQueueThread();
        this.mTraceListener = new JSProfilerTraceListener(this);
        C1550a.m6453a(0L);
        Log.d("ReactNative", "Initializing React Xplat Bridge before initializeBridge");
        C1550a.m6454a(0L, "initializeCxxBridge");
        initializeBridge(new BridgeCallback(this), javaScriptExecutor, this.mReactQueueConfiguration.getJSQueueThread(), this.mNativeModulesQueueThread, this.mNativeModuleRegistry.getJavaModules(this), this.mNativeModuleRegistry.getCxxModules());
        Log.d("ReactNative", "Initializing React Xplat Bridge after initializeBridge");
        C1550a.m6453a(0L);
        this.mJavaScriptContextHolder = new JavaScriptContextHolder(getJavaScriptContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void decrementPendingJSCalls() {
        int decrementAndGet = this.mPendingJSCalls.decrementAndGet();
        boolean z = decrementAndGet == 0;
        C1550a.m6465e(0L, this.mJsPendingCallsTitleForTrace, decrementAndGet);
        if (!z || this.mBridgeIdleListeners.isEmpty()) {
            return;
        }
        this.mNativeModulesQueueThread.runOnQueue(new Runnable() { // from class: com.facebook.react.bridge.CatalystInstanceImpl.4
            @Override // java.lang.Runnable
            public void run() {
                Iterator it = CatalystInstanceImpl.this.mBridgeIdleListeners.iterator();
                while (it.hasNext()) {
                    ((NotThreadSafeBridgeIdleDebugListener) it.next()).onTransitionToBridgeIdle();
                }
            }
        });
    }

    private native long getJavaScriptContext();

    private <T extends NativeModule> String getNameFromAnnotation(Class<T> cls) {
        InterfaceC2073a interfaceC2073a = (InterfaceC2073a) cls.getAnnotation(InterfaceC2073a.class);
        if (interfaceC2073a != null) {
            return interfaceC2073a.name();
        }
        throw new IllegalArgumentException("Could not find @ReactModule annotation in " + cls.getCanonicalName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void incrementPendingJSCalls() {
        int andIncrement = this.mPendingJSCalls.getAndIncrement();
        boolean z = andIncrement == 0;
        C1550a.m6465e(0L, this.mJsPendingCallsTitleForTrace, andIncrement + 1);
        if (!z || this.mBridgeIdleListeners.isEmpty()) {
            return;
        }
        this.mNativeModulesQueueThread.runOnQueue(new Runnable() { // from class: com.facebook.react.bridge.CatalystInstanceImpl.3
            @Override // java.lang.Runnable
            public void run() {
                Iterator it = CatalystInstanceImpl.this.mBridgeIdleListeners.iterator();
                while (it.hasNext()) {
                    ((NotThreadSafeBridgeIdleDebugListener) it.next()).onTransitionToBridgeBusy();
                }
            }
        });
    }

    private static native HybridData initHybrid();

    private native void initializeBridge(ReactCallback reactCallback, JavaScriptExecutor javaScriptExecutor, MessageQueueThread messageQueueThread, MessageQueueThread messageQueueThread2, Collection<JavaModuleWrapper> collection, Collection<ModuleHolder> collection2);

    private native void jniCallJSCallback(int i, NativeArray nativeArray);

    /* JADX INFO: Access modifiers changed from: private */
    public native void jniCallJSFunction(String str, String str2, NativeArray nativeArray);

    private native void jniExtendNativeModules(Collection<JavaModuleWrapper> collection, Collection<ModuleHolder> collection2);

    private native void jniHandleMemoryPressure(int i);

    private native void jniLoadScriptFromAssets(AssetManager assetManager, String str, boolean z);

    private native void jniLoadScriptFromDeltaBundle(String str, NativeDeltaClient nativeDeltaClient, boolean z);

    private native void jniLoadScriptFromFile(String str, String str2, boolean z);

    private native void jniRegisterSegment(int i, String str);

    private native void jniSetSourceURL(String str);

    /* JADX INFO: Access modifiers changed from: private */
    public void onNativeException(Exception exc) {
        this.mNativeModuleCallExceptionHandler.handleException(exc);
        this.mReactQueueConfiguration.getUIQueueThread().runOnQueue(new Runnable() { // from class: com.facebook.react.bridge.CatalystInstanceImpl.5
            @Override // java.lang.Runnable
            public void run() {
                CatalystInstanceImpl.this.destroy();
            }
        });
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public void addBridgeIdleDebugListener(NotThreadSafeBridgeIdleDebugListener notThreadSafeBridgeIdleDebugListener) {
        this.mBridgeIdleListeners.add(notThreadSafeBridgeIdleDebugListener);
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public void addJSIModules(List<JSIModuleSpec> list) {
        this.mJSIModuleRegistry.registerModules(list);
    }

    public void callFunction(PendingJSCall pendingJSCall) {
        if (this.mDestroyed) {
            C1700a.m7015d("ReactNative", "Calling JS function after bridge has been destroyed: " + pendingJSCall.toString());
            return;
        }
        if (!this.mAcceptCalls) {
            synchronized (this.mJSCallsPendingInitLock) {
                if (!this.mAcceptCalls) {
                    this.mJSCallsPendingInit.add(pendingJSCall);
                    return;
                }
            }
        }
        pendingJSCall.call(this);
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public void callFunction(String str, String str2, NativeArray nativeArray) {
        callFunction(new PendingJSCall(str, str2, nativeArray));
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public void destroy() {
        Log.d("ReactNative", "CatalystInstanceImpl.destroy() start");
        UiThreadUtil.assertOnUiThread();
        if (this.mDestroyed) {
            return;
        }
        ReactMarker.logMarker(ReactMarkerConstants.DESTROY_CATALYST_INSTANCE_START);
        this.mDestroyed = true;
        this.mNativeModulesQueueThread.runOnQueue(new Runnable() { // from class: com.facebook.react.bridge.CatalystInstanceImpl.1
            @Override // java.lang.Runnable
            public void run() {
                CatalystInstanceImpl.this.mNativeModuleRegistry.notifyJSInstanceDestroy();
                CatalystInstanceImpl.this.mJSIModuleRegistry.notifyJSInstanceDestroy();
                boolean z = CatalystInstanceImpl.this.mPendingJSCalls.getAndSet(0) == 0;
                if (!CatalystInstanceImpl.this.mBridgeIdleListeners.isEmpty()) {
                    Iterator it = CatalystInstanceImpl.this.mBridgeIdleListeners.iterator();
                    while (it.hasNext()) {
                        NotThreadSafeBridgeIdleDebugListener notThreadSafeBridgeIdleDebugListener = (NotThreadSafeBridgeIdleDebugListener) it.next();
                        if (!z) {
                            notThreadSafeBridgeIdleDebugListener.onTransitionToBridgeIdle();
                        }
                        notThreadSafeBridgeIdleDebugListener.onBridgeDestroyed();
                    }
                }
                AsyncTask.execute(new Runnable() { // from class: com.facebook.react.bridge.CatalystInstanceImpl.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        CatalystInstanceImpl.this.mJavaScriptContextHolder.clear();
                        CatalystInstanceImpl.this.mHybridData.m5090a();
                        CatalystInstanceImpl.this.getReactQueueConfiguration().destroy();
                        Log.d("ReactNative", "CatalystInstanceImpl.destroy() end");
                        ReactMarker.logMarker(ReactMarkerConstants.DESTROY_CATALYST_INSTANCE_END);
                    }
                });
            }
        });
        C1550a.m6461b(this.mTraceListener);
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public void extendNativeModules(NativeModuleRegistry nativeModuleRegistry) {
        this.mNativeModuleRegistry.registerModules(nativeModuleRegistry);
        jniExtendNativeModules(nativeModuleRegistry.getJavaModules(this), nativeModuleRegistry.getCxxModules());
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public <T extends JSIModule> T getJSIModule(Class<T> cls) {
        return (T) this.mJSIModuleRegistry.getModule(cls);
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public <T extends JavaScriptModule> T getJSModule(Class<T> cls) {
        return (T) this.mJSModuleRegistry.getJavaScriptModule(this, cls);
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public JavaScriptContextHolder getJavaScriptContextHolder() {
        return this.mJavaScriptContextHolder;
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public <T extends NativeModule> T getNativeModule(Class<T> cls) {
        return (T) this.mNativeModuleRegistry.getModule(getNameFromAnnotation(cls));
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public NativeModule getNativeModule(String str) {
        return this.mNativeModuleRegistry.getModule(str);
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public Collection<NativeModule> getNativeModules() {
        return this.mNativeModuleRegistry.getAllModules();
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public ReactQueueConfiguration getReactQueueConfiguration() {
        return this.mReactQueueConfiguration;
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public String getSourceURL() {
        return this.mSourceURL;
    }

    @Override // com.facebook.react.bridge.MemoryPressureListener
    public void handleMemoryPressure(int i) {
        if (this.mDestroyed) {
            return;
        }
        jniHandleMemoryPressure(i);
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public <T extends NativeModule> boolean hasNativeModule(Class<T> cls) {
        return this.mNativeModuleRegistry.hasModule(getNameFromAnnotation(cls));
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public boolean hasRunJSBundle() {
        boolean z;
        synchronized (this.mJSCallsPendingInitLock) {
            z = this.mJSBundleHasLoaded && this.mAcceptCalls;
        }
        return z;
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public void initialize() {
        Log.d("ReactNative", "CatalystInstanceImpl.initialize()");
        C2038a.m8321a(!this.mInitialized, "This catalyst instance has already been initialized");
        C2038a.m8321a(this.mAcceptCalls, "RunJSBundle hasn't completed.");
        this.mInitialized = true;
        this.mNativeModulesQueueThread.runOnQueue(new Runnable() { // from class: com.facebook.react.bridge.CatalystInstanceImpl.2
            @Override // java.lang.Runnable
            public void run() {
                CatalystInstanceImpl.this.mNativeModuleRegistry.notifyJSInstanceInitialized();
            }
        });
    }

    @Override // com.facebook.react.bridge.CatalystInstance, com.facebook.react.bridge.JSInstance
    public void invokeCallback(int i, NativeArrayInterface nativeArrayInterface) {
        if (this.mDestroyed) {
            C1700a.m7015d("ReactNative", "Invoking JS callback after bridge has been destroyed.");
        } else {
            jniCallJSCallback(i, (NativeArray) nativeArrayInterface);
        }
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public boolean isDestroyed() {
        return this.mDestroyed;
    }

    @Override // com.facebook.react.bridge.JSBundleLoaderDelegate
    public void loadScriptFromAssets(AssetManager assetManager, String str, boolean z) {
        this.mSourceURL = str;
        jniLoadScriptFromAssets(assetManager, str, z);
    }

    @Override // com.facebook.react.bridge.JSBundleLoaderDelegate
    public void loadScriptFromDeltaBundle(String str, NativeDeltaClient nativeDeltaClient, boolean z) {
        this.mSourceURL = str;
        jniLoadScriptFromDeltaBundle(str, nativeDeltaClient, z);
    }

    @Override // com.facebook.react.bridge.JSBundleLoaderDelegate
    public void loadScriptFromFile(String str, String str2, boolean z) {
        this.mSourceURL = str2;
        jniLoadScriptFromFile(str, str2, z);
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public void registerSegment(int i, String str) {
        jniRegisterSegment(i, str);
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public void removeBridgeIdleDebugListener(NotThreadSafeBridgeIdleDebugListener notThreadSafeBridgeIdleDebugListener) {
        this.mBridgeIdleListeners.remove(notThreadSafeBridgeIdleDebugListener);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.facebook.react.bridge.CatalystInstance
    public void runJSBundle() {
        Log.d("ReactNative", "CatalystInstanceImpl.runJSBundle()");
        C2038a.m8321a(!this.mJSBundleHasLoaded, "JS bundle was already loaded!");
        this.mJSBundleLoader.loadScript(this);
        synchronized (this.mJSCallsPendingInitLock) {
            this.mAcceptCalls = true;
            Iterator<PendingJSCall> it = this.mJSCallsPendingInit.iterator();
            while (it.hasNext()) {
                it.next().call(this);
            }
            this.mJSCallsPendingInit.clear();
            this.mJSBundleHasLoaded = true;
        }
        C1550a.m6458a(this.mTraceListener);
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public native void setGlobalVariable(String str, String str2);

    @Override // com.facebook.react.bridge.JSBundleLoaderDelegate
    public void setSourceURLs(String str, String str2) {
        this.mSourceURL = str;
        jniSetSourceURL(str2);
    }
}
