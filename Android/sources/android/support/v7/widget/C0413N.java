package android.support.v7.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.graphics.drawable.C0220a;
import android.support.v4.widget.C0298p;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.Field;
import p000a.p005b.p009c.p019h.C0074H;
import p000a.p005b.p022d.p023a.C0112a;
import p000a.p005b.p022d.p026c.p027a.C0127e;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: android.support.v7.widget.N */
/* loaded from: classes.dex */
public class C0413N extends ListView {

    /* renamed from: a */
    private final Rect f2082a;

    /* renamed from: b */
    private int f2083b;

    /* renamed from: c */
    private int f2084c;

    /* renamed from: d */
    private int f2085d;

    /* renamed from: e */
    private int f2086e;

    /* renamed from: f */
    private int f2087f;

    /* renamed from: g */
    private Field f2088g;

    /* renamed from: h */
    private a f2089h;

    /* renamed from: i */
    private boolean f2090i;

    /* renamed from: j */
    private boolean f2091j;

    /* renamed from: k */
    private boolean f2092k;

    /* renamed from: l */
    private C0074H f2093l;

    /* renamed from: m */
    private C0298p f2094m;

    /* renamed from: n */
    b f2095n;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v7.widget.N$a */
    /* loaded from: classes.dex */
    public static class a extends C0127e {

        /* renamed from: b */
        private boolean f2096b;

        a(Drawable drawable) {
            super(drawable);
            this.f2096b = true;
        }

        /* renamed from: a */
        void m2278a(boolean z) {
            this.f2096b = z;
        }

