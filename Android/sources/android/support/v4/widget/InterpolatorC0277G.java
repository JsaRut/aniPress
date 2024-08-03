package android.support.v4.widget;

import android.view.animation.Interpolator;

/* renamed from: android.support.v4.widget.G */
/* loaded from: classes.dex */
class InterpolatorC0277G implements Interpolator {
    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        float f2 = f - 1.0f;
        return (f2 * f2 * f2 * f2 * f2) + 1.0f;
    }
}
