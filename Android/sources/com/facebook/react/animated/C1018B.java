package com.facebook.react.animated;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;

/* renamed from: com.facebook.react.animated.B */
/* loaded from: classes.dex */
class C1018B implements InterfaceC1037c {

    /* renamed from: a */
    final /* synthetic */ int f4211a;

    /* renamed from: b */
    final /* synthetic */ NativeAnimatedModule f4212b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1018B(NativeAnimatedModule nativeAnimatedModule, int i) {
        this.f4212b = nativeAnimatedModule;
        this.f4211a = i;
    }

    @Override // com.facebook.react.animated.InterfaceC1037c
    /* renamed from: a */
    public void mo5105a(double d2) {
        ReactApplicationContext reactApplicationContext;
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("tag", this.f4211a);
        createMap.putDouble("value", d2);
        reactApplicationContext = this.f4212b.getReactApplicationContext();
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactApplicationContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("onAnimatedValueUpdate", createMap);
    }
}
