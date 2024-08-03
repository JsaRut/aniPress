package p139d.p273d.p274a;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ViewConfiguration;

/* renamed from: d.d.a.o */
/* loaded from: classes.dex */
public class C2698o extends C2686c<C2698o> {

    /* renamed from: A */
    private double f11331A;

    /* renamed from: B */
    private double f11332B;

    /* renamed from: C */
    private float f11333C;

    /* renamed from: D */
    private float f11334D;

    /* renamed from: E */
    private ScaleGestureDetector.OnScaleGestureListener f11335E = new ScaleGestureDetectorOnScaleGestureListenerC2697n(this);

    /* renamed from: z */
    private ScaleGestureDetector f11336z;

    public C2698o() {
        m11519b(false);
    }

    @Override // p139d.p273d.p274a.C2686c
    /* renamed from: c */
    protected void mo6795c(MotionEvent motionEvent) {
        if (m11537k() == 0) {
            Context context = m11539m().getContext();
            this.f11332B = 0.0d;
            this.f11331A = 1.0d;
            this.f11336z = new ScaleGestureDetector(context, this.f11335E);
            this.f11334D = ViewConfiguration.get(context).getScaledTouchSlop();
            m11520b();
        }
        ScaleGestureDetector scaleGestureDetector = this.f11336z;
        if (scaleGestureDetector != null) {
            scaleGestureDetector.onTouchEvent(motionEvent);
        }
        int pointerCount = motionEvent.getPointerCount();
        if (motionEvent.getActionMasked() == 6) {
            pointerCount--;
        }
        if (m11537k() == 4 && pointerCount < 2) {
            m11528d();
        } else if (motionEvent.getActionMasked() == 1) {
            m11530e();
        }
    }

    @Override // p139d.p273d.p274a.C2686c
    /* renamed from: q */
    protected void mo11501q() {
        this.f11336z = null;
        this.f11332B = 0.0d;
        this.f11331A = 1.0d;
    }

    /* renamed from: t */
    public float m11609t() {
        ScaleGestureDetector scaleGestureDetector = this.f11336z;
        if (scaleGestureDetector == null) {
            return Float.NaN;
        }
        return scaleGestureDetector.getFocusX();
    }

    /* renamed from: u */
    public float m11610u() {
        ScaleGestureDetector scaleGestureDetector = this.f11336z;
        if (scaleGestureDetector == null) {
            return Float.NaN;
        }
        return scaleGestureDetector.getFocusY();
    }

    /* renamed from: v */
    public double m11611v() {
        return this.f11331A;
    }

    /* renamed from: w */
    public double m11612w() {
        return this.f11332B;
    }
}
