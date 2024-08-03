package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v4.graphics.drawable.C0220a;
import android.support.v7.view.menu.AbstractC0356b;
import android.support.v7.view.menu.ActionMenuItemView;
import android.support.v7.view.menu.C0366l;
import android.support.v7.view.menu.C0370p;
import android.support.v7.view.menu.C0375u;
import android.support.v7.view.menu.InterfaceC0376v;
import android.support.v7.view.menu.InterfaceC0377w;
import android.support.v7.view.menu.InterfaceC0380z;
import android.support.v7.view.menu.SubMenuC0353D;
import android.support.v7.widget.ActionMenuView;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import p000a.p005b.p009c.p019h.AbstractC0090e;
import p000a.p005b.p022d.p023a.C0112a;
import p000a.p005b.p022d.p023a.C0118g;
import p000a.p005b.p022d.p029e.C0130a;

/* renamed from: android.support.v7.widget.g */
/* loaded from: classes.dex */
public class C0448g extends AbstractC0356b implements AbstractC0090e.a {

    /* renamed from: A */
    a f2343A;

    /* renamed from: B */
    c f2344B;

    /* renamed from: C */
    private b f2345C;

    /* renamed from: D */
    final f f2346D;

    /* renamed from: E */
    int f2347E;

    /* renamed from: k */
    d f2348k;

    /* renamed from: l */
    private Drawable f2349l;

    /* renamed from: m */
    private boolean f2350m;

    /* renamed from: n */
    private boolean f2351n;

    /* renamed from: o */
    private boolean f2352o;

    /* renamed from: p */
    private int f2353p;

    /* renamed from: q */
    private int f2354q;

    /* renamed from: r */
    private int f2355r;

    /* renamed from: s */
    private boolean f2356s;

    /* renamed from: t */
    private boolean f2357t;

    /* renamed from: u */
    private boolean f2358u;

    /* renamed from: v */
    private boolean f2359v;

    /* renamed from: w */
    private int f2360w;

    /* renamed from: x */
    private final SparseBooleanArray f2361x;

    /* renamed from: y */
    private View f2362y;

    /* renamed from: z */
    e f2363z;

    /* renamed from: android.support.v7.widget.g$a */
    /* loaded from: classes.dex */
    public class a extends C0375u {
        public a(Context context, SubMenuC0353D subMenuC0353D, View view) {
            super(context, subMenuC0353D, view, false, C0112a.actionOverflowMenuStyle);
            if (!((C0370p) subMenuC0353D.getItem()).m2064h()) {
                View view2 = C0448g.this.f2348k;
                m2084a(view2 == null ? (View) ((AbstractC0356b) C0448g.this).f1752i : view2);
            }
            m2083a(C0448g.this.f2346D);
        }

        @Override // android.support.v7.view.menu.C0375u
        /* renamed from: d */
        public void mo2090d() {
            C0448g c0448g = C0448g.this;
            c0448g.f2343A = null;
            c0448g.f2347E = 0;
            super.mo2090d();
        }
    }

    /* renamed from: android.support.v7.widget.g$b */
    /* loaded from: classes.dex */
    private class b extends ActionMenuItemView.AbstractC0350b {
        b() {
        }

        @Override // android.support.v7.view.menu.ActionMenuItemView.AbstractC0350b
        /* renamed from: a */
        public InterfaceC0380z mo1927a() {
            a aVar = C0448g.this.f2343A;
            if (aVar != null) {
                return aVar.m2088b();
            }
            return null;
        }
    }

    /* renamed from: android.support.v7.widget.g$c */
    /* loaded from: classes.dex */
    public class c implements Runnable {

        /* renamed from: a */
        private e f2366a;

        public c(e eVar) {
            this.f2366a = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (((AbstractC0356b) C0448g.this).f1746c != null) {
                ((AbstractC0356b) C0448g.this).f1746c.m2014a();
            }
            View view = (View) ((AbstractC0356b) C0448g.this).f1752i;
            if (view != null && view.getWindowToken() != null && this.f2366a.m2092f()) {
                C0448g.this.f2363z = this.f2366a;
            }
            C0448g.this.f2344B = null;
        }
    }

