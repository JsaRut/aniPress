package p139d.p273d.p274a;

import android.os.Handler;
import android.view.MotionEvent;

/* renamed from: d.d.a.b */
/* loaded from: classes.dex */
public class C2685b extends C2686c<C2685b> {

    /* renamed from: D */
    private float f11243D;

    /* renamed from: E */
    private float f11244E;

    /* renamed from: F */
    private Handler f11245F;

    /* renamed from: G */
    private int f11246G;

    /* renamed from: z */
    private long f11248z = 800;

    /* renamed from: A */
    private long f11240A = 160;

    /* renamed from: B */
    private int f11241B = 1;

    /* renamed from: C */
    private int f11242C = 1;

    /* renamed from: H */
    private final Runnable f11247H = new RunnableC2684a(this);

    /* renamed from: d */
    private void m11496d(MotionEvent motionEvent) {
        if (m11498f(motionEvent)) {
            return;
        }
        m11530e();
    }

    /* renamed from: e */
    private void m11497e(MotionEvent motionEvent) {
        this.f11243D = motionEvent.getRawX();
        this.f11244E = motionEvent.getRawY();
        m11520b();
        this.f11246G = 1;
        Handler handler = this.f11245F;
        if (handler == null) {
            this.f11245F = new Handler();
        } else {
            handler.removeCallbacksAndMessages(null);
        }
        this.f11245F.postDelayed(this.f11247H, this.f11248z);
    }

    /* renamed from: f */
    private boolean m11498f(MotionEvent motionEvent) {
        if (this.f11246G != this.f11242C) {
            return false;
        }
        if (((this.f11241B & 1) == 0 || motionEvent.getRawX() - this.f11243D <= ((float) this.f11240A)) && (((this.f11241B & 2) == 0 || this.f11243D - motionEvent.getRawX() <= ((float) this.f11240A)) && (((this.f11241B & 4) == 0 || this.f11244E - motionEvent.getRawY() <= ((float) this.f11240A)) && ((this.f11241B & 8) == 0 || motionEvent.getRawY() - this.f11244E <= ((float) this.f11240A))))) {
            return false;
        }
        this.f11245F.removeCallbacksAndMessages(null);
        m11512a();
        m11528d();
        return true;
    }

    @Override // p139d.p273d.p274a.C2686c
    /* renamed from: c */
    protected void mo6795c(MotionEvent motionEvent) {
        int m11537k = m11537k();
        if (m11537k == 0) {
            m11497e(motionEvent);
        }
        if (m11537k == 2) {
            m11498f(motionEvent);
            if (motionEvent.getPointerCount() > this.f11246G) {
                this.f11246G = motionEvent.getPointerCount();
            }
            if (motionEvent.getActionMasked() == 1) {
                m11496d(motionEvent);
            }
        }
    }

    /* renamed from: d */
    public void m11499d(int i) {
        this.f11241B = i;
    }

    /* renamed from: e */
    public void m11500e(int i) {
        this.f11242C = i;
    }

    @Override // p139d.p273d.p274a.C2686c
    /* renamed from: p */
    protected void mo6796p() {
        Handler handler = this.f11245F;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // p139d.p273d.p274a.C2686c
    /* renamed from: q */
    protected void mo11501q() {
        Handler handler = this.f11245F;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }
}
