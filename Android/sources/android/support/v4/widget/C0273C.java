package android.support.v4.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.widget.AbsListView;
import android.widget.ListView;
import p000a.p005b.p009c.p010a.C0022a;
import p000a.p005b.p009c.p019h.C0098m;
import p000a.p005b.p009c.p019h.C0101p;
import p000a.p005b.p009c.p019h.C0107v;
import p000a.p005b.p009c.p019h.InterfaceC0097l;
import p000a.p005b.p009c.p019h.InterfaceC0100o;

/* renamed from: android.support.v4.widget.C */
/* loaded from: classes.dex */
public class C0273C extends ViewGroup implements InterfaceC0100o, InterfaceC0097l {

    /* renamed from: a */
    private static final String f1122a = "C";

    /* renamed from: b */
    private static final int[] f1123b = {R.attr.enabled};

    /* renamed from: A */
    protected int f1124A;

    /* renamed from: B */
    int f1125B;

    /* renamed from: C */
    int f1126C;

    /* renamed from: D */
    C0288f f1127D;

    /* renamed from: E */
    private Animation f1128E;

    /* renamed from: F */
    private Animation f1129F;

    /* renamed from: G */
    private Animation f1130G;

    /* renamed from: H */
    private Animation f1131H;

    /* renamed from: I */
    private Animation f1132I;

    /* renamed from: J */
    boolean f1133J;

    /* renamed from: K */
    private int f1134K;

    /* renamed from: L */
    boolean f1135L;

    /* renamed from: M */
    private a f1136M;

    /* renamed from: N */
    private Animation.AnimationListener f1137N;

    /* renamed from: O */
    private final Animation f1138O;

    /* renamed from: P */
    private final Animation f1139P;

    /* renamed from: c */
    private View f1140c;

    /* renamed from: d */
    b f1141d;

    /* renamed from: e */
    boolean f1142e;

    /* renamed from: f */
    private int f1143f;

    /* renamed from: g */
    private float f1144g;

    /* renamed from: h */
    private float f1145h;

    /* renamed from: i */
    private final C0101p f1146i;

    /* renamed from: j */
    private final C0098m f1147j;

    /* renamed from: k */
    private final int[] f1148k;

    /* renamed from: l */
    private final int[] f1149l;

    /* renamed from: m */
    private boolean f1150m;

    /* renamed from: n */
    private int f1151n;

    /* renamed from: o */
    int f1152o;

    /* renamed from: p */
    private float f1153p;

    /* renamed from: q */
    private float f1154q;

    /* renamed from: r */
    private boolean f1155r;

    /* renamed from: s */
    private int f1156s;

    /* renamed from: t */
    boolean f1157t;

    /* renamed from: u */
    private boolean f1158u;

    /* renamed from: v */
    private final DecelerateInterpolator f1159v;

    /* renamed from: w */
    C0285c f1160w;

    /* renamed from: x */
    private int f1161x;

    /* renamed from: y */
    protected int f1162y;

    /* renamed from: z */
    float f1163z;

