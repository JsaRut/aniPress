package p031c.p032a.p066j;

import p031c.p032a.p048P.p049a.C0556b;
import p031c.p032a.p092s.C0831g;

/* renamed from: c.a.j.a */
/* loaded from: classes.dex */
public final class C0675a {

    /* renamed from: a */
    private static final String f3124a = C0556b.f2704d;

    /* renamed from: a */
    private static void m3464a(int i, boolean z, String str, String str2, Throwable th) {
        C0831g.m4072a(null, f3124a, 18, str, null, Integer.valueOf(i), Boolean.valueOf(z), str2, th);
    }

    /* renamed from: a */
    public static void m3465a(String str, String str2) {
        m3464a(2, true, str, str2, null);
    }

    /* renamed from: a */
    public static void m3466a(String str, String str2, Throwable th) {
        m3464a(5, true, str, str2, th);
    }

    /* renamed from: b */
    public static void m3467b(String str, String str2) {
        m3464a(2, false, str, str2, null);
    }

    /* renamed from: b */
    public static void m3468b(String str, String str2, Throwable th) {
        m3464a(6, true, str, str2, th);
    }

    /* renamed from: c */
    public static void m3469c(String str, String str2) {
        m3464a(3, true, str, str2, null);
    }

    /* renamed from: c */
    public static void m3470c(String str, String str2, Throwable th) {
        m3464a(6, false, str, str2, th);
    }

    /* renamed from: d */
    public static void m3471d(String str, String str2) {
        m3464a(3, false, str, str2, null);
    }

    /* renamed from: d */
    public static void m3472d(String str, String str2, Throwable th) {
        m3470c(str, str2, th);
        if (C0831g.m4078b()) {
            throw new RuntimeException(th);
        }
    }

    /* renamed from: e */
    public static void m3473e(String str, String str2) {
        m3464a(4, true, str, str2, null);
    }

    /* renamed from: f */
    public static void m3474f(String str, String str2) {
        m3464a(4, false, str, str2, null);
    }

    /* renamed from: g */
    public static void m3475g(String str, String str2) {
        m3464a(5, true, str, str2, null);
    }

    /* renamed from: h */
    public static void m3476h(String str, String str2) {
        m3464a(5, false, str, str2, null);
    }

    /* renamed from: i */
    public static void m3477i(String str, String str2) {
        m3464a(6, true, str, str2, null);
    }

    /* renamed from: j */
    public static void m3478j(String str, String str2) {
        m3464a(6, false, str, str2, null);
    }
}