    /* renamed from: android.support.v7.widget.g$d */
    /* loaded from: classes.dex */
    public class d extends C0474t implements ActionMenuView.InterfaceC0385a {

        /* renamed from: c */
        private final float[] f2368c;

        public d(Context context) {
            super(context, null, C0112a.actionOverflowButtonStyle);
            this.f2368c = new float[2];
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            C0396Da.m2193a(this, getContentDescription());
            setOnTouchListener(new C0450h(this, this, C0448g.this));
        }

        @Override // android.support.v7.widget.ActionMenuView.InterfaceC0385a
        /* renamed from: a */
        public boolean mo1921a() {
            return false;
        }

        @Override // android.support.v7.widget.ActionMenuView.InterfaceC0385a
        /* renamed from: b */
        public boolean mo1922b() {
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            C0448g.this.m2462i();
            return true;
        }

        @Override // android.widget.ImageView
        protected boolean setFrame(int i, int i2, int i3, int i4) {
            boolean frame = super.setFrame(i, i2, i3, i4);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                C0220a.m1194a(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    /* renamed from: android.support.v7.widget.g$e */
    /* loaded from: classes.dex */
    public class e extends C0375u {
        public e(Context context, C0366l c0366l, View view, boolean z) {
            super(context, c0366l, view, z, C0112a.actionOverflowMenuStyle);
            m2082a(8388613);
            m2083a(C0448g.this.f2346D);
        }

        @Override // android.support.v7.view.menu.C0375u
        /* renamed from: d */
        public void mo2090d() {
            if (((AbstractC0356b) C0448g.this).f1746c != null) {
                ((AbstractC0356b) C0448g.this).f1746c.close();
            }
            C0448g.this.f2363z = null;
            super.mo2090d();
        }
    }

    /* renamed from: android.support.v7.widget.g$f */
    /* loaded from: classes.dex */
    public class f implements InterfaceC0376v.a {
        f() {
        }

        @Override // android.support.v7.view.menu.InterfaceC0376v.a
        /* renamed from: a */
        public void mo1906a(C0366l c0366l, boolean z) {
            if (c0366l instanceof SubMenuC0353D) {
                c0366l.mo1950m().m2020a(false);
            }
            InterfaceC0376v.a m1974b = C0448g.this.m1974b();
            if (m1974b != null) {
                m1974b.mo1906a(c0366l, z);
            }
        }

        @Override // android.support.v7.view.menu.InterfaceC0376v.a
        /* renamed from: a */
        public boolean mo1907a(C0366l c0366l) {
            if (c0366l == null) {
                return false;
            }
            C0448g.this.f2347E = ((SubMenuC0353D) c0366l).getItem().getItemId();
            InterfaceC0376v.a m1974b = C0448g.this.m1974b();
            if (m1974b != null) {
                return m1974b.mo1907a(c0366l);
            }
            return false;
        }
    }

    public C0448g(Context context) {
        super(context, C0118g.abc_action_menu_layout, C0118g.abc_action_menu_item_layout);
        this.f2361x = new SparseBooleanArray();
        this.f2346D = new f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private View m2445a(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f1752i;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof InterfaceC0377w.a) && ((InterfaceC0377w.a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    @Override // android.support.v7.view.menu.AbstractC0356b
    /* renamed from: a */
    public View mo1966a(C0370p c0370p, View view, ViewGroup viewGroup) {
        View actionView = c0370p.getActionView();
        if (actionView == null || c0370p.m2062f()) {
            actionView = super.mo1966a(c0370p, view, viewGroup);
        }
        actionView.setVisibility(c0370p.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    @Override // android.support.v7.view.menu.AbstractC0356b, android.support.v7.view.menu.InterfaceC0376v
    /* renamed from: a */
    public void mo1968a(Context context, C0366l c0366l) {
        super.mo1968a(context, c0366l);
        Resources resources = context.getResources();
        C0130a m617a = C0130a.m617a(context);
        if (!this.f2352o) {
            this.f2351n = m617a.m624g();
        }
        if (!this.f2358u) {
            this.f2353p = m617a.m619b();
        }
        if (!this.f2356s) {
            this.f2355r = m617a.m620c();
        }
        int i = this.f2353p;
        if (this.f2351n) {
            if (this.f2348k == null) {
                this.f2348k = new d(this.f1744a);
                if (this.f2350m) {
                    this.f2348k.setImageDrawable(this.f2349l);
                    this.f2349l = null;
                    this.f2350m = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f2348k.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i -= this.f2348k.getMeasuredWidth();
        } else {
            this.f2348k = null;
        }
        this.f2354q = i;
        this.f2360w = (int) (resources.getDisplayMetrics().density * 56.0f);
        this.f2362y = null;
    }

    /* renamed from: a */
    public void m2451a(Configuration configuration) {
        if (!this.f2356s) {
            this.f2355r = C0130a.m617a(this.f1745b).m620c();
        }
        C0366l c0366l = this.f1746c;
        if (c0366l != null) {
            c0366l.m2027b(true);
        }
    }

    /* renamed from: a */
    public void m2452a(Drawable drawable) {
        d dVar = this.f2348k;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
        } else {
            this.f2350m = true;
            this.f2349l = drawable;
        }
    }

    @Override // android.support.v7.view.menu.AbstractC0356b, android.support.v7.view.menu.InterfaceC0376v
    /* renamed from: a */
    public void mo1931a(C0366l c0366l, boolean z) {
        m2456c();
        super.mo1931a(c0366l, z);
    }

    @Override // android.support.v7.view.menu.AbstractC0356b
    /* renamed from: a */
    public void mo1969a(C0370p c0370p, InterfaceC0377w.a aVar) {
        aVar.mo1920a(c0370p, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f1752i);
        if (this.f2345C == null) {
            this.f2345C = new b();
        }
        actionMenuItemView.setPopupCallback(this.f2345C);
    }

    /* renamed from: a */
    public void m2453a(ActionMenuView actionMenuView) {
        this.f1752i = actionMenuView;
        actionMenuView.mo1956a(this.f1746c);
    }

    @Override // android.support.v7.view.menu.AbstractC0356b, android.support.v7.view.menu.InterfaceC0376v
    /* renamed from: a */
    public void mo1935a(boolean z) {
        super.mo1935a(z);
        ((View) this.f1752i).requestLayout();
        C0366l c0366l = this.f1746c;
        boolean z2 = false;
        if (c0366l != null) {
            ArrayList<C0370p> m2029c = c0366l.m2029c();
            int size = m2029c.size();
            for (int i = 0; i < size; i++) {
                AbstractC0090e mo230a = m2029c.get(i).mo230a();
                if (mo230a != null) {
                    mo230a.m420a(this);
                }
            }
        }
        C0366l c0366l2 = this.f1746c;
        ArrayList<C0370p> m2040j = c0366l2 != null ? c0366l2.m2040j() : null;
        if (this.f2351n && m2040j != null) {
            int size2 = m2040j.size();
            if (size2 == 1) {
                z2 = !m2040j.get(0).isActionViewExpanded();
            } else if (size2 > 0) {
                z2 = true;
            }
        }
        if (z2) {
            if (this.f2348k == null) {
                this.f2348k = new d(this.f1744a);
            }
            ViewGroup viewGroup = (ViewGroup) this.f2348k.getParent();
            if (viewGroup != this.f1752i) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f2348k);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f1752i;
                actionMenuView.addView(this.f2348k, actionMenuView.m2135b());
            }
        } else {
            d dVar = this.f2348k;
            if (dVar != null) {
                Object parent = dVar.getParent();
                Object obj = this.f1752i;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f2348k);
                }
            }
        }
        ((ActionMenuView) this.f1752i).setOverflowReserved(this.f2351n);
    }

    @Override // android.support.v7.view.menu.InterfaceC0376v
    /* renamed from: a */
    public boolean mo1936a() {
        ArrayList<C0370p> arrayList;
        int i;
        int i2;
        int i3;
        int i4;
        boolean z;
        C0448g c0448g = this;
        C0366l c0366l = c0448g.f1746c;
        int i5 = 0;
        if (c0366l != null) {
            arrayList = c0366l.m2043n();
            i = arrayList.size();
        } else {
            arrayList = null;
            i = 0;
        }
        int i6 = c0448g.f2355r;
        int i7 = c0448g.f2354q;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) c0448g.f1752i;
        int i8 = i6;
        boolean z2 = false;
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < i; i11++) {
            C0370p c0370p = arrayList.get(i11);
            if (c0370p.m2067k()) {
                i9++;
            } else if (c0370p.m2066j()) {
                i10++;
            } else {
                z2 = true;
            }
            if (c0448g.f2359v && c0370p.isActionViewExpanded()) {
                i8 = 0;
            }
        }
        if (c0448g.f2351n && (z2 || i10 + i9 > i8)) {
            i8--;
        }
        int i12 = i8 - i9;
        SparseBooleanArray sparseBooleanArray = c0448g.f2361x;
        sparseBooleanArray.clear();
        if (c0448g.f2357t) {
            int i13 = c0448g.f2360w;
            i3 = i7 / i13;
            i2 = i13 + ((i7 % i13) / i3);
        } else {
            i2 = 0;
            i3 = 0;
        }
        int i14 = i7;
        int i15 = 0;
        int i16 = 0;
        while (i15 < i) {
            C0370p c0370p2 = arrayList.get(i15);
            if (c0370p2.m2067k()) {
                View mo1966a = c0448g.mo1966a(c0370p2, c0448g.f2362y, viewGroup);
                if (c0448g.f2362y == null) {
                    c0448g.f2362y = mo1966a;
                }
                if (c0448g.f2357t) {
                    i3 -= ActionMenuView.m2131a(mo1966a, i2, i3, makeMeasureSpec, i5);
                } else {
                    mo1966a.measure(makeMeasureSpec, makeMeasureSpec);
                }
                int measuredWidth = mo1966a.getMeasuredWidth();
                i14 -= measuredWidth;
                if (i16 != 0) {
                    measuredWidth = i16;
                }
                int groupId = c0370p2.getGroupId();
                if (groupId != 0) {
                    z = true;
                    sparseBooleanArray.put(groupId, true);
                } else {
                    z = true;
                }
                c0370p2.m2059d(z);
                i4 = i;
                i16 = measuredWidth;
            } else if (c0370p2.m2066j()) {
                int groupId2 = c0370p2.getGroupId();
                boolean z3 = sparseBooleanArray.get(groupId2);
                boolean z4 = (i12 > 0 || z3) && i14 > 0 && (!c0448g.f2357t || i3 > 0);
                if (z4) {
                    boolean z5 = z4;
                    View mo1966a2 = c0448g.mo1966a(c0370p2, c0448g.f2362y, viewGroup);
                    i4 = i;
                    if (c0448g.f2362y == null) {
                        c0448g.f2362y = mo1966a2;
                    }
                    if (c0448g.f2357t) {
                        int m2131a = ActionMenuView.m2131a(mo1966a2, i2, i3, makeMeasureSpec, 0);
                        i3 -= m2131a;
                        if (m2131a == 0) {
                            z5 = false;
                        }
                    } else {
                        mo1966a2.measure(makeMeasureSpec, makeMeasureSpec);
                    }
                    int measuredWidth2 = mo1966a2.getMeasuredWidth();
                    i14 -= measuredWidth2;
                    if (i16 == 0) {
                        i16 = measuredWidth2;
                    }
                    z4 = z5 & (!c0448g.f2357t ? i14 + i16 <= 0 : i14 < 0);
                } else {
                    i4 = i;
                }
                if (z4 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z3) {
                    sparseBooleanArray.put(groupId2, false);
                    for (int i17 = 0; i17 < i15; i17++) {
                        C0370p c0370p3 = arrayList.get(i17);
                        if (c0370p3.getGroupId() == groupId2) {
                            if (c0370p3.m2064h()) {
                                i12++;
                            }
                            c0370p3.m2059d(false);
                        }
                    }
                }
                if (z4) {
                    i12--;
                }
                c0370p2.m2059d(z4);
            } else {
                i4 = i;
                c0370p2.m2059d(false);
                i15++;
                i5 = 0;
                c0448g = this;
                i = i4;
            }
            i15++;
            i5 = 0;
            c0448g = this;
            i = i4;
        }
        return true;
    }

    @Override // android.support.v7.view.menu.AbstractC0356b
    /* renamed from: a */
    public boolean mo1971a(int i, C0370p c0370p) {
        return c0370p.m2064h();
    }

    @Override // android.support.v7.view.menu.AbstractC0356b, android.support.v7.view.menu.InterfaceC0376v
    /* renamed from: a */
    public boolean mo1937a(SubMenuC0353D subMenuC0353D) {
        boolean z = false;
        if (!subMenuC0353D.hasVisibleItems()) {
            return false;
        }
        SubMenuC0353D subMenuC0353D2 = subMenuC0353D;
        while (subMenuC0353D2.m1954t() != this.f1746c) {
            subMenuC0353D2 = (SubMenuC0353D) subMenuC0353D2.m1954t();
        }
        View m2445a = m2445a(subMenuC0353D2.getItem());
        if (m2445a == null) {
            return false;
        }
        this.f2347E = subMenuC0353D.getItem().getItemId();
        int size = subMenuC0353D.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            MenuItem item = subMenuC0353D.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                z = true;
                break;
            }
            i++;
        }
        this.f2343A = new a(this.f1745b, subMenuC0353D, m2445a);
        this.f2343A.m2086a(z);
        this.f2343A.m2091e();
        super.mo1937a(subMenuC0353D);
        return true;
    }

