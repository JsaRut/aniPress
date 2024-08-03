package com.facebook.imagepipeline.nativecode;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import java.nio.ByteBuffer;
import p139d.p143b.p148c.p152d.C1691j;
import p139d.p143b.p148c.p152d.InterfaceC1685d;
import p139d.p143b.p203j.C2032b;

@InterfaceC1685d
/* loaded from: classes.dex */
public class Bitmaps {
    static {
        C1012a.m5085a();
    }

    /* renamed from: a */
    public static void m5077a(Bitmap bitmap) {
        C1691j.m6971a(bitmap);
        nativePinBitmap(bitmap);
    }

    @TargetApi(19)
    /* renamed from: a */
    public static void m5078a(Bitmap bitmap, int i, int i2, Bitmap.Config config) {
        C1691j.m6974a(bitmap.getAllocationByteCount() >= (i * i2) * C2032b.m8293a(config));
        bitmap.reconfigure(i, i2, config);
    }

    /* renamed from: a */
    public static void m5079a(Bitmap bitmap, Bitmap bitmap2) {
        C1691j.m6974a(bitmap2.getConfig() == bitmap.getConfig());
        C1691j.m6974a(bitmap.isMutable());
        C1691j.m6974a(bitmap.getWidth() == bitmap2.getWidth());
        C1691j.m6974a(bitmap.getHeight() == bitmap2.getHeight());
        nativeCopyBitmap(bitmap, bitmap.getRowBytes(), bitmap2, bitmap2.getRowBytes(), bitmap.getHeight());
    }

    @InterfaceC1685d
    private static native void nativeCopyBitmap(Bitmap bitmap, int i, Bitmap bitmap2, int i2, int i3);

    @InterfaceC1685d
    private static native ByteBuffer nativeGetByteBuffer(Bitmap bitmap, long j, long j2);

    @InterfaceC1685d
    private static native void nativePinBitmap(Bitmap bitmap);

    @InterfaceC1685d
    private static native void nativeReleaseByteBuffer(Bitmap bitmap);
}
