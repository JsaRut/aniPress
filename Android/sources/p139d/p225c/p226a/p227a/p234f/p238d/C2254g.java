package p139d.p225c.p226a.p227a.p234f.p238d;

import p139d.p225c.p226a.p227a.p234f.C2333m;
import p139d.p225c.p226a.p227a.p234f.C2336p;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2335o;
import p139d.p225c.p226a.p227a.p234f.p238d.C2252e;
import p139d.p225c.p226a.p227a.p270n.C2622I;
import p139d.p225c.p226a.p227a.p270n.C2628e;
import p139d.p225c.p226a.p227a.p270n.C2638o;
import p139d.p225c.p226a.p227a.p270n.C2644u;

/* renamed from: d.c.a.a.f.d.g */
/* loaded from: classes.dex */
public final class C2254g implements C2252e.a {

    /* renamed from: a */
    private final long f8384a;

    /* renamed from: b */
    private final int f8385b;

    /* renamed from: c */
    private final long f8386c;

    /* renamed from: d */
    private final long f8387d;

    /* renamed from: e */
    private final long f8388e;

    /* renamed from: f */
    private final long[] f8389f;

    private C2254g(long j, int i, long j2) {
        this(j, i, j2, -1L, null);
    }

    private C2254g(long j, int i, long j2, long j3, long[] jArr) {
        this.f8384a = j;
        this.f8385b = i;
        this.f8386c = j2;
        this.f8389f = jArr;
        this.f8387d = j3;
        this.f8388e = j3 != -1 ? j + j3 : -1L;
    }

    /* renamed from: a */
    private long m9300a(int i) {
        return (this.f8386c * i) / 100;
    }

    /* renamed from: a */
    public static C2254g m9301a(long j, long j2, C2333m c2333m, C2644u c2644u) {
        int m11242x;
        int i = c2333m.f9164n;
        int i2 = c2333m.f9161k;
        int m11226h = c2644u.m11226h();
        if ((m11226h & 1) != 1 || (m11242x = c2644u.m11242x()) == 0) {
            return null;
        }
        long m11085c = C2622I.m11085c(m11242x, i * 1000000, i2);
        if ((m11226h & 6) != 6) {
            return new C2254g(j2, c2333m.f9160j, m11085c);
        }
        long m11242x2 = c2644u.m11242x();
        long[] jArr = new long[100];
        for (int i3 = 0; i3 < 100; i3++) {
            jArr[i3] = c2644u.m11238t();
        }
        if (j != -1) {
            long j3 = j2 + m11242x2;
            if (j != j3) {
                C2638o.m11160d("XingSeeker", "XING data size mismatch: " + j + ", " + j3);
            }
        }
        return new C2254g(j2, c2333m.f9160j, m11085c, m11242x2, jArr);
    }

    @Override // p139d.p225c.p226a.p227a.p234f.p238d.C2252e.a
    /* renamed from: a */
    public long mo9285a(long j) {
        double d2;
        long j2 = j - this.f8384a;
        if (!mo9140c() || j2 <= this.f8385b) {
            return 0L;
        }
        long[] jArr = this.f8389f;
        C2628e.m11110a(jArr);
        long[] jArr2 = jArr;
        double d3 = j2;
        Double.isNaN(d3);
        double d4 = this.f8387d;
        Double.isNaN(d4);
        double d5 = (d3 * 256.0d) / d4;
        int m11079b = C2622I.m11079b(jArr2, (long) d5, true, true);
        long m9300a = m9300a(m11079b);
        long j3 = jArr2[m11079b];
        int i = m11079b + 1;
        long m9300a2 = m9300a(i);
        long j4 = m11079b == 99 ? 256L : jArr2[i];
        if (j3 == j4) {
            d2 = 0.0d;
        } else {
            double d6 = j3;
            Double.isNaN(d6);
            double d7 = j4 - j3;
            Double.isNaN(d7);
            d2 = (d5 - d6) / d7;
        }
        double d8 = m9300a2 - m9300a;
        Double.isNaN(d8);
        return m9300a + Math.round(d2 * d8);
    }

    @Override // p139d.p225c.p226a.p227a.p234f.p238d.C2252e.a
    /* renamed from: b */
    public long mo9286b() {
        return this.f8388e;
    }

    @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2335o
    /* renamed from: b */
    public InterfaceC2335o.a mo9138b(long j) {
        if (!mo9140c()) {
            return new InterfaceC2335o.a(new C2336p(0L, this.f8384a + this.f8385b));
        }
        long m11081b = C2622I.m11081b(j, 0L, this.f8386c);
        double d2 = m11081b;
        Double.isNaN(d2);
        double d3 = this.f8386c;
        Double.isNaN(d3);
        double d4 = (d2 * 100.0d) / d3;
        double d5 = 0.0d;
        if (d4 > 0.0d) {
            if (d4 >= 100.0d) {
                d5 = 256.0d;
            } else {
                int i = (int) d4;
                long[] jArr = this.f8389f;
                C2628e.m11110a(jArr);
                double d6 = jArr[i];
                double d7 = i == 99 ? 256.0d : r3[i + 1];
                double d8 = i;
                Double.isNaN(d8);
                Double.isNaN(d6);
                Double.isNaN(d6);
                d5 = d6 + ((d4 - d8) * (d7 - d6));
            }
        }
        double d9 = this.f8387d;
        Double.isNaN(d9);
        return new InterfaceC2335o.a(new C2336p(m11081b, this.f8384a + C2622I.m11081b(Math.round((d5 / 256.0d) * d9), this.f8385b, this.f8387d - 1)));
    }

    @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2335o
    /* renamed from: c */
    public boolean mo9140c() {
        return this.f8389f != null;
    }

    @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2335o
    /* renamed from: d */
    public long mo9141d() {
        return this.f8386c;
    }
}
