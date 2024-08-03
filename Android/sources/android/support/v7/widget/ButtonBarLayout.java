package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import p000a.p005b.p009c.p019h.C0107v;
import p000a.p005b.p022d.p023a.C0117f;
import p000a.p005b.p022d.p023a.C0121j;

/* loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {

    /* renamed from: a */
    private boolean f1979a;

    /* renamed from: b */
    private int f1980b;

    /* renamed from: c */
    private int f1981c;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1980b = -1;
        this.f1981c = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0121j.ButtonBarLayout);
        this.f1979a = obtainStyledAttributes.getBoolean(C0121j.ButtonBarLayout_allowStacking, true);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    private int m2147a(int i) {
        int childCount = getChildCount();
        while (i < childCount) {
            if (getChildAt(i).getVisibility() == 0) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: a */
    private boolean m2148a() {
        return getOrientation() == 1;
    }

    private void setStacked(boolean z) {
        setOrientation(z ? 1 : 0);
        setGravity(z ? 5 : 80);
        View findViewById = findViewById(C0117f.spacer);
        if (findViewById != null) {
            findViewById.setVisibility(z ? 8 : 4);
        }
        for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
            bringChildToFront(getChildAt(childCount));
        }
    }

    @Override // android.view.View
    public int getMinimumHeight() {
        return Math.max(this.f1981c, super.getMinimumHeight());
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        int i3;
        boolean z;
        int size = View.MeasureSpec.getSize(i);
        int i4 = 0;
        if (this.f1979a) {
            if (size > this.f1980b && m2148a()) {
                setStacked(false);
            }
            this.f1980b = size;
        }
        if (m2148a() || View.MeasureSpec.getMode(i) != 1073741824) {
            i3 = i;
            z = false;
        } else {
            i3 = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z = true;
        }
        super.onMeasure(i3, i2);
        if (this.f1979a && !m2148a()) {
            if ((getMeasuredWidthAndState() & (-16777216)) == 16777216) {
                setStacked(true);
                z = true;
            }
        }
        if (z) {
            super.onMeasure(i, i2);
        }
        int m2147a = m2147a(0);
        if (m2147a >= 0) {
            View childAt = getChildAt(m2147a);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int paddingTop = getPaddingTop() + childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin + 0;
            if (m2148a()) {
                int m2147a2 = m2147a(m2147a + 1);
                if (m2147a2 >= 0) {
                    paddingTop += getChildAt(m2147a2).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f));
                }
                i4 = paddingTop;
            } else {
                i4 = paddingTop + getPaddingBottom();
            }
        }
        if (C0107v.m520h(this) != i4) {
            setMinimumHeight(i4);
        }
    }

    public void setAllowStacking(boolean z) {
        if (this.f1979a != z) {
            this.f1979a = z;
            if (!this.f1979a && getOrientation() == 1) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
