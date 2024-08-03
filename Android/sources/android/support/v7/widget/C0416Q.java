package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import p000a.p005b.p022d.p023a.C0121j;

/* renamed from: android.support.v7.widget.Q */
/* loaded from: classes.dex */
public class C0416Q extends ViewGroup {

    /* renamed from: a */
    private boolean f2109a;

    /* renamed from: b */
    private int f2110b;

    /* renamed from: c */
    private int f2111c;

    /* renamed from: d */
    private int f2112d;

    /* renamed from: e */
    private int f2113e;

    /* renamed from: f */
    private int f2114f;

    /* renamed from: g */
    private float f2115g;

    /* renamed from: h */
    private boolean f2116h;

    /* renamed from: i */
    private int[] f2117i;

    /* renamed from: j */
    private int[] f2118j;

    /* renamed from: k */
    private Drawable f2119k;

    /* renamed from: l */
    private int f2120l;

    /* renamed from: m */
    private int f2121m;

    /* renamed from: n */
    private int f2122n;

    /* renamed from: o */
    private int f2123o;

    /* renamed from: android.support.v7.widget.Q$a */
    /* loaded from: classes.dex */
    public static class a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public float f2124a;

        /* renamed from: b */
        public int f2125b;

        public a(int i, int i2) {
            super(i, i2);
            this.f2125b = -1;
            this.f2124a = 0.0f;
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2125b = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0121j.LinearLayoutCompat_Layout);
            this.f2124a = obtainStyledAttributes.getFloat(C0121j.LinearLayoutCompat_Layout_android_layout_weight, 0.0f);
            this.f2125b = obtainStyledAttributes.getInt(C0121j.LinearLayoutCompat_Layout_android_layout_gravity, -1);
            obtainStyledAttributes.recycle();
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f2125b = -1;
        }
    }

    public C0416Q(Context context) {
        this(context, null);
    }

    public C0416Q(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C0416Q(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2109a = true;
        this.f2110b = -1;
        this.f2111c = 0;
        this.f2113e = 8388659;
        C0479va m2571a = C0479va.m2571a(context, attributeSet, C0121j.LinearLayoutCompat, i, 0);
        int m2582d = m2571a.m2582d(C0121j.LinearLayoutCompat_android_orientation, -1);
        if (m2582d >= 0) {
            setOrientation(m2582d);
        }
        int m2582d2 = m2571a.m2582d(C0121j.LinearLayoutCompat_android_gravity, -1);
        if (m2582d2 >= 0) {
            setGravity(m2582d2);
        }
        boolean m2577a = m2571a.m2577a(C0121j.LinearLayoutCompat_android_baselineAligned, true);
        if (!m2577a) {
            setBaselineAligned(m2577a);
        }
        this.f2115g = m2571a.m2572a(C0121j.LinearLayoutCompat_android_weightSum, -1.0f);
        this.f2110b = m2571a.m2582d(C0121j.LinearLayoutCompat_android_baselineAlignedChildIndex, -1);
        this.f2116h = m2571a.m2577a(C0121j.LinearLayoutCompat_measureWithLargestChild, false);
        setDividerDrawable(m2571a.m2579b(C0121j.LinearLayoutCompat_divider));
        this.f2122n = m2571a.m2582d(C0121j.LinearLayoutCompat_showDividers, 0);
        this.f2123o = m2571a.m2580c(C0121j.LinearLayoutCompat_dividerPadding, 0);
        m2571a.m2576a();
    }

    /* renamed from: a */
    private void m2289a(View view, int i, int i2, int i3, int i4) {
        view.layout(i, i2, i3 + i, i4 + i2);
    }

    /* renamed from: c */
    private void m2290c(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View m2294a = m2294a(i3);
            if (m2294a.getVisibility() != 8) {
                a aVar = (a) m2294a.getLayoutParams();
                if (((ViewGroup.MarginLayoutParams) aVar).height == -1) {
                    int i4 = ((ViewGroup.MarginLayoutParams) aVar).width;
                    ((ViewGroup.MarginLayoutParams) aVar).width = m2294a.getMeasuredWidth();
                    measureChildWithMargins(m2294a, i2, 0, makeMeasureSpec, 0);
                    ((ViewGroup.MarginLayoutParams) aVar).width = i4;
                }
            }
        }
    }

    /* renamed from: d */
    private void m2291d(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View m2294a = m2294a(i3);
            if (m2294a.getVisibility() != 8) {
                a aVar = (a) m2294a.getLayoutParams();
                if (((ViewGroup.MarginLayoutParams) aVar).width == -1) {
                    int i4 = ((ViewGroup.MarginLayoutParams) aVar).height;
                    ((ViewGroup.MarginLayoutParams) aVar).height = m2294a.getMeasuredHeight();
                    measureChildWithMargins(m2294a, makeMeasureSpec, 0, i2, 0);
                    ((ViewGroup.MarginLayoutParams) aVar).height = i4;
                }
            }
        }
    }

    /* renamed from: a */
    int m2292a(View view) {
        return 0;
    }

    /* renamed from: a */
    int m2293a(View view, int i) {
        return 0;
    }

    /* renamed from: a */
    View m2294a(int i) {
        return getChildAt(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:173:0x03aa, code lost:            if (r8 > 0) goto L642;     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x03b7, code lost:            r8 = 0;     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x03b8, code lost:            r14.measure(android.view.View.MeasureSpec.makeMeasureSpec(r8, r4), r2);        r9 = android.view.View.combineMeasuredStates(r9, r14.getMeasuredState() & (-16777216));        r2 = r2;        r4 = r3;     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x03b5, code lost:            if (r8 < 0) goto L641;     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01d1  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void m2295a(int r39, int r40) {
        /*
            Method dump skipped, instructions count: 1287
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.C0416Q.m2295a(int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e9  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void m2296a(int r25, int r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.C0416Q.m2296a(int, int, int, int):void");
    }

    /* renamed from: a */
    void m2297a(Canvas canvas) {
        int right;
        int left;
        int i;
        int virtualChildCount = getVirtualChildCount();
        boolean m2259a = C0408Ja.m2259a(this);
        for (int i2 = 0; i2 < virtualChildCount; i2++) {
            View m2294a = m2294a(i2);
            if (m2294a != null && m2294a.getVisibility() != 8 && m2305b(i2)) {
                a aVar = (a) m2294a.getLayoutParams();
                m2304b(canvas, m2259a ? m2294a.getRight() + ((ViewGroup.MarginLayoutParams) aVar).rightMargin : (m2294a.getLeft() - ((ViewGroup.MarginLayoutParams) aVar).leftMargin) - this.f2120l);
            }
        }
        if (m2305b(virtualChildCount)) {
            View m2294a2 = m2294a(virtualChildCount - 1);
            if (m2294a2 != null) {
                a aVar2 = (a) m2294a2.getLayoutParams();
                if (m2259a) {
                    left = m2294a2.getLeft();
                    i = ((ViewGroup.MarginLayoutParams) aVar2).leftMargin;
                    right = (left - i) - this.f2120l;
                } else {
                    right = m2294a2.getRight() + ((ViewGroup.MarginLayoutParams) aVar2).rightMargin;
                }
            } else if (m2259a) {
                right = getPaddingLeft();
            } else {
                left = getWidth();
                i = getPaddingRight();
                right = (left - i) - this.f2120l;
            }
            m2304b(canvas, right);
        }
    }

    /* renamed from: a */
    void m2298a(Canvas canvas, int i) {
        this.f2119k.setBounds(getPaddingLeft() + this.f2123o, i, (getWidth() - getPaddingRight()) - this.f2123o, this.f2121m + i);
        this.f2119k.draw(canvas);
    }

    /* renamed from: a */
    void m2299a(View view, int i, int i2, int i3, int i4, int i5) {
        measureChildWithMargins(view, i2, i3, i4, i5);
    }

    /* renamed from: b */
    int m2300b(View view) {
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:133:0x02dd, code lost:            if (r15 > 0) goto L506;     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x02ea, code lost:            r15 = 0;     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02eb, code lost:            r13.measure(r9, android.view.View.MeasureSpec.makeMeasureSpec(r15, r10));        r1 = android.view.View.combineMeasuredStates(r1, r13.getMeasuredState() & (-256));     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x02e8, code lost:            if (r15 < 0) goto L505;     */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0326  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void m2301b(int r34, int r35) {
        /*
            Method dump skipped, instructions count: 913
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.C0416Q.m2301b(int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x009e  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void m2302b(int r18, int r19, int r20, int r21) {
        /*
            r17 = this;
            r6 = r17
            int r7 = r17.getPaddingLeft()
            int r0 = r20 - r18
            int r1 = r17.getPaddingRight()
            int r8 = r0 - r1
            int r0 = r0 - r7
            int r1 = r17.getPaddingRight()
            int r9 = r0 - r1
            int r10 = r17.getVirtualChildCount()
            int r0 = r6.f2113e
            r1 = r0 & 112(0x70, float:1.57E-43)
            r2 = 8388615(0x800007, float:1.1754953E-38)
            r11 = r0 & r2
            r0 = 16
            if (r1 == r0) goto L3b
            r0 = 80
            if (r1 == r0) goto L2f
            int r0 = r17.getPaddingTop()
            goto L47
        L2f:
            int r0 = r17.getPaddingTop()
            int r0 = r0 + r21
            int r0 = r0 - r19
            int r1 = r6.f2114f
            int r0 = r0 - r1
            goto L47
        L3b:
            int r0 = r17.getPaddingTop()
            int r1 = r21 - r19
            int r2 = r6.f2114f
            int r1 = r1 - r2
            int r1 = r1 / 2
            int r0 = r0 + r1
        L47:
            r1 = 0
            r12 = 0
        L49:
            if (r12 >= r10) goto Lc7
            android.view.View r13 = r6.m2294a(r12)
            r14 = 1
            if (r13 != 0) goto L59
            int r1 = r6.m2306c(r12)
            int r0 = r0 + r1
            goto Lc4
        L59:
            int r1 = r13.getVisibility()
            r2 = 8
            if (r1 == r2) goto Lc4
            int r4 = r13.getMeasuredWidth()
            int r15 = r13.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r1 = r13.getLayoutParams()
            r5 = r1
            android.support.v7.widget.Q$a r5 = (android.support.v7.widget.C0416Q.a) r5
            int r1 = r5.f2125b
            if (r1 >= 0) goto L75
            r1 = r11
        L75:
            int r2 = p000a.p005b.p009c.p019h.C0107v.m518g(r17)
            int r1 = p000a.p005b.p009c.p019h.C0091f.m429a(r1, r2)
            r1 = r1 & 7
            if (r1 == r14) goto L8c
            r2 = 5
            if (r1 == r2) goto L89
            int r1 = r5.leftMargin
            int r1 = r1 + r7
        L87:
            r2 = r1
            goto L98
        L89:
            int r1 = r8 - r4
            goto L94
        L8c:
            int r1 = r9 - r4
            int r1 = r1 / 2
            int r1 = r1 + r7
            int r2 = r5.leftMargin
            int r1 = r1 + r2
        L94:
            int r2 = r5.rightMargin
            int r1 = r1 - r2
            goto L87
        L98:
            boolean r1 = r6.m2305b(r12)
            if (r1 == 0) goto La1
            int r1 = r6.f2121m
            int r0 = r0 + r1
        La1:
            int r1 = r5.topMargin
            int r16 = r0 + r1
            int r0 = r6.m2292a(r13)
            int r3 = r16 + r0
            r0 = r17
            r1 = r13
            r14 = r5
            r5 = r15
            r0.m2289a(r1, r2, r3, r4, r5)
            int r0 = r14.bottomMargin
            int r15 = r15 + r0
            int r0 = r6.m2300b(r13)
            int r15 = r15 + r0
            int r16 = r16 + r15
            int r0 = r6.m2293a(r13, r12)
            int r12 = r12 + r0
            r0 = r16
        Lc4:
            r1 = 1
            int r12 = r12 + r1
            goto L49
        Lc7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.C0416Q.m2302b(int, int, int, int):void");
    }

    /* renamed from: b */
    void m2303b(Canvas canvas) {
        int virtualChildCount = getVirtualChildCount();
        for (int i = 0; i < virtualChildCount; i++) {
            View m2294a = m2294a(i);
            if (m2294a != null && m2294a.getVisibility() != 8 && m2305b(i)) {
                m2298a(canvas, (m2294a.getTop() - ((ViewGroup.MarginLayoutParams) ((a) m2294a.getLayoutParams())).topMargin) - this.f2121m);
            }
        }
        if (m2305b(virtualChildCount)) {
            View m2294a2 = m2294a(virtualChildCount - 1);
            m2298a(canvas, m2294a2 == null ? (getHeight() - getPaddingBottom()) - this.f2121m : m2294a2.getBottom() + ((ViewGroup.MarginLayoutParams) ((a) m2294a2.getLayoutParams())).bottomMargin);
        }
    }

    /* renamed from: b */
    void m2304b(Canvas canvas, int i) {
        this.f2119k.setBounds(i, getPaddingTop() + this.f2123o, this.f2120l + i, (getHeight() - getPaddingBottom()) - this.f2123o);
        this.f2119k.draw(canvas);
    }

    /* renamed from: b */
    public boolean m2305b(int i) {
        if (i == 0) {
            return (this.f2122n & 1) != 0;
        }
        if (i == getChildCount()) {
            return (this.f2122n & 4) != 0;
        }
        if ((this.f2122n & 2) == 0) {
            return false;
        }
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (getChildAt(i2).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    int m2306c(int i) {
        return 0;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    @Override // android.view.ViewGroup
    public a generateDefaultLayoutParams() {
        int i = this.f2112d;
        if (i == 0) {
            return new a(-2, -2);
        }
        if (i == 1) {
            return new a(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i;
        if (this.f2110b < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.f2110b;
        if (childCount <= i2) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i2);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f2110b == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int i3 = this.f2111c;
        if (this.f2112d == 1 && (i = this.f2113e & C0121j.AppCompatTheme_windowActionBarOverlay) != 48) {
            if (i == 16) {
                i3 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f2114f) / 2;
            } else if (i == 80) {
                i3 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f2114f;
            }
        }
        return i3 + ((ViewGroup.MarginLayoutParams) ((a) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f2110b;
    }

    public Drawable getDividerDrawable() {
        return this.f2119k;
    }

    public int getDividerPadding() {
        return this.f2123o;
    }

    public int getDividerWidth() {
        return this.f2120l;
    }

    public int getGravity() {
        return this.f2113e;
    }

    public int getOrientation() {
        return this.f2112d;
    }

    public int getShowDividers() {
        return this.f2122n;
    }

    int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f2115g;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.f2119k == null) {
            return;
        }
        if (this.f2112d == 1) {
            m2303b(canvas);
        } else {
            m2297a(canvas);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(C0416Q.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(C0416Q.class.getName());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f2112d == 1) {
            m2302b(i, i2, i3, i4);
        } else {
            m2296a(i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (this.f2112d == 1) {
            m2301b(i, i2);
        } else {
            m2295a(i, i2);
        }
    }

    public void setBaselineAligned(boolean z) {
        this.f2109a = z;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i >= 0 && i < getChildCount()) {
            this.f2110b = i;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f2119k) {
            return;
        }
        this.f2119k = drawable;
        if (drawable != null) {
            this.f2120l = drawable.getIntrinsicWidth();
            this.f2121m = drawable.getIntrinsicHeight();
        } else {
            this.f2120l = 0;
            this.f2121m = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i) {
        this.f2123o = i;
    }

    public void setGravity(int i) {
        if (this.f2113e != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & C0121j.AppCompatTheme_windowActionBarOverlay) == 0) {
                i |= 48;
            }
            this.f2113e = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        int i3 = this.f2113e;
        if ((8388615 & i3) != i2) {
            this.f2113e = i2 | ((-8388616) & i3);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.f2116h = z;
    }

    public void setOrientation(int i) {
        if (this.f2112d != i) {
            this.f2112d = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.f2122n) {
            requestLayout();
        }
        this.f2122n = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = i & C0121j.AppCompatTheme_windowActionBarOverlay;
        int i3 = this.f2113e;
        if ((i3 & C0121j.AppCompatTheme_windowActionBarOverlay) != i2) {
            this.f2113e = i2 | (i3 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.f2115g = Math.max(0.0f, f);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
