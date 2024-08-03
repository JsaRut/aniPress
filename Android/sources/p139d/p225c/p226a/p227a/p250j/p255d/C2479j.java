package p139d.p225c.p226a.p227a.p250j.p255d;

import android.util.Pair;
import java.io.EOFException;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import p139d.p225c.p226a.p227a.C2676s;
import p139d.p225c.p226a.p227a.p231d.C2213m;
import p139d.p225c.p226a.p227a.p234f.C2247d;
import p139d.p225c.p226a.p227a.p234f.C2334n;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2287g;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2289h;
import p139d.p225c.p226a.p227a.p245h.C2353b;
import p139d.p225c.p226a.p227a.p245h.p247b.C2367n;
import p139d.p225c.p226a.p227a.p245h.p247b.C2374u;
import p139d.p225c.p226a.p227a.p250j.p252b.AbstractC2429l;
import p139d.p225c.p226a.p227a.p250j.p255d.p256a.C2465d;
import p139d.p225c.p226a.p227a.p269m.C2600n;
import p139d.p225c.p226a.p227a.p269m.InterfaceC2597k;
import p139d.p225c.p226a.p227a.p270n.C2619F;
import p139d.p225c.p226a.p227a.p270n.C2622I;
import p139d.p225c.p226a.p227a.p270n.C2644u;

/* renamed from: d.c.a.a.j.d.j */
/* loaded from: classes.dex */
public final class C2479j extends AbstractC2429l {

    /* renamed from: j */
    private static final AtomicInteger f9942j = new AtomicInteger();

    /* renamed from: A */
    private InterfaceC2287g f9943A;

    /* renamed from: B */
    private C2483n f9944B;

    /* renamed from: C */
    private int f9945C;

    /* renamed from: D */
    private int f9946D;

    /* renamed from: E */
    private boolean f9947E;

    /* renamed from: F */
    private volatile boolean f9948F;

    /* renamed from: G */
    private boolean f9949G;

    /* renamed from: k */
    public final int f9950k;

    /* renamed from: l */
    public final int f9951l;

    /* renamed from: m */
    public final C2465d.a f9952m;

    /* renamed from: n */
    private final InterfaceC2597k f9953n;

    /* renamed from: o */
    private final C2600n f9954o;

    /* renamed from: p */
    private final boolean f9955p;

    /* renamed from: q */
    private final boolean f9956q;

    /* renamed from: r */
    private final boolean f9957r;

    /* renamed from: s */
    private final C2619F f9958s;

    /* renamed from: t */
    private final boolean f9959t;

    /* renamed from: u */
    private final InterfaceC2477h f9960u;

    /* renamed from: v */
    private final List<C2676s> f9961v;

    /* renamed from: w */
    private final C2213m f9962w;

    /* renamed from: x */
    private final InterfaceC2287g f9963x;

    /* renamed from: y */
    private final C2367n f9964y;

    /* renamed from: z */
    private final C2644u f9965z;

    public C2479j(InterfaceC2477h interfaceC2477h, InterfaceC2597k interfaceC2597k, C2600n c2600n, C2600n c2600n2, C2465d.a aVar, List<C2676s> list, int i, Object obj, long j, long j2, long j3, int i2, boolean z, boolean z2, C2619F c2619f, C2479j c2479j, C2213m c2213m, byte[] bArr, byte[] bArr2) {
        super(m10333a(interfaceC2597k, bArr, bArr2), c2600n, aVar.f9838b, i, obj, j, j2, j3);
        this.f9951l = i2;
        this.f9954o = c2600n2;
        this.f9952m = aVar;
        this.f9956q = z2;
        this.f9958s = c2619f;
        boolean z3 = true;
        this.f9955p = bArr != null;
        this.f9957r = z;
        this.f9960u = interfaceC2477h;
        this.f9961v = list;
        this.f9962w = c2213m;
        InterfaceC2287g interfaceC2287g = null;
        if (c2479j != null) {
            this.f9964y = c2479j.f9964y;
            this.f9965z = c2479j.f9965z;
            if (c2479j.f9952m == aVar && c2479j.f9949G) {
                z3 = false;
            }
            this.f9959t = z3;
            if (c2479j.f9951l == i2 && !this.f9959t) {
                interfaceC2287g = c2479j.f9943A;
            }
        } else {
            this.f9964y = new C2367n();
            this.f9965z = new C2644u(10);
            this.f9959t = false;
        }
        this.f9963x = interfaceC2287g;
        this.f9953n = interfaceC2597k;
        this.f9950k = f9942j.getAndIncrement();
    }