    /* renamed from: android.support.v4.widget.C$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        boolean m1429a(C0273C c0273c, View view);
    }

    /* renamed from: android.support.v4.widget.C$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: a */
        void mo1430a();
    }

    public C0273C(Context context) {
        this(context, null);
    }

    public C0273C(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1142e = false;
        this.f1144g = -1.0f;
        this.f1148k = new int[2];
        this.f1149l = new int[2];
        this.f1156s = -1;
        this.f1161x = -1;
        this.f1137N = new AnimationAnimationListenerC0303u(this);
        this.f1138O = new C0308z(this);
        this.f1139P = new C0271A(this);
        this.f1143f = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f1151n = getResources().getInteger(R.integer.config_mediumAnimTime);
        setWillNotDraw(false);
        this.f1159v = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f1134K = (int) (displayMetrics.density * 40.0f);
        m1417c();
        setChildrenDrawingOrderEnabled(true);
        this.f1125B = (int) (displayMetrics.density * 64.0f);
        this.f1144g = this.f1125B;
        this.f1146i = new C0101p(this);
        this.f1147j = new C0098m(this);
        setNestedScrollingEnabled(true);
        int i = -this.f1134K;
        this.f1152o = i;
        this.f1124A = i;
        m1424a(1.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1123b);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    private Animation m1409a(int i, int i2) {
        C0306x c0306x = new C0306x(this, i, i2);
        c0306x.setDuration(300L);
        this.f1160w.m1573a(null);
        this.f1160w.clearAnimation();
        this.f1160w.startAnimation(c0306x);
        return c0306x;
    }

    /* renamed from: a */
    private void m1410a(int i, Animation.AnimationListener animationListener) {
        this.f1162y = i;
        this.f1138O.reset();
        this.f1138O.setDuration(200L);
        this.f1138O.setInterpolator(this.f1159v);
        if (animationListener != null) {
            this.f1160w.m1573a(animationListener);
        }
        this.f1160w.clearAnimation();
        this.f1160w.startAnimation(this.f1138O);
    }

    /* renamed from: a */
    private void m1411a(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f1156s) {
            this.f1156s = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
        }
    }

    /* renamed from: a */
    private void m1412a(boolean z, boolean z2) {
        if (this.f1142e != z) {
            this.f1133J = z2;
            m1420d();
            this.f1142e = z;
            if (this.f1142e) {
                m1410a(this.f1152o, this.f1137N);
            } else {
                m1425a(this.f1137N);
            }
        }
    }

    /* renamed from: a */
    private boolean m1413a(Animation animation) {
        return (animation == null || !animation.hasStarted() || animation.hasEnded()) ? false : true;
    }

    /* renamed from: b */
    private void m1414b(float f) {
        if (f > this.f1144g) {
            m1412a(true, true);
            return;
        }
        this.f1142e = false;
        this.f1127D.m1581a(0.0f, 0.0f);
        m1415b(this.f1152o, this.f1157t ? null : new AnimationAnimationListenerC0307y(this));
        this.f1127D.m1585a(false);
    }

    /* renamed from: b */
    private void m1415b(int i, Animation.AnimationListener animationListener) {
        if (this.f1157t) {
            m1419c(i, animationListener);
            return;
        }
        this.f1162y = i;
        this.f1139P.reset();
        this.f1139P.setDuration(200L);
        this.f1139P.setInterpolator(this.f1159v);
        if (animationListener != null) {
            this.f1160w.m1573a(animationListener);
        }
        this.f1160w.clearAnimation();
        this.f1160w.startAnimation(this.f1139P);
    }

    /* renamed from: b */
    private void m1416b(Animation.AnimationListener animationListener) {
        this.f1160w.setVisibility(0);
        this.f1127D.setAlpha(255);
        this.f1128E = new C0304v(this);
        this.f1128E.setDuration(this.f1151n);
        if (animationListener != null) {
            this.f1160w.m1573a(animationListener);
        }
        this.f1160w.clearAnimation();
        this.f1160w.startAnimation(this.f1128E);
    }

    /* renamed from: c */
    private void m1417c() {
        this.f1160w = new C0285c(getContext(), -328966);
        this.f1127D = new C0288f(getContext());
        this.f1127D.m1584a(1);
        this.f1160w.setImageDrawable(this.f1127D);
        this.f1160w.setVisibility(8);
        addView(this.f1160w);
    }

    /* renamed from: c */
    private void m1418c(float f) {
        this.f1127D.m1585a(true);
        float min = Math.min(1.0f, Math.abs(f / this.f1144g));
        double d2 = min;
        Double.isNaN(d2);
        float max = (((float) Math.max(d2 - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float abs = Math.abs(f) - this.f1144g;
        int i = this.f1126C;
        if (i <= 0) {
            i = this.f1135L ? this.f1125B - this.f1124A : this.f1125B;
        }
        float f2 = i;
        double max2 = Math.max(0.0f, Math.min(abs, f2 * 2.0f) / f2) / 4.0f;
        double pow = Math.pow(max2, 2.0d);
        Double.isNaN(max2);
        float f3 = ((float) (max2 - pow)) * 2.0f;
        int i2 = this.f1124A + ((int) ((f2 * min) + (f2 * f3 * 2.0f)));
        if (this.f1160w.getVisibility() != 0) {
            this.f1160w.setVisibility(0);
        }
        if (!this.f1157t) {
            this.f1160w.setScaleX(1.0f);
            this.f1160w.setScaleY(1.0f);
        }
        if (this.f1157t) {
            setAnimationProgress(Math.min(1.0f, f / this.f1144g));
        }
        if (f < this.f1144g) {
            if (this.f1127D.getAlpha() > 76 && !m1413a(this.f1130G)) {
                m1423f();
            }
        } else if (this.f1127D.getAlpha() < 255 && !m1413a(this.f1131H)) {
            m1422e();
        }
        this.f1127D.m1581a(0.0f, Math.min(0.8f, max * 0.8f));
        this.f1127D.m1580a(Math.min(1.0f, max));
        this.f1127D.m1587b((((max * 0.4f) - 0.25f) + (f3 * 2.0f)) * 0.5f);
        setTargetOffsetTopAndBottom(i2 - this.f1152o);
    }

    /* renamed from: c */
    private void m1419c(int i, Animation.AnimationListener animationListener) {
        this.f1162y = i;
        this.f1163z = this.f1160w.getScaleX();
        this.f1132I = new C0272B(this);
        this.f1132I.setDuration(150L);
        if (animationListener != null) {
            this.f1160w.m1573a(animationListener);
        }
        this.f1160w.clearAnimation();
        this.f1160w.startAnimation(this.f1132I);
    }

    /* renamed from: d */
    private void m1420d() {
        if (this.f1140c == null) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (!childAt.equals(this.f1160w)) {
                    this.f1140c = childAt;
                    return;
                }
            }
        }
    }

    /* renamed from: d */
    private void m1421d(float f) {
        float f2 = this.f1154q;
        float f3 = f - f2;
        int i = this.f1143f;
        if (f3 <= i || this.f1155r) {
            return;
        }
        this.f1153p = f2 + i;
        this.f1155r = true;
        this.f1127D.setAlpha(76);
    }

    /* renamed from: e */
    private void m1422e() {
        this.f1131H = m1409a(this.f1127D.getAlpha(), 255);
    }

    /* renamed from: f */
    private void m1423f() {
        this.f1130G = m1409a(this.f1127D.getAlpha(), 76);
    }

    private void setColorViewAlpha(int i) {
        this.f1160w.getBackground().setAlpha(i);
        this.f1127D.setAlpha(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m1424a(float f) {
        setTargetOffsetTopAndBottom((this.f1162y + ((int) ((this.f1124A - r0) * f))) - this.f1160w.getTop());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m1425a(Animation.AnimationListener animationListener) {
        this.f1129F = new C0305w(this);
        this.f1129F.setDuration(150L);
        this.f1160w.m1573a(animationListener);
        this.f1160w.clearAnimation();
        this.f1160w.startAnimation(this.f1129F);
    }

    /* renamed from: a */
    public void m1426a(boolean z, int i, int i2) {
        this.f1157t = z;
        this.f1124A = i;
        this.f1125B = i2;
        this.f1135L = true;
        m1428b();
        this.f1142e = false;
    }

    /* renamed from: a */
    public boolean m1427a() {
        a aVar = this.f1136M;
        if (aVar != null) {
            return aVar.m1429a(this, this.f1140c);
        }
        View view = this.f1140c;
        return view instanceof ListView ? C0299q.m1690a((ListView) view, -1) : view.canScrollVertically(-1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m1428b() {
        this.f1160w.clearAnimation();
        this.f1127D.stop();
        this.f1160w.setVisibility(8);
        setColorViewAlpha(255);
        if (this.f1157t) {
            setAnimationProgress(0.0f);
        } else {
            setTargetOffsetTopAndBottom(this.f1124A - this.f1152o);
        }
        this.f1152o = this.f1160w.getTop();
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f1147j.m453a(f, f2, z);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.f1147j.m452a(f, f2);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.f1147j.m458a(i, i2, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f1147j.m456a(i, i2, i3, i4, iArr);
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i, int i2) {
        int i3 = this.f1161x;
        return i3 < 0 ? i2 : i2 == i + (-1) ? i3 : i2 >= i3 ? i2 + 1 : i2;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f1146i.m469a();
    }

    public int getProgressCircleDiameter() {
        return this.f1134K;
    }

    public int getProgressViewEndOffset() {
        return this.f1125B;
    }

    public int getProgressViewStartOffset() {
        return this.f1124A;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return this.f1147j.m451a();
    }

    @Override // android.view.View, p000a.p005b.p009c.p019h.InterfaceC0097l
    public boolean isNestedScrollingEnabled() {
        return this.f1147j.m460b();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m1428b();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        m1420d();
        int actionMasked = motionEvent.getActionMasked();
        if (this.f1158u && actionMasked == 0) {
            this.f1158u = false;
        }
        if (!isEnabled() || this.f1158u || m1427a() || this.f1142e || this.f1150m) {
            return false;
        }
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i = this.f1156s;
                    if (i == -1) {
                        Log.e(f1122a, "Got ACTION_MOVE event but don't have an active pointer id.");
                        return false;
                    }
                    int findPointerIndex = motionEvent.findPointerIndex(i);
                    if (findPointerIndex < 0) {
                        return false;
                    }
                    m1421d(motionEvent.getY(findPointerIndex));
                } else if (actionMasked != 3) {
                    if (actionMasked == 6) {
                        m1411a(motionEvent);
                    }
                }
            }
            this.f1155r = false;
            this.f1156s = -1;
        } else {
            setTargetOffsetTopAndBottom(this.f1124A - this.f1160w.getTop());
            this.f1156s = motionEvent.getPointerId(0);
            this.f1155r = false;
            int findPointerIndex2 = motionEvent.findPointerIndex(this.f1156s);
            if (findPointerIndex2 < 0) {
                return false;
            }
            this.f1154q = motionEvent.getY(findPointerIndex2);
        }
        return this.f1155r;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        if (this.f1140c == null) {
            m1420d();
        }
        View view = this.f1140c;
        if (view == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        int measuredWidth2 = this.f1160w.getMeasuredWidth();
        int measuredHeight2 = this.f1160w.getMeasuredHeight();
        int i5 = measuredWidth / 2;
        int i6 = measuredWidth2 / 2;
        int i7 = this.f1152o;
        this.f1160w.layout(i5 - i6, i7, i5 + i6, measuredHeight2 + i7);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f1140c == null) {
            m1420d();
        }
        View view = this.f1140c;
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        this.f1160w.measure(View.MeasureSpec.makeMeasureSpec(this.f1134K, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f1134K, 1073741824));
        this.f1161x = -1;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            if (getChildAt(i3) == this.f1160w) {
                this.f1161x = i3;
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000a.p005b.p009c.p019h.InterfaceC0100o
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        return dispatchNestedFling(f, f2, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000a.p005b.p009c.p019h.InterfaceC0100o
    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000a.p005b.p009c.p019h.InterfaceC0100o
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        if (i2 > 0) {
            float f = this.f1145h;
            if (f > 0.0f) {
                float f2 = i2;
                if (f2 > f) {
                    iArr[1] = i2 - ((int) f);
                    this.f1145h = 0.0f;
                } else {
                    this.f1145h = f - f2;
                    iArr[1] = i2;
                }
                m1418c(this.f1145h);
            }
        }
        if (this.f1135L && i2 > 0 && this.f1145h == 0.0f && Math.abs(i2 - iArr[1]) > 0) {
            this.f1160w.setVisibility(8);
        }
        int[] iArr2 = this.f1148k;
        if (dispatchNestedPreScroll(i - iArr[0], i2 - iArr[1], iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000a.p005b.p009c.p019h.InterfaceC0100o
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        dispatchNestedScroll(i, i2, i3, i4, this.f1149l);
        if (i4 + this.f1149l[1] >= 0 || m1427a()) {
            return;
        }
        this.f1145h += Math.abs(r11);
        m1418c(this.f1145h);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000a.p005b.p009c.p019h.InterfaceC0100o
    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f1146i.m472a(view, view2, i);
        startNestedScroll(i & 2);
        this.f1145h = 0.0f;
        this.f1150m = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000a.p005b.p009c.p019h.InterfaceC0100o
    public boolean onStartNestedScroll(View view, View view2, int i) {
        return (!isEnabled() || this.f1158u || this.f1142e || (i & 2) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000a.p005b.p009c.p019h.InterfaceC0100o
    public void onStopNestedScroll(View view) {
        this.f1146i.m470a(view);
        this.f1150m = false;
        float f = this.f1145h;
        if (f > 0.0f) {
            m1414b(f);
            this.f1145h = 0.0f;
        }
        stopNestedScroll();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (this.f1158u && actionMasked == 0) {
            this.f1158u = false;
        }
        if (!isEnabled() || this.f1158u || m1427a() || this.f1142e || this.f1150m) {
            return false;
        }
        if (actionMasked == 0) {
            this.f1156s = motionEvent.getPointerId(0);
            this.f1155r = false;
        } else {
            if (actionMasked == 1) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f1156s);
                if (findPointerIndex < 0) {
                    Log.e(f1122a, "Got ACTION_UP event but don't have an active pointer id.");
                    return false;
                }
                if (this.f1155r) {
                    float y = (motionEvent.getY(findPointerIndex) - this.f1153p) * 0.5f;
                    this.f1155r = false;
                    m1414b(y);
                }
                this.f1156s = -1;
                return false;
            }
            if (actionMasked == 2) {
                int findPointerIndex2 = motionEvent.findPointerIndex(this.f1156s);
                if (findPointerIndex2 < 0) {
                    Log.e(f1122a, "Got ACTION_MOVE event but have an invalid active pointer id.");
                    return false;
                }
                float y2 = motionEvent.getY(findPointerIndex2);
                m1421d(y2);
                if (this.f1155r) {
                    float f = (y2 - this.f1153p) * 0.5f;
                    if (f <= 0.0f) {
                        return false;
                    }
                    m1418c(f);
                }
            } else {
                if (actionMasked == 3) {
                    return false;
                }
                if (actionMasked == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    if (actionIndex < 0) {
                        Log.e(f1122a, "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                        return false;
                    }
                    this.f1156s = motionEvent.getPointerId(actionIndex);
                } else if (actionMasked == 6) {
                    m1411a(motionEvent);
                }
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (Build.VERSION.SDK_INT >= 21 || !(this.f1140c instanceof AbsListView)) {
            View view = this.f1140c;
            if (view == null || C0107v.m531s(view)) {
                super.requestDisallowInterceptTouchEvent(z);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setAnimationProgress(float f) {
        this.f1160w.setScaleX(f);
        this.f1160w.setScaleY(f);
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(int... iArr) {
        m1420d();
        this.f1127D.m1586a(iArr);
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr2[i] = C0022a.m86a(context, iArr[i]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i) {
        this.f1144g = i;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (z) {
            return;
        }
        m1428b();
    }

    @Override // android.view.View, p000a.p005b.p009c.p019h.InterfaceC0097l
    public void setNestedScrollingEnabled(boolean z) {
        this.f1147j.m450a(z);
    }

    public void setOnChildScrollUpCallback(a aVar) {
        this.f1136M = aVar;
    }

    public void setOnRefreshListener(b bVar) {
        this.f1141d = bVar;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i) {
        setProgressBackgroundColorSchemeResource(i);
    }

    public void setProgressBackgroundColorSchemeColor(int i) {
        this.f1160w.setBackgroundColor(i);
    }

    public void setProgressBackgroundColorSchemeResource(int i) {
        setProgressBackgroundColorSchemeColor(C0022a.m86a(getContext(), i));
    }

    public void setRefreshing(boolean z) {
        if (!z || this.f1142e == z) {
            m1412a(z, false);
            return;
        }
        this.f1142e = z;
        setTargetOffsetTopAndBottom((!this.f1135L ? this.f1125B + this.f1124A : this.f1125B) - this.f1152o);
        this.f1133J = false;
        m1416b(this.f1137N);
    }

    public void setSize(int i) {
        if (i == 0 || i == 1) {
            this.f1134K = (int) (getResources().getDisplayMetrics().density * (i == 0 ? 56.0f : 40.0f));
            this.f1160w.setImageDrawable(null);
            this.f1127D.m1584a(i);
            this.f1160w.setImageDrawable(this.f1127D);
        }
    }

    public void setSlingshotDistance(int i) {
        this.f1126C = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setTargetOffsetTopAndBottom(int i) {
        this.f1160w.bringToFront();
        C0107v.m508b(this.f1160w, i);
        this.f1152o = this.f1160w.getTop();
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i) {
        return this.f1147j.m461b(i);
    }

    @Override // android.view.View, p000a.p005b.p009c.p019h.InterfaceC0097l
    public void stopNestedScroll() {
        this.f1147j.m462c();
    }
}
