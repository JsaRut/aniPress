package p139d.p225c.p226a.p227a.p234f.p242h;

import p139d.p225c.p226a.p227a.C2683z;
import p139d.p225c.p226a.p227a.p234f.C2237c;
import p139d.p225c.p226a.p227a.p234f.C2334n;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2287g;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2289h;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2325i;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2330j;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2335o;
import p139d.p225c.p226a.p227a.p234f.p242h.InterfaceC2296G;
import p139d.p225c.p226a.p227a.p270n.C2622I;
import p139d.p225c.p226a.p227a.p270n.C2628e;
import p139d.p225c.p226a.p227a.p270n.C2643t;
import p139d.p225c.p226a.p227a.p270n.C2644u;

/* renamed from: d.c.a.a.f.h.g */
/* loaded from: classes.dex */
public final class C2305g implements InterfaceC2287g {

    /* renamed from: a */
    public static final InterfaceC2330j f8891a = C2300b.f8870a;

    /* renamed from: b */
    private static final int f8892b = C2622I.m11078b("ID3");

    /* renamed from: c */
    private final int f8893c;

    /* renamed from: d */
    private final C2306h f8894d;

    /* renamed from: e */
    private final C2644u f8895e;

    /* renamed from: f */
    private final C2644u f8896f;

    /* renamed from: g */
    private final C2643t f8897g;

    /* renamed from: h */
    private final long f8898h;

    /* renamed from: i */
    private InterfaceC2325i f8899i;

    /* renamed from: j */
    private long f8900j;

    /* renamed from: k */
    private long f8901k;

    /* renamed from: l */
    private int f8902l;

    /* renamed from: m */
    private boolean f8903m;

    /* renamed from: n */
    private boolean f8904n;

    /* renamed from: o */
    private boolean f8905o;

    public C2305g() {
        this(0L);
    }

    public C2305g(long j) {
        this(j, 0);
    }

    public C2305g(long j, int i) {
        this.f8898h = j;
        this.f8900j = j;
        this.f8893c = i;
        this.f8894d = new C2306h(true);
        this.f8895e = new C2644u(2048);
        this.f8902l = -1;
        this.f8901k = -1L;
        this.f8896f = new C2644u(10);
        this.f8897g = new C2643t(this.f8896f.f11004a);
    }

    /* renamed from: a */
    private static int m9565a(int i, long j) {
        return (int) (((i * 8) * 1000000) / j);
    }

    /* renamed from: a */
    private InterfaceC2335o m9566a(long j) {
        return new C2237c(j, this.f8901k, m9565a(this.f8902l, this.f8894d.m9587c()), this.f8902l);
    }

    /* renamed from: a */
    private void m9567a(long j, boolean z, boolean z2) {
        if (this.f8905o) {
            return;
        }
        boolean z3 = z && this.f8902l > 0;
        if (z3 && this.f8894d.m9587c() == -9223372036854775807L && !z2) {
            return;
        }
        InterfaceC2325i interfaceC2325i = this.f8899i;
        C2628e.m11110a(interfaceC2325i);
        interfaceC2325i.mo9673a((!z3 || this.f8894d.m9587c() == -9223372036854775807L) ? new InterfaceC2335o.b(-9223372036854775807L) : m9566a(j));
        this.f8905o = true;
    }

    /* renamed from: b */
    private void m9568b(InterfaceC2289h interfaceC2289h) {
        if (this.f8903m) {
            return;
        }
        this.f8902l = -1;
        interfaceC2289h.mo9280b();
        long j = 0;
        if (interfaceC2289h.getPosition() == 0) {
            m9570c(interfaceC2289h);
        }
        int i = 0;
        while (true) {
            if (!interfaceC2289h.mo9282b(this.f8896f.f11004a, 0, 2, true)) {
                break;
            }
            this.f8896f.m11222e(0);
            if (!C2306h.m9573a(this.f8896f.m11244z())) {
                i = 0;
                break;
            }
            if (!interfaceC2289h.mo9282b(this.f8896f.f11004a, 0, 4, true)) {
                break;
            }
            this.f8897g.m11198b(14);
            int m11191a = this.f8897g.m11191a(13);
            if (m11191a <= 6) {
                this.f8903m = true;
                throw new C2683z("Malformed ADTS stream");
            }
            j += m11191a;
            i++;
            if (i == 1000 || !interfaceC2289h.mo9277a(m11191a - 6, true)) {
                break;
            }
        }
        interfaceC2289h.mo9280b();
        if (i > 0) {
            this.f8902l = (int) (j / i);
        } else {
            this.f8902l = -1;
        }
        this.f8903m = true;
    }

