package p031c.p101b.p102a.p107e;

import android.content.Context;
import android.content.SharedPreferences;
import p031c.p101b.p102a.p104b.C0883f;
import p031c.p101b.p102a.p114l.C0923b;

/* renamed from: c.b.a.e.c */
/* loaded from: classes.dex */
public class C0902c {

    /* renamed from: a */
    private static SharedPreferences f3870a;

    /* renamed from: a */
    public static void m4445a(Context context) {
        f3870a = context.getSharedPreferences("cn.jpush.config", 0);
    }

    /* renamed from: a */
    public static void m4446a(Context context, int i) {
        m4466j(context).edit().putInt("service_stoped", i).apply();
    }

    /* renamed from: a */
    public static void m4447a(Context context, long j) {
        if (j < 0) {
            C0923b.m4653i("PushConfig", "freeze end time was incorrect!");
            return;
        }
        if (j > 1800) {
            C0923b.m4649e("PushConfig", "freeze end time was greate than half an hour");
            j = 1800;
        }
        m4466j(context).edit().putLong("TAFreezeSetTime", System.currentTimeMillis()).putLong("TAFreezeEndTime", j * 1000).apply();
    }

    /* renamed from: a */
    public static void m4448a(Context context, String str) {
        m4466j(context).edit().putString("mobile_number", str).apply();
    }

    /* renamed from: a */
    public static void m4449a(Context context, String str, String str2) {
        m4466j(context).edit().putString("jpush_save_custom_builder" + str, str2).apply();
    }

    /* renamed from: a */
    public static void m4450a(Context context, boolean z) {
        m4466j(context).edit().putBoolean("notification_enabled", z).apply();
    }

    /* renamed from: b */
    public static int m4451b(Context context) {
        SharedPreferences m4437a = C0901b.m4437a(context, "cn.jpush.config");
        if (m4437a == null) {
            m4437a = m4466j(context);
        }
        int i = m4437a.getInt("service_stoped", -1);
        if (i >= 0) {
            return i;
        }
        int i2 = context.getSharedPreferences("cn.jpush.android.user.profile", 0).getInt("service_stoped", 0);
        m4446a(context, i2);
        return i2;
    }

    /* renamed from: b */
    public static void m4452b(Context context, int i) {
        m4466j(context).edit().putInt("notification_num", i).apply();
    }

    /* renamed from: b */
    public static void m4453b(Context context, long j) {
        m4466j(context).edit().putLong("geofence_interval", j).apply();
    }

    /* renamed from: b */
    public static void m4454b(Context context, String str) {
        m4466j(context).edit().putString("setting_push_time", str).apply();
    }

    /* renamed from: c */
    public static long m4455c(Context context, long j) {
        long j2;
        long j3 = m4466j(context).getLong("geofence_interval", -1L);
        if (j3 == -1) {
            j2 = context.getSharedPreferences("cn.jpush.android.user.profile", 0).getLong("geofence_interval", -1L);
            if (j2 != -1) {
                m4453b(context, j2);
            }
        } else {
            j2 = j3;
        }
        return j2 == -1 ? j : j2;
    }

    /* renamed from: c */
    public static void m4456c(Context context, int i) {
        m4466j(context).edit().putInt("geofence_max_num", i).apply();
    }

    /* renamed from: c */
    public static void m4457c(Context context, String str) {
        m4466j(context).edit().putString("setting_silence_push_time", str).apply();
    }

    /* renamed from: c */
    public static boolean m4458c(Context context) {
        boolean z = m4451b(context) >= 1;
        if (z) {
            C0923b.m4644b("PushConfig", "The service is stopped, it will give up all the actions until you call resumePush method to resume the service.");
        }
        return z;
    }

    /* renamed from: d */
    public static int m4459d(Context context, int i) {
        int i2 = m4466j(context).getInt("geofence_max_num", -1);
        if (i2 == -1 && (i2 = context.getSharedPreferences("cn.jpush.android.user.profile", 0).getInt("geofence_max_num", -1)) != -1) {
            m4456c(context, i2);
        }
        return i2 == -1 ? i : i2;
    }

    /* renamed from: d */
    public static String m4460d(Context context) {
        return m4466j(context).getString("mobile_number", null);
    }

    /* renamed from: e */
    public static boolean m4461e(Context context) {
        return m4466j(context).getBoolean("notification_enabled", true);
    }

    /* renamed from: f */
    public static String m4462f(Context context) {
        return m4466j(context).getString("setting_push_time", "");
    }

    /* renamed from: g */
    public static String m4463g(Context context) {
        return m4466j(context).getString("setting_silence_push_time", "");
    }

    /* renamed from: h */
    public static int m4464h(Context context) {
        return m4466j(context).getInt("notification_num", C0883f.f3719a);
    }

    /* renamed from: i */
    public static boolean m4465i(Context context) {
        long j = m4466j(context).getLong("TAFreezeEndTime", -1L);
        if (j > 1800) {
            j = 0;
        }
        long j2 = m4466j(context).getLong("TAFreezeSetTime", -1L);
        if (j == -1 || j2 == -1) {
            return false;
        }
        if (System.currentTimeMillis() - j2 >= 0 && System.currentTimeMillis() - j2 <= j) {
            return false;
        }
        m4466j(context).edit().putLong("TAFreezeSetTime", -1L).putLong("TAFreezeEndTime", -1L).apply();
        C0923b.m4653i("PushConfig", "incorrect timestamp");
        return true;
    }

    /* renamed from: j */
    private static SharedPreferences m4466j(Context context) {
        if (f3870a == null) {
            m4445a(context);
        }
        return f3870a;
    }
}
