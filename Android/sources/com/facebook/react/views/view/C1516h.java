package com.facebook.react.views.view;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.animation.Animation;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.modules.i18nmanager.C1190a;
import com.facebook.react.uimanager.C1275K;
import com.facebook.react.uimanager.C1353k;
import com.facebook.react.uimanager.C1356la;
import com.facebook.react.uimanager.C1363p;
import com.facebook.react.uimanager.C1377z;
import com.facebook.react.uimanager.EnumC1375x;
import com.facebook.react.uimanager.InterfaceC1267C;
import com.facebook.react.uimanager.InterfaceC1273I;
import com.facebook.react.uimanager.InterfaceC1274J;
import com.facebook.react.uimanager.InterfaceC1376y;
import p000a.p005b.p009c.p019h.C0069C;
import p139d.p143b.p148c.p153e.C1700a;
import p139d.p143b.p204k.p205a.C2038a;
import p139d.p143b.p208m.p217g.InterfaceC2107b;
import p139d.p143b.p208m.p217g.InterfaceC2108c;
import p139d.p143b.p208m.p217g.InterfaceC2109d;

/* renamed from: com.facebook.react.views.view.h */
/* loaded from: classes.dex */
public class C1516h extends ViewGroup implements InterfaceC2109d, InterfaceC1376y, InterfaceC1267C, InterfaceC2108c, InterfaceC1273I {

    /* renamed from: a */
    private static final ViewGroup.LayoutParams f5606a = new ViewGroup.LayoutParams(0, 0);

    /* renamed from: b */
    private static final Rect f5607b = new Rect();

    /* renamed from: c */
    private boolean f5608c;

    /* renamed from: d */
    private View[] f5609d;

    /* renamed from: e */
    private int f5610e;

    /* renamed from: f */
    private Rect f5611f;

    /* renamed from: g */
    private Rect f5612g;

    /* renamed from: h */
    private String f5613h;

    /* renamed from: i */
    private EnumC1375x f5614i;

    /* renamed from: j */
    private a f5615j;

    /* renamed from: k */
    private C1513e f5616k;

    /* renamed from: l */
    private InterfaceC2107b f5617l;

    /* renamed from: m */
    private boolean f5618m;

    /* renamed from: n */
    private final C1356la f5619n;

    /* renamed from: o */
    private Path f5620o;

    /* renamed from: p */
    private int f5621p;

    /* renamed from: q */
    private float f5622q;

    /* renamed from: r */
    private String f5623r;

    /* renamed from: com.facebook.react.views.view.h$a */
    /* loaded from: classes.dex */
    public static final class a implements View.OnLayoutChangeListener {

        /* renamed from: a */
        private final C1516h f5624a;

        private a(C1516h c1516h) {
            this.f5624a = c1516h;
        }

        /* synthetic */ a(C1516h c1516h, C1515g c1515g) {
            this(c1516h);
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            if (this.f5624a.getRemoveClippedSubviews()) {
                this.f5624a.m6343c(view);
            }
        }
    }

