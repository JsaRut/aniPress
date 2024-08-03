package p139d.p225c.p226a.p227a.p234f.p236b;

import p139d.p225c.p226a.p227a.p234f.C2334n;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2287g;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2289h;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2325i;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2330j;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2335o;
import p139d.p225c.p226a.p227a.p270n.C2622I;
import p139d.p225c.p226a.p227a.p270n.C2644u;

/* renamed from: d.c.a.a.f.b.c */
/* loaded from: classes.dex */
public final class C2233c implements InterfaceC2287g {

    /* renamed from: a */
    public static final InterfaceC2330j f8194a = new InterfaceC2330j() { // from class: d.c.a.a.f.b.a
        @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2330j
        /* renamed from: a */
        public final InterfaceC2287g[] mo9142a() {
            return C2233c.m9190b();
        }
    };

    /* renamed from: b */
    private static final int f8195b = C2622I.m11078b("FLV");

    /* renamed from: h */
    private InterfaceC2325i f8201h;

    /* renamed from: k */
    private int f8204k;

    /* renamed from: l */
    private int f8205l;

    /* renamed from: m */
    private int f8206m;

    /* renamed from: n */
    private long f8207n;

    /* renamed from: o */
    private boolean f8208o;

    /* renamed from: p */
    private C2232b f8209p;

    /* renamed from: q */
    private C2236f f8210q;

    /* renamed from: c */
    private final C2644u f8196c = new C2644u(4);

    /* renamed from: d */
    private final C2644u f8197d = new C2644u(9);

    /* renamed from: e */
    private final C2644u f8198e = new C2644u(11);

    /* renamed from: f */
    private final C2644u f8199f = new C2644u();

    /* renamed from: g */
    private final C2234d f8200g = new C2234d();

    /* renamed from: i */
    private int f8202i = 1;

    /* renamed from: j */
    private long f8203j = -9223372036854775807L;

