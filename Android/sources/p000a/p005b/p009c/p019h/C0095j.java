package p000a.p005b.p009c.p019h;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import p000a.p005b.p009c.p013c.p014a.InterfaceMenuItemC0047b;

/* renamed from: a.b.c.h.j */
/* loaded from: classes.dex */
public final class C0095j {
    /* renamed from: a */
    public static MenuItem m441a(MenuItem menuItem, AbstractC0090e abstractC0090e) {
        if (menuItem instanceof InterfaceMenuItemC0047b) {
            return ((InterfaceMenuItemC0047b) menuItem).mo229a(abstractC0090e);
        }
        Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
        return menuItem;
    }

    /* renamed from: a */
    public static void m442a(MenuItem menuItem, char c2, int i) {
        if (menuItem instanceof InterfaceMenuItemC0047b) {
            ((InterfaceMenuItemC0047b) menuItem).setAlphabeticShortcut(c2, i);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setAlphabeticShortcut(c2, i);
        }
    }

    /* renamed from: a */
    public static void m443a(MenuItem menuItem, ColorStateList colorStateList) {
        if (menuItem instanceof InterfaceMenuItemC0047b) {
            ((InterfaceMenuItemC0047b) menuItem).setIconTintList(colorStateList);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setIconTintList(colorStateList);
        }
    }

    /* renamed from: a */
    public static void m444a(MenuItem menuItem, PorterDuff.Mode mode) {
        if (menuItem instanceof InterfaceMenuItemC0047b) {
            ((InterfaceMenuItemC0047b) menuItem).setIconTintMode(mode);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setIconTintMode(mode);
        }
    }

    /* renamed from: a */
    public static void m445a(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof InterfaceMenuItemC0047b) {
            ((InterfaceMenuItemC0047b) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setContentDescription(charSequence);
        }
    }

    /* renamed from: b */
    public static void m446b(MenuItem menuItem, char c2, int i) {
        if (menuItem instanceof InterfaceMenuItemC0047b) {
            ((InterfaceMenuItemC0047b) menuItem).setNumericShortcut(c2, i);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setNumericShortcut(c2, i);
        }
    }

    /* renamed from: b */
    public static void m447b(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof InterfaceMenuItemC0047b) {
            ((InterfaceMenuItemC0047b) menuItem).setTooltipText(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setTooltipText(charSequence);
        }
    }
}
