package android.support.v4.widget;

import android.support.v4.widget.C0273C;
import android.view.animation.Animation;

/* renamed from: android.support.v4.widget.u */
/* loaded from: classes.dex */
public class AnimationAnimationListenerC0303u implements Animation.AnimationListener {

    /* renamed from: a */
    final /* synthetic */ C0273C f1372a;

    public AnimationAnimationListenerC0303u(C0273C c0273c) {
        this.f1372a = c0273c;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(Animation animation) {
        C0273C.b bVar;
        C0273C c0273c = this.f1372a;
        if (!c0273c.f1142e) {
            c0273c.m1428b();
            return;
        }
        c0273c.f1127D.setAlpha(255);
        this.f1372a.f1127D.start();
        C0273C c0273c2 = this.f1372a;
        if (c0273c2.f1133J && (bVar = c0273c2.f1141d) != null) {
            bVar.mo1430a();
        }
        C0273C c0273c3 = this.f1372a;
        c0273c3.f1152o = c0273c3.f1160w.getTop();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(Animation animation) {
    }
}
