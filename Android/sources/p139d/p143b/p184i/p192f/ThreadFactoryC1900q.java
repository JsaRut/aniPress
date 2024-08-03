package p139d.p143b.p184i.p192f;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: d.b.i.f.q */
/* loaded from: classes.dex */
public class ThreadFactoryC1900q implements ThreadFactory {

    /* renamed from: a */
    private final int f6995a;

    /* renamed from: b */
    private final String f6996b;

    /* renamed from: c */
    private final boolean f6997c;

    /* renamed from: d */
    private final AtomicInteger f6998d = new AtomicInteger(1);

    public ThreadFactoryC1900q(int i, String str, boolean z) {
        this.f6995a = i;
        this.f6996b = str;
        this.f6997c = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        String str;
        RunnableC1899p runnableC1899p = new RunnableC1899p(this, runnable);
        if (this.f6997c) {
            str = this.f6996b + "-" + this.f6998d.getAndIncrement();
        } else {
            str = this.f6996b;
        }
        return new Thread(runnableC1899p, str);
    }
}
