package android.support.v7.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.graphics.drawable.C0220a;
import android.support.v7.view.menu.InterfaceC0377w;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import p000a.p005b.p009c.p013c.p014a.InterfaceMenuItemC0047b;
import p000a.p005b.p009c.p019h.AbstractC0090e;
import p000a.p005b.p022d.p023a.C0119h;
import p000a.p005b.p022d.p024b.p025a.C0122a;

/* renamed from: android.support.v7.view.menu.p */
/* loaded from: classes.dex */
public final class C0370p implements InterfaceMenuItemC0047b {

    /* renamed from: A */
    private View f1844A;

    /* renamed from: B */
    private AbstractC0090e f1845B;

    /* renamed from: C */
    private MenuItem.OnActionExpandListener f1846C;

    /* renamed from: E */
    private ContextMenu.ContextMenuInfo f1848E;

    /* renamed from: a */
    private final int f1849a;

    /* renamed from: b */
    private final int f1850b;

    /* renamed from: c */
    private final int f1851c;

    /* renamed from: d */
    private final int f1852d;

    /* renamed from: e */
    private CharSequence f1853e;

    /* renamed from: f */
    private CharSequence f1854f;

    /* renamed from: g */
    private Intent f1855g;

    /* renamed from: h */
    private char f1856h;

    /* renamed from: j */
    private char f1858j;

    /* renamed from: l */
    private Drawable f1860l;

    /* renamed from: n */
    C0366l f1862n;

    /* renamed from: o */
    private SubMenuC0353D f1863o;

    /* renamed from: p */
    private Runnable f1864p;

    /* renamed from: q */
    private MenuItem.OnMenuItemClickListener f1865q;

    /* renamed from: r */
    private CharSequence f1866r;

    /* renamed from: s */
    private CharSequence f1867s;

    /* renamed from: z */
    private int f1874z;

    /* renamed from: i */
    private int f1857i = 4096;

    /* renamed from: k */
    private int f1859k = 4096;

    /* renamed from: m */
    private int f1861m = 0;

    /* renamed from: t */
    private ColorStateList f1868t = null;

    /* renamed from: u */
    private PorterDuff.Mode f1869u = null;

    /* renamed from: v */
    private boolean f1870v = false;

    /* renamed from: w */
    private boolean f1871w = false;

    /* renamed from: x */
    private boolean f1872x = false;

    /* renamed from: y */
    private int f1873y = 16;

    /* renamed from: D */
    private boolean f1847D = false;

    public C0370p(C0366l c0366l, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f1874z = 0;
        this.f1862n = c0366l;
        this.f1849a = i2;
        this.f1850b = i;
        this.f1851c = i3;
        this.f1852d = i4;
        this.f1853e = charSequence;
        this.f1874z = i5;
    }

    /* renamed from: a */
    private Drawable m2048a(Drawable drawable) {
        if (drawable != null && this.f1872x && (this.f1870v || this.f1871w)) {
            drawable = C0220a.m1209h(drawable).mutate();
            if (this.f1870v) {
                C0220a.m1195a(drawable, this.f1868t);
            }
            if (this.f1871w) {
                C0220a.m1198a(drawable, this.f1869u);
            }
            this.f1872x = false;
        }
        return drawable;
    }

    /* renamed from: a */
    private static void m2049a(StringBuilder sb, int i, int i2, String str) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    @Override // p000a.p005b.p009c.p013c.p014a.InterfaceMenuItemC0047b
    /* renamed from: a */
    public InterfaceMenuItemC0047b mo229a(AbstractC0090e abstractC0090e) {
        AbstractC0090e abstractC0090e2 = this.f1845B;
        if (abstractC0090e2 != null) {
            abstractC0090e2.m428f();
        }
        this.f1844A = null;
        this.f1845B = abstractC0090e;
        this.f1862n.m2027b(true);
        AbstractC0090e abstractC0090e3 = this.f1845B;
        if (abstractC0090e3 != null) {
            abstractC0090e3.mo421a(new C0369o(this));
        }
        return this;
    }

    @Override // p000a.p005b.p009c.p013c.p014a.InterfaceMenuItemC0047b
    /* renamed from: a */
    public AbstractC0090e mo230a() {
        return this.f1845B;
    }

    /* renamed from: a */
    public CharSequence m2050a(InterfaceC0377w.a aVar) {
        return (aVar == null || !aVar.mo1923c()) ? getTitle() : getTitleCondensed();
    }

