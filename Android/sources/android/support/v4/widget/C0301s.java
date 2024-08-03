package android.support.v4.widget;

import android.os.Build;
import android.util.Log;
import android.view.View;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import p000a.p005b.p009c.p019h.C0091f;
import p000a.p005b.p009c.p019h.C0107v;

/* renamed from: android.support.v4.widget.s */
/* loaded from: classes.dex */
public final class C0301s {

    /* renamed from: a */
    private static Method f1365a;

    /* renamed from: b */
    private static boolean f1366b;

    /* renamed from: c */
    private static Field f1367c;

    /* renamed from: d */
    private static boolean f1368d;

    /* renamed from: a */
    public static void m1692a(PopupWindow popupWindow, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            popupWindow.setWindowLayoutType(i);
            return;
        }
        if (!f1366b) {
            try {
                f1365a = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", Integer.TYPE);
                f1365a.setAccessible(true);
            } catch (Exception unused) {
            }
            f1366b = true;
        }
        Method method = f1365a;
        if (method != null) {
            try {
                method.invoke(popupWindow, Integer.valueOf(i));
            } catch (Exception unused2) {
            }
        }
    }

    /* renamed from: a */
    public static void m1693a(PopupWindow popupWindow, View view, int i, int i2, int i3) {
        if (Build.VERSION.SDK_INT >= 19) {
            popupWindow.showAsDropDown(view, i, i2, i3);
            return;
        }
        if ((C0091f.m429a(i3, C0107v.m518g(view)) & 7) == 5) {
            i -= popupWindow.getWidth() - view.getWidth();
        }
        popupWindow.showAsDropDown(view, i, i2);
    }

    /* renamed from: a */
    public static void m1694a(PopupWindow popupWindow, boolean z) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            popupWindow.setOverlapAnchor(z);
            return;
        }
        if (i >= 21) {
            if (!f1368d) {
                try {
                    f1367c = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                    f1367c.setAccessible(true);
                } catch (NoSuchFieldException e2) {
                    Log.i("PopupWindowCompatApi21", "Could not fetch mOverlapAnchor field from PopupWindow", e2);
                }
                f1368d = true;
            }
            Field field = f1367c;
            if (field != null) {
                try {
                    field.set(popupWindow, Boolean.valueOf(z));
                } catch (IllegalAccessException e3) {
                    Log.i("PopupWindowCompatApi21", "Could not set overlap anchor field in PopupWindow", e3);
                }
            }
        }
    }
}