    public C1516h(Context context) {
        super(context);
        this.f5608c = false;
        this.f5609d = null;
        this.f5614i = EnumC1375x.AUTO;
        this.f5618m = false;
        this.f5622q = 1.0f;
        this.f5623r = "visible";
        setClipChildren(false);
        this.f5619n = new C1356la(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:92:0x0136, code lost:            if (com.facebook.yoga.C1553a.m6544a(r10) == false) goto L317;     */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m6335a(android.graphics.Canvas r20) {
        /*
            Method dump skipped, instructions count: 486
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.view.C1516h.m6335a(android.graphics.Canvas):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private void m6336a(Rect rect, int i, int i2) {
        View[] viewArr = this.f5609d;
        C2038a.m8318a(viewArr);
        C0069C c0069c = viewArr[i];
        f5607b.set(c0069c.getLeft(), c0069c.getTop(), c0069c.getRight(), c0069c.getBottom());
        Rect rect2 = f5607b;
        boolean intersects = rect.intersects(rect2.left, rect2.top, rect2.right, rect2.bottom);
        Animation animation = c0069c.getAnimation();
        boolean z = true;
        boolean z2 = (animation == null || animation.hasEnded()) ? false : true;
        if (!intersects && c0069c.getParent() != null && !z2) {
            super.removeViewsInLayout(i - i2, 1);
        } else if (intersects && c0069c.getParent() == null) {
            super.addViewInLayout(c0069c, i - i2, f5606a, true);
            invalidate();
        } else if (!intersects) {
            z = false;
        }
        if (z && (c0069c instanceof InterfaceC1376y)) {
            InterfaceC1376y interfaceC1376y = (InterfaceC1376y) c0069c;
            if (interfaceC1376y.getRemoveClippedSubviews()) {
                interfaceC1376y.mo5962a();
            }
        }
    }

    /* renamed from: a */
    private void m6337a(Drawable drawable) {
        super.setBackground(drawable);
    }

    /* renamed from: b */
    private int m6339b(View view) {
        int i = this.f5610e;
        View[] viewArr = this.f5609d;
        C2038a.m8318a(viewArr);
        View[] viewArr2 = viewArr;
        for (int i2 = 0; i2 < i; i2++) {
            if (viewArr2[i2] == view) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: b */
    private void m6340b(Rect rect) {
        C2038a.m8318a(this.f5609d);
        int i = 0;
        for (int i2 = 0; i2 < this.f5610e; i2++) {
            m6336a(rect, i2, i);
            if (this.f5609d[i2].getParent() == null) {
                i++;
            }
        }
    }

    /* renamed from: b */
    private void m6341b(View view, int i) {
        View[] viewArr = this.f5609d;
        C2038a.m8318a(viewArr);
        View[] viewArr2 = viewArr;
        int i2 = this.f5610e;
        int length = viewArr2.length;
        if (i == i2) {
            if (length == i2) {
                this.f5609d = new View[length + 12];
                System.arraycopy(viewArr2, 0, this.f5609d, 0, length);
                viewArr2 = this.f5609d;
            }
            int i3 = this.f5610e;
            this.f5610e = i3 + 1;
            viewArr2[i3] = view;
            return;
        }
        if (i >= i2) {
            throw new IndexOutOfBoundsException("index=" + i + " count=" + i2);
        }
        if (length == i2) {
            this.f5609d = new View[length + 12];
            System.arraycopy(viewArr2, 0, this.f5609d, 0, i);
            System.arraycopy(viewArr2, i, this.f5609d, i + 1, i2 - i);
            viewArr2 = this.f5609d;
        } else {
            System.arraycopy(viewArr2, i, viewArr2, i + 1, i2 - i);
        }
        viewArr2[i] = view;
        this.f5610e++;
    }

    /* renamed from: c */
    private void m6342c(int i) {
        View[] viewArr = this.f5609d;
        C2038a.m8318a(viewArr);
        View[] viewArr2 = viewArr;
        int i2 = this.f5610e;
        if (i == i2 - 1) {
            int i3 = i2 - 1;
            this.f5610e = i3;
            viewArr2[i3] = null;
        } else {
            if (i < 0 || i >= i2) {
                throw new IndexOutOfBoundsException();
            }
            System.arraycopy(viewArr2, i + 1, viewArr2, i, (i2 - i) - 1);
            int i4 = this.f5610e - 1;
            this.f5610e = i4;
            viewArr2[i4] = null;
        }
    }

    /* renamed from: c */
    public void m6343c(View view) {
        if (!this.f5608c || getParent() == null) {
            return;
        }
        C2038a.m8318a(this.f5611f);
        C2038a.m8318a(this.f5609d);
        f5607b.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        Rect rect = this.f5611f;
        Rect rect2 = f5607b;
        if (rect.intersects(rect2.left, rect2.top, rect2.right, rect2.bottom) != (view.getParent() != null)) {
            int i = 0;
            for (int i2 = 0; i2 < this.f5610e; i2++) {
                View[] viewArr = this.f5609d;
                if (viewArr[i2] == view) {
                    m6336a(this.f5611f, i2, i);
                    return;
                } else {
                    if (viewArr[i2].getParent() == null) {
                        i++;
                    }
                }
            }
        }
    }

    private C1513e getOrCreateReactViewBackground() {
        if (this.f5616k == null) {
            this.f5616k = new C1513e(getContext());
            Drawable background = getBackground();
            m6337a((Drawable) null);
            if (background == null) {
                m6337a(this.f5616k);
            } else {
                m6337a(new LayerDrawable(new Drawable[]{this.f5616k, background}));
            }
            if (Build.VERSION.SDK_INT >= 17) {
                this.f5621p = C1190a.m5346a().m5355b(getContext()) ? 1 : 0;
                this.f5616k.m6323c(this.f5621p);
            }
        }
        return this.f5616k;
    }

    @Override // com.facebook.react.uimanager.InterfaceC1273I
    /* renamed from: a */
    public int mo5581a(int i) {
        return this.f5619n.m5851a() ? this.f5619n.m5849a(getChildCount(), i) : i;
    }

    @Override // com.facebook.react.uimanager.InterfaceC1376y
    /* renamed from: a */
    public void mo5962a() {
        if (this.f5608c) {
            C2038a.m8318a(this.f5611f);
            C2038a.m8318a(this.f5609d);
            C1377z.m5964a(this, this.f5611f);
            m6340b(this.f5611f);
        }
    }

    /* renamed from: a */
    public void m6344a(float f, int i) {
        C1513e orCreateReactViewBackground = getOrCreateReactViewBackground();
        orCreateReactViewBackground.m6320b(f, i);
        if (Build.VERSION.SDK_INT < 18) {
            int i2 = orCreateReactViewBackground.m6326f() ? 1 : 2;
            if (i2 != getLayerType()) {
                setLayerType(i2, null);
            }
        }
    }

    /* renamed from: a */
    public void m6345a(int i, float f) {
        getOrCreateReactViewBackground().m6315a(i, f);
    }

    /* renamed from: a */
    public void m6346a(int i, float f, float f2) {
        getOrCreateReactViewBackground().m6316a(i, f, f2);
    }

    @Override // com.facebook.react.uimanager.InterfaceC1376y
    /* renamed from: a */
    public void mo5963a(Rect rect) {
        rect.set(this.f5611f);
    }

    /* renamed from: a */
    public void m6347a(View view) {
        C2038a.m8320a(this.f5608c);
        C2038a.m8318a(this.f5611f);
        C2038a.m8318a(this.f5609d);
        view.removeOnLayoutChangeListener(this.f5615j);
        int m6339b = m6339b(view);
        if (this.f5609d[m6339b].getParent() != null) {
            int i = 0;
            for (int i2 = 0; i2 < m6339b; i2++) {
                if (this.f5609d[i2].getParent() == null) {
                    i++;
                }
            }
            super.removeViewsInLayout(m6339b - i, 1);
        }
        m6342c(m6339b);
    }

    /* renamed from: a */
    public void m6348a(View view, int i) {
        m6349a(view, i, f5606a);
    }

    /* renamed from: a */
    void m6349a(View view, int i, ViewGroup.LayoutParams layoutParams) {
        C2038a.m8320a(this.f5608c);
        C2038a.m8318a(this.f5611f);
        C2038a.m8318a(this.f5609d);
        m6341b(view, i);
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            if (this.f5609d[i3].getParent() == null) {
                i2++;
            }
        }
        m6336a(this.f5611f, i, i2);
        view.addOnLayoutChangeListener(this.f5615j);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        this.f5619n.m5850a(view);
        setChildrenDrawingOrderEnabled(this.f5619n.m5851a());
        super.addView(view, i, layoutParams);
    }

    /* renamed from: b */
    public View m6350b(int i) {
        View[] viewArr = this.f5609d;
        C2038a.m8318a(viewArr);
        return viewArr[i];
    }

    @Override // com.facebook.react.uimanager.InterfaceC1273I
    /* renamed from: b */
    public void mo5582b() {
        this.f5619n.m5852b();
        setChildrenDrawingOrderEnabled(this.f5619n.m5851a());
        invalidate();
    }

    /* renamed from: c */
    public void m6351c() {
        C2038a.m8320a(this.f5608c);
        C2038a.m8318a(this.f5609d);
        for (int i = 0; i < this.f5610e; i++) {
            this.f5609d[i].removeOnLayoutChangeListener(this.f5615j);
        }
        removeAllViewsInLayout();
        this.f5610e = 0;
    }

    /* renamed from: d */
    public void m6352d() {
        float f;
        if (!this.f5623r.equals("visible")) {
            float rotationX = getRotationX();
            float rotationY = getRotationY();
            if (!(rotationX >= -90.0f && rotationX < 90.0f && rotationY >= -90.0f && rotationY < 90.0f)) {
                f = 0.0f;
                setAlpha(f);
            }
        }
        f = this.f5622q;
        setAlpha(f);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        try {
            m6335a(canvas);
            super.dispatchDraw(canvas);
        } catch (NullPointerException e2) {
            C1700a.m6998a("ReactNative", "NullPointerException when executing ViewGroup.dispatchDraw method", e2);
        } catch (StackOverflowError e3) {
            InterfaceC1274J m5585a = C1275K.m5585a(this);
            if (m5585a != null) {
                m5585a.mo5584a(e3);
            } else {
                if (!(getContext() instanceof ReactContext)) {
                    throw e3;
                }
                ((ReactContext) getContext()).handleException(new C1353k("StackOverflowException", this, e3));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    @TargetApi(23)
    public void dispatchProvideStructure(ViewStructure viewStructure) {
        try {
            super.dispatchProvideStructure(viewStructure);
        } catch (NullPointerException e2) {
            C1700a.m6998a("ReactNative", "NullPointerException when executing dispatchProvideStructure", e2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchSetPressed(boolean z) {
    }

    public int getAllChildrenCount() {
        return this.f5610e;
    }

    public int getBackgroundColor() {
        if (getBackground() != null) {
            return ((C1513e) getBackground()).m6313a();
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i, int i2) {
        return this.f5619n.m5849a(i, i2);
    }

    @Override // p139d.p143b.p208m.p217g.InterfaceC2108c
    public Rect getHitSlopRect() {
        return this.f5612g;
    }

    public String getOverflow() {
        return this.f5613h;
    }

    @Override // com.facebook.react.uimanager.InterfaceC1267C
    public EnumC1375x getPointerEvents() {
        return this.f5614i;
    }

    @Override // com.facebook.react.uimanager.InterfaceC1376y
    public boolean getRemoveClippedSubviews() {
        return this.f5608c;
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return this.f5618m;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f5608c) {
            mo5962a();
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        EnumC1375x enumC1375x;
        InterfaceC2107b interfaceC2107b = this.f5617l;
        if ((interfaceC2107b != null && interfaceC2107b.mo8451a(this, motionEvent)) || (enumC1375x = this.f5614i) == EnumC1375x.NONE || enumC1375x == EnumC1375x.BOX_ONLY) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        C1363p.m5892a(i, i2);
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        C1513e c1513e;
        if (Build.VERSION.SDK_INT < 17 || (c1513e = this.f5616k) == null) {
            return;
        }
        c1513e.m6323c(this.f5621p);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.f5608c) {
            mo5962a();
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        EnumC1375x enumC1375x = this.f5614i;
        return (enumC1375x == EnumC1375x.NONE || enumC1375x == EnumC1375x.BOX_NONE) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        this.f5619n.m5853b(view);
        setChildrenDrawingOrderEnabled(this.f5619n.m5851a());
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i) {
        this.f5619n.m5853b(getChildAt(i));
        setChildrenDrawingOrderEnabled(this.f5619n.m5851a());
        super.removeViewAt(i);
    }

    @Override // android.view.View, android.view.ViewParent
    @SuppressLint({"MissingSuperCall"})
    public void requestLayout() {
    }

    public void setBackfaceVisibility(String str) {
        this.f5623r = str;
        m6352d();
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        throw new UnsupportedOperationException("This method is not supported for ReactViewGroup instances");
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (i == 0 && this.f5616k == null) {
            return;
        }
        getOrCreateReactViewBackground().m6321b(i);
    }

    public void setBorderRadius(float f) {
        C1513e orCreateReactViewBackground = getOrCreateReactViewBackground();
        orCreateReactViewBackground.m6314a(f);
        if (Build.VERSION.SDK_INT < 18) {
            int i = orCreateReactViewBackground.m6326f() ? 1 : 2;
            if (i != getLayerType()) {
                setLayerType(i, null);
            }
        }
    }

    public void setBorderStyle(String str) {
        getOrCreateReactViewBackground().m6317a(str);
    }

    public void setHitSlopRect(Rect rect) {
        this.f5612g = rect;
    }

    public void setNeedsOffscreenAlphaCompositing(boolean z) {
        this.f5618m = z;
    }

    @Override // p139d.p143b.p208m.p217g.InterfaceC2109d
    public void setOnInterceptTouchEventListener(InterfaceC2107b interfaceC2107b) {
        this.f5617l = interfaceC2107b;
    }

    public void setOpacityIfPossible(float f) {
        this.f5622q = f;
        m6352d();
    }

    public void setOverflow(String str) {
        this.f5613h = str;
        invalidate();
    }

    public void setPointerEvents(EnumC1375x enumC1375x) {
        this.f5614i = enumC1375x;
    }

    public void setRemoveClippedSubviews(boolean z) {
        if (z == this.f5608c) {
            return;
        }
        this.f5608c = z;
        if (z) {
            this.f5611f = new Rect();
            C1377z.m5964a(this, this.f5611f);
            this.f5610e = getChildCount();
            this.f5609d = new View[Math.max(12, this.f5610e)];
            this.f5615j = new a();
            for (int i = 0; i < this.f5610e; i++) {
                View childAt = getChildAt(i);
                this.f5609d[i] = childAt;
                childAt.addOnLayoutChangeListener(this.f5615j);
            }
            mo5962a();
            return;
        }
        C2038a.m8318a(this.f5611f);
        C2038a.m8318a(this.f5609d);
        C2038a.m8318a(this.f5615j);
        for (int i2 = 0; i2 < this.f5610e; i2++) {
            this.f5609d[i2].removeOnLayoutChangeListener(this.f5615j);
        }
        getDrawingRect(this.f5611f);
        m6340b(this.f5611f);
        this.f5609d = null;
        this.f5611f = null;
        this.f5610e = 0;
        this.f5615j = null;
    }

    public void setTranslucentBackgroundDrawable(Drawable drawable) {
        m6337a((Drawable) null);
        C1513e c1513e = this.f5616k;
        if (c1513e != null && drawable != null) {
            m6337a(new LayerDrawable(new Drawable[]{c1513e, drawable}));
        } else if (drawable != null) {
            m6337a(drawable);
        }
    }
}
