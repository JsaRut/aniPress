package com.facebook.react.modules.core;

import android.net.Uri;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;
import p139d.p143b.p208m.p212d.p213a.InterfaceC2073a;

@InterfaceC2073a(name = DeviceEventManagerModule.NAME)
/* loaded from: classes.dex */
public class DeviceEventManagerModule extends ReactContextBaseJavaModule {
    public static final String NAME = "DeviceEventManager";
    private final Runnable mInvokeDefaultBackPressRunnable;

    /* loaded from: classes.dex */
    public interface RCTDeviceEventEmitter extends JavaScriptModule {
        void emit(String str, Object obj);
    }

    public DeviceEventManagerModule(ReactApplicationContext reactApplicationContext, InterfaceC1164c interfaceC1164c) {
        super(reactApplicationContext);
        this.mInvokeDefaultBackPressRunnable = new RunnableC1165d(this, interfaceC1164c);
    }

    public void emitHardwareBackPressed() {
        ((RCTDeviceEventEmitter) getReactApplicationContext().getJSModule(RCTDeviceEventEmitter.class)).emit("hardwareBackPress", null);
    }

    public void emitNewIntentReceived(Uri uri) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("url", uri.toString());
        ((RCTDeviceEventEmitter) getReactApplicationContext().getJSModule(RCTDeviceEventEmitter.class)).emit("url", createMap);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void invokeDefaultBackPressHandler() {
        getReactApplicationContext().runOnUiQueueThread(this.mInvokeDefaultBackPressRunnable);
    }
}
