package com.facebook.react.uimanager.p129c;

import android.view.animation.Animation;

/* renamed from: com.facebook.react.uimanager.c.g */
/* loaded from: classes.dex */
public class AnimationAnimationListenerC1307g implements Animation.AnimationListener {

    /* renamed from: a */
    final /* synthetic */ InterfaceC1309i f4833a;

    /* renamed from: b */
    final /* synthetic */ C1308h f4834b;

    public AnimationAnimationListenerC1307g(C1308h c1308h, InterfaceC1309i interfaceC1309i) {
        this.f4834b = c1308h;
        this.f4833a = interfaceC1309i;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(Animation animation) {
        this.f4833a.mo5694a();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(Animation animation) {
    }
}
