package p139d.p143b.p148c.p150b;

import android.os.Handler;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: d.b.c.b.c */
/* loaded from: classes.dex */
public class C1675c extends AbstractExecutorService implements InterfaceScheduledExecutorServiceC1674b {

    /* renamed from: a */
    private final Handler f6204a;

    public C1675c(Handler handler) {
        this.f6204a = handler;
    }

    /* renamed from: a */
    public boolean m6937a() {
        return Thread.currentThread() == this.f6204a.getLooper().getThread();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f6204a.post(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return false;
    }

    @Override // java.util.concurrent.AbstractExecutorService
    protected <T> RunnableFutureC1676d<T> newTaskFor(Runnable runnable, T t) {
        return new RunnableFutureC1676d<>(this.f6204a, runnable, t);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // java.util.concurrent.AbstractExecutorService
    public <T> RunnableFutureC1676d<T> newTaskFor(Callable<T> callable) {
        return new RunnableFutureC1676d<>(this.f6204a, callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    protected /* bridge */ /* synthetic */ RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return newTaskFor(runnable, (Runnable) obj);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        RunnableFutureC1676d newTaskFor = newTaskFor(runnable, (Runnable) null);
        this.f6204a.postDelayed(newTaskFor, timeUnit.toMillis(j));
        return newTaskFor;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public <V> ScheduledFuture<V> schedule(Callable<V> callable, long j, TimeUnit timeUnit) {
        RunnableFutureC1676d newTaskFor = newTaskFor((Callable) callable);
        this.f6204a.postDelayed(newTaskFor, timeUnit.toMillis(j));
        return newTaskFor;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public /* bridge */ /* synthetic */ Future submit(Runnable runnable, Object obj) {
        return submit(runnable, (Runnable) obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public ScheduledFuture<?> submit(Runnable runnable) {
        return submit(runnable, (Runnable) null);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public <T> ScheduledFuture<T> submit(Runnable runnable, T t) {
        if (runnable == null) {
            throw new NullPointerException();
        }
        RunnableFutureC1676d<T> newTaskFor = newTaskFor(runnable, (Runnable) t);
        execute(newTaskFor);
        return newTaskFor;
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public <T> ScheduledFuture<T> submit(Callable<T> callable) {
        if (callable == null) {
            throw new NullPointerException();
        }
        RunnableFutureC1676d<T> newTaskFor = newTaskFor((Callable) callable);
        execute(newTaskFor);
        return newTaskFor;
    }
}