    /* renamed from: b */
    private C2644u m9189b(InterfaceC2289h interfaceC2289h) {
        if (this.f8206m > this.f8199f.m11215b()) {
            C2644u c2644u = this.f8199f;
            c2644u.m11213a(new byte[Math.max(c2644u.m11215b() * 2, this.f8206m)], 0);
        } else {
            this.f8199f.m11222e(0);
        }
        this.f8199f.m11220d(this.f8206m);
        interfaceC2289h.readFully(this.f8199f.f11004a, 0, this.f8206m);
        return this.f8199f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static /* synthetic */ InterfaceC2287g[] m9190b() {
        return new InterfaceC2287g[]{new C2233c()};
    }

    /* renamed from: c */
    private void m9191c() {
        if (!this.f8208o) {
            this.f8201h.mo9673a(new InterfaceC2335o.b(-9223372036854775807L));
            this.f8208o = true;
        }
        if (this.f8203j == -9223372036854775807L) {
            this.f8203j = this.f8200g.m9205a() == -9223372036854775807L ? -this.f8207n : 0L;
        }
    }

    /* renamed from: c */
    private boolean m9192c(InterfaceC2289h interfaceC2289h) {
        if (!interfaceC2289h.mo9278a(this.f8197d.f11004a, 0, 9, true)) {
            return false;
        }
        this.f8197d.m11222e(0);
        this.f8197d.m11224f(4);
        int m11238t = this.f8197d.m11238t();
        boolean z = (m11238t & 4) != 0;
        boolean z2 = (m11238t & 1) != 0;
        if (z && this.f8209p == null) {
            this.f8209p = new C2232b(this.f8201h.mo9671a(8, 1));
        }
        if (z2 && this.f8210q == null) {
            this.f8210q = new C2236f(this.f8201h.mo9671a(9, 2));
        }
        this.f8201h.mo9672a();
        this.f8204k = (this.f8197d.m11226h() - 9) + 4;
        this.f8202i = 2;
        return true;
    }

    /* renamed from: d */
    private boolean m9193d(InterfaceC2289h interfaceC2289h) {
        AbstractC2235e abstractC2235e;
        boolean z = true;
        if (this.f8205l == 8 && this.f8209p != null) {
            m9191c();
            abstractC2235e = this.f8209p;
        } else {
            if (this.f8205l != 9 || this.f8210q == null) {
                if (this.f8205l != 18 || this.f8208o) {
                    interfaceC2289h.mo9283c(this.f8206m);
                    z = false;
                } else {
                    this.f8200g.m9206a(m9189b(interfaceC2289h), this.f8207n);
                    long m9205a = this.f8200g.m9205a();
                    if (m9205a != -9223372036854775807L) {
                        this.f8201h.mo9673a(new InterfaceC2335o.b(m9205a));
                        this.f8208o = true;
                    }
                }
                this.f8204k = 4;
                this.f8202i = 2;
                return z;
            }
            m9191c();
            abstractC2235e = this.f8210q;
        }
        abstractC2235e.m9206a(m9189b(interfaceC2289h), this.f8203j + this.f8207n);
        this.f8204k = 4;
        this.f8202i = 2;
        return z;
    }

    /* renamed from: e */
    private boolean m9194e(InterfaceC2289h interfaceC2289h) {
        if (!interfaceC2289h.mo9278a(this.f8198e.f11004a, 0, 11, true)) {
            return false;
        }
        this.f8198e.m11222e(0);
        this.f8205l = this.f8198e.m11238t();
        this.f8206m = this.f8198e.m11241w();
        this.f8207n = this.f8198e.m11241w();
        this.f8207n = ((this.f8198e.m11238t() << 24) | this.f8207n) * 1000;
        this.f8198e.m11224f(3);
        this.f8202i = 4;
        return true;
    }

    /* renamed from: f */
    private void m9195f(InterfaceC2289h interfaceC2289h) {
        interfaceC2289h.mo9283c(this.f8204k);
        this.f8204k = 0;
        this.f8202i = 3;
    }

    @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2287g
    /* renamed from: a */
    public int mo9157a(InterfaceC2289h interfaceC2289h, C2334n c2334n) {
        while (true) {
            int i = this.f8202i;
            if (i != 1) {
                if (i == 2) {
                    m9195f(interfaceC2289h);
                } else if (i != 3) {
                    if (i != 4) {
                        throw new IllegalStateException();
                    }
                    if (m9193d(interfaceC2289h)) {
                        return 0;
                    }
                } else if (!m9194e(interfaceC2289h)) {
                    return -1;
                }
            } else if (!m9192c(interfaceC2289h)) {
                return -1;
            }
        }
    }

    @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2287g
    /* renamed from: a */
    public void mo9158a() {
    }

    @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2287g
    /* renamed from: a */
    public void mo9159a(long j, long j2) {
        this.f8202i = 1;
        this.f8203j = -9223372036854775807L;
        this.f8204k = 0;
    }

    @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2287g
    /* renamed from: a */
    public void mo9160a(InterfaceC2325i interfaceC2325i) {
        this.f8201h = interfaceC2325i;
    }

    @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2287g
    /* renamed from: a */
    public boolean mo9161a(InterfaceC2289h interfaceC2289h) {
        interfaceC2289h.mo9276a(this.f8196c.f11004a, 0, 3);
        this.f8196c.m11222e(0);
        if (this.f8196c.m11241w() != f8195b) {
            return false;
        }
        interfaceC2289h.mo9276a(this.f8196c.f11004a, 0, 2);
        this.f8196c.m11222e(0);
        if ((this.f8196c.m11244z() & 250) != 0) {
            return false;
        }
        interfaceC2289h.mo9276a(this.f8196c.f11004a, 0, 4);
        this.f8196c.m11222e(0);
        int m11226h = this.f8196c.m11226h();
        interfaceC2289h.mo9280b();
        interfaceC2289h.mo9275a(m11226h);
        interfaceC2289h.mo9276a(this.f8196c.f11004a, 0, 4);
        this.f8196c.m11222e(0);
        return this.f8196c.m11226h() == 0;
    }
}
