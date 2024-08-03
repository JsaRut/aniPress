package com.facebook.react.animated;

import com.facebook.react.uimanager.events.AbstractC1330c;

/* renamed from: com.facebook.react.animated.G */
/* loaded from: classes.dex */
class RunnableC1023G implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AbstractC1330c f4223a;

    /* renamed from: b */
    final /* synthetic */ C1024H f4224b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1023G(C1024H c1024h, AbstractC1330c abstractC1330c) {
        this.f4224b = c1024h;
        this.f4223a = abstractC1330c;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f4224b.m5109b(this.f4223a);
    }
}
