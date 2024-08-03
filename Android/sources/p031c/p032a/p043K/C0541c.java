package p031c.p032a.p043K;

import android.content.Context;
import android.content.SharedPreferences;
import p031c.p032a.p046N.C0548d;
import p031c.p032a.p069m.C0684a;
import p031c.p032a.p096v.C0854j;

/* renamed from: c.a.K.c */
/* loaded from: classes.dex */
public final class C0541c {

    /* renamed from: a */
    private static SharedPreferences f2673a;

    /* renamed from: a */
    public static String m2809a(Context context) {
        return m2815b(context, "number_version", "1.3.0");
    }

    /* renamed from: a */
    public static String m2810a(Context context, int i) {
        if (i < 0 || i >= 3) {
            return "http://182.92.20.189:9099/";
        }
        return m2815b(context, "number_url" + i, "http://182.92.20.189:9099/");
    }

    /* renamed from: a */
    public static void m2811a(Context context, String str) {
        String m2846a = C0548d.m2846a(context);
        if (C0854j.m4161a(m2846a)) {
            m2846a = "number_num";
        }
        m2812a(context, m2846a, str);
    }

    /* renamed from: a */
    public static void m2812a(Context context, String str, String str2) {
        m2820g(context).edit().putString(str, C0684a.m3501a(str2)).apply();
    }

    /* renamed from: a */
    public static void m2813a(Context context, boolean z) {
        m2820g(context).edit().putBoolean("nb_upload", z).apply();
    }

    /* renamed from: b */
    public static String m2814b(Context context) {
        return m2815b(context, "number_appid", "7");
    }

    /* renamed from: b */
    private static String m2815b(Context context, String str, String str2) {
        String string = m2820g(context).getString(str, "");
        return C0854j.m4161a(string) ? str2 : C0684a.m3506b(string, str2);
    }

    /* renamed from: c */
    public static String m2816c(Context context) {
        return m2815b(context, "number_appsecret", "2b90de0f1f88eaf49593f1d827b19c63");
    }

    /* renamed from: d */
    public static String m2817d(Context context) {
        String m2846a = C0548d.m2846a(context);
        if (C0854j.m4161a(m2846a)) {
            m2846a = "number_num";
        }
        return m2815b(context, m2846a, "");
    }

    /* renamed from: e */
    public static boolean m2818e(Context context) {
        return m2820g(context).getBoolean("nb_upload", false);
    }

    /* renamed from: f */
    public static void m2819f(Context context) {
        m2820g(context).edit().putLong("nb_lasttime", System.currentTimeMillis()).apply();
    }

    /* renamed from: g */
    private static SharedPreferences m2820g(Context context) {
        if (f2673a == null) {
            f2673a = context.getSharedPreferences("cn.jiguang.common.pn", 0);
        }
        return f2673a;
    }
}
