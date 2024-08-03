package p139d.p225c.p226a.p227a.p234f.p238d;

import java.io.EOFException;
import java.util.List;
import p139d.p225c.p226a.p227a.C2676s;
import p139d.p225c.p226a.p227a.p231d.C2213m;
import p139d.p225c.p226a.p227a.p234f.C2331k;
import p139d.p225c.p226a.p227a.p234f.C2332l;
import p139d.p225c.p226a.p227a.p234f.C2333m;
import p139d.p225c.p226a.p227a.p234f.C2334n;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2287g;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2289h;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2325i;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2330j;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2335o;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2337q;
import p139d.p225c.p226a.p227a.p245h.C2353b;
import p139d.p225c.p226a.p227a.p245h.p247b.C2367n;
import p139d.p225c.p226a.p227a.p245h.p247b.C2372s;
import p139d.p225c.p226a.p227a.p270n.C2622I;
import p139d.p225c.p226a.p227a.p270n.C2644u;

/* renamed from: d.c.a.a.f.d.e */
/* loaded from: classes.dex */
public final class C2252e implements InterfaceC2287g {

    /* renamed from: a */
    public static final InterfaceC2330j f8361a = new InterfaceC2330j() { // from class: d.c.a.a.f.d.a
        @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2330j
        /* renamed from: a */
        public final InterfaceC2287g[] mo9142a() {
            return C2252e.m9295b();
        }
    };

    /* renamed from: b */
    private static final C2367n.a f8362b = new C2367n.a() { // from class: d.c.a.a.f.d.b
        @Override // p139d.p225c.p226a.p227a.p245h.p247b.C2367n.a
        /* renamed from: a */
        public final boolean mo9284a(int i, int i2, int i3, int i4, int i5) {
            return C2252e.m9291a(i, i2, i3, i4, i5);
        }
    };

    /* renamed from: c */
    private static final int f8363c = C2622I.m11078b("Xing");

    /* renamed from: d */
    private static final int f8364d = C2622I.m11078b("Info");

    /* renamed from: e */
    private static final int f8365e = C2622I.m11078b("VBRI");

    /* renamed from: f */
    private final int f8366f;

    /* renamed from: g */
    private final long f8367g;

    /* renamed from: h */
    private final C2644u f8368h;

    /* renamed from: i */
    private final C2333m f8369i;

    /* renamed from: j */
    private final C2331k f8370j;

    /* renamed from: k */
    private final C2332l f8371k;

    /* renamed from: l */
    private InterfaceC2325i f8372l;

    /* renamed from: m */
    private InterfaceC2337q f8373m;

    /* renamed from: n */
    private int f8374n;

    /* renamed from: o */
    private C2353b f8375o;

    /* renamed from: p */
    private a f8376p;

    /* renamed from: q */
    private long f8377q;

    /* renamed from: r */
    private long f8378r;

    /* renamed from: s */
    private int f8379s;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d.c.a.a.f.d.e$a */
    /* loaded from: classes.dex */
    public interface a extends InterfaceC2335o {
        /* renamed from: a */
        long mo9285a(long j);

        /* renamed from: b */
        long mo9286b();
    }

    public C2252e() {
        this(0);
    }

    public C2252e(int i) {
        this(i, -9223372036854775807L);
    }

    public C2252e(int i, long j) {
        this.f8366f = i;
        this.f8367g = j;
        this.f8368h = new C2644u(10);
        this.f8369i = new C2333m();
        this.f8370j = new C2331k();
        this.f8377q = -9223372036854775807L;
        this.f8371k = new C2332l();
    }

    /* renamed from: a */
    private static int m9289a(C2644u c2644u, int i) {
        if (c2644u.m11219d() >= i + 4) {
            c2644u.m11222e(i);
            int m11226h = c2644u.m11226h();
            if (m11226h == f8363c || m11226h == f8364d) {
                return m11226h;
            }
        }
        if (c2644u.m11219d() < 40) {
            return 0;
        }
        c2644u.m11222e(36);
        int m11226h2 = c2644u.m11226h();
        int i2 = f8365e;
        if (m11226h2 == i2) {
            return i2;
        }
        return 0;
    }

