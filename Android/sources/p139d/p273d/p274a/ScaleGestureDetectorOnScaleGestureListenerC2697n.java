package p139d.p273d.p274a;

import android.view.ScaleGestureDetector;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: d.d.a.n */
/* loaded from: classes.dex */
public class ScaleGestureDetectorOnScaleGestureListenerC2697n implements ScaleGestureDetector.OnScaleGestureListener {

    /* renamed from: a */
    final /* synthetic */ C2698o f11330a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ScaleGestureDetectorOnScaleGestureListenerC2697n(C2698o c2698o) {
        this.f11330a = c2698o;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        double d2;
        double d3;
        float f;
        float f2;
        double d4;
        d2 = this.f11330a.f11331A;
        C2698o c2698o = this.f11330a;
        d3 = c2698o.f11331A;
        double scaleFactor = scaleGestureDetector.getScaleFactor();
        Double.isNaN(scaleFactor);
        c2698o.f11331A = d3 * scaleFactor;
        long timeDelta = scaleGestureDetector.getTimeDelta();
        if (timeDelta > 0) {
            C2698o c2698o2 = this.f11330a;
            d4 = c2698o2.f11331A;
            double d5 = d4 - d2;
            double d6 = timeDelta;
            Double.isNaN(d6);
            c2698o2.f11332B = d5 / d6;
        }
        f = this.f11330a.f11333C;
        float abs = Math.abs(f - scaleGestureDetector.getCurrentSpan());
        f2 = this.f11330a.f11334D;
        if (abs < f2 || this.f11330a.m11537k() != 2) {
            return true;
        }
        this.f11330a.m11512a();
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        this.f11330a.f11333C = scaleGestureDetector.getCurrentSpan();
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
    }
}
