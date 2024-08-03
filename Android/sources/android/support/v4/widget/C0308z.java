package android.support.v4.widget;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: android.support.v4.widget.z */
/* loaded from: classes.dex */
public class C0308z extends Animation {

    /* renamed from: a */
    final /* synthetic */ C0273C f1379a;

    public C0308z(C0273C c0273c) {
        this.f1379a = c0273c;
    }

    @Override // android.view.animation.Animation
    public void applyTransformation(float f, Transformation transformation) {
        C0273C c0273c = this.f1379a;
        int abs = !c0273c.f1135L ? c0273c.f1125B - Math.abs(c0273c.f1124A) : c0273c.f1125B;
        C0273C c0273c2 = this.f1379a;
        this.f1379a.setTargetOffsetTopAndBottom((c0273c2.f1162y + ((int) ((abs - r1) * f))) - c0273c2.f1160w.getTop());
        this.f1379a.f1127D.m1580a(1.0f - f);
    }
}
