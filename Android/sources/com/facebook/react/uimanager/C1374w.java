package com.facebook.react.uimanager;

import android.util.DisplayMetrics;
import android.util.TypedValue;

/* renamed from: com.facebook.react.uimanager.w */
/* loaded from: classes.dex */
public class C1374w {
    /* renamed from: a */
    public static float m5956a(double d2) {
        return m5959b((float) d2);
    }

    /* renamed from: a */
    public static float m5957a(float f) {
        return f / C1347h.m5783b().density;
    }

    /* renamed from: a */
    public static float m5958a(float f, float f2) {
        DisplayMetrics m5783b = C1347h.m5783b();
        float f3 = m5783b.scaledDensity;
        float f4 = m5783b.density;
        float f5 = f3 / f4;
        if (f2 >= 1.0f && f2 < f5) {
            f3 = f4 * f2;
        }
        return f * f3;
    }

    /* renamed from: b */
    public static float m5959b(float f) {
        return TypedValue.applyDimension(1, f, C1347h.m5783b());
    }

    /* renamed from: c */
    public static float m5960c(float f) {
        return m5958a(f, Float.NaN);
    }

    /* renamed from: d */
    public static float m5961d(float f) {
        return f / C1347h.m5778a().scaledDensity;
    }
}
