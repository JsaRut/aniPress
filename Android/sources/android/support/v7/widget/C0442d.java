package android.support.v7.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: android.support.v7.widget.d */
/* loaded from: classes.dex */
public class C0442d extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ ActionBarOverlayLayout f2337a;

    public C0442d(ActionBarOverlayLayout actionBarOverlayLayout) {
        this.f2337a = actionBarOverlayLayout;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        ActionBarOverlayLayout actionBarOverlayLayout = this.f2337a;
        actionBarOverlayLayout.f1951x = null;
        actionBarOverlayLayout.f1939l = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        ActionBarOverlayLayout actionBarOverlayLayout = this.f2337a;
        actionBarOverlayLayout.f1951x = null;
        actionBarOverlayLayout.f1939l = false;
    }
}
