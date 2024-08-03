package p139d.p273d.p274a;

import android.content.Context;
import android.os.Handler;
import android.view.MotionEvent;

/* renamed from: d.d.a.j */
/* loaded from: classes.dex */
public class C2693j extends C2686c<C2693j> {

    /* renamed from: z */
    private static float f11294z = 10.0f;

    /* renamed from: A */
    private long f11295A = 500;

    /* renamed from: B */
    private float f11296B;

    /* renamed from: C */
    private float f11297C;

    /* renamed from: D */
    private float f11298D;

    /* renamed from: E */
    private Handler f11299E;

    public C2693j(Context context) {
        m11519b(true);
        this.f11296B = f11294z * context.getResources().getDisplayMetrics().density;
    }

    /* renamed from: a */
    public C2693j m11576a(float f) {
        this.f11296B = f * f;
        return this;
    }

    /* renamed from: a */
    public void m11577a(long j) {
        this.f11295A = j;
    }

    @Override // p139d.p273d.p274a.C2686c
    /* renamed from: b */
    protected void mo11522b(int i, int i2) {
        Handler handler = this.f11299E;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f11299E = null;
        }
    }

    @Override // p139d.p273d.p274a.C2686c
    /* renamed from: c */
    protected void mo6795c(MotionEvent motionEvent) {
        if (m11537k() == 0) {
            m11520b();
            this.f11297C = motionEvent.getRawX();
            this.f11298D = motionEvent.getRawY();
            this.f11299E = new Handler();
            this.f11299E.postDelayed(new RunnableC2692i(this), this.f11295A);
        }
        if (motionEvent.getActionMasked() == 1) {
            Handler handler = this.f11299E;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
                this.f11299E = null;
            }
            if (m11537k() == 4) {
                m11528d();
                return;
            }
        } else {
            float rawX = motionEvent.getRawX() - this.f11297C;
            float rawY = motionEvent.getRawY() - this.f11298D;
            if ((rawX * rawX) + (rawY * rawY) <= this.f11296B) {
                return;
            }
            if (m11537k() == 4) {
                m11525c();
                return;
            }
        }
        m11530e();
    }
}
