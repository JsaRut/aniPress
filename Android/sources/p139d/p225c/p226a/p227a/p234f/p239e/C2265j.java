package p139d.p225c.p226a.p227a.p234f.p239e;

import java.util.ArrayDeque;
import java.util.ArrayList;
import p139d.p225c.p226a.p227a.C2676s;
import p139d.p225c.p226a.p227a.p231d.C2213m;
import p139d.p225c.p226a.p227a.p234f.C2331k;
import p139d.p225c.p226a.p227a.p234f.C2334n;
import p139d.p225c.p226a.p227a.p234f.C2336p;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2287g;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2289h;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2325i;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2330j;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2335o;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2337q;
import p139d.p225c.p226a.p227a.p234f.p239e.AbstractC2258c;
import p139d.p225c.p226a.p227a.p245h.C2353b;
import p139d.p225c.p226a.p227a.p270n.C2622I;
import p139d.p225c.p226a.p227a.p270n.C2642s;
import p139d.p225c.p226a.p227a.p270n.C2644u;

/* renamed from: d.c.a.a.f.e.j */
/* loaded from: classes.dex */
public final class C2265j implements InterfaceC2287g, InterfaceC2335o {

    /* renamed from: a */
    public static final InterfaceC2330j f8627a = new InterfaceC2330j() { // from class: d.c.a.a.f.e.b
        @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2330j
        /* renamed from: a */
        public final InterfaceC2287g[] mo9142a() {
            return C2265j.m9408e();
        }
    };

    /* renamed from: b */
    private static final int f8628b = C2622I.m11078b("qt  ");

    /* renamed from: c */
    private final int f8629c;

    /* renamed from: d */
    private final C2644u f8630d;

    /* renamed from: e */
    private final C2644u f8631e;

    /* renamed from: f */
    private final C2644u f8632f;

    /* renamed from: g */
    private final ArrayDeque<AbstractC2258c.a> f8633g;

    /* renamed from: h */
    private int f8634h;

    /* renamed from: i */
    private int f8635i;

    /* renamed from: j */
    private long f8636j;

    /* renamed from: k */
    private int f8637k;

    /* renamed from: l */
    private C2644u f8638l;

    /* renamed from: m */
    private int f8639m;

    /* renamed from: n */
    private int f8640n;

    /* renamed from: o */
    private int f8641o;

    /* renamed from: p */
    private InterfaceC2325i f8642p;

    /* renamed from: q */
    private a[] f8643q;

    /* renamed from: r */
    private long[][] f8644r;

    /* renamed from: s */
    private int f8645s;

    /* renamed from: t */
    private long f8646t;

    /* renamed from: u */
    private boolean f8647u;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d.c.a.a.f.e.j$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final C2268m f8648a;

        /* renamed from: b */
        public final C2271p f8649b;

        /* renamed from: c */
        public final InterfaceC2337q f8650c;

        /* renamed from: d */
        public int f8651d;

