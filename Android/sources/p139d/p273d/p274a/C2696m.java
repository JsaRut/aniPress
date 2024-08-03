package p139d.p273d.p274a;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* renamed from: d.d.a.m */
/* loaded from: classes.dex */
public class C2696m extends C2686c<C2696m> {

    /* renamed from: A */
    private static float f11302A = Float.MIN_VALUE;

    /* renamed from: B */
    private static int f11303B = 1;

    /* renamed from: C */
    private static int f11304C = 10;

    /* renamed from: z */
    private static float f11305z = Float.MAX_VALUE;

    /* renamed from: D */
    private float f11306D;

    /* renamed from: E */
    private float f11307E;

    /* renamed from: F */
    private float f11308F;

    /* renamed from: G */
    private float f11309G;

    /* renamed from: H */
    private float f11310H;

    /* renamed from: I */
    private float f11311I;

    /* renamed from: J */
    private float f11312J;

    /* renamed from: K */
    private float f11313K;

    /* renamed from: L */
    private float f11314L;

    /* renamed from: M */
    private float f11315M;

    /* renamed from: N */
    private float f11316N;

    /* renamed from: O */
    private float f11317O;

    /* renamed from: P */
    private int f11318P;

    /* renamed from: Q */
    private int f11319Q;

    /* renamed from: R */
    private float f11320R;

    /* renamed from: S */
    private float f11321S;

    /* renamed from: T */
    private float f11322T;

    /* renamed from: U */
    private float f11323U;

    /* renamed from: V */
    private float f11324V;

    /* renamed from: W */
    private float f11325W;

    /* renamed from: X */
    private float f11326X;

    /* renamed from: Y */
    private float f11327Y;

    /* renamed from: Z */
    private VelocityTracker f11328Z;

    /* renamed from: aa */
    private boolean f11329aa;

    public C2696m(Context context) {
        float f = f11302A;
        this.f11306D = f;
        float f2 = f11305z;
        this.f11307E = f2;
        this.f11308F = f;
        this.f11309G = f;
        this.f11310H = f2;
        this.f11311I = f2;
        this.f11312J = f;
        this.f11313K = f;
        this.f11314L = f2;
        this.f11315M = f2;
        this.f11316N = f2;
        this.f11317O = f2;
        this.f11318P = f11303B;
        this.f11319Q = f11304C;
        int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f11306D = scaledTouchSlop * scaledTouchSlop;
    }

