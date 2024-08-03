package p139d.p225c.p226a.p227a.p234f.p242h;

import p139d.p225c.p226a.p227a.p234f.InterfaceC2325i;
import p139d.p225c.p226a.p227a.p234f.p242h.InterfaceC2296G;
import p139d.p225c.p226a.p227a.p270n.C2619F;
import p139d.p225c.p226a.p227a.p270n.C2638o;
import p139d.p225c.p226a.p227a.p270n.C2643t;
import p139d.p225c.p226a.p227a.p270n.C2644u;

/* renamed from: d.c.a.a.f.h.u */
/* loaded from: classes.dex */
public final class C2319u implements InterfaceC2296G {

    /* renamed from: a */
    private final InterfaceC2310l f9088a;

    /* renamed from: b */
    private final C2643t f9089b = new C2643t(new byte[10]);

    /* renamed from: c */
    private int f9090c = 0;

    /* renamed from: d */
    private int f9091d;

    /* renamed from: e */
    private C2619F f9092e;

    /* renamed from: f */
    private boolean f9093f;

    /* renamed from: g */
    private boolean f9094g;

    /* renamed from: h */
    private boolean f9095h;

    /* renamed from: i */
    private int f9096i;

    /* renamed from: j */
    private int f9097j;

    /* renamed from: k */
    private boolean f9098k;

    /* renamed from: l */
    private long f9099l;

    public C2319u(InterfaceC2310l interfaceC2310l) {
        this.f9088a = interfaceC2310l;
    }

    /* renamed from: a */
    private void m9644a(int i) {
        this.f9090c = i;
        this.f9091d = 0;
    }

    /* renamed from: a */
    private boolean m9645a(C2644u c2644u, byte[] bArr, int i) {
        int min = Math.min(c2644u.m11208a(), i - this.f9091d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            c2644u.m11224f(min);
        } else {
            c2644u.m11214a(bArr, this.f9091d, min);
        }
        this.f9091d += min;
        return this.f9091d == i;
    }

    /* renamed from: b */
    private boolean m9646b() {
        this.f9089b.m11198b(0);
        int m11191a = this.f9089b.m11191a(24);
        if (m11191a != 1) {
            C2638o.m11160d("PesReader", "Unexpected start code prefix: " + m11191a);
            this.f9097j = -1;
            return false;
        }
        this.f9089b.m11201c(8);
        int m11191a2 = this.f9089b.m11191a(16);
        this.f9089b.m11201c(5);
        this.f9098k = this.f9089b.m11204e();
        this.f9089b.m11201c(2);
        this.f9093f = this.f9089b.m11204e();
        this.f9094g = this.f9089b.m11204e();
        this.f9089b.m11201c(6);
        this.f9096i = this.f9089b.m11191a(8);
        if (m11191a2 == 0) {
            this.f9097j = -1;
        } else {
            this.f9097j = ((m11191a2 + 6) - 9) - this.f9096i;
        }
        return true;
    }

    /* renamed from: c */
    private void m9647c() {
        this.f9089b.m11198b(0);
        this.f9099l = -9223372036854775807L;
        if (this.f9093f) {
            this.f9089b.m11201c(4);
            this.f9089b.m11201c(1);
            this.f9089b.m11201c(1);
            long m11191a = (this.f9089b.m11191a(3) << 30) | (this.f9089b.m11191a(15) << 15) | this.f9089b.m11191a(15);
            this.f9089b.m11201c(1);
            if (!this.f9095h && this.f9094g) {
                this.f9089b.m11201c(4);
                this.f9089b.m11201c(1);
                this.f9089b.m11201c(1);
                this.f9089b.m11201c(1);
                this.f9092e.m11022b((this.f9089b.m11191a(3) << 30) | (this.f9089b.m11191a(15) << 15) | this.f9089b.m11191a(15));
                this.f9095h = true;
            }
            this.f9099l = this.f9092e.m11022b(m11191a);
        }
    }

    @Override // p139d.p225c.p226a.p227a.p234f.p242h.InterfaceC2296G
    /* renamed from: a */
    public final void mo9503a() {
        this.f9090c = 0;
        this.f9091d = 0;
        this.f9095h = false;
        this.f9088a.mo9560a();
    }

