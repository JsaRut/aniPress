package com.facebook.react.modules.statusbar;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.app.Activity;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.ReactContext;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.facebook.react.modules.statusbar.b */
/* loaded from: classes.dex */
public class C1238b extends GuardedRunnable {

    /* renamed from: a */
    final /* synthetic */ Activity f4667a;

    /* renamed from: b */
    final /* synthetic */ boolean f4668b;

    /* renamed from: c */
    final /* synthetic */ int f4669c;

    /* renamed from: d */
    final /* synthetic */ StatusBarModule f4670d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1238b(StatusBarModule statusBarModule, ReactContext reactContext, Activity activity, boolean z, int i) {
        super(reactContext);
        this.f4670d = statusBarModule;
        this.f4667a = activity;
        this.f4668b = z;
        this.f4669c = i;
    }

    @Override // com.facebook.react.bridge.GuardedRunnable
    @TargetApi(21)
    public void runGuarded() {
        this.f4667a.getWindow().addFlags(Integer.MIN_VALUE);
        if (!this.f4668b) {
            this.f4667a.getWindow().setStatusBarColor(this.f4669c);
            return;
        }
        ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(this.f4667a.getWindow().getStatusBarColor()), Integer.valueOf(this.f4669c));
        ofObject.addUpdateListener(new C1237a(this));
        ofObject.setDuration(300L).setStartDelay(0L);
        ofObject.start();
    }
}
