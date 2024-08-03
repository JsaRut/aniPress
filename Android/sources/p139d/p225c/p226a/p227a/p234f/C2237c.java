package p139d.p225c.p226a.p227a.p234f;

import p139d.p225c.p226a.p227a.p234f.InterfaceC2335o;
import p139d.p225c.p226a.p227a.p270n.C2622I;

/* renamed from: d.c.a.a.f.c */
/* loaded from: classes.dex */
public class C2237c implements InterfaceC2335o {

    /* renamed from: a */
    private final long f8218a;

    /* renamed from: b */
    private final long f8219b;

    /* renamed from: c */
    private final int f8220c;

    /* renamed from: d */
    private final long f8221d;

    /* renamed from: e */
    private final int f8222e;

    /* renamed from: f */
    private final long f8223f;

    public C2237c(long j, long j2, int i, int i2) {
        long m9207a;
        this.f8218a = j;
        this.f8219b = j2;
        this.f8220c = i2 == -1 ? 1 : i2;
        this.f8222e = i;
        if (j == -1) {
            this.f8221d = -1L;
            m9207a = -9223372036854775807L;
        } else {
            this.f8221d = j - j2;
            m9207a = m9207a(j, j2, i);
        }
        this.f8223f = m9207a;
    }

    /* renamed from: a */
    private static long m9207a(long j, long j2, int i) {
        return ((Math.max(0L, j - j2) * 8) * 1000000) / i;
    }

    /* renamed from: d */
    private long m9208d(long j) {
        long j2 = (j * this.f8222e) / 8000000;
        int i = this.f8220c;
        return this.f8219b + C2622I.m11081b((j2 / i) * i, 0L, this.f8221d - i);
    }

    @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2335o
    /* renamed from: b */
    public InterfaceC2335o.a mo9138b(long j) {
        if (this.f8221d == -1) {
            return new InterfaceC2335o.a(new C2336p(0L, this.f8219b));
        }
        long m9208d = m9208d(j);
        long m9209c = m9209c(m9208d);
        C2336p c2336p = new C2336p(m9209c, m9208d);
        if (m9209c < j) {
            int i = this.f8220c;
            if (i + m9208d < this.f8218a) {
                long j2 = m9208d + i;
                return new InterfaceC2335o.a(c2336p, new C2336p(m9209c(j2), j2));
            }
        }
        return new InterfaceC2335o.a(c2336p);
    }

    /* renamed from: c */
    public long m9209c(long j) {
        return m9207a(j, this.f8219b, this.f8222e);
    }

    @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2335o
    /* renamed from: c */
    public boolean mo9140c() {
        return this.f8221d != -1;
    }

    @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2335o
    /* renamed from: d */
    public long mo9141d() {
        return this.f8223f;
    }
}
