package android.support.v7.view.menu;

import android.content.Context;
import android.support.v4.util.C0256b;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.Iterator;
import java.util.Map;
import p000a.p005b.p009c.p013c.p014a.InterfaceMenuItemC0047b;
import p000a.p005b.p009c.p013c.p014a.InterfaceSubMenuC0048c;

/* renamed from: android.support.v7.view.menu.c */
/* loaded from: classes.dex */
abstract class AbstractC0357c<T> extends C0358d<T> {

    /* renamed from: b */
    final Context f1754b;

    /* renamed from: c */
    private Map<InterfaceMenuItemC0047b, MenuItem> f1755c;

    /* renamed from: d */
    private Map<InterfaceSubMenuC0048c, SubMenu> f1756d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0357c(Context context, T t) {
        super(t);
        this.f1754b = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final MenuItem m1977a(MenuItem menuItem) {
        if (!(menuItem instanceof InterfaceMenuItemC0047b)) {
            return menuItem;
        }
        InterfaceMenuItemC0047b interfaceMenuItemC0047b = (InterfaceMenuItemC0047b) menuItem;
        if (this.f1755c == null) {
            this.f1755c = new C0256b();
        }
        MenuItem menuItem2 = this.f1755c.get(menuItem);
        if (menuItem2 != null) {
            return menuItem2;
        }
        MenuItem m2094a = C0378x.m2094a(this.f1754b, interfaceMenuItemC0047b);
        this.f1755c.put(interfaceMenuItemC0047b, m2094a);
        return m2094a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final SubMenu m1978a(SubMenu subMenu) {
        if (!(subMenu instanceof InterfaceSubMenuC0048c)) {
            return subMenu;
        }
        InterfaceSubMenuC0048c interfaceSubMenuC0048c = (InterfaceSubMenuC0048c) subMenu;
        if (this.f1756d == null) {
            this.f1756d = new C0256b();
        }
        SubMenu subMenu2 = this.f1756d.get(interfaceSubMenuC0048c);
        if (subMenu2 != null) {
            return subMenu2;
        }
        SubMenu m2095a = C0378x.m2095a(this.f1754b, interfaceSubMenuC0048c);
        this.f1756d.put(interfaceSubMenuC0048c, m2095a);
        return m2095a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m1979a(int i) {
        Map<InterfaceMenuItemC0047b, MenuItem> map = this.f1755c;
        if (map == null) {
            return;
        }
        Iterator<InterfaceMenuItemC0047b> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (i == it.next().getGroupId()) {
                it.remove();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m1980b() {
        Map<InterfaceMenuItemC0047b, MenuItem> map = this.f1755c;
        if (map != null) {
            map.clear();
        }
        Map<InterfaceSubMenuC0048c, SubMenu> map2 = this.f1756d;
        if (map2 != null) {
            map2.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m1981b(int i) {
        Map<InterfaceMenuItemC0047b, MenuItem> map = this.f1755c;
        if (map == null) {
            return;
        }
        Iterator<InterfaceMenuItemC0047b> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (i == it.next().getItemId()) {
                it.remove();
                return;
            }
        }
    }
}
