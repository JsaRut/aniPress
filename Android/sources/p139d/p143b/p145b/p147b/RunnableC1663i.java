package p139d.p143b.p145b.p147b;

import java.util.concurrent.CountDownLatch;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: d.b.b.b.i */
/* loaded from: classes.dex */
public class RunnableC1663i implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C1664j f6156a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1663i(C1664j c1664j) {
        this.f6156a = c1664j;
    }

    @Override // java.lang.Runnable
    public void run() {
        Object obj;
        CountDownLatch countDownLatch;
        obj = this.f6156a.f6175s;
        synchronized (obj) {
            this.f6156a.m6904c();
        }
        this.f6156a.f6176t = true;
        countDownLatch = this.f6156a.f6162f;
        countDownLatch.countDown();
    }
}
