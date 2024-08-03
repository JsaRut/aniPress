package p000a.p005b.p009c.p019h;

import android.view.animation.Interpolator;

/* renamed from: a.b.c.h.z */
/* loaded from: classes.dex */
class InterpolatorC0111z implements Interpolator {
    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        float f2 = f - 1.0f;
        return (f2 * f2 * f2 * f2 * f2) + 1.0f;
    }
}
