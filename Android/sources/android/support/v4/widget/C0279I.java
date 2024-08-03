package android.support.v4.widget;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.Arrays;
import p000a.p005b.p009c.p019h.C0107v;

/* renamed from: android.support.v4.widget.I */
/* loaded from: classes.dex */
public class C0279I {

    /* renamed from: a */
    private static final Interpolator f1171a = new InterpolatorC0277G();

    /* renamed from: b */
    private int f1172b;

    /* renamed from: c */
    private int f1173c;

    /* renamed from: e */
    private float[] f1175e;

    /* renamed from: f */
    private float[] f1176f;

    /* renamed from: g */
    private float[] f1177g;

    /* renamed from: h */
    private float[] f1178h;

    /* renamed from: i */
    private int[] f1179i;

    /* renamed from: j */
    private int[] f1180j;

    /* renamed from: k */
    private int[] f1181k;

    /* renamed from: l */
    private int f1182l;

    /* renamed from: m */
    private VelocityTracker f1183m;

    /* renamed from: n */
    private float f1184n;

    /* renamed from: o */
    private float f1185o;

    /* renamed from: p */
    private int f1186p;

    /* renamed from: q */
    private int f1187q;

    /* renamed from: r */
    private OverScroller f1188r;

    /* renamed from: s */
    private final a f1189s;

    /* renamed from: t */
    private View f1190t;

    /* renamed from: u */
    private boolean f1191u;

    /* renamed from: v */
    private final ViewGroup f1192v;

    /* renamed from: d */
    private int f1174d = -1;

    /* renamed from: w */
    private final Runnable f1193w = new RunnableC0278H(this);

    /* renamed from: android.support.v4.widget.I$a */
    /* loaded from: classes.dex */
    public static abstract class a {
        /* renamed from: a */
        public int m1490a(int i) {
            return i;
        }

        /* renamed from: a */
        public abstract int mo1491a(View view);

        /* renamed from: a */
        public abstract int mo1492a(View view, int i, int i2);

        /* renamed from: a */
        public abstract void mo1493a(int i, int i2);

        /* renamed from: a */
        public abstract void mo1494a(View view, float f, float f2);

        /* renamed from: a */
        public abstract void mo1495a(View view, int i);

        /* renamed from: a */
        public abstract void mo1496a(View view, int i, int i2, int i3, int i4);

        /* renamed from: b */
        public int m1497b(View view) {
            return 0;
        }

        /* renamed from: b */
        public abstract int mo1498b(View view, int i, int i2);

        /* renamed from: b */
        public abstract void mo1499b(int i, int i2);

        /* renamed from: b */
        public abstract boolean mo1500b(int i);

        /* renamed from: b */
        public abstract boolean mo1501b(View view, int i);

        /* renamed from: c */
        public abstract void mo1502c(int i);
    }

