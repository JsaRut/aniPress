package p139d.p273d.p274a;

import android.view.MotionEvent;
import p139d.p273d.p274a.C2700q;

/* renamed from: d.d.a.s */
/* loaded from: classes.dex */
public class C2702s extends C2686c<C2702s> {

    /* renamed from: A */
    private double f11352A;

    /* renamed from: B */
    private double f11353B;

    /* renamed from: C */
    private C2700q.a f11354C = new C2701r(this);

    /* renamed from: z */
    private C2700q f11355z;

    public C2702s() {
        m11519b(false);
    }

    @Override // p139d.p273d.p274a.C2686c
    /* renamed from: c */
    protected void mo6795c(MotionEvent motionEvent) {
        int m11537k = m11537k();
        if (m11537k == 0) {
            this.f11353B = 0.0d;
            this.f11352A = 0.0d;
            this.f11355z = new C2700q(this.f11354C);
            m11520b();
        }
        C2700q c2700q = this.f11355z;
        if (c2700q != null) {
            c2700q.m11616a(motionEvent);
        }
        if (motionEvent.getActionMasked() == 1) {
            if (m11537k == 4) {
                m11528d();
            } else {
                m11530e();
            }
        }
    }

    @Override // p139d.p273d.p274a.C2686c
    /* renamed from: q */
    protected void mo11501q() {
        this.f11355z = null;
        this.f11353B = 0.0d;
        this.f11352A = 0.0d;
    }

    /* renamed from: t */
    public float m11626t() {
        C2700q c2700q = this.f11355z;
        if (c2700q == null) {
            return Float.NaN;
        }
        return c2700q.m11615a();
    }

    /* renamed from: u */
    public float m11627u() {
        C2700q c2700q = this.f11355z;
        if (c2700q == null) {
            return Float.NaN;
        }
        return c2700q.m11617b();
    }

    /* renamed from: v */
    public double m11628v() {
        return this.f11352A;
    }

    /* renamed from: w */
    public double m11629w() {
        return this.f11353B;
    }
}
