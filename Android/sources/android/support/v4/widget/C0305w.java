package android.support.v4.widget;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: android.support.v4.widget.w */
/* loaded from: classes.dex */
public class C0305w extends Animation {

    /* renamed from: a */
    final /* synthetic */ C0273C f1374a;

    public C0305w(C0273C c0273c) {
        this.f1374a = c0273c;
    }

    @Override // android.view.animation.Animation
    public void applyTransformation(float f, Transformation transformation) {
        this.f1374a.setAnimationProgress(1.0f - f);
    }
}
