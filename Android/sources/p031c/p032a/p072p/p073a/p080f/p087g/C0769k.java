package p031c.p032a.p072p.p073a.p080f.p087g;

import android.support.v13.app.FragmentPagerAdapter;
import android.support.v13.app.FragmentStatePagerAdapter;
import android.support.v4.app.ActivityC0208o;
import android.support.v4.app.ComponentCallbacksC0205l;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p000a.p005b.p009c.p019h.C0069C;

/* renamed from: c.a.p.a.f.g.k */
/* loaded from: classes.dex */
public final class C0769k {

    /* renamed from: a */
    public static boolean f3398a = true;

    /* renamed from: b */
    public static boolean f3399b = false;

    /* renamed from: c */
    public static boolean f3400c = true;

    /* renamed from: d */
    public static boolean f3401d = true;

    /* renamed from: e */
    public static boolean f3402e = true;

    /* renamed from: f */
    public static boolean f3403f = true;

    /* renamed from: g */
    public static boolean f3404g = true;

    /* renamed from: h */
    public static boolean f3405h = true;

    /* renamed from: i */
    public static boolean f3406i = true;

    /* renamed from: j */
    public static Class f3407j;

    /* renamed from: k */
    public static Class f3408k;

    /* renamed from: l */
    private static Method f3409l;

    /* renamed from: m */
    private static Package f3410m;

    /* renamed from: n */
    private static Package f3411n;

    /* renamed from: o */
    private static Package f3412o;

    /* renamed from: p */
    private static Package f3413p = LinearLayout.class.getPackage();

    /* renamed from: q */
    private static Package f3414q = View.class.getPackage();

    static {
        try {
            f3410m = Package.getPackage("android.support.v4.widget");
        } catch (Throwable unused) {
        }
        try {
            f3411n = Package.getPackage("android.support.v4.view");
        } catch (Throwable unused2) {
        }
        try {
            f3412o = Package.getPackage("android.support.v7.widget");
        } catch (Throwable unused3) {
        }
        try {
            f3408k = Class.forName("android.support.v7.widget.RecyclerView");
            try {
                f3409l = f3408k.getDeclaredMethod("getChildAdapterPosition", View.class);
            } catch (NoSuchMethodException unused4) {
            }
            try {
                if (f3409l == null) {
                    f3409l = f3408k.getDeclaredMethod("getChildPosition", View.class);
                }
            } catch (NoSuchMethodException unused5) {
            }
        } catch (ClassNotFoundException unused6) {
            f3398a = false;
        }
        try {
            f3407j = Class.forName("android.support.v4.widget.C");
            f3399b = true;
        } catch (ClassNotFoundException unused7) {
        }
        try {
            Class.forName("a.b.c.h.C");
        } catch (ClassNotFoundException unused8) {
            f3400c = false;
        }
        try {
            Class.forName("com.tencent.smtt.sdk.WebView");
        } catch (ClassNotFoundException unused9) {
            f3401d = false;
        }
        try {
            Class.forName("android.support.v7.app.l");
        } catch (ClassNotFoundException unused10) {
            f3402e = false;
        }
        try {
            Class.forName("android.support.v4.app.o");
        } catch (ClassNotFoundException unused11) {
            f3403f = false;
        }
        try {
            Class.forName("android.support.v4.app.l");
        } catch (ClassNotFoundException unused12) {
            f3404g = false;
        }
        try {
            Class.forName("android.support.v13.app.FragmentPagerAdapter");
        } catch (ClassNotFoundException unused13) {
            f3405h = false;
        }
        try {
            Class.forName("android.support.v13.app.FragmentStatePagerAdapter");
        } catch (ClassNotFoundException unused14) {
            f3406i = false;
        }
    }

    /* renamed from: a */
    public static int m3825a(View view, ViewGroup viewGroup) {
        Method method;
        if (!f3398a || !(viewGroup instanceof RecyclerView) || (method = f3409l) == null) {
            return -1;
        }
        try {
            return ((Integer) method.invoke(viewGroup, view)).intValue();
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
            return -1;
        } catch (InvocationTargetException e3) {
            e3.printStackTrace();
            return -1;
        } catch (Exception unused) {
            return -1;
        }
    }

    /* renamed from: a */
    public static boolean m3826a(Object obj) {
        return f3398a && (obj instanceof RecyclerView);
    }

    /* renamed from: a */
    public static boolean m3827a(Package r2) {
        if (r2 != null) {
            return r2.equals(f3414q) || r2.equals(f3413p) || r2.getName().startsWith("com.android.internal") || r2.equals(f3410m) || r2.equals(f3411n) || r2.equals(f3412o);
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m3828b(Object obj) {
        return f3400c && (obj instanceof C0069C);
    }

    /* renamed from: c */
    public static boolean m3829c(Object obj) {
        return f3403f && (obj instanceof ActivityC0208o);
    }

    /* renamed from: d */
    public static boolean m3830d(Object obj) {
        return f3404g && (obj instanceof ComponentCallbacksC0205l);
    }

    /* renamed from: e */
    public static boolean m3831e(Object obj) {
        return f3405h && (obj instanceof FragmentPagerAdapter);
    }

    /* renamed from: f */
    public static boolean m3832f(Object obj) {
        return f3406i && (obj instanceof FragmentStatePagerAdapter);
    }
}
