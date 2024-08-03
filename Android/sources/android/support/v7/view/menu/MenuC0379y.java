package android.support.v7.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import p000a.p005b.p009c.p013c.p014a.InterfaceMenuC0046a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: android.support.v7.view.menu.y */
/* loaded from: classes.dex */
public class MenuC0379y extends AbstractC0357c<InterfaceMenuC0046a> implements Menu {
    /* JADX INFO: Access modifiers changed from: package-private */
    public MenuC0379y(Context context, InterfaceMenuC0046a interfaceMenuC0046a) {
        super(context, interfaceMenuC0046a);
    }

    @Override // android.view.Menu
    public MenuItem add(int i) {
        return m1977a(((InterfaceMenuC0046a) this.f1757a).add(i));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, int i4) {
        return m1977a(((InterfaceMenuC0046a) this.f1757a).add(i, i2, i3, i4));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return m1977a(((InterfaceMenuC0046a) this.f1757a).add(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return m1977a(((InterfaceMenuC0046a) this.f1757a).add(charSequence));
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int addIntentOptions = ((InterfaceMenuC0046a) this.f1757a).addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr[i5] = m1977a(menuItemArr2[i5]);
            }
        }
        return addIntentOptions;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i) {
        return m1978a(((InterfaceMenuC0046a) this.f1757a).addSubMenu(i));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return m1978a(((InterfaceMenuC0046a) this.f1757a).addSubMenu(i, i2, i3, i4));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return m1978a(((InterfaceMenuC0046a) this.f1757a).addSubMenu(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return m1978a(((InterfaceMenuC0046a) this.f1757a).addSubMenu(charSequence));
    }

    @Override // android.view.Menu
    public void clear() {
        m1980b();
        ((InterfaceMenuC0046a) this.f1757a).clear();
    }

    @Override // android.view.Menu
    public void close() {
        ((InterfaceMenuC0046a) this.f1757a).close();
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i) {
        return m1977a(((InterfaceMenuC0046a) this.f1757a).findItem(i));
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i) {
        return m1977a(((InterfaceMenuC0046a) this.f1757a).getItem(i));
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        return ((InterfaceMenuC0046a) this.f1757a).hasVisibleItems();
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return ((InterfaceMenuC0046a) this.f1757a).isShortcutKey(i, keyEvent);
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i, int i2) {
        return ((InterfaceMenuC0046a) this.f1757a).performIdentifierAction(i, i2);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return ((InterfaceMenuC0046a) this.f1757a).performShortcut(i, keyEvent, i2);
    }

    @Override // android.view.Menu
    public void removeGroup(int i) {
        m1979a(i);
        ((InterfaceMenuC0046a) this.f1757a).removeGroup(i);
    }

    @Override // android.view.Menu
    public void removeItem(int i) {
        m1981b(i);
        ((InterfaceMenuC0046a) this.f1757a).removeItem(i);
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i, boolean z, boolean z2) {
        ((InterfaceMenuC0046a) this.f1757a).setGroupCheckable(i, z, z2);
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i, boolean z) {
        ((InterfaceMenuC0046a) this.f1757a).setGroupEnabled(i, z);
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i, boolean z) {
        ((InterfaceMenuC0046a) this.f1757a).setGroupVisible(i, z);
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        ((InterfaceMenuC0046a) this.f1757a).setQwertyMode(z);
    }

    @Override // android.view.Menu
    public int size() {
        return ((InterfaceMenuC0046a) this.f1757a).size();
    }
}
