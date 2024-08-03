package p000a.p005b.p009c.p019h;

import android.os.Build;
import android.util.Log;
import android.view.LayoutInflater;
import java.lang.reflect.Field;

/* renamed from: a.b.c.h.h */
/* loaded from: classes.dex */
public final class C0093h {

    /* renamed from: a */
    private static Field f388a;

    /* renamed from: b */
    private static boolean f389b;

    /* renamed from: a */
    public static void m437a(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        layoutInflater.setFactory2(factory2);
        if (Build.VERSION.SDK_INT < 21) {
            LayoutInflater.Factory factory = layoutInflater.getFactory();
            if (factory instanceof LayoutInflater.Factory2) {
                m438b(layoutInflater, (LayoutInflater.Factory2) factory);
            } else {
                m438b(layoutInflater, factory2);
            }
        }
    }

    /* renamed from: b */
    private static void m438b(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        if (!f389b) {
            try {
                f388a = LayoutInflater.class.getDeclaredField("mFactory2");
                f388a.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.e("LayoutInflaterCompatHC", "forceSetFactory2 Could not find field 'mFactory2' on class " + LayoutInflater.class.getName() + "; inflation may have unexpected results.", e2);
            }
            f389b = true;
        }
        Field field = f388a;
        if (field != null) {
            try {
                field.set(layoutInflater, factory2);
            } catch (IllegalAccessException e3) {
                Log.e("LayoutInflaterCompatHC", "forceSetFactory2 could not set the Factory2 on LayoutInflater " + layoutInflater + "; inflation may have unexpected results.", e3);
            }
        }
    }
}
