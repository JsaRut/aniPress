package p139d.p225c.p226a.p227a;

import android.os.Handler;
import p139d.p225c.p226a.p227a.p270n.C2628e;

/* renamed from: d.c.a.a.F */
/* loaded from: classes.dex */
public final class C2141F {

    /* renamed from: a */
    private final b f7646a;

    /* renamed from: b */
    private final a f7647b;

    /* renamed from: c */
    private final AbstractC2151P f7648c;

    /* renamed from: d */
    private int f7649d;

    /* renamed from: e */
    private Object f7650e;

    /* renamed from: f */
    private Handler f7651f;

    /* renamed from: g */
    private int f7652g;

    /* renamed from: h */
    private long f7653h = -9223372036854775807L;

    /* renamed from: i */
    private boolean f7654i = true;

    /* renamed from: j */
    private boolean f7655j;

    /* renamed from: k */
    private boolean f7656k;

    /* renamed from: l */
    private boolean f7657l;

    /* renamed from: m */
    private boolean f7658m;

    /* renamed from: d.c.a.a.F$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        void mo8557a(C2141F c2141f);
    }

    /* renamed from: d.c.a.a.F$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: a */
        void mo8558a(int i, Object obj);
    }

    public C2141F(a aVar, b bVar, AbstractC2151P abstractC2151P, int i, Handler handler) {
        this.f7647b = aVar;
        this.f7646a = bVar;
        this.f7648c = abstractC2151P;
        this.f7651f = handler;
        this.f7652g = i;
    }

    /* renamed from: a */
    public C2141F m8543a(int i) {
        C2628e.m11113b(!this.f7655j);
        this.f7649d = i;
        return this;
    }

    /* renamed from: a */
    public C2141F m8544a(Object obj) {
        C2628e.m11113b(!this.f7655j);
        this.f7650e = obj;
        return this;
    }

    /* renamed from: a */
    public synchronized void m8545a(boolean z) {
        this.f7656k = z | this.f7656k;
        this.f7657l = true;
        notifyAll();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: a */
    public synchronized boolean m8546a() {
        C2628e.m11113b(this.f7655j);
        C2628e.m11113b(this.f7651f.getLooper().getThread() != Thread.currentThread());
        while (!this.f7657l) {
            wait();
        }
        return this.f7656k;
    }

    /* renamed from: b */
    public boolean m8547b() {
        return this.f7654i;
    }

    /* renamed from: c */
    public Handler m8548c() {
        return this.f7651f;
    }

    /* renamed from: d */
    public Object m8549d() {
        return this.f7650e;
    }

    /* renamed from: e */
    public long m8550e() {
        return this.f7653h;
    }

    /* renamed from: f */
    public b m8551f() {
        return this.f7646a;
    }

    /* renamed from: g */
    public AbstractC2151P m8552g() {
        return this.f7648c;
    }

    /* renamed from: h */
    public int m8553h() {
        return this.f7649d;
    }

    /* renamed from: i */
    public int m8554i() {
        return this.f7652g;
    }

    /* renamed from: j */
    public synchronized boolean m8555j() {
        return this.f7658m;
    }

    /* renamed from: k */
    public C2141F m8556k() {
        C2628e.m11113b(!this.f7655j);
        if (this.f7653h == -9223372036854775807L) {
            C2628e.m11111a(this.f7654i);
        }
        this.f7655j = true;
        this.f7647b.mo8557a(this);
        return this;
    }
}
