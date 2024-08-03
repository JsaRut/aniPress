package com.facebook.react.views.scroll;

import android.view.MotionEvent;
import android.view.VelocityTracker;

/* renamed from: com.facebook.react.views.scroll.m */
/* loaded from: classes.dex */
public class C1432m {

    /* renamed from: a */
    private VelocityTracker f5292a;

    /* renamed from: b */
    private float f5293b;

    /* renamed from: c */
    private float f5294c;

    /* renamed from: a */
    public float m6106a() {
        return this.f5293b;
    }

    /* renamed from: a */
    public void m6107a(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (this.f5292a == null) {
            this.f5292a = VelocityTracker.obtain();
        }
        this.f5292a.addMovement(motionEvent);
        if (action == 1 || action == 3) {
            this.f5292a.computeCurrentVelocity(1);
            this.f5293b = this.f5292a.getXVelocity();
            this.f5294c = this.f5292a.getYVelocity();
            VelocityTracker velocityTracker = this.f5292a;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f5292a = null;
            }
        }
    }

    /* renamed from: b */
    public float m6108b() {
        return this.f5294c;
    }
}
