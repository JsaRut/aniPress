package com.facebook.react.views.swiperefresh;

import android.support.v4.widget.C0273C;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.C1374w;
import com.facebook.react.uimanager.events.C1336i;

/* renamed from: com.facebook.react.views.swiperefresh.a */
/* loaded from: classes.dex */
public class C1438a extends C0273C {

    /* renamed from: Q */
    private boolean f5307Q;

    /* renamed from: R */
    private boolean f5308R;

    /* renamed from: S */
    private float f5309S;

    /* renamed from: T */
    private int f5310T;

    /* renamed from: U */
    private float f5311U;

    /* renamed from: V */
    private boolean f5312V;

    public C1438a(ReactContext reactContext) {
        super(reactContext);
        this.f5307Q = false;
        this.f5308R = false;
        this.f5309S = 0.0f;
        this.f5310T = ViewConfiguration.get(reactContext).getScaledTouchSlop();
    }

    /* renamed from: b */
    private boolean m6119b(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f5311U = motionEvent.getX();
            this.f5312V = false;
        } else if (action == 2) {
            float abs = Math.abs(motionEvent.getX() - this.f5311U);
            if (this.f5312V || abs > this.f5310T) {
                this.f5312V = true;
                return false;
            }
        }
        return true;
    }

    @Override // android.support.v4.widget.C0273C, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!m6119b(motionEvent) || !super.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        C1336i.m5762a(this, motionEvent);
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return true;
    }

    @Override // android.support.v4.widget.C0273C, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f5307Q) {
            return;
        }
        this.f5307Q = true;
        setProgressViewOffset(this.f5309S);
        setRefreshing(this.f5308R);
    }

    @Override // android.support.v4.widget.C0273C, android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(z);
        }
    }

    public void setProgressViewOffset(float f) {
        this.f5309S = f;
        if (this.f5307Q) {
            int progressCircleDiameter = getProgressCircleDiameter();
            m1426a(false, Math.round(C1374w.m5959b(f)) - progressCircleDiameter, Math.round(C1374w.m5959b(f + 64.0f) - progressCircleDiameter));
        }
    }

    @Override // android.support.v4.widget.C0273C
    public void setRefreshing(boolean z) {
        this.f5308R = z;
        if (this.f5307Q) {
            super.setRefreshing(z);
        }
    }
}
