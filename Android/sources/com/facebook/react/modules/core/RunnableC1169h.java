package com.facebook.react.modules.core;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.facebook.react.modules.core.h */
/* loaded from: classes.dex */
public class RunnableC1169h implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Runnable f4498a;

    /* renamed from: b */
    final /* synthetic */ C1170i f4499b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1169h(C1170i c1170i, Runnable runnable) {
        this.f4499b = c1170i;
        this.f4498a = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        C1163b c1163b;
        synchronized (C1170i.class) {
            c1163b = this.f4499b.f4501b;
            if (c1163b == null) {
                this.f4499b.f4501b = C1163b.m5278a();
            }
        }
        Runnable runnable = this.f4498a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
