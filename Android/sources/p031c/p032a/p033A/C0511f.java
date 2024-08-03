package p031c.p032a.p033A;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashMap;
import p031c.p032a.p066j.C0675a;

@SuppressLint({"CommitPrefEdits"})
/* renamed from: c.a.A.f */
/* loaded from: classes.dex */
public final class C0511f {

    /* renamed from: a */
    private static SharedPreferences f2584a;

    /* renamed from: b */
    private static HashMap<String, Long> f2585b;

    /* renamed from: a */
    public static int m2685a(Context context) {
        return m2708g(context).getInt("rrat", 1);
    }

    /* renamed from: a */
    private static String m2686a(String str, String str2) {
        return str + str2;
    }

    /* renamed from: a */
    public static void m2687a(Context context, int i) {
        m2708g(context).edit().putInt("rrat", i).apply();
    }

    /* renamed from: a */
    public static void m2688a(Context context, String str, long j) {
        if (j < 0) {
            return;
        }
        if (!str.contains("JLocation") || j <= m2707g(context, str)) {
            String m2686a = m2686a(str, "_bi");
            C0675a.m3473e("JCommonConfig", "update " + str + " businessInterval:" + j);
            m2708g(context).edit().putLong(m2686a, j).apply();
        }
    }

    /* renamed from: a */
    public static void m2689a(Context context, String str, String str2) {
        m2708g(context).edit().putString(m2686a("JType", str), str2).apply();
    }

    /* renamed from: a */
    public static void m2690a(Context context, String str, boolean z) {
        m2708g(context).edit().putBoolean(m2686a(str, "_ace"), z).apply();
    }

    /* renamed from: a */
    public static void m2691a(Context context, boolean z) {
        m2708g(context).edit().putBoolean("JArponceEnable", z).apply();
    }

    /* renamed from: a */
    public static boolean m2692a(Context context, String str) {
        long currentTimeMillis = System.currentTimeMillis();
        long m2701d = m2701d(context, str);
        long j = m2708g(context).getLong(m2686a(str, "_bi"), m2694b(str, "_bi"));
        boolean z = currentTimeMillis - m2701d > j;
        C0675a.m3473e("JCommonConfig", "is " + str + " businessTime:" + z + ",curTime:" + currentTimeMillis + ",lastBusinessTime:" + m2701d + ",businessInterval:" + j);
        return z;
    }

    /* renamed from: b */
    public static int m2693b(Context context) {
        return m2708g(context).getInt("rrpt", 1);
    }

    /* renamed from: b */
    private static long m2694b(String str, String str2) {
        try {
            return f2585b.get(m2686a(str, str2)).longValue();
        } catch (NullPointerException unused) {
            return 0L;
        }
    }

    /* renamed from: b */
    public static void m2695b(Context context, int i) {
        m2708g(context).edit().putInt("rrpt", i).apply();
    }

    /* renamed from: b */
    public static void m2696b(Context context, String str, long j) {
        if (j < 0) {
            return;
        }
        String m2686a = m2686a(str, "_ri");
        C0675a.m3473e("JCommonConfig", "update " + str + " reportInterval:" + j);
        m2708g(context).edit().putLong(m2686a, j).apply();
    }

    /* renamed from: b */
    public static void m2697b(Context context, String str, boolean z) {
        m2708g(context).edit().putBoolean(m2686a(str, "_aue"), z).apply();
    }

    /* renamed from: b */
    public static boolean m2698b(Context context, String str) {
        long currentTimeMillis = System.currentTimeMillis();
        long m2705f = m2705f(context, str);
        long m2707g = m2707g(context, str);
        boolean z = currentTimeMillis - m2705f > m2707g;
        C0675a.m3473e("JCommonConfig", "is " + str + " reportTime:" + z + ",curTime:" + currentTimeMillis + ",lastReportTime:" + m2705f + ",reportInterval:" + m2707g);
        return z;
    }

    /* renamed from: c */
    public static void m2699c(Context context, String str) {
        if (str.contains("JApp")) {
            return;
        }
        String m2686a = m2686a(str, "_blt");
        long currentTimeMillis = System.currentTimeMillis();
        C0675a.m3473e("JCommonConfig", "update " + str + " lastBusinessTime");
        m2708g(context).edit().putLong(m2686a, currentTimeMillis).apply();
    }

