package android.support.v7.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.reflect.Method;
import p000a.p005b.p009c.p013c.p014a.InterfaceMenuItemC0047b;
import p000a.p005b.p009c.p019h.AbstractC0090e;
import p000a.p005b.p022d.p029e.InterfaceC0132c;

/* renamed from: android.support.v7.view.menu.q */
/* loaded from: classes.dex */
public class MenuItemC0371q extends AbstractC0357c<InterfaceMenuItemC0047b> implements MenuItem {

    /* renamed from: e */
    private Method f1875e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: android.support.v7.view.menu.q$a */
    /* loaded from: classes.dex */
    public class a extends AbstractC0090e {

        /* renamed from: d */
        final ActionProvider f1876d;

        public a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f1876d = actionProvider;
        }

        @Override // p000a.p005b.p009c.p019h.AbstractC0090e
        /* renamed from: a */
        public void mo422a(SubMenu subMenu) {
            this.f1876d.onPrepareSubMenu(MenuItemC0371q.this.m1978a(subMenu));
        }

        @Override // p000a.p005b.p009c.p019h.AbstractC0090e
        /* renamed from: a */
        public boolean mo423a() {
            return this.f1876d.hasSubMenu();
        }

        @Override // p000a.p005b.p009c.p019h.AbstractC0090e
        /* renamed from: c */
        public View mo425c() {
            return this.f1876d.onCreateActionView();
        }

