package p139d.p225c.p226a.p227a.p269m;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import p139d.p225c.p226a.p227a.p270n.C2620G;
import p139d.p225c.p226a.p227a.p270n.C2622I;
import p139d.p225c.p226a.p227a.p270n.C2628e;
import p139d.p225c.p226a.p227a.p270n.C2638o;

/* renamed from: d.c.a.a.m.z */
/* loaded from: classes.dex */
public final class C2612z implements InterfaceC2582A {

    /* renamed from: a */
    public static final b f10847a = m10955a(false, -9223372036854775807L);

    /* renamed from: b */
    public static final b f10848b = m10955a(true, -9223372036854775807L);

    /* renamed from: c */
    public static final b f10849c = new b(2, -9223372036854775807L);

    /* renamed from: d */
    public static final b f10850d = new b(3, -9223372036854775807L);

    /* renamed from: e */
    private final ExecutorService f10851e;

    /* renamed from: f */
    private c<? extends d> f10852f;

    /* renamed from: g */
    private IOException f10853g;

    /* renamed from: d.c.a.a.m.z$a */
    /* loaded from: classes.dex */
    public interface a<T extends d> {
        /* renamed from: a */
        b mo9965a(T t, long j, long j2, IOException iOException, int i);

        /* renamed from: a */
        void mo9967a(T t, long j, long j2);

        /* renamed from: a */
        void mo9968a(T t, long j, long j2, boolean z);
    }

    /* renamed from: d.c.a.a.m.z$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        private final int f10854a;

        /* renamed from: b */
        private final long f10855b;

        private b(int i, long j) {
            this.f10854a = i;
            this.f10855b = j;
        }

        /* synthetic */ b(int i, long j, C2611y c2611y) {
            this(i, j);
        }

