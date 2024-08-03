package p030b;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: b.b */
/* loaded from: classes.dex */
final class C0493b {

    /* renamed from: a */
    private static final C0493b f2530a = new C0493b();

    /* renamed from: b */
    private static final int f2531b = Runtime.getRuntime().availableProcessors();

    /* renamed from: c */
    static final int f2532c;

    /* renamed from: d */
    static final int f2533d;

    /* renamed from: e */
    private final Executor f2534e = new a();

    /* renamed from: b.b$a */
    /* loaded from: classes.dex */
    private static class a implements Executor {
        private a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    static {
        int i = f2531b;
        f2532c = i + 1;
        f2533d = (i * 2) + 1;
    }

    private C0493b() {
    }

    /* renamed from: a */
    public static ExecutorService m2626a() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(f2532c, f2533d, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        m2627a(threadPoolExecutor, true);
        return threadPoolExecutor;
    }

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public static void m2627a(ThreadPoolExecutor threadPoolExecutor, boolean z) {
        if (Build.VERSION.SDK_INT >= 9) {
            threadPoolExecutor.allowCoreThreadTimeOut(z);
        }
    }

    /* renamed from: b */
    public static Executor m2628b() {
        return f2530a.f2534e;
    }
}
