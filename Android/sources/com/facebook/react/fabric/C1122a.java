package com.facebook.react.fabric;

import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.fabric.jsi.Binding;
import com.facebook.react.fabric.p125a.C1123a;

/* renamed from: com.facebook.react.fabric.a */
/* loaded from: classes.dex */
class C1122a extends GuardedRunnable {

    /* renamed from: a */
    final /* synthetic */ int f4382a;

    /* renamed from: b */
    final /* synthetic */ int f4383b;

    /* renamed from: c */
    final /* synthetic */ int f4384c;

    /* renamed from: d */
    final /* synthetic */ C1125b f4385d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1122a(C1125b c1125b, ReactContext reactContext, int i, int i2, int i3) {
        super(reactContext);
        this.f4385d = c1125b;
        this.f4382a = i;
        this.f4383b = i2;
        this.f4384c = i3;
    }

    @Override // com.facebook.react.bridge.GuardedRunnable
    public void runGuarded() {
        Binding binding;
        binding = this.f4385d.f4387b;
        binding.setConstraints(this.f4382a, C1123a.m5220b(this.f4383b), C1123a.m5217a(this.f4383b), C1123a.m5220b(this.f4384c), C1123a.m5217a(this.f4384c));
    }
}
