package com.facebook.react.uimanager;

import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.ReactContext;

/* renamed from: com.facebook.react.uimanager.ba */
/* loaded from: classes.dex */
class C1299ba extends GuardedRunnable {

    /* renamed from: a */
    final /* synthetic */ int f4798a;

    /* renamed from: b */
    final /* synthetic */ int f4799b;

    /* renamed from: c */
    final /* synthetic */ int f4800c;

    /* renamed from: d */
    final /* synthetic */ UIManagerModule f4801d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1299ba(UIManagerModule uIManagerModule, ReactContext reactContext, int i, int i2, int i3) {
        super(reactContext);
        this.f4801d = uIManagerModule;
        this.f4798a = i;
        this.f4799b = i2;
        this.f4800c = i3;
    }

    @Override // com.facebook.react.bridge.GuardedRunnable
    public void runGuarded() {
        C1284U c1284u;
        C1284U c1284u2;
        c1284u = this.f4801d.mUIImplementation;
        c1284u.m5649b(this.f4798a, this.f4799b, this.f4800c);
        c1284u2 = this.f4801d.mUIImplementation;
        c1284u2.m5617a(-1);
    }
}
