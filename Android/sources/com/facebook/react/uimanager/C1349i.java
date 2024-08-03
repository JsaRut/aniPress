package com.facebook.react.uimanager;

/* renamed from: com.facebook.react.uimanager.i */
/* loaded from: classes.dex */
public class C1349i {
    /* renamed from: a */
    public static boolean m5842a(float f, float f2) {
        return (Float.isNaN(f) || Float.isNaN(f2)) ? Float.isNaN(f) && Float.isNaN(f2) : Math.abs(f2 - f) < 1.0E-5f;
    }
}
