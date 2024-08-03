package p139d.p225c.p226a.p227a.p250j;

import p139d.p225c.p226a.p227a.C2676s;
import p139d.p225c.p226a.p227a.C2677t;
import p139d.p225c.p226a.p227a.p230c.C2196f;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2337q;
import p139d.p225c.p226a.p227a.p270n.C2622I;
import p139d.p225c.p226a.p227a.p270n.C2628e;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: d.c.a.a.j.C */
/* loaded from: classes.dex */
public final class C2402C {

    /* renamed from: a */
    private int f9399a = 1000;

    /* renamed from: b */
    private int[] f9400b;

    /* renamed from: c */
    private long[] f9401c;

    /* renamed from: d */
    private int[] f9402d;

    /* renamed from: e */
    private int[] f9403e;

    /* renamed from: f */
    private long[] f9404f;

    /* renamed from: g */
    private InterfaceC2337q.a[] f9405g;

    /* renamed from: h */
    private C2676s[] f9406h;

    /* renamed from: i */
    private int f9407i;

    /* renamed from: j */
    private int f9408j;

    /* renamed from: k */
    private int f9409k;

    /* renamed from: l */
    private int f9410l;

    /* renamed from: m */
    private long f9411m;

    /* renamed from: n */
    private long f9412n;

    /* renamed from: o */
    private boolean f9413o;

    /* renamed from: p */
    private boolean f9414p;

    /* renamed from: q */
    private C2676s f9415q;

    /* renamed from: r */
    private int f9416r;

    /* renamed from: d.c.a.a.j.C$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public int f9417a;

        /* renamed from: b */
        public long f9418b;

