package android.support.v4.widget;

import android.animation.Animator;
import android.support.v4.widget.C0288f;

/* renamed from: android.support.v4.widget.e */
/* loaded from: classes.dex */
public class C0287e implements Animator.AnimatorListener {

    /* renamed from: a */
    final /* synthetic */ C0288f.a f1261a;

    /* renamed from: b */
    final /* synthetic */ C0288f f1262b;

    public C0287e(C0288f c0288f, C0288f.a aVar) {
        this.f1262b = c0288f;
        this.f1261a = aVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        this.f1262b.m1583a(1.0f, this.f1261a, true);
        this.f1261a.m1615l();
        this.f1261a.m1613j();
        C0288f c0288f = this.f1262b;
        if (!c0288f.f1271i) {
            c0288f.f1270h += 1.0f;
            return;
        }
        c0288f.f1271i = false;
        animator.cancel();
        animator.setDuration(1332L);
        animator.start();
        this.f1261a.m1596a(false);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.f1262b.f1270h = 0.0f;
    }
}
