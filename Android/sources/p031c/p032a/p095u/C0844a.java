package p031c.p032a.p095u;

import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import p031c.p032a.p060d.C0601d;

/* renamed from: c.a.u.a */
/* loaded from: classes.dex */
public class C0844a {

    /* renamed from: a */
    private static final HashMap<String, ExecutorService> f3591a = new HashMap<>();

    /* renamed from: a */
    private static ExecutorService m4115a(String str) {
        ExecutorService executorService;
        ExecutorService executorService2 = f3591a.get(str);
        if (executorService2 != null && !executorService2.isShutdown()) {
            return executorService2;
        }
        synchronized (C0844a.class) {
            executorService = f3591a.get(str);
            if (executorService == null || executorService.isShutdown()) {
                char c2 = 65535;
                switch (str.hashCode()) {
                    case -1649445006:
                        if (str.equals("TCP_REPORT")) {
                            c2 = 1;
                            break;
                        }
                        break;
                    case -1642909390:
                        if (str.equals("UPLOAD_REPORT")) {
                            c2 = 7;
                            break;
                        }
                        break;
                    case -788009879:
                        if (str.equals("REPORT_HISTORY")) {
                            c2 = '\b';
                            break;
                        }
                        break;
                    case -501390267:
                        if (str.equals("BUILD_REPORT")) {
                            c2 = 6;
                            break;
                        }
                        break;
                    case 62589532:
                        if (str.equals("ASYNC")) {
                            c2 = 0;
                            break;
                        }
                        break;
                    case 1082250773:
                        if (str.equals("SDK_INIT")) {
                            c2 = 2;
                            break;
                        }
                        break;
                    case 1082357438:
                        if (str.equals("SDK_MAIN")) {
                            c2 = 4;
                            break;
                        }
                        break;
                    case 1350548607:
                        if (str.equals("SDK_SERVICE_INIT")) {
                            c2 = 3;
                            break;
                        }
                        break;
                    case 1925345846:
                        if (str.equals("ACTION")) {
                            c2 = 5;
                            break;
                        }
                        break;
                }
                executorService = c2 != 0 ? c2 != 1 ? Executors.newSingleThreadExecutor() : Executors.newFixedThreadPool(5) : Executors.newFixedThreadPool(15);
                f3591a.put(str, executorService);
            }
        }
        return executorService;
    }

    /* renamed from: a */
    public static void m4116a(String str, Runnable runnable) {
        ExecutorService executorService;
        try {
            executorService = m4115a(str);
            try {
                executorService.execute(runnable);
            } catch (Throwable th) {
                th = th;
                C0601d.m3079h("SDKWorker_XExecutor", "execute failed, try again e:" + th);
                if (executorService != null) {
                    try {
                        executorService.shutdown();
                        if (!executorService.awaitTermination(100L, TimeUnit.MILLISECONDS)) {
                            executorService.shutdownNow();
                            if (!executorService.awaitTermination(100L, TimeUnit.MILLISECONDS)) {
                                C0601d.m3070a("SDKWorker_XExecutor", "executor did not terminate");
                            }
                        }
                    } catch (InterruptedException unused) {
                        executorService.shutdownNow();
                        C0601d.m3070a("SDKWorker_XExecutor", "current thread is interrupted by self");
                        Thread.currentThread().interrupt();
                    } catch (Throwable th2) {
                        C0601d.m3077f("SDKWorker_XExecutor", "shutDown e:" + th2);
                    }
                }
                try {
                    m4115a(str).execute(runnable);
                } catch (Throwable unused2) {
                    C0601d.m3079h("SDKWorker_XExecutor", "execute e:" + th);
                    if (runnable != null) {
                        try {
                            if (str.equals("BUILD_REPORT")) {
                                new Thread(runnable).start();
                            }
                        } catch (Throwable th3) {
                            C0601d.m3073b("SDKWorker_XExecutor", "execute BUILD_REPORT last error", th3);
                        }
                    }
                }
            }
        } catch (Throwable th4) {
            th = th4;
            executorService = null;
        }
    }
}
