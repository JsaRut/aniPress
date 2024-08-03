package android.support.v4.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: android.support.v4.app.w */
/* loaded from: classes.dex */
public class C0216w extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ ViewGroup f878a;

    /* renamed from: b */
    final /* synthetic */ View f879b;

    /* renamed from: c */
    final /* synthetic */ ComponentCallbacksC0205l f880c;

    /* renamed from: d */
    final /* synthetic */ LayoutInflaterFactory2C0219z f881d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0216w(LayoutInflaterFactory2C0219z layoutInflaterFactory2C0219z, ViewGroup viewGroup, View view, ComponentCallbacksC0205l componentCallbacksC0205l) {
        this.f881d = layoutInflaterFactory2C0219z;
        this.f878a = viewGroup;
        this.f879b = view;
        this.f880c = componentCallbacksC0205l;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f878a.endViewTransition(this.f879b);
        Animator m981h = this.f880c.m981h();
        this.f880c.m939a((Animator) null);
        if (m981h == null || this.f878a.indexOfChild(this.f879b) >= 0) {
            return;
        }
        LayoutInflaterFactory2C0219z layoutInflaterFactory2C0219z = this.f881d;
        ComponentCallbacksC0205l componentCallbacksC0205l = this.f880c;
        layoutInflaterFactory2C0219z.m1117a(componentCallbacksC0205l, componentCallbacksC0205l.m1005y(), 0, 0, false);
    }
}
