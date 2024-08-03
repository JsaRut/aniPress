package com.facebook.react.uimanager;

import com.facebook.yoga.C1553a;

/* renamed from: com.facebook.react.uimanager.M */
/* loaded from: classes.dex */
public class C1277M {

    /* renamed from: a */
    private static final int[] f4759a = {1, 2, 4, 8, 16, 32, 64, 128, 256};

    /* renamed from: b */
    private final float[] f4760b;

    /* renamed from: c */
    private int f4761c;

    /* renamed from: d */
    private final float f4762d;

    /* renamed from: e */
    private boolean f4763e;

    public C1277M() {
        this(0.0f);
    }

    public C1277M(float f) {
        this.f4761c = 0;
        this.f4762d = f;
        this.f4760b = m5594a();
    }

    /* renamed from: a */
    private static float[] m5594a() {
        return new float[]{Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN};
    }

    /* renamed from: a */
    public float m5595a(int i) {
        float f = (i == 4 || i == 5) ? Float.NaN : this.f4762d;
        int i2 = this.f4761c;
        if (i2 == 0) {
            return f;
        }
        if ((i2 & f4759a[i]) != 0) {
            return this.f4760b[i];
        }
        if (this.f4763e) {
            char c2 = (i == 1 || i == 3) ? (char) 7 : (char) 6;
            int i3 = this.f4761c;
            int[] iArr = f4759a;
            if ((iArr[c2] & i3) != 0) {
                return this.f4760b[c2];
            }
            if ((i3 & iArr[8]) != 0) {
                return this.f4760b[8];
            }
        }
        return f;
    }

    /* renamed from: a */
    public boolean m5596a(int i, float f) {
        if (C1349i.m5842a(this.f4760b[i], f)) {
            return false;
        }
        this.f4760b[i] = f;
        this.f4761c = C1553a.m6544a(f) ? (f4759a[i] ^ (-1)) & this.f4761c : f4759a[i] | this.f4761c;
        int i2 = this.f4761c;
        int[] iArr = f4759a;
        this.f4763e = ((iArr[8] & i2) == 0 && (iArr[7] & i2) == 0 && (i2 & iArr[6]) == 0) ? false : true;
        return true;
    }

    /* renamed from: b */
    public float m5597b(int i) {
        return this.f4760b[i];
    }
}
