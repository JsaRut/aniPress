package android.support.v7.widget;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p000a.p005b.p009c.p019h.C0107v;

/* renamed from: android.support.v7.widget.Ja */
/* loaded from: classes.dex */
public class C0408Ja {

    /* renamed from: a */
    private static Method f2079a;

    static {
        if (Build.VERSION.SDK_INT >= 18) {
            try {
                f2079a = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                if (f2079a.isAccessible()) {
                    return;
                }
                f2079a.setAccessible(true);
            } catch (NoSuchMethodException unused) {
                Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
            }
        }
    }

    /* renamed from: a */
    public static void m2258a(View view, Rect rect, Rect rect2) {
        Method method = f2079a;
        if (method != null) {
            try {
                method.invoke(view, rect, rect2);
            } catch (Exception e2) {
                Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e2);
            }
        }
    }

    /* renamed from: a */
    public static boolean m2259a(View view) {
        return C0107v.m518g(view) == 1;
    }

    /* renamed from: b */
    public static void m2260b(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            try {
                Method method = view.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
                if (!method.isAccessible()) {
                    method.setAccessible(true);
                }
                method.invoke(view, new Object[0]);
            } catch (IllegalAccessException e2) {
                e = e2;
                Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e);
            } catch (NoSuchMethodException unused) {
                Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
            } catch (InvocationTargetException e3) {
                e = e3;
                Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e);
            }
        }
    }
}
