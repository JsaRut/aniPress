package com.facebook.react.views.scroll;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.OverScroller;
import android.widget.ScrollView;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.C1363p;
import com.facebook.react.uimanager.C1377z;
import com.facebook.react.uimanager.InterfaceC1376y;
import com.facebook.react.uimanager.events.C1336i;
import com.facebook.react.views.view.C1514f;
import java.lang.reflect.Field;
import java.util.List;
import p000a.p005b.p009c.p019h.C0107v;
import p139d.p143b.p204k.p205a.C2038a;

/* renamed from: com.facebook.react.views.scroll.g */
/* loaded from: classes.dex */
public class ViewGroupOnHierarchyChangeListenerC1426g extends ScrollView implements InterfaceC1376y, ViewGroup.OnHierarchyChangeListener, View.OnLayoutChangeListener {

    /* renamed from: a */
    private static Field f5245a = null;

    /* renamed from: b */
    private static boolean f5246b = false;

    /* renamed from: c */
    private final C1421b f5247c;

    /* renamed from: d */
    private final OverScroller f5248d;

    /* renamed from: e */
    private final C1432m f5249e;

    /* renamed from: f */
    private final Rect f5250f;

    /* renamed from: g */
    private boolean f5251g;

    /* renamed from: h */
    private Rect f5252h;

    /* renamed from: i */
    private String f5253i;

    /* renamed from: j */
    private boolean f5254j;

    /* renamed from: k */
    private boolean f5255k;

    /* renamed from: l */
    private Runnable f5256l;

    /* renamed from: m */
    private boolean f5257m;

    /* renamed from: n */
    private boolean f5258n;

    /* renamed from: o */
    private boolean f5259o;

    /* renamed from: p */
    private InterfaceC1420a f5260p;

    /* renamed from: q */
    private String f5261q;

    /* renamed from: r */
    private Drawable f5262r;

    /* renamed from: s */
    private int f5263s;

    /* renamed from: t */
    private int f5264t;

    /* renamed from: u */
    private float f5265u;

    /* renamed from: v */
    private List<Integer> f5266v;

    /* renamed from: w */
    private boolean f5267w;

    /* renamed from: x */
    private boolean f5268x;

    /* renamed from: y */
    private View f5269y;

    /* renamed from: z */
    private C1514f f5270z;

