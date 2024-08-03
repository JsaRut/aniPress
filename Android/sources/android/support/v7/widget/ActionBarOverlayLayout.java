package android.support.v7.widget;

import android.R;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v7.view.menu.InterfaceC0376v;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.OverScroller;
import p000a.p005b.p009c.p019h.C0101p;
import p000a.p005b.p009c.p019h.C0107v;
import p000a.p005b.p009c.p019h.InterfaceC0100o;
import p000a.p005b.p022d.p023a.C0112a;
import p000a.p005b.p022d.p023a.C0117f;

/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC0409K, InterfaceC0100o {

    /* renamed from: a */
    static final int[] f1926a = {C0112a.actionBarSize, R.attr.windowContentOverlay};

    /* renamed from: A */
    private final Runnable f1927A;

    /* renamed from: B */
    private final C0101p f1928B;

    /* renamed from: b */
    private int f1929b;

    /* renamed from: c */
    private int f1930c;

    /* renamed from: d */
    private ContentFrameLayout f1931d;

    /* renamed from: e */
    ActionBarContainer f1932e;

    /* renamed from: f */
    private InterfaceC0411L f1933f;

    /* renamed from: g */
    private Drawable f1934g;

    /* renamed from: h */
    private boolean f1935h;

    /* renamed from: i */
    private boolean f1936i;

    /* renamed from: j */
    private boolean f1937j;

    /* renamed from: k */
    private boolean f1938k;

    /* renamed from: l */
    boolean f1939l;

    /* renamed from: m */
    private int f1940m;

    /* renamed from: n */
    private int f1941n;

    /* renamed from: o */
    private final Rect f1942o;

    /* renamed from: p */
    private final Rect f1943p;

    /* renamed from: q */
    private final Rect f1944q;

    /* renamed from: r */
    private final Rect f1945r;

    /* renamed from: s */
    private final Rect f1946s;

    /* renamed from: t */
    private final Rect f1947t;

    /* renamed from: u */
    private final Rect f1948u;

    /* renamed from: v */
    private InterfaceC0383a f1949v;

    /* renamed from: w */
    private OverScroller f1950w;

    /* renamed from: x */
    ViewPropertyAnimator f1951x;

    /* renamed from: y */
    final AnimatorListenerAdapter f1952y;

    /* renamed from: z */
    private final Runnable f1953z;

    /* renamed from: android.support.v7.widget.ActionBarOverlayLayout$a */
    /* loaded from: classes.dex */
    public interface InterfaceC0383a {
        /* renamed from: a */
        void mo1774a();

        /* renamed from: a */
        void mo1776a(int i);

        /* renamed from: a */
        void mo1780a(boolean z);

        /* renamed from: b */
        void mo1782b();

        /* renamed from: c */
        void mo1784c();

        /* renamed from: d */
        void mo1786d();
    }

    /* renamed from: android.support.v7.widget.ActionBarOverlayLayout$b */
    /* loaded from: classes.dex */
    public static class C0384b extends ViewGroup.MarginLayoutParams {
        public C0384b(int i, int i2) {
            super(i, i2);
        }

        public C0384b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0384b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ActionBarOverlayLayout(Context context) {
        this(context, null);
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1930c = 0;
        this.f1942o = new Rect();
        this.f1943p = new Rect();
        this.f1944q = new Rect();
        this.f1945r = new Rect();
        this.f1946s = new Rect();
        this.f1947t = new Rect();
        this.f1948u = new Rect();
        this.f1952y = new C0442d(this);
        this.f1953z = new RunnableC0444e(this);
        this.f1927A = new RunnableC0446f(this);
        m2112a(context);
        this.f1928B = new C0101p(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private InterfaceC0411L m2111a(View view) {
        if (view instanceof InterfaceC0411L) {
            return (InterfaceC0411L) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    /* renamed from: a */
    private void m2112a(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f1926a);
        this.f1929b = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f1934g = obtainStyledAttributes.getDrawable(1);
        setWillNotDraw(this.f1934g == null);
        obtainStyledAttributes.recycle();
        this.f1935h = context.getApplicationInfo().targetSdkVersion < 19;
        this.f1950w = new OverScroller(context);
    }

    /* renamed from: a */
    private boolean m2113a(float f, float f2) {
        this.f1950w.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return this.f1950w.getFinalY() > this.f1932e.getHeight();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean m2114a(android.view.View r3, android.graphics.Rect r4, boolean r5, boolean r6, boolean r7, boolean r8) {
        /*
            r2 = this;
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            android.support.v7.widget.ActionBarOverlayLayout$b r3 = (android.support.v7.widget.ActionBarOverlayLayout.C0384b) r3
            r0 = 1
            if (r5 == 0) goto L13
            int r5 = r3.leftMargin
            int r1 = r4.left
            if (r5 == r1) goto L13
            r3.leftMargin = r1
            r5 = 1
            goto L14
        L13:
            r5 = 0
        L14:
            if (r6 == 0) goto L1f
            int r6 = r3.topMargin
            int r1 = r4.top
            if (r6 == r1) goto L1f
            r3.topMargin = r1
            r5 = 1
        L1f:
            if (r8 == 0) goto L2a
            int r6 = r3.rightMargin
            int r8 = r4.right
            if (r6 == r8) goto L2a
            r3.rightMargin = r8
            r5 = 1
        L2a:
            if (r7 == 0) goto L35
            int r6 = r3.bottomMargin
            int r4 = r4.bottom
            if (r6 == r4) goto L35
            r3.bottomMargin = r4
            r5 = 1
        L35:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ActionBarOverlayLayout.m2114a(android.view.View, android.graphics.Rect, boolean, boolean, boolean, boolean):boolean");
    }

    /* renamed from: k */
    private void m2115k() {
        m2128h();
        this.f1927A.run();
    }

    /* renamed from: l */
    private void m2116l() {
        m2128h();
        postDelayed(this.f1927A, 600L);
    }

    /* renamed from: m */
    private void m2117m() {
        m2128h();
        postDelayed(this.f1953z, 600L);
    }

    /* renamed from: n */
    private void m2118n() {
        m2128h();
        this.f1953z.run();
    }

    @Override // android.support.v7.widget.InterfaceC0409K
    /* renamed from: a */
    public void mo2119a(int i) {
        m2130j();
        if (i == 2) {
            this.f1933f.mo2189m();
        } else if (i == 5) {
            this.f1933f.mo2190n();
        } else {
            if (i != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    @Override // android.support.v7.widget.InterfaceC0409K
    /* renamed from: a */
    public void mo2120a(Menu menu, InterfaceC0376v.a aVar) {
        m2130j();
        this.f1933f.mo2165a(menu, aVar);
    }

    @Override // android.support.v7.widget.InterfaceC0409K
    /* renamed from: a */
    public boolean mo2121a() {
        m2130j();
        return this.f1933f.mo2169a();
    }

    @Override // android.support.v7.widget.InterfaceC0409K
    /* renamed from: b */
    public void mo2122b() {
        m2130j();
        this.f1933f.mo2170b();
    }

    @Override // android.support.v7.widget.InterfaceC0409K
    /* renamed from: c */
    public boolean mo2123c() {
        m2130j();
        return this.f1933f.mo2177c();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0384b;
    }

    @Override // android.support.v7.widget.InterfaceC0409K
    /* renamed from: d */
    public boolean mo2124d() {
        m2130j();
        return this.f1933f.mo2179d();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f1934g == null || this.f1935h) {
            return;
        }
        int bottom = this.f1932e.getVisibility() == 0 ? (int) (this.f1932e.getBottom() + this.f1932e.getTranslationY() + 0.5f) : 0;
        this.f1934g.setBounds(0, bottom, getWidth(), this.f1934g.getIntrinsicHeight() + bottom);
        this.f1934g.draw(canvas);
    }

    @Override // android.support.v7.widget.InterfaceC0409K
    /* renamed from: e */
    public boolean mo2125e() {
        m2130j();
        return this.f1933f.mo2181e();
    }

    @Override // android.support.v7.widget.InterfaceC0409K
    /* renamed from: f */
    public boolean mo2126f() {
        m2130j();
        return this.f1933f.mo2182f();
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        m2130j();
        int m525m = C0107v.m525m(this) & 256;
        boolean m2114a = m2114a(this.f1932e, rect, true, true, false, true);
        this.f1945r.set(rect);
        C0408Ja.m2258a(this, this.f1945r, this.f1942o);
        if (!this.f1946s.equals(this.f1945r)) {
            this.f1946s.set(this.f1945r);
            m2114a = true;
        }
        if (!this.f1943p.equals(this.f1942o)) {
            this.f1943p.set(this.f1942o);
            m2114a = true;
        }
        if (m2114a) {
            requestLayout();
        }
        return true;
    }

    @Override // android.support.v7.widget.InterfaceC0409K
    /* renamed from: g */
    public void mo2127g() {
        m2130j();
        this.f1933f.mo2183g();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public C0384b generateDefaultLayoutParams() {
        return new C0384b(-1, -1);
    }

    @Override // android.view.ViewGroup
    public C0384b generateLayoutParams(AttributeSet attributeSet) {
        return new C0384b(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0384b(layoutParams);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f1932e;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f1928B.m469a();
    }

    public CharSequence getTitle() {
        m2130j();
        return this.f1933f.getTitle();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m2128h() {
        removeCallbacks(this.f1953z);
        removeCallbacks(this.f1927A);
        ViewPropertyAnimator viewPropertyAnimator = this.f1951x;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    /* renamed from: i */
    public boolean m2129i() {
        return this.f1936i;
    }

    /* renamed from: j */
    void m2130j() {
        if (this.f1931d == null) {
            this.f1931d = (ContentFrameLayout) findViewById(C0117f.action_bar_activity_content);
            this.f1932e = (ActionBarContainer) findViewById(C0117f.action_bar_container);
            this.f1933f = m2111a(findViewById(C0117f.action_bar));
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m2112a(getContext());
        C0107v.m533u(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m2128h();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        getPaddingRight();
        int paddingTop = getPaddingTop();
        getPaddingBottom();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                C0384b c0384b = (C0384b) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) c0384b).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) c0384b).topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int measuredHeight;
        m2130j();
        measureChildWithMargins(this.f1932e, i, 0, i2, 0);
        C0384b c0384b = (C0384b) this.f1932e.getLayoutParams();
        int max = Math.max(0, this.f1932e.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0384b).leftMargin + ((ViewGroup.MarginLayoutParams) c0384b).rightMargin);
        int max2 = Math.max(0, this.f1932e.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0384b).topMargin + ((ViewGroup.MarginLayoutParams) c0384b).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f1932e.getMeasuredState());
        boolean z = (C0107v.m525m(this) & 256) != 0;
        if (z) {
            measuredHeight = this.f1929b;
            if (this.f1937j && this.f1932e.getTabContainer() != null) {
                measuredHeight += this.f1929b;
            }
        } else {
            measuredHeight = this.f1932e.getVisibility() != 8 ? this.f1932e.getMeasuredHeight() : 0;
        }
        this.f1944q.set(this.f1942o);
        this.f1947t.set(this.f1945r);
        Rect rect = (this.f1936i || z) ? this.f1947t : this.f1944q;
        rect.top += measuredHeight;
        rect.bottom += 0;
        m2114a(this.f1931d, this.f1944q, true, true, true, true);
        if (!this.f1948u.equals(this.f1947t)) {
            this.f1948u.set(this.f1947t);
            this.f1931d.m2192a(this.f1947t);
        }
        measureChildWithMargins(this.f1931d, i, 0, i2, 0);
        C0384b c0384b2 = (C0384b) this.f1931d.getLayoutParams();
        int max3 = Math.max(max, this.f1931d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0384b2).leftMargin + ((ViewGroup.MarginLayoutParams) c0384b2).rightMargin);
        int max4 = Math.max(max2, this.f1931d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0384b2).topMargin + ((ViewGroup.MarginLayoutParams) c0384b2).bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f1931d.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(max4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000a.p005b.p009c.p019h.InterfaceC0100o
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.f1938k || !z) {
            return false;
        }
        if (m2113a(f, f2)) {
            m2115k();
        } else {
            m2118n();
        }
        this.f1939l = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000a.p005b.p009c.p019h.InterfaceC0100o
    public boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000a.p005b.p009c.p019h.InterfaceC0100o
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000a.p005b.p009c.p019h.InterfaceC0100o
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        this.f1940m += i2;
        setActionBarHideOffset(this.f1940m);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000a.p005b.p009c.p019h.InterfaceC0100o
    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f1928B.m472a(view, view2, i);
        this.f1940m = getActionBarHideOffset();
        m2128h();
        InterfaceC0383a interfaceC0383a = this.f1949v;
        if (interfaceC0383a != null) {
            interfaceC0383a.mo1786d();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000a.p005b.p009c.p019h.InterfaceC0100o
    public boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f1932e.getVisibility() != 0) {
            return false;
        }
        return this.f1938k;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000a.p005b.p009c.p019h.InterfaceC0100o
    public void onStopNestedScroll(View view) {
        if (this.f1938k && !this.f1939l) {
            if (this.f1940m <= this.f1932e.getHeight()) {
                m2117m();
            } else {
                m2116l();
            }
        }
        InterfaceC0383a interfaceC0383a = this.f1949v;
        if (interfaceC0383a != null) {
            interfaceC0383a.mo1782b();
        }
    }

    @Override // android.view.View
    public void onWindowSystemUiVisibilityChanged(int i) {
        if (Build.VERSION.SDK_INT >= 16) {
            super.onWindowSystemUiVisibilityChanged(i);
        }
        m2130j();
        int i2 = this.f1941n ^ i;
        this.f1941n = i;
        boolean z = (i & 4) == 0;
        boolean z2 = (i & 256) != 0;
        InterfaceC0383a interfaceC0383a = this.f1949v;
        if (interfaceC0383a != null) {
            interfaceC0383a.mo1780a(!z2);
            if (z || !z2) {
                this.f1949v.mo1774a();
            } else {
                this.f1949v.mo1784c();
            }
        }
        if ((i2 & 256) == 0 || this.f1949v == null) {
            return;
        }
        C0107v.m533u(this);
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f1930c = i;
        InterfaceC0383a interfaceC0383a = this.f1949v;
        if (interfaceC0383a != null) {
            interfaceC0383a.mo1776a(i);
        }
    }

    public void setActionBarHideOffset(int i) {
        m2128h();
        this.f1932e.setTranslationY(-Math.max(0, Math.min(i, this.f1932e.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC0383a interfaceC0383a) {
        this.f1949v = interfaceC0383a;
        if (getWindowToken() != null) {
            this.f1949v.mo1776a(this.f1930c);
            int i = this.f1941n;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                C0107v.m533u(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.f1937j = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.f1938k) {
            this.f1938k = z;
            if (z) {
                return;
            }
            m2128h();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i) {
        m2130j();
        this.f1933f.setIcon(i);
    }

    public void setIcon(Drawable drawable) {
        m2130j();
        this.f1933f.setIcon(drawable);
    }

    public void setLogo(int i) {
        m2130j();
        this.f1933f.mo2171b(i);
    }

    public void setOverlayMode(boolean z) {
        this.f1936i = z;
        this.f1935h = z && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    @Override // android.support.v7.widget.InterfaceC0409K
    public void setWindowCallback(Window.Callback callback) {
        m2130j();
        this.f1933f.setWindowCallback(callback);
    }

    @Override // android.support.v7.widget.InterfaceC0409K
    public void setWindowTitle(CharSequence charSequence) {
        m2130j();
        this.f1933f.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
