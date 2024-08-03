package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.support.v7.view.menu.ActionMenuItemView;
import android.support.v7.view.menu.C0366l;
import android.support.v7.view.menu.C0370p;
import android.support.v7.view.menu.InterfaceC0376v;
import android.support.v7.view.menu.InterfaceC0377w;
import android.support.v7.widget.C0416Q;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

/* loaded from: classes.dex */
public class ActionMenuView extends C0416Q implements C0366l.b, InterfaceC0377w {

    /* renamed from: A */
    InterfaceC0389e f1954A;

    /* renamed from: p */
    private C0366l f1955p;

    /* renamed from: q */
    private Context f1956q;

    /* renamed from: r */
    private int f1957r;

    /* renamed from: s */
    private boolean f1958s;

    /* renamed from: t */
    private C0448g f1959t;

    /* renamed from: u */
    private InterfaceC0376v.a f1960u;

    /* renamed from: v */
    C0366l.a f1961v;

    /* renamed from: w */
    private boolean f1962w;

    /* renamed from: x */
    private int f1963x;

    /* renamed from: y */
    private int f1964y;

    /* renamed from: z */
    private int f1965z;

    /* renamed from: android.support.v7.widget.ActionMenuView$a */
    /* loaded from: classes.dex */
    public interface InterfaceC0385a {
        /* renamed from: a */
        boolean mo1921a();

        /* renamed from: b */
        boolean mo1922b();
    }

    /* renamed from: android.support.v7.widget.ActionMenuView$b */
    /* loaded from: classes.dex */
    public static class C0386b implements InterfaceC0376v.a {
        C0386b() {
        }

        @Override // android.support.v7.view.menu.InterfaceC0376v.a
        /* renamed from: a */
        public void mo1906a(C0366l c0366l, boolean z) {
        }

        @Override // android.support.v7.view.menu.InterfaceC0376v.a
        /* renamed from: a */
        public boolean mo1907a(C0366l c0366l) {
            return false;
        }
    }

    /* renamed from: android.support.v7.widget.ActionMenuView$c */
    /* loaded from: classes.dex */
    public static class C0387c extends C0416Q.a {

        /* renamed from: c */
        @ViewDebug.ExportedProperty
        public boolean f1966c;

        /* renamed from: d */
        @ViewDebug.ExportedProperty
        public int f1967d;

        /* renamed from: e */
        @ViewDebug.ExportedProperty
        public int f1968e;

        /* renamed from: f */
        @ViewDebug.ExportedProperty
        public boolean f1969f;

        /* renamed from: g */
        @ViewDebug.ExportedProperty
        public boolean f1970g;

        /* renamed from: h */
        boolean f1971h;

        public C0387c(int i, int i2) {
            super(i, i2);
            this.f1966c = false;
        }

        public C0387c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0387c(C0387c c0387c) {
            super(c0387c);
            this.f1966c = c0387c.f1966c;
        }

        public C0387c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* renamed from: android.support.v7.widget.ActionMenuView$d */
    /* loaded from: classes.dex */
    public class C0388d implements C0366l.a {
        C0388d() {
        }

        @Override // android.support.v7.view.menu.C0366l.a
        /* renamed from: a */
        public void mo650a(C0366l c0366l) {
            C0366l.a aVar = ActionMenuView.this.f1961v;
            if (aVar != null) {
                aVar.mo650a(c0366l);
            }
        }

        @Override // android.support.v7.view.menu.C0366l.a
        /* renamed from: a */
        public boolean mo651a(C0366l c0366l, MenuItem menuItem) {
            InterfaceC0389e interfaceC0389e = ActionMenuView.this.f1954A;
            return interfaceC0389e != null && interfaceC0389e.onMenuItemClick(menuItem);
        }
    }

    /* renamed from: android.support.v7.widget.ActionMenuView$e */
    /* loaded from: classes.dex */
    public interface InterfaceC0389e {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.f1964y = (int) (56.0f * f);
        this.f1965z = (int) (f * 4.0f);
        this.f1956q = context;
        this.f1957r = 0;
    }

