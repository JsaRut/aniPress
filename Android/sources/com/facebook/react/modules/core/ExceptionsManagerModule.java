package com.facebook.react.modules.core;

import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.common.C1101c;
import com.facebook.react.devsupport.p124a.InterfaceC1114b;
import p139d.p143b.p148c.p153e.C1700a;
import p139d.p143b.p208m.p212d.p213a.InterfaceC2073a;
import p139d.p143b.p208m.p221i.C2113a;

@InterfaceC2073a(name = ExceptionsManagerModule.NAME)
/* loaded from: classes.dex */
public class ExceptionsManagerModule extends BaseJavaModule {
    public static final String NAME = "ExceptionsManager";
    private final InterfaceC1114b mDevSupportManager;

    public ExceptionsManagerModule(InterfaceC1114b interfaceC1114b) {
        this.mDevSupportManager = interfaceC1114b;
    }

    private void showOrThrowError(String str, ReadableArray readableArray, int i) {
        if (!this.mDevSupportManager.mo5206b()) {
            throw new C1101c(C2113a.m8453a(str, readableArray));
        }
        this.mDevSupportManager.mo5202a(str, readableArray, i);
    }

    @ReactMethod
    public void dismissRedbox() {
        if (this.mDevSupportManager.mo5206b()) {
            this.mDevSupportManager.mo5207c();
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void reportFatalException(String str, ReadableArray readableArray, int i) {
        showOrThrowError(str, readableArray, i);
    }

    @ReactMethod
    public void reportSoftException(String str, ReadableArray readableArray, int i) {
        if (this.mDevSupportManager.mo5206b()) {
            this.mDevSupportManager.mo5202a(str, readableArray, i);
        } else {
            C1700a.m7006b("ReactNative", C2113a.m8453a(str, readableArray));
        }
    }

    @ReactMethod
    public void updateExceptionMessage(String str, ReadableArray readableArray, int i) {
        if (this.mDevSupportManager.mo5206b()) {
            this.mDevSupportManager.mo5205b(str, readableArray, i);
        }
    }
}
