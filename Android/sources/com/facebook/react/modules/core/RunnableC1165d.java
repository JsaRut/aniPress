package com.facebook.react.modules.core;

import com.facebook.react.bridge.UiThreadUtil;

/* renamed from: com.facebook.react.modules.core.d */
/* loaded from: classes.dex */
public class RunnableC1165d implements Runnable {

    /* renamed from: a */
    final /* synthetic */ InterfaceC1164c f4495a;

    /* renamed from: b */
    final /* synthetic */ DeviceEventManagerModule f4496b;

    public RunnableC1165d(DeviceEventManagerModule deviceEventManagerModule, InterfaceC1164c interfaceC1164c) {
        this.f4496b = deviceEventManagerModule;
        this.f4495a = interfaceC1164c;
    }

    @Override // java.lang.Runnable
    public void run() {
        UiThreadUtil.assertOnUiThread();
        this.f4495a.mo5285b();
    }
}
