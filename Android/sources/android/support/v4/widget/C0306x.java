package android.support.v4.widget;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: android.support.v4.widget.x */
/* loaded from: classes.dex */
public class C0306x extends Animation {

    /* renamed from: a */
    final /* synthetic */ int f1375a;

    /* renamed from: b */
    final /* synthetic */ int f1376b;

    /* renamed from: c */
    final /* synthetic */ C0273C f1377c;

    public C0306x(C0273C c0273c, int i, int i2) {
        this.f1377c = c0273c;
        this.f1375a = i;
        this.f1376b = i2;
    }

    @Override // android.view.animation.Animation
    public void applyTransformation(float f, Transformation transformation) {
        this.f1377c.f1127D.setAlpha((int) (this.f1375a + ((this.f1376b - r0) * f)));
    }
}
