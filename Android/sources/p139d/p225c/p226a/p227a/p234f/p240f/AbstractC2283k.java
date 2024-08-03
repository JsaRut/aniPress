package p139d.p225c.p226a.p227a.p234f.p240f;

import p139d.p225c.p226a.p227a.C2676s;
import p139d.p225c.p226a.p227a.p234f.C2334n;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2289h;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2325i;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2335o;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2337q;
import p139d.p225c.p226a.p227a.p270n.C2644u;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: d.c.a.a.f.f.k */
/* loaded from: classes.dex */
public abstract class AbstractC2283k {

    /* renamed from: a */
    private final C2278f f8744a = new C2278f();

    /* renamed from: b */
    private InterfaceC2337q f8745b;

    /* renamed from: c */
    private InterfaceC2325i f8746c;

    /* renamed from: d */
    private InterfaceC2280h f8747d;

    /* renamed from: e */
    private long f8748e;

    /* renamed from: f */
    private long f8749f;

    /* renamed from: g */
    private long f8750g;

    /* renamed from: h */
    private int f8751h;

    /* renamed from: i */
    private int f8752i;

    /* renamed from: j */
    private a f8753j;

    /* renamed from: k */
    private long f8754k;

    /* renamed from: l */
    private boolean f8755l;

    /* renamed from: m */
    private boolean f8756m;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d.c.a.a.f.f.k$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        C2676s f8757a;

        /* renamed from: b */
        InterfaceC2280h f8758b;

        a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d.c.a.a.f.f.k$b */
    /* loaded from: classes.dex */
    public static final class b implements InterfaceC2280h {
        private b() {
        }

        @Override // p139d.p225c.p226a.p227a.p234f.p240f.InterfaceC2280h
        /* renamed from: a */
        public long mo9440a(InterfaceC2289h interfaceC2289h) {
            return -1L;
        }

        @Override // p139d.p225c.p226a.p227a.p234f.p240f.InterfaceC2280h
        /* renamed from: a */
        public InterfaceC2335o mo9442a() {
            return new InterfaceC2335o.b(-9223372036854775807L);
        }

        @Override // p139d.p225c.p226a.p227a.p234f.p240f.InterfaceC2280h
        /* renamed from: c */
        public long mo9446c(long j) {
            return 0L;
        }
    }

    /* renamed from: a */
    private int m9471a(InterfaceC2289h interfaceC2289h) {
        boolean z = true;
        while (z) {
            if (!this.f8744a.m9462a(interfaceC2289h)) {
                this.f8751h = 3;
                return -1;
            }
            this.f8754k = interfaceC2289h.getPosition() - this.f8749f;
            z = mo9454a(this.f8744a.m9463b(), this.f8749f, this.f8753j);
            if (z) {
                this.f8749f = interfaceC2289h.getPosition();
            }
        }
        C2676s c2676s = this.f8753j.f8757a;
        this.f8752i = c2676s.f11196u;
        if (!this.f8756m) {
            this.f8745b.mo9433a(c2676s);
            this.f8756m = true;
        }
        InterfaceC2280h interfaceC2280h = this.f8753j.f8758b;
        if (interfaceC2280h != null) {
            this.f8747d = interfaceC2280h;
        } else if (interfaceC2289h.getLength() == -1) {
            this.f8747d = new b();
        } else {
            C2279g m9461a = this.f8744a.m9461a();
            this.f8747d = new C2275c(this.f8749f, interfaceC2289h.getLength(), this, m9461a.f8737i + m9461a.f8738j, m9461a.f8732d, (m9461a.f8731c & 4) != 0);
        }
        this.f8753j = null;
        this.f8751h = 2;
        this.f8744a.m9465d();
        return 0;
    }

    /* renamed from: b */
    private int m9472b(InterfaceC2289h interfaceC2289h, C2334n c2334n) {
        long mo9440a = this.f8747d.mo9440a(interfaceC2289h);
        if (mo9440a >= 0) {
            c2334n.f9165a = mo9440a;
            return 1;
        }
        if (mo9440a < -1) {
            mo9478c(-(mo9440a + 2));
        }
        if (!this.f8755l) {
            this.f8746c.mo9673a(this.f8747d.mo9442a());
            this.f8755l = true;
        }
        if (this.f8754k <= 0 && !this.f8744a.m9462a(interfaceC2289h)) {
            this.f8751h = 3;
            return -1;
        }
        this.f8754k = 0L;
        C2644u m9463b = this.f8744a.m9463b();
        long mo9452a = mo9452a(m9463b);
        if (mo9452a >= 0) {
            long j = this.f8750g;
            if (j + mo9452a >= this.f8748e) {
                long m9474a = m9474a(j);
                this.f8745b.mo9432a(m9463b, m9463b.m11219d());
                this.f8745b.mo9431a(m9474a, 1, m9463b.m11219d(), 0, null);
                this.f8748e = -1L;
            }
        }
        this.f8750g += mo9452a;
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final int m9473a(InterfaceC2289h interfaceC2289h, C2334n c2334n) {
        int i = this.f8751h;
        if (i == 0) {
            return m9471a(interfaceC2289h);
        }
        if (i != 1) {
            if (i == 2) {
                return m9472b(interfaceC2289h, c2334n);
            }
            throw new IllegalStateException();
        }
        interfaceC2289h.mo9283c((int) this.f8749f);
        this.f8751h = 2;
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public long m9474a(long j) {
        return (j * 1000000) / this.f8752i;
    }

    /* renamed from: a */
    protected abstract long mo9452a(C2644u c2644u);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m9475a(long j, long j2) {
        this.f8744a.m9464c();
        if (j == 0) {
            mo9453a(!this.f8755l);
        } else if (this.f8751h != 0) {
            this.f8748e = this.f8747d.mo9446c(j2);
            this.f8751h = 2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m9476a(InterfaceC2325i interfaceC2325i, InterfaceC2337q interfaceC2337q) {
        this.f8746c = interfaceC2325i;
        this.f8745b = interfaceC2337q;
        mo9453a(true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void mo9453a(boolean z) {
        int i;
        if (z) {
            this.f8753j = new a();
            this.f8749f = 0L;
            i = 0;
        } else {
            i = 1;
        }
        this.f8751h = i;
        this.f8748e = -1L;
        this.f8750g = 0L;
    }

    /* renamed from: a */
    protected abstract boolean mo9454a(C2644u c2644u, long j, a aVar);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public long m9477b(long j) {
        return (this.f8752i * j) / 1000000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public void mo9478c(long j) {
        this.f8750g = j;
    }
}
