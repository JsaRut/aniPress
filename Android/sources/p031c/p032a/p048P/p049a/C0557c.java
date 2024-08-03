package p031c.p032a.p048P.p049a;

import android.content.Context;
import android.os.Bundle;
import java.io.File;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;
import p031c.p032a.p065i.C0658a;
import p031c.p032a.p065i.C0666i;
import p031c.p032a.p065i.C0669l;
import p031c.p032a.p066j.C0675a;
import p031c.p032a.p067k.C0678c;
import p031c.p032a.p070n.RunnableC0686a;
import p031c.p032a.p092s.C0831g;
import p031c.p032a.p092s.InterfaceC0836l;

/* renamed from: c.a.P.a.c */
/* loaded from: classes.dex */
public final class C0557c {

    /* renamed from: a */
    public static boolean f2707a = false;

    /* renamed from: a */
    public static long m2886a(Context context, long j) {
        Object m4072a = C0831g.m4072a(context, null, 19, null, null, Long.valueOf(j));
        return m4072a instanceof Long ? ((Long) m4072a).longValue() : j / 1000;
    }

    /* renamed from: a */
    public static Object m2887a() {
        return C0831g.m4072a(null, C0556b.f2704d, 43, null, null, new Object[0]);
    }

    /* renamed from: a */
    public static String m2888a(Context context) {
        Object m4072a = C0831g.m4072a(context, null, 5, null, null, new Object[0]);
        return m4072a instanceof String ? (String) m4072a : "";
    }

    /* renamed from: a */
    public static void m2889a(Context context, int i) {
        C0831g.m4072a(context, C0556b.f2704d, 57, null, null, Integer.valueOf(i));
    }

    /* renamed from: a */
    public static void m2890a(Context context, long j, String str, String str2) {
        C0831g.m4072a(context, C0556b.f2704d, 35, null, null, Long.valueOf(j), str, str2);
    }

    /* renamed from: a */
    public static void m2891a(Context context, Bundle bundle) {
        if (bundle != null) {
            f2707a = bundle.getBoolean("foreground");
            C0675a.m3469c("JCoreManagerInternal", "changeForeGroundStat:" + f2707a);
            if (f2707a) {
                RunnableC0686a.m3523a().m3541b(context);
            }
        }
    }

    /* renamed from: a */
    public static void m2892a(Context context, Object obj) {
        C0831g.m4072a(context, C0556b.f2704d, 39, null, null, obj);
    }

    /* renamed from: a */
    public static void m2893a(Context context, String str) {
        C0831g.m4072a(context, C0556b.f2704d, 36, null, null, str);
    }

    /* renamed from: a */
    public static void m2894a(Context context, String str, int i, int i2, long j, long j2, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putInt("cmd", i);
        bundle.putInt("ver", 0);
        bundle.putLong("rid", j);
        bundle.putLong("timeout", j2);
        bundle.putByteArray("body", bArr);
        C0831g.m4072a(context, str, 17, null, bundle, new Object[0]);
    }

    /* renamed from: a */
    public static void m2895a(Context context, String str, long j) {
        C0831g.m4072a(context, C0556b.f2704d, 44, null, null, str, Long.valueOf(j));
    }

    /* renamed from: a */
    public static void m2896a(Context context, JSONObject jSONObject, byte[] bArr, int i, File file, Set<String> set, InterfaceC0836l interfaceC0836l) {
        C0669l.m3433a();
        C0669l.m3433a().m3446a(context, C0669l.m3434a(context, jSONObject, bArr, i, file, set, interfaceC0836l));
    }

    /* renamed from: a */
    public static void m2897a(Context context, boolean z, long j) {
        C0831g.m4072a(context, C0556b.f2704d, 40, null, null, false, 0L);
    }

    /* renamed from: a */
    public static void m2898a(Bundle bundle) {
        C0675a.m3469c("JCoreManagerInternal", "setSDKConfigs");
        if (bundle == null || bundle.isEmpty()) {
            return;
        }
        int i = 86400;
        try {
            int i2 = bundle.getInt("heartbeat_interval", C0556b.f2702b);
            if (i2 < 30) {
                i2 = 30;
            } else if (i2 > 86400) {
                i2 = 86400;
            }
            C0556b.f2702b = i2;
            C0675a.m3469c("JCoreManagerInternal", "set heartbeat interval=" + i2);
        } catch (Throwable unused) {
        }
        try {
            int i3 = bundle.getInt("alarm_delay", C0556b.f2703c);
            if (i3 <= 86400) {
                i = i3;
            }
            if (i < C0556b.f2702b + 5) {
                i = C0556b.f2702b + 5;
            }
            C0556b.f2703c = i;
            C0675a.m3469c("JCoreManagerInternal", "set alarm delay=" + i);
        } catch (Throwable unused2) {
        }
        try {
            C0678c.m3486a(bundle.getInt("ipv_config", -1));
            byte b2 = (byte) bundle.getInt("tcp_algorithm", -1);
            if (b2 >= 0) {
                C0556b.f2705e = b2;
                C0675a.m3469c("JCoreManagerInternal", "set tcp algorithm=" + ((int) b2));
            }
        } catch (Throwable unused3) {
        }
    }

    /* renamed from: a */
    public static void m2899a(Runnable runnable) {
        C0831g.m4072a(null, null, 12, null, null, runnable);
    }

    /* renamed from: a */
    public static void m2900a(String str) {
        C0831g.m4072a(null, null, 13, str, null, new Object[0]);
    }

    /* renamed from: a */
    public static void m2901a(String str, Runnable runnable) {
        C0831g.m4072a(null, null, 11, str, null, runnable);
    }

