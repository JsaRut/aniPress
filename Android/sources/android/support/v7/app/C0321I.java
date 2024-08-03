package android.support.v7.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.support.v7.app.AbstractC0322a;
import android.support.v7.view.menu.C0366l;
import android.support.v7.widget.ActionBarContainer;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.ActionBarOverlayLayout;
import android.support.v7.widget.C0437aa;
import android.support.v7.widget.InterfaceC0411L;
import android.support.v7.widget.Toolbar;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import p000a.p005b.p009c.p019h.C0074H;
import p000a.p005b.p009c.p019h.C0107v;
import p000a.p005b.p009c.p019h.InterfaceC0075I;
import p000a.p005b.p009c.p019h.InterfaceC0077K;
import p000a.p005b.p022d.p023a.C0112a;
import p000a.p005b.p022d.p023a.C0117f;
import p000a.p005b.p022d.p023a.C0121j;
import p000a.p005b.p022d.p029e.AbstractC0131b;
import p000a.p005b.p022d.p029e.C0130a;
import p000a.p005b.p022d.p029e.C0136g;
import p000a.p005b.p022d.p029e.C0138i;

/* renamed from: android.support.v7.app.I */
/* loaded from: classes.dex */
public class C0321I extends AbstractC0322a implements ActionBarOverlayLayout.InterfaceC0383a {

    /* renamed from: a */
    private static final Interpolator f1507a = new AccelerateInterpolator();

    /* renamed from: b */
    private static final Interpolator f1508b = new DecelerateInterpolator();

    /* renamed from: B */
    C0138i f1510B;

    /* renamed from: C */
    private boolean f1511C;

    /* renamed from: D */
    boolean f1512D;

    /* renamed from: c */
    Context f1516c;

    /* renamed from: d */
    private Context f1517d;

    /* renamed from: e */
    private Activity f1518e;

    /* renamed from: f */
    private Dialog f1519f;

    /* renamed from: g */
    ActionBarOverlayLayout f1520g;

    /* renamed from: h */
    ActionBarContainer f1521h;

    /* renamed from: i */
    InterfaceC0411L f1522i;

    /* renamed from: j */
    ActionBarContextView f1523j;

    /* renamed from: k */
    View f1524k;

    /* renamed from: l */
    C0437aa f1525l;

    /* renamed from: o */
    private boolean f1528o;

    /* renamed from: p */
    a f1529p;

    /* renamed from: q */
    AbstractC0131b f1530q;

    /* renamed from: r */
    AbstractC0131b.a f1531r;

    /* renamed from: s */
    private boolean f1532s;

    /* renamed from: u */
    private boolean f1534u;

    /* renamed from: x */
    boolean f1537x;

    /* renamed from: y */
    boolean f1538y;

    /* renamed from: z */
    private boolean f1539z;

    /* renamed from: m */
    private ArrayList<Object> f1526m = new ArrayList<>();

    /* renamed from: n */
    private int f1527n = -1;

    /* renamed from: t */
    private ArrayList<AbstractC0322a.b> f1533t = new ArrayList<>();

    /* renamed from: v */
    private int f1535v = 0;

    /* renamed from: w */
    boolean f1536w = true;

    /* renamed from: A */
    private boolean f1509A = true;

    /* renamed from: E */
    final InterfaceC0075I f1513E = new C0318F(this);

    /* renamed from: F */
    final InterfaceC0075I f1514F = new C0319G(this);

    /* renamed from: G */
    final InterfaceC0077K f1515G = new C0320H(this);

    /* renamed from: android.support.v7.app.I$a */
    /* loaded from: classes.dex */
    public class a extends AbstractC0131b implements C0366l.a {

        /* renamed from: c */
        private final Context f1540c;

        /* renamed from: d */
        private final C0366l f1541d;

        /* renamed from: e */
        private AbstractC0131b.a f1542e;

        /* renamed from: f */
        private WeakReference<View> f1543f;

        public a(Context context, AbstractC0131b.a aVar) {
            this.f1540c = context;
            this.f1542e = aVar;
            C0366l c0366l = new C0366l(context);
            c0366l.m2028c(1);
            this.f1541d = c0366l;
            this.f1541d.mo1945a(this);
        }

