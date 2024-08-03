package com.facebook.react.modules.statusbar;

import android.annotation.TargetApi;
import android.app.Activity;
import android.view.View;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.ReactContext;
import p000a.p005b.p009c.p019h.C0107v;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.facebook.react.modules.statusbar.d */
/* loaded from: classes.dex */
public class C1240d extends GuardedRunnable {

    /* renamed from: a */
    final /* synthetic */ Activity f4672a;

    /* renamed from: b */
    final /* synthetic */ boolean f4673b;

    /* renamed from: c */
    final /* synthetic */ StatusBarModule f4674c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1240d(StatusBarModule statusBarModule, ReactContext reactContext, Activity activity, boolean z) {
        super(reactContext);
        this.f4674c = statusBarModule;
        this.f4672a = activity;
        this.f4673b = z;
    }

    @Override // com.facebook.react.bridge.GuardedRunnable
    @TargetApi(21)
    public void runGuarded() {
        View decorView = this.f4672a.getWindow().getDecorView();
        decorView.setOnApplyWindowInsetsListener(this.f4673b ? new ViewOnApplyWindowInsetsListenerC1239c(this) : null);
        C0107v.m533u(decorView);
    }
}
