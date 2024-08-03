package com.facebook.react.uimanager;

import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.ReactContext;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.facebook.react.uimanager.ga */
/* loaded from: classes.dex */
public class C1346ga extends GuardedRunnable {

    /* renamed from: a */
    final /* synthetic */ C1348ha f4918a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1346ga(C1348ha c1348ha, ReactContext reactContext) {
        super(reactContext);
        this.f4918a = c1348ha;
    }

    @Override // com.facebook.react.bridge.GuardedRunnable
    public void runGuarded() {
        this.f4918a.m5803i();
    }
}