        @Override // p000a.p005b.p022d.p029e.AbstractC0131b
        /* renamed from: a */
        public void mo625a() {
            C0321I c0321i = C0321I.this;
            if (c0321i.f1529p != this) {
                return;
            }
            if (C0321I.m1766a(c0321i.f1537x, c0321i.f1538y, false)) {
                this.f1542e.mo642a(this);
            } else {
                C0321I c0321i2 = C0321I.this;
                c0321i2.f1530q = this;
                c0321i2.f1531r = this.f1542e;
            }
            this.f1542e = null;
            C0321I.this.m1788e(false);
            C0321I.this.f1523j.m2106a();
            C0321I.this.f1522i.mo2186j().sendAccessibilityEvent(32);
            C0321I c0321i3 = C0321I.this;
            c0321i3.f1520g.setHideOnContentScrollEnabled(c0321i3.f1512D);
            C0321I.this.f1529p = null;
        }

        @Override // p000a.p005b.p022d.p029e.AbstractC0131b
        /* renamed from: a */
        public void mo626a(int i) {
            mo628a((CharSequence) C0321I.this.f1516c.getResources().getString(i));
        }

        @Override // android.support.v7.view.menu.C0366l.a
        /* renamed from: a */
        public void mo650a(C0366l c0366l) {
            if (this.f1542e == null) {
                return;
            }
            mo640i();
            C0321I.this.f1523j.m2110d();
        }

        @Override // p000a.p005b.p022d.p029e.AbstractC0131b
        /* renamed from: a */
        public void mo627a(View view) {
            C0321I.this.f1523j.setCustomView(view);
            this.f1543f = new WeakReference<>(view);
        }

        @Override // p000a.p005b.p022d.p029e.AbstractC0131b
        /* renamed from: a */
        public void mo628a(CharSequence charSequence) {
            C0321I.this.f1523j.setSubtitle(charSequence);
        }

        @Override // p000a.p005b.p022d.p029e.AbstractC0131b
        /* renamed from: a */
        public void mo630a(boolean z) {
            super.mo630a(z);
            C0321I.this.f1523j.setTitleOptional(z);
        }

        @Override // android.support.v7.view.menu.C0366l.a
        /* renamed from: a */
        public boolean mo651a(C0366l c0366l, MenuItem menuItem) {
            AbstractC0131b.a aVar = this.f1542e;
            if (aVar != null) {
                return aVar.mo644a(this, menuItem);
            }
            return false;
        }

        @Override // p000a.p005b.p022d.p029e.AbstractC0131b
        /* renamed from: b */
        public View mo631b() {
            WeakReference<View> weakReference = this.f1543f;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // p000a.p005b.p022d.p029e.AbstractC0131b
        /* renamed from: b */
        public void mo632b(int i) {
            mo633b(C0321I.this.f1516c.getResources().getString(i));
        }

        @Override // p000a.p005b.p022d.p029e.AbstractC0131b
        /* renamed from: b */
        public void mo633b(CharSequence charSequence) {
            C0321I.this.f1523j.setTitle(charSequence);
        }

        @Override // p000a.p005b.p022d.p029e.AbstractC0131b
        /* renamed from: c */
        public Menu mo634c() {
            return this.f1541d;
        }

        @Override // p000a.p005b.p022d.p029e.AbstractC0131b
        /* renamed from: d */
        public MenuInflater mo635d() {
            return new C0136g(this.f1540c);
        }

        @Override // p000a.p005b.p022d.p029e.AbstractC0131b
        /* renamed from: e */
        public CharSequence mo636e() {
            return C0321I.this.f1523j.getSubtitle();
        }

        @Override // p000a.p005b.p022d.p029e.AbstractC0131b
        /* renamed from: g */
        public CharSequence mo638g() {
            return C0321I.this.f1523j.getTitle();
        }

        @Override // p000a.p005b.p022d.p029e.AbstractC0131b
        /* renamed from: i */
        public void mo640i() {
            if (C0321I.this.f1529p != this) {
                return;
            }
            this.f1541d.m2045s();
            try {
                this.f1542e.mo645b(this, this.f1541d);
            } finally {
                this.f1541d.m2044r();
            }
        }

        @Override // p000a.p005b.p022d.p029e.AbstractC0131b
        /* renamed from: j */
        public boolean mo641j() {
            return C0321I.this.f1523j.m2108b();
        }

        /* renamed from: k */
        public boolean m1799k() {
            this.f1541d.m2045s();
            try {
                return this.f1542e.mo643a(this, this.f1541d);
            } finally {
                this.f1541d.m2044r();
            }
        }
    }

    public C0321I(Activity activity, boolean z) {
        this.f1518e = activity;
        View decorView = activity.getWindow().getDecorView();
        m1767b(decorView);
        if (z) {
            return;
        }
        this.f1524k = decorView.findViewById(R.id.content);
    }

