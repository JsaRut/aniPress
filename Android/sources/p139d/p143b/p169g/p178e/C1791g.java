package p139d.p143b.p169g.p178e;

import android.graphics.drawable.Drawable;

/* renamed from: d.b.g.e.g */
/* loaded from: classes.dex */
public class C1791g {
    /* renamed from: a */
    public static int m7352a(int i) {
        int i2 = i >>> 24;
        if (i2 == 255) {
            return -1;
        }
        return i2 == 0 ? -2 : -3;
    }

    /* renamed from: a */
    public static int m7353a(int i, int i2) {
        if (i2 == 255) {
            return i;
        }
        if (i2 == 0) {
            return i & 16777215;
        }
        return (i & 16777215) | ((((i >>> 24) * (i2 + (i2 >> 7))) >> 8) << 24);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static void m7354a(Drawable drawable, Drawable.Callback callback, InterfaceC1806v interfaceC1806v) {
        if (drawable != 0) {
            drawable.setCallback(callback);
            if (drawable instanceof InterfaceC1805u) {
                ((InterfaceC1805u) drawable).mo7343a(interfaceC1806v);
            }
        }
    }

    /* renamed from: a */
    public static void m7355a(Drawable drawable, Drawable drawable2) {
        if (drawable2 == null || drawable == null || drawable == drawable2) {
            return;
        }
        drawable.setBounds(drawable2.getBounds());
        drawable.setChangingConfigurations(drawable2.getChangingConfigurations());
        drawable.setLevel(drawable2.getLevel());
        drawable.setVisible(drawable2.isVisible(), false);
        drawable.setState(drawable2.getState());
    }

    /* renamed from: a */
    public static void m7356a(Drawable drawable, C1790f c1790f) {
        if (drawable == null || c1790f == null) {
            return;
        }
        c1790f.m7349a(drawable);
    }
}
