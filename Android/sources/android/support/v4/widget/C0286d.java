package android.support.v4.widget;

import android.animation.ValueAnimator;
import android.support.v4.widget.C0288f;

/* renamed from: android.support.v4.widget.d */
/* loaded from: classes.dex */
public class C0286d implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ C0288f.a f1259a;

    /* renamed from: b */
    final /* synthetic */ C0288f f1260b;

    public C0286d(C0288f c0288f, C0288f.a aVar) {
        this.f1260b = c0288f;
        this.f1259a = aVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f1260b.m1582a(floatValue, this.f1259a);
        this.f1260b.m1583a(floatValue, this.f1259a, false);
        this.f1260b.invalidateSelf();
    }
}
