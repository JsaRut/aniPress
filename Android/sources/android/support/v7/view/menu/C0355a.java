package android.support.v7.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.v4.graphics.drawable.C0220a;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import p000a.p005b.p009c.p010a.C0022a;
import p000a.p005b.p009c.p013c.p014a.InterfaceMenuItemC0047b;
import p000a.p005b.p009c.p019h.AbstractC0090e;

/* renamed from: android.support.v7.view.menu.a */
/* loaded from: classes.dex */
public class C0355a implements InterfaceMenuItemC0047b {

    /* renamed from: a */
    private final int f1722a;

    /* renamed from: b */
    private final int f1723b;

    /* renamed from: c */
    private final int f1724c;

    /* renamed from: d */
    private final int f1725d;

    /* renamed from: e */
    private CharSequence f1726e;

    /* renamed from: f */
    private CharSequence f1727f;

    /* renamed from: g */
    private Intent f1728g;

    /* renamed from: h */
    private char f1729h;

    /* renamed from: j */
    private char f1731j;

    /* renamed from: l */
    private Drawable f1733l;

    /* renamed from: n */
    private Context f1735n;

    /* renamed from: o */
    private MenuItem.OnMenuItemClickListener f1736o;

    /* renamed from: p */
    private CharSequence f1737p;

    /* renamed from: q */
    private CharSequence f1738q;

    /* renamed from: i */
    private int f1730i = 4096;

    /* renamed from: k */
    private int f1732k = 4096;

    /* renamed from: m */
    private int f1734m = 0;

    /* renamed from: r */
    private ColorStateList f1739r = null;

    /* renamed from: s */
    private PorterDuff.Mode f1740s = null;

    /* renamed from: t */
    private boolean f1741t = false;

    /* renamed from: u */
    private boolean f1742u = false;

    /* renamed from: v */
    private int f1743v = 16;

    public C0355a(Context context, int i, int i2, int i3, int i4, CharSequence charSequence) {
        this.f1735n = context;
        this.f1722a = i2;
        this.f1723b = i;
        this.f1724c = i3;
        this.f1725d = i4;
        this.f1726e = charSequence;
    }

    /* renamed from: b */
    private void m1964b() {
        if (this.f1733l != null) {
            if (this.f1741t || this.f1742u) {
                this.f1733l = C0220a.m1209h(this.f1733l);
                this.f1733l = this.f1733l.mutate();
                if (this.f1741t) {
                    C0220a.m1195a(this.f1733l, this.f1739r);
                }
                if (this.f1742u) {
                    C0220a.m1198a(this.f1733l, this.f1740s);
                }
            }
        }
    }

    @Override // p000a.p005b.p009c.p013c.p014a.InterfaceMenuItemC0047b
    /* renamed from: a */
    public InterfaceMenuItemC0047b mo229a(AbstractC0090e abstractC0090e) {
        throw new UnsupportedOperationException();
    }

    @Override // p000a.p005b.p009c.p013c.p014a.InterfaceMenuItemC0047b
    /* renamed from: a */
    public AbstractC0090e mo230a() {
        return null;
    }

    @Override // p000a.p005b.p009c.p013c.p014a.InterfaceMenuItemC0047b, android.view.MenuItem
    public boolean collapseActionView() {
        return false;
    }

    @Override // p000a.p005b.p009c.p013c.p014a.InterfaceMenuItemC0047b, android.view.MenuItem
    public boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // p000a.p005b.p009c.p013c.p014a.InterfaceMenuItemC0047b, android.view.MenuItem
    public View getActionView() {
        return null;
    }

