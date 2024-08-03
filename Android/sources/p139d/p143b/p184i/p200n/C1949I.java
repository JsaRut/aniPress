package p139d.p143b.p184i.p200n;

import android.os.SystemClock;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p139d.p143b.p184i.p196j.C1920d;

/* renamed from: d.b.i.n.I */
/* loaded from: classes.dex */
public class C1949I {

    /* renamed from: a */
    private final Executor f7137a;

    /* renamed from: b */
    private final a f7138b;

    /* renamed from: e */
    private final int f7141e;

    /* renamed from: c */
    private final Runnable f7139c = new RunnableC1943F(this);

    /* renamed from: d */
    private final Runnable f7140d = new RunnableC1945G(this);

    /* renamed from: f */
    C1920d f7142f = null;

    /* renamed from: g */
    int f7143g = 0;

    /* renamed from: h */
    c f7144h = c.IDLE;

    /* renamed from: i */
    long f7145i = 0;

    /* renamed from: j */
    long f7146j = 0;

    /* renamed from: d.b.i.n.I$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        void mo7994a(C1920d c1920d, int i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d.b.i.n.I$b */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        private static ScheduledExecutorService f7147a;

        /* renamed from: a */
        static ScheduledExecutorService m7995a() {
            if (f7147a == null) {
                f7147a = Executors.newSingleThreadScheduledExecutor();
            }
            return f7147a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d.b.i.n.I$c */
    /* loaded from: classes.dex */
    public enum c {
        IDLE,
        QUEUED,
        RUNNING,
        RUNNING_AND_PENDING
    }

    public C1949I(Executor executor, a aVar, int i) {
        this.f7137a = executor;
        this.f7138b = aVar;
        this.f7141e = i;
    }

    /* renamed from: a */
    private void m7983a(long j) {
        if (j > 0) {
            b.m7995a().schedule(this.f7140d, j, TimeUnit.MILLISECONDS);
        } else {
            this.f7140d.run();
        }
    }

    /* renamed from: b */
    private static boolean m7986b(C1920d c1920d, int i) {
        return AbstractC1973c.m8077a(i) || AbstractC1973c.m8080b(i, 4) || C1920d.m7904e(c1920d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public void m7987d() {
        C1920d c1920d;
        int i;
        long uptimeMillis = SystemClock.uptimeMillis();
        synchronized (this) {
            c1920d = this.f7142f;
            i = this.f7143g;
            this.f7142f = null;
            this.f7143g = 0;
            this.f7144h = c.RUNNING;
            this.f7146j = uptimeMillis;
        }
        try {
            if (m7986b(c1920d, i)) {
                this.f7138b.mo7994a(c1920d, i);
            }
        } finally {
            C1920d.m7902b(c1920d);
            m7988e();
        }
    }

    /* renamed from: e */
    private void m7988e() {
        long j;
        boolean z;
        long uptimeMillis = SystemClock.uptimeMillis();
        synchronized (this) {
            if (this.f7144h == c.RUNNING_AND_PENDING) {
                j = Math.max(this.f7146j + this.f7141e, uptimeMillis);
                z = true;
                this.f7145i = uptimeMillis;
                this.f7144h = c.QUEUED;
            } else {
                this.f7144h = c.IDLE;
                j = 0;
                z = false;
            }
        }
        if (z) {
            m7983a(j - uptimeMillis);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public void m7989f() {
        this.f7137a.execute(this.f7139c);
    }

    /* renamed from: a */
    public void m7990a() {
        C1920d c1920d;
        synchronized (this) {
            c1920d = this.f7142f;
            this.f7142f = null;
            this.f7143g = 0;
        }
        C1920d.m7902b(c1920d);
    }

    /* renamed from: a */
    public boolean m7991a(C1920d c1920d, int i) {
        C1920d c1920d2;
        if (!m7986b(c1920d, i)) {
            return false;
        }
        synchronized (this) {
            c1920d2 = this.f7142f;
            this.f7142f = C1920d.m7901a(c1920d);
            this.f7143g = i;
        }
        C1920d.m7902b(c1920d2);
        return true;
    }

    /* renamed from: b */
    public synchronized long m7992b() {
        return this.f7146j - this.f7145i;
    }

    /* renamed from: c */
    public boolean m7993c() {
        long max;
        long uptimeMillis = SystemClock.uptimeMillis();
        synchronized (this) {
            boolean z = false;
            if (!m7986b(this.f7142f, this.f7143g)) {
                return false;
            }
            int i = C1947H.f7136a[this.f7144h.ordinal()];
            if (i != 1) {
                if (i != 2 && i == 3) {
                    this.f7144h = c.RUNNING_AND_PENDING;
                }
                max = 0;
            } else {
                max = Math.max(this.f7146j + this.f7141e, uptimeMillis);
                this.f7145i = uptimeMillis;
                this.f7144h = c.QUEUED;
                z = true;
            }
            if (z) {
                m7983a(max - uptimeMillis);
            }
            return true;
        }
    }
}