    @Override // p139d.p225c.p226a.p227a.p234f.p242h.InterfaceC2296G
    /* renamed from: a */
    public void mo9504a(C2619F c2619f, InterfaceC2325i interfaceC2325i, InterfaceC2296G.d dVar) {
        this.f9092e = c2619f;
        this.f9088a.mo9562a(interfaceC2325i, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0048  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0077 -> B:12:0x0079). Please report as a decompilation issue!!! */
    @Override // p139d.p225c.p226a.p227a.p234f.p242h.InterfaceC2296G
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo9505a(p139d.p225c.p226a.p227a.p270n.C2644u r8, int r9) {
        /*
            r7 = this;
            r0 = r9 & 1
            r1 = -1
            r2 = 3
            r3 = 2
            r4 = 1
            if (r0 == 0) goto L42
            int r0 = r7.f9090c
            if (r0 == 0) goto L3f
            if (r0 == r4) goto L3f
            java.lang.String r5 = "PesReader"
            if (r0 == r3) goto L3a
            if (r0 != r2) goto L34
            int r0 = r7.f9097j
            if (r0 == r1) goto L79
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r6 = "Unexpected start indicator: expected "
            r0.append(r6)
            int r6 = r7.f9097j
            r0.append(r6)
            java.lang.String r6 = " more bytes"
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            p139d.p225c.p226a.p227a.p270n.C2638o.m11160d(r5, r0)
            goto L79
        L34:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>()
            throw r8
        L3a:
            java.lang.String r0 = "Unexpected start indicator reading extended header"
            p139d.p225c.p226a.p227a.p270n.C2638o.m11160d(r5, r0)
        L3f:
            r7.m9644a(r4)
        L42:
            int r0 = r8.m11208a()
            if (r0 <= 0) goto Ld5
            int r0 = r7.f9090c
            if (r0 == 0) goto Lcc
            r5 = 0
            if (r0 == r4) goto Lb4
            if (r0 == r3) goto L85
            if (r0 != r2) goto L7f
            int r0 = r8.m11208a()
            int r6 = r7.f9097j
            if (r6 != r1) goto L5c
            goto L5e
        L5c:
            int r5 = r0 - r6
        L5e:
            if (r5 <= 0) goto L69
            int r0 = r0 - r5
            int r5 = r8.m11217c()
            int r5 = r5 + r0
            r8.m11220d(r5)
        L69:
            d.c.a.a.f.h.l r5 = r7.f9088a
            r5.mo9563a(r8)
            int r5 = r7.f9097j
            if (r5 == r1) goto L42
            int r5 = r5 - r0
            r7.f9097j = r5
            int r0 = r7.f9097j
            if (r0 != 0) goto L42
        L79:
            d.c.a.a.f.h.l r0 = r7.f9088a
            r0.mo9564b()
            goto L3f
        L7f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>()
            throw r8
        L85:
            r0 = 10
            int r6 = r7.f9096i
            int r0 = java.lang.Math.min(r0, r6)
            d.c.a.a.n.t r6 = r7.f9089b
            byte[] r6 = r6.f11000a
            boolean r0 = r7.m9645a(r8, r6, r0)
            if (r0 == 0) goto L42
            r0 = 0
            int r6 = r7.f9096i
            boolean r0 = r7.m9645a(r8, r0, r6)
            if (r0 == 0) goto L42
            r7.m9647c()
            boolean r0 = r7.f9098k
            if (r0 == 0) goto La8
            r5 = 4
        La8:
            r9 = r9 | r5
            d.c.a.a.f.h.l r0 = r7.f9088a
            long r5 = r7.f9099l
            r0.mo9561a(r5, r9)
            r7.m9644a(r2)
            goto L42
        Lb4:
            d.c.a.a.n.t r0 = r7.f9089b
            byte[] r0 = r0.f11000a
            r6 = 9
            boolean r0 = r7.m9645a(r8, r0, r6)
            if (r0 == 0) goto L42
            boolean r0 = r7.m9646b()
            if (r0 == 0) goto Lc7
            r5 = 2
        Lc7:
            r7.m9644a(r5)
            goto L42
        Lcc:
            int r0 = r8.m11208a()
            r8.m11224f(r0)
            goto L42
        Ld5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p139d.p225c.p226a.p227a.p234f.p242h.C2319u.mo9505a(d.c.a.a.n.u, int):void");
    }
}
