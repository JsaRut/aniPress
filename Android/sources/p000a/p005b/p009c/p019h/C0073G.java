package p000a.p005b.p009c.p019h;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: a.b.c.h.G */
/* loaded from: classes.dex */
public class C0073G implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ InterfaceC0077K f323a;

    /* renamed from: b */
    final /* synthetic */ View f324b;

    /* renamed from: c */
    final /* synthetic */ C0074H f325c;

    public C0073G(C0074H c0074h, InterfaceC0077K interfaceC0077K, View view) {
        this.f325c = c0074h;
        this.f323a = interfaceC0077K;
        this.f324b = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f323a.mo351a(this.f324b);
    }
}