        @Override // p000a.p005b.p022d.p026c.p027a.C0127e, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            if (this.f2096b) {
                super.draw(canvas);
            }
        }

        @Override // p000a.p005b.p022d.p026c.p027a.C0127e, android.graphics.drawable.Drawable
        public void setHotspot(float f, float f2) {
            if (this.f2096b) {
                super.setHotspot(f, f2);
            }
        }

        @Override // p000a.p005b.p022d.p026c.p027a.C0127e, android.graphics.drawable.Drawable
        public void setHotspotBounds(int i, int i2, int i3, int i4) {
            if (this.f2096b) {
                super.setHotspotBounds(i, i2, i3, i4);
            }
        }

        @Override // p000a.p005b.p022d.p026c.p027a.C0127e, android.graphics.drawable.Drawable
        public boolean setState(int[] iArr) {
            if (this.f2096b) {
                return super.setState(iArr);
            }
            return false;
        }

        @Override // p000a.p005b.p022d.p026c.p027a.C0127e, android.graphics.drawable.Drawable
        public boolean setVisible(boolean z, boolean z2) {
            if (this.f2096b) {
                return super.setVisible(z, z2);
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v7.widget.N$b */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        b() {
        }

        /* renamed from: a */
        public void m2279a() {
            C0413N c0413n = C0413N.this;
            c0413n.f2095n = null;
            c0413n.removeCallbacks(this);
        }

        /* renamed from: b */
        public void m2280b() {
            C0413N.this.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            C0413N c0413n = C0413N.this;
            c0413n.f2095n = null;
            c0413n.drawableStateChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0413N(Context context, boolean z) {
        super(context, null, C0112a.dropDownListViewStyle);
        this.f2082a = new Rect();
        this.f2083b = 0;
        this.f2084c = 0;
        this.f2085d = 0;
        this.f2086e = 0;
        this.f2091j = z;
        setCacheColorHint(0);
        try {
            this.f2088g = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f2088g.setAccessible(true);
        } catch (NoSuchFieldException e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: a */
    private void m2267a() {
        this.f2092k = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.f2087f - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        C0074H c0074h = this.f2093l;
        if (c0074h != null) {
            c0074h.m343a();
            this.f2093l = null;
        }
    }

    /* renamed from: a */
    private void m2268a(int i, View view) {
        Rect rect = this.f2082a;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.f2083b;
        rect.top -= this.f2084c;
        rect.right += this.f2085d;
        rect.bottom += this.f2086e;
        try {
            boolean z = this.f2088g.getBoolean(this);
            if (view.isEnabled() != z) {
                this.f2088g.set(this, Boolean.valueOf(!z));
                if (i != -1) {
                    refreshDrawableState();
                }
            }
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: a */
    private void m2269a(int i, View view, float f, float f2) {
        m2273b(i, view);
        Drawable selector = getSelector();
        if (selector == null || i == -1) {
            return;
        }
        C0220a.m1193a(selector, f, f2);
    }

    /* renamed from: a */
    private void m2270a(Canvas canvas) {
        Drawable selector;
        if (this.f2082a.isEmpty() || (selector = getSelector()) == null) {
            return;
        }
        selector.setBounds(this.f2082a);
        selector.draw(canvas);
    }

    /* renamed from: a */
    private void m2271a(View view, int i) {
        performItemClick(view, i, getItemIdAtPosition(i));
    }

    /* renamed from: a */
    private void m2272a(View view, int i, float f, float f2) {
        View childAt;
        this.f2092k = true;
        if (Build.VERSION.SDK_INT >= 21) {
            drawableHotspotChanged(f, f2);
        }
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i2 = this.f2087f;
        if (i2 != -1 && (childAt = getChildAt(i2 - getFirstVisiblePosition())) != null && childAt != view && childAt.isPressed()) {
            childAt.setPressed(false);
        }
        this.f2087f = i;
        float left = f - view.getLeft();
        float top = f2 - view.getTop();
        if (Build.VERSION.SDK_INT >= 21) {
            view.drawableHotspotChanged(left, top);
        }
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        m2269a(i, view, f, f2);
        setSelectorEnabled(false);
        refreshDrawableState();
    }

    /* renamed from: b */
    private void m2273b(int i, View view) {
        Drawable selector = getSelector();
        boolean z = (selector == null || i == -1) ? false : true;
        if (z) {
            selector.setVisible(false, false);
        }
        m2268a(i, view);
        if (z) {
            Rect rect = this.f2082a;
            float exactCenterX = rect.exactCenterX();
            float exactCenterY = rect.exactCenterY();
            selector.setVisible(getVisibility() == 0, false);
            C0220a.m1193a(selector, exactCenterX, exactCenterY);
        }
    }

    /* renamed from: b */
    private boolean m2274b() {
        return this.f2092k;
    }

    /* renamed from: c */
    private void m2275c() {
        Drawable selector = getSelector();
        if (selector != null && m2274b() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    private void setSelectorEnabled(boolean z) {
        a aVar = this.f2089h;
        if (aVar != null) {
            aVar.m2278a(z);
        }
    }

    /* renamed from: a */
    public int mo2276a(int i, int i2, int i3, int i4, int i5) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        getListPaddingLeft();
        getListPaddingRight();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i6 = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i7 = i6;
        View view = null;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (i8 < count) {
            int itemViewType = adapter.getItemViewType(i8);
            if (itemViewType != i9) {
                view = null;
                i9 = itemViewType;
            }
            view = adapter.getView(i8, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i11 = layoutParams.height;
            view.measure(i, i11 > 0 ? View.MeasureSpec.makeMeasureSpec(i11, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i8 > 0) {
                i7 += dividerHeight;
            }
            i7 += view.getMeasuredHeight();
            if (i7 >= i4) {
                return (i5 < 0 || i8 <= i5 || i10 <= 0 || i7 == i4) ? i4 : i10;
            }
            if (i5 >= 0 && i8 >= i5) {
                i10 = i7;
            }
            i8++;
        }
        return i7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000c, code lost:            if (r0 != 3) goto L8;     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0048 A[ADDED_TO_REGION] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean mo2277a(android.view.MotionEvent r8, int r9) {
        /*
            r7 = this;
            int r0 = r8.getActionMasked()
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L16
            r3 = 2
            if (r0 == r3) goto L14
            r9 = 3
            if (r0 == r9) goto L11
        Le:
            r9 = 0
            r3 = 1
            goto L46
        L11:
            r9 = 0
            r3 = 0
            goto L46
        L14:
            r3 = 1
            goto L17
        L16:
            r3 = 0
        L17:
            int r9 = r8.findPointerIndex(r9)
            if (r9 >= 0) goto L1e
            goto L11
        L1e:
            float r4 = r8.getX(r9)
            int r4 = (int) r4
            float r9 = r8.getY(r9)
            int r9 = (int) r9
            int r5 = r7.pointToPosition(r4, r9)
            r6 = -1
            if (r5 != r6) goto L31
            r9 = 1
            goto L46
        L31:
            int r3 = r7.getFirstVisiblePosition()
            int r3 = r5 - r3
            android.view.View r3 = r7.getChildAt(r3)
            float r4 = (float) r4
            float r9 = (float) r9
            r7.m2272a(r3, r5, r4, r9)
            if (r0 != r2) goto Le
            r7.m2271a(r3, r5)
            goto Le
        L46:
            if (r3 == 0) goto L4a
            if (r9 == 0) goto L4d
        L4a:
            r7.m2267a()
        L4d:
            if (r3 == 0) goto L65
            android.support.v4.widget.p r9 = r7.f2094m
            if (r9 != 0) goto L5a
            android.support.v4.widget.p r9 = new android.support.v4.widget.p
            r9.<init>(r7)
            r7.f2094m = r9
        L5a:
            android.support.v4.widget.p r9 = r7.f2094m
            r9.m1545a(r2)
            android.support.v4.widget.p r9 = r7.f2094m
            r9.onTouch(r7, r8)
            goto L6c
        L65:
            android.support.v4.widget.p r8 = r7.f2094m
            if (r8 == 0) goto L6c
            r8.m1545a(r1)
        L6c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.C0413N.mo2277a(android.view.MotionEvent, int):boolean");
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        m2270a(canvas);
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        if (this.f2095n != null) {
            return;
        }
        super.drawableStateChanged();
        setSelectorEnabled(true);
        m2275c();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return this.f2091j || super.hasFocus();
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        return this.f2091j || super.hasWindowFocus();
    }

    @Override // android.view.View
    public boolean isFocused() {
        return this.f2091j || super.isFocused();
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        return (this.f2091j && this.f2090i) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        this.f2095n = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (Build.VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f2095n == null) {
            this.f2095n = new b();
            this.f2095n.m2280b();
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (pointToPosition != -1 && pointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                }
                m2275c();
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f2087f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        b bVar = this.f2095n;
        if (bVar != null) {
            bVar.m2279a();
        }
        return super.onTouchEvent(motionEvent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setListSelectionHidden(boolean z) {
        this.f2090i = z;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        this.f2089h = drawable != null ? new a(drawable) : null;
        super.setSelector(this.f2089h);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f2083b = rect.left;
        this.f2084c = rect.top;
        this.f2085d = rect.right;
        this.f2086e = rect.bottom;
    }
}
