package p139d.p143b.p148c.p150b;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: d.b.c.b.e */
/* loaded from: classes.dex */
public abstract class AbstractRunnableC1677e<T> implements Runnable {

    /* renamed from: a */
    protected final AtomicInteger f6207a = new AtomicInteger(0);

    /* renamed from: a */
    public void m6939a() {
        if (this.f6207a.compareAndSet(0, 2)) {
            mo6944c();
        }
    }

    /* renamed from: a */
    protected abstract void mo6940a(Exception exc);

    /* renamed from: a */
    protected abstract void mo6941a(T t);

    /* renamed from: b */
    protected abstract T mo6942b();

    /* renamed from: b */
    protected abstract void mo6943b(T t);

    /* renamed from: c */
    protected abstract void mo6944c();

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f6207a.compareAndSet(0, 1)) {
            try {
                T mo6942b = mo6942b();
                this.f6207a.set(3);
                try {
                    mo6943b(mo6942b);
                } finally {
                    mo6941a((AbstractRunnableC1677e<T>) mo6942b);
                }
            } catch (Exception e2) {
                this.f6207a.set(4);
                mo6940a(e2);
            }
        }
    }
}