    /* renamed from: a */
    public static void m2902a(boolean z) {
        C0831g.m4075a(z);
    }

    /* renamed from: a */
    public static boolean m2903a(Context context, boolean z, String str) {
        Object m4072a = C0831g.m4072a(context, null, 60, null, null, Boolean.valueOf(z), str);
        if (m4072a instanceof Boolean) {
            return ((Boolean) m4072a).booleanValue();
        }
        return false;
    }

    /* renamed from: b */
    public static String m2904b(Context context) {
        Object m4072a = C0831g.m4072a(context, null, 8, null, null, new Object[0]);
        return m4072a instanceof String ? (String) m4072a : "";
    }

    /* renamed from: b */
    public static void m2905b(Context context, int i) {
        C0831g.m4072a(context, C0556b.f2704d, 51, "", null, Integer.valueOf(i));
    }

    /* renamed from: b */
    public static void m2906b(Context context, long j) {
        if (j > 0) {
            C0831g.m4072a(context, C0556b.f2704d, 37, null, null, Long.valueOf(j));
        }
    }

    /* renamed from: b */
    public static void m2907b(Context context, String str, int i, int i2, long j, long j2, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putInt("cmd", 4);
        bundle.putInt("ver", 2);
        bundle.putLong("rid", j);
        bundle.putLong("timeout", 0L);
        bundle.putByteArray("body", bArr);
        bundle.putLong("uid", j2);
        C0831g.m4072a(context, str, 59, null, bundle, new Object[0]);
    }

    /* renamed from: b */
    public static boolean m2908b() {
        return C0666i.m3408a().m3431d();
    }

    /* renamed from: c */
    public static int m2909c(Context context) {
        Object m4072a = C0831g.m4072a(context, null, 33, null, null, new Object[0]);
        if (m4072a instanceof Integer) {
            return ((Integer) m4072a).intValue();
        }
        return 1;
    }

    /* renamed from: d */
    public static String m2910d(Context context) {
        Object m4072a = C0831g.m4072a(context, null, 6, null, null, new Object[0]);
        return m4072a instanceof String ? (String) m4072a : "";
    }

    /* renamed from: e */
    public static long m2911e(Context context) {
        Object m4072a = C0831g.m4072a(context, null, 20, null, null, new Object[0]);
        if (m4072a instanceof Long) {
            return ((Long) m4072a).longValue();
        }
        return 0L;
    }

    /* renamed from: f */
    public static String m2912f(Context context) {
        Object m4072a = C0831g.m4072a(context, null, 34, null, null, new Object[0]);
        return m4072a instanceof String ? (String) m4072a : "";
    }

    /* renamed from: g */
    public static String m2913g(Context context) {
        Object m4072a = C0831g.m4072a(context, null, 4, null, null, new Object[0]);
        return m4072a instanceof String ? (String) m4072a : "";
    }

    /* renamed from: h */
    public static boolean m2914h(Context context) {
        Object m4072a = C0831g.m4072a(context, null, 21, null, null, new Object[0]);
        if (m4072a instanceof Boolean) {
            return ((Boolean) m4072a).booleanValue();
        }
        return false;
    }

    /* renamed from: i */
    public static String m2915i(Context context) {
        Object m4072a = C0831g.m4072a(context, null, 7, null, null, new Object[0]);
        return m4072a instanceof String ? (String) m4072a : "";
    }

    /* renamed from: j */
    public static long m2916j(Context context) {
        Object m4072a = C0831g.m4072a(context, null, 19, null, null, new Object[0]);
        return m4072a instanceof Long ? ((Long) m4072a).longValue() : System.currentTimeMillis() / 1000;
    }

    /* renamed from: k */
    public static void m2917k(Context context) {
        C0831g.m4072a(context, C0556b.f2704d, 38, null, null, new Object[0]);
    }

    /* renamed from: l */
    public static Map m2918l(Context context) {
        Object m4072a = C0831g.m4072a(context, C0556b.f2704d, 45, null, null, new Object[0]);
        if (m4072a instanceof Map) {
            return (Map) m4072a;
        }
        return null;
    }

    /* renamed from: m */
    public static int m2919m(Context context) {
        Object m4072a = C0831g.m4072a(context, C0556b.f2704d, 47, null, null, new Object[0]);
        if (m4072a instanceof Integer) {
            return ((Integer) m4072a).intValue();
        }
        return 0;
    }

    /* renamed from: n */
    public static int m2920n(Context context) {
        Object m4072a = C0831g.m4072a(context, C0556b.f2704d, 46, null, null, new Object[0]);
        if (m4072a instanceof Integer) {
            return ((Integer) m4072a).intValue();
        }
        return -1;
    }

    /* renamed from: o */
    public static void m2921o(Context context) {
        C0831g.m4072a(context, C0556b.f2704d, 48, null, null, new Object[0]);
    }

    /* renamed from: p */
    public static void m2922p(Context context) {
        C0658a.m3369a(context);
    }

    /* renamed from: q */
    public static boolean m2923q(Context context) {
        Object m4072a = C0831g.m4072a(context, "", 53, null, null, new Object[0]);
        if (m4072a instanceof Boolean) {
            return ((Boolean) m4072a).booleanValue();
        }
        return true;
    }

    /* renamed from: r */
    public static boolean m2924r(Context context) {
        Object m4072a = C0831g.m4072a(context, null, 58, null, null, new Object[0]);
        if (m4072a instanceof Boolean) {
            return ((Boolean) m4072a).booleanValue();
        }
        return true;
    }
}
