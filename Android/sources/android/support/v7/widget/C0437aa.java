package android.support.v7.widget;

import android.R;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AbstractC0322a;
import android.support.v7.widget.C0416Q;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import p000a.p005b.p022d.p023a.C0112a;
import p000a.p005b.p022d.p029e.C0130a;

/* renamed from: android.support.v7.widget.aa */
/* loaded from: classes.dex */
public class C0437aa extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* renamed from: a */
    private static final Interpolator f2314a = new DecelerateInterpolator();

    /* renamed from: b */
    Runnable f2315b;

    /* renamed from: c */
    private b f2316c;

    /* renamed from: d */
    C0416Q f2317d;

    /* renamed from: e */
    private Spinner f2318e;

    /* renamed from: f */
    private boolean f2319f;

    /* renamed from: g */
    int f2320g;

    /* renamed from: h */
    int f2321h;

    /* renamed from: i */
    private int f2322i;

    /* renamed from: j */
    private int f2323j;

    /* renamed from: android.support.v7.widget.aa$a */
    /* loaded from: classes.dex */
    public class a extends BaseAdapter {
        a() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return C0437aa.this.f2317d.getChildCount();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            return ((c) C0437aa.this.f2317d.getChildAt(i)).m2441a();
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                return C0437aa.this.m2439a((AbstractC0322a.c) getItem(i), true);
            }
            ((c) view).m2442a((AbstractC0322a.c) getItem(i));
            return view;
        }
    }

    /* renamed from: android.support.v7.widget.aa$b */
    /* loaded from: classes.dex */
    public class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ((c) view).m2441a().m1809e();
            int childCount = C0437aa.this.f2317d.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = C0437aa.this.f2317d.getChildAt(i);
                childAt.setSelected(childAt == view);
            }
        }
    }

    /* renamed from: android.support.v7.widget.aa$c */
    /* loaded from: classes.dex */
    public class c extends LinearLayout {

        /* renamed from: a */
        private final int[] f2326a;

        /* renamed from: b */
        private AbstractC0322a.c f2327b;

        /* renamed from: c */
        private TextView f2328c;

        /* renamed from: d */
        private ImageView f2329d;

        /* renamed from: e */
        private View f2330e;

        public c(Context context, AbstractC0322a.c cVar, boolean z) {
            super(context, null, C0112a.actionBarTabStyle);
            this.f2326a = new int[]{R.attr.background};
            this.f2327b = cVar;
            C0479va m2571a = C0479va.m2571a(context, null, this.f2326a, C0112a.actionBarTabStyle, 0);
            if (m2571a.m2589g(0)) {
                setBackgroundDrawable(m2571a.m2579b(0));
            }
            m2571a.m2576a();
            if (z) {
                setGravity(8388627);
            }
            m2443b();
        }

        /* renamed from: a */
        public AbstractC0322a.c m2441a() {
            return this.f2327b;
        }

        /* renamed from: a */
        public void m2442a(AbstractC0322a.c cVar) {
            this.f2327b = cVar;
            m2443b();
        }

        /* renamed from: b */
        public void m2443b() {
            AbstractC0322a.c cVar = this.f2327b;
            View m1806b = cVar.m1806b();
            if (m1806b != null) {
                ViewParent parent = m1806b.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(m1806b);
                    }
                    addView(m1806b);
                }
                this.f2330e = m1806b;
                TextView textView = this.f2328c;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f2329d;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f2329d.setImageDrawable(null);
                    return;
                }
                return;
            }
            View view = this.f2330e;
            if (view != null) {
                removeView(view);
                this.f2330e = null;
            }
            Drawable m1807c = cVar.m1807c();
            CharSequence m1808d = cVar.m1808d();
            if (m1807c != null) {
                if (this.f2329d == null) {
                    C0474t c0474t = new C0474t(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    c0474t.setLayoutParams(layoutParams);
                    addView(c0474t, 0);
                    this.f2329d = c0474t;
                }
                this.f2329d.setImageDrawable(m1807c);
                this.f2329d.setVisibility(0);
            } else {
                ImageView imageView2 = this.f2329d;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.f2329d.setImageDrawable(null);
                }
            }
            boolean z = !TextUtils.isEmpty(m1808d);
            if (z) {
                if (this.f2328c == null) {
                    C0405I c0405i = new C0405I(getContext(), null, C0112a.actionBarTabTextStyle);
                    c0405i.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    c0405i.setLayoutParams(layoutParams2);
                    addView(c0405i);
                    this.f2328c = c0405i;
                }
                this.f2328c.setText(m1808d);
                this.f2328c.setVisibility(0);
            } else {
                TextView textView2 = this.f2328c;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    this.f2328c.setText((CharSequence) null);
                }
            }
            ImageView imageView3 = this.f2329d;
            if (imageView3 != null) {
                imageView3.setContentDescription(cVar.m1805a());
            }
            C0396Da.m2193a(this, z ? null : cVar.m1805a());
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName(AbstractC0322a.c.class.getName());
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(AbstractC0322a.c.class.getName());
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (C0437aa.this.f2320g > 0) {
                int measuredWidth = getMeasuredWidth();
                int i3 = C0437aa.this.f2320g;
                if (measuredWidth > i3) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
                }
            }
        }

        @Override // android.view.View
        public void setSelected(boolean z) {
            boolean z2 = isSelected() != z;
            super.setSelected(z);
            if (z2 && z) {
                sendAccessibilityEvent(4);
            }
        }
    }

    /* renamed from: a */
    private Spinner m2435a() {
        C0392C c0392c = new C0392C(getContext(), null, C0112a.actionDropDownStyle);
        c0392c.setLayoutParams(new C0416Q.a(-2, -1));
        c0392c.setOnItemSelectedListener(this);
        return c0392c;
    }

    /* renamed from: b */
    private boolean m2436b() {
        Spinner spinner = this.f2318e;
        return spinner != null && spinner.getParent() == this;
    }

    /* renamed from: c */
    private void m2437c() {
        if (m2436b()) {
            return;
        }
        if (this.f2318e == null) {
            this.f2318e = m2435a();
        }
        removeView(this.f2317d);
        addView(this.f2318e, new ViewGroup.LayoutParams(-2, -1));
        if (this.f2318e.getAdapter() == null) {
            this.f2318e.setAdapter((SpinnerAdapter) new a());
        }
        Runnable runnable = this.f2315b;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.f2315b = null;
        }
        this.f2318e.setSelection(this.f2323j);
    }

    /* renamed from: d */
    private boolean m2438d() {
        if (!m2436b()) {
            return false;
        }
        removeView(this.f2318e);
        addView(this.f2317d, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.f2318e.getSelectedItemPosition());
        return false;
    }

    /* renamed from: a */
    c m2439a(AbstractC0322a.c cVar, boolean z) {
        c cVar2 = new c(getContext(), cVar, z);
        if (z) {
            cVar2.setBackgroundDrawable(null);
            cVar2.setLayoutParams(new AbsListView.LayoutParams(-1, this.f2322i));
        } else {
            cVar2.setFocusable(true);
            if (this.f2316c == null) {
                this.f2316c = new b();
            }
            cVar2.setOnClickListener(this.f2316c);
        }
        return cVar2;
    }

    /* renamed from: a */
    public void m2440a(int i) {
        View childAt = this.f2317d.getChildAt(i);
        Runnable runnable = this.f2315b;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        this.f2315b = new RunnableC0435Z(this, childAt);
        post(this.f2315b);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f2315b;
        if (runnable != null) {
            post(runnable);
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0130a m617a = C0130a.m617a(getContext());
        setContentHeight(m617a.m622e());
        this.f2321h = m617a.m621d();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f2315b;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        ((c) view).m2441a().m1809e();
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int mode = View.MeasureSpec.getMode(i);
        boolean z = mode == 1073741824;
        setFillViewport(z);
        int childCount = this.f2317d.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            i3 = -1;
        } else {
            if (childCount > 2) {
                this.f2320g = (int) (View.MeasureSpec.getSize(i) * 0.4f);
            } else {
                this.f2320g = View.MeasureSpec.getSize(i) / 2;
            }
            i3 = Math.min(this.f2320g, this.f2321h);
        }
        this.f2320g = i3;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f2322i, 1073741824);
        if (!z && this.f2319f) {
            this.f2317d.measure(0, makeMeasureSpec);
            if (this.f2317d.getMeasuredWidth() > View.MeasureSpec.getSize(i)) {
                m2437c();
                int measuredWidth = getMeasuredWidth();
                super.onMeasure(i, makeMeasureSpec);
                int measuredWidth2 = getMeasuredWidth();
                if (z || measuredWidth == measuredWidth2) {
                }
                setTabSelected(this.f2323j);
                return;
            }
        }
        m2438d();
        int measuredWidth3 = getMeasuredWidth();
        super.onMeasure(i, makeMeasureSpec);
        int measuredWidth22 = getMeasuredWidth();
        if (z) {
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void setAllowCollapse(boolean z) {
        this.f2319f = z;
    }

    public void setContentHeight(int i) {
        this.f2322i = i;
        requestLayout();
    }

    public void setTabSelected(int i) {
        this.f2323j = i;
        int childCount = this.f2317d.getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = this.f2317d.getChildAt(i2);
            boolean z = i2 == i;
            childAt.setSelected(z);
            if (z) {
                m2440a(i);
            }
            i2++;
        }
        Spinner spinner = this.f2318e;
        if (spinner == null || i < 0) {
            return;
        }
        spinner.setSelection(i);
    }
}
