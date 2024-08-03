package android.support.v4.widget;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: android.support.v4.widget.v */
/* loaded from: classes.dex */
public class C0304v extends Animation {

    /* renamed from: a */
    final /* synthetic */ C0273C f1373a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0304v(C0273C c0273c) {
        this.f1373a = c0273c;
    }

    @Override // android.view.animation.Animation
    public void applyTransformation(float f, Transformation transformation) {
        this.f1373a.setAnimationProgress(f);
    }
}
