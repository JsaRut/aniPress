package p000a.p005b.p009c.p018g;

import android.os.Build;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

/* renamed from: a.b.c.g.a */
/* loaded from: classes.dex */
public final class C0064a {

    /* renamed from: a */
    private static Method f224a;

    /* renamed from: b */
    private static Method f225b;

    static {
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                f225b = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", Locale.class);
                return;
            } catch (Exception e2) {
                throw new IllegalStateException(e2);
            }
        }
        try {
            Class<?> cls = Class.forName("libcore.icu.ICU");
            if (cls != null) {
                f224a = cls.getMethod("getScript", String.class);
                f225b = cls.getMethod("addLikelySubtags", String.class);
            }
        } catch (Exception e3) {
            f224a = null;
            f225b = null;
            Log.w("ICUCompat", e3);
        }
    }

    /* renamed from: a */
    private static String m264a(String str) {
        try {
            if (f224a != null) {
                return (String) f224a.invoke(null, str);
            }
        } catch (IllegalAccessException | InvocationTargetException e2) {
            Log.w("ICUCompat", e2);
        }
        return null;
    }

    /* renamed from: a */
    public static String m265a(Locale locale) {
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                return ((Locale) f225b.invoke(null, locale)).getScript();
            } catch (IllegalAccessException | InvocationTargetException e2) {
                Log.w("ICUCompat", e2);
                return locale.getScript();
            }
        }
        String m266b = m266b(locale);
        if (m266b != null) {
            return m264a(m266b);
        }
        return null;
    }

    /* renamed from: b */
    private static String m266b(Locale locale) {
        String locale2 = locale.toString();
        try {
            if (f225b != null) {
                return (String) f225b.invoke(null, locale2);
            }
        } catch (IllegalAccessException | InvocationTargetException e2) {
            Log.w("ICUCompat", e2);
        }
        return locale2;
    }
}
