package p031c.p032a.p047O;

import android.text.TextUtils;
import p031c.p032a.p050Q.C0558a;
import p031c.p032a.p091r.C0819h;

/* renamed from: c.a.O.c */
/* loaded from: classes.dex */
public final class C0553c {

    /* renamed from: a */
    private static long f2699a = 1;

    /* renamed from: a */
    public static long m2881a() {
        long j = f2699a + 1;
        f2699a = j;
        if (j >= 2147483647L) {
            f2699a = 1L;
        }
        return f2699a;
    }

    /* renamed from: a */
    public static byte[] m2882a(long j, String str) {
        C0558a c0558a = new C0558a(20480);
        c0558a.m2926a(0);
        c0558a.m2927a(j);
        if (str != null && !TextUtils.isEmpty(str)) {
            byte[] m4000j = C0819h.m4000j(str);
            c0558a.m2926a(m4000j.length);
            c0558a.m2928a(m4000j, 0, m4000j.length);
        }
        return c0558a.m2929a();
    }
}
