package p139d.p273d.p274a;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: d.d.a.k */
/* loaded from: classes.dex */
public class C2694k extends C2686c<C2694k> {

    /* renamed from: A */
    private boolean f11300A;

    /* renamed from: z */
    private boolean f11301z;

    public C2694k() {
        m11519b(true);
    }

    /* renamed from: a */
    private static boolean m11578a(View view, MotionEvent motionEvent) {
        return (view instanceof ViewGroup) && ((ViewGroup) view).onInterceptTouchEvent(motionEvent);
    }

    @Override // p139d.p273d.p274a.C2686c
    /* renamed from: b */
    public boolean mo11524b(C2686c c2686c) {
        return !this.f11300A;
    }

    /* renamed from: c */
    public C2694k m11579c(boolean z) {
        this.f11300A = z;
        return this;
    }

    @Override // p139d.p273d.p274a.C2686c
    /* renamed from: c */
    protected void mo6795c(MotionEvent motionEvent) {
        View m11539m = m11539m();
        int m11537k = m11537k();
        if (motionEvent.getActionMasked() == 1) {
            m11539m.onTouchEvent(motionEvent);
            if ((m11537k == 0 || m11537k == 2) && m11539m.isPressed()) {
                m11512a();
            }
            m11528d();
            return;
        }
        if (m11537k != 0 && m11537k != 2) {
            if (m11537k == 4) {
                m11539m.onTouchEvent(motionEvent);
                return;
            }
            return;
        }
        if (this.f11301z) {
            m11578a(m11539m, motionEvent);
        } else if (!m11578a(m11539m, motionEvent)) {
            if (m11537k != 2) {
                m11520b();
                return;
            }
            return;
        }
        m11539m.onTouchEvent(motionEvent);
        m11512a();
    }

    @Override // p139d.p273d.p274a.C2686c
    /* renamed from: c */
    public boolean mo11527c(C2686c c2686c) {
        if (c2686c instanceof C2694k) {
            C2694k c2694k = (C2694k) c2686c;
            if (c2694k.m11537k() == 4 && c2694k.f11300A) {
                return false;
            }
        }
        boolean z = !this.f11300A;
        int m11537k = m11537k();
        return !(m11537k == 4 && c2686c.m11537k() == 4 && z) && m11537k == 4 && z;
    }

    /* renamed from: d */
    public C2694k m11580d(boolean z) {
        this.f11301z = z;
        return this;
    }

    @Override // p139d.p273d.p274a.C2686c
    /* renamed from: d */
    public boolean mo11529d(C2686c c2686c) {
        return super.mo11529d(c2686c);
    }

    @Override // p139d.p273d.p274a.C2686c
    /* renamed from: p */
    protected void mo6796p() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        obtain.setAction(3);
        m11539m().onTouchEvent(obtain);
    }
}
