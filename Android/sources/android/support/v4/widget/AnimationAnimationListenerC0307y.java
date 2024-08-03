package android.support.v4.widget;

import android.view.animation.Animation;

/* renamed from: android.support.v4.widget.y */
/* loaded from: classes.dex */
public class AnimationAnimationListenerC0307y implements Animation.AnimationListener {

    /* renamed from: a */
    final /* synthetic */ C0273C f1378a;

    public AnimationAnimationListenerC0307y(C0273C c0273c) {
        this.f1378a = c0273c;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(Animation animation) {
        C0273C c0273c = this.f1378a;
        if (c0273c.f1157t) {
            return;
        }
        c0273c.m1425a((Animation.AnimationListener) null);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(Animation animation) {
    }
}
