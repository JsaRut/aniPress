package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;
import p139d.p143b.p148c.p152d.C1691j;
import p139d.p143b.p148c.p152d.InterfaceC1685d;

@InterfaceC1685d
/* loaded from: classes.dex */
public class NativeBlurFilter {
    static {
        C1012a.m5085a();
    }

    /* renamed from: a */
    public static void m5084a(Bitmap bitmap, int i, int i2) {
        C1691j.m6971a(bitmap);
        C1691j.m6974a(i > 0);
        C1691j.m6974a(i2 > 0);
        nativeIterativeBoxBlur(bitmap, i, i2);
    }

    @InterfaceC1685d
    private static native void nativeIterativeBoxBlur(Bitmap bitmap, int i, int i2);
}
