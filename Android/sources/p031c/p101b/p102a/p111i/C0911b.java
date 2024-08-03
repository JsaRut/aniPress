package p031c.p101b.p102a.p111i;

import android.text.TextUtils;
import p031c.p101b.p102a.p114l.C0923b;

/* renamed from: c.b.a.i.b */
/* loaded from: classes.dex */
public class C0911b {
    /* renamed from: a */
    public static byte[] m4536a(int i, byte b2, long j) {
        C0914e c0914e = new C0914e(128);
        c0914e.m4556b(i);
        c0914e.m4551a((int) b2);
        c0914e.m4552a(j);
        return c0914e.m4555a();
    }

    /* renamed from: a */
    public static byte[] m4537a(String str) {
        C0914e c0914e = new C0914e(128);
        c0914e.m4551a(7);
        c0914e.m4551a(1);
        c0914e.m4553a(str != null ? m4540b(str) : new byte[0]);
        return c0914e.m4555a();
    }

    /* renamed from: a */
    public static byte[] m4538a(String str, byte b2) {
        C0914e c0914e = new C0914e(8192);
        c0914e.m4553a(TextUtils.isEmpty(str) ? new byte[0] : m4540b(str));
        c0914e.m4551a((int) b2);
        return c0914e.m4555a();
    }

    /* renamed from: a */
    public static byte[] m4539a(String str, int i, String str2) {
        C0914e c0914e = new C0914e(8192);
        if (i == 10) {
            c0914e.m4553a(m4540b(str));
        }
        c0914e.m4553a(m4540b(str2));
        return c0914e.m4555a();
    }

    /* renamed from: b */
    public static byte[] m4540b(String str) {
        try {
            return str.getBytes("UTF-8");
        } catch (Throwable th) {
            C0923b.m4648d("PushPackage", "stringToUtf8Bytes error:" + th.getMessage());
            return str.getBytes();
        }
    }
}
