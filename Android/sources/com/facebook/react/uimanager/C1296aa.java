package com.facebook.react.uimanager;

import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.ReactContext;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.facebook.react.uimanager.aa */
/* loaded from: classes.dex */
public class C1296aa extends GuardedRunnable {

    /* renamed from: a */
    final /* synthetic */ int f4794a;

    /* renamed from: b */
    final /* synthetic */ Object f4795b;

    /* renamed from: c */
    final /* synthetic */ UIManagerModule f4796c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1296aa(UIManagerModule uIManagerModule, ReactContext reactContext, int i, Object obj) {
        super(reactContext);
        this.f4796c = uIManagerModule;
        this.f4794a = i;
        this.f4795b = obj;
    }

    @Override // com.facebook.react.bridge.GuardedRunnable
    public void runGuarded() {
        C1284U c1284u;
        c1284u = this.f4796c.mUIImplementation;
        c1284u.m5630a(this.f4794a, this.f4795b);
    }
}
