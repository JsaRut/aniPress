package p000a.p005b.p009c.p019h;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: a.b.c.h.F */
/* loaded from: classes.dex */
public class C0072F extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ InterfaceC0075I f320a;

    /* renamed from: b */
    final /* synthetic */ View f321b;

    /* renamed from: c */
    final /* synthetic */ C0074H f322c;

    public C0072F(C0074H c0074h, InterfaceC0075I interfaceC0075I, View view) {
        this.f322c = c0074h;
        this.f320a = interfaceC0075I;
        this.f321b = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        this.f320a.mo348a(this.f321b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f320a.mo349b(this.f321b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.f320a.mo350c(this.f321b);
    }
}
