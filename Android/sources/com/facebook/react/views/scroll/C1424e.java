package com.facebook.react.views.scroll;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.OverScroller;
import com.facebook.react.uimanager.C1363p;
import com.facebook.react.uimanager.C1377z;
import com.facebook.react.uimanager.InterfaceC1376y;
import com.facebook.react.uimanager.events.C1336i;
import com.facebook.react.views.view.C1514f;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Locale;
import p000a.p005b.p009c.p018g.C0066c;
import p000a.p005b.p009c.p019h.C0107v;
import p139d.p143b.p204k.p205a.C2038a;

/* renamed from: com.facebook.react.views.scroll.e */
/* loaded from: classes.dex */
public class C1424e extends HorizontalScrollView implements InterfaceC1376y {

    /* renamed from: a */
    private static Field f5218a = null;

    /* renamed from: b */
    private static boolean f5219b = false;

    /* renamed from: c */
    private final C1421b f5220c;

    /* renamed from: d */
    private final OverScroller f5221d;

    /* renamed from: e */
    private final C1432m f5222e;

    /* renamed from: f */
    private final Rect f5223f;

    /* renamed from: g */
    private boolean f5224g;

    /* renamed from: h */
    private Rect f5225h;

    /* renamed from: i */
    private String f5226i;

    /* renamed from: j */
    private boolean f5227j;

    /* renamed from: k */
    private boolean f5228k;

    /* renamed from: l */
    private Runnable f5229l;

    /* renamed from: m */
    private boolean f5230m;

    /* renamed from: n */
    private boolean f5231n;

    /* renamed from: o */
    private boolean f5232o;

    /* renamed from: p */
    private InterfaceC1420a f5233p;

    /* renamed from: q */
    private String f5234q;

    /* renamed from: r */
    private Drawable f5235r;

    /* renamed from: s */
    private int f5236s;

    /* renamed from: t */
    private int f5237t;

    /* renamed from: u */
    private float f5238u;

    /* renamed from: v */
    private List<Integer> f5239v;

    /* renamed from: w */
    private boolean f5240w;

    /* renamed from: x */
    private boolean f5241x;

    /* renamed from: y */
    private C1514f f5242y;