    private C0279I(Context context, ViewGroup viewGroup, a aVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (aVar == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f1192v = viewGroup;
        this.f1189s = aVar;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f1186p = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f1173c = viewConfiguration.getScaledTouchSlop();
        this.f1184n = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f1185o = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f1188r = new OverScroller(context, f1171a);
    }

    /* renamed from: a */
    private float m1448a(float f, float f2, float f3) {
        float abs = Math.abs(f);
        if (abs < f2) {
            return 0.0f;
        }
        return abs > f3 ? f > 0.0f ? f3 : -f3 : f;
    }

    /* renamed from: a */
    private int m1449a(int i, int i2, int i3) {
        int abs = Math.abs(i);
        if (abs < i2) {
            return 0;
        }
        return abs > i3 ? i > 0 ? i3 : -i3 : i;
    }

    /* renamed from: a */
    private int m1450a(View view, int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int m1449a = m1449a(i3, (int) this.f1185o, (int) this.f1184n);
        int m1449a2 = m1449a(i4, (int) this.f1185o, (int) this.f1184n);
        int abs = Math.abs(i);
        int abs2 = Math.abs(i2);
        int abs3 = Math.abs(m1449a);
        int abs4 = Math.abs(m1449a2);
        int i5 = abs3 + abs4;
        int i6 = abs + abs2;
        if (m1449a != 0) {
            f = abs3;
            f2 = i5;
        } else {
            f = abs;
            f2 = i6;
        }
        float f5 = f / f2;
        if (m1449a2 != 0) {
            f3 = abs4;
            f4 = i5;
        } else {
            f3 = abs2;
            f4 = i6;
        }
        return (int) ((m1459b(i, m1449a, this.f1189s.mo1491a(view)) * f5) + (m1459b(i2, m1449a2, this.f1189s.m1497b(view)) * (f3 / f4)));
    }

    /* renamed from: a */
    public static C0279I m1451a(ViewGroup viewGroup, float f, a aVar) {
        C0279I m1452a = m1452a(viewGroup, aVar);
        m1452a.f1173c = (int) (m1452a.f1173c * (1.0f / f));
        return m1452a;
    }

    /* renamed from: a */
    public static C0279I m1452a(ViewGroup viewGroup, a aVar) {
        return new C0279I(viewGroup.getContext(), viewGroup, aVar);
    }

    /* renamed from: a */
    private void m1453a(float f, float f2) {
        this.f1191u = true;
        this.f1189s.mo1494a(this.f1190t, f, f2);
        this.f1191u = false;
        if (this.f1172b == 1) {
            m1484c(0);
        }
    }

    /* renamed from: a */
    private void m1454a(float f, float f2, int i) {
        int i2 = m1456a(f, f2, i, 1) ? 1 : 0;
        if (m1456a(f2, f, i, 4)) {
            i2 |= 4;
        }
        if (m1456a(f, f2, i, 2)) {
            i2 |= 2;
        }
        if (m1456a(f2, f, i, 8)) {
            i2 |= 8;
        }
        if (i2 != 0) {
            int[] iArr = this.f1180j;
            iArr[i] = iArr[i] | i2;
            this.f1189s.mo1493a(i2, i);
        }
    }

    /* renamed from: a */
    private void m1455a(int i, int i2, int i3, int i4) {
        int left = this.f1190t.getLeft();
        int top = this.f1190t.getTop();
        if (i3 != 0) {
            i = this.f1189s.mo1492a(this.f1190t, i, i3);
            C0107v.m494a(this.f1190t, i - left);
        }
        int i5 = i;
        if (i4 != 0) {
            i2 = this.f1189s.mo1498b(this.f1190t, i2, i4);
            C0107v.m508b(this.f1190t, i2 - top);
        }
        int i6 = i2;
        if (i3 == 0 && i4 == 0) {
            return;
        }
        this.f1189s.mo1496a(this.f1190t, i5, i6, i5 - left, i6 - top);
    }

    /* renamed from: a */
    private boolean m1456a(float f, float f2, int i, int i2) {
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        if ((this.f1179i[i] & i2) != i2 || (this.f1187q & i2) == 0 || (this.f1181k[i] & i2) == i2 || (this.f1180j[i] & i2) == i2) {
            return false;
        }
        int i3 = this.f1173c;
        if (abs <= i3 && abs2 <= i3) {
            return false;
        }
        if (abs >= abs2 * 0.5f || !this.f1189s.mo1500b(i2)) {
            return (this.f1180j[i] & i2) == 0 && abs > ((float) this.f1173c);
        }
        int[] iArr = this.f1181k;
        iArr[i] = iArr[i] | i2;
        return false;
    }

    /* renamed from: a */
    private boolean m1457a(View view, float f, float f2) {
        if (view == null) {
            return false;
        }
        boolean z = this.f1189s.mo1491a(view) > 0;
        boolean z2 = this.f1189s.m1497b(view) > 0;
        if (!z || !z2) {
            return z ? Math.abs(f) > ((float) this.f1173c) : z2 && Math.abs(f2) > ((float) this.f1173c);
        }
        float f3 = (f * f) + (f2 * f2);
        int i = this.f1173c;
        return f3 > ((float) (i * i));
    }

    /* renamed from: b */
    private float m1458b(float f) {
        return (float) Math.sin((f - 0.5f) * 0.47123894f);
    }

    /* renamed from: b */
    private int m1459b(int i, int i2, int i3) {
        if (i == 0) {
            return 0;
        }
        int width = this.f1192v.getWidth();
        float f = width / 2;
        float m1458b = f + (m1458b(Math.min(1.0f, Math.abs(i) / width)) * f);
        int abs = Math.abs(i2);
        return Math.min(abs > 0 ? Math.round(Math.abs(m1458b / abs) * 1000.0f) * 4 : (int) (((Math.abs(i) / i3) + 1.0f) * 256.0f), 600);
    }

    /* renamed from: b */
    private void m1460b(float f, float f2, int i) {
        m1466f(i);
        float[] fArr = this.f1175e;
        this.f1177g[i] = f;
        fArr[i] = f;
        float[] fArr2 = this.f1176f;
        this.f1178h[i] = f2;
        fArr2[i] = f2;
        this.f1179i[i] = m1463e((int) f, (int) f2);
        this.f1182l |= 1 << i;
    }

    /* renamed from: b */
    private boolean m1461b(int i, int i2, int i3, int i4) {
        int left = this.f1190t.getLeft();
        int top = this.f1190t.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        if (i5 == 0 && i6 == 0) {
            this.f1188r.abortAnimation();
            m1484c(0);
            return false;
        }
        this.f1188r.startScroll(left, top, i5, i6, m1450a(this.f1190t, i5, i6, i3, i4));
        m1484c(2);
        return true;
    }

    /* renamed from: c */
    private void m1462c(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (m1468g(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f1177g[pointerId] = x;
                this.f1178h[pointerId] = y;
            }
        }
    }

    /* renamed from: e */
    private int m1463e(int i, int i2) {
        int i3 = i < this.f1192v.getLeft() + this.f1186p ? 1 : 0;
        if (i2 < this.f1192v.getTop() + this.f1186p) {
            i3 |= 4;
        }
        if (i > this.f1192v.getRight() - this.f1186p) {
            i3 |= 2;
        }
        return i2 > this.f1192v.getBottom() - this.f1186p ? i3 | 8 : i3;
    }

    /* renamed from: e */
    private void m1464e(int i) {
        if (this.f1175e == null || !m1479b(i)) {
            return;
        }
        this.f1175e[i] = 0.0f;
        this.f1176f[i] = 0.0f;
        this.f1177g[i] = 0.0f;
        this.f1178h[i] = 0.0f;
        this.f1179i[i] = 0;
        this.f1180j[i] = 0;
        this.f1181k[i] = 0;
        this.f1182l = ((1 << i) ^ (-1)) & this.f1182l;
    }

    /* renamed from: f */
    private void m1465f() {
        float[] fArr = this.f1175e;
        if (fArr == null) {
            return;
        }
        Arrays.fill(fArr, 0.0f);
        Arrays.fill(this.f1176f, 0.0f);
        Arrays.fill(this.f1177g, 0.0f);
        Arrays.fill(this.f1178h, 0.0f);
        Arrays.fill(this.f1179i, 0);
        Arrays.fill(this.f1180j, 0);
        Arrays.fill(this.f1181k, 0);
        this.f1182l = 0;
    }

    /* renamed from: f */
    private void m1466f(int i) {
        float[] fArr = this.f1175e;
        if (fArr == null || fArr.length <= i) {
            int i2 = i + 1;
            float[] fArr2 = new float[i2];
            float[] fArr3 = new float[i2];
            float[] fArr4 = new float[i2];
            float[] fArr5 = new float[i2];
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int[] iArr3 = new int[i2];
            float[] fArr6 = this.f1175e;
            if (fArr6 != null) {
                System.arraycopy(fArr6, 0, fArr2, 0, fArr6.length);
                float[] fArr7 = this.f1176f;
                System.arraycopy(fArr7, 0, fArr3, 0, fArr7.length);
                float[] fArr8 = this.f1177g;
                System.arraycopy(fArr8, 0, fArr4, 0, fArr8.length);
                float[] fArr9 = this.f1178h;
                System.arraycopy(fArr9, 0, fArr5, 0, fArr9.length);
                int[] iArr4 = this.f1179i;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f1180j;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f1181k;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f1175e = fArr2;
            this.f1176f = fArr3;
            this.f1177g = fArr4;
            this.f1178h = fArr5;
            this.f1179i = iArr;
            this.f1180j = iArr2;
            this.f1181k = iArr3;
        }
    }

    /* renamed from: g */
    private void m1467g() {
        this.f1183m.computeCurrentVelocity(1000, this.f1184n);
        m1453a(m1448a(this.f1183m.getXVelocity(this.f1174d), this.f1185o, this.f1184n), m1448a(this.f1183m.getYVelocity(this.f1174d), this.f1185o, this.f1184n));
    }

    /* renamed from: g */
    private boolean m1468g(int i) {
        if (m1479b(i)) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    /* renamed from: a */
    public void m1469a() {
        this.f1174d = -1;
        m1465f();
        VelocityTracker velocityTracker = this.f1183m;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f1183m = null;
        }
    }

    /* renamed from: a */
    public void m1470a(float f) {
        this.f1185o = f;
    }

    /* renamed from: a */
    public void m1471a(MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            m1469a();
        }
        if (this.f1183m == null) {
            this.f1183m = VelocityTracker.obtain();
        }
        this.f1183m.addMovement(motionEvent);
        int i2 = 0;
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View m1478b = m1478b((int) x, (int) y);
            m1460b(x, y, pointerId);
            m1481b(m1478b, pointerId);
            int i3 = this.f1179i[pointerId];
            int i4 = this.f1187q;
            if ((i3 & i4) != 0) {
                this.f1189s.mo1499b(i3 & i4, pointerId);
                return;
            }
            return;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                if (this.f1172b != 1) {
                    int pointerCount = motionEvent.getPointerCount();
                    while (i2 < pointerCount) {
                        int pointerId2 = motionEvent.getPointerId(i2);
                        if (m1468g(pointerId2)) {
                            float x2 = motionEvent.getX(i2);
                            float y2 = motionEvent.getY(i2);
                            float f = x2 - this.f1175e[pointerId2];
                            float f2 = y2 - this.f1176f[pointerId2];
                            m1454a(f, f2, pointerId2);
                            if (this.f1172b != 1) {
                                View m1478b2 = m1478b((int) x2, (int) y2);
                                if (m1457a(m1478b2, f, f2) && m1481b(m1478b2, pointerId2)) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        i2++;
                    }
                } else {
                    if (!m1468g(this.f1174d)) {
                        return;
                    }
                    int findPointerIndex = motionEvent.findPointerIndex(this.f1174d);
                    float x3 = motionEvent.getX(findPointerIndex);
                    float y3 = motionEvent.getY(findPointerIndex);
                    float[] fArr = this.f1177g;
                    int i5 = this.f1174d;
                    int i6 = (int) (x3 - fArr[i5]);
                    int i7 = (int) (y3 - this.f1178h[i5]);
                    m1455a(this.f1190t.getLeft() + i6, this.f1190t.getTop() + i7, i6, i7);
                }
                m1462c(motionEvent);
                return;
            }
            if (actionMasked != 3) {
                if (actionMasked == 5) {
                    int pointerId3 = motionEvent.getPointerId(actionIndex);
                    float x4 = motionEvent.getX(actionIndex);
                    float y4 = motionEvent.getY(actionIndex);
                    m1460b(x4, y4, pointerId3);
                    if (this.f1172b != 0) {
                        if (m1485c((int) x4, (int) y4)) {
                            m1481b(this.f1190t, pointerId3);
                            return;
                        }
                        return;
                    } else {
                        m1481b(m1478b((int) x4, (int) y4), pointerId3);
                        int i8 = this.f1179i[pointerId3];
                        int i9 = this.f1187q;
                        if ((i8 & i9) != 0) {
                            this.f1189s.mo1499b(i8 & i9, pointerId3);
                            return;
                        }
                        return;
                    }
                }
                if (actionMasked != 6) {
                    return;
                }
                int pointerId4 = motionEvent.getPointerId(actionIndex);
                if (this.f1172b == 1 && pointerId4 == this.f1174d) {
                    int pointerCount2 = motionEvent.getPointerCount();
                    while (true) {
                        if (i2 >= pointerCount2) {
                            i = -1;
                            break;
                        }
                        int pointerId5 = motionEvent.getPointerId(i2);
                        if (pointerId5 != this.f1174d) {
                            View m1478b3 = m1478b((int) motionEvent.getX(i2), (int) motionEvent.getY(i2));
                            View view = this.f1190t;
                            if (m1478b3 == view && m1481b(view, pointerId5)) {
                                i = this.f1174d;
                                break;
                            }
                        }
                        i2++;
                    }
                    if (i == -1) {
                        m1467g();
                    }
                }
                m1464e(pointerId4);
                return;
            }
            if (this.f1172b == 1) {
                m1453a(0.0f, 0.0f);
            }
        } else if (this.f1172b == 1) {
            m1467g();
        }
        m1469a();
    }

    /* renamed from: a */
    public void m1472a(View view, int i) {
        if (view.getParent() == this.f1192v) {
            this.f1190t = view;
            this.f1174d = i;
            this.f1189s.mo1495a(view, i);
            m1484c(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f1192v + ")");
    }

    /* renamed from: a */
    public boolean m1473a(int i) {
        int length = this.f1175e.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (m1474a(i, i2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean m1474a(int i, int i2) {
        if (!m1479b(i2)) {
            return false;
        }
        boolean z = (i & 1) == 1;
        boolean z2 = (i & 2) == 2;
        float f = this.f1177g[i2] - this.f1175e[i2];
        float f2 = this.f1178h[i2] - this.f1176f[i2];
        if (!z || !z2) {
            return z ? Math.abs(f) > ((float) this.f1173c) : z2 && Math.abs(f2) > ((float) this.f1173c);
        }
        float f3 = (f * f) + (f2 * f2);
        int i3 = this.f1173c;
        return f3 > ((float) (i3 * i3));
    }

    /* renamed from: a */
    public boolean m1475a(View view, int i, int i2) {
        return view != null && i >= view.getLeft() && i < view.getRight() && i2 >= view.getTop() && i2 < view.getBottom();
    }

    /* renamed from: a */
    public boolean m1476a(boolean z) {
        if (this.f1172b == 2) {
            boolean computeScrollOffset = this.f1188r.computeScrollOffset();
            int currX = this.f1188r.getCurrX();
            int currY = this.f1188r.getCurrY();
            int left = currX - this.f1190t.getLeft();
            int top = currY - this.f1190t.getTop();
            if (left != 0) {
                C0107v.m494a(this.f1190t, left);
            }
            if (top != 0) {
                C0107v.m508b(this.f1190t, top);
            }
            if (left != 0 || top != 0) {
                this.f1189s.mo1496a(this.f1190t, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == this.f1188r.getFinalX() && currY == this.f1188r.getFinalY()) {
                this.f1188r.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                if (z) {
                    this.f1192v.post(this.f1193w);
                } else {
                    m1484c(0);
                }
            }
        }
        return this.f1172b == 2;
    }

    /* renamed from: b */
    public View m1477b() {
        return this.f1190t;
    }

    /* renamed from: b */
    public View m1478b(int i, int i2) {
        for (int childCount = this.f1192v.getChildCount() - 1; childCount >= 0; childCount--) {
            ViewGroup viewGroup = this.f1192v;
            this.f1189s.m1490a(childCount);
            View childAt = viewGroup.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: b */
    public boolean m1479b(int i) {
        return ((1 << i) & this.f1182l) != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00dd, code lost:            if (r12 != r11) goto L54;     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m1480b(android.view.MotionEvent r17) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.C0279I.m1480b(android.view.MotionEvent):boolean");
    }

    /* renamed from: b */
    boolean m1481b(View view, int i) {
        if (view == this.f1190t && this.f1174d == i) {
            return true;
        }
        if (view == null || !this.f1189s.mo1501b(view, i)) {
            return false;
        }
        this.f1174d = i;
        m1472a(view, i);
        return true;
    }

    /* renamed from: b */
    public boolean m1482b(View view, int i, int i2) {
        this.f1190t = view;
        this.f1174d = -1;
        boolean m1461b = m1461b(i, i2, 0, 0);
        if (!m1461b && this.f1172b == 0 && this.f1190t != null) {
            this.f1190t = null;
        }
        return m1461b;
    }

    /* renamed from: c */
    public int m1483c() {
        return this.f1186p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m1484c(int i) {
        this.f1192v.removeCallbacks(this.f1193w);
        if (this.f1172b != i) {
            this.f1172b = i;
            this.f1189s.mo1502c(i);
            if (this.f1172b == 0) {
                this.f1190t = null;
            }
        }
    }

    /* renamed from: c */
    public boolean m1485c(int i, int i2) {
        return m1475a(this.f1190t, i, i2);
    }

    /* renamed from: d */
    public int m1486d() {
        return this.f1173c;
    }

    /* renamed from: d */
    public void m1487d(int i) {
        this.f1187q = i;
    }

    /* renamed from: d */
    public boolean m1488d(int i, int i2) {
        if (this.f1191u) {
            return m1461b(i, i2, (int) this.f1183m.getXVelocity(this.f1174d), (int) this.f1183m.getYVelocity(this.f1174d));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* renamed from: e */
    public int m1489e() {
        return this.f1172b;
    }
}
