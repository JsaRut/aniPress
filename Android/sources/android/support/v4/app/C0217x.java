package android.support.v4.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: android.support.v4.app.x */
/* loaded from: classes.dex */
public class C0217x extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ ViewGroup f882a;

    /* renamed from: b */
    final /* synthetic */ View f883b;

    /* renamed from: c */
    final /* synthetic */ ComponentCallbacksC0205l f884c;

    /* renamed from: d */
    final /* synthetic */ LayoutInflaterFactory2C0219z f885d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0217x(LayoutInflaterFactory2C0219z layoutInflaterFactory2C0219z, ViewGroup viewGroup, View view, ComponentCallbacksC0205l componentCallbacksC0205l) {
        this.f885d = layoutInflaterFactory2C0219z;
        this.f882a = viewGroup;
        this.f883b = view;
        this.f884c = componentCallbacksC0205l;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f882a.endViewTransition(this.f883b);
        animator.removeListener(this);
        View view = this.f884c.f793K;
        if (view != null) {
            view.setVisibility(8);
        }
    }
}
