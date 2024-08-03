package android.support.v4.widget;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: android.support.v4.widget.A */
/* loaded from: classes.dex */
public class C0271A extends Animation {

    /* renamed from: a */
    final /* synthetic */ C0273C f1120a;

    public C0271A(C0273C c0273c) {
        this.f1120a = c0273c;
    }

    @Override // android.view.animation.Animation
    public void applyTransformation(float f, Transformation transformation) {
        this.f1120a.m1424a(f);
    }
}
