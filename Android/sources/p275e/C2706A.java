package p275e;

/* renamed from: e.A */
/* loaded from: classes.dex */
public final class C2706A {

    /* renamed from: a */
    static C2738z f11375a;

    /* renamed from: b */
    static long f11376b;

    private C2706A() {
    }

    /* renamed from: a */
    public static C2738z m11640a() {
        synchronized (C2706A.class) {
            if (f11375a == null) {
                return new C2738z();
            }
            C2738z c2738z = f11375a;
            f11375a = c2738z.f11442f;
            c2738z.f11442f = null;
            f11376b -= 8192;
            return c2738z;
        }
    }

    /* renamed from: a */
    public static void m11641a(C2738z c2738z) {
        if (c2738z.f11442f != null || c2738z.f11443g != null) {
            throw new IllegalArgumentException();
        }
        if (c2738z.f11440d) {
            return;
        }
        synchronized (C2706A.class) {
            if (f11376b + 8192 > 65536) {
                return;
            }
            f11376b += 8192;
            c2738z.f11442f = f11375a;
            c2738z.f11439c = 0;
            c2738z.f11438b = 0;
            f11375a = c2738z;
        }
    }
}
