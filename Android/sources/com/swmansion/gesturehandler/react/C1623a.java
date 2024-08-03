package com.swmansion.gesturehandler.react;

import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import p139d.p143b.p208m.C2047G;
import p139d.p143b.p208m.C2056P;

/* renamed from: com.swmansion.gesturehandler.react.a */
/* loaded from: classes.dex */
public class C1623a extends C2056P {

    /* renamed from: q */
    private C2047G f6052q;

    /* renamed from: r */
    private C1632j f6053r;

    public C1623a(Context context) {
        super(context);
    }

    @Override // p139d.p143b.p208m.C2056P
    /* renamed from: a */
    public void mo6761a(C2047G c2047g, String str, Bundle bundle) {
        super.mo6761a(c2047g, str, bundle);
        this.f6052q = c2047g;
    }

    /* renamed from: d */
    public void m6762d() {
        if (this.f6053r == null) {
            this.f6053r = new C1632j(this.f6052q.m8362c(), this);
            return;
        }
        throw new IllegalStateException("GestureHandler already initialized for root view " + this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C1632j c1632j = this.f6053r;
        if (c1632j == null || !c1632j.m6793a(motionEvent)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    /* renamed from: e */
    public void m6763e() {
        C1632j c1632j = this.f6053r;
        if (c1632j != null) {
            c1632j.m6794b();
            this.f6053r = null;
        }
    }

    @Override // p139d.p143b.p208m.C2056P, android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        C1632j c1632j = this.f6053r;
        if (c1632j != null) {
            c1632j.m6792a(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }
}