    /* renamed from: a */
    private long m10331a(InterfaceC2289h interfaceC2289h) {
        interfaceC2289h.mo9280b();
        try {
            interfaceC2289h.mo9276a(this.f9965z.f11004a, 0, 10);
            this.f9965z.m11218c(10);
        } catch (EOFException unused) {
        }
        if (this.f9965z.m11241w() != C2367n.f9305b) {
            return -9223372036854775807L;
        }
        this.f9965z.m11224f(3);
        int m11237s = this.f9965z.m11237s();
        int i = m11237s + 10;
        if (i > this.f9965z.m11215b()) {
            C2644u c2644u = this.f9965z;
            byte[] bArr = c2644u.f11004a;
            c2644u.m11218c(i);
            System.arraycopy(bArr, 0, this.f9965z.f11004a, 0, 10);
        }
        interfaceC2289h.mo9276a(this.f9965z.f11004a, 10, m11237s);
        C2353b m9836a = this.f9964y.m9836a(this.f9965z.f11004a, m11237s);
        if (m9836a == null) {
            return -9223372036854775807L;
        }
        int m9810a = m9836a.m9810a();
        for (int i2 = 0; i2 < m9810a; i2++) {
            C2353b.a m9811a = m9836a.m9811a(i2);
            if (m9811a instanceof C2374u) {
                C2374u c2374u = (C2374u) m9811a;
                if ("com.apple.streaming.transportStreamTimestamp".equals(c2374u.f9319a)) {
                    System.arraycopy(c2374u.f9320b, 0, this.f9965z.f11004a, 0, 8);
                    this.f9965z.m11218c(8);
                    return this.f9965z.m11234p() & 8589934591L;
                }
            }
        }
        return -9223372036854775807L;
    }

    /* renamed from: a */
    private C2247d m10332a(InterfaceC2597k interfaceC2597k, C2600n c2600n) {
        C2247d c2247d = new C2247d(interfaceC2597k, c2600n.f10786e, interfaceC2597k.mo9121a(c2600n));
        if (this.f9943A != null) {
            return c2247d;
        }
        long m10331a = m10331a(c2247d);
        c2247d.mo9280b();
        Pair<InterfaceC2287g, Boolean> mo10307a = this.f9960u.mo10307a(this.f9963x, c2600n.f10782a, this.f9513c, this.f9961v, this.f9962w, this.f9958s, interfaceC2597k.mo9122a(), c2247d);
        this.f9943A = (InterfaceC2287g) mo10307a.first;
        boolean z = this.f9943A == this.f9963x;
        if (((Boolean) mo10307a.second).booleanValue()) {
            this.f9944B.m10379d(m10331a != -9223372036854775807L ? this.f9958s.m11022b(m10331a) : this.f9516f);
        }
        this.f9947E = z && this.f9954o != null;
        this.f9944B.m10368a(this.f9950k, this.f9959t, z);
        if (z) {
            return c2247d;
        }
        this.f9943A.mo9160a(this.f9944B);
        return c2247d;
    }

