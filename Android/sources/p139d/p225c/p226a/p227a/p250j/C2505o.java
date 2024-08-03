package p139d.p225c.p226a.p227a.p250j;

import p139d.p225c.p226a.p227a.C2147L;
import p139d.p225c.p226a.p227a.C2676s;
import p139d.p225c.p226a.p227a.C2677t;
import p139d.p225c.p226a.p227a.p230c.C2196f;
import p139d.p225c.p226a.p227a.p250j.InterfaceC2514x;
import p139d.p225c.p226a.p227a.p268l.InterfaceC2577k;
import p139d.p225c.p226a.p227a.p270n.C2622I;
import p139d.p225c.p226a.p227a.p270n.C2628e;
import p139d.p225c.p226a.p227a.p270n.C2641r;

/* renamed from: d.c.a.a.j.o */
/* loaded from: classes.dex */
public final class C2505o implements InterfaceC2514x, InterfaceC2514x.a {

    /* renamed from: a */
    public final InterfaceC2514x f10184a;

    /* renamed from: b */
    private InterfaceC2514x.a f10185b;

    /* renamed from: c */
    private a[] f10186c = new a[0];

    /* renamed from: d */
    private long f10187d;

    /* renamed from: e */
    long f10188e;

    /* renamed from: f */
    long f10189f;

    /* renamed from: d.c.a.a.j.o$a */
    /* loaded from: classes.dex */
    private final class a implements InterfaceC2404E {

        /* renamed from: a */
        public final InterfaceC2404E f10190a;

        /* renamed from: b */
        private boolean f10191b;

        public a(InterfaceC2404E interfaceC2404E) {
            this.f10190a = interfaceC2404E;
        }

        @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2404E
        /* renamed from: a */
        public int mo9960a(C2677t c2677t, C2196f c2196f, boolean z) {
            if (C2505o.this.m10440a()) {
                return -3;
            }
            if (this.f10191b) {
                c2196f.m9012e(4);
                return -4;
            }
            int mo9960a = this.f10190a.mo9960a(c2677t, c2196f, z);
            if (mo9960a == -5) {
                C2676s c2676s = c2677t.f11202a;
                if (c2676s.f11198w != 0 || c2676s.f11199x != 0) {
                    c2677t.f11202a = c2676s.m11438a(C2505o.this.f10188e != 0 ? 0 : c2676s.f11198w, C2505o.this.f10189f == Long.MIN_VALUE ? c2676s.f11199x : 0);
                }
                return -5;
            }
            long j = C2505o.this.f10189f;
            if (j == Long.MIN_VALUE || ((mo9960a != -4 || c2196f.f8041d < j) && !(mo9960a == -3 && C2505o.this.mo9887g() == Long.MIN_VALUE))) {
                return mo9960a;
            }
            c2196f.mo9006b();
            c2196f.m9012e(4);
            this.f10191b = true;
            return -4;
        }

        @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2404E
        /* renamed from: a */
        public void mo9961a() {
            this.f10190a.mo9961a();
        }

        /* renamed from: b */
        public void m10442b() {
            this.f10191b = false;
        }

        @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2404E
        /* renamed from: c */
        public boolean mo9962c() {
            return !C2505o.this.m10440a() && this.f10190a.mo9962c();
        }

        @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2404E
        /* renamed from: d */
        public int mo9963d(long j) {
            if (C2505o.this.m10440a()) {
                return -3;
            }
            return this.f10190a.mo9963d(j);
        }
    }

    public C2505o(InterfaceC2514x interfaceC2514x, boolean z, long j, long j2) {
        this.f10184a = interfaceC2514x;
        this.f10187d = z ? j : -9223372036854775807L;
        this.f10188e = j;
        this.f10189f = j2;
    }

