package com.facebook.yoga;

/* renamed from: com.facebook.yoga.b */
/* loaded from: classes.dex */
public class C1554b {
    /* renamed from: a */
    public static long m6545a(float f, float f2) {
        return Float.floatToRawIntBits(f2) | (Float.floatToRawIntBits(f) << 32);
    }

    /* renamed from: a */
    public static long m6546a(int i, int i2) {
        return m6545a(i, i2);
    }
}