    /* renamed from: a */
    private static void m11581a(VelocityTracker velocityTracker, MotionEvent motionEvent) {
        float rawX = motionEvent.getRawX() - motionEvent.getX();
        float rawY = motionEvent.getRawY() - motionEvent.getY();
        motionEvent.offsetLocation(rawX, rawY);
        velocityTracker.addMovement(motionEvent);
        motionEvent.offsetLocation(-rawX, -rawY);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0072, code lost:            if (r0 >= r1) goto L37;     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x008f, code lost:            if (r0 >= r2) goto L48;     */
    /* renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean m11582x() {
        /*
            r6 = this;
            float r0 = r6.f11324V
            float r1 = r6.f11320R
            float r0 = r0 - r1
            float r1 = r6.f11322T
            float r0 = r0 + r1
            float r1 = r6.f11307E
            float r2 = p139d.p273d.p274a.C2696m.f11305z
            r3 = 1
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 == 0) goto L16
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 >= 0) goto L16
            return r3
        L16:
            float r1 = r6.f11308F
            float r2 = p139d.p273d.p274a.C2696m.f11302A
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 == 0) goto L23
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 <= 0) goto L23
            return r3
        L23:
            float r1 = r6.f11325W
            float r2 = r6.f11321S
            float r1 = r1 - r2
            float r2 = r6.f11323U
            float r1 = r1 + r2
            float r2 = r6.f11311I
            float r4 = p139d.p273d.p274a.C2696m.f11305z
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 == 0) goto L38
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 >= 0) goto L38
            return r3
        L38:
            float r2 = r6.f11312J
            float r4 = p139d.p273d.p274a.C2696m.f11302A
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 == 0) goto L45
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 <= 0) goto L45
            return r3
        L45:
            float r0 = r0 * r0
            float r1 = r1 * r1
            float r0 = r0 + r1
            float r1 = r6.f11306D
            float r2 = p139d.p273d.p274a.C2696m.f11305z
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 == 0) goto L57
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L57
            return r3
        L57:
            float r0 = r6.f11326X
            float r1 = r6.f11315M
            float r2 = p139d.p273d.p274a.C2696m.f11305z
            r4 = 0
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 == 0) goto L75
            int r2 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r2 >= 0) goto L6a
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 <= 0) goto L74
        L6a:
            float r1 = r6.f11315M
            int r2 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r2 < 0) goto L75
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 < 0) goto L75
        L74:
            return r3
        L75:
            float r1 = r6.f11327Y
            float r2 = r6.f11316N
            float r5 = p139d.p273d.p274a.C2696m.f11305z
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r5 == 0) goto L92
            int r5 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r5 >= 0) goto L87
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 <= 0) goto L91
        L87:
            float r2 = r6.f11316N
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 < 0) goto L92
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 < 0) goto L92
        L91:
            return r3
        L92:
            float r0 = r0 * r0
            float r1 = r1 * r1
            float r0 = r0 + r1
            float r1 = r6.f11317O
            float r2 = p139d.p273d.p274a.C2696m.f11305z
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 == 0) goto La4
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto La4
            return r3
        La4:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p139d.p273d.p274a.C2696m.m11582x():boolean");
    }

    /* renamed from: y */
    private boolean m11583y() {
        float f = (this.f11324V - this.f11320R) + this.f11322T;
        float f2 = this.f11309G;
        if (f2 != f11302A && f < f2) {
            return true;
        }
        float f3 = this.f11310H;
        if (f3 != f11305z && f > f3) {
            return true;
        }
        float f4 = (this.f11325W - this.f11321S) + this.f11323U;
        float f5 = this.f11313K;
        if (f5 != f11302A && f4 < f5) {
            return true;
        }
        float f6 = this.f11314L;
        return f6 != f11305z && f4 > f6;
    }

    /* renamed from: a */
    public C2696m m11584a(float f) {
        this.f11308F = f;
        return this;
    }

    /* renamed from: b */
    public C2696m m11585b(float f) {
        this.f11307E = f;
        return this;
    }

    /* renamed from: c */
    public C2696m m11586c(float f) {
        this.f11312J = f;
        return this;
    }

    /* renamed from: c */
    public C2696m m11587c(boolean z) {
        this.f11329aa = z;
        return this;
    }

    @Override // p139d.p273d.p274a.C2686c
    /* renamed from: c */
    protected void mo6795c(MotionEvent motionEvent) {
        int m11537k = m11537k();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 6 || actionMasked == 5) {
            this.f11322T += this.f11324V - this.f11320R;
            this.f11323U += this.f11325W - this.f11321S;
            this.f11324V = C2691h.m11574a(motionEvent, this.f11329aa);
            this.f11325W = C2691h.m11575b(motionEvent, this.f11329aa);
            this.f11320R = this.f11324V;
            this.f11321S = this.f11325W;
        } else {
            this.f11324V = C2691h.m11574a(motionEvent, this.f11329aa);
            this.f11325W = C2691h.m11575b(motionEvent, this.f11329aa);
        }
        if (m11537k != 0 || motionEvent.getPointerCount() < this.f11318P) {
            VelocityTracker velocityTracker = this.f11328Z;
            if (velocityTracker != null) {
                m11581a(velocityTracker, motionEvent);
                this.f11328Z.computeCurrentVelocity(1000);
                this.f11326X = this.f11328Z.getXVelocity();
                this.f11327Y = this.f11328Z.getYVelocity();
            }
        } else {
            this.f11320R = this.f11324V;
            this.f11321S = this.f11325W;
            this.f11322T = 0.0f;
            this.f11323U = 0.0f;
            this.f11328Z = VelocityTracker.obtain();
            m11581a(this.f11328Z, motionEvent);
            m11520b();
        }
        if (actionMasked == 1) {
            if (m11537k == 4 || m11537k == 2) {
                m11528d();
                return;
            }
        } else if (actionMasked != 5 || motionEvent.getPointerCount() <= this.f11319Q) {
            if (actionMasked != 6 || m11537k != 4 || motionEvent.getPointerCount() >= this.f11318P) {
                if (m11537k != 2) {
                    return;
                }
                if (!m11583y()) {
                    if (m11582x()) {
                        this.f11320R = this.f11324V;
                        this.f11321S = this.f11325W;
                        m11512a();
                        return;
                    }
                    return;
                }
            }
        } else if (m11537k == 4) {
            m11525c();
            return;
        }
        m11530e();
    }

    /* renamed from: d */
    public C2696m m11588d(float f) {
        this.f11311I = f;
        return this;
    }

    /* renamed from: d */
    public C2696m m11589d(int i) {
        this.f11319Q = i;
        return this;
    }

    /* renamed from: e */
    public C2696m m11590e(float f) {
        this.f11310H = f;
        return this;
    }

    /* renamed from: e */
    public C2696m m11591e(int i) {
        this.f11318P = i;
        return this;
    }

    /* renamed from: f */
    public C2696m m11592f(float f) {
        this.f11309G = f;
        return this;
    }

    /* renamed from: g */
    public C2696m m11593g(float f) {
        this.f11314L = f;
        return this;
    }

    /* renamed from: h */
    public C2696m m11594h(float f) {
        this.f11313K = f;
        return this;
    }

    /* renamed from: i */
    public C2696m m11595i(float f) {
        this.f11306D = f * f;
        return this;
    }

    /* renamed from: j */
    public C2696m m11596j(float f) {
        this.f11317O = f * f;
        return this;
    }

    /* renamed from: k */
    public C2696m m11597k(float f) {
        this.f11315M = f;
        return this;
    }

    /* renamed from: l */
    public C2696m m11598l(float f) {
        this.f11316N = f;
        return this;
    }

    @Override // p139d.p273d.p274a.C2686c
    /* renamed from: q */
    protected void mo11501q() {
        VelocityTracker velocityTracker = this.f11328Z;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f11328Z = null;
        }
    }

    /* renamed from: t */
    public float m11599t() {
        return (this.f11324V - this.f11320R) + this.f11322T;
    }

    /* renamed from: u */
    public float m11600u() {
        return (this.f11325W - this.f11321S) + this.f11323U;
    }

    /* renamed from: v */
    public float m11601v() {
        return this.f11326X;
    }

    /* renamed from: w */
    public float m11602w() {
        return this.f11327Y;
    }
}
