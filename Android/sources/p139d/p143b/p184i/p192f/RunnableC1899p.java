package p139d.p143b.p184i.p192f;

import android.os.Process;

/* renamed from: d.b.i.f.p */
/* loaded from: classes.dex */
class RunnableC1899p implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Runnable f6993a;

    /* renamed from: b */
    final /* synthetic */ ThreadFactoryC1900q f6994b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1899p(ThreadFactoryC1900q threadFactoryC1900q, Runnable runnable) {
        this.f6994b = threadFactoryC1900q;
        this.f6993a = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i;
        try {
            i = this.f6994b.f6995a;
            Process.setThreadPriority(i);
        } catch (Throwable unused) {
        }
        this.f6993a.run();
    }
}