        public a(C2268m c2268m, C2271p c2271p, InterfaceC2337q interfaceC2337q) {
            this.f8648a = c2268m;
            this.f8649b = c2271p;
            this.f8650c = interfaceC2337q;
        }
    }

    public C2265j() {
        this(0);
    }

    public C2265j(int i) {
        this.f8629c = i;
        this.f8632f = new C2644u(16);
        this.f8633g = new ArrayDeque<>();
        this.f8630d = new C2644u(C2642s.f10980a);
        this.f8631e = new C2644u(4);
        this.f8639m = -1;
    }

    /* renamed from: a */
    private static int m9394a(C2271p c2271p, long j) {
        int m9428a = c2271p.m9428a(j);
        return m9428a == -1 ? c2271p.m9429b(j) : m9428a;
    }

    /* renamed from: a */
    private static long m9395a(C2271p c2271p, long j, long j2) {
        int m9394a = m9394a(c2271p, j);
        return m9394a == -1 ? j2 : Math.min(c2271p.f8693c[m9394a], j2);
    }

    /* renamed from: a */
    private ArrayList<C2271p> m9396a(AbstractC2258c.a aVar, C2331k c2331k, boolean z) {
        C2268m m9314a;
        ArrayList<C2271p> arrayList = new ArrayList<>();
        for (int i = 0; i < aVar.f8504Ya.size(); i++) {
            AbstractC2258c.a aVar2 = aVar.f8504Ya.get(i);
            if (aVar2.f8501Va == AbstractC2258c.f8408D && (m9314a = C2259d.m9314a(aVar2, aVar.m9308e(AbstractC2258c.f8406C), -9223372036854775807L, (C2213m) null, z, this.f8647u)) != null) {
                C2271p m9316a = C2259d.m9316a(m9314a, aVar2.m9307d(AbstractC2258c.f8410E).m9307d(AbstractC2258c.f8412F).m9307d(AbstractC2258c.f8414G), c2331k);
                if (m9316a.f8692b != 0) {
                    arrayList.add(m9316a);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private void m9397a(AbstractC2258c.a aVar) {
        C2353b c2353b;
        ArrayList arrayList = new ArrayList();
        C2331k c2331k = new C2331k();
        AbstractC2258c.b m9308e = aVar.m9308e(AbstractC2258c.f8403Aa);
        if (m9308e != null) {
            c2353b = C2259d.m9317a(m9308e, this.f8647u);
            if (c2353b != null) {
                c2331k.m9690a(c2353b);
            }
        } else {
            c2353b = null;
        }
        int i = 1;
        int i2 = 0;
        ArrayList<C2271p> m9396a = m9396a(aVar, c2331k, (this.f8629c & 1) != 0);
        int size = m9396a.size();
        int i3 = -1;
        long j = -9223372036854775807L;
        while (i2 < size) {
            C2271p c2271p = m9396a.get(i2);
            C2268m c2268m = c2271p.f8691a;
            a aVar2 = new a(c2268m, c2271p, this.f8642p.mo9671a(i2, c2268m.f8657b));
            C2676s m11437a = c2268m.f8661f.m11437a(c2271p.f8695e + 30);
            if (c2268m.f8657b == i) {
                if (c2331k.m9688a()) {
                    m11437a = m11437a.m11438a(c2331k.f9148b, c2331k.f9149c);
                }
                if (c2353b != null) {
                    m11437a = m11437a.m11441a(c2353b);
                }
            }
            aVar2.f8650c.mo9433a(m11437a);
            long j2 = c2268m.f8660e;
            if (j2 == -9223372036854775807L) {
                j2 = c2271p.f8698h;
            }
            j = Math.max(j, j2);
            if (c2268m.f8657b == 2 && i3 == -1) {
                i3 = arrayList.size();
            }
            arrayList.add(aVar2);
            i2++;
            i = 1;
        }
        this.f8645s = i3;
        this.f8646t = j;
        this.f8643q = (a[]) arrayList.toArray(new a[arrayList.size()]);
        this.f8644r = m9400a(this.f8643q);
        this.f8642p.mo9672a();
        this.f8642p.mo9673a(this);
    }

    /* renamed from: a */
    private static boolean m9398a(int i) {
        return i == AbstractC2258c.f8404B || i == AbstractC2258c.f8408D || i == AbstractC2258c.f8410E || i == AbstractC2258c.f8412F || i == AbstractC2258c.f8414G || i == AbstractC2258c.f8432P;
    }

    /* renamed from: a */
    private static boolean m9399a(C2644u c2644u) {
        c2644u.m11222e(8);
        if (c2644u.m11226h() == f8628b) {
            return true;
        }
        c2644u.m11224f(4);
        while (c2644u.m11208a() > 0) {
            if (c2644u.m11226h() == f8628b) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private static long[][] m9400a(a[] aVarArr) {
        long[][] jArr = new long[aVarArr.length];
        int[] iArr = new int[aVarArr.length];
        long[] jArr2 = new long[aVarArr.length];
        boolean[] zArr = new boolean[aVarArr.length];
        for (int i = 0; i < aVarArr.length; i++) {
            jArr[i] = new long[aVarArr[i].f8649b.f8692b];
            jArr2[i] = aVarArr[i].f8649b.f8696f[0];
        }
        long j = 0;
        int i2 = 0;
        while (i2 < aVarArr.length) {
            int i3 = -1;
            long j2 = Long.MAX_VALUE;
            for (int i4 = 0; i4 < aVarArr.length; i4++) {
                if (!zArr[i4] && jArr2[i4] <= j2) {
                    j2 = jArr2[i4];
                    i3 = i4;
                }
            }
            int i5 = iArr[i3];
            jArr[i3][i5] = j;
            j += aVarArr[i3].f8649b.f8694d[i5];
            int i6 = i5 + 1;
            iArr[i3] = i6;
            if (i6 < jArr[i3].length) {
                jArr2[i3] = aVarArr[i3].f8649b.f8696f[i6];
            } else {
                zArr[i3] = true;
                i2++;
            }
        }
        return jArr;
    }

    /* renamed from: b */
    private static boolean m9401b(int i) {
        return i == AbstractC2258c.f8436R || i == AbstractC2258c.f8406C || i == AbstractC2258c.f8438S || i == AbstractC2258c.f8440T || i == AbstractC2258c.f8474ma || i == AbstractC2258c.f8476na || i == AbstractC2258c.f8478oa || i == AbstractC2258c.f8434Q || i == AbstractC2258c.f8480pa || i == AbstractC2258c.f8482qa || i == AbstractC2258c.f8484ra || i == AbstractC2258c.f8486sa || i == AbstractC2258c.f8488ta || i == AbstractC2258c.f8430O || i == AbstractC2258c.f8449a || i == AbstractC2258c.f8403Aa;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ed  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean m9402b(p139d.p225c.p226a.p227a.p234f.InterfaceC2289h r9) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p139d.p225c.p226a.p227a.p234f.p239e.C2265j.m9402b(d.c.a.a.f.h):boolean");
    }

    /* renamed from: b */
    private boolean m9403b(InterfaceC2289h interfaceC2289h, C2334n c2334n) {
        boolean z;
        long j = this.f8636j - this.f8637k;
        long position = interfaceC2289h.getPosition() + j;
        C2644u c2644u = this.f8638l;
        if (c2644u != null) {
            interfaceC2289h.readFully(c2644u.f11004a, this.f8637k, (int) j);
            if (this.f8635i == AbstractC2258c.f8449a) {
                this.f8647u = m9399a(this.f8638l);
            } else if (!this.f8633g.isEmpty()) {
                this.f8633g.peek().m9306a(new AbstractC2258c.b(this.f8635i, this.f8638l));
            }
        } else {
            if (j >= 262144) {
                c2334n.f9165a = interfaceC2289h.getPosition() + j;
                z = true;
                m9406d(position);
                return (z || this.f8634h == 2) ? false : true;
            }
            interfaceC2289h.mo9283c((int) j);
        }
        z = false;
        m9406d(position);
        if (z) {
        }
    }

    /* renamed from: c */
    private int m9404c(long j) {
        int i = 0;
        long j2 = Long.MAX_VALUE;
        boolean z = true;
        long j3 = Long.MAX_VALUE;
        int i2 = -1;
        int i3 = -1;
        boolean z2 = true;
        long j4 = Long.MAX_VALUE;
        while (true) {
            a[] aVarArr = this.f8643q;
            if (i >= aVarArr.length) {
                break;
            }
            a aVar = aVarArr[i];
            int i4 = aVar.f8651d;
            C2271p c2271p = aVar.f8649b;
            if (i4 != c2271p.f8692b) {
                long j5 = c2271p.f8693c[i4];
                long j6 = this.f8644r[i][i4];
                long j7 = j5 - j;
                boolean z3 = j7 < 0 || j7 >= 262144;
                if ((!z3 && z2) || (z3 == z2 && j7 < j4)) {
                    z2 = z3;
                    i3 = i;
                    j4 = j7;
                    j3 = j6;
                }
                if (j6 < j2) {
                    z = z3;
                    i2 = i;
                    j2 = j6;
                }
            }
            i++;
        }
        return (j2 == Long.MAX_VALUE || !z || j3 < j2 + 10485760) ? i3 : i2;
    }

    /* renamed from: c */
    private int m9405c(InterfaceC2289h interfaceC2289h, C2334n c2334n) {
        long position = interfaceC2289h.getPosition();
        if (this.f8639m == -1) {
            this.f8639m = m9404c(position);
            if (this.f8639m == -1) {
                return -1;
            }
        }
        a aVar = this.f8643q[this.f8639m];
        InterfaceC2337q interfaceC2337q = aVar.f8650c;
        int i = aVar.f8651d;
        C2271p c2271p = aVar.f8649b;
        long j = c2271p.f8693c[i];
        int i2 = c2271p.f8694d[i];
        long j2 = (j - position) + this.f8640n;
        if (j2 < 0 || j2 >= 262144) {
            c2334n.f9165a = j;
            return 1;
        }
        if (aVar.f8648a.f8662g == 1) {
            j2 += 8;
            i2 -= 8;
        }
        interfaceC2289h.mo9283c((int) j2);
        int i3 = aVar.f8648a.f8665j;
        if (i3 == 0) {
            while (true) {
                int i4 = this.f8640n;
                if (i4 >= i2) {
                    break;
                }
                int mo9430a = interfaceC2337q.mo9430a(interfaceC2289h, i2 - i4, false);
                this.f8640n += mo9430a;
                this.f8641o -= mo9430a;
            }
        } else {
            byte[] bArr = this.f8631e.f11004a;
            bArr[0] = 0;
            bArr[1] = 0;
            bArr[2] = 0;
            int i5 = 4 - i3;
            while (this.f8640n < i2) {
                int i6 = this.f8641o;
                if (i6 == 0) {
                    interfaceC2289h.readFully(this.f8631e.f11004a, i5, i3);
                    this.f8631e.m11222e(0);
                    this.f8641o = this.f8631e.m11242x();
                    this.f8630d.m11222e(0);
                    interfaceC2337q.mo9432a(this.f8630d, 4);
                    this.f8640n += 4;
                    i2 += i5;
                } else {
                    int mo9430a2 = interfaceC2337q.mo9430a(interfaceC2289h, i6, false);
                    this.f8640n += mo9430a2;
                    this.f8641o -= mo9430a2;
                }
            }
        }
        C2271p c2271p2 = aVar.f8649b;
        interfaceC2337q.mo9431a(c2271p2.f8696f[i], c2271p2.f8697g[i], i2, 0, null);
        aVar.f8651d++;
        this.f8639m = -1;
        this.f8640n = 0;
        this.f8641o = 0;
        return 0;
    }

    /* renamed from: d */
    private void m9406d(long j) {
        while (!this.f8633g.isEmpty() && this.f8633g.peek().f8502Wa == j) {
            AbstractC2258c.a pop = this.f8633g.pop();
            if (pop.f8501Va == AbstractC2258c.f8404B) {
                m9397a(pop);
                this.f8633g.clear();
                this.f8634h = 2;
            } else if (!this.f8633g.isEmpty()) {
                this.f8633g.peek().m9305a(pop);
            }
        }
        if (this.f8634h != 2) {
            m9409f();
        }
    }

    /* renamed from: e */
    private void m9407e(long j) {
        for (a aVar : this.f8643q) {
            C2271p c2271p = aVar.f8649b;
            int m9428a = c2271p.m9428a(j);
            if (m9428a == -1) {
                m9428a = c2271p.m9429b(j);
            }
            aVar.f8651d = m9428a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static /* synthetic */ InterfaceC2287g[] m9408e() {
        return new InterfaceC2287g[]{new C2265j()};
    }

    /* renamed from: f */
    private void m9409f() {
        this.f8634h = 0;
        this.f8637k = 0;
    }

    @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2287g
    /* renamed from: a */
    public int mo9157a(InterfaceC2289h interfaceC2289h, C2334n c2334n) {
        while (true) {
            int i = this.f8634h;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        return m9405c(interfaceC2289h, c2334n);
                    }
                    throw new IllegalStateException();
                }
                if (m9403b(interfaceC2289h, c2334n)) {
                    return 1;
                }
            } else if (!m9402b(interfaceC2289h)) {
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
        this.f8633g.clear();
        this.f8637k = 0;
        this.f8639m = -1;
        this.f8640n = 0;
        this.f8641o = 0;
        if (j == 0) {
            m9409f();
        } else if (this.f8643q != null) {
            m9407e(j2);
        }
    }

    @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2287g
    /* renamed from: a */
    public void mo9160a(InterfaceC2325i interfaceC2325i) {
        this.f8642p = interfaceC2325i;
    }

    @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2287g
    /* renamed from: a */
    public boolean mo9161a(InterfaceC2289h interfaceC2289h) {
        return C2267l.m9418b(interfaceC2289h);
    }

    @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2335o
    /* renamed from: b */
    public InterfaceC2335o.a mo9138b(long j) {
        long j2;
        long j3;
        long j4;
        long j5;
        int m9429b;
        a[] aVarArr = this.f8643q;
        if (aVarArr.length == 0) {
            return new InterfaceC2335o.a(C2336p.f9170a);
        }
        int i = this.f8645s;
        if (i != -1) {
            C2271p c2271p = aVarArr[i].f8649b;
            int m9394a = m9394a(c2271p, j);
            if (m9394a == -1) {
                return new InterfaceC2335o.a(C2336p.f9170a);
            }
            long j6 = c2271p.f8696f[m9394a];
            j2 = c2271p.f8693c[m9394a];
            if (j6 >= j || m9394a >= c2271p.f8692b - 1 || (m9429b = c2271p.m9429b(j)) == -1 || m9429b == m9394a) {
                j5 = -1;
                j4 = -9223372036854775807L;
            } else {
                j4 = c2271p.f8696f[m9429b];
                j5 = c2271p.f8693c[m9429b];
            }
            j3 = j5;
            j = j6;
        } else {
            j2 = Long.MAX_VALUE;
            j3 = -1;
            j4 = -9223372036854775807L;
        }
        int i2 = 0;
        while (true) {
            a[] aVarArr2 = this.f8643q;
            if (i2 >= aVarArr2.length) {
                break;
            }
            if (i2 != this.f8645s) {
                C2271p c2271p2 = aVarArr2[i2].f8649b;
                long m9395a = m9395a(c2271p2, j, j2);
                if (j4 != -9223372036854775807L) {
                    j3 = m9395a(c2271p2, j4, j3);
                }
                j2 = m9395a;
            }
            i2++;
        }
        C2336p c2336p = new C2336p(j, j2);
        return j4 == -9223372036854775807L ? new InterfaceC2335o.a(c2336p) : new InterfaceC2335o.a(c2336p, new C2336p(j4, j3));
    }

    @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2335o
    /* renamed from: c */
    public boolean mo9140c() {
        return true;
    }

    @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2335o
    /* renamed from: d */
    public long mo9141d() {
        return this.f8646t;
    }
}
