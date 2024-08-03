package android.support.v7.view.menu;

import android.content.Context;
import android.os.Build;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import p000a.p005b.p009c.p013c.p014a.InterfaceMenuC0046a;
import p000a.p005b.p009c.p013c.p014a.InterfaceMenuItemC0047b;
import p000a.p005b.p009c.p013c.p014a.InterfaceSubMenuC0048c;

/* renamed from: android.support.v7.view.menu.x */
/* loaded from: classes.dex */
public final class C0378x {
    /* renamed from: a */
    public static Menu m2093a(Context context, InterfaceMenuC0046a interfaceMenuC0046a) {
        return new MenuC0379y(context, interfaceMenuC0046a);
    }

    /* renamed from: a */
    public static MenuItem m2094a(Context context, InterfaceMenuItemC0047b interfaceMenuItemC0047b) {
        return Build.VERSION.SDK_INT >= 16 ? new C0372r(context, interfaceMenuItemC0047b) : new MenuItemC0371q(context, interfaceMenuItemC0047b);
    }

    /* renamed from: a */
    public static SubMenu m2095a(Context context, InterfaceSubMenuC0048c interfaceSubMenuC0048c) {
        return new SubMenuC0354E(context, interfaceSubMenuC0048c);
    }
}
