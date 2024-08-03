package p139d.p143b.p148c.p150b;

import android.os.Handler;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: d.b.c.b.d */
/* loaded from: classes.dex */
public class RunnableFutureC1676d<V> implements RunnableFuture<V>, ScheduledFuture<V> {

    /* renamed from: a */
    private final Handler f6205a;

    /* renamed from: b */
    private final FutureTask<V> f6206b;

    public RunnableFutureC1676d(Handler handler, Runnable runnable, V v) {
        this.f6205a = handler;
        this.f6206b = new FutureTask<>(runnable, v);
    }

    public RunnableFutureC1676d(Handler handler, Callable<V> callable) {
        this.f6205a = handler;
        this.f6206b = new FutureTask<>(callable);
    }

    /* renamed from: a */
    public int m6938a(Delayed delayed) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return this.f6206b.cancel(z);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        m6938a(delayed);
        throw null;
    }

    @Override // java.util.concurrent.Future
    public V get() {
        return this.f6206b.get();
    }

    @Override // java.util.concurrent.Future
    public V get(long j, TimeUnit timeUnit) {
        return this.f6206b.get(j, timeUnit);
    }

    @Override // java.util.concurrent.Delayed
    public long getDelay(TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f6206b.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f6206b.isDone();
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public void run() {
        this.f6206b.run();
    }
}