    /* renamed from: a */
    private static C2251d m9290a(C2353b c2353b, long j) {
        if (c2353b == null) {
            return null;
        }
        int m9810a = c2353b.m9810a();
        for (int i = 0; i < m9810a; i++) {
            C2353b.a m9811a = c2353b.m9811a(i);
            if (m9811a instanceof C2372s) {
                return C2251d.m9288a(j, (C2372s) m9811a);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static /* synthetic */ boolean m9291a(int i, int i2, int i3, int i4, int i5) {
        return (i2 == 67 && i3 == 79 && i4 == 77 && (i5 == 77 || i == 2)) || (i2 == 77 && i3 == 76 && i4 == 76 && (i5 == 84 || i == 2));
    }

    /* renamed from: a */
    private static boolean m9292a(int i, long j) {
        return ((long) (i & (-128000))) == (j & (-128000));
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a2, code lost:            if (r12 == false) goto L51;     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a4, code lost:            r11.mo9283c(r4 + r3);     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00ac, code lost:            r10.f8374n = r1;     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ae, code lost:            return true;     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00a9, code lost:            r11.mo9280b();     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean m9293a(p139d.p225c.p226a.p227a.p234f.InterfaceC2289h r11, boolean r12) {
        /*
            r10 = this;
            if (r12 == 0) goto L5
            r0 = 16384(0x4000, float:2.2959E-41)
            goto L7
        L5:
            r0 = 131072(0x20000, float:1.83671E-40)
        L7:
            r11.mo9280b()
            long r1 = r11.getPosition()
            r3 = 0
            r5 = 1
            r6 = 0
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 != 0) goto L45
            int r1 = r10.f8366f
            r1 = r1 & 2
            if (r1 != 0) goto L1e
            r1 = 1
            goto L1f
        L1e:
            r1 = 0
        L1f:
            if (r1 == 0) goto L23
            r1 = 0
            goto L25
        L23:
            d.c.a.a.h.b.n$a r1 = p139d.p225c.p226a.p227a.p234f.p238d.C2252e.f8362b
        L25:
            d.c.a.a.f.l r2 = r10.f8371k
            d.c.a.a.h.b r1 = r2.m9691a(r11, r1)
            r10.f8375o = r1
            d.c.a.a.h.b r1 = r10.f8375o
            if (r1 == 0) goto L36
            d.c.a.a.f.k r2 = r10.f8370j
            r2.m9690a(r1)
        L36:
            long r1 = r11.mo9274a()
            int r2 = (int) r1
            if (r12 != 0) goto L40
            r11.mo9283c(r2)
        L40:
            r4 = r2
            r1 = 0
            r2 = 0
            r3 = 0
            goto L49
        L45:
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
        L49:
            boolean r7 = r10.m9297d(r11)
            if (r7 == 0) goto L58
            if (r2 <= 0) goto L52
            goto La2
        L52:
            java.io.EOFException r11 = new java.io.EOFException
            r11.<init>()
            throw r11
        L58:
            d.c.a.a.n.u r7 = r10.f8368h
            r7.m11222e(r6)
            d.c.a.a.n.u r7 = r10.f8368h
            int r7 = r7.m11226h()
            if (r1 == 0) goto L6c
            long r8 = (long) r1
            boolean r8 = m9292a(r7, r8)
            if (r8 == 0) goto L73
        L6c:
            int r8 = p139d.p225c.p226a.p227a.p234f.C2333m.m9692a(r7)
            r9 = -1
            if (r8 != r9) goto L94
        L73:
            int r1 = r3 + 1
            if (r3 != r0) goto L82
            if (r12 == 0) goto L7a
            return r6
        L7a:
            d.c.a.a.z r11 = new d.c.a.a.z
            java.lang.String r12 = "Searched too many bytes."
            r11.<init>(r12)
            throw r11
        L82:
            if (r12 == 0) goto L8d
            r11.mo9280b()
            int r2 = r4 + r1
            r11.mo9275a(r2)
            goto L90
        L8d:
            r11.mo9283c(r5)
        L90:
            r3 = r1
            r1 = 0
            r2 = 0
            goto L49
        L94:
            int r2 = r2 + 1
            if (r2 != r5) goto L9f
            d.c.a.a.f.m r1 = r10.f8369i
            p139d.p225c.p226a.p227a.p234f.C2333m.m9694a(r7, r1)
            r1 = r7
            goto Laf
        L9f:
            r7 = 4
            if (r2 != r7) goto Laf
        La2:
            if (r12 == 0) goto La9
            int r4 = r4 + r3
            r11.mo9283c(r4)
            goto Lac
        La9:
            r11.mo9280b()
        Lac:
            r10.f8374n = r1
            return r5
        Laf:
            int r8 = r8 + (-4)
            r11.mo9275a(r8)
            goto L49
        */
        throw new UnsupportedOperationException("Method not decompiled: p139d.p225c.p226a.p227a.p234f.p238d.C2252e.m9293a(d.c.a.a.f.h, boolean):boolean");
    }

    /* renamed from: b */
    private a m9294b(InterfaceC2289h interfaceC2289h) {
        interfaceC2289h.mo9276a(this.f8368h.f11004a, 0, 4);
        this.f8368h.m11222e(0);
        C2333m.m9694a(this.f8368h.m11226h(), this.f8369i);
        return new C2250c(interfaceC2289h.getLength(), interfaceC2289h.getPosition(), this.f8369i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static /* synthetic */ InterfaceC2287g[] m9295b() {
        return new InterfaceC2287g[]{new C2252e()};
    }

    /* renamed from: c */
    private a m9296c(InterfaceC2289h interfaceC2289h) {
        int i;
        C2644u c2644u = new C2644u(this.f8369i.f9160j);
        interfaceC2289h.mo9276a(c2644u.f11004a, 0, this.f8369i.f9160j);
        C2333m c2333m = this.f8369i;
        if ((c2333m.f9158h & 1) != 0) {
            if (c2333m.f9162l != 1) {
                i = 36;
            }
            i = 21;
        } else {
            if (c2333m.f9162l == 1) {
                i = 13;
            }
            i = 21;
        }
        int m9289a = m9289a(c2644u, i);
        if (m9289a != f8363c && m9289a != f8364d) {
            if (m9289a != f8365e) {
                interfaceC2289h.mo9280b();
                return null;
            }
            C2253f m9299a = C2253f.m9299a(interfaceC2289h.getLength(), interfaceC2289h.getPosition(), this.f8369i, c2644u);
            interfaceC2289h.mo9283c(this.f8369i.f9160j);
            return m9299a;
        }
        C2254g m9301a = C2254g.m9301a(interfaceC2289h.getLength(), interfaceC2289h.getPosition(), this.f8369i, c2644u);
        if (m9301a != null && !this.f8370j.m9688a()) {
            interfaceC2289h.mo9280b();
            interfaceC2289h.mo9275a(i + 141);
            interfaceC2289h.mo9276a(this.f8368h.f11004a, 0, 3);
            this.f8368h.m11222e(0);
            this.f8370j.m9689a(this.f8368h.m11241w());
        }
        interfaceC2289h.mo9283c(this.f8369i.f9160j);
        return (m9301a == null || m9301a.mo9140c() || m9289a != f8364d) ? m9301a : m9294b(interfaceC2289h);
    }

    /* renamed from: d */
    private boolean m9297d(InterfaceC2289h interfaceC2289h) {
        return (this.f8376p != null && interfaceC2289h.mo9274a() == this.f8376p.mo9286b()) || !interfaceC2289h.mo9282b(this.f8368h.f11004a, 0, 4, true);
    }

    /* renamed from: e */
    private int m9298e(InterfaceC2289h interfaceC2289h) {
        if (this.f8379s == 0) {
            interfaceC2289h.mo9280b();
            if (m9297d(interfaceC2289h)) {
                return -1;
            }
            this.f8368h.m11222e(0);
            int m11226h = this.f8368h.m11226h();
            if (!m9292a(m11226h, this.f8374n) || C2333m.m9692a(m11226h) == -1) {
                interfaceC2289h.mo9283c(1);
                this.f8374n = 0;
                return 0;
            }
            C2333m.m9694a(m11226h, this.f8369i);
            if (this.f8377q == -9223372036854775807L) {
                this.f8377q = this.f8376p.mo9285a(interfaceC2289h.getPosition());
                if (this.f8367g != -9223372036854775807L) {
                    this.f8377q += this.f8367g - this.f8376p.mo9285a(0L);
                }
            }
            this.f8379s = this.f8369i.f9160j;
        }
        int mo9430a = this.f8373m.mo9430a(interfaceC2289h, this.f8379s, true);
        if (mo9430a == -1) {
            return -1;
        }
        this.f8379s -= mo9430a;
        if (this.f8379s > 0) {
            return 0;
        }
        this.f8373m.mo9431a(this.f8377q + ((this.f8378r * 1000000) / r14.f9161k), 1, this.f8369i.f9160j, 0, null);
        this.f8378r += this.f8369i.f9164n;
        this.f8379s = 0;
        return 0;
    }

    @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2287g
    /* renamed from: a */
    public int mo9157a(InterfaceC2289h interfaceC2289h, C2334n c2334n) {
        if (this.f8374n == 0) {
            try {
                m9293a(interfaceC2289h, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.f8376p == null) {
            a m9296c = m9296c(interfaceC2289h);
            C2251d m9290a = m9290a(this.f8375o, interfaceC2289h.getPosition());
            if (m9290a != null) {
                this.f8376p = m9290a;
            } else if (m9296c != null) {
                this.f8376p = m9296c;
            }
            a aVar = this.f8376p;
            if (aVar == null || (!aVar.mo9140c() && (this.f8366f & 1) != 0)) {
                this.f8376p = m9294b(interfaceC2289h);
            }
            this.f8372l.mo9673a(this.f8376p);
            InterfaceC2337q interfaceC2337q = this.f8373m;
            C2333m c2333m = this.f8369i;
            String str = c2333m.f9159i;
            int i = c2333m.f9162l;
            int i2 = c2333m.f9161k;
            C2331k c2331k = this.f8370j;
            interfaceC2337q.mo9433a(C2676s.m11424a((String) null, str, (String) null, -1, 4096, i, i2, -1, c2331k.f9148b, c2331k.f9149c, (List<byte[]>) null, (C2213m) null, 0, (String) null, (this.f8366f & 2) != 0 ? null : this.f8375o));
        }
        return m9298e(interfaceC2289h);
    }

    @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2287g
    /* renamed from: a */
    public void mo9158a() {
    }

    @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2287g
    /* renamed from: a */
    public void mo9159a(long j, long j2) {
        this.f8374n = 0;
        this.f8377q = -9223372036854775807L;
        this.f8378r = 0L;
        this.f8379s = 0;
    }

    @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2287g
    /* renamed from: a */
    public void mo9160a(InterfaceC2325i interfaceC2325i) {
        this.f8372l = interfaceC2325i;
        this.f8373m = this.f8372l.mo9671a(0, 1);
        this.f8372l.mo9672a();
    }

    @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2287g
    /* renamed from: a */
    public boolean mo9161a(InterfaceC2289h interfaceC2289h) {
        return m9293a(interfaceC2289h, true);
    }
}
