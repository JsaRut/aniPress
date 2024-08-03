package p031c.p101b.p102a.p107e;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p031c.p101b.p102a.C0869a;

/* renamed from: c.b.a.e.b */
/* loaded from: classes.dex */
public class C0901b {

    /* renamed from: a */
    private static final Map<String, SharedPreferences> f3869a = new ConcurrentHashMap();

    /* renamed from: a */
    public static SharedPreferences m4437a(Context context, String str) {
        Context m4245c = C0869a.m4245c(context);
        if (m4245c == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 11) {
            m4245c.getSharedPreferences(str, 4);
        }
        return m4245c.getSharedPreferences(str, 0);
    }

    /* renamed from: a */
    public static <T> T m4438a(Context context, C0900a<T> c0900a) {
        T t = (T) m4443b(context, c0900a);
        return t != null ? t : c0900a.f3867c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private static <T> T m4439a(SharedPreferences sharedPreferences, String str, T t) {
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
    public static void m4440a(Context context, C0900a<?>... c0900aArr) {
        if (c0900aArr == null || c0900aArr.length <= 0) {
            return;
        }
        SharedPreferences m4442b = m4442b(context, c0900aArr[0].f3865a);
        if (m4442b != null) {
            SharedPreferences.Editor edit = m4442b.edit();
            for (C0900a<?> c0900a : c0900aArr) {
                m4441a(edit, c0900a.f3866b, c0900a.f3867c);
            }
            edit.commit();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private static <T> void m4441a(SharedPreferences.Editor editor, String str, T t) {
        if (editor != null) {
            if (t == 0) {
                editor.remove(str);
                return;
            }
            if (t instanceof Boolean) {
                editor.putBoolean(str, ((Boolean) t).booleanValue());
                return;
            }
            if (t instanceof String) {
                editor.putString(str, (String) t);
                return;
            }
            if (t instanceof Integer) {
                editor.putInt(str, ((Integer) t).intValue());
            } else if (t instanceof Long) {
                editor.putLong(str, ((Long) t).longValue());
            } else if (t instanceof Float) {
                editor.putFloat(str, ((Float) t).floatValue());
            }
        }
    }

    /* renamed from: b */
    private static SharedPreferences m4442b(Context context, String str) {
        Context m4245c;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        SharedPreferences sharedPreferences = f3869a.get(str);
        if (sharedPreferences != null || (m4245c = C0869a.m4245c(context)) == null) {
            return sharedPreferences;
        }
        SharedPreferences sharedPreferences2 = m4245c.getSharedPreferences(str, 0);
        f3869a.put(str, sharedPreferences2);
        m4444c(m4245c, str);
        return sharedPreferences2;
    }

    /* renamed from: b */
    public static <T> T m4443b(Context context, C0900a<T> c0900a) {
        T t = (T) m4439a(m4442b(context, c0900a.f3865a), c0900a.f3866b, c0900a.f3867c);
        if (t == null && c0900a.f3868d) {
            t = (T) m4439a(m4437a(context, c0900a.f3865a), c0900a.f3866b, c0900a.f3867c);
        }
        if (t == null) {
            return null;
        }
        c0900a.m4436a((C0900a<T>) t);
        return t;
    }

    /* renamed from: c */
    private static void m4444c(Context context, String str) {
    }
}
