package com.swmansion.gesturehandler.react;

import android.view.View;
import com.facebook.react.uimanager.C1369s;
import com.facebook.react.uimanager.InterfaceC1282S;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.swmansion.gesturehandler.react.f */
/* loaded from: classes.dex */
public class C1628f implements InterfaceC1282S {

    /* renamed from: a */
    final /* synthetic */ int f6059a;

    /* renamed from: b */
    final /* synthetic */ RNGestureHandlerModule f6060b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1628f(RNGestureHandlerModule rNGestureHandlerModule, int i) {
        this.f6060b = rNGestureHandlerModule;
        this.f6059a = i;
    }

    @Override // com.facebook.react.uimanager.InterfaceC1282S
    /* renamed from: a */
    public void mo5159a(C1369s c1369s) {
        List list;
        List list2;
        View m5930b = c1369s.m5930b(this.f6059a);
        if (m5930b instanceof C1623a) {
            ((C1623a) m5930b).m6762d();
        }
        list = this.f6060b.mEnqueuedRootViewInit;
        synchronized (list) {
            list2 = this.f6060b.mEnqueuedRootViewInit;
            list2.remove(new Integer(this.f6059a));
        }
    }
}
