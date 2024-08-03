package p139d.p273d.p274a;

import android.os.Handler;
import android.view.MotionEvent;

/* renamed from: d.d.a.u */
/* loaded from: classes.dex */
public class C2704u extends C2686c<C2704u> {

    /* renamed from: z */
    private static float f11357z = Float.MIN_VALUE;

    /* renamed from: A */
    private float f11358A;

    /* renamed from: B */
    private float f11359B;

    /* renamed from: C */
    private float f11360C;

    /* renamed from: D */
    private long f11361D;

    /* renamed from: E */
    private long f11362E;

    /* renamed from: F */
    private int f11363F;

    /* renamed from: G */
    private int f11364G;

    /* renamed from: H */
    private int f11365H;

    /* renamed from: I */
    private float f11366I;

    /* renamed from: J */
    private float f11367J;

    /* renamed from: K */
    private float f11368K;

    /* renamed from: L */
    private float f11369L;

    /* renamed from: M */
    private float f11370M;

    /* renamed from: N */
    private float f11371N;

    /* renamed from: O */
    private Handler f11372O;

    /* renamed from: P */
    private int f11373P;

    /* renamed from: Q */
    private final Runnable f11374Q;

    public C2704u() {
        float f = f11357z;
        this.f11358A = f;
        this.f11359B = f;
        this.f11360C = f;
        this.f11361D = 500L;
        this.f11362E = 500L;
        this.f11363F = 1;
        this.f11364G = 1;
        this.f11365H = 1;
        this.f11374Q = new RunnableC2703t(this);
        m11519b(true);
    }

    /* renamed from: t */
    private void m11630t() {
        Handler handler = this.f11372O;
        if (handler == null) {
            this.f11372O = new Handler();
        } else {
            handler.removeCallbacksAndMessages(null);
        }
        int i = this.f11373P + 1;
        this.f11373P = i;
        if (i != this.f11363F || this.f11365H < this.f11364G) {
            this.f11372O.postDelayed(this.f11374Q, this.f11362E);
        } else {
            m11512a();
            m11528d();
        }
    }

    /* renamed from: u */
    private boolean m11631u() {
        float f = (this.f11370M - this.f11366I) + this.f11368K;
        if (this.f11358A != f11357z && Math.abs(f) > this.f11358A) {
            return true;
        }
        float f2 = (this.f11371N - this.f11367J) + this.f11369L;
        if (this.f11359B != f11357z && Math.abs(f2) > this.f11359B) {
            return true;
        }
        float f3 = (f2 * f2) + (f * f);
        float f4 = this.f11360C;
        return f4 != f11357z && f3 > f4;
    }

    /* renamed from: v */
    private void m11632v() {
        Handler handler = this.f11372O;
        if (handler == null) {
            this.f11372O = new Handler();
        } else {
            handler.removeCallbacksAndMessages(null);
        }
        this.f11372O.postDelayed(this.f11374Q, this.f11361D);
    }

    /* renamed from: a */
    public C2704u m11633a(float f) {
        this.f11360C = f * f;
        return this;
    }

    /* renamed from: a */
    public C2704u m11634a(long j) {
        this.f11362E = j;
        return this;
    }

    /* renamed from: b */
    public C2704u m11635b(float f) {
        this.f11358A = f;
        return this;
    }

    /* renamed from: b */
    public C2704u m11636b(long j) {
        this.f11361D = j;
        return this;
    }

    /* renamed from: c */
    public C2704u m11637c(float f) {
        this.f11359B = f;
        return this;
    }

    @Override // p139d.p273d.p274a.C2686c
    /* renamed from: c */
    protected void mo6795c(MotionEvent motionEvent) {
        int m11537k = m11537k();
        int actionMasked = motionEvent.getActionMasked();
        if (m11537k == 0) {
            this.f11368K = 0.0f;
            this.f11369L = 0.0f;
            this.f11366I = motionEvent.getRawX();
            this.f11367J = motionEvent.getRawY();
        }
        if (actionMasked == 6 || actionMasked == 5) {
            this.f11368K += this.f11370M - this.f11366I;
            this.f11369L += this.f11371N - this.f11367J;
            this.f11370M = C2691h.m11574a(motionEvent, true);
            this.f11371N = C2691h.m11575b(motionEvent, true);
            this.f11366I = this.f11370M;
            this.f11367J = this.f11371N;
        } else {
            this.f11370M = C2691h.m11574a(motionEvent, true);
            this.f11371N = C2691h.m11575b(motionEvent, true);
        }
        if (this.f11365H < motionEvent.getPointerCount()) {
            this.f11365H = motionEvent.getPointerCount();
        }
        if (m11631u()) {
            m11530e();
            return;
        }
        if (m11537k == 0) {
            if (actionMasked == 0) {
                m11520b();
            }
        } else {
            if (m11537k != 2) {
                return;
            }
            if (actionMasked == 1) {
                m11630t();
                return;
            } else if (actionMasked != 0) {
                return;
            }
        }
        m11632v();
    }

    /* renamed from: d */
    public C2704u m11638d(int i) {
        this.f11364G = i;
        return this;
    }

    /* renamed from: e */
    public C2704u m11639e(int i) {
        this.f11363F = i;
        return this;
    }

    @Override // p139d.p273d.p274a.C2686c
    /* renamed from: p */
    protected void mo6796p() {
        Handler handler = this.f11372O;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // p139d.p273d.p274a.C2686c
    /* renamed from: q */
    protected void mo11501q() {
        this.f11373P = 0;
        this.f11365H = 0;
        Handler handler = this.f11372O;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }
}
