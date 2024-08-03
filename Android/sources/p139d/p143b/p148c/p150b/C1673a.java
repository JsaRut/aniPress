package p139d.p143b.p148c.p150b;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: d.b.c.b.a */
/* loaded from: classes.dex */
public class C1673a extends AbstractExecutorService {

    /* renamed from: a */
    private static final C1673a f6203a = new C1673a();

    private C1673a() {
    }

    /* renamed from: a */
    public static C1673a m6936a() {
        return f6203a;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j, TimeUnit timeUnit) {
        return true;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        shutdown();
        return Collections.emptyList();
    }
}
