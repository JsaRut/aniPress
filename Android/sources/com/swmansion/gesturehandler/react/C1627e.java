package com.swmansion.gesturehandler.react;

import android.view.MotionEvent;
import p139d.p273d.p274a.C2686c;
import p139d.p273d.p274a.InterfaceC2695l;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.swmansion.gesturehandler.react.e */
/* loaded from: classes.dex */
public class C1627e implements InterfaceC2695l {

    /* renamed from: a */
    final /* synthetic */ RNGestureHandlerModule f6058a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1627e(RNGestureHandlerModule rNGestureHandlerModule) {
        this.f6058a = rNGestureHandlerModule;
    }

    @Override // p139d.p273d.p274a.InterfaceC2695l
    /* renamed from: a */
    public void mo6774a(C2686c c2686c, int i, int i2) {
        this.f6058a.onStateChange(c2686c, i, i2);
    }

    @Override // p139d.p273d.p274a.InterfaceC2695l
    /* renamed from: a */
    public void mo6775a(C2686c c2686c, MotionEvent motionEvent) {
        this.f6058a.onTouchEvent(c2686c, motionEvent);
    }
}