    @Override // android.support.v7.view.menu.AbstractC0356b
    /* renamed from: a */
    public boolean mo1973a(ViewGroup viewGroup, int i) {
        if (viewGroup.getChildAt(i) == this.f2348k) {
            return false;
        }
        return super.mo1973a(viewGroup, i);
    }

    @Override // android.support.v7.view.menu.AbstractC0356b
    /* renamed from: b */
    public InterfaceC0377w mo1975b(ViewGroup viewGroup) {
        InterfaceC0377w interfaceC0377w = this.f1752i;
        InterfaceC0377w mo1975b = super.mo1975b(viewGroup);
        if (interfaceC0377w != mo1975b) {
            ((ActionMenuView) mo1975b).setPresenter(this);
        }
        return mo1975b;
    }

    /* renamed from: b */
    public void m2454b(boolean z) {
        this.f2359v = z;
    }

    /* renamed from: c */
    public void m2455c(boolean z) {
        this.f2351n = z;
        this.f2352o = true;
    }

    /* renamed from: c */
    public boolean m2456c() {
        return m2458e() | m2459f();
    }

    /* renamed from: d */
    public Drawable m2457d() {
        d dVar = this.f2348k;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (this.f2350m) {
            return this.f2349l;
        }
        return null;
    }

    /* renamed from: e */
    public boolean m2458e() {
        Object obj;
        c cVar = this.f2344B;
        if (cVar != null && (obj = this.f1752i) != null) {
            ((View) obj).removeCallbacks(cVar);
            this.f2344B = null;
            return true;
        }
        e eVar = this.f2363z;
        if (eVar == null) {
            return false;
        }
        eVar.m2081a();
        return true;
    }

    /* renamed from: f */
    public boolean m2459f() {
        a aVar = this.f2343A;
        if (aVar == null) {
            return false;
        }
        aVar.m2081a();
        return true;
    }

    /* renamed from: g */
    public boolean m2460g() {
        return this.f2344B != null || m2461h();
    }

    /* renamed from: h */
    public boolean m2461h() {
        e eVar = this.f2363z;
        return eVar != null && eVar.m2089c();
    }

    /* renamed from: i */
    public boolean m2462i() {
        C0366l c0366l;
        if (!this.f2351n || m2461h() || (c0366l = this.f1746c) == null || this.f1752i == null || this.f2344B != null || c0366l.m2040j().isEmpty()) {
            return false;
        }
        this.f2344B = new c(new e(this.f1745b, this.f1746c, this.f2348k, true));
        ((View) this.f1752i).post(this.f2344B);
        super.mo1937a((SubMenuC0353D) null);
        return true;
    }
}
