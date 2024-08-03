package p139d.p225c.p226a.p227a.p250j;

import p139d.p225c.p226a.p227a.AbstractC2151P;
import p139d.p225c.p226a.p227a.p270n.C2628e;

/* renamed from: d.c.a.a.j.G */
/* loaded from: classes.dex */
public final class C2406G extends AbstractC2151P {

    /* renamed from: b */
    private static final Object f9440b = new Object();

    /* renamed from: c */
    private final long f9441c;

    /* renamed from: d */
    private final long f9442d;

    /* renamed from: e */
    private final long f9443e;

    /* renamed from: f */
    private final long f9444f;

    /* renamed from: g */
    private final long f9445g;

    /* renamed from: h */
    private final long f9446h;

    /* renamed from: i */
    private final boolean f9447i;

    /* renamed from: j */
    private final boolean f9448j;

    /* renamed from: k */
    private final Object f9449k;

    public C2406G(long j, long j2, long j3, long j4, long j5, long j6, boolean z, boolean z2, Object obj) {
        this.f9441c = j;
        this.f9442d = j2;
        this.f9443e = j3;
        this.f9444f = j4;
        this.f9445g = j5;
        this.f9446h = j6;
        this.f9447i = z;
        this.f9448j = z2;
        this.f9449k = obj;
    }

    public C2406G(long j, long j2, long j3, long j4, boolean z, boolean z2, Object obj) {
        this(-9223372036854775807L, -9223372036854775807L, j, j2, j3, j4, z, z2, obj);
    }

    public C2406G(long j, boolean z, boolean z2, Object obj) {
        this(j, j, 0L, 0L, z, z2, obj);
    }

    @Override // p139d.p225c.p226a.p227a.AbstractC2151P
    /* renamed from: a */
    public int mo8636a() {
        return 1;
    }

    @Override // p139d.p225c.p226a.p227a.AbstractC2151P
    /* renamed from: a */
    public int mo8637a(Object obj) {
        return f9440b.equals(obj) ? 0 : -1;
    }

    @Override // p139d.p225c.p226a.p227a.AbstractC2151P
    /* renamed from: a */
    public AbstractC2151P.a mo8638a(int i, AbstractC2151P.a aVar, boolean z) {
        C2628e.m11109a(i, 0, 1);
        aVar.m8659a(null, z ? f9440b : null, 0, this.f9443e, -this.f9445g);
        return aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002d, code lost:            if (r1 > r7) goto L12;     */
    @Override // p139d.p225c.p226a.p227a.AbstractC2151P
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p139d.p225c.p226a.p227a.AbstractC2151P.b mo8639a(int r19, p139d.p225c.p226a.p227a.AbstractC2151P.b r20, boolean r21, long r22) {
        /*
            r18 = this;
            r0 = r18
            r1 = 0
            r2 = 1
            r3 = r19
            p139d.p225c.p226a.p227a.p270n.C2628e.m11109a(r3, r1, r2)
            if (r21 == 0) goto Le
            java.lang.Object r1 = r0.f9449k
            goto Lf
        Le:
            r1 = 0
        Lf:
            r3 = r1
            long r1 = r0.f9446h
            boolean r4 = r0.f9448j
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 == 0) goto L30
            r7 = 0
            int r4 = (r22 > r7 ? 1 : (r22 == r7 ? 0 : -1))
            if (r4 == 0) goto L30
            long r7 = r0.f9444f
            int r4 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r4 != 0) goto L29
        L27:
            r10 = r5
            goto L31
        L29:
            long r1 = r1 + r22
            int r4 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r4 <= 0) goto L30
            goto L27
        L30:
            r10 = r1
        L31:
            long r4 = r0.f9441c
            long r6 = r0.f9442d
            boolean r8 = r0.f9447i
            boolean r9 = r0.f9448j
            long r12 = r0.f9444f
            r14 = 0
            r15 = 0
            long r1 = r0.f9445g
            r16 = r1
            r2 = r20
            r2.m8672a(r3, r4, r6, r8, r9, r10, r12, r14, r15, r16)
            return r20
        */
        throw new UnsupportedOperationException("Method not decompiled: p139d.p225c.p226a.p227a.p250j.C2406G.mo8639a(int, d.c.a.a.P$b, boolean, long):d.c.a.a.P$b");
    }

    @Override // p139d.p225c.p226a.p227a.AbstractC2151P
    /* renamed from: a */
    public Object mo8640a(int i) {
        C2628e.m11109a(i, 0, 1);
        return f9440b;
    }

    @Override // p139d.p225c.p226a.p227a.AbstractC2151P
    /* renamed from: b */
    public int mo8641b() {
        return 1;
    }
}
