package p139d.p225c.p226a.p227a.p234f.p242h;

import p139d.p225c.p226a.p227a.p234f.C2334n;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2287g;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2289h;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2325i;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2330j;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2335o;
import p139d.p225c.p226a.p227a.p234f.p242h.InterfaceC2296G;
import p139d.p225c.p226a.p227a.p270n.C2622I;
import p139d.p225c.p226a.p227a.p270n.C2644u;

/* renamed from: d.c.a.a.f.h.e */
/* loaded from: classes.dex */
public final class C2303e implements InterfaceC2287g {

    /* renamed from: a */
    public static final InterfaceC2330j f8873a = C2299a.f8869a;

    /* renamed from: b */
    private static final int f8874b = C2622I.m11078b("ID3");

    /* renamed from: c */
    private final long f8875c;

    /* renamed from: d */
    private final C2304f f8876d;

    /* renamed from: e */
    private final C2644u f8877e;

    /* renamed from: f */
    private boolean f8878f;

    public C2303e() {
        this(0L);
    }

    public C2303e(long j) {
        this.f8875c = j;
        this.f8876d = new C2304f();
        this.f8877e = new C2644u(2786);
    }

    /* renamed from: b */
    public static /* synthetic */ InterfaceC2287g[] m9556b() {
        return new InterfaceC2287g[]{new C2303e()};
    }

    @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2287g
    /* renamed from: a */
    public int mo9157a(InterfaceC2289h interfaceC2289h, C2334n c2334n) {
        int read = interfaceC2289h.read(this.f8877e.f11004a, 0, 2786);
        if (read == -1) {
            return -1;
        }
        this.f8877e.m11222e(0);
        this.f8877e.m11220d(read);
        if (!this.f8878f) {
            this.f8876d.mo9561a(this.f8875c, 4);
            this.f8878f = true;
        }
        this.f8876d.mo9563a(this.f8877e);
        return 0;
    }

    @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2287g
    /* renamed from: a */
    public void mo9158a() {
    }

    @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2287g
    /* renamed from: a */
    public void mo9159a(long j, long j2) {
        this.f8878f = false;
        this.f8876d.mo9560a();
    }

    @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2287g
    /* renamed from: a */
    public void mo9160a(InterfaceC2325i interfaceC2325i) {
        this.f8876d.mo9562a(interfaceC2325i, new InterfaceC2296G.d(0, 1));
        interfaceC2325i.mo9672a();
        interfaceC2325i.mo9673a(new InterfaceC2335o.b(-9223372036854775807L));
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0032, code lost:            r8.mo9280b();        r4 = r4 + 1;     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003b, code lost:            if ((r4 - r3) < 8192) goto L64;     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003d, code lost:            return false;     */
    @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2287g
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean mo9161a(p139d.p225c.p226a.p227a.p234f.InterfaceC2289h r8) {
        /*
            r7 = this;
            d.c.a.a.n.u r0 = new d.c.a.a.n.u
            r1 = 10
            r0.<init>(r1)
            r2 = 0
            r3 = 0
        L9:
            byte[] r4 = r0.f11004a
            r8.mo9276a(r4, r2, r1)
            r0.m11222e(r2)
            int r4 = r0.m11241w()
            int r5 = p139d.p225c.p226a.p227a.p234f.p242h.C2303e.f8874b
            if (r4 == r5) goto L58
            r8.mo9280b()
            r8.mo9275a(r3)
            r4 = r3
        L20:
            r1 = 0
        L21:
            byte[] r5 = r0.f11004a
            r6 = 6
            r8.mo9276a(r5, r2, r6)
            r0.m11222e(r2)
            int r5 = r0.m11244z()
            r6 = 2935(0xb77, float:4.113E-42)
            if (r5 == r6) goto L42
            r8.mo9280b()
            int r4 = r4 + 1
            int r1 = r4 - r3
            r5 = 8192(0x2000, float:1.148E-41)
            if (r1 < r5) goto L3e
            return r2
        L3e:
            r8.mo9275a(r4)
            goto L20
        L42:
            r5 = 1
            int r1 = r1 + r5
            r6 = 4
            if (r1 < r6) goto L48
            return r5
        L48:
            byte[] r5 = r0.f11004a
            int r5 = p139d.p225c.p226a.p227a.p229b.C2171h.m8851a(r5)
            r6 = -1
            if (r5 != r6) goto L52
            return r2
        L52:
            int r5 = r5 + (-6)
            r8.mo9275a(r5)
            goto L21
        L58:
            r4 = 3
            r0.m11224f(r4)
            int r4 = r0.m11237s()
            int r5 = r4 + 10
            int r3 = r3 + r5
            r8.mo9275a(r4)
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: p139d.p225c.p226a.p227a.p234f.p242h.C2303e.mo9161a(d.c.a.a.f.h):boolean");
    }
}