        @Override // p000a.p005b.p009c.p019h.AbstractC0090e
        /* renamed from: d */
        public boolean mo426d() {
            return this.f1876d.onPerformDefaultAction();
        }
    }

    /* renamed from: android.support.v7.view.menu.q$b */
    /* loaded from: classes.dex */
    static class b extends FrameLayout implements InterfaceC0132c {

        /* renamed from: a */
        final CollapsibleActionView f1878a;

        /* JADX WARN: Multi-variable type inference failed */
        b(View view) {
            super(view.getContext());
            this.f1878a = (CollapsibleActionView) view;
            addView(view);
        }

        /* renamed from: a */
        View m2073a() {
            return (View) this.f1878a;
        }

        @Override // p000a.p005b.p022d.p029e.InterfaceC0132c
        public void onActionViewCollapsed() {
            this.f1878a.onActionViewCollapsed();
        }

        @Override // p000a.p005b.p022d.p029e.InterfaceC0132c
        public void onActionViewExpanded() {
            this.f1878a.onActionViewExpanded();
        }
    }

    /* renamed from: android.support.v7.view.menu.q$c */
    /* loaded from: classes.dex */
    private class c extends C0358d<MenuItem.OnActionExpandListener> implements MenuItem.OnActionExpandListener {
        c(MenuItem.OnActionExpandListener onActionExpandListener) {
            super(onActionExpandListener);
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return ((MenuItem.OnActionExpandListener) this.f1757a).onMenuItemActionCollapse(MenuItemC0371q.this.m1977a(menuItem));
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return ((MenuItem.OnActionExpandListener) this.f1757a).onMenuItemActionExpand(MenuItemC0371q.this.m1977a(menuItem));
        }
    }

    /* renamed from: android.support.v7.view.menu.q$d */
    /* loaded from: classes.dex */
    private class d extends C0358d<MenuItem.OnMenuItemClickListener> implements MenuItem.OnMenuItemClickListener {
        d(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            super(onMenuItemClickListener);
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            return ((MenuItem.OnMenuItemClickListener) this.f1757a).onMenuItemClick(MenuItemC0371q.this.m1977a(menuItem));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public MenuItemC0371q(Context context, InterfaceMenuItemC0047b interfaceMenuItemC0047b) {
        super(context, interfaceMenuItemC0047b);
    }

    /* renamed from: a */
    a mo2071a(ActionProvider actionProvider) {
        return new a(this.f1754b, actionProvider);
    }

    /* renamed from: a */
    public void m2072a(boolean z) {
        try {
            if (this.f1875e == null) {
                this.f1875e = ((InterfaceMenuItemC0047b) this.f1757a).getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
            }
            this.f1875e.invoke(this.f1757a, Boolean.valueOf(z));
        } catch (Exception e2) {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e2);
        }
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
        return ((InterfaceMenuItemC0047b) this.f1757a).collapseActionView();
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
        return ((InterfaceMenuItemC0047b) this.f1757a).expandActionView();
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        AbstractC0090e mo230a = ((InterfaceMenuItemC0047b) this.f1757a).mo230a();
        if (mo230a instanceof a) {
            return ((a) mo230a).f1876d;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public View getActionView() {
        View actionView = ((InterfaceMenuItemC0047b) this.f1757a).getActionView();
        return actionView instanceof b ? ((b) actionView).m2073a() : actionView;
    }

    @Override // android.view.MenuItem
    public int getAlphabeticModifiers() {
        return ((InterfaceMenuItemC0047b) this.f1757a).getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return ((InterfaceMenuItemC0047b) this.f1757a).getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public CharSequence getContentDescription() {
        return ((InterfaceMenuItemC0047b) this.f1757a).getContentDescription();
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return ((InterfaceMenuItemC0047b) this.f1757a).getGroupId();
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return ((InterfaceMenuItemC0047b) this.f1757a).getIcon();
    }

    @Override // android.view.MenuItem
    public ColorStateList getIconTintList() {
        return ((InterfaceMenuItemC0047b) this.f1757a).getIconTintList();
    }

    @Override // android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return ((InterfaceMenuItemC0047b) this.f1757a).getIconTintMode();
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return ((InterfaceMenuItemC0047b) this.f1757a).getIntent();
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return ((InterfaceMenuItemC0047b) this.f1757a).getItemId();
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return ((InterfaceMenuItemC0047b) this.f1757a).getMenuInfo();
    }

    @Override // android.view.MenuItem
    public int getNumericModifiers() {
        return ((InterfaceMenuItemC0047b) this.f1757a).getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return ((InterfaceMenuItemC0047b) this.f1757a).getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return ((InterfaceMenuItemC0047b) this.f1757a).getOrder();
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return m1978a(((InterfaceMenuItemC0047b) this.f1757a).getSubMenu());
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return ((InterfaceMenuItemC0047b) this.f1757a).getTitle();
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        return ((InterfaceMenuItemC0047b) this.f1757a).getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public CharSequence getTooltipText() {
        return ((InterfaceMenuItemC0047b) this.f1757a).getTooltipText();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return ((InterfaceMenuItemC0047b) this.f1757a).hasSubMenu();
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
        return ((InterfaceMenuItemC0047b) this.f1757a).isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return ((InterfaceMenuItemC0047b) this.f1757a).isCheckable();
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return ((InterfaceMenuItemC0047b) this.f1757a).isChecked();
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return ((InterfaceMenuItemC0047b) this.f1757a).isEnabled();
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return ((InterfaceMenuItemC0047b) this.f1757a).isVisible();
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        ((InterfaceMenuItemC0047b) this.f1757a).mo229a(actionProvider != null ? mo2071a(actionProvider) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(int i) {
        ((InterfaceMenuItemC0047b) this.f1757a).setActionView(i);
        View actionView = ((InterfaceMenuItemC0047b) this.f1757a).getActionView();
        if (actionView instanceof CollapsibleActionView) {
            ((InterfaceMenuItemC0047b) this.f1757a).setActionView(new b(actionView));
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new b(view);
        }
        ((InterfaceMenuItemC0047b) this.f1757a).setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c2) {
        ((InterfaceMenuItemC0047b) this.f1757a).setAlphabeticShortcut(c2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c2, int i) {
        ((InterfaceMenuItemC0047b) this.f1757a).setAlphabeticShortcut(c2, i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        ((InterfaceMenuItemC0047b) this.f1757a).setCheckable(z);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        ((InterfaceMenuItemC0047b) this.f1757a).setChecked(z);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence charSequence) {
        ((InterfaceMenuItemC0047b) this.f1757a).setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        ((InterfaceMenuItemC0047b) this.f1757a).setEnabled(z);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i) {
        ((InterfaceMenuItemC0047b) this.f1757a).setIcon(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        ((InterfaceMenuItemC0047b) this.f1757a).setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        ((InterfaceMenuItemC0047b) this.f1757a).setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        ((InterfaceMenuItemC0047b) this.f1757a).setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        ((InterfaceMenuItemC0047b) this.f1757a).setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c2) {
        ((InterfaceMenuItemC0047b) this.f1757a).setNumericShortcut(c2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c2, int i) {
        ((InterfaceMenuItemC0047b) this.f1757a).setNumericShortcut(c2, i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        ((InterfaceMenuItemC0047b) this.f1757a).setOnActionExpandListener(onActionExpandListener != null ? new c(onActionExpandListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        ((InterfaceMenuItemC0047b) this.f1757a).setOnMenuItemClickListener(onMenuItemClickListener != null ? new d(onMenuItemClickListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c2, char c3) {
        ((InterfaceMenuItemC0047b) this.f1757a).setShortcut(c2, c3);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c2, char c3, int i, int i2) {
        ((InterfaceMenuItemC0047b) this.f1757a).setShortcut(c2, c3, i, i2);
        return this;
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int i) {
        ((InterfaceMenuItemC0047b) this.f1757a).setShowAsAction(i);
    }

    @Override // android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i) {
        ((InterfaceMenuItemC0047b) this.f1757a).setShowAsActionFlags(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i) {
        ((InterfaceMenuItemC0047b) this.f1757a).setTitle(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        ((InterfaceMenuItemC0047b) this.f1757a).setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        ((InterfaceMenuItemC0047b) this.f1757a).setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTooltipText(CharSequence charSequence) {
        ((InterfaceMenuItemC0047b) this.f1757a).setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        return ((InterfaceMenuItemC0047b) this.f1757a).setVisible(z);
    }
}
