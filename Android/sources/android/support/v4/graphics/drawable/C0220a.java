package android.support.v4.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: android.support.v4.graphics.drawable.a */
/* loaded from: classes.dex */
public final class C0220a {

    /* renamed from: a */
    private static Method f953a;

    /* renamed from: b */
    private static boolean f954b;

    /* renamed from: c */
    private static Method f955c;

    /* renamed from: d */
    private static boolean f956d;

    /* renamed from: a */
    public static void m1193a(Drawable drawable, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setHotspot(f, f2);
        }
    }

    /* renamed from: a */
    public static void m1194a(Drawable drawable, int i, int i2, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setHotspotBounds(i, i2, i3, i4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static void m1195a(Drawable drawable, ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setTintList(colorStateList);
        } else if (drawable instanceof InterfaceC0221b) {
            ((InterfaceC0221b) drawable).setTintList(colorStateList);
        }
    }

    /* renamed from: a */
    public static void m1196a(Drawable drawable, Resources.Theme theme) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.applyTheme(theme);
        }
    }

    /* renamed from: a */
    public static void m1197a(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        } else {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static void m1198a(Drawable drawable, PorterDuff.Mode mode) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setTintMode(mode);
        } else if (drawable instanceof InterfaceC0221b) {
            ((InterfaceC0221b) drawable).setTintMode(mode);
        }
    }

    /* renamed from: a */
    public static void m1199a(Drawable drawable, boolean z) {
        if (Build.VERSION.SDK_INT >= 19) {
            drawable.setAutoMirrored(z);
        }
    }

    /* renamed from: a */
    public static boolean m1200a(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 21) {
            return drawable.canApplyTheme();
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m1201a(Drawable drawable, int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            return drawable.setLayoutDirection(i);
        }
        if (i2 >= 17) {
            if (!f954b) {
                try {
                    f953a = Drawable.class.getDeclaredMethod("setLayoutDirection", Integer.TYPE);
                    f953a.setAccessible(true);
                } catch (NoSuchMethodException e2) {
                    Log.i("DrawableCompat", "Failed to retrieve setLayoutDirection(int) method", e2);
                }
                f954b = true;
            }
            Method method = f953a;
            if (method != null) {
                try {
                    method.invoke(drawable, Integer.valueOf(i));
                    return true;
                } catch (Exception e3) {
                    Log.i("DrawableCompat", "Failed to invoke setLayoutDirection(int) via reflection", e3);
                    f953a = null;
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    public static int m1202b(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 19) {
            return drawable.getAlpha();
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public static void m1203b(Drawable drawable, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setTint(i);
        } else if (drawable instanceof InterfaceC0221b) {
            ((InterfaceC0221b) drawable).setTint(i);
        }
    }

    /* renamed from: c */
    public static ColorFilter m1204c(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 21) {
            return drawable.getColorFilter();
        }
        return null;
    }

    /* renamed from: d */
    public static int m1205d(Drawable drawable) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            return drawable.getLayoutDirection();
        }
        if (i >= 17) {
            if (!f956d) {
                try {
                    f955c = Drawable.class.getDeclaredMethod("getLayoutDirection", new Class[0]);
                    f955c.setAccessible(true);
                } catch (NoSuchMethodException e2) {
                    Log.i("DrawableCompat", "Failed to retrieve getLayoutDirection() method", e2);
                }
                f956d = true;
            }
            Method method = f955c;
            if (method != null) {
                try {
                    return ((Integer) method.invoke(drawable, new Object[0])).intValue();
                } catch (Exception e3) {
                    Log.i("DrawableCompat", "Failed to invoke getLayoutDirection() via reflection", e3);
                    f955c = null;
                }
            }
        }
        return 0;
    }

    /* renamed from: e */
    public static boolean m1206e(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 19) {
            return drawable.isAutoMirrored();
        }
        return false;
    }

    @Deprecated
    /* renamed from: f */
    public static void m1207f(Drawable drawable) {
        drawable.jumpToCurrentState();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: g */
    public static <T extends Drawable> T m1208g(Drawable drawable) {
        return drawable instanceof InterfaceC0222c ? (T) ((InterfaceC0222c) drawable).mo1210a() : drawable;
    }

    /* renamed from: h */
    public static Drawable m1209h(Drawable drawable) {
        int i = Build.VERSION.SDK_INT;
        return i >= 23 ? drawable : i >= 21 ? !(drawable instanceof InterfaceC0221b) ? new C0224e(drawable) : drawable : !(drawable instanceof InterfaceC0221b) ? new C0223d(drawable) : drawable;
    }
}
