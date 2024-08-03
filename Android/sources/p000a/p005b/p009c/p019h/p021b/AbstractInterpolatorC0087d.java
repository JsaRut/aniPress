package p000a.p005b.p009c.p019h.p021b;

import android.view.animation.Interpolator;

/* renamed from: a.b.c.h.b.d */
/* loaded from: classes.dex */
abstract class AbstractInterpolatorC0087d implements Interpolator {

    /* renamed from: a */
    private final float[] f374a;

    /* renamed from: b */
    private final float f375b;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractInterpolatorC0087d(float[] fArr) {
        this.f374a = fArr;
        this.f375b = 1.0f / (this.f374a.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f374a;
        int min = Math.min((int) ((fArr.length - 1) * f), fArr.length - 2);
        float f2 = this.f375b;
        float f3 = (f - (min * f2)) / f2;
        float[] fArr2 = this.f374a;
        return fArr2[min] + (f3 * (fArr2[min + 1] - fArr2[min]));
    }
}
