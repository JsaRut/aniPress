package p139d.p225c.p226a.p227a.p234f.p238d;

import p139d.p225c.p226a.p227a.p234f.C2333m;
import p139d.p225c.p226a.p227a.p234f.C2336p;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2335o;
import p139d.p225c.p226a.p227a.p234f.p238d.C2252e;
import p139d.p225c.p226a.p227a.p270n.C2622I;
import p139d.p225c.p226a.p227a.p270n.C2638o;
import p139d.p225c.p226a.p227a.p270n.C2644u;

/* renamed from: d.c.a.a.f.d.f */
/* loaded from: classes.dex */
public final class C2253f implements C2252e.a {

    /* renamed from: a */
    private final long[] f8380a;

    /* renamed from: b */
    private final long[] f8381b;

    /* renamed from: c */
    private final long f8382c;

    /* renamed from: d */
    private final long f8383d;

    private C2253f(long[] jArr, long[] jArr2, long j, long j2) {
        this.f8380a = jArr;
        this.f8381b = jArr2;
        this.f8382c = j;
        this.f8383d = j2;
    }

    /* renamed from: a */
    public static C2253f m9299a(long j, long j2, C2333m c2333m, C2644u c2644u) {
        int m11238t;
        c2644u.m11224f(10);
        int m11226h = c2644u.m11226h();
        if (m11226h <= 0) {
            return null;
        }
        int i = c2333m.f9161k;
        long m11085c = C2622I.m11085c(m11226h, 1000000 * (i >= 32000 ? 1152 : 576), i);
        int m11244z = c2644u.m11244z();
        int m11244z2 = c2644u.m11244z();
        int m11244z3 = c2644u.m11244z();
        c2644u.m11224f(2);
        long j3 = j2 + c2333m.f9160j;
        long[] jArr = new long[m11244z];
        long[] jArr2 = new long[m11244z];
        int i2 = 0;
        long j4 = j2;
        while (i2 < m11244z) {
            int i3 = m11244z2;
            long j5 = j3;
            jArr[i2] = (i2 * m11085c) / m11244z;
            jArr2[i2] = Math.max(j4, j5);
            if (m11244z3 == 1) {
                m11238t = c2644u.m11238t();
            } else if (m11244z3 == 2) {
                m11238t = c2644u.m11244z();
            } else if (m11244z3 == 3) {
                m11238t = c2644u.m11241w();
            } else {
                if (m11244z3 != 4) {
                    return null;
                }
                m11238t = c2644u.m11242x();
            }
            j4 += m11238t * i3;
            i2++;
            j3 = j5;
            m11244z2 = i3;
        }
        if (j != -1 && j != j4) {
            C2638o.m11160d("VbriSeeker", "VBRI data size mismatch: " + j + ", " + j4);
        }
        return new C2253f(jArr, jArr2, m11085c, j4);
    }

    @Override // p139d.p225c.p226a.p227a.p234f.p238d.C2252e.a
    /* renamed from: a */
    public long mo9285a(long j) {
        return this.f8380a[C2622I.m11079b(this.f8381b, j, true, true)];
    }

    @Override // p139d.p225c.p226a.p227a.p234f.p238d.C2252e.a
    /* renamed from: b */
    public long mo9286b() {
        return this.f8383d;
    }

    @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2335o
    /* renamed from: b */
    public InterfaceC2335o.a mo9138b(long j) {
        int m11079b = C2622I.m11079b(this.f8380a, j, true, true);
        C2336p c2336p = new C2336p(this.f8380a[m11079b], this.f8381b[m11079b]);
        if (c2336p.f9171b < j) {
            long[] jArr = this.f8380a;
            if (m11079b != jArr.length - 1) {
                int i = m11079b + 1;
                return new InterfaceC2335o.a(c2336p, new C2336p(jArr[i], this.f8381b[i]));
            }
        }
        return new InterfaceC2335o.a(c2336p);
    }

    @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2335o
    /* renamed from: c */
    public boolean mo9140c() {
        return true;
    }

    @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2335o
    /* renamed from: d */
    public long mo9141d() {
        return this.f8382c;
    }
}
