package p031c.p032a.p072p.p073a.p088g;

import android.content.Context;
import p031c.p032a.p072p.p073a.p080f.p086f.C0757c;

/* renamed from: c.a.p.a.g.c */
/* loaded from: classes.dex */
public final class C0775c {

    /* renamed from: a */
    private static C0757c f3423a;

    /* renamed from: b */
    private static final Object f3424b = new Object();

    /* renamed from: a */
    public static String m3852a(Context context) {
        m3857d(context);
        C0757c c0757c = f3423a;
        return c0757c != null ? (String) c0757c.m3785a("bury_filter", "") : "";
    }

    /* renamed from: a */
    public static void m3853a(Context context, String str, long j) {
        m3857d(context);
        C0757c c0757c = f3423a;
        if (c0757c != null) {
            c0757c.m3787b("bury_filter", str);
            if (j > 0) {
                f3423a.m3787b("filter_last_update", Long.valueOf(j));
            }
        }
    }

    /* renamed from: a */
    public static void m3854a(Context context, boolean z) {
        m3857d(context);
        C0757c c0757c = f3423a;
        if (c0757c != null) {
            c0757c.m3787b("circle_need_show", false);
        }
    }

    /* renamed from: b */
    public static boolean m3855b(Context context) {
        m3857d(context);
        C0757c c0757c = f3423a;
        if (c0757c != null) {
            return ((Boolean) c0757c.m3785a("circle_need_show", (String) true)).booleanValue();
        }
        return true;
    }

    /* renamed from: c */
    public static long m3856c(Context context) {
        m3857d(context);
        C0757c c0757c = f3423a;
        if (c0757c != null) {
            return ((Long) c0757c.m3785a("filter_last_update", (String) 0L)).longValue();
        }
        return 0L;
    }

    /* renamed from: d */
    private static void m3857d(Context context) {
        if (f3423a == null) {
            synchronized (f3424b) {
                if (f3423a == null) {
                    f3423a = C0757c.m3783a(context, "bury");
                }
            }
        }
    }
}