    /* renamed from: a */
    private static boolean m10438a(long j, InterfaceC2577k[] interfaceC2577kArr) {
        if (j != 0) {
            for (InterfaceC2577k interfaceC2577k : interfaceC2577kArr) {
                if (interfaceC2577k != null && !C2641r.m11172g(interfaceC2577k.mo10824f().f11182g)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    private C2147L m10439b(long j, C2147L c2147l) {
        long m11081b = C2622I.m11081b(c2147l.f7666f, 0L, j - this.f10188e);
        long j2 = c2147l.f7667g;
        long j3 = this.f10189f;
        long m11081b2 = C2622I.m11081b(j2, 0L, j3 == Long.MIN_VALUE ? Long.MAX_VALUE : j3 - j);
        return (m11081b == c2147l.f7666f && m11081b2 == c2147l.f7667g) ? c2147l : new C2147L(m11081b, m11081b2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0032, code lost:            if (r0 > r7) goto L17;     */
    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2514x
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long mo9874a(long r7) {
        /*
            r6 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6.f10187d = r0
            d.c.a.a.j.o$a[] r0 = r6.f10186c
            int r1 = r0.length
            r2 = 0
            r3 = 0
        Lc:
            if (r3 >= r1) goto L18
            r4 = r0[r3]
            if (r4 == 0) goto L15
            r4.m10442b()
        L15:
            int r3 = r3 + 1
            goto Lc
        L18:
            d.c.a.a.j.x r0 = r6.f10184a
            long r0 = r0.mo9874a(r7)
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 == 0) goto L34
            long r7 = r6.f10188e
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 < 0) goto L35
            long r7 = r6.f10189f
            r3 = -9223372036854775808
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 == 0) goto L34
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 > 0) goto L35
        L34:
            r2 = 1
        L35:
            p139d.p225c.p226a.p227a.p270n.C2628e.m11113b(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p139d.p225c.p226a.p227a.p250j.C2505o.mo9874a(long):long");
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2514x
    /* renamed from: a */
    public long mo9875a(long j, C2147L c2147l) {
        long j2 = this.f10188e;
        if (j == j2) {
            return j2;
        }
        return this.f10184a.mo9875a(j, m10439b(j, c2147l));
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0062, code lost:            if (r2 > r4) goto L26;     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006e  */
    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2514x
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long mo9876a(p139d.p225c.p226a.p227a.p268l.InterfaceC2577k[] r13, boolean[] r14, p139d.p225c.p226a.p227a.p250j.InterfaceC2404E[] r15, boolean[] r16, long r17) {
        /*
            r12 = this;
            r0 = r12
            r1 = r15
            int r2 = r1.length
            d.c.a.a.j.o$a[] r2 = new p139d.p225c.p226a.p227a.p250j.C2505o.a[r2]
            r0.f10186c = r2
            int r2 = r1.length
            d.c.a.a.j.E[] r9 = new p139d.p225c.p226a.p227a.p250j.InterfaceC2404E[r2]
            r10 = 0
            r2 = 0
        Lc:
            int r3 = r1.length
            r11 = 0
            if (r2 >= r3) goto L25
            d.c.a.a.j.o$a[] r3 = r0.f10186c
            r4 = r1[r2]
            d.c.a.a.j.o$a r4 = (p139d.p225c.p226a.p227a.p250j.C2505o.a) r4
            r3[r2] = r4
            r4 = r3[r2]
            if (r4 == 0) goto L20
            r3 = r3[r2]
            d.c.a.a.j.E r11 = r3.f10190a
        L20:
            r9[r2] = r11
            int r2 = r2 + 1
            goto Lc
        L25:
            d.c.a.a.j.x r2 = r0.f10184a
            r3 = r13
            r4 = r14
            r5 = r9
            r6 = r16
            r7 = r17
            long r2 = r2.mo9876a(r3, r4, r5, r6, r7)
            boolean r4 = r12.m10440a()
            if (r4 == 0) goto L47
            long r4 = r0.f10188e
            int r6 = (r17 > r4 ? 1 : (r17 == r4 ? 0 : -1))
            if (r6 != 0) goto L47
            r6 = r13
            boolean r4 = m10438a(r4, r13)
            if (r4 == 0) goto L47
            r4 = r2
            goto L4c
        L47:
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L4c:
            r0.f10187d = r4
            int r4 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r4 == 0) goto L67
            long r4 = r0.f10188e
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 < 0) goto L65
            long r4 = r0.f10189f
            r6 = -9223372036854775808
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L67
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 > 0) goto L65
            goto L67
        L65:
            r4 = 0
            goto L68
        L67:
            r4 = 1
        L68:
            p139d.p225c.p226a.p227a.p270n.C2628e.m11113b(r4)
        L6b:
            int r4 = r1.length
            if (r10 >= r4) goto L99
            r4 = r9[r10]
            if (r4 != 0) goto L77
            d.c.a.a.j.o$a[] r4 = r0.f10186c
            r4[r10] = r11
            goto L90
        L77:
            r4 = r1[r10]
            if (r4 == 0) goto L85
            d.c.a.a.j.o$a[] r4 = r0.f10186c
            r4 = r4[r10]
            d.c.a.a.j.E r4 = r4.f10190a
            r5 = r9[r10]
            if (r4 == r5) goto L90
        L85:
            d.c.a.a.j.o$a[] r4 = r0.f10186c
            d.c.a.a.j.o$a r5 = new d.c.a.a.j.o$a
            r6 = r9[r10]
            r5.<init>(r6)
            r4[r10] = r5
        L90:
            d.c.a.a.j.o$a[] r4 = r0.f10186c
            r4 = r4[r10]
            r1[r10] = r4
            int r10 = r10 + 1
            goto L6b
        L99:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p139d.p225c.p226a.p227a.p250j.C2505o.mo9876a(d.c.a.a.l.k[], boolean[], d.c.a.a.j.E[], boolean[], long):long");
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2514x
    /* renamed from: a */
    public void mo9877a(long j, boolean z) {
        this.f10184a.mo9877a(j, z);
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2514x
    /* renamed from: a */
    public void mo9879a(InterfaceC2514x.a aVar, long j) {
        this.f10185b = aVar;
        this.f10184a.mo9879a(this, j);
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2514x.a
    /* renamed from: a, reason: avoid collision after fix types in other method */
    public void mo10485a(InterfaceC2514x interfaceC2514x) {
        this.f10185b.mo10485a((InterfaceC2514x) this);
    }

    /* renamed from: a */
    boolean m10440a() {
        return this.f10187d != -9223372036854775807L;
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2514x, p139d.p225c.p226a.p227a.p250j.InterfaceC2405F
    /* renamed from: b */
    public long mo9880b() {
        long mo9880b = this.f10184a.mo9880b();
        if (mo9880b != Long.MIN_VALUE) {
            long j = this.f10189f;
            if (j == Long.MIN_VALUE || mo9880b < j) {
                return mo9880b;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2405F.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo9878a(InterfaceC2514x interfaceC2514x) {
        this.f10185b.mo9878a((InterfaceC2514x.a) this);
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2514x, p139d.p225c.p226a.p227a.p250j.InterfaceC2405F
    /* renamed from: b */
    public boolean mo9882b(long j) {
        return this.f10184a.mo9882b(j);
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2514x, p139d.p225c.p226a.p227a.p250j.InterfaceC2405F
    /* renamed from: c */
    public void mo9883c(long j) {
        this.f10184a.mo9883c(j);
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2514x
    /* renamed from: d */
    public void mo9884d() {
        this.f10184a.mo9884d();
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2514x
    /* renamed from: e */
    public long mo9885e() {
        if (m10440a()) {
            long j = this.f10187d;
            this.f10187d = -9223372036854775807L;
            long mo9885e = mo9885e();
            return mo9885e != -9223372036854775807L ? mo9885e : j;
        }
        long mo9885e2 = this.f10184a.mo9885e();
        if (mo9885e2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        boolean z = true;
        C2628e.m11113b(mo9885e2 >= this.f10188e);
        long j2 = this.f10189f;
        if (j2 != Long.MIN_VALUE && mo9885e2 > j2) {
            z = false;
        }
        C2628e.m11113b(z);
        return mo9885e2;
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2514x
    /* renamed from: f */
    public C2413N mo9886f() {
        return this.f10184a.mo9886f();
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2514x, p139d.p225c.p226a.p227a.p250j.InterfaceC2405F
    /* renamed from: g */
    public long mo9887g() {
        long mo9887g = this.f10184a.mo9887g();
        if (mo9887g != Long.MIN_VALUE) {
            long j = this.f10189f;
            if (j == Long.MIN_VALUE || mo9887g < j) {
                return mo9887g;
            }
        }
        return Long.MIN_VALUE;
    }
}