    public C0321I(Dialog dialog) {
        this.f1519f = dialog;
        m1767b(dialog.getWindow().getDecorView());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private InterfaceC0411L m1765a(View view) {
        if (view instanceof InterfaceC0411L) {
            return (InterfaceC0411L) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't make a decor toolbar out of ");
        sb.append(view != 0 ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: a */
    static boolean m1766a(boolean z, boolean z2, boolean z3) {
        if (z3) {
            return true;
        }
        return (z || z2) ? false : true;
    }

    /* renamed from: b */
    private void m1767b(View view) {
        this.f1520g = (ActionBarOverlayLayout) view.findViewById(C0117f.decor_content_parent);
        ActionBarOverlayLayout actionBarOverlayLayout = this.f1520g;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f1522i = m1765a(view.findViewById(C0117f.action_bar));
        this.f1523j = (ActionBarContextView) view.findViewById(C0117f.action_context_bar);
        this.f1521h = (ActionBarContainer) view.findViewById(C0117f.action_bar_container);
        InterfaceC0411L interfaceC0411L = this.f1522i;
        if (interfaceC0411L == null || this.f1523j == null || this.f1521h == null) {
            throw new IllegalStateException(C0321I.class.getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f1516c = interfaceC0411L.mo2187k();
        boolean z = (this.f1522i.mo2188l() & 4) != 0;
        if (z) {
            this.f1528o = true;
        }
        C0130a m617a = C0130a.m617a(this.f1516c);
        m1796j(m617a.m618a() || z);
        m1768k(m617a.m623f());
        TypedArray obtainStyledAttributes = this.f1516c.obtainStyledAttributes(null, C0121j.ActionBar, C0112a.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(C0121j.ActionBar_hideOnContentScroll, false)) {
            m1795i(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C0121j.ActionBar_elevation, 0);
        if (dimensionPixelSize != 0) {
            m1775a(dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: k */
    private void m1768k(boolean z) {
        this.f1534u = z;
        if (this.f1534u) {
            this.f1521h.setTabContainer(null);
            this.f1522i.mo2164a(this.f1525l);
        } else {
            this.f1522i.mo2164a((C0437aa) null);
            this.f1521h.setTabContainer(this.f1525l);
        }
        boolean z2 = m1798m() == 2;
        C0437aa c0437aa = this.f1525l;
        if (c0437aa != null) {
            if (z2) {
                c0437aa.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f1520g;
                if (actionBarOverlayLayout != null) {
                    C0107v.m533u(actionBarOverlayLayout);
                }
            } else {
                c0437aa.setVisibility(8);
            }
        }
        this.f1522i.mo2174b(!this.f1534u && z2);
        this.f1520g.setHasNonEmbeddedTabs(!this.f1534u && z2);
    }

    /* renamed from: l */
    private void m1769l(boolean z) {
        if (m1766a(this.f1537x, this.f1538y, this.f1539z)) {
            if (this.f1509A) {
                return;
            }
            this.f1509A = true;
            m1792g(z);
            return;
        }
        if (this.f1509A) {
            this.f1509A = false;
            m1789f(z);
        }
    }

    /* renamed from: n */
    private void m1770n() {
        if (this.f1539z) {
            this.f1539z = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f1520g;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            m1769l(false);
        }
    }

    /* renamed from: o */
    private boolean m1771o() {
        return C0107v.m530r(this.f1521h);
    }

    /* renamed from: p */
    private void m1772p() {
        if (this.f1539z) {
            return;
        }
        this.f1539z = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f1520g;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setShowingForActionMode(true);
        }
        m1769l(false);
    }

    @Override // android.support.v7.app.AbstractC0322a
    /* renamed from: a */
    public AbstractC0131b mo1773a(AbstractC0131b.a aVar) {
        a aVar2 = this.f1529p;
        if (aVar2 != null) {
            aVar2.mo625a();
        }
        this.f1520g.setHideOnContentScrollEnabled(false);
        this.f1523j.m2109c();
        a aVar3 = new a(this.f1523j.getContext(), aVar);
        if (!aVar3.m1799k()) {
            return null;
        }
        this.f1529p = aVar3;
        aVar3.mo640i();
        this.f1523j.m2107a(aVar3);
        m1788e(true);
        this.f1523j.sendAccessibilityEvent(32);
        return aVar3;
    }

    @Override // android.support.v7.widget.ActionBarOverlayLayout.InterfaceC0383a
    /* renamed from: a */
    public void mo1774a() {
        if (this.f1538y) {
            this.f1538y = false;
            m1769l(true);
        }
    }

    /* renamed from: a */
    public void m1775a(float f) {
        C0107v.m493a(this.f1521h, f);
    }

    @Override // android.support.v7.widget.ActionBarOverlayLayout.InterfaceC0383a
    /* renamed from: a */
    public void mo1776a(int i) {
        this.f1535v = i;
    }

    /* renamed from: a */
    public void m1777a(int i, int i2) {
        int mo2188l = this.f1522i.mo2188l();
        if ((i2 & 4) != 0) {
            this.f1528o = true;
        }
        this.f1522i.mo2162a((i & i2) | ((i2 ^ (-1)) & mo2188l));
    }

    @Override // android.support.v7.app.AbstractC0322a
    /* renamed from: a */
    public void mo1778a(Configuration configuration) {
        m1768k(C0130a.m617a(this.f1516c).m623f());
    }

    @Override // android.support.v7.app.AbstractC0322a
    /* renamed from: a */
    public void mo1779a(CharSequence charSequence) {
        this.f1522i.setWindowTitle(charSequence);
    }

    @Override // android.support.v7.widget.ActionBarOverlayLayout.InterfaceC0383a
    /* renamed from: a */
    public void mo1780a(boolean z) {
        this.f1536w = z;
    }

    @Override // android.support.v7.app.AbstractC0322a
    /* renamed from: a */
    public boolean mo1781a(int i, KeyEvent keyEvent) {
        Menu mo634c;
        a aVar = this.f1529p;
        if (aVar == null || (mo634c = aVar.mo634c()) == null) {
            return false;
        }
        mo634c.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return mo634c.performShortcut(i, keyEvent, 0);
    }

    @Override // android.support.v7.widget.ActionBarOverlayLayout.InterfaceC0383a
    /* renamed from: b */
    public void mo1782b() {
    }

    @Override // android.support.v7.app.AbstractC0322a
    /* renamed from: b */
    public void mo1783b(boolean z) {
        if (z == this.f1532s) {
            return;
        }
        this.f1532s = z;
        int size = this.f1533t.size();
        for (int i = 0; i < size; i++) {
            this.f1533t.get(i).onMenuVisibilityChanged(z);
        }
    }

    @Override // android.support.v7.widget.ActionBarOverlayLayout.InterfaceC0383a
    /* renamed from: c */
    public void mo1784c() {
        if (this.f1538y) {
            return;
        }
        this.f1538y = true;
        m1769l(true);
    }

    @Override // android.support.v7.app.AbstractC0322a
    /* renamed from: c */
    public void mo1785c(boolean z) {
        if (this.f1528o) {
            return;
        }
        m1794h(z);
    }

    @Override // android.support.v7.widget.ActionBarOverlayLayout.InterfaceC0383a
    /* renamed from: d */
    public void mo1786d() {
        C0138i c0138i = this.f1510B;
        if (c0138i != null) {
            c0138i.m672a();
            this.f1510B = null;
        }
    }

    @Override // android.support.v7.app.AbstractC0322a
    /* renamed from: d */
    public void mo1787d(boolean z) {
        C0138i c0138i;
        this.f1511C = z;
        if (z || (c0138i = this.f1510B) == null) {
            return;
        }
        c0138i.m672a();
    }

    /* renamed from: e */
    public void m1788e(boolean z) {
        C0074H mo2161a;
        C0074H mo2105a;
        if (z) {
            m1772p();
        } else {
            m1770n();
        }
        if (!m1771o()) {
            if (z) {
                this.f1522i.mo2175c(4);
                this.f1523j.setVisibility(0);
                return;
            } else {
                this.f1522i.mo2175c(0);
                this.f1523j.setVisibility(8);
                return;
            }
        }
        if (z) {
            mo2105a = this.f1522i.mo2161a(4, 100L);
            mo2161a = this.f1523j.mo2105a(0, 200L);
        } else {
            mo2161a = this.f1522i.mo2161a(0, 200L);
            mo2105a = this.f1523j.mo2105a(8, 100L);
        }
        C0138i c0138i = new C0138i();
        c0138i.m669a(mo2105a, mo2161a);
        c0138i.m674c();
    }

    /* renamed from: f */
    public void m1789f(boolean z) {
        View view;
        C0138i c0138i = this.f1510B;
        if (c0138i != null) {
            c0138i.m672a();
        }
        if (this.f1535v != 0 || (!this.f1511C && !z)) {
            this.f1513E.mo349b(null);
            return;
        }
        this.f1521h.setAlpha(1.0f);
        this.f1521h.setTransitioning(true);
        C0138i c0138i2 = new C0138i();
        float f = -this.f1521h.getHeight();
        if (z) {
            this.f1521h.getLocationInWindow(new int[]{0, 0});
            f -= r5[1];
        }
        C0074H m490a = C0107v.m490a(this.f1521h);
        m490a.m345b(f);
        m490a.m341a(this.f1515G);
        c0138i2.m668a(m490a);
        if (this.f1536w && (view = this.f1524k) != null) {
            C0074H m490a2 = C0107v.m490a(view);
            m490a2.m345b(f);
            c0138i2.m668a(m490a2);
        }
        c0138i2.m671a(f1507a);
        c0138i2.m667a(250L);
        c0138i2.m670a(this.f1513E);
        this.f1510B = c0138i2;
        c0138i2.m674c();
    }

    @Override // android.support.v7.app.AbstractC0322a
    /* renamed from: f */
    public boolean mo1790f() {
        InterfaceC0411L interfaceC0411L = this.f1522i;
        if (interfaceC0411L == null || !interfaceC0411L.mo2184h()) {
            return false;
        }
        this.f1522i.collapseActionView();
        return true;
    }

    @Override // android.support.v7.app.AbstractC0322a
    /* renamed from: g */
    public int mo1791g() {
        return this.f1522i.mo2188l();
    }

    /* renamed from: g */
    public void m1792g(boolean z) {
        View view;
        View view2;
        C0138i c0138i = this.f1510B;
        if (c0138i != null) {
            c0138i.m672a();
        }
        this.f1521h.setVisibility(0);
        if (this.f1535v == 0 && (this.f1511C || z)) {
            this.f1521h.setTranslationY(0.0f);
            float f = -this.f1521h.getHeight();
            if (z) {
                this.f1521h.getLocationInWindow(new int[]{0, 0});
                f -= r5[1];
            }
            this.f1521h.setTranslationY(f);
            C0138i c0138i2 = new C0138i();
            C0074H m490a = C0107v.m490a(this.f1521h);
            m490a.m345b(0.0f);
            m490a.m341a(this.f1515G);
            c0138i2.m668a(m490a);
            if (this.f1536w && (view2 = this.f1524k) != null) {
                view2.setTranslationY(f);
                C0074H m490a2 = C0107v.m490a(this.f1524k);
                m490a2.m345b(0.0f);
                c0138i2.m668a(m490a2);
            }
            c0138i2.m671a(f1508b);
            c0138i2.m667a(250L);
            c0138i2.m670a(this.f1514F);
            this.f1510B = c0138i2;
            c0138i2.m674c();
        } else {
            this.f1521h.setAlpha(1.0f);
            this.f1521h.setTranslationY(0.0f);
            if (this.f1536w && (view = this.f1524k) != null) {
                view.setTranslationY(0.0f);
            }
            this.f1514F.mo349b(null);
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f1520g;
        if (actionBarOverlayLayout != null) {
            C0107v.m533u(actionBarOverlayLayout);
        }
    }

    @Override // android.support.v7.app.AbstractC0322a
    /* renamed from: h */
    public Context mo1793h() {
        if (this.f1517d == null) {
            TypedValue typedValue = new TypedValue();
            this.f1516c.getTheme().resolveAttribute(C0112a.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f1517d = new ContextThemeWrapper(this.f1516c, i);
            } else {
                this.f1517d = this.f1516c;
            }
        }
        return this.f1517d;
    }

    /* renamed from: h */
    public void m1794h(boolean z) {
        m1777a(z ? 4 : 0, 4);
    }

    /* renamed from: i */
    public void m1795i(boolean z) {
        if (z && !this.f1520g.m2129i()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        }
        this.f1512D = z;
        this.f1520g.setHideOnContentScrollEnabled(z);
    }

    /* renamed from: j */
    public void m1796j(boolean z) {
        this.f1522i.mo2168a(z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public void m1797l() {
        AbstractC0131b.a aVar = this.f1531r;
        if (aVar != null) {
            aVar.mo642a(this.f1530q);
            this.f1530q = null;
            this.f1531r = null;
        }
    }

    /* renamed from: m */
    public int m1798m() {
        return this.f1522i.mo2185i();
    }
}
