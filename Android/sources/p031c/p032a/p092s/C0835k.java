package p031c.p032a.p092s;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import p031c.p032a.p057a.C0583a;

/* renamed from: c.a.s.k */
/* loaded from: classes.dex */
public class C0835k {

    /* renamed from: a */
    private static SharedPreferences f3569a;

    /* renamed from: a */
    private static SharedPreferences m4090a(Context context) {
        if (f3569a == null) {
            m4093b(context);
        }
        return f3569a;
    }

    /* renamed from: a */
    public static void m4091a(Context context, String str, int i) {
        m4090a(context).edit().putInt(str, i).apply();
    }

    /* renamed from: b */
    public static int m4092b(Context context, String str, int i) {
        SharedPreferences m4094c;
        return ((str.equals("jpush_register_code") || str.equals("service_stoped")) && (m4094c = m4094c(context)) != null) ? m4094c.getInt(str, i) : m4090a(context).getInt(str, i);
    }

    /* renamed from: b */
    private static void m4093b(Context context) {
        f3569a = context.getSharedPreferences("cn.jpush.android.user.profile", 0);
    }

    /* renamed from: c */
    private static SharedPreferences m4094c(Context context) {
        Context m2978a = C0583a.m2978a(context);
        if (m2978a == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 11) {
            m2978a.getSharedPreferences("cn.jpush.android.user.profile", 4);
        }
        return m2978a.getSharedPreferences("cn.jpush.android.user.profile", 0);
    }
}