    /* renamed from: a */
    public static int m2131a(View view, int i, int i2, int i3, int i4) {
        C0387c c0387c = (C0387c) view.getLayoutParams();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3) - i4, View.MeasureSpec.getMode(i3));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z = actionMenuItemView != null && actionMenuItemView.m1924d();
        int i5 = 2;
        if (i2 <= 0 || (z && i2 < 2)) {
            i5 = 0;
        } else {
            view.measure(View.MeasureSpec.makeMeasureSpec(i2 * i, Integer.MIN_VALUE), makeMeasureSpec);
            int measuredWidth = view.getMeasuredWidth();
            int i6 = measuredWidth / i;
            if (measuredWidth % i != 0) {
                i6++;
            }
            if (!z || i6 >= 2) {
                i5 = i6;
            }
        }
        c0387c.f1969f = !c0387c.f1966c && z;
        c0387c.f1967d = i5;
        view.measure(View.MeasureSpec.makeMeasureSpec(i * i5, 1073741824), makeMeasureSpec);
        return i5;
    }

    /* JADX WARN: Removed duplicated region for block: B:145:0x023b A[ADDED_TO_REGION, LOOP:5: B:145:0x023b->B:150:0x025a, LOOP_START, PHI: r13
  0x023b: PHI (r13v4 int) = (r13v3 int), (r13v5 int) binds: [B:144:0x0239, B:150:0x025a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0262  */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m2132e(int r30, int r31) {
        /*
            Method dump skipped, instructions count: 618
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ActionMenuView.m2132e(int, int):void");
    }

    /* renamed from: a */
    public void m2133a() {
        C0448g c0448g = this.f1959t;
        if (c0448g != null) {
            c0448g.m2456c();
        }
    }

    @Override // android.support.v7.view.menu.InterfaceC0377w
    /* renamed from: a */
    public void mo1956a(C0366l c0366l) {
        this.f1955p = c0366l;
    }

    /* renamed from: a */
    public void m2134a(InterfaceC0376v.a aVar, C0366l.a aVar2) {
        this.f1960u = aVar;
        this.f1961v = aVar2;
    }

    @Override // android.support.v7.view.menu.C0366l.b
    /* renamed from: a */
    public boolean mo1957a(C0370p c0370p) {
        return this.f1955p.m2021a(c0370p, 0);
    }

    /* renamed from: b */
    public C0387c m2135b() {
        C0387c generateDefaultLayoutParams = generateDefaultLayoutParams();
        generateDefaultLayoutParams.f1966c = true;
        return generateDefaultLayoutParams;
    }

    /* renamed from: c */
    public boolean m2136c() {
        C0448g c0448g = this.f1959t;
        return c0448g != null && c0448g.m2458e();
    }

    @Override // android.support.v7.widget.C0416Q, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams != null && (layoutParams instanceof C0387c);
    }

    /* renamed from: d */
    public boolean m2137d() {
        C0448g c0448g = this.f1959t;
        return c0448g != null && c0448g.m2460g();
    }

    /* renamed from: d */
    protected boolean m2138d(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i - 1);
        KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof InterfaceC0385a)) {
            z = false | ((InterfaceC0385a) childAt).mo1921a();
        }
        return (i <= 0 || !(childAt2 instanceof InterfaceC0385a)) ? z : z | ((InterfaceC0385a) childAt2).mo1922b();
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    /* renamed from: e */
    public boolean m2139e() {
        C0448g c0448g = this.f1959t;
        return c0448g != null && c0448g.m2461h();
    }

    /* renamed from: f */
    public boolean m2140f() {
        return this.f1958s;
    }

    /* renamed from: g */
    public C0366l m2141g() {
        return this.f1955p;
    }

    @Override // android.support.v7.widget.C0416Q, android.view.ViewGroup
    public C0387c generateDefaultLayoutParams() {
        C0387c c0387c = new C0387c(-2, -2);
        c0387c.f2125b = 16;
        return c0387c;
    }

    @Override // android.support.v7.widget.C0416Q, android.view.ViewGroup
    public C0387c generateLayoutParams(AttributeSet attributeSet) {
        return new C0387c(getContext(), attributeSet);
    }

    @Override // android.support.v7.widget.C0416Q, android.view.ViewGroup
    public C0387c generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return generateDefaultLayoutParams();
        }
        C0387c c0387c = layoutParams instanceof C0387c ? new C0387c((C0387c) layoutParams) : new C0387c(layoutParams);
        if (c0387c.f2125b <= 0) {
            c0387c.f2125b = 16;
        }
        return c0387c;
    }

    public Menu getMenu() {
        if (this.f1955p == null) {
            Context context = getContext();
            this.f1955p = new C0366l(context);
            this.f1955p.mo1945a(new C0388d());
            this.f1959t = new C0448g(context);
            this.f1959t.m2455c(true);
            C0448g c0448g = this.f1959t;
            InterfaceC0376v.a aVar = this.f1960u;
            if (aVar == null) {
                aVar = new C0386b();
            }
            c0448g.mo1932a(aVar);
            this.f1955p.m2017a(this.f1959t, this.f1956q);
            this.f1959t.m2453a(this);
        }
        return this.f1955p;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        return this.f1959t.m2457d();
    }

    public int getPopupTheme() {
        return this.f1957r;
    }

    public int getWindowAnimations() {
        return 0;
    }

    /* renamed from: h */
    public boolean m2142h() {
        C0448g c0448g = this.f1959t;
        return c0448g != null && c0448g.m2462i();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0448g c0448g = this.f1959t;
        if (c0448g != null) {
            c0448g.mo1935a(false);
            if (this.f1959t.m2461h()) {
                this.f1959t.m2458e();
                this.f1959t.m2462i();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m2133a();
    }

    @Override // android.support.v7.widget.C0416Q, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int width;
        int i7;
        if (!this.f1962w) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i8 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i9 = i3 - i;
        int paddingRight = (i9 - getPaddingRight()) - getPaddingLeft();
        boolean m2259a = C0408Ja.m2259a(this);
        int i10 = paddingRight;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                C0387c c0387c = (C0387c) childAt.getLayoutParams();
                if (c0387c.f1966c) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (m2138d(i13)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (m2259a) {
                        i7 = getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0387c).leftMargin;
                        width = i7 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c0387c).rightMargin;
                        i7 = width - measuredWidth;
                    }
                    int i14 = i8 - (measuredHeight / 2);
                    childAt.layout(i7, i14, width, measuredHeight + i14);
                    i10 -= measuredWidth;
                    i11 = 1;
                } else {
                    i10 -= (childAt.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0387c).leftMargin) + ((ViewGroup.MarginLayoutParams) c0387c).rightMargin;
                    m2138d(i13);
                    i12++;
                }
            }
        }
        if (childCount == 1 && i11 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i15 = (i9 / 2) - (measuredWidth2 / 2);
            int i16 = i8 - (measuredHeight2 / 2);
            childAt2.layout(i15, i16, measuredWidth2 + i15, measuredHeight2 + i16);
            return;
        }
        int i17 = i12 - (i11 ^ 1);
        if (i17 > 0) {
            i6 = i10 / i17;
            i5 = 0;
        } else {
            i5 = 0;
            i6 = 0;
        }
        int max = Math.max(i5, i6);
        if (m2259a) {
            int width2 = getWidth() - getPaddingRight();
            while (i5 < childCount) {
                View childAt3 = getChildAt(i5);
                C0387c c0387c2 = (C0387c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !c0387c2.f1966c) {
                    int i18 = width2 - ((ViewGroup.MarginLayoutParams) c0387c2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i19 = i8 - (measuredHeight3 / 2);
                    childAt3.layout(i18 - measuredWidth3, i19, i18, measuredHeight3 + i19);
                    width2 = i18 - ((measuredWidth3 + ((ViewGroup.MarginLayoutParams) c0387c2).leftMargin) + max);
                }
                i5++;
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        while (i5 < childCount) {
            View childAt4 = getChildAt(i5);
            C0387c c0387c3 = (C0387c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !c0387c3.f1966c) {
                int i20 = paddingLeft + ((ViewGroup.MarginLayoutParams) c0387c3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i21 = i8 - (measuredHeight4 / 2);
                childAt4.layout(i20, i21, i20 + measuredWidth4, measuredHeight4 + i21);
                paddingLeft = i20 + measuredWidth4 + ((ViewGroup.MarginLayoutParams) c0387c3).rightMargin + max;
            }
            i5++;
        }
    }

    @Override // android.support.v7.widget.C0416Q, android.view.View
    public void onMeasure(int i, int i2) {
        C0366l c0366l;
        boolean z = this.f1962w;
        this.f1962w = View.MeasureSpec.getMode(i) == 1073741824;
        if (z != this.f1962w) {
            this.f1963x = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.f1962w && (c0366l = this.f1955p) != null && size != this.f1963x) {
            this.f1963x = size;
            c0366l.m2027b(true);
        }
        int childCount = getChildCount();
        if (this.f1962w && childCount > 0) {
            m2132e(i, i2);
            return;
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            C0387c c0387c = (C0387c) getChildAt(i3).getLayoutParams();
            ((ViewGroup.MarginLayoutParams) c0387c).rightMargin = 0;
            ((ViewGroup.MarginLayoutParams) c0387c).leftMargin = 0;
        }
        super.onMeasure(i, i2);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.f1959t.m2454b(z);
    }

    public void setOnMenuItemClickListener(InterfaceC0389e interfaceC0389e) {
        this.f1954A = interfaceC0389e;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        this.f1959t.m2452a(drawable);
    }

    public void setOverflowReserved(boolean z) {
        this.f1958s = z;
    }

    public void setPopupTheme(int i) {
        if (this.f1957r != i) {
            this.f1957r = i;
            if (i == 0) {
                this.f1956q = getContext();
            } else {
                this.f1956q = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(C0448g c0448g) {
        this.f1959t = c0448g;
        this.f1959t.m2453a(this);
    }
}