    /* renamed from: a */
    private static InterfaceC2597k m10333a(InterfaceC2597k interfaceC2597k, byte[] bArr, byte[] bArr2) {
        return bArr != null ? new C2472c(interfaceC2597k, bArr, bArr2) : interfaceC2597k;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003f A[Catch: all -> 0x0072, TRY_LEAVE, TryCatch #1 {all -> 0x0072, blocks: (B:10:0x0037, B:12:0x003f, B:20:0x0060, B:26:0x0053, B:27:0x005f, B:16:0x0046, B:18:0x004a), top: B:9:0x0037, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0046 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m10334i() {
        /*
            r8 = this;
            boolean r0 = r8.f9955p
            r1 = 0
            if (r0 == 0) goto Ld
            d.c.a.a.m.n r0 = r8.f9511a
            int r2 = r8.f9946D
            if (r2 == 0) goto L16
            r2 = 1
            goto L17
        Ld:
            d.c.a.a.m.n r0 = r8.f9511a
            int r2 = r8.f9946D
            long r2 = (long) r2
            d.c.a.a.m.n r0 = r0.m10927a(r2)
        L16:
            r2 = 0
        L17:
            boolean r3 = r8.f9956q
            if (r3 != 0) goto L21
            d.c.a.a.n.F r3 = r8.f9958s
            r3.m11026e()
            goto L37
        L21:
            d.c.a.a.n.F r3 = r8.f9958s
            long r3 = r3.m11019a()
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L37
            d.c.a.a.n.F r3 = r8.f9958s
            long r4 = r8.f9516f
            r3.m11025d(r4)
        L37:
            d.c.a.a.m.D r3 = r8.f9518h     // Catch: java.lang.Throwable -> L72
            d.c.a.a.f.d r0 = r8.m10332a(r3, r0)     // Catch: java.lang.Throwable -> L72
            if (r2 == 0) goto L44
            int r2 = r8.f9946D     // Catch: java.lang.Throwable -> L72
            r0.mo9283c(r2)     // Catch: java.lang.Throwable -> L72
        L44:
            if (r1 != 0) goto L60
            boolean r1 = r8.f9948F     // Catch: java.lang.Throwable -> L52
            if (r1 != 0) goto L60
            d.c.a.a.f.g r1 = r8.f9943A     // Catch: java.lang.Throwable -> L52
            r2 = 0
            int r1 = r1.mo9157a(r0, r2)     // Catch: java.lang.Throwable -> L52
            goto L44
        L52:
            r1 = move-exception
            long r2 = r0.getPosition()     // Catch: java.lang.Throwable -> L72
            d.c.a.a.m.n r0 = r8.f9511a     // Catch: java.lang.Throwable -> L72
            long r4 = r0.f10786e     // Catch: java.lang.Throwable -> L72
            long r2 = r2 - r4
            int r0 = (int) r2     // Catch: java.lang.Throwable -> L72
            r8.f9946D = r0     // Catch: java.lang.Throwable -> L72
            throw r1     // Catch: java.lang.Throwable -> L72
        L60:
            long r0 = r0.getPosition()     // Catch: java.lang.Throwable -> L72
            d.c.a.a.m.n r2 = r8.f9511a     // Catch: java.lang.Throwable -> L72
            long r2 = r2.f10786e     // Catch: java.lang.Throwable -> L72
            long r0 = r0 - r2
            int r1 = (int) r0     // Catch: java.lang.Throwable -> L72
            r8.f9946D = r1     // Catch: java.lang.Throwable -> L72
            d.c.a.a.m.D r0 = r8.f9518h
            p139d.p225c.p226a.p227a.p270n.C2622I.m11060a(r0)
            return
        L72:
            r0 = move-exception
            d.c.a.a.m.D r1 = r8.f9518h
            p139d.p225c.p226a.p227a.p270n.C2622I.m11060a(r1)
            throw r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p139d.p225c.p226a.p227a.p250j.p255d.C2479j.m10334i():void");
    }

    /* renamed from: j */
    private void m10335j() {
        C2600n c2600n;
        if (this.f9947E || (c2600n = this.f9954o) == null) {
            return;
        }
        try {
            C2247d m10332a = m10332a(this.f9953n, c2600n.m10927a(this.f9945C));
            int i = 0;
            while (i == 0) {
                try {
                    if (this.f9948F) {
                        break;
                    } else {
                        i = this.f9943A.mo9157a(m10332a, (C2334n) null);
                    }
                } finally {
                    this.f9945C = (int) (m10332a.getPosition() - this.f9954o.f10786e);
                }
            }
            C2622I.m11060a(this.f9953n);
            this.f9947E = true;
        } catch (Throwable th) {
            C2622I.m11060a(this.f9953n);
            throw th;
        }
    }

    @Override // p139d.p225c.p226a.p227a.p269m.C2612z.d
    /* renamed from: a */
    public void mo9973a() {
        m10335j();
        if (this.f9948F) {
            return;
        }
        if (!this.f9957r) {
            m10334i();
        }
        this.f9949G = true;
    }

    /* renamed from: a */
    public void m10336a(C2483n c2483n) {
        this.f9944B = c2483n;
    }

    @Override // p139d.p225c.p226a.p227a.p269m.C2612z.d
    /* renamed from: b */
    public void mo9974b() {
        this.f9948F = true;
    }

    @Override // p139d.p225c.p226a.p227a.p250j.p252b.AbstractC2429l
    /* renamed from: h */
    public boolean mo10033h() {
        return this.f9949G;
    }
}
