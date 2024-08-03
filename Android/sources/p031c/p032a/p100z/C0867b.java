package p031c.p032a.p100z;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p031c.p032a.p057a.C0583a;

/* renamed from: c.a.z.b */
/* loaded from: classes.dex */
public final class C0867b {

    /* renamed from: a */
    private static final Map<String, SharedPreferences> f3643a = new ConcurrentHashMap();

    /* renamed from: a */
    public static <T> T m4225a(Context context, C0866a<T> c0866a) {
        T t = (T) m4231b(context, c0866a);
        return t != null ? t : c0866a.f3641e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private static <T> T m4226a(SharedPreferences sharedPreferences, String str, T t) {
        if (sharedPreferences != null && sharedPreferences.contains(str)) {
            try {
                if (t instanceof Boolean) {
                    return (T) Boolean.valueOf(sharedPreferences.getBoolean(str, ((Boolean) t).booleanValue()));
                }
                if (t instanceof String) {
                    return (T) sharedPreferences.getString(str, (String) t);
                }
                if (t instanceof Integer) {
                    return (T) Integer.valueOf(sharedPreferences.getInt(str, ((Integer) t).intValue()));
                }
                if (t instanceof Long) {
                    return (T) Long.valueOf(sharedPreferences.getLong(str, ((Long) t).longValue()));
                }
                if (t instanceof Float) {
                    return (T) Float.valueOf(sharedPreferences.getFloat(str, ((Float) t).floatValue()));
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* renamed from: a */
    private static <T> void m4227a(Context context, C0866a<T> c0866a, C0866a<T> c0866a2) {
        T t;
        if (m4231b(context, c0866a) != null || (t = (T) m4231b(context, c0866a2)) == null) {
            return;
        }
        c0866a.f3641e = t;
        m4229a(context, (C0866a<?>[]) new C0866a[]{c0866a});
        c0866a2.f3641e = null;
        m4229a(context, (C0866a<?>[]) new C0866a[]{c0866a2});
    }

    /* renamed from: a */
    public static void m4228a(Context context, String str) {
        SharedPreferences m4230b = m4230b(context, str);
        if (m4230b != null) {
            m4230b.edit().clear().apply();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static void m4229a(Context context, C0866a<?>... c0866aArr) {
        if (c0866aArr.length > 0) {
            SharedPreferences m4230b = m4230b(context, c0866aArr[0].f3639c);
            if (m4230b != null) {
                SharedPreferences.Editor edit = m4230b.edit();
                for (C0866a<?> c0866a : c0866aArr) {
                    String str = c0866a.f3640d;
                    T t = c0866a.f3641e;
                    if (edit != null) {
                        if (t == 0) {
                            edit.remove(str);
                        } else if (t instanceof Boolean) {
                            edit.putBoolean(str, ((Boolean) t).booleanValue());
                        } else if (t instanceof String) {
                            edit.putString(str, (String) t);
                        } else if (t instanceof Integer) {
                            edit.putInt(str, ((Integer) t).intValue());
                        } else if (t instanceof Long) {
                            edit.putLong(str, ((Long) t).longValue());
                        } else if (t instanceof Float) {
                            edit.putFloat(str, ((Float) t).floatValue());
                        }
                    }
                }
                edit.commit();
            }
        }
    }

    /* renamed from: b */
    private static SharedPreferences m4230b(Context context, String str) {
        Context m2978a;
        C0866a m4204e;
        C0866a m4204e2;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        SharedPreferences sharedPreferences = f3643a.get(str);
        if (sharedPreferences == null && (m2978a = C0583a.m2978a(context)) != null) {
            sharedPreferences = m2978a.getSharedPreferences(str, 0);
            f3643a.put(str, sharedPreferences);
            String str2 = (String) m4225a(m2978a, C0866a.m4221v());
            if (TextUtils.isEmpty(str2) || str2.startsWith("1.")) {
                if (str.equals(C0866a.f3637a)) {
                    C0866a<String> m4208i = C0866a.m4208i();
                    C0866a<String> m4208i2 = C0866a.m4208i();
                    m4208i2.f3639c = "cn.jpush.android.user.profile";
                    m4227a(m2978a, m4208i, m4208i2);
                    C0866a<Long> m4209j = C0866a.m4209j();
                    C0866a<Long> m4209j2 = C0866a.m4209j();
                    m4209j2.f3639c = "cn.jpush.android.user.profile";
                    m4227a(m2978a, m4209j, m4209j2);
                    m4204e = C0866a.m4210k();
                    m4204e2 = C0866a.m4210k();
                    m4204e2.f3639c = "cn.jpush.android.user.profile";
                } else if (str.equals("cn.jiguang.sdk.user.set.profile")) {
                    C0866a<String> m4211l = C0866a.m4211l();
                    C0866a<String> m4211l2 = C0866a.m4211l();
                    m4211l2.f3639c = "cn.jpush.preferences.v2";
                    m4227a(m2978a, m4211l, m4211l2);
                    m4204e = C0866a.m4212m();
                    m4204e2 = C0866a.m4212m();
                    m4204e2.f3641e = "cn.jpush.android.user.profile";
                } else if (str.equals("cn.jiguang.sdk.user.profile")) {
                    C0866a<Long> m4202c = C0866a.m4202c();
                    C0866a<Long> m4202c2 = C0866a.m4202c();
                    m4202c2.f3639c = "cn.jpush.android.user.profile";
                    m4202c2.f3640d = "device_uid";
                    m4227a(m2978a, m4202c, m4202c2);
                    C0866a<String> m4203d = C0866a.m4203d();
                    C0866a<String> m4203d2 = C0866a.m4203d();
                    m4203d2.f3639c = "cn.jpush.android.user.profile";
                    m4203d2.f3640d = "device_registration_id";
                    m4227a(m2978a, m4203d, m4203d2);
                    m4204e = C0866a.m4204e();
                    m4204e2 = C0866a.m4204e();
                    m4204e2.f3639c = "cn.jpush.android.user.profile";
                    m4204e2.f3640d = "device_password";
                }
                m4227a(m2978a, m4204e, m4204e2);
            }
        }
        return sharedPreferences;
    }

    /* renamed from: b */
    public static <T> T m4231b(Context context, C0866a<T> c0866a) {
        SharedPreferences sharedPreferences;
        T t = (T) m4226a(m4230b(context, c0866a.f3639c), c0866a.f3640d, c0866a.f3641e);
        if (t == null && c0866a.f3642f) {
            String str = c0866a.f3639c;
            Context m2978a = C0583a.m2978a(context);
            if (m2978a != null) {
                if (Build.VERSION.SDK_INT >= 11) {
                    m2978a.getSharedPreferences(str, 4);
                }
                sharedPreferences = m2978a.getSharedPreferences(str, 0);
            } else {
                sharedPreferences = null;
            }
            t = (T) m4226a(sharedPreferences, c0866a.f3640d, c0866a.f3641e);
        }
        if (t == null) {
            return null;
        }
        c0866a.f3641e = t;
        return t;
    }
}
