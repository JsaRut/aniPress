package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import p000a.p005b.p009c.p019h.C0107v;
import p000a.p005b.p022d.p023a.C0117f;
import p000a.p005b.p022d.p023a.C0121j;

/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: a */
    private boolean f1905a;

    /* renamed from: b */
    private View f1906b;

    /* renamed from: c */
    private View f1907c;

    /* renamed from: d */
    private View f1908d;

    /* renamed from: e */
    Drawable f1909e;

    /* renamed from: f */
    Drawable f1910f;

    /* renamed from: g */
    Drawable f1911g;

    /* renamed from: h */
    boolean f1912h;

    /* renamed from: i */
    boolean f1913i;

    /* renamed from: j */
    private int f1914j;

    public ActionBarContainer(Context context) {
        this(context, null);
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0107v.m500a(this, new C0438b(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0121j.ActionBar);
        this.f1909e = obtainStyledAttributes.getDrawable(C0121j.ActionBar_background);
        this.f1910f = obtainStyledAttributes.getDrawable(C0121j.ActionBar_backgroundStacked);
        this.f1914j = obtainStyledAttributes.getDimensionPixelSize(C0121j.ActionBar_height, -1);
        if (getId() == C0117f.split_action_bar) {
            this.f1912h = true;
            this.f1911g = obtainStyledAttributes.getDrawable(C0121j.ActionBar_backgroundSplit);
        }
        obtainStyledAttributes.recycle();
        boolean z = false;
        if (!this.f1912h ? !(this.f1909e != null || this.f1910f != null) : this.f1911g == null) {
            z = true;
        }
        setWillNotDraw(z);
    }

    /* renamed from: a */
    private int m2102a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    /* renamed from: b */
    private boolean m2103b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f1909e;
        if (drawable != null && drawable.isStateful()) {
            this.f1909e.setState(getDrawableState());
        }
        Drawable drawable2 = this.f1910f;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f1910f.setState(getDrawableState());
        }
        Drawable drawable3 = this.f1911g;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f1911g.setState(getDrawableState());
    }

    public View getTabContainer() {
        return this.f1906b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1909e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f1910f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f1911g;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f1907c = findViewById(C0117f.action_bar);
        this.f1908d = findViewById(C0117f.action_context_bar);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f1905a || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Drawable drawable;
        Drawable drawable2;
        int left;
        int top;
        int right;
        View view;
        super.onLayout(z, i, i2, i3, i4);
        View view2 = this.f1906b;
        boolean z2 = true;
        boolean z3 = false;
        boolean z4 = (view2 == null || view2.getVisibility() == 8) ? false : true;
        if (view2 != null && view2.getVisibility() != 8) {
            int measuredHeight = getMeasuredHeight();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view2.getLayoutParams();
            view2.layout(i, (measuredHeight - view2.getMeasuredHeight()) - layoutParams.bottomMargin, i3, measuredHeight - layoutParams.bottomMargin);
        }
        if (this.f1912h) {
            Drawable drawable3 = this.f1911g;
            if (drawable3 != null) {
                drawable3.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z2 = false;
            }
        } else {
            if (this.f1909e != null) {
                if (this.f1907c.getVisibility() == 0) {
                    drawable2 = this.f1909e;
                    left = this.f1907c.getLeft();
                    top = this.f1907c.getTop();
                    right = this.f1907c.getRight();
                    view = this.f1907c;
                } else {
                    View view3 = this.f1908d;
                    if (view3 == null || view3.getVisibility() != 0) {
                        this.f1909e.setBounds(0, 0, 0, 0);
                        z3 = true;
                    } else {
                        drawable2 = this.f1909e;
                        left = this.f1908d.getLeft();
                        top = this.f1908d.getTop();
                        right = this.f1908d.getRight();
                        view = this.f1908d;
                    }
                }
                drawable2.setBounds(left, top, right, view.getBottom());
                z3 = true;
            }
            this.f1913i = z4;
            if (!z4 || (drawable = this.f1910f) == null) {
                z2 = z3;
            } else {
                drawable.setBounds(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            }
        }
        if (z2) {
            invalidate();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005a  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r4, int r5) {
        /*
            r3 = this;
            android.view.View r0 = r3.f1907c
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != 0) goto L1c
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            if (r0 != r1) goto L1c
            int r0 = r3.f1914j
            if (r0 < 0) goto L1c
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            int r5 = java.lang.Math.min(r0, r5)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r1)
        L1c:
            super.onMeasure(r4, r5)
            android.view.View r4 = r3.f1907c
            if (r4 != 0) goto L24
            return
        L24:
            int r4 = android.view.View.MeasureSpec.getMode(r5)
            android.view.View r0 = r3.f1906b
            if (r0 == 0) goto L6f
            int r0 = r0.getVisibility()
            r2 = 8
            if (r0 == r2) goto L6f
            r0 = 1073741824(0x40000000, float:2.0)
            if (r4 == r0) goto L6f
            android.view.View r0 = r3.f1907c
            boolean r0 = r3.m2103b(r0)
            if (r0 != 0) goto L47
            android.view.View r0 = r3.f1907c
        L42:
            int r0 = r3.m2102a(r0)
            goto L53
        L47:
            android.view.View r0 = r3.f1908d
            boolean r0 = r3.m2103b(r0)
            if (r0 != 0) goto L52
            android.view.View r0 = r3.f1908d
            goto L42
        L52:
            r0 = 0
        L53:
            if (r4 != r1) goto L5a
            int r4 = android.view.View.MeasureSpec.getSize(r5)
            goto L5d
        L5a:
            r4 = 2147483647(0x7fffffff, float:NaN)
        L5d:
            int r5 = r3.getMeasuredWidth()
            android.view.View r1 = r3.f1906b
            int r1 = r3.m2102a(r1)
            int r0 = r0 + r1
            int r4 = java.lang.Math.min(r0, r4)
            r3.setMeasuredDimension(r5, r4)
        L6f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ActionBarContainer.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f1909e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f1909e);
        }
        this.f1909e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f1907c;
            if (view != null) {
                this.f1909e.setBounds(view.getLeft(), this.f1907c.getTop(), this.f1907c.getRight(), this.f1907c.getBottom());
            }
        }
        boolean z = true;
        if (!this.f1912h ? this.f1909e != null || this.f1910f != null : this.f1911g != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f1911g;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f1911g);
        }
        this.f1911g = drawable;
        boolean z = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f1912h && (drawable2 = this.f1911g) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f1912h ? !(this.f1909e != null || this.f1910f != null) : this.f1911g == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f1910f;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f1910f);
        }
        this.f1910f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f1913i && (drawable2 = this.f1910f) != null) {
                drawable2.setBounds(this.f1906b.getLeft(), this.f1906b.getTop(), this.f1906b.getRight(), this.f1906b.getBottom());
            }
        }
        boolean z = true;
        if (!this.f1912h ? this.f1909e != null || this.f1910f != null : this.f1911g != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setTabContainer(C0437aa c0437aa) {
        View view = this.f1906b;
        if (view != null) {
            removeView(view);
        }
        this.f1906b = c0437aa;
        if (c0437aa != null) {
            addView(c0437aa);
            ViewGroup.LayoutParams layoutParams = c0437aa.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            c0437aa.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z) {
        this.f1905a = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f1909e;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.f1910f;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.f1911g;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.f1909e && !this.f1912h) || (drawable == this.f1910f && this.f1913i) || ((drawable == this.f1911g && this.f1912h) || super.verifyDrawable(drawable));
    }
}
