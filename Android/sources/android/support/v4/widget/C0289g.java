package android.support.v4.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.widget.CompoundButton;
import java.lang.reflect.Field;

/* renamed from: android.support.v4.widget.g */
/* loaded from: classes.dex */
public final class C0289g {

    /* renamed from: a */
    private static Field f1293a;

    /* renamed from: b */
    private static boolean f1294b;

    /* renamed from: a */
    public static Drawable m1616a(CompoundButton compoundButton) {
        if (Build.VERSION.SDK_INT >= 23) {
            return compoundButton.getButtonDrawable();
        }
        if (!f1294b) {
            try {
                f1293a = CompoundButton.class.getDeclaredField("mButtonDrawable");
                f1293a.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.i("CompoundButtonCompat", "Failed to retrieve mButtonDrawable field", e2);
            }
            f1294b = true;
        }
        Field field = f1293a;
        if (field != null) {
            try {
                return (Drawable) field.get(compoundButton);
            } catch (IllegalAccessException e3) {
                Log.i("CompoundButtonCompat", "Failed to get button drawable via reflection", e3);
                f1293a = null;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static void m1617a(CompoundButton compoundButton, ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 21) {
            compoundButton.setButtonTintList(colorStateList);
        } else if (compoundButton instanceof InterfaceC0275E) {
            ((InterfaceC0275E) compoundButton).setSupportButtonTintList(colorStateList);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static void m1618a(CompoundButton compoundButton, PorterDuff.Mode mode) {
        if (Build.VERSION.SDK_INT >= 21) {
            compoundButton.setButtonTintMode(mode);
        } else if (compoundButton instanceof InterfaceC0275E) {
            ((InterfaceC0275E) compoundButton).setSupportButtonTintMode(mode);
        }
    }
}
