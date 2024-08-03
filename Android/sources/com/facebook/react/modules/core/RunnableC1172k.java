package com.facebook.react.modules.core;

/* renamed from: com.facebook.react.modules.core.k */
/* loaded from: classes.dex */
class RunnableC1172k implements Runnable {

    /* renamed from: a */
    final /* synthetic */ boolean f4515a;

    /* renamed from: b */
    final /* synthetic */ Timing f4516b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1172k(Timing timing, boolean z) {
        this.f4516b = timing;
        this.f4515a = z;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f4516b.mIdleCallbackGuard) {
            if (this.f4515a) {
                this.f4516b.setChoreographerIdleCallback();
            } else {
                this.f4516b.clearChoreographerIdleCallback();
            }
        }
    }
}
