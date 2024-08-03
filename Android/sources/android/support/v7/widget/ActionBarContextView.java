package android.support.v7.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import p000a.p005b.p009c.p019h.C0074H;
import p000a.p005b.p009c.p019h.C0107v;
import p000a.p005b.p022d.p023a.C0112a;
import p000a.p005b.p022d.p023a.C0117f;
import p000a.p005b.p022d.p023a.C0118g;
import p000a.p005b.p022d.p023a.C0121j;

/* loaded from: classes.dex */
public class ActionBarContextView extends AbstractC0436a {

    /* renamed from: i */
    private CharSequence f1915i;

    /* renamed from: j */
    private CharSequence f1916j;

    /* renamed from: k */
    private View f1917k;

    /* renamed from: l */
    private View f1918l;

    /* renamed from: m */
    private LinearLayout f1919m;

    /* renamed from: n */
    private TextView f1920n;

    /* renamed from: o */
    private TextView f1921o;

    /* renamed from: p */
    private int f1922p;

    /* renamed from: q */
    private int f1923q;

    /* renamed from: r */
    private boolean f1924r;

    /* renamed from: s */
    private int f1925s;

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0112a.actionModeStyle);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0479va m2571a = C0479va.m2571a(context, attributeSet, C0121j.ActionMode, i, 0);
        C0107v.m500a(this, m2571a.m2579b(C0121j.ActionMode_background));
        this.f1922p = m2571a.m2588g(C0121j.ActionMode_titleTextStyle, 0);
        this.f1923q = m2571a.m2588g(C0121j.ActionMode_subtitleTextStyle, 0);
        this.f2307e = m2571a.m2586f(C0121j.ActionMode_height, 0);
        this.f1925s = m2571a.m2588g(C0121j.ActionMode_closeItemLayout, C0118g.abc_action_mode_close_item_material);
        m2571a.m2576a();
    }

    /* renamed from: e */
    private void m2104e() {
        if (this.f1919m == null) {
            LayoutInflater.from(getContext()).inflate(C0118g.abc_action_bar_title_item, this);
            this.f1919m = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f1920n = (TextView) this.f1919m.findViewById(C0117f.action_bar_title);
            this.f1921o = (TextView) this.f1919m.findViewById(C0117f.action_bar_subtitle);
            if (this.f1922p != 0) {
                this.f1920n.setTextAppearance(getContext(), this.f1922p);
            }
            if (this.f1923q != 0) {
                this.f1921o.setTextAppearance(getContext(), this.f1923q);
            }
        }
        this.f1920n.setText(this.f1915i);
        this.f1921o.setText(this.f1916j);
        boolean z = !TextUtils.isEmpty(this.f1915i);
        boolean z2 = !TextUtils.isEmpty(this.f1916j);
        int i = 0;
        this.f1921o.setVisibility(z2 ? 0 : 8);
        LinearLayout linearLayout = this.f1919m;
        if (!z && !z2) {
            i = 8;
        }
        linearLayout.setVisibility(i);
        if (this.f1919m.getParent() == null) {
            addView(this.f1919m);
        }
    }

    @Override // android.support.v7.widget.AbstractC0436a
    /* renamed from: a */
    public /* bridge */ /* synthetic */ C0074H mo2105a(int i, long j) {
        return super.mo2105a(i, j);
    }

    /* renamed from: a */
    public void m2106a() {
        if (this.f1917k == null) {
            m2109c();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001f, code lost:            if (r0.getParent() == null) goto L5;     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m2107a(p000a.p005b.p022d.p029e.AbstractC0131b r4) {
        /*
            r3 = this;
            android.view.View r0 = r3.f1917k
            if (r0 != 0) goto L1b
            android.content.Context r0 = r3.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r1 = r3.f1925s
            r2 = 0
            android.view.View r0 = r0.inflate(r1, r3, r2)
            r3.f1917k = r0
        L15:
            android.view.View r0 = r3.f1917k
            r3.addView(r0)
            goto L22
        L1b:
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L22
            goto L15
        L22:
            android.view.View r0 = r3.f1917k
            int r1 = p000a.p005b.p022d.p023a.C0117f.action_mode_close_button
            android.view.View r0 = r0.findViewById(r1)
            android.support.v7.widget.c r1 = new android.support.v7.widget.c
            r1.<init>(r3, r4)
            r0.setOnClickListener(r1)
            android.view.Menu r4 = r4.mo634c()
            android.support.v7.view.menu.l r4 = (android.support.v7.view.menu.C0366l) r4
            android.support.v7.widget.g r0 = r3.f2306d
            if (r0 == 0) goto L3f
            r0.m2456c()
        L3f:
            android.support.v7.widget.g r0 = new android.support.v7.widget.g
            android.content.Context r1 = r3.getContext()
            r0.<init>(r1)
            r3.f2306d = r0
            android.support.v7.widget.g r0 = r3.f2306d
            r1 = 1
            r0.m2455c(r1)
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r1 = -2
            r2 = -1
            r0.<init>(r1, r2)
            android.support.v7.widget.g r1 = r3.f2306d
            android.content.Context r2 = r3.f2304b
            r4.m2017a(r1, r2)
            android.support.v7.widget.g r4 = r3.f2306d
            android.support.v7.view.menu.w r4 = r4.mo1975b(r3)
            android.support.v7.widget.ActionMenuView r4 = (android.support.v7.widget.ActionMenuView) r4
            r3.f2305c = r4
            android.support.v7.widget.ActionMenuView r4 = r3.f2305c
            r1 = 0
            p000a.p005b.p009c.p019h.C0107v.m500a(r4, r1)
            android.support.v7.widget.ActionMenuView r4 = r3.f2305c
            r3.addView(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ActionBarContextView.m2107a(a.b.d.e.b):void");
    }

    /* renamed from: b */
    public boolean m2108b() {
        return this.f1924r;
    }

    /* renamed from: c */
    public void m2109c() {
        removeAllViews();
        this.f1918l = null;
        this.f2305c = null;
    }

    /* renamed from: d */
    public boolean m2110d() {
        C0448g c0448g = this.f2306d;
        if (c0448g != null) {
            return c0448g.m2462i();
        }
        return false;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // android.support.v7.widget.AbstractC0436a
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // android.support.v7.widget.AbstractC0436a
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f1916j;
    }

    public CharSequence getTitle() {
        return this.f1915i;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0448g c0448g = this.f2306d;
        if (c0448g != null) {
            c0448g.m2458e();
            this.f2306d.m2459f();
        }
    }

    @Override // android.support.v7.widget.AbstractC0436a, android.view.View
    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() != 32) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            return;
        }
        accessibilityEvent.setSource(this);
        accessibilityEvent.setClassName(ActionBarContextView.class.getName());
        accessibilityEvent.setPackageName(getContext().getPackageName());
        accessibilityEvent.setContentDescription(this.f1915i);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        boolean m2259a = C0408Ja.m2259a(this);
        int paddingRight = m2259a ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.f1917k;
        if (view == null || view.getVisibility() == 8) {
            i5 = paddingRight;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1917k.getLayoutParams();
            int i6 = m2259a ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i7 = m2259a ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int m2429a = AbstractC0436a.m2429a(paddingRight, i6, m2259a);
            i5 = AbstractC0436a.m2429a(m2429a + m2433a(this.f1917k, m2429a, paddingTop, paddingTop2, m2259a), i7, m2259a);
        }
        LinearLayout linearLayout = this.f1919m;
        if (linearLayout != null && this.f1918l == null && linearLayout.getVisibility() != 8) {
            i5 += m2433a(this.f1919m, i5, paddingTop, paddingTop2, m2259a);
        }
        int i8 = i5;
        View view2 = this.f1918l;
        if (view2 != null) {
            m2433a(view2, i8, paddingTop, paddingTop2, m2259a);
        }
        int paddingLeft = m2259a ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.f2305c;
        if (actionMenuView != null) {
            m2433a(actionMenuView, paddingLeft, paddingTop, paddingTop2, !m2259a);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException(ActionBarContextView.class.getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        }
        if (View.MeasureSpec.getMode(i2) == 0) {
            throw new IllegalStateException(ActionBarContextView.class.getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
        int size = View.MeasureSpec.getSize(i);
        int i3 = this.f2307e;
        if (i3 <= 0) {
            i3 = View.MeasureSpec.getSize(i2);
        }
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int i4 = i3 - paddingTop;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
        View view = this.f1917k;
        if (view != null) {
            int m2432a = m2432a(view, paddingLeft, makeMeasureSpec, 0);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1917k.getLayoutParams();
            paddingLeft = m2432a - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f2305c;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = m2432a(this.f2305c, paddingLeft, makeMeasureSpec, 0);
        }
        LinearLayout linearLayout = this.f1919m;
        if (linearLayout != null && this.f1918l == null) {
            if (this.f1924r) {
                this.f1919m.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                int measuredWidth = this.f1919m.getMeasuredWidth();
                boolean z = measuredWidth <= paddingLeft;
                if (z) {
                    paddingLeft -= measuredWidth;
                }
                this.f1919m.setVisibility(z ? 0 : 8);
            } else {
                paddingLeft = m2432a(linearLayout, paddingLeft, makeMeasureSpec, 0);
            }
        }
        View view2 = this.f1918l;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i5 = layoutParams.width != -2 ? 1073741824 : Integer.MIN_VALUE;
            int i6 = layoutParams.width;
            if (i6 >= 0) {
                paddingLeft = Math.min(i6, paddingLeft);
            }
            int i7 = layoutParams.height == -2 ? Integer.MIN_VALUE : 1073741824;
            int i8 = layoutParams.height;
            if (i8 >= 0) {
                i4 = Math.min(i8, i4);
            }
            this.f1918l.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i5), View.MeasureSpec.makeMeasureSpec(i4, i7));
        }
        if (this.f2307e > 0) {
            setMeasuredDimension(size, i3);
            return;
        }
        int childCount = getChildCount();
        int i9 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            int measuredHeight = getChildAt(i10).getMeasuredHeight() + paddingTop;
            if (measuredHeight > i9) {
                i9 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i9);
    }

    @Override // android.support.v7.widget.AbstractC0436a, android.view.View
    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.support.v7.widget.AbstractC0436a
    public void setContentHeight(int i) {
        this.f2307e = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f1918l;
        if (view2 != null) {
            removeView(view2);
        }
        this.f1918l = view;
        if (view != null && (linearLayout = this.f1919m) != null) {
            removeView(linearLayout);
            this.f1919m = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f1916j = charSequence;
        m2104e();
    }

    public void setTitle(CharSequence charSequence) {
        this.f1915i = charSequence;
        m2104e();
    }

    public void setTitleOptional(boolean z) {
        if (z != this.f1924r) {
            requestLayout();
        }
        this.f1924r = z;
    }

    @Override // android.support.v7.widget.AbstractC0436a, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
