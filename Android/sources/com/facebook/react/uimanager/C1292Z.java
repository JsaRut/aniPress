package com.facebook.react.uimanager;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.common.SizeMonitoringFrameLayout;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.facebook.react.uimanager.Z */
/* loaded from: classes.dex */
public class C1292Z implements SizeMonitoringFrameLayout.InterfaceC1320a {

    /* renamed from: a */
    final /* synthetic */ ReactApplicationContext f4788a;

    /* renamed from: b */
    final /* synthetic */ int f4789b;

    /* renamed from: c */
    final /* synthetic */ UIManagerModule f4790c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1292Z(UIManagerModule uIManagerModule, ReactApplicationContext reactApplicationContext, int i) {
        this.f4790c = uIManagerModule;
        this.f4788a = reactApplicationContext;
        this.f4789b = i;
    }

    @Override // com.facebook.react.uimanager.common.SizeMonitoringFrameLayout.InterfaceC1320a
    /* renamed from: a */
    public void mo5673a(int i, int i2, int i3, int i4) {
        ReactApplicationContext reactApplicationContext = this.f4788a;
        reactApplicationContext.runOnNativeModulesQueueThread(new C1291Y(this, reactApplicationContext, i, i2));
    }
}
