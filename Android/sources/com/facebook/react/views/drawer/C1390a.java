package com.facebook.react.views.drawer;

import android.support.v4.widget.C0293k;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.events.C1336i;

/* renamed from: com.facebook.react.views.drawer.a */
/* loaded from: classes.dex */
class C1390a extends C0293k {

    /* renamed from: P */
    private int f5114P;

    /* renamed from: Q */
    private int f5115Q;

    public C1390a(ReactContext reactContext) {
        super(reactContext);
        this.f5114P = 8388611;
        this.f5115Q = -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m5983e() {
        m1642a(this.f5114P);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m5984f() {
        m1669f(this.f5114P);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m5985g() {
        if (getChildCount() == 2) {
            View childAt = getChildAt(1);
            C0293k.d dVar = (C0293k.d) childAt.getLayoutParams();
            dVar.f1350a = this.f5114P;
            ((ViewGroup.MarginLayoutParams) dVar).width = this.f5115Q;
            childAt.setLayoutParams(dVar);
            childAt.setClickable(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m5986g(int i) {
        this.f5114P = i;
        m5985g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m5987h(int i) {
        this.f5115Q = i;
        m5985g();
    }

    @Override // android.support.v4.widget.C0293k, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        try {
            if (!super.onInterceptTouchEvent(motionEvent)) {
                return false;
            }
            C1336i.m5762a(this, motionEvent);
            return true;
        } catch (IllegalArgumentException e2) {
            Log.w("ReactNative", "Error intercepting touch event.", e2);
            return false;
        }
    }
}
