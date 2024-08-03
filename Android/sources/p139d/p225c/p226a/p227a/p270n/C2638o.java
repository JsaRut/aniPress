package p139d.p225c.p226a.p227a.p270n;

import android.text.TextUtils;
import android.util.Log;

/* renamed from: d.c.a.a.n.o */
/* loaded from: classes.dex */
public final class C2638o {

    /* renamed from: a */
    private static int f10972a = 0;

    /* renamed from: b */
    private static boolean f10973b = true;

    /* renamed from: a */
    private static String m11154a(String str, Throwable th) {
        if (th == null) {
            return str;
        }
        String message = th.getMessage();
        if (TextUtils.isEmpty(message)) {
            return str;
        }
        return str + " - " + message;
    }

    /* renamed from: a */
    public static void m11155a(String str, String str2) {
        if (f10972a == 0) {
            Log.d(str, str2);
        }
    }

    /* renamed from: a */
    public static void m11156a(String str, String str2, Throwable th) {
        if (!f10973b) {
            m11157b(str, m11154a(str2, th));
        }
        if (f10972a <= 3) {
            Log.e(str, str2, th);
        }
    }

    /* renamed from: b */
    public static void m11157b(String str, String str2) {
        if (f10972a <= 3) {
            Log.e(str, str2);
        }
    }

    /* renamed from: b */
    public static void m11158b(String str, String str2, Throwable th) {
        if (!f10973b) {
            m11160d(str, m11154a(str2, th));
        }
        if (f10972a <= 2) {
            Log.w(str, str2, th);
        }
    }

    /* renamed from: c */
    public static void m11159c(String str, String str2) {
        if (f10972a <= 1) {
            Log.i(str, str2);
        }
    }

    /* renamed from: d */
    public static void m11160d(String str, String str2) {
        if (f10972a <= 2) {
            Log.w(str, str2);
        }
    }
}
