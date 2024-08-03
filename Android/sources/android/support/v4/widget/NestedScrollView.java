package android.support.v4.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import java.util.ArrayList;
import p000a.p005b.p009c.p019h.C0089d;
import p000a.p005b.p009c.p019h.C0098m;
import p000a.p005b.p009c.p019h.C0101p;
import p000a.p005b.p009c.p019h.C0107v;
import p000a.p005b.p009c.p019h.InterfaceC0096k;
import p000a.p005b.p009c.p019h.InterfaceC0099n;
import p000a.p005b.p009c.p019h.InterfaceC0104s;
import p000a.p005b.p009c.p019h.p020a.C0080a;
import p000a.p005b.p009c.p019h.p020a.C0082c;

/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements InterfaceC0099n, InterfaceC0096k, InterfaceC0104s {

    /* renamed from: a */
    private static final C0280a f1194a = new C0280a();

    /* renamed from: b */
    private static final int[] f1195b = {R.attr.fillViewport};

    /* renamed from: A */
    private float f1196A;

    /* renamed from: B */
    private InterfaceC0281b f1197B;

    /* renamed from: c */
    private long f1198c;

    /* renamed from: d */
    private final Rect f1199d;

    /* renamed from: e */
    private OverScroller f1200e;

    /* renamed from: f */
    private EdgeEffect f1201f;

    /* renamed from: g */
    private EdgeEffect f1202g;

    /* renamed from: h */
    private int f1203h;

    /* renamed from: i */
    private boolean f1204i;

    /* renamed from: j */
    private boolean f1205j;

    /* renamed from: k */
    private View f1206k;

    /* renamed from: l */
    private boolean f1207l;

    /* renamed from: m */
    private VelocityTracker f1208m;

    /* renamed from: n */
    private boolean f1209n;

    /* renamed from: o */
    private boolean f1210o;

    /* renamed from: p */
    private int f1211p;

    /* renamed from: q */
    private int f1212q;

    /* renamed from: r */
    private int f1213r;

    /* renamed from: s */
    private int f1214s;

    /* renamed from: t */
    private final int[] f1215t;

    /* renamed from: u */
    private final int[] f1216u;

    /* renamed from: v */
    private int f1217v;

    /* renamed from: w */
    private int f1218w;

    /* renamed from: x */
    private C0282c f1219x;

    /* renamed from: y */
    private final C0101p f1220y;

    /* renamed from: z */
    private final C0098m f1221z;

    /* renamed from: android.support.v4.widget.NestedScrollView$a */
    /* loaded from: classes.dex */
    static class C0280a extends C0089d {
        C0280a() {
        }

        @Override // p000a.p005b.p009c.p019h.C0089d
        /* renamed from: a */
        public void mo321a(View view, C0080a c0080a) {
            int scrollRange;
            super.mo321a(view, c0080a);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            c0080a.m367a((CharSequence) ScrollView.class.getName());
            if (!nestedScrollView.isEnabled() || (scrollRange = nestedScrollView.getScrollRange()) <= 0) {
                return;
            }
            c0080a.m390g(true);
            if (nestedScrollView.getScrollY() > 0) {
                c0080a.m364a(8192);
            }
            if (nestedScrollView.getScrollY() < scrollRange) {
                c0080a.m364a(4096);
            }
        }

        @Override // p000a.p005b.p009c.p019h.C0089d
        /* renamed from: a */
        public boolean mo322a(View view, int i, Bundle bundle) {
            if (super.mo322a(view, i, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            if (i == 4096) {
                int min = Math.min(nestedScrollView.getScrollY() + ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
                if (min == nestedScrollView.getScrollY()) {
                    return false;
                }
                nestedScrollView.m1530b(0, min);
                return true;
            }
            if (i != 8192) {
                return false;
            }
            int max = Math.max(nestedScrollView.getScrollY() - ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
            if (max == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.m1530b(0, max);
            return true;
        }

        @Override // p000a.p005b.p009c.p019h.C0089d
        /* renamed from: b */
        public void mo323b(View view, AccessibilityEvent accessibilityEvent) {
            super.mo323b(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            C0082c.m409a(accessibilityEvent, nestedScrollView.getScrollX());
            C0082c.m410b(accessibilityEvent, nestedScrollView.getScrollRange());
        }
    }

    /* renamed from: android.support.v4.widget.NestedScrollView$b */
    /* loaded from: classes.dex */
    public interface InterfaceC0281b {
        /* renamed from: a */
        void mo1536a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: android.support.v4.widget.NestedScrollView$c */
    /* loaded from: classes.dex */
    public static class C0282c extends View.BaseSavedState {
        public static final Parcelable.Creator<C0282c> CREATOR = new C0300r();

        /* renamed from: a */
        public int f1222a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C0282c(Parcel parcel) {
            super(parcel);
            this.f1222a = parcel.readInt();
        }

        C0282c(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f1222a + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f1222a);
        }
    }

    public NestedScrollView(Context context) {
        this(context, null);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1199d = new Rect();
        this.f1204i = true;
        this.f1205j = false;
        this.f1206k = null;
        this.f1207l = false;
        this.f1210o = true;
        this.f1214s = -1;
        this.f1215t = new int[2];
        this.f1216u = new int[2];
        m1517e();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1195b, i, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f1220y = new C0101p(this);
        this.f1221z = new C0098m(this);
        setNestedScrollingEnabled(true);
        C0107v.m496a(this, f1194a);
    }

    /* renamed from: a */
    private static int m1503a(int i, int i2, int i3) {
        if (i2 >= i3 || i < 0) {
            return 0;
        }
        return i2 + i > i3 ? i3 - i2 : i;
    }

    /* renamed from: a */
    private View m1504a(boolean z, int i, int i2) {
        ArrayList focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z2 = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view2 = (View) focusables.get(i3);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i < bottom && top < i2) {
                boolean z3 = i < top && bottom < i2;
                if (view == null) {
                    view = view2;
                    z2 = z3;
                } else {
                    boolean z4 = (z && top < view.getTop()) || (!z && bottom > view.getBottom());
                    if (z2) {
                        if (z3) {
                            if (!z4) {
                            }
                            view = view2;
                        }
                    } else if (z3) {
                        view = view2;
                        z2 = true;
                    } else {
                        if (!z4) {
                        }
                        view = view2;
                    }
                }
            }
        }
        return view;
    }

    /* renamed from: a */
    private void m1505a(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f1214s) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f1203h = (int) motionEvent.getY(i);
            this.f1214s = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f1208m;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* renamed from: a */
    private boolean m1506a() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom();
    }

    /* renamed from: a */
    private boolean m1507a(Rect rect, boolean z) {
        int m1522a = m1522a(rect);
        boolean z2 = m1522a != 0;
        if (z2) {
            if (z) {
                scrollBy(0, m1522a);
            } else {
                m1523a(0, m1522a);
            }
        }
        return z2;
    }

    /* renamed from: a */
    private boolean m1508a(View view) {
        return !m1509a(view, 0, getHeight());
    }

    /* renamed from: a */
    private boolean m1509a(View view, int i, int i2) {
        view.getDrawingRect(this.f1199d);
        offsetDescendantRectToMyCoords(view, this.f1199d);
        return this.f1199d.bottom + i >= getScrollY() && this.f1199d.top - i <= getScrollY() + i2;
    }

    /* renamed from: a */
    private static boolean m1510a(View view, View view2) {
        if (view == view2) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && m1510a((View) parent, view2);
    }

    /* renamed from: b */
    private void m1511b() {
        this.f1207l = false;
        m1519g();
        m1535f(0);
        EdgeEffect edgeEffect = this.f1201f;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            this.f1202g.onRelease();
        }
    }

    /* renamed from: b */
    private void m1512b(View view) {
        view.getDrawingRect(this.f1199d);
        offsetDescendantRectToMyCoords(view, this.f1199d);
        int m1522a = m1522a(this.f1199d);
        if (m1522a != 0) {
            scrollBy(0, m1522a);
        }
    }

    /* renamed from: b */
    private boolean m1513b(int i, int i2, int i3) {
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = height + scrollY;
        boolean z = false;
        boolean z2 = i == 33;
        View m1504a = m1504a(z2, i2, i3);
        if (m1504a == null) {
            m1504a = this;
        }
        if (i2 < scrollY || i3 > i4) {
            m1520g(z2 ? i2 - scrollY : i3 - i4);
            z = true;
        }
        if (m1504a != findFocus()) {
            m1504a.requestFocus(i);
        }
        return z;
    }

    /* renamed from: c */
    private void m1514c() {
        if (getOverScrollMode() == 2) {
            this.f1201f = null;
            this.f1202g = null;
        } else if (this.f1201f == null) {
            Context context = getContext();
            this.f1201f = new EdgeEffect(context);
            this.f1202g = new EdgeEffect(context);
        }
    }

    /* renamed from: d */
    private void m1515d() {
        VelocityTracker velocityTracker = this.f1208m;
        if (velocityTracker == null) {
            this.f1208m = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    /* renamed from: d */
    private boolean m1516d(int i, int i2) {
        if (getChildCount() <= 0) {
            return false;
        }
        int scrollY = getScrollY();
        View childAt = getChildAt(0);
        return i2 >= childAt.getTop() - scrollY && i2 < childAt.getBottom() - scrollY && i >= childAt.getLeft() && i < childAt.getRight();
    }

    /* renamed from: e */
    private void m1517e() {
        this.f1200e = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f1211p = viewConfiguration.getScaledTouchSlop();
        this.f1212q = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f1213r = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    /* renamed from: f */
    private void m1518f() {
        if (this.f1208m == null) {
            this.f1208m = VelocityTracker.obtain();
        }
    }

    /* renamed from: g */
    private void m1519g() {
        VelocityTracker velocityTracker = this.f1208m;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f1208m = null;
        }
    }

    /* renamed from: g */
    private void m1520g(int i) {
        if (i != 0) {
            if (this.f1210o) {
                m1523a(0, i);
            } else {
                scrollBy(0, i);
            }
        }
    }

    private float getVerticalScrollFactorCompat() {
        if (this.f1196A == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f1196A = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f1196A;
    }

    /* renamed from: h */
    private void m1521h(int i) {
        int scrollY = getScrollY();
        boolean z = (scrollY > 0 || i > 0) && (scrollY < getScrollRange() || i < 0);
        float f = i;
        if (dispatchNestedPreFling(0.0f, f)) {
            return;
        }
        dispatchNestedFling(0.0f, f, z);
        m1529b(i);
    }

    /* renamed from: a */
    protected int m1522a(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i2 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i - verticalFadingEdgeLength : i;
        if (rect.bottom > i2 && rect.top > scrollY) {
            return Math.min((rect.height() > height ? rect.top - scrollY : rect.bottom - i2) + 0, (childAt.getBottom() + layoutParams.bottomMargin) - i);
        }
        if (rect.top >= scrollY || rect.bottom >= i2) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i2 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    /* renamed from: a */
    public final void m1523a(int i, int i2) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f1198c > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int max = Math.max(0, Math.min(i2 + scrollY, Math.max(0, height - height2))) - scrollY;
            this.f1218w = getScrollY();
            this.f1200e.startScroll(getScrollX(), scrollY, 0, max);
            C0107v.m532t(this);
        } else {
            if (!this.f1200e.isFinished()) {
                this.f1200e.abortAnimation();
            }
            scrollBy(i, i2);
        }
        this.f1198c = AnimationUtils.currentAnimationTimeMillis();
    }

    @Override // p000a.p005b.p009c.p019h.InterfaceC0099n
    /* renamed from: a */
    public void mo464a(View view, int i) {
        this.f1220y.m471a(view, i);
        m1535f(i);
    }

    @Override // p000a.p005b.p009c.p019h.InterfaceC0099n
    /* renamed from: a */
    public void mo465a(View view, int i, int i2, int i3, int i4, int i5) {
        int scrollY = getScrollY();
        scrollBy(0, i4);
        int scrollY2 = getScrollY() - scrollY;
        m1526a(0, scrollY2, 0, i4 - scrollY2, (int[]) null, i5);
    }

    @Override // p000a.p005b.p009c.p019h.InterfaceC0099n
    /* renamed from: a */
    public void mo466a(View view, int i, int i2, int[] iArr, int i3) {
        m1527a(i, i2, iArr, (int[]) null, i3);
    }

    /* renamed from: a */
    public boolean m1524a(int i) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !m1509a(findNextFocus, maxScrollAmount, getHeight())) {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            m1520g(maxScrollAmount);
        } else {
            findNextFocus.getDrawingRect(this.f1199d);
            offsetDescendantRectToMyCoords(findNextFocus, this.f1199d);
            m1520g(m1522a(this.f1199d));
            findNextFocus.requestFocus(i);
        }
        if (findFocus == null || !findFocus.isFocused() || !m1508a(findFocus)) {
            return true;
        }
        int descendantFocusability = getDescendantFocusability();
        setDescendantFocusability(131072);
        requestFocus();
        setDescendantFocusability(descendantFocusability);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0083 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x005a  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    boolean m1525a(int r13, int r14, int r15, int r16, int r17, int r18, int r19, int r20, boolean r21) {
        /*
            r12 = this;
            r0 = r12
            int r1 = r12.getOverScrollMode()
            int r2 = r12.computeHorizontalScrollRange()
            int r3 = r12.computeHorizontalScrollExtent()
            r4 = 0
            r5 = 1
            if (r2 <= r3) goto L13
            r2 = 1
            goto L14
        L13:
            r2 = 0
        L14:
            int r3 = r12.computeVerticalScrollRange()
            int r6 = r12.computeVerticalScrollExtent()
            if (r3 <= r6) goto L20
            r3 = 1
            goto L21
        L20:
            r3 = 0
        L21:
            if (r1 == 0) goto L2a
            if (r1 != r5) goto L28
            if (r2 == 0) goto L28
            goto L2a
        L28:
            r2 = 0
            goto L2b
        L2a:
            r2 = 1
        L2b:
            if (r1 == 0) goto L34
            if (r1 != r5) goto L32
            if (r3 == 0) goto L32
            goto L34
        L32:
            r1 = 0
            goto L35
        L34:
            r1 = 1
        L35:
            int r3 = r15 + r13
            if (r2 != 0) goto L3b
            r2 = 0
            goto L3d
        L3b:
            r2 = r19
        L3d:
            int r6 = r16 + r14
            if (r1 != 0) goto L43
            r1 = 0
            goto L45
        L43:
            r1 = r20
        L45:
            int r7 = -r2
            int r2 = r2 + r17
            int r8 = -r1
            int r1 = r1 + r18
            if (r3 <= r2) goto L50
            r7 = r2
        L4e:
            r2 = 1
            goto L55
        L50:
            if (r3 >= r7) goto L53
            goto L4e
        L53:
            r7 = r3
            r2 = 0
        L55:
            if (r6 <= r1) goto L5a
            r6 = r1
        L58:
            r1 = 1
            goto L5f
        L5a:
            if (r6 >= r8) goto L5e
            r6 = r8
            goto L58
        L5e:
            r1 = 0
        L5f:
            if (r1 == 0) goto L7e
            boolean r3 = r12.m1533d(r5)
            if (r3 != 0) goto L7e
            android.widget.OverScroller r3 = r0.f1200e
            r8 = 0
            r9 = 0
            r10 = 0
            int r11 = r12.getScrollRange()
            r13 = r3
            r14 = r7
            r15 = r6
            r16 = r8
            r17 = r9
            r18 = r10
            r19 = r11
            r13.springBack(r14, r15, r16, r17, r18, r19)
        L7e:
            r12.onOverScrolled(r7, r6, r2, r1)
            if (r2 != 0) goto L85
            if (r1 == 0) goto L86
        L85:
            r4 = 1
        L86:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.NestedScrollView.m1525a(int, int, int, int, int, int, int, int, boolean):boolean");
    }

    /* renamed from: a */
    public boolean m1526a(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return this.f1221z.m457a(i, i2, i3, i4, iArr, i5);
    }

    /* renamed from: a */
    public boolean m1527a(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return this.f1221z.m459a(i, i2, iArr, iArr2, i3);
    }

    /* renamed from: a */
    public boolean m1528a(KeyEvent keyEvent) {
        this.f1199d.setEmpty();
        if (!m1506a()) {
            if (!isFocused() || keyEvent.getKeyCode() == 4) {
                return false;
            }
            View findFocus = findFocus();
            if (findFocus == this) {
                findFocus = null;
            }
            View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
            return (findNextFocus == null || findNextFocus == this || !findNextFocus.requestFocus(130)) ? false : true;
        }
        if (keyEvent.getAction() != 0) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 19) {
            return !keyEvent.isAltPressed() ? m1524a(33) : m1531c(33);
        }
        if (keyCode == 20) {
            return !keyEvent.isAltPressed() ? m1524a(130) : m1531c(130);
        }
        if (keyCode != 62) {
            return false;
        }
        m1534e(keyEvent.isShiftPressed() ? 33 : 130);
        return false;
    }

    @Override // p000a.p005b.p009c.p019h.InterfaceC0099n
    /* renamed from: a */
    public boolean mo467a(View view, View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, layoutParams);
    }

    /* renamed from: b */
    public void m1529b(int i) {
        if (getChildCount() > 0) {
            m1532c(2, 1);
            this.f1200e.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            this.f1218w = getScrollY();
            C0107v.m532t(this);
        }
    }

    /* renamed from: b */
    public final void m1530b(int i, int i2) {
        m1523a(i - getScrollX(), i2 - getScrollY());
    }

    @Override // p000a.p005b.p009c.p019h.InterfaceC0099n
    /* renamed from: b */
    public void mo468b(View view, View view2, int i, int i2) {
        this.f1220y.m473a(view, view2, i, i2);
        m1532c(2, i2);
    }

    /* renamed from: c */
    public boolean m1531c(int i) {
        int childCount;
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.f1199d;
        rect.top = 0;
        rect.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f1199d.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect2 = this.f1199d;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f1199d;
        return m1513b(i, rect3.top, rect3.bottom);
    }

    /* renamed from: c */
    public boolean m1532c(int i, int i2) {
        return this.f1221z.m455a(i, i2);
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public void computeScroll() {
        EdgeEffect edgeEffect;
        if (!this.f1200e.computeScrollOffset()) {
            if (m1533d(1)) {
                m1535f(1);
            }
            this.f1218w = 0;
            return;
        }
        this.f1200e.getCurrX();
        int currY = this.f1200e.getCurrY();
        int i = currY - this.f1218w;
        if (m1527a(0, i, this.f1216u, (int[]) null, 1)) {
            i -= this.f1216u[1];
        }
        int i2 = i;
        if (i2 != 0) {
            int scrollRange = getScrollRange();
            int scrollY = getScrollY();
            m1525a(0, i2, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
            int scrollY2 = getScrollY() - scrollY;
            if (!m1526a(0, scrollY2, 0, i2 - scrollY2, (int[]) null, 1)) {
                int overScrollMode = getOverScrollMode();
                if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    m1514c();
                    if (currY <= 0 && scrollY > 0) {
                        edgeEffect = this.f1201f;
                    } else if (currY >= scrollRange && scrollY < scrollRange) {
                        edgeEffect = this.f1202g;
                    }
                    edgeEffect.onAbsorb((int) this.f1200e.getCurrVelocity());
                }
            }
        }
        this.f1218w = currY;
        C0107v.m532t(this);
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > max ? bottom + (scrollY - max) : bottom;
    }

    /* renamed from: d */
    public boolean m1533d(int i) {
        return this.f1221z.m454a(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || m1528a(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f1221z.m453a(f, f2, z);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.f1221z.m452a(f, f2);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return m1527a(i, i2, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return m1526a(i, i2, i3, i4, iArr, 0);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        if (this.f1201f != null) {
            int scrollY = getScrollY();
            int i = 0;
            if (!this.f1201f.isFinished()) {
                int save = canvas.save();
                int width = getWidth();
                int height = getHeight();
                int min = Math.min(0, scrollY);
                if (Build.VERSION.SDK_INT < 21 || getClipToPadding()) {
                    width -= getPaddingLeft() + getPaddingRight();
                    paddingLeft = getPaddingLeft() + 0;
                } else {
                    paddingLeft = 0;
                }
                if (Build.VERSION.SDK_INT >= 21 && getClipToPadding()) {
                    height -= getPaddingTop() + getPaddingBottom();
                    min += getPaddingTop();
                }
                canvas.translate(paddingLeft, min);
                this.f1201f.setSize(width, height);
                if (this.f1201f.draw(canvas)) {
                    C0107v.m532t(this);
                }
                canvas.restoreToCount(save);
            }
            if (this.f1202g.isFinished()) {
                return;
            }
            int save2 = canvas.save();
            int width2 = getWidth();
            int height2 = getHeight();
            int max = Math.max(getScrollRange(), scrollY) + height2;
            if (Build.VERSION.SDK_INT < 21 || getClipToPadding()) {
                width2 -= getPaddingLeft() + getPaddingRight();
                i = 0 + getPaddingLeft();
            }
            if (Build.VERSION.SDK_INT >= 21 && getClipToPadding()) {
                height2 -= getPaddingTop() + getPaddingBottom();
                max -= getPaddingBottom();
            }
            canvas.translate(i - width2, max);
            canvas.rotate(180.0f, width2, 0.0f);
            this.f1202g.setSize(width2, height2);
            if (this.f1202g.draw(canvas)) {
                C0107v.m532t(this);
            }
            canvas.restoreToCount(save2);
        }
    }

    /* renamed from: e */
    public boolean m1534e(int i) {
        boolean z = i == 130;
        int height = getHeight();
        if (z) {
            this.f1199d.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                Rect rect = this.f1199d;
                if (rect.top + height > bottom) {
                    rect.top = bottom - height;
                }
            }
        } else {
            this.f1199d.top = getScrollY() - height;
            Rect rect2 = this.f1199d;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        Rect rect3 = this.f1199d;
        int i2 = rect3.top;
        rect3.bottom = height + i2;
        return m1513b(i, i2, rect3.bottom);
    }

    /* renamed from: f */
    public void m1535f(int i) {
        this.f1221z.m463c(i);
    }

    @Override // android.view.View
    protected float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f1220y.m469a();
    }

    int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    protected float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return m1533d(0);
    }

    @Override // android.view.View, p000a.p005b.p009c.p019h.InterfaceC0097l
    public boolean isNestedScrollingEnabled() {
        return this.f1221z.m460b();
    }

    @Override // android.view.ViewGroup
    protected void measureChild(View view, int i, int i2) {
        view.measure(FrameLayout.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    protected void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(FrameLayout.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1205j = false;
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) != 0 && motionEvent.getAction() == 8 && !this.f1207l) {
            float axisValue = motionEvent.getAxisValue(9);
            if (axisValue != 0.0f) {
                int verticalScrollFactorCompat = (int) (axisValue * getVerticalScrollFactorCompat());
                int scrollRange = getScrollRange();
                int scrollY = getScrollY();
                int i = scrollY - verticalScrollFactorCompat;
                if (i < 0) {
                    i = 0;
                } else if (i > scrollRange) {
                    i = scrollRange;
                }
                if (i != scrollY) {
                    super.scrollTo(getScrollX(), i);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 2 && this.f1207l) {
            return true;
        }
        int i = action & 255;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    int i2 = this.f1214s;
                    if (i2 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i2);
                        if (findPointerIndex == -1) {
                            Log.e("NestedScrollView", "Invalid pointerId=" + i2 + " in onInterceptTouchEvent");
                        } else {
                            int y = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y - this.f1203h) > this.f1211p && (2 & getNestedScrollAxes()) == 0) {
                                this.f1207l = true;
                                this.f1203h = y;
                                m1518f();
                                this.f1208m.addMovement(motionEvent);
                                this.f1217v = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i != 3) {
                    if (i == 6) {
                        m1505a(motionEvent);
                    }
                }
            }
            this.f1207l = false;
            this.f1214s = -1;
            m1519g();
            if (this.f1200e.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                C0107v.m532t(this);
            }
            m1535f(0);
        } else {
            int y2 = (int) motionEvent.getY();
            if (m1516d((int) motionEvent.getX(), y2)) {
                this.f1203h = y2;
                this.f1214s = motionEvent.getPointerId(0);
                m1515d();
                this.f1208m.addMovement(motionEvent);
                this.f1200e.computeScrollOffset();
                this.f1207l = !this.f1200e.isFinished();
                m1532c(2, 0);
            } else {
                this.f1207l = false;
                m1519g();
            }
        }
        return this.f1207l;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = 0;
        this.f1204i = false;
        View view = this.f1206k;
        if (view != null && m1510a(view, this)) {
            m1512b(this.f1206k);
        }
        this.f1206k = null;
        if (!this.f1205j) {
            if (this.f1219x != null) {
                scrollTo(getScrollX(), this.f1219x.f1222a);
                this.f1219x = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i5 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int m1503a = m1503a(scrollY, paddingTop, i5);
            if (m1503a != scrollY) {
                scrollTo(getScrollX(), m1503a);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f1205j = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f1209n && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(FrameLayout.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000a.p005b.p009c.p019h.InterfaceC0100o
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        m1521h((int) f2);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000a.p005b.p009c.p019h.InterfaceC0100o
    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000a.p005b.p009c.p019h.InterfaceC0100o
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        mo466a(view, i, i2, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000a.p005b.p009c.p019h.InterfaceC0100o
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        mo465a(view, i, i2, i3, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000a.p005b.p009c.p019h.InterfaceC0100o
    public void onNestedScrollAccepted(View view, View view2, int i) {
        mo468b(view, view2, i, 0);
    }

    @Override // android.view.View
    protected void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        View findNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        if (findNextFocus == null || m1508a(findNextFocus)) {
            return false;
        }
        return findNextFocus.requestFocus(i, rect);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0282c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0282c c0282c = (C0282c) parcelable;
        super.onRestoreInstanceState(c0282c.getSuperState());
        this.f1219x = c0282c;
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        C0282c c0282c = new C0282c(super.onSaveInstanceState());
        c0282c.f1222a = getScrollY();
        return c0282c;
    }

    @Override // android.view.View
    protected void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        InterfaceC0281b interfaceC0281b = this.f1197B;
        if (interfaceC0281b != null) {
            interfaceC0281b.mo1536a(this, i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View findFocus = findFocus();
        if (findFocus == null || this == findFocus || !m1509a(findFocus, 0, i4)) {
            return;
        }
        findFocus.getDrawingRect(this.f1199d);
        offsetDescendantRectToMyCoords(findFocus, this.f1199d);
        m1520g(m1522a(this.f1199d));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000a.p005b.p009c.p019h.InterfaceC0100o
    public boolean onStartNestedScroll(View view, View view2, int i) {
        return mo467a(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000a.p005b.p009c.p019h.InterfaceC0100o
    public void onStopNestedScroll(View view) {
        mo464a(view, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0073, code lost:            if (r23.f1200e.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()) != false) goto L25;     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0075, code lost:            p000a.p005b.p009c.p019h.C0107v.m532t(r23);     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0218, code lost:            if (r23.f1200e.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()) != false) goto L25;     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r24) {
        /*
            Method dump skipped, instructions count: 607
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.NestedScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (this.f1204i) {
            this.f1206k = view2;
        } else {
            m1512b(view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return m1507a(rect, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            m1519g();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.f1204i = true;
        super.requestLayout();
    }

    @Override // android.view.View
    public void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int m1503a = m1503a(i, width, width2);
            int m1503a2 = m1503a(i2, height, height2);
            if (m1503a == getScrollX() && m1503a2 == getScrollY()) {
                return;
            }
            super.scrollTo(m1503a, m1503a2);
        }
    }

    public void setFillViewport(boolean z) {
        if (z != this.f1209n) {
            this.f1209n = z;
            requestLayout();
        }
    }

    @Override // android.view.View, p000a.p005b.p009c.p019h.InterfaceC0097l
    public void setNestedScrollingEnabled(boolean z) {
        this.f1221z.m450a(z);
    }

    public void setOnScrollChangeListener(InterfaceC0281b interfaceC0281b) {
        this.f1197B = interfaceC0281b;
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.f1210o = z;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i) {
        return m1532c(i, 0);
    }

    @Override // android.view.View, p000a.p005b.p009c.p019h.InterfaceC0097l
    public void stopNestedScroll() {
        m1535f(0);
    }
}
