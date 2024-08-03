package com.swmansion.gesturehandler.react;

import android.content.Context;
import android.view.MotionEvent;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.views.view.C1516h;
import p139d.p143b.p204k.p205a.C2038a;

/* renamed from: com.swmansion.gesturehandler.react.k */
/* loaded from: classes.dex */
public class C1633k extends C1516h {

    /* renamed from: s */
    private C1632j f6072s;

    public C1633k(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C1632j c1632j = this.f6072s;
        C2038a.m8318a(c1632j);
        if (c1632j.m6793a(motionEvent)) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: e */
    public void m6797e() {
        C1632j c1632j = this.f6072s;
        if (c1632j != null) {
            c1632j.m6794b();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.views.view.C1516h, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f6072s == null) {
            this.f6072s = new C1632j((ReactContext) getContext(), this);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        C1632j c1632j = this.f6072s;
        C2038a.m8318a(c1632j);
        c1632j.m6792a(z);
        super.requestDisallowInterceptTouchEvent(z);
    }
}
