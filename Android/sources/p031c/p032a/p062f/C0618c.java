package p031c.p032a.p062f;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p031c.p032a.p092s.C0831g;

/* renamed from: c.a.f.c */
/* loaded from: classes.dex */
public final class C0618c {

    /* renamed from: a */
    private static final Map<String, SharedPreferences> f2908a = new ConcurrentHashMap();

    /* renamed from: a */
    private static SharedPreferences m3189a(Context context, String str) {
        Context m4071a;
        C0617b<String> m3171i;
        C0617b<String> m3171i2;
        String str2;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        SharedPreferences sharedPreferences = f2908a.get(str);
        if (sharedPreferences == null && (m4071a = C0831g.m4071a(context)) != null) {
            sharedPreferences = m4071a.getSharedPreferences(str, 0);
            f2908a.put(str, sharedPreferences);
            String str3 = (String) m3190a(m4071a, C0617b.m3168g());
            if (TextUtils.isEmpty(str3) || str3.startsWith("1.")) {
                if (str.equals("cn.jiguang.sdk.address")) {
                    C0617b<String> m3184v = C0617b.m3184v();
                    C0617b<String> m3184v2 = C0617b.m3184v();
                    m3184v2.f2904b = "cn.jpush.android.user.profile";
                    m3184v2.f2905c = "conn";
                    m3192a(m4071a, m3184v, m3184v2);
                    m3171i = C0617b.m3185w();
                    m3171i2 = C0617b.m3185w();
                    m3171i2.f2904b = "cn.jpush.android.user.profile";
                    str2 = "srv";
                } else if (str.equals(C0617b.f2903a)) {
                    C0617b<String> m3170h = C0617b.m3170h();
                    C0617b<String> m3170h2 = C0617b.m3170h();
                    m3170h2.f2905c = "device_registered_appkey";
                    m3192a(m4071a, m3170h, m3170h2);
                    m3171i = C0617b.m3171i();
                    m3171i2 = C0617b.m3171i();
                    str2 = "imei";
                }
                m3171i2.f2905c = str2;
                m3192a(m4071a, m3171i, m3171i2);
            }
        }
        return sharedPreferences;
    }

    /* renamed from: a */
    public static <T> T m3190a(Context context, C0617b<T> c0617b) {
        T t = (T) m3194b(context, c0617b);
        return t != null ? t : c0617b.f2906d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private static <T> T m3191a(SharedPreferences sharedPreferences, String str, T t) {
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
    private static <T> void m3192a(Context context, C0617b<T> c0617b, C0617b<T> c0617b2) {
        T t;
        if (m3194b(context, c0617b) != null || (t = (T) m3194b(context, c0617b2)) == null) {
            return;
        }
        c0617b.f2906d = t;
        m3193a(context, (C0617b<?>[]) new C0617b[]{c0617b});
        c0617b2.f2906d = null;
        m3193a(context, (C0617b<?>[]) new C0617b[]{c0617b2});
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static void m3193a(Context context, C0617b<?>... c0617bArr) {
        if (c0617bArr.length > 0) {
            SharedPreferences m3189a = m3189a(context, c0617bArr[0].f2904b);
            if (m3189a != null) {
                SharedPreferences.Editor edit = m3189a.edit();
                for (C0617b<?> c0617b : c0617bArr) {
                    String str = c0617b.f2905c;
                    T t = c0617b.f2906d;
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
    public static <T> T m3194b(Context context, C0617b<T> c0617b) {
        SharedPreferences sharedPreferences;
        T t = (T) m3191a(m3189a(context, c0617b.f2904b), c0617b.f2905c, c0617b.f2906d);
        if (t == null && c0617b.f2907e) {
            String str = c0617b.f2904b;
            Context m4071a = C0831g.m4071a(context);
            if (m4071a != null) {
                if (Build.VERSION.SDK_INT >= 11) {
                    m4071a.getSharedPreferences(str, 4);
                }
                sharedPreferences = m4071a.getSharedPreferences(str, 0);
            } else {
                sharedPreferences = null;
            }
            t = (T) m3191a(sharedPreferences, c0617b.f2905c, c0617b.f2906d);
        }
        if (t == null) {
            return null;
        }
        c0617b.f2906d = t;
        return t;
    }
}
