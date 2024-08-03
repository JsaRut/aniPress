package p031c.p032a.p063g;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: c.a.g.r */
/* loaded from: classes.dex */
public final class C0636r {

    /* renamed from: g */
    private Object f2985g;

    /* renamed from: d */
    private final AtomicBoolean f2982d = new AtomicBoolean(true);

    /* renamed from: f */
    private volatile long f2984f = 0;

    /* renamed from: h */
    private CountDownLatch f2986h = new CountDownLatch(1);

    /* renamed from: a */
    private final int f2979a = 2000;

    /* renamed from: e */
    private final InterfaceC0619a<Object> f2983e = null;

    /* renamed from: b */
    private final ThreadPoolExecutor f2980b = new C0637s(this, 5, 5, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());

    /* renamed from: c */
    private final Handler f2981c = new HandlerC0639u(this.f2980b);

    public C0636r(int i, int i2, InterfaceC0619a<Object> interfaceC0619a) {
    }

    /* renamed from: b */
    private synchronized long m3258b(long j) {
        long j2 = this.f2984f + j;
        long uptimeMillis = SystemClock.uptimeMillis();
        if (j2 < uptimeMillis) {
            this.f2984f = uptimeMillis;
            return -1L;
        }
        this.f2984f = j2;
        return j2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static /* synthetic */ Looper m3260c() {
        HandlerThreadC0638t handlerThreadC0638t = new HandlerThreadC0638t("Step");
        handlerThreadC0638t.start();
        Looper looper = handlerThreadC0638t.getLooper();
        return looper == null ? Looper.getMainLooper() : looper;
    }

    /* renamed from: a */
    public final synchronized Object m3262a(long j) {
        if (m3265a()) {
            return this.f2985g;
        }
        if (this.f2982d.get()) {
            return null;
        }
        try {
            if (j != -1) {
                this.f2986h.await(j, TimeUnit.MILLISECONDS);
            } else {
                this.f2986h.await();
            }
        } catch (InterruptedException unused) {
        }
        if (this.f2986h.getCount() == 0) {
            this.f2986h = new CountDownLatch(1);
        }
        return this.f2985g;
    }

    /* renamed from: a */
    public final void m3263a(Object obj) {
        if (m3265a() || obj == null) {
            return;
        }
        this.f2985g = obj;
        this.f2986h.countDown();
        this.f2981c.removeMessages(233);
        this.f2980b.shutdownNow();
    }

    /* renamed from: a */
    public final void m3264a(Callable<?> callable) {
        try {
            long m3258b = m3258b(this.f2979a);
            if (m3258b < 0) {
                this.f2980b.submit(callable);
            } else {
                Message obtain = Message.obtain();
                obtain.what = 233;
                obtain.obj = callable;
                this.f2981c.sendMessageAtTime(obtain, m3258b);
            }
            this.f2982d.set(false);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public final boolean m3265a() {
        return this.f2985g != null;
    }

    /* renamed from: b */
    public final void m3266b() {
        try {
            if (this.f2980b != null) {
                this.f2980b.getQueue().clear();
                this.f2981c.removeMessages(233);
            }
        } catch (Throwable th) {
            Log.w("Step", "clean executor e:" + th);
        }
    }
}
