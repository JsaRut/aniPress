package com.facebook.react.modules.statusbar;

import android.animation.ValueAnimator;

/* renamed from: com.facebook.react.modules.statusbar.a */
/* loaded from: classes.dex */
class C1237a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ C1238b f4666a;

    public C1237a(C1238b c1238b) {
        this.f4666a = c1238b;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f4666a.f4667a.getWindow().setStatusBarColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