    /* renamed from: c */
    public static boolean m2700c(Context context) {
        return m2708g(context).getBoolean("JArponceEnable", false);
    }

    /* renamed from: d */
    public static long m2701d(Context context, String str) {
        return m2708g(context).getLong(m2686a(str, "_blt"), 0L);
    }

    /* renamed from: d */
    public static String m2702d(Context context) {
        return m2708g(context).getString(m2686a("JLocation", "info"), "");
    }

    /* renamed from: e */
    public static String m2703e(Context context) {
        return m2708g(context).getString("JNotificationState", "");
    }

    /* renamed from: e */
    public static void m2704e(Context context, String str) {
        C0675a.m3473e("JCommonConfig", "update " + str + " lastReportTime");
        m2708g(context).edit().putLong(m2686a(str, "_rlt"), System.currentTimeMillis()).apply();
    }

    /* renamed from: f */
    public static long m2705f(Context context, String str) {
        return m2708g(context).getLong(m2686a(str, "_rlt"), 0L);
    }

    /* renamed from: f */
    public static String m2706f(Context context) {
        return m2708g(context).getString("JDevicesession", "");
    }

    /* renamed from: g */
    public static long m2707g(Context context, String str) {
        return m2708g(context).getLong(m2686a(str, "_ri"), m2694b(str, "_ri"));
    }

    /* renamed from: g */
    private static SharedPreferences m2708g(Context context) {
        if (f2584a == null) {
            f2584a = context.getSharedPreferences("cn.jiguang.common", 0);
            HashMap<String, Long> hashMap = new HashMap<>();
            f2585b = hashMap;
            hashMap.put(m2686a("JLocation", "_bi"), 900000L);
            f2585b.put(m2686a("JWake", "_bi"), 3600000L);
            f2585b.put(m2686a("JWakeConfigHelper", "_bi"), 3600000L);
            f2585b.put(m2686a("JAppAll", "_ri"), 604800000L);
            f2585b.put(m2686a("JAppMovement", "_ri"), 3600000L);
            f2585b.put(m2686a("JAppRunning", "_ri"), 3600000L);
            f2585b.put(m2686a("JArp", "_ri"), 3600000L);
            f2585b.put(m2686a("JDeviceBattery", "_ri"), 3600000L);
            f2585b.put(m2686a("JDevice", "_ri"), 86400000L);
            f2585b.put(m2686a("JLocation", "_ri"), 3600000L);
            f2585b.put(m2686a("JWake", "_ri"), 3600000L);
        }
        return f2584a;
    }

    /* renamed from: h */
    public static boolean m2709h(Context context, String str) {
        SharedPreferences m2708g;
        boolean z;
        String m2686a = m2686a(str, "_ace");
        if (str.equals("JArp")) {
            m2708g = m2708g(context);
            z = false;
        } else {
            m2708g = m2708g(context);
            z = true;
        }
        return m2708g.getBoolean(m2686a, z);
    }

    /* renamed from: i */
    public static boolean m2710i(Context context, String str) {
        return m2708g(context).getBoolean(m2686a(str, "_aue"), true);
    }

    /* renamed from: j */
    public static String m2711j(Context context, String str) {
        return m2708g(context).getString(m2686a("JType", str), "0,0");
    }

    /* renamed from: k */
    public static void m2712k(Context context, String str) {
        m2708g(context).edit().putBoolean(m2686a("JArp", str), true).apply();
    }

    /* renamed from: l */
    public static boolean m2713l(Context context, String str) {
        return m2708g(context).getBoolean(m2686a("JArp", str), false);
    }

    /* renamed from: m */
    public static void m2714m(Context context, String str) {
        m2708g(context).edit().putString(m2686a("JLocation", "info"), str).apply();
    }

    /* renamed from: n */
    public static void m2715n(Context context, String str) {
        m2708g(context).edit().putString("JNotificationState", str).apply();
    }

    /* renamed from: o */
    public static void m2716o(Context context, String str) {
        C0675a.m3473e("JCommonConfig", "update deviceSession");
        m2708g(context).edit().putString("JDevicesession", str).apply();
    }
}
