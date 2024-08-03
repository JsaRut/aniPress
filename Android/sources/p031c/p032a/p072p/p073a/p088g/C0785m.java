package p031c.p032a.p072p.p073a.p088g;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Map;
import p031c.p032a.p072p.p073a.p080f.p086f.C0757c;

/* renamed from: c.a.p.a.g.m */
/* loaded from: classes.dex */
public final class C0785m {

    /* renamed from: a */
    private static C0757c f3445a;

    /* renamed from: b */
    private static final Object f3446b = new Object();

    /* renamed from: a */
    public static String m3888a(String str) {
        m3892c(null);
        C0757c c0757c = f3445a;
        if (c0757c != null) {
            return (String) c0757c.m3785a(str, (String) null);
        }
        return null;
    }

    /* renamed from: a */
    public static Map<String, ?> m3889a(Context context) {
        m3892c(context);
        C0757c c0757c = f3445a;
        SharedPreferences m3784a = c0757c != null ? c0757c.m3784a() : null;
        if (m3784a != null) {
            return m3784a.getAll();
        }
        return null;
    }

    /* renamed from: a */
    public static void m3890a(String str, String str2) {
        m3892c(null);
        C0757c c0757c = f3445a;
        if (c0757c != null) {
            c0757c.m3787b(str, str2);
        }
    }

    /* renamed from: b */
    public static void m3891b(Context context) {
        m3892c(context);
        C0757c c0757c = f3445a;
        if (c0757c != null) {
            c0757c.m3786b();
        }
    }

    /* renamed from: c */
    private static void m3892c(Context context) {
        if (f3445a == null) {
            synchronized (f3446b) {
                if (f3445a == null) {
                    f3445a = C0757c.m3783a(context, "record");
                }
            }
        }
    }
}