    /* renamed from: b */
    public static /* synthetic */ InterfaceC2287g[] m9569b() {
        return new InterfaceC2287g[]{new C2305g()};
    }

    /* renamed from: c */
    private int m9570c(InterfaceC2289h interfaceC2289h) {
        int i = 0;
        while (true) {
            interfaceC2289h.mo9276a(this.f8896f.f11004a, 0, 10);
            this.f8896f.m11222e(0);
            if (this.f8896f.m11241w() != f8892b) {
                break;
            }
            this.f8896f.m11224f(3);
            int m11237s = this.f8896f.m11237s();
            i += m11237s + 10;
            interfaceC2289h.mo9275a(m11237s);
        }
        interfaceC2289h.mo9280b();
        interfaceC2289h.mo9275a(i);
        if (this.f8901k == -1) {
            this.f8901k = i;
        }
        return i;
    }

    @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2287g
    /* renamed from: a */
    public int mo9157a(InterfaceC2289h interfaceC2289h, C2334n c2334n) {
        long length = interfaceC2289h.getLength();
        boolean z = ((this.f8893c & 1) == 0 || length == -1) ? false : true;
        if (z) {
            m9568b(interfaceC2289h);
        }
        int read = interfaceC2289h.read(this.f8895e.f11004a, 0, 2048);
        boolean z2 = read == -1;
        m9567a(length, z, z2);
        if (z2) {
            return -1;
        }
        this.f8895e.m11222e(0);
        this.f8895e.m11220d(read);
        if (!this.f8904n) {
            this.f8894d.mo9561a(this.f8900j, 4);
            this.f8904n = true;
        }
        this.f8894d.mo9563a(this.f8895e);
        return 0;
    }

    @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2287g
    /* renamed from: a */
    public void mo9158a() {
    }

    @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2287g
    /* renamed from: a */
    public void mo9159a(long j, long j2) {
        this.f8904n = false;
        this.f8894d.mo9560a();
        this.f8900j = this.f8898h + j2;
    }

    @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2287g
    /* renamed from: a */
    public void mo9160a(InterfaceC2325i interfaceC2325i) {
        this.f8899i = interfaceC2325i;
        this.f8894d.mo9562a(interfaceC2325i, new InterfaceC2296G.d(0, 1));
        interfaceC2325i.mo9672a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0021, code lost:            r9.mo9280b();        r3 = r3 + 1;     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002a, code lost:            if ((r3 - r0) < 8192) goto L55;     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x002c, code lost:            return false;     */
    @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2287g
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean mo9161a(p139d.p225c.p226a.p227a.p234f.InterfaceC2289h r9) {
        /*
            r8 = this;
            int r0 = r8.m9570c(r9)
            r1 = 0
            r3 = r0
        L6:
            r2 = 0
            r4 = 0
        L8:
            d.c.a.a.n.u r5 = r8.f8896f
            byte[] r5 = r5.f11004a
            r6 = 2
            r9.mo9276a(r5, r1, r6)
            d.c.a.a.n.u r5 = r8.f8896f
            r5.m11222e(r1)
            d.c.a.a.n.u r5 = r8.f8896f
            int r5 = r5.m11244z()
            boolean r5 = p139d.p225c.p226a.p227a.p234f.p242h.C2306h.m9573a(r5)
            if (r5 != 0) goto L31
            r9.mo9280b()
            int r3 = r3 + 1
            int r2 = r3 - r0
            r4 = 8192(0x2000, float:1.148E-41)
            if (r2 < r4) goto L2d
            return r1
        L2d:
            r9.mo9275a(r3)
            goto L6
        L31:
            r5 = 1
            int r2 = r2 + r5
            r6 = 4
            if (r2 < r6) goto L3b
            r7 = 188(0xbc, float:2.63E-43)
            if (r4 <= r7) goto L3b
            return r5
        L3b:
            d.c.a.a.n.u r5 = r8.f8896f
            byte[] r5 = r5.f11004a
            r9.mo9276a(r5, r1, r6)
            d.c.a.a.n.t r5 = r8.f8897g
            r6 = 14
            r5.m11198b(r6)
            d.c.a.a.n.t r5 = r8.f8897g
            r6 = 13
            int r5 = r5.m11191a(r6)
            r6 = 6
            if (r5 > r6) goto L55
            return r1
        L55:
            int r6 = r5 + (-6)
            r9.mo9275a(r6)
            int r4 = r4 + r5
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: p139d.p225c.p226a.p227a.p234f.p242h.C2305g.mo9161a(d.c.a.a.f.h):boolean");
    }
}