    public C1424e(Context context, InterfaceC1420a interfaceC1420a) {
        super(context);
        this.f5220c = new C1421b();
        this.f5222e = new C1432m();
        this.f5223f = new Rect();
        this.f5226i = "hidden";
        this.f5228k = false;
        this.f5231n = true;
        this.f5233p = null;
        this.f5236s = 0;
        this.f5237t = 0;
        this.f5238u = 0.985f;
        this.f5240w = true;
        this.f5241x = true;
        this.f5242y = new C1514f(this);
        this.f5233p = interfaceC1420a;
        this.f5221d = getOverScrollerFromParent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m6057a(int i) {
        int i2;
        int min;
        int i3;
        int i4;
        int i5;
        if (getChildCount() <= 0) {
            return;
        }
        if (this.f5237t == 0 && this.f5239v == null) {
            m6065c(i);
            return;
        }
        int max = Math.max(0, computeHorizontalScrollRange() - getWidth());
        int m6062b = m6062b(i);
        int width = (getWidth() - C0107v.m522j(this)) - C0107v.m521i(this);
        boolean z = C0066c.m277a(Locale.getDefault()) == 1;
        if (z) {
            m6062b = max - m6062b;
            i2 = -i;
        } else {
            i2 = i;
        }
        List<Integer> list = this.f5239v;
        if (list != null) {
            int intValue = list.get(0).intValue();
            List<Integer> list2 = this.f5239v;
            i3 = list2.get(list2.size() - 1).intValue();
            int i6 = max;
            i4 = 0;
            for (int i7 = 0; i7 < this.f5239v.size(); i7++) {
                int intValue2 = this.f5239v.get(i7).intValue();
                if (intValue2 <= m6062b && m6062b - intValue2 < m6062b - i4) {
                    i4 = intValue2;
                }
                if (intValue2 >= m6062b && intValue2 - m6062b < i6 - m6062b) {
                    i6 = intValue2;
                }
            }
            i5 = intValue;
            min = i6;
        } else {
            double snapInterval = getSnapInterval();
            double d2 = m6062b;
            Double.isNaN(d2);
            Double.isNaN(snapInterval);
            double d3 = d2 / snapInterval;
            double floor = Math.floor(d3);
            Double.isNaN(snapInterval);
            int i8 = (int) (floor * snapInterval);
            double ceil = Math.ceil(d3);
            Double.isNaN(snapInterval);
            min = Math.min((int) (ceil * snapInterval), max);
            i3 = max;
            i4 = i8;
            i5 = 0;
        }
        int i9 = m6062b - i4;
        int i10 = min - m6062b;
        int i11 = i9 < i10 ? i4 : min;
        int scrollX = getScrollX();
        if (z) {
            scrollX = max - scrollX;
        }
        if (!this.f5241x && m6062b >= i3) {
            if (scrollX < i3) {
                i11 = i3;
            }
            i11 = m6062b;
        } else if (!this.f5240w && m6062b <= i5) {
            if (scrollX > i5) {
                i11 = i5;
            }
            i11 = m6062b;
        } else if (i2 > 0) {
            double d4 = i10;
            Double.isNaN(d4);
            i2 += (int) (d4 * 10.0d);
            i11 = min;
        } else if (i2 < 0) {
            double d5 = i9;
            Double.isNaN(d5);
            i2 -= (int) (d5 * 10.0d);
            i11 = i4;
        }
        int min2 = Math.min(Math.max(0, i11), max);
        if (z) {
            min2 = max - min2;
            i2 = -i2;
        }
        OverScroller overScroller = this.f5221d;
        if (overScroller == null) {
            smoothScrollTo(min2, getScrollY());
            return;
        }
        this.f5224g = true;
        overScroller.fling(getScrollX(), getScrollY(), i2 != 0 ? i2 : min2 - getScrollX(), 0, min2, min2, 0, 0, (min2 == 0 || min2 == max) ? width / 2 : 0, 0);
        postInvalidateOnAnimation();
    }

    /* renamed from: a */
    private void m6058a(int i, int i2) {
        if ((this.f5232o || this.f5228k || m6069e()) && this.f5229l == null) {
            if (this.f5232o) {
                C1428i.m6097a((ViewGroup) this, i, i2);
            }
            this.f5224g = false;
            this.f5229l = new RunnableC1423d(this);
            C0107v.m502a(this, this.f5229l, 20L);
        }
    }

    /* renamed from: b */
    private int m6062b(int i) {
        OverScroller overScroller = new OverScroller(getContext());
        overScroller.setFriction(1.0f - this.f5238u);
        overScroller.fling(getScrollX(), getScrollY(), i, 0, 0, Math.max(0, computeHorizontalScrollRange() - getWidth()), 0, 0, ((getWidth() - C0107v.m522j(this)) - C0107v.m521i(this)) / 2, 0);
        return overScroller.getFinalX();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public void m6064c() {
        if (m6069e()) {
            C2038a.m8318a(this.f5233p);
            C2038a.m8318a(this.f5234q);
            this.f5233p.m6052b(this.f5234q);
        }
    }

    /* renamed from: c */
    private void m6065c(int i) {
        double snapInterval = getSnapInterval();
        double scrollX = getScrollX();
        double m6062b = m6062b(i);
        Double.isNaN(scrollX);
        Double.isNaN(snapInterval);
        double d2 = scrollX / snapInterval;
        int floor = (int) Math.floor(d2);
        int ceil = (int) Math.ceil(d2);
        int round = (int) Math.round(d2);
        Double.isNaN(m6062b);
        Double.isNaN(snapInterval);
        int round2 = (int) Math.round(m6062b / snapInterval);
        if (i > 0 && ceil == floor) {
            ceil++;
        } else if (i < 0 && floor == ceil) {
            floor--;
        }
        if (i > 0 && round < ceil && round2 > floor) {
            round = ceil;
        } else if (i < 0 && round > floor && round2 < ceil) {
            round = floor;
        }
        double d3 = round;
        Double.isNaN(d3);
        Double.isNaN(snapInterval);
        double d4 = d3 * snapInterval;
        if (d4 != scrollX) {
            this.f5224g = true;
            smoothScrollTo((int) d4, getScrollY());
        }
    }

    /* renamed from: d */
    private void m6067d() {
        if (m6069e()) {
            C2038a.m8318a(this.f5233p);
            C2038a.m8318a(this.f5234q);
            this.f5233p.m6051a(this.f5234q);
        }
    }

    /* renamed from: e */
    private boolean m6069e() {
        String str;
        return (this.f5233p == null || (str = this.f5234q) == null || str.isEmpty()) ? false : true;
    }

    private OverScroller getOverScrollerFromParent() {
        if (!f5219b) {
            f5219b = true;
            try {
                f5218a = HorizontalScrollView.class.getDeclaredField("mScroller");
                f5218a.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.w("ReactNative", "Failed to get mScroller field for HorizontalScrollView! This app will exhibit the bounce-back scrolling bug :(");
            }
        }
        Field field = f5218a;
        OverScroller overScroller = null;
        if (field != null) {
            try {
                Object obj = field.get(this);
                if (obj instanceof OverScroller) {
                    overScroller = (OverScroller) obj;
                } else {
                    Log.w("ReactNative", "Failed to cast mScroller field in HorizontalScrollView (probably due to OEM changes to AOSP)! This app will exhibit the bounce-back scrolling bug :(");
                }
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("Failed to get mScroller from HorizontalScrollView!", e2);
            }
        }
        return overScroller;
    }

    private int getSnapInterval() {
        int i = this.f5237t;
        return i != 0 ? i : getWidth();
    }

    @Override // com.facebook.react.uimanager.InterfaceC1376y
    /* renamed from: a */
    public void mo5962a() {
        if (this.f5230m) {
            C2038a.m8318a(this.f5225h);
            C1377z.m5964a(this, this.f5225h);
            KeyEvent.Callback childAt = getChildAt(0);
            if (childAt instanceof InterfaceC1376y) {
                ((InterfaceC1376y) childAt).mo5962a();
            }
        }
    }

    /* renamed from: a */
    public void m6070a(float f, int i) {
        this.f5242y.m6330a(f, i);
    }

    /* renamed from: a */
    public void m6071a(int i, float f) {
        this.f5242y.m6332a(i, f);
    }

    /* renamed from: a */
    public void m6072a(int i, float f, float f2) {
        this.f5242y.m6333a(i, f, f2);
    }

    @Override // com.facebook.react.uimanager.InterfaceC1376y
    /* renamed from: a */
    public void mo5963a(Rect rect) {
        Rect rect2 = this.f5225h;
        C2038a.m8318a(rect2);
        rect.set(rect2);
    }

    /* renamed from: b */
    public void m6073b() {
        awakenScrollBars();
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public void draw(Canvas canvas) {
        if (this.f5236s != 0) {
            View childAt = getChildAt(0);
            if (this.f5235r != null && childAt != null && childAt.getRight() < getWidth()) {
                this.f5235r.setBounds(childAt.getRight(), 0, getWidth(), getHeight());
                this.f5235r.draw(canvas);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.HorizontalScrollView
    public void fling(int i) {
        int abs = (int) (Math.abs(i) * Math.signum(this.f5220c.m6053a()));
        if (this.f5228k) {
            m6057a(abs);
        } else if (this.f5221d != null) {
            this.f5221d.fling(getScrollX(), getScrollY(), abs, 0, 0, Integer.MAX_VALUE, 0, 0, ((getWidth() - C0107v.m522j(this)) - C0107v.m521i(this)) / 2, 0);
            C0107v.m532t(this);
        } else {
            super.fling(abs);
        }
        m6058a(abs, 0);
    }

    @Override // com.facebook.react.uimanager.InterfaceC1376y
    public boolean getRemoveClippedSubviews() {
        return this.f5230m;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f5230m) {
            mo5962a();
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        getDrawingRect(this.f5223f);
        String str = this.f5226i;
        if (((str.hashCode() == 466743410 && str.equals("visible")) ? (char) 0 : (char) 65535) != 0) {
            canvas.clipRect(this.f5223f);
        }
        super.onDraw(canvas);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f5231n) {
            return false;
        }
        try {
            if (super.onInterceptTouchEvent(motionEvent)) {
                C1336i.m5762a(this, motionEvent);
                C1428i.m6095a(this);
                this.f5227j = true;
                m6067d();
                return true;
            }
        } catch (IllegalArgumentException e2) {
            Log.w("ReactNative", "Error intercepting touch event.", e2);
        }
        return false;
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        scrollTo(getScrollX(), getScrollY());
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        C1363p.m5892a(i, i2);
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    protected void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        int computeHorizontalScrollRange;
        OverScroller overScroller = this.f5221d;
        if (overScroller != null && !overScroller.isFinished() && this.f5221d.getCurrX() != this.f5221d.getFinalX() && i >= (computeHorizontalScrollRange = computeHorizontalScrollRange() - getWidth())) {
            this.f5221d.abortAnimation();
            i = computeHorizontalScrollRange;
        }
        super.onOverScrolled(i, i2, z, z2);
    }

    @Override // android.view.View
    protected void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        this.f5224g = true;
        if (this.f5220c.m6054a(i, i2)) {
            if (this.f5230m) {
                mo5962a();
            }
            C1428i.m6101b(this, this.f5220c.m6053a(), this.f5220c.m6055b());
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.f5230m) {
            mo5962a();
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f5231n) {
            return false;
        }
        this.f5222e.m6107a(motionEvent);
        if ((motionEvent.getAction() & 255) == 1 && this.f5227j) {
            float m6106a = this.f5222e.m6106a();
            float m6108b = this.f5222e.m6108b();
            C1428i.m6096a(this, m6106a, m6108b);
            this.f5227j = false;
            m6058a(Math.round(m6106a), Math.round(m6108b));
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.f5242y.m6331a(i);
    }

    public void setBorderRadius(float f) {
        this.f5242y.m6329a(f);
    }

    public void setBorderStyle(String str) {
        this.f5242y.m6334a(str);
    }

    public void setDecelerationRate(float f) {
        this.f5238u = f;
        OverScroller overScroller = this.f5221d;
        if (overScroller != null) {
            overScroller.setFriction(1.0f - this.f5238u);
        }
    }

    public void setEndFillColor(int i) {
        if (i != this.f5236s) {
            this.f5236s = i;
            this.f5235r = new ColorDrawable(this.f5236s);
        }
    }

    public void setOverflow(String str) {
        this.f5226i = str;
        invalidate();
    }

    public void setPagingEnabled(boolean z) {
        this.f5228k = z;
    }

    public void setRemoveClippedSubviews(boolean z) {
        if (z && this.f5225h == null) {
            this.f5225h = new Rect();
        }
        this.f5230m = z;
        mo5962a();
    }

    public void setScrollEnabled(boolean z) {
        this.f5231n = z;
    }

    public void setScrollPerfTag(String str) {
        this.f5234q = str;
    }

    public void setSendMomentumEvents(boolean z) {
        this.f5232o = z;
    }

    public void setSnapInterval(int i) {
        this.f5237t = i;
    }

    public void setSnapOffsets(List<Integer> list) {
        this.f5239v = list;
    }

    public void setSnapToEnd(boolean z) {
        this.f5241x = z;
    }

    public void setSnapToStart(boolean z) {
        this.f5240w = z;
    }
}
