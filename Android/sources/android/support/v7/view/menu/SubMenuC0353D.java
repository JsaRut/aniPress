package android.support.v7.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.view.menu.C0366l;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: android.support.v7.view.menu.D */
/* loaded from: classes.dex */
public class SubMenuC0353D extends C0366l implements SubMenu {

    /* renamed from: B */
    private C0366l f1699B;

    /* renamed from: C */
    private C0370p f1700C;

    public SubMenuC0353D(Context context, C0366l c0366l, C0370p c0370p) {
        super(context);
        this.f1699B = c0366l;
        this.f1700C = c0370p;
    }

    @Override // android.support.v7.view.menu.C0366l
    /* renamed from: a */
    public void mo1945a(C0366l.a aVar) {
        this.f1699B.mo1945a(aVar);
    }

    @Override // android.support.v7.view.menu.C0366l
    /* renamed from: a */
    public boolean mo1946a(C0366l c0366l, MenuItem menuItem) {
        return super.mo1946a(c0366l, menuItem) || this.f1699B.mo1946a(c0366l, menuItem);
    }

    @Override // android.support.v7.view.menu.C0366l
    /* renamed from: a */
    public boolean mo1947a(C0370p c0370p) {
        return this.f1699B.mo1947a(c0370p);
    }

    @Override // android.support.v7.view.menu.C0366l
    /* renamed from: b */
    public boolean mo1948b(C0370p c0370p) {
        return this.f1699B.mo1948b(c0370p);
    }

    @Override // android.support.v7.view.menu.C0366l
    /* renamed from: d */
    public String mo1949d() {
        C0370p c0370p = this.f1700C;
        int itemId = c0370p != null ? c0370p.getItemId() : 0;
        if (itemId == 0) {
            return null;
        }
        return super.mo1949d() + ":" + itemId;
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return this.f1700C;
    }

    @Override // android.support.v7.view.menu.C0366l
    /* renamed from: m */
    public C0366l mo1950m() {
        return this.f1699B.mo1950m();
    }

    @Override // android.support.v7.view.menu.C0366l
    /* renamed from: o */
    public boolean mo1951o() {
        return this.f1699B.mo1951o();
    }

    @Override // android.support.v7.view.menu.C0366l
    /* renamed from: p */
    public boolean mo1952p() {
        return this.f1699B.mo1952p();
    }

    @Override // android.support.v7.view.menu.C0366l
    /* renamed from: q */
    public boolean mo1953q() {
        return this.f1699B.mo1953q();
    }

    @Override // android.support.v7.view.menu.C0366l, android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.f1699B.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i) {
        super.m2032d(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        super.m2009a(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i) {
        super.m2035e(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        super.m2011a(charSequence);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        super.m2010a(view);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i) {
        this.f1700C.setIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.f1700C.setIcon(drawable);
        return this;
    }

    @Override // android.support.v7.view.menu.C0366l, android.view.Menu
    public void setQwertyMode(boolean z) {
        this.f1699B.setQwertyMode(z);
    }

    /* renamed from: t */
    public Menu m1954t() {
        return this.f1699B;
    }
}