    /* renamed from: a */
    public void m2051a(SubMenuC0353D subMenuC0353D) {
        this.f1863o = subMenuC0353D;
        subMenuC0353D.setHeaderTitle(getTitle());
    }

    /* renamed from: a */
    public void m2052a(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.f1848E = contextMenuInfo;
    }

    /* renamed from: a */
    public void m2053a(boolean z) {
        this.f1847D = z;
        this.f1862n.m2027b(false);
    }

    /* renamed from: b */
    public void m2054b() {
        this.f1862n.m2030c(this);
    }

    /* renamed from: b */
    public void m2055b(boolean z) {
        int i = this.f1873y;
        this.f1873y = (z ? 2 : 0) | (i & (-3));
        if (i != this.f1873y) {
            this.f1862n.m2027b(false);
        }
    }

    /* renamed from: c */
    public int m2056c() {
        return this.f1852d;
    }

    /* renamed from: c */
    public void m2057c(boolean z) {
        this.f1873y = (z ? 4 : 0) | (this.f1873y & (-5));
    }

    @Override // p000a.p005b.p009c.p013c.p014a.InterfaceMenuItemC0047b, android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.f1874z & 8) == 0) {
            return false;
        }
        if (this.f1844A == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f1846C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f1862n.mo1947a(this);
        }
        return false;
    }

    /* renamed from: d */
    public char m2058d() {
        return this.f1862n.mo1952p() ? this.f1858j : this.f1856h;
    }

    /* renamed from: d */
    public void m2059d(boolean z) {
        this.f1873y = z ? this.f1873y | 32 : this.f1873y & (-33);
    }

    /* renamed from: e */
    public String m2060e() {
        int i;
        char m2058d = m2058d();
        if (m2058d == 0) {
            return "";
        }
        Resources resources = this.f1862n.m2034e().getResources();
        StringBuilder sb = new StringBuilder();
        if (ViewConfiguration.get(this.f1862n.m2034e()).hasPermanentMenuKey()) {
            sb.append(resources.getString(C0119h.abc_prepend_shortcut_label));
        }
        int i2 = this.f1862n.mo1952p() ? this.f1859k : this.f1857i;
        m2049a(sb, i2, 65536, resources.getString(C0119h.abc_menu_meta_shortcut_label));
        m2049a(sb, i2, 4096, resources.getString(C0119h.abc_menu_ctrl_shortcut_label));
        m2049a(sb, i2, 2, resources.getString(C0119h.abc_menu_alt_shortcut_label));
        m2049a(sb, i2, 1, resources.getString(C0119h.abc_menu_shift_shortcut_label));
        m2049a(sb, i2, 4, resources.getString(C0119h.abc_menu_sym_shortcut_label));
        m2049a(sb, i2, 8, resources.getString(C0119h.abc_menu_function_shortcut_label));
        if (m2058d == '\b') {
            i = C0119h.abc_menu_delete_shortcut_label;
        } else if (m2058d == '\n') {
            i = C0119h.abc_menu_enter_shortcut_label;
        } else {
            if (m2058d != ' ') {
                sb.append(m2058d);
                return sb.toString();
            }
            i = C0119h.abc_menu_space_shortcut_label;
        }
        sb.append(resources.getString(i));
        return sb.toString();
    }

    /* renamed from: e */
    public boolean m2061e(boolean z) {
        int i = this.f1873y;
        this.f1873y = (z ? 0 : 8) | (i & (-9));
        return i != this.f1873y;
    }

    @Override // p000a.p005b.p009c.p013c.p014a.InterfaceMenuItemC0047b, android.view.MenuItem
    public boolean expandActionView() {
        if (!m2062f()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f1846C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f1862n.mo1948b(this);
        }
        return false;
    }

    /* renamed from: f */
    public boolean m2062f() {
        AbstractC0090e abstractC0090e;
        if ((this.f1874z & 8) == 0) {
            return false;
        }
        if (this.f1844A == null && (abstractC0090e = this.f1845B) != null) {
            this.f1844A = abstractC0090e.mo419a(this);
        }
        return this.f1844A != null;
    }

    /* renamed from: g */
    public boolean m2063g() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f1865q;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        C0366l c0366l = this.f1862n;
        if (c0366l.mo1946a(c0366l, this)) {
            return true;
        }
        Runnable runnable = this.f1864p;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f1855g != null) {
            try {
                this.f1862n.m2034e().startActivity(this.f1855g);
                return true;
            } catch (ActivityNotFoundException e2) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e2);
            }
        }
        AbstractC0090e abstractC0090e = this.f1845B;
        return abstractC0090e != null && abstractC0090e.mo426d();
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // p000a.p005b.p009c.p013c.p014a.InterfaceMenuItemC0047b, android.view.MenuItem
    public View getActionView() {
        View view = this.f1844A;
        if (view != null) {
            return view;
        }
        AbstractC0090e abstractC0090e = this.f1845B;
        if (abstractC0090e == null) {
            return null;
        }
        this.f1844A = abstractC0090e.mo419a(this);
        return this.f1844A;
    }

    @Override // p000a.p005b.p009c.p013c.p014a.InterfaceMenuItemC0047b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f1859k;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f1858j;
    }

    @Override // p000a.p005b.p009c.p013c.p014a.InterfaceMenuItemC0047b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f1866r;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f1850b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable = this.f1860l;
        if (drawable != null) {
            return m2048a(drawable);
        }
        if (this.f1861m == 0) {
            return null;
        }
        Drawable m550b = C0122a.m550b(this.f1862n.m2034e(), this.f1861m);
        this.f1861m = 0;
        this.f1860l = m550b;
        return m2048a(m550b);
    }

    @Override // p000a.p005b.p009c.p013c.p014a.InterfaceMenuItemC0047b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f1868t;
    }

    @Override // p000a.p005b.p009c.p013c.p014a.InterfaceMenuItemC0047b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f1869u;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f1855g;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.f1849a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f1848E;
    }

    @Override // p000a.p005b.p009c.p013c.p014a.InterfaceMenuItemC0047b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f1857i;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f1856h;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f1851c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.f1863o;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.f1853e;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f1854f;
        if (charSequence == null) {
            charSequence = this.f1853e;
        }
        return (Build.VERSION.SDK_INT >= 18 || charSequence == null || (charSequence instanceof String)) ? charSequence : charSequence.toString();
    }

    @Override // p000a.p005b.p009c.p013c.p014a.InterfaceMenuItemC0047b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f1867s;
    }

    /* renamed from: h */
    public boolean m2064h() {
        return (this.f1873y & 32) == 32;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f1863o != null;
    }

    /* renamed from: i */
    public boolean m2065i() {
        return (this.f1873y & 4) != 0;
    }

    @Override // p000a.p005b.p009c.p013c.p014a.InterfaceMenuItemC0047b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f1847D;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f1873y & 1) == 1;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f1873y & 2) == 2;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f1873y & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        AbstractC0090e abstractC0090e = this.f1845B;
        return (abstractC0090e == null || !abstractC0090e.mo427e()) ? (this.f1873y & 8) == 0 : (this.f1873y & 8) == 0 && this.f1845B.mo424b();
    }

    /* renamed from: j */
    public boolean m2066j() {
        return (this.f1874z & 1) == 1;
    }

    /* renamed from: k */
    public boolean m2067k() {
        return (this.f1874z & 2) == 2;
    }

    /* renamed from: l */
    public boolean m2068l() {
        return this.f1862n.m2041k();
    }

    /* renamed from: m */
    public boolean m2069m() {
        return this.f1862n.mo1953q() && m2058d() != 0;
    }

    /* renamed from: n */
    public boolean m2070n() {
        return (this.f1874z & 4) == 4;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // p000a.p005b.p009c.p013c.p014a.InterfaceMenuItemC0047b, android.view.MenuItem
    public InterfaceMenuItemC0047b setActionView(int i) {
        Context m2034e = this.f1862n.m2034e();
        setActionView(LayoutInflater.from(m2034e).inflate(i, (ViewGroup) new LinearLayout(m2034e), false));
        return this;
    }

    @Override // p000a.p005b.p009c.p013c.p014a.InterfaceMenuItemC0047b, android.view.MenuItem
    public InterfaceMenuItemC0047b setActionView(View view) {
        int i;
        this.f1844A = view;
        this.f1845B = null;
        if (view != null && view.getId() == -1 && (i = this.f1849a) > 0) {
            view.setId(i);
        }
        this.f1862n.m2030c(this);
        return this;
    }

    @Override // p000a.p005b.p009c.p013c.p014a.InterfaceMenuItemC0047b, android.view.MenuItem
    public /* bridge */ /* synthetic */ MenuItem setActionView(int i) {
        setActionView(i);
        return this;
    }

    @Override // p000a.p005b.p009c.p013c.p014a.InterfaceMenuItemC0047b, android.view.MenuItem
    public /* bridge */ /* synthetic */ MenuItem setActionView(View view) {
        setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c2) {
        if (this.f1858j == c2) {
            return this;
        }
        this.f1858j = Character.toLowerCase(c2);
        this.f1862n.m2027b(false);
        return this;
    }

    @Override // p000a.p005b.p009c.p013c.p014a.InterfaceMenuItemC0047b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c2, int i) {
        if (this.f1858j == c2 && this.f1859k == i) {
            return this;
        }
        this.f1858j = Character.toLowerCase(c2);
        this.f1859k = KeyEvent.normalizeMetaState(i);
        this.f1862n.m2027b(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        int i = this.f1873y;
        this.f1873y = (z ? 1 : 0) | (i & (-2));
        if (i != this.f1873y) {
            this.f1862n.m2027b(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        if ((this.f1873y & 4) != 0) {
            this.f1862n.m2018a((MenuItem) this);
        } else {
            m2055b(z);
        }
        return this;
    }

    @Override // p000a.p005b.p009c.p013c.p014a.InterfaceMenuItemC0047b, android.view.MenuItem
    public InterfaceMenuItemC0047b setContentDescription(CharSequence charSequence) {
        this.f1866r = charSequence;
        this.f1862n.m2027b(false);
        return this;
    }

    @Override // android.view.MenuItem
    public /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        this.f1873y = z ? this.f1873y | 16 : this.f1873y & (-17);
        this.f1862n.m2027b(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i) {
        this.f1860l = null;
        this.f1861m = i;
        this.f1872x = true;
        this.f1862n.m2027b(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f1861m = 0;
        this.f1860l = drawable;
        this.f1872x = true;
        this.f1862n.m2027b(false);
        return this;
    }

    @Override // p000a.p005b.p009c.p013c.p014a.InterfaceMenuItemC0047b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f1868t = colorStateList;
        this.f1870v = true;
        this.f1872x = true;
        this.f1862n.m2027b(false);
        return this;
    }

    @Override // p000a.p005b.p009c.p013c.p014a.InterfaceMenuItemC0047b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f1869u = mode;
        this.f1871w = true;
        this.f1872x = true;
        this.f1862n.m2027b(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f1855g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c2) {
        if (this.f1856h == c2) {
            return this;
        }
        this.f1856h = c2;
        this.f1862n.m2027b(false);
        return this;
    }

    @Override // p000a.p005b.p009c.p013c.p014a.InterfaceMenuItemC0047b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c2, int i) {
        if (this.f1856h == c2 && this.f1857i == i) {
            return this;
        }
        this.f1856h = c2;
        this.f1857i = KeyEvent.normalizeMetaState(i);
        this.f1862n.m2027b(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f1846C = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f1865q = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c2, char c3) {
        this.f1856h = c2;
        this.f1858j = Character.toLowerCase(c3);
        this.f1862n.m2027b(false);
        return this;
    }

    @Override // p000a.p005b.p009c.p013c.p014a.InterfaceMenuItemC0047b, android.view.MenuItem
    public MenuItem setShortcut(char c2, char c3, int i, int i2) {
        this.f1856h = c2;
        this.f1857i = KeyEvent.normalizeMetaState(i);
        this.f1858j = Character.toLowerCase(c3);
        this.f1859k = KeyEvent.normalizeMetaState(i2);
        this.f1862n.m2027b(false);
        return this;
    }

    @Override // p000a.p005b.p009c.p013c.p014a.InterfaceMenuItemC0047b, android.view.MenuItem
    public void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f1874z = i;
        this.f1862n.m2030c(this);
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
        setTitle(this.f1862n.m2034e().getString(i));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f1853e = charSequence;
        this.f1862n.m2027b(false);
        SubMenuC0353D subMenuC0353D = this.f1863o;
        if (subMenuC0353D != null) {
            subMenuC0353D.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f1854f = charSequence;
        if (charSequence == null) {
            CharSequence charSequence2 = this.f1853e;
        }
        this.f1862n.m2027b(false);
        return this;
    }

    @Override // p000a.p005b.p009c.p013c.p014a.InterfaceMenuItemC0047b, android.view.MenuItem
    public InterfaceMenuItemC0047b setTooltipText(CharSequence charSequence) {
        this.f1867s = charSequence;
        this.f1862n.m2027b(false);
        return this;
    }

    @Override // android.view.MenuItem
    public /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        if (m2061e(z)) {
            this.f1862n.m2033d(this);
        }
        return this;
    }

    public String toString() {
        CharSequence charSequence = this.f1853e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }
}
