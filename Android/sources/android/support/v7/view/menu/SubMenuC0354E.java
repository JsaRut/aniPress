package android.support.v7.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import p000a.p005b.p009c.p013c.p014a.InterfaceSubMenuC0048c;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: android.support.v7.view.menu.E */
/* loaded from: classes.dex */
public class SubMenuC0354E extends MenuC0379y implements SubMenu {
    /* JADX INFO: Access modifiers changed from: package-private */
    public SubMenuC0354E(Context context, InterfaceSubMenuC0048c interfaceSubMenuC0048c) {
        super(context, interfaceSubMenuC0048c);
    }

    /* renamed from: c */
    public InterfaceSubMenuC0048c m1955c() {
        return (InterfaceSubMenuC0048c) this.f1757a;
    }

    @Override // android.view.SubMenu
    public void clearHeader() {
        m1955c().clearHeader();
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return m1977a(m1955c().getItem());
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i) {
        m1955c().setHeaderIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        m1955c().setHeaderIcon(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i) {
        m1955c().setHeaderTitle(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        m1955c().setHeaderTitle(charSequence);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        m1955c().setHeaderView(view);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i) {
        m1955c().setIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        m1955c().setIcon(drawable);
        return this;
    }
}