    @Override // p000a.p005b.p009c.p013c.p014a.InterfaceMenuItemC0047b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f1732k;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f1731j;
    }

    @Override // p000a.p005b.p009c.p013c.p014a.InterfaceMenuItemC0047b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f1737p;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f1723b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f1733l;
    }

    @Override // p000a.p005b.p009c.p013c.p014a.InterfaceMenuItemC0047b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f1739r;
    }

    @Override // p000a.p005b.p009c.p013c.p014a.InterfaceMenuItemC0047b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f1740s;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f1728g;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f1722a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // p000a.p005b.p009c.p013c.p014a.InterfaceMenuItemC0047b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f1730i;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f1729h;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f1725d;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f1726e;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f1727f;
        return charSequence != null ? charSequence : this.f1726e;
    }

    @Override // p000a.p005b.p009c.p013c.p014a.InterfaceMenuItemC0047b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f1738q;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return false;
    }

    @Override // p000a.p005b.p009c.p013c.p014a.InterfaceMenuItemC0047b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f1743v & 1) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f1743v & 2) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f1743v & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.f1743v & 8) == 0;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // p000a.p005b.p009c.p013c.p014a.InterfaceMenuItemC0047b, android.view.MenuItem
    public InterfaceMenuItemC0047b setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // p000a.p005b.p009c.p013c.p014a.InterfaceMenuItemC0047b, android.view.MenuItem
    public InterfaceMenuItemC0047b setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // p000a.p005b.p009c.p013c.p014a.InterfaceMenuItemC0047b, android.view.MenuItem
    public /* bridge */ /* synthetic */ MenuItem setActionView(int i) {
        setActionView(i);
        throw null;
    }

    @Override // p000a.p005b.p009c.p013c.p014a.InterfaceMenuItemC0047b, android.view.MenuItem
    public /* bridge */ /* synthetic */ MenuItem setActionView(View view) {
        setActionView(view);
        throw null;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c2) {
        this.f1731j = Character.toLowerCase(c2);
        return this;
    }

    @Override // p000a.p005b.p009c.p013c.p014a.InterfaceMenuItemC0047b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c2, int i) {
        this.f1731j = Character.toLowerCase(c2);
        this.f1732k = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        this.f1743v = (z ? 1 : 0) | (this.f1743v & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        this.f1743v = (z ? 2 : 0) | (this.f1743v & (-3));
        return this;
    }

    @Override // p000a.p005b.p009c.p013c.p014a.InterfaceMenuItemC0047b, android.view.MenuItem
    public InterfaceMenuItemC0047b setContentDescription(CharSequence charSequence) {
        this.f1737p = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        this.f1743v = (z ? 16 : 0) | (this.f1743v & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i) {
        this.f1734m = i;
        this.f1733l = C0022a.m92c(this.f1735n, i);
        m1964b();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f1733l = drawable;
        this.f1734m = 0;
        m1964b();
        return this;
    }

    @Override // p000a.p005b.p009c.p013c.p014a.InterfaceMenuItemC0047b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f1739r = colorStateList;
        this.f1741t = true;
        m1964b();
        return this;
    }

    @Override // p000a.p005b.p009c.p013c.p014a.InterfaceMenuItemC0047b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f1740s = mode;
        this.f1742u = true;
        m1964b();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f1728g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c2) {
        this.f1729h = c2;
        return this;
    }

    @Override // p000a.p005b.p009c.p013c.p014a.InterfaceMenuItemC0047b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c2, int i) {
        this.f1729h = c2;
        this.f1730i = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f1736o = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c2, char c3) {
        this.f1729h = c2;
        this.f1731j = Character.toLowerCase(c3);
        return this;
    }

    @Override // p000a.p005b.p009c.p013c.p014a.InterfaceMenuItemC0047b, android.view.MenuItem
    public MenuItem setShortcut(char c2, char c3, int i, int i2) {
        this.f1729h = c2;
        this.f1730i = KeyEvent.normalizeMetaState(i);
        this.f1731j = Character.toLowerCase(c3);
        this.f1732k = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    @Override // p000a.p005b.p009c.p013c.p014a.InterfaceMenuItemC0047b, android.view.MenuItem
    public void setShowAsAction(int i) {
    }

    @Override // p000a.p005b.p009c.p013c.p014a.InterfaceMenuItemC0047b, android.view.MenuItem
    public InterfaceMenuItemC0047b setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // p000a.p005b.p009c.p013c.p014a.InterfaceMenuItemC0047b, android.view.MenuItem
    public /* bridge */ /* synthetic */ MenuItem setShowAsActionFlags(int i) {
        setShowAsActionFlags(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i) {
        this.f1726e = this.f1735n.getResources().getString(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f1726e = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f1727f = charSequence;
        return this;
    }

    @Override // p000a.p005b.p009c.p013c.p014a.InterfaceMenuItemC0047b, android.view.MenuItem
    public InterfaceMenuItemC0047b setTooltipText(CharSequence charSequence) {
        this.f1738q = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        this.f1743v = (this.f1743v & 8) | (z ? 0 : 8);
        return this;
    }
}
