package android.support.v7.widget;

import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.os.Build;
import android.support.v4.graphics.drawable.C0220a;
import android.support.v4.graphics.drawable.InterfaceC0222c;
import android.util.Log;
import java.lang.reflect.Field;
import p000a.p005b.p022d.p026c.p027a.C0127e;

/* renamed from: android.support.v7.widget.M */
/* loaded from: classes.dex */
public class C0412M {

    /* renamed from: a */
    public static final Rect f2080a = new Rect();

    /* renamed from: b */
    private static Class<?> f2081b;

    static {
        if (Build.VERSION.SDK_INT >= 18) {
            try {
                f2081b = Class.forName("android.graphics.Insets");
            } catch (ClassNotFoundException unused) {
            }
        }
    }

    /* renamed from: a */
    public static PorterDuff.Mode m2262a(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static boolean m2263a(Drawable drawable) {
        Drawable drawable2;
        if (Build.VERSION.SDK_INT < 15 && (drawable instanceof InsetDrawable)) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 15 && (drawable instanceof GradientDrawable)) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 17 && (drawable instanceof LayerDrawable)) {
            return false;
        }
        if (!(drawable instanceof DrawableContainer)) {
            if (drawable instanceof InterfaceC0222c) {
                drawable2 = ((InterfaceC0222c) drawable).mo1210a();
            } else if (drawable instanceof C0127e) {
                drawable2 = ((C0127e) drawable).m612a();
            } else {
                if (!(drawable instanceof ScaleDrawable)) {
                    return true;
                }
                drawable2 = ((ScaleDrawable) drawable).getDrawable();
            }
            return m2263a(drawable2);
        }
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (!(constantState instanceof DrawableContainer.DrawableContainerState)) {
            return true;
        }
        for (Drawable drawable3 : ((DrawableContainer.DrawableContainerState) constantState).getChildren()) {
            if (!m2263a(drawable3)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static void m2264b(Drawable drawable) {
        if (Build.VERSION.SDK_INT == 21 && "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName())) {
            m2266d(drawable);
        }
    }

    /* renamed from: c */
    public static Rect m2265c(Drawable drawable) {
        if (f2081b != null) {
            try {
                Drawable m1208g = C0220a.m1208g(drawable);
                Object invoke = m1208g.getClass().getMethod("getOpticalInsets", new Class[0]).invoke(m1208g, new Object[0]);
                if (invoke != null) {
                    Rect rect = new Rect();
                    for (Field field : f2081b.getFields()) {
                        String name = field.getName();
                        char c2 = 65535;
                        switch (name.hashCode()) {
                            case -1383228885:
                                if (name.equals("bottom")) {
                                    c2 = 3;
                                    break;
                                }
                                break;
                            case 115029:
                                if (name.equals("top")) {
                                    c2 = 1;
                                    break;
                                }
                                break;
                            case 3317767:
                                if (name.equals("left")) {
                                    c2 = 0;
                                    break;
                                }
                                break;
                            case 108511772:
                                if (name.equals("right")) {
                                    c2 = 2;
                                    break;
                                }
                                break;
                        }
                        if (c2 == 0) {
                            rect.left = field.getInt(invoke);
                        } else if (c2 == 1) {
                            rect.top = field.getInt(invoke);
                        } else if (c2 == 2) {
                            rect.right = field.getInt(invoke);
                        } else if (c2 == 3) {
                            rect.bottom = field.getInt(invoke);
                        }
                    }
                    return rect;
                }
            } catch (Exception unused) {
                Log.e("DrawableUtils", "Couldn't obtain the optical insets. Ignoring.");
            }
        }
        return f2080a;
    }

    /* renamed from: d */
    private static void m2266d(Drawable drawable) {
        int[] state = drawable.getState();
        drawable.setState((state == null || state.length == 0) ? C0469qa.f2482f : C0469qa.f2485i);
        drawable.setState(state);
    }
}
