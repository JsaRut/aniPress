package com.facebook.react.uimanager;

import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.ReactContext;

/* renamed from: com.facebook.react.uimanager.Y */
/* loaded from: classes.dex */
class C1291Y extends GuardedRunnable {

    /* renamed from: a */
    final /* synthetic */ int f4785a;

    /* renamed from: b */
    final /* synthetic */ int f4786b;

    /* renamed from: c */
    final /* synthetic */ C1292Z f4787c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1291Y(C1292Z c1292z, ReactContext reactContext, int i, int i2) {
        super(reactContext);
        this.f4787c = c1292z;
        this.f4785a = i;
        this.f4786b = i2;
    }

    @Override // com.facebook.react.bridge.GuardedRunnable
    public void runGuarded() {
        C1292Z c1292z = this.f4787c;
        c1292z.f4790c.updateNodeSize(c1292z.f4789b, this.f4785a, this.f4786b);
    }
}
