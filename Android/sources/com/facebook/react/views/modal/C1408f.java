package com.facebook.react.views.modal;

import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.views.modal.C1409g;

/* renamed from: com.facebook.react.views.modal.f */
/* loaded from: classes.dex */
class C1408f extends GuardedRunnable {

    /* renamed from: a */
    final /* synthetic */ int f5174a;

    /* renamed from: b */
    final /* synthetic */ int f5175b;

    /* renamed from: c */
    final /* synthetic */ int f5176c;

    /* renamed from: d */
    final /* synthetic */ C1409g.a f5177d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1408f(C1409g.a aVar, ReactContext reactContext, int i, int i2, int i3) {
        super(reactContext);
        this.f5177d = aVar;
        this.f5174a = i;
        this.f5175b = i2;
        this.f5176c = i3;
    }

    @Override // com.facebook.react.bridge.GuardedRunnable
    public void runGuarded() {
        ReactContext m6035f;
        m6035f = this.f5177d.m6035f();
        ((UIManagerModule) m6035f.getNativeModule(UIManagerModule.class)).updateNodeSize(this.f5174a, this.f5175b, this.f5176c);
    }
}
