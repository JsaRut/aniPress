package android.support.v4.widget;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: android.support.v4.widget.B */
/* loaded from: classes.dex */
public class C0272B extends Animation {

    /* renamed from: a */
    final /* synthetic */ C0273C f1121a;

    public C0272B(C0273C c0273c) {
        this.f1121a = c0273c;
    }

    @Override // android.view.animation.Animation
    public void applyTransformation(float f, Transformation transformation) {
        C0273C c0273c = this.f1121a;
        float f2 = c0273c.f1163z;
        c0273c.setAnimationProgress(f2 + ((-f2) * f));
        this.f1121a.m1424a(f);
    }
}
