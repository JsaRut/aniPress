package com.facebook.react.bridge;

import com.facebook.react.bridge.queue.ReactQueueConfiguration;
import java.util.Collection;
import java.util.List;
import p139d.p143b.p206l.p207a.InterfaceC2039a;

@InterfaceC2039a
/* loaded from: classes.dex */
public interface CatalystInstance extends MemoryPressureListener, JSInstance, JSBundleLoaderDelegate {
    void addBridgeIdleDebugListener(NotThreadSafeBridgeIdleDebugListener notThreadSafeBridgeIdleDebugListener);

    void addJSIModules(List<JSIModuleSpec> list);

    @InterfaceC2039a
    void callFunction(String str, String str2, NativeArray nativeArray);

    void destroy();

    void extendNativeModules(NativeModuleRegistry nativeModuleRegistry);

    <T extends JSIModule> T getJSIModule(Class<T> cls);

    <T extends JavaScriptModule> T getJSModule(Class<T> cls);

    JavaScriptContextHolder getJavaScriptContextHolder();

    <T extends NativeModule> T getNativeModule(Class<T> cls);

    NativeModule getNativeModule(String str);

    Collection<NativeModule> getNativeModules();

    ReactQueueConfiguration getReactQueueConfiguration();

    String getSourceURL();

    <T extends NativeModule> boolean hasNativeModule(Class<T> cls);

    boolean hasRunJSBundle();

    void initialize();

    @Override // com.facebook.react.bridge.JSInstance
    @InterfaceC2039a
    void invokeCallback(int i, NativeArrayInterface nativeArrayInterface);

    boolean isDestroyed();

    void registerSegment(int i, String str);

    void removeBridgeIdleDebugListener(NotThreadSafeBridgeIdleDebugListener notThreadSafeBridgeIdleDebugListener);

    void runJSBundle();

    void setGlobalVariable(String str, String str2);
}
