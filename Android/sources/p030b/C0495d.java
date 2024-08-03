package p030b;

import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: b.d */
/* loaded from: classes.dex */
final class C0495d {

    /* renamed from: a */
    private static final C0495d f2535a = new C0495d();

    /* renamed from: b */
    private final ExecutorService f2536b;

    /* renamed from: c */
    private final ScheduledExecutorService f2537c;

    /* renamed from: d */
    private final Executor f2538d;

    /* renamed from: b.d$a */
    /* loaded from: classes.dex */
    private static class a implements Executor {

        /* renamed from: a */
        private ThreadLocal<Integer> f2539a;

        private a() {
            this.f2539a = new ThreadLocal<>();
        }

        /* renamed from: a */
        private int m2632a() {
            Integer num = this.f2539a.get();
            if (num == null) {
                num = 0;
            }
            int intValue = num.intValue() - 1;
            if (intValue == 0) {
                this.f2539a.remove();
            } else {
                this.f2539a.set(Integer.valueOf(intValue));
            }
            return intValue;
        }

        /* renamed from: b */
        private int m2633b() {
            Integer num = this.f2539a.get();
            if (num == null) {
                num = 0;
            }
            int intValue = num.intValue() + 1;
            this.f2539a.set(Integer.valueOf(intValue));
            return intValue;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            try {
                if (m2633b() <= 15) {
                    runnable.run();
                } else {
                    C0495d.m2629a().execute(runnable);
                }
            } finally {
                m2632a();
            }
        }
    }

    private C0495d() {
        this.f2536b = !m2631c() ? Executors.newCachedThreadPool() : C0493b.m2626a();
        this.f2537c = Executors.newSingleThreadScheduledExecutor();
        this.f2538d = new a();
    }

    /* renamed from: a */
    public static ExecutorService m2629a() {
        return f2535a.f2536b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static Executor m2630b() {
        return f2535a.f2538d;
    }

    /* renamed from: c */
    private static boolean m2631c() {
        String property = System.getProperty("java.runtime.name");
        if (property == null) {
            return false;
        }
        return property.toLowerCase(Locale.US).contains("android");
    }
}
