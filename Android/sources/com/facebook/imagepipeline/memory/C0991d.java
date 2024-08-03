package com.facebook.imagepipeline.memory;

/* renamed from: com.facebook.imagepipeline.memory.d */
/* loaded from: classes.dex */
public class C0991d {

    /* renamed from: a */
    private static final Class<?> f4140a = C0991d.class;

    /* renamed from: b */
    public static final int f4141b = m5009b();

    /* renamed from: c */
    private static int f4142c = 384;

    /* renamed from: d */
    private static volatile C0990c f4143d;

    /* renamed from: a */
    public static C0990c m5008a() {
        if (f4143d == null) {
            synchronized (C0991d.class) {
                if (f4143d == null) {
                    f4143d = new C0990c(f4142c, f4141b);
                }
            }
        }
        return f4143d;
    }

    /* renamed from: b */
    private static int m5009b() {
        int min = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        return ((long) min) > 16777216 ? (min / 4) * 3 : min / 2;
    }
}