    public ViewGroupOnHierarchyChangeListenerC1426g(ReactContext reactContext, InterfaceC1420a interfaceC1420a) {
        super(reactContext);
        this.f5247c = new C1421b();
        this.f5249e = new C1432m();
        this.f5250f = new Rect();
        this.f5253i = "hidden";
        this.f5255k = false;
        this.f5258n = true;
        this.f5260p = null;
        this.f5263s = 0;
        this.f5264t = 0;
        this.f5265u = 0.985f;
        this.f5267w = true;
        this.f5268x = true;
        this.f5260p = interfaceC1420a;
        this.f5270z = new C1514f(this);
        this.f5248d = getOverScrollerFromParent();
        setOnHierarchyChangeListener(this);
        setScrollBarStyle(33554432);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m6075a(int i) {
        int i2;
        int min;
        int i3;
        int i4;
        int i5;
        if (getChildCount() <= 0) {
            return;
        }
        if (this.f5264t == 0 && this.f5266v == null) {
            m6083c(i);
            return;
        }
        int maxScrollY = getMaxScrollY();
        int m6080b = m6080b(i);
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        List<Integer> list = this.f5266v;
        if (list != null) {
            int intValue = list.get(0).intValue();
            List<Integer> list2 = this.f5266v;
            int intValue2 = list2.get(list2.size() - 1).intValue();
            int i6 = maxScrollY;
            int i7 = 0;
            for (int i8 = 0; i8 < this.f5266v.size(); i8++) {
                int intValue3 = this.f5266v.get(i8).intValue();
                if (intValue3 <= m6080b && m6080b - intValue3 < m6080b - i7) {
                    i7 = intValue3;
                }
                if (intValue3 >= m6080b && intValue3 - m6080b < i6 - m6080b) {
                    i6 = intValue3;
                }
            }
            i3 = intValue2;
            min = i6;
            int i9 = i7;
            i4 = intValue;
            i2 = i9;
        } else {
            double snapInterval = getSnapInterval();
            double d2 = m6080b;
            Double.isNaN(d2);
            Double.isNaN(snapInterval);
            double d3 = d2 / snapInterval;
            double floor = Math.floor(d3);
            Double.isNaN(snapInterval);
            i2 = (int) (floor * snapInterval);
            double ceil = Math.ceil(d3);
            Double.isNaN(snapInterval);
            min = Math.min((int) (ceil * snapInterval), maxScrollY);
            i3 = maxScrollY;
            i4 = 0;
        }
        int i10 = m6080b - i2;
        int i11 = min - m6080b;
        int i12 = i10 < i11 ? i2 : min;
        if (!this.f5268x && m6080b >= i3) {
            if (getScrollY() < i3) {
                i5 = i;
                m6080b = i3;
            }
            i5 = i;
        } else if (!this.f5267w && m6080b <= i4) {
            if (getScrollY() > i4) {
                i5 = i;
                m6080b = i4;
            }
            i5 = i;
        } else if (i > 0) {
            double d4 = i11;
            Double.isNaN(d4);
            i5 = i + ((int) (d4 * 10.0d));
            m6080b = min;
        } else if (i < 0) {
            double d5 = i10;
            Double.isNaN(d5);
            int i13 = i2;
            i5 = i - ((int) (d5 * 10.0d));
            m6080b = i13;
        } else {
            i5 = i;
            m6080b = i12;
        }
        int min2 = Math.min(Math.max(0, m6080b), maxScrollY);
        OverScroller overScroller = this.f5248d;
        if (overScroller == null) {
            smoothScrollTo(getScrollX(), min2);
            return;
        }
        this.f5251g = true;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        if (i5 == 0) {
            i5 = min2 - getScrollY();
        }
        overScroller.fling(scrollX, scrollY, 0, i5, 0, 0, min2, min2, 0, (min2 == 0 || min2 == maxScrollY) ? height / 2 : 0);
        postInvalidateOnAnimation();
    }

    /* renamed from: a */
    private void m6076a(int i, int i2) {
        if ((this.f5259o || this.f5255k || m6087e()) && this.f5256l == null) {
            if (this.f5259o) {
                m6085d();
                C1428i.m6097a((ViewGroup) this, i, i2);
            }
            this.f5251g = false;
            this.f5256l = new RunnableC1425f(this);
            C0107v.m502a(this, this.f5256l, 20L);
        }
    }

    /* renamed from: b */
    private int m6080b(int i) {
        OverScroller overScroller = new OverScroller(getContext());
        overScroller.setFriction(1.0f - this.f5265u);
        overScroller.fling(getScrollX(), getScrollY(), 0, i, 0, 0, 0, getMaxScrollY(), 0, ((getHeight() - getPaddingBottom()) - getPaddingTop()) / 2);
        return overScroller.getFinalY();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public void m6082c() {
        if (m6087e()) {
            C2038a.m8318a(this.f5260p);
            C2038a.m8318a(this.f5261q);
            this.f5260p.m6052b(this.f5261q);
        }
    }

    /* renamed from: c */
    private void m6083c(int i) {
        double snapInterval = getSnapInterval();
        double scrollY = getScrollY();
        double m6080b = m6080b(i);
        Double.isNaN(scrollY);
        Double.isNaN(snapInterval);
        double d2 = scrollY / snapInterval;
        int floor = (int) Math.floor(d2);
        int ceil = (int) Math.ceil(d2);
        int round = (int) Math.round(d2);
        Double.isNaN(m6080b);
        Double.isNaN(snapInterval);
        int round2 = (int) Math.round(m6080b / snapInterval);
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
        if (d4 != scrollY) {
            this.f5251g = true;
            smoothScrollTo(getScrollX(), (int) d4);
        }
    }

    /* renamed from: d */
    private void m6085d() {
        if (m6087e()) {
            C2038a.m8318a(this.f5260p);
            C2038a.m8318a(this.f5261q);
            this.f5260p.m6051a(this.f5261q);
        }
    }

    /* renamed from: e */
    private boolean m6087e() {
        String str;
        return (this.f5260p == null || (str = this.f5261q) == null || str.isEmpty()) ? false : true;
    }

    private int getMaxScrollY() {
        return Math.max(0, this.f5269y.getHeight() - ((getHeight() - getPaddingBottom()) - getPaddingTop()));
    }

    private OverScroller getOverScrollerFromParent() {
        if (!f5246b) {
            f5246b = true;
            try {
                f5245a = ScrollView.class.getDeclaredField("mScroller");
                f5245a.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.w("ReactNative", "Failed to get mScroller field for ScrollView! This app will exhibit the bounce-back scrolling bug :(");
            }
        }
        Field field = f5245a;
        OverScroller overScroller = null;
        if (field != null) {
            try {
                Object obj = field.get(this);
                if (obj instanceof OverScroller) {
                    overScroller = (OverScroller) obj;
                } else {
                    Log.w("ReactNative", "Failed to cast mScroller field in ScrollView (probably due to OEM changes to AOSP)! This app will exhibit the bounce-back scrolling bug :(");
                }
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("Failed to get mScroller from ScrollView!", e2);
            }
        }
        return overScroller;
    }

    private int getSnapInterval() {
        int i = this.f5264t;
        return i != 0 ? i : getHeight();
    }

    @Override // com.facebook.react.uimanager.InterfaceC1376y
    /* renamed from: a */
    public void mo5962a() {
        if (this.f5257m) {
            C2038a.m8318a(this.f5252h);
            C1377z.m5964a(this, this.f5252h);
            KeyEvent.Callback childAt = getChildAt(0);
            if (childAt instanceof InterfaceC1376y) {
                ((InterfaceC1376y) childAt).mo5962a();
            }
        }
    }

    /* renamed from: a */
    public void m6088a(float f, int i) {
        this.f5270z.m6330a(f, i);
    }

    /* renamed from: a */
    public void m6089a(int i, float f) {
        this.f5270z.m6332a(i, f);
    }

    /* renamed from: a */
    public void m6090a(int i, float f, float f2) {
        this.f5270z.m6333a(i, f, f2);
    }

    @Override // com.facebook.react.uimanager.InterfaceC1376y
    /* renamed from: a */
    public void mo5963a(Rect rect) {
        Rect rect2 = this.f5252h;
        C2038a.m8318a(rect2);
        rect.set(rect2);
    }

    /* renamed from: b */
    public void m6091b() {
        awakenScrollBars();
    }

    @Override // android.widget.ScrollView, android.view.View
    public void draw(Canvas canvas) {
        if (this.f5263s != 0) {
            View childAt = getChildAt(0);
            if (this.f5262r != null && childAt != null && childAt.getBottom() < getHeight()) {
                this.f5262r.setBounds(0, childAt.getBottom(), getWidth(), getHeight());
                this.f5262r.draw(canvas);
            }
        }
        getDrawingRect(this.f5250f);
        String str = this.f5253i;
        if (((str.hashCode() == 466743410 && str.equals("visible")) ? (char) 0 : (char) 65535) != 0) {
            canvas.clipRect(this.f5250f);
        }
        super.draw(canvas);
    }

    @Override // android.widget.ScrollView
    public void fling(int i) {
        int abs = (int) (Math.abs(i) * Math.signum(this.f5247c.m6055b()));
        if (this.f5255k) {
            m6075a(abs);
        } else if (this.f5248d != null) {
            this.f5248d.fling(getScrollX(), getScrollY(), 0, abs, 0, 0, 0, Integer.MAX_VALUE, 0, ((getHeight() - getPaddingBottom()) - getPaddingTop()) / 2);
            C0107v.m532t(this);
        } else {
            super.fling(abs);
        }
        m6076a(0, abs);
    }

    @Override // com.facebook.react.uimanager.InterfaceC1376y
    public boolean getRemoveClippedSubviews() {
        return this.f5257m;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f5257m) {
            mo5962a();
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public void onChildViewAdded(View view, View view2) {
        this.f5269y = view2;
        this.f5269y.addOnLayoutChangeListener(this);
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public void onChildViewRemoved(View view, View view2) {
        this.f5269y.removeOnLayoutChangeListener(this);
        this.f5269y = null;
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f5258n) {
            return false;
        }
        try {
            if (super.onInterceptTouchEvent(motionEvent)) {
                C1336i.m5762a(this, motionEvent);
                C1428i.m6095a(this);
                this.f5254j = true;
                m6085d();
                return true;
            }
        } catch (IllegalArgumentException e2) {
            Log.w("ReactNative", "Error intercepting touch event.", e2);
        }
        return false;
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        scrollTo(getScrollX(), getScrollY());
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (this.f5269y == null) {
            return;
        }
        int scrollY = getScrollY();
        int maxScrollY = getMaxScrollY();
        if (scrollY > maxScrollY) {
            scrollTo(getScrollX(), maxScrollY);
        }
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        C1363p.m5892a(i, i2);
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
    }

    @Override // android.widget.ScrollView, android.view.View
    protected void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        int maxScrollY;
        OverScroller overScroller = this.f5248d;
        if (overScroller != null && !overScroller.isFinished() && this.f5248d.getCurrY() != this.f5248d.getFinalY() && i2 >= (maxScrollY = getMaxScrollY())) {
            this.f5248d.abortAnimation();
            i2 = maxScrollY;
        }
        super.onOverScrolled(i, i2, z, z2);
    }

    @Override // android.view.View
    protected void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        this.f5251g = true;
        if (this.f5247c.m6054a(i, i2)) {
            if (this.f5257m) {
                mo5962a();
            }
            C1428i.m6101b(this, this.f5247c.m6053a(), this.f5247c.m6055b());
        }
    }

    @Override // android.widget.ScrollView, android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.f5257m) {
            mo5962a();
        }
    }

    @Override // android.widget.ScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f5258n) {
            return false;
        }
        this.f5249e.m6107a(motionEvent);
        if ((motionEvent.getAction() & 255) == 1 && this.f5254j) {
            float m6106a = this.f5249e.m6106a();
            float m6108b = this.f5249e.m6108b();
            C1428i.m6096a(this, m6106a, m6108b);
            this.f5254j = false;
            m6076a(Math.round(m6106a), Math.round(m6108b));
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.f5270z.m6331a(i);
    }

    public void setBorderRadius(float f) {
        this.f5270z.m6329a(f);
    }

    public void setBorderStyle(String str) {
        this.f5270z.m6334a(str);
    }

    public void setDecelerationRate(float f) {
        this.f5265u = f;
        OverScroller overScroller = this.f5248d;
        if (overScroller != null) {
            overScroller.setFriction(1.0f - this.f5265u);
        }
    }

    public void setEndFillColor(int i) {
        if (i != this.f5263s) {
            this.f5263s = i;
            this.f5262r = new ColorDrawable(this.f5263s);
        }
    }

    public void setOverflow(String str) {
        this.f5253i = str;
        invalidate();
    }

    public void setPagingEnabled(boolean z) {
        this.f5255k = z;
    }

    public void setRemoveClippedSubviews(boolean z) {
        if (z && this.f5252h == null) {
            this.f5252h = new Rect();
        }
        this.f5257m = z;
        mo5962a();
    }

    public void setScrollEnabled(boolean z) {
        this.f5258n = z;
    }

    public void setScrollPerfTag(String str) {
        this.f5261q = str;
    }

    public void setSendMomentumEvents(boolean z) {
        this.f5259o = z;
    }

    public void setSnapInterval(int i) {
        this.f5264t = i;
    }

    public void setSnapOffsets(List<Integer> list) {
        this.f5266v = list;
    }

    public void setSnapToEnd(boolean z) {
        this.f5268x = z;
    }

    public void setSnapToStart(boolean z) {
        this.f5267w = z;
    }
}