        /* renamed from: a */
        public boolean m10968a() {
            int i = this.f10854a;
            return i == 0 || i == 1;
        }
    }

    @SuppressLint({"HandlerLeak"})
    /* renamed from: d.c.a.a.m.z$c */
    /* loaded from: classes.dex */
    public final class c<T extends d> extends Handler implements Runnable {

        /* renamed from: a */
        public final int f10856a;

        /* renamed from: b */
        private final T f10857b;

        /* renamed from: c */
        private final long f10858c;

        /* renamed from: d */
        private a<T> f10859d;

        /* renamed from: e */
        private IOException f10860e;

        /* renamed from: f */
        private int f10861f;

        /* renamed from: g */
        private volatile Thread f10862g;

        /* renamed from: h */
        private volatile boolean f10863h;

        /* renamed from: i */
        private volatile boolean f10864i;

        public c(Looper looper, T t, a<T> aVar, int i, long j) {
            super(looper);
            this.f10857b = t;
            this.f10859d = aVar;
            this.f10856a = i;
            this.f10858c = j;
        }

        /* renamed from: a */
        private void m10969a() {
            this.f10860e = null;
            C2612z.this.f10851e.execute(C2612z.this.f10852f);
        }

        /* renamed from: b */
        private void m10970b() {
            C2612z.this.f10852f = null;
        }

        /* renamed from: c */
        private long m10971c() {
            return Math.min((this.f10861f - 1) * 1000, 5000);
        }

        /* renamed from: a */
        public void m10972a(int i) {
            IOException iOException = this.f10860e;
            if (iOException != null && this.f10861f > i) {
                throw iOException;
            }
        }

        /* renamed from: a */
        public void m10973a(long j) {
            C2628e.m11113b(C2612z.this.f10852f == null);
            C2612z.this.f10852f = this;
            if (j > 0) {
                sendEmptyMessageDelayed(0, j);
            } else {
                m10969a();
            }
        }

        /* renamed from: a */
        public void m10974a(boolean z) {
            this.f10864i = z;
            this.f10860e = null;
            if (hasMessages(0)) {
                removeMessages(0);
                if (!z) {
                    sendEmptyMessage(1);
                }
            } else {
                this.f10863h = true;
                this.f10857b.mo9974b();
                if (this.f10862g != null) {
                    this.f10862g.interrupt();
                }
            }
            if (z) {
                m10970b();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                this.f10859d.mo9968a(this.f10857b, elapsedRealtime, elapsedRealtime - this.f10858c, true);
                this.f10859d = null;
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (this.f10864i) {
                return;
            }
            int i = message.what;
            if (i == 0) {
                m10969a();
                return;
            }
            if (i == 4) {
                throw ((Error) message.obj);
            }
            m10970b();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = elapsedRealtime - this.f10858c;
            if (this.f10863h) {
                this.f10859d.mo9968a(this.f10857b, elapsedRealtime, j, false);
                return;
            }
            int i2 = message.what;
            if (i2 == 1) {
                this.f10859d.mo9968a(this.f10857b, elapsedRealtime, j, false);
                return;
            }
            if (i2 == 2) {
                try {
                    this.f10859d.mo9967a(this.f10857b, elapsedRealtime, j);
                    return;
                } catch (RuntimeException e2) {
                    C2638o.m11156a("LoadTask", "Unexpected exception handling load completed", e2);
                    C2612z.this.f10853g = new g(e2);
                    return;
                }
            }
            if (i2 != 3) {
                return;
            }
            this.f10860e = (IOException) message.obj;
            this.f10861f++;
            b mo9965a = this.f10859d.mo9965a(this.f10857b, elapsedRealtime, j, this.f10860e, this.f10861f);
            if (mo9965a.f10854a == 3) {
                C2612z.this.f10853g = this.f10860e;
            } else if (mo9965a.f10854a != 2) {
                if (mo9965a.f10854a == 1) {
                    this.f10861f = 1;
                }
                m10973a(mo9965a.f10855b != -9223372036854775807L ? mo9965a.f10855b : m10971c());
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            Object e2;
            try {
                this.f10862g = Thread.currentThread();
                if (!this.f10863h) {
                    C2620G.m11028a("load:" + this.f10857b.getClass().getSimpleName());
                    try {
                        this.f10857b.mo9973a();
                        C2620G.m11027a();
                    } catch (Throwable th) {
                        C2620G.m11027a();
                        throw th;
                    }
                }
                if (this.f10864i) {
                    return;
                }
                sendEmptyMessage(2);
            } catch (IOException e3) {
                e2 = e3;
                if (this.f10864i) {
                    return;
                }
                obtainMessage(3, e2).sendToTarget();
            } catch (Error e4) {
                C2638o.m11156a("LoadTask", "Unexpected error loading stream", e4);
                if (!this.f10864i) {
                    obtainMessage(4, e4).sendToTarget();
                }
                throw e4;
            } catch (InterruptedException unused) {
                C2628e.m11113b(this.f10863h);
                if (this.f10864i) {
                    return;
                }
                sendEmptyMessage(2);
            } catch (Exception e5) {
                C2638o.m11156a("LoadTask", "Unexpected exception loading stream", e5);
                if (this.f10864i) {
                    return;
                }
                e2 = new g(e5);
                obtainMessage(3, e2).sendToTarget();
            } catch (OutOfMemoryError e6) {
                C2638o.m11156a("LoadTask", "OutOfMemory error loading stream", e6);
                if (this.f10864i) {
                    return;
                }
                e2 = new g(e6);
                obtainMessage(3, e2).sendToTarget();
            }
        }
    }

    /* renamed from: d.c.a.a.m.z$d */
    /* loaded from: classes.dex */
    public interface d {
        /* renamed from: a */
        void mo9973a();

        /* renamed from: b */
        void mo9974b();
    }

    /* renamed from: d.c.a.a.m.z$e */
    /* loaded from: classes.dex */
    public interface e {
        /* renamed from: h */
        void mo10019h();
    }

    /* renamed from: d.c.a.a.m.z$f */
    /* loaded from: classes.dex */
    public static final class f implements Runnable {

        /* renamed from: a */
        private final e f10866a;

        public f(e eVar) {
            this.f10866a = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f10866a.mo10019h();
        }
    }

    /* renamed from: d.c.a.a.m.z$g */
    /* loaded from: classes.dex */
    public static final class g extends IOException {
        public g(Throwable th) {
            super("Unexpected " + th.getClass().getSimpleName() + ": " + th.getMessage(), th);
        }
    }

    public C2612z(String str) {
        this.f10851e = C2622I.m11090e(str);
    }

    /* renamed from: a */
    public static b m10955a(boolean z, long j) {
        return new b(z ? 1 : 0, j);
    }

    /* renamed from: a */
    public <T extends d> long m10960a(T t, a<T> aVar, int i) {
        Looper myLooper = Looper.myLooper();
        C2628e.m11113b(myLooper != null);
        this.f10853g = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new c(myLooper, t, aVar, i, elapsedRealtime).m10973a(0L);
        return elapsedRealtime;
    }

    @Override // p139d.p225c.p226a.p227a.p269m.InterfaceC2582A
    /* renamed from: a */
    public void mo10177a() {
        m10961a(Integer.MIN_VALUE);
    }

    /* renamed from: a */
    public void m10961a(int i) {
        IOException iOException = this.f10853g;
        if (iOException != null) {
            throw iOException;
        }
        c<? extends d> cVar = this.f10852f;
        if (cVar != null) {
            if (i == Integer.MIN_VALUE) {
                i = cVar.f10856a;
            }
            cVar.m10972a(i);
        }
    }

    /* renamed from: a */
    public void m10962a(e eVar) {
        c<? extends d> cVar = this.f10852f;
        if (cVar != null) {
            cVar.m10974a(true);
        }
        if (eVar != null) {
            this.f10851e.execute(new f(eVar));
        }
        this.f10851e.shutdown();
    }

    /* renamed from: b */
    public void m10963b() {
        this.f10852f.m10974a(false);
    }

    /* renamed from: c */
    public boolean m10964c() {
        return this.f10852f != null;
    }

    /* renamed from: d */
    public void m10965d() {
        m10962a((e) null);
    }
}
