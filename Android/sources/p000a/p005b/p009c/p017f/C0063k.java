package p000a.p005b.p009c.p017f;

import android.os.Handler;
import android.os.HandlerThread;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: a.b.c.f.k */
/* loaded from: classes.dex */
public class C0063k {

    /* renamed from: b */
    private HandlerThread f217b;

    /* renamed from: c */
    private Handler f218c;

    /* renamed from: f */
    private final int f221f;

    /* renamed from: g */
    private final int f222g;

    /* renamed from: h */
    private final String f223h;

    /* renamed from: a */
    private final Object f216a = new Object();

    /* renamed from: e */
    private Handler.Callback f220e = new C0059g(this);

    /* renamed from: d */
    private int f219d = 0;

    /* renamed from: a.b.c.f.k$a */
    /* loaded from: classes.dex */
    public interface a<T> {
        /* renamed from: a */
        void mo241a(T t);
    }

    public C0063k(String str, int i, int i2) {
        this.f223h = str;
        this.f222g = i;
        this.f221f = i2;
    }

    /* renamed from: b */
    private void m259b(Runnable runnable) {
        synchronized (this.f216a) {
            if (this.f217b == null) {
                this.f217b = new HandlerThread(this.f223h, this.f222g);
                this.f217b.start();
                this.f218c = new Handler(this.f217b.getLooper(), this.f220e);
                this.f219d++;
            }
            this.f218c.removeMessages(0);
            this.f218c.sendMessage(this.f218c.obtainMessage(1, runnable));
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: a */
    public <T> T m260a(Callable<T> callable, int i) {
        ReentrantLock reentrantLock = new ReentrantLock();
        Condition newCondition = reentrantLock.newCondition();
        AtomicReference atomicReference = new AtomicReference();
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        m259b(new RunnableC0062j(this, atomicReference, callable, reentrantLock, atomicBoolean, newCondition));
        reentrantLock.lock();
        try {
            if (!atomicBoolean.get()) {
                return (T) atomicReference.get();
            }
            long nanos = TimeUnit.MILLISECONDS.toNanos(i);
            do {
                try {
                    nanos = newCondition.awaitNanos(nanos);
                } catch (InterruptedException unused) {
                }
                if (!atomicBoolean.get()) {
                    return (T) atomicReference.get();
                }
            } while (nanos > 0);
            throw new InterruptedException("timeout");
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m261a() {
        synchronized (this.f216a) {
            if (this.f218c.hasMessages(1)) {
                return;
            }
            this.f217b.quit();
            this.f217b = null;
            this.f218c = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m262a(Runnable runnable) {
        runnable.run();
        synchronized (this.f216a) {
            this.f218c.removeMessages(0);
            this.f218c.sendMessageDelayed(this.f218c.obtainMessage(0), this.f221f);
        }
    }

    /* renamed from: a */
    public <T> void m263a(Callable<T> callable, a<T> aVar) {
        m259b(new RunnableC0061i(this, callable, new Handler(), aVar));
    }
}
