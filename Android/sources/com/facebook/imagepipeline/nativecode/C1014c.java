package com.facebook.imagepipeline.nativecode;

/* renamed from: com.facebook.imagepipeline.nativecode.c */
/* loaded from: classes.dex */
public class C1014c {

    /* renamed from: a */
    private static InterfaceC1013b f4196a = null;

    /* renamed from: b */
    public static boolean f4197b = false;

    static {
        try {
            f4196a = (InterfaceC1013b) Class.forName("com.facebook.imagepipeline.nativecode.WebpTranscoderImpl").newInstance();
            f4197b = true;
        } catch (Throwable unused) {
            f4197b = false;
        }
    }

    /* renamed from: a */
    public static InterfaceC1013b m5089a() {
        return f4196a;
    }
}