        /* renamed from: c */
        public InterfaceC2337q.a f9419c;
    }

    public C2402C() {
        int i = this.f9399a;
        this.f9400b = new int[i];
        this.f9401c = new long[i];
        this.f9404f = new long[i];
        this.f9403e = new int[i];
        this.f9402d = new int[i];
        this.f9405g = new InterfaceC2337q.a[i];
        this.f9406h = new C2676s[i];
        this.f9411m = Long.MIN_VALUE;
        this.f9412n = Long.MIN_VALUE;
        this.f9414p = true;
        this.f9413o = true;
    }

    /* renamed from: a */
    private int m9897a(int i, int i2, long j, boolean z) {
        int i3 = i;
        int i4 = -1;
        for (int i5 = 0; i5 < i2 && this.f9404f[i3] <= j; i5++) {
            if (!z || (this.f9403e[i3] & 1) != 0) {
                i4 = i5;
            }
            i3++;
            if (i3 == this.f9399a) {
                i3 = 0;
            }
        }
        return i4;
    }

    /* renamed from: d */
    private long m9898d(int i) {
        this.f9411m = Math.max(this.f9411m, m9899e(i));
        this.f9407i -= i;
        this.f9408j += i;
        this.f9409k += i;
        int i2 = this.f9409k;
        int i3 = this.f9399a;
        if (i2 >= i3) {
            this.f9409k = i2 - i3;
        }
        this.f9410l -= i;
        if (this.f9410l < 0) {
            this.f9410l = 0;
        }
        if (this.f9407i != 0) {
            return this.f9401c[this.f9409k];
        }
        int i4 = this.f9409k;
        if (i4 == 0) {
            i4 = this.f9399a;
        }
        return this.f9401c[i4 - 1] + this.f9402d[r6];
    }

    /* renamed from: e */
    private long m9899e(int i) {
        long j = Long.MIN_VALUE;
        if (i == 0) {
            return Long.MIN_VALUE;
        }
        int m9900f = m9900f(i - 1);
        for (int i2 = 0; i2 < i; i2++) {
            j = Math.max(j, this.f9404f[m9900f]);
            if ((this.f9403e[m9900f] & 1) != 0) {
                break;
            }
            m9900f--;
            if (m9900f == -1) {
                m9900f = this.f9399a - 1;
            }
        }
        return j;
    }

    /* renamed from: f */
    private int m9900f(int i) {
        int i2 = this.f9409k + i;
        int i3 = this.f9399a;
        return i2 < i3 ? i2 : i2 - i3;
    }

    /* renamed from: a */
    public synchronized int m9901a() {
        int i;
        i = this.f9407i - this.f9410l;
        this.f9410l = this.f9407i;
        return i;
    }

    /* renamed from: a */
    public synchronized int m9902a(long j, boolean z, boolean z2) {
        int m9900f = m9900f(this.f9410l);
        if (m9921j() && j >= this.f9404f[m9900f] && (j <= this.f9412n || z2)) {
            int m9897a = m9897a(m9900f, this.f9407i - this.f9410l, j, z);
            if (m9897a == -1) {
                return -1;
            }
            this.f9410l += m9897a;
            return m9897a;
        }
        return -1;
    }

    /* renamed from: a */
    public synchronized int m9903a(C2677t c2677t, C2196f c2196f, boolean z, boolean z2, C2676s c2676s, a aVar) {
        if (!m9921j()) {
            if (z2) {
                c2196f.m9012e(4);
                return -4;
            }
            if (this.f9415q == null || (!z && this.f9415q == c2676s)) {
                return -3;
            }
            c2677t.f11202a = this.f9415q;
            return -5;
        }
        int m9900f = m9900f(this.f9410l);
        if (!z && this.f9406h[m9900f] == c2676s) {
            if (c2196f.m9030h()) {
                return -3;
            }
            c2196f.f8041d = this.f9404f[m9900f];
            c2196f.m9012e(this.f9403e[m9900f]);
            aVar.f9417a = this.f9402d[m9900f];
            aVar.f9418b = this.f9401c[m9900f];
            aVar.f9419c = this.f9405g[m9900f];
            this.f9410l++;
            return -4;
        }
        c2677t.f11202a = this.f9406h[m9900f];
        return -5;
    }

    /* renamed from: a */
    public long m9904a(int i) {
        int m9920i = m9920i() - i;
        C2628e.m11111a(m9920i >= 0 && m9920i <= this.f9407i - this.f9410l);
        this.f9407i -= m9920i;
        this.f9412n = Math.max(this.f9411m, m9899e(this.f9407i));
        int i2 = this.f9407i;
        if (i2 == 0) {
            return 0L;
        }
        return this.f9401c[m9900f(i2 - 1)] + this.f9402d[r6];
    }

    /* renamed from: a */
    public synchronized void m9905a(long j, int i, long j2, int i2, InterfaceC2337q.a aVar) {
        if (this.f9413o) {
            if ((i & 1) == 0) {
                return;
            } else {
                this.f9413o = false;
            }
        }
        C2628e.m11113b(!this.f9414p);
        m9911b(j);
        int m9900f = m9900f(this.f9407i);
        this.f9404f[m9900f] = j;
        this.f9401c[m9900f] = j2;
        this.f9402d[m9900f] = i2;
        this.f9403e[m9900f] = i;
        this.f9405g[m9900f] = aVar;
        this.f9406h[m9900f] = this.f9415q;
        this.f9400b[m9900f] = this.f9416r;
        this.f9407i++;
        if (this.f9407i == this.f9399a) {
            int i3 = this.f9399a + 1000;
            int[] iArr = new int[i3];
            long[] jArr = new long[i3];
            long[] jArr2 = new long[i3];
            int[] iArr2 = new int[i3];
            int[] iArr3 = new int[i3];
            InterfaceC2337q.a[] aVarArr = new InterfaceC2337q.a[i3];
            C2676s[] c2676sArr = new C2676s[i3];
            int i4 = this.f9399a - this.f9409k;
            System.arraycopy(this.f9401c, this.f9409k, jArr, 0, i4);
            System.arraycopy(this.f9404f, this.f9409k, jArr2, 0, i4);
            System.arraycopy(this.f9403e, this.f9409k, iArr2, 0, i4);
            System.arraycopy(this.f9402d, this.f9409k, iArr3, 0, i4);
            System.arraycopy(this.f9405g, this.f9409k, aVarArr, 0, i4);
            System.arraycopy(this.f9406h, this.f9409k, c2676sArr, 0, i4);
            System.arraycopy(this.f9400b, this.f9409k, iArr, 0, i4);
            int i5 = this.f9409k;
            System.arraycopy(this.f9401c, 0, jArr, i4, i5);
            System.arraycopy(this.f9404f, 0, jArr2, i4, i5);
            System.arraycopy(this.f9403e, 0, iArr2, i4, i5);
            System.arraycopy(this.f9402d, 0, iArr3, i4, i5);
            System.arraycopy(this.f9405g, 0, aVarArr, i4, i5);
            System.arraycopy(this.f9406h, 0, c2676sArr, i4, i5);
            System.arraycopy(this.f9400b, 0, iArr, i4, i5);
            this.f9401c = jArr;
            this.f9404f = jArr2;
            this.f9403e = iArr2;
            this.f9402d = iArr3;
            this.f9405g = aVarArr;
            this.f9406h = c2676sArr;
            this.f9400b = iArr;
            this.f9409k = 0;
            this.f9407i = this.f9399a;
            this.f9399a = i3;
        }
    }

    /* renamed from: a */
    public void m9906a(boolean z) {
        this.f9407i = 0;
        this.f9408j = 0;
        this.f9409k = 0;
        this.f9410l = 0;
        this.f9413o = true;
        this.f9411m = Long.MIN_VALUE;
        this.f9412n = Long.MIN_VALUE;
        if (z) {
            this.f9415q = null;
            this.f9414p = true;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: a */
    public synchronized boolean m9907a(long j) {
        if (this.f9407i == 0) {
            return j > this.f9411m;
        }
        if (Math.max(this.f9411m, m9899e(this.f9410l)) >= j) {
            return false;
        }
        int i = this.f9407i;
        int m9900f = m9900f(this.f9407i - 1);
        while (i > this.f9410l && this.f9404f[m9900f] >= j) {
            i--;
            m9900f--;
            if (m9900f == -1) {
                m9900f = this.f9399a - 1;
            }
        }
        m9904a(this.f9408j + i);
        return true;
    }

    /* renamed from: a */
    public synchronized boolean m9908a(C2676s c2676s) {
        if (c2676s == null) {
            this.f9414p = true;
            return false;
        }
        this.f9414p = false;
        if (C2622I.m11067a(c2676s, this.f9415q)) {
            return false;
        }
        this.f9415q = c2676s;
        return true;
    }

    /* renamed from: b */
    public synchronized long m9909b() {
        if (this.f9407i == 0) {
            return -1L;
        }
        return m9898d(this.f9407i);
    }

    /* renamed from: b */
    public synchronized long m9910b(long j, boolean z, boolean z2) {
        if (this.f9407i != 0 && j >= this.f9404f[this.f9409k]) {
            int m9897a = m9897a(this.f9409k, (!z2 || this.f9410l == this.f9407i) ? this.f9407i : this.f9410l + 1, j, z);
            if (m9897a == -1) {
                return -1L;
            }
            return m9898d(m9897a);
        }
        return -1L;
    }

    /* renamed from: b */
    public synchronized void m9911b(long j) {
        this.f9412n = Math.max(this.f9412n, j);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: b */
    public synchronized boolean m9912b(int i) {
        boolean z;
        if (this.f9408j > i || i > this.f9408j + this.f9407i) {
            z = false;
        } else {
            this.f9410l = i - this.f9408j;
            z = true;
        }
        return z;
    }

    /* renamed from: c */
    public synchronized long m9913c() {
        if (this.f9410l == 0) {
            return -1L;
        }
        return m9898d(this.f9410l);
    }

    /* renamed from: c */
    public void m9914c(int i) {
        this.f9416r = i;
    }

    /* renamed from: d */
    public int m9915d() {
        return this.f9408j;
    }

    /* renamed from: e */
    public synchronized long m9916e() {
        return this.f9407i == 0 ? Long.MIN_VALUE : this.f9404f[this.f9409k];
    }

    /* renamed from: f */
    public synchronized long m9917f() {
        return this.f9412n;
    }

    /* renamed from: g */
    public int m9918g() {
        return this.f9408j + this.f9410l;
    }

    /* renamed from: h */
    public synchronized C2676s m9919h() {
        return this.f9414p ? null : this.f9415q;
    }

    /* renamed from: i */
    public int m9920i() {
        return this.f9408j + this.f9407i;
    }

    /* renamed from: j */
    public synchronized boolean m9921j() {
        return this.f9410l != this.f9407i;
    }

    /* renamed from: k */
    public int m9922k() {
        return m9921j() ? this.f9400b[m9900f(this.f9410l)] : this.f9416r;
    }

    /* renamed from: l */
    public synchronized void m9923l() {
        this.f9410l = 0;
    }
}
