package com.facebook.react.uimanager;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.facebook.react.uimanager.T */
/* loaded from: classes.dex */
public class RunnableC1283T implements Runnable {

    /* renamed from: a */
    final /* synthetic */ InterfaceC1269E f4770a;

    /* renamed from: b */
    final /* synthetic */ C1284U f4771b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1283T(C1284U c1284u, InterfaceC1269E interfaceC1269E) {
        this.f4771b = c1284u;
        this.f4770a = interfaceC1269E;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f4771b.f4775d.m5590b(this.f4770a);
    }
}
