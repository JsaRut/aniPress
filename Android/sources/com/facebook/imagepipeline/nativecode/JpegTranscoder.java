package com.facebook.imagepipeline.nativecode;

import java.io.InputStream;
import java.io.OutputStream;
import p139d.p143b.p148c.p152d.C1691j;
import p139d.p143b.p148c.p152d.InterfaceC1685d;

@InterfaceC1685d
/* loaded from: classes.dex */
public class JpegTranscoder {
    static {
        C1012a.m5085a();
    }

    /* renamed from: a */
    public static void m5080a(InputStream inputStream, OutputStream outputStream, int i, int i2, int i3) {
        C1691j.m6974a(i2 >= 1);
        C1691j.m6974a(i2 <= 16);
        C1691j.m6974a(i3 >= 0);
        C1691j.m6974a(i3 <= 100);
        C1691j.m6974a(m5083b(i));
        C1691j.m6975a((i2 == 8 && i == 0) ? false : true, "no transformation requested");
        C1691j.m6971a(inputStream);
        C1691j.m6971a(outputStream);
        nativeTranscodeJpeg(inputStream, outputStream, i, i2, i3);
    }

    /* renamed from: a */
    public static boolean m5081a(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: b */
    public static void m5082b(InputStream inputStream, OutputStream outputStream, int i, int i2, int i3) {
        C1691j.m6974a(i2 >= 1);
        C1691j.m6974a(i2 <= 16);
        C1691j.m6974a(i3 >= 0);
        C1691j.m6974a(i3 <= 100);
        C1691j.m6974a(m5081a(i));
        C1691j.m6975a((i2 == 8 && i == 1) ? false : true, "no transformation requested");
        C1691j.m6971a(inputStream);
        C1691j.m6971a(outputStream);
        nativeTranscodeJpegWithExifOrientation(inputStream, outputStream, i, i2, i3);
    }

    /* renamed from: b */
    public static boolean m5083b(int i) {
        return i >= 0 && i <= 270 && i % 90 == 0;
    }

    @InterfaceC1685d
    private static native void nativeTranscodeJpeg(InputStream inputStream, OutputStream outputStream, int i, int i2, int i3);

    @InterfaceC1685d
    private static native void nativeTranscodeJpegWithExifOrientation(InputStream inputStream, OutputStream outputStream, int i, int i2, int i3);
}
