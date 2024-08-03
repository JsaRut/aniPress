package p139d.p225c.p226a.p227a.p234f.p243i;

import p139d.p225c.p226a.p227a.p234f.C2336p;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2335o;
import p139d.p225c.p226a.p227a.p270n.C2622I;

/* renamed from: d.c.a.a.f.i.c */
/* loaded from: classes.dex */
final class C2328c implements InterfaceC2335o {

    /* renamed from: a */
    private final int f9137a;

    /* renamed from: b */
    private final int f9138b;

    /* renamed from: c */
    private final int f9139c;

    /* renamed from: d */
    private final int f9140d;

    /* renamed from: e */
    private final int f9141e;

    /* renamed from: f */
    private final int f9142f;

    /* renamed from: g */
    private long f9143g;

    /* renamed from: h */
    private long f9144h;

    public C2328c(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f9137a = i;
        this.f9138b = i2;
        this.f9139c = i3;
        this.f9140d = i4;
        this.f9141e = i5;
        this.f9142f = i6;
    }

    /* renamed from: a */
    public int m9675a() {
        return this.f9138b * this.f9141e * this.f9137a;
    }

    /* renamed from: a */
    public long m9676a(long j) {
        return (Math.max(0L, j - this.f9143g) * 1000000) / this.f9139c;
    }

    /* renamed from: a */
    public void m9677a(long j, long j2) {
        this.f9143g = j;
        this.f9144h = j2;
    }

    @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2335o
    /* renamed from: b */
    public InterfaceC2335o.a mo9138b(long j) {
        int i = this.f9140d;
        long m11081b = C2622I.m11081b((((this.f9139c * j) / 1000000) / i) * i, 0L, this.f9144h - i);
        long j2 = this.f9143g + m11081b;
        long m9676a = m9676a(j2);
        C2336p c2336p = new C2336p(m9676a, j2);
        if (m9676a < j) {
            long j3 = this.f9144h;
            int i2 = this.f9140d;
            if (m11081b != j3 - i2) {
                long j4 = j2 + i2;
                return new InterfaceC2335o.a(c2336p, new C2336p(m9676a(j4), j4));
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
        return ((this.f9144h / this.f9140d) * 1000000) / this.f9138b;
    }

    /* renamed from: e */
    public int m9678e() {
        return this.f9140d;
    }

    /* renamed from: f */
    public long m9679f() {
        if (m9683j()) {
            return this.f9143g + this.f9144h;
        }
        return -1L;
    }

    /* renamed from: g */
    public int m9680g() {
        return this.f9142f;
    }

    /* renamed from: h */
    public int m9681h() {
        return this.f9137a;
    }

    /* renamed from: i */
    public int m9682i() {
        return this.f9138b;
    }

    /* renamed from: j */
    public boolean m9683j() {
        return (this.f9143g == 0 || this.f9144h == 0) ? false : true;
    }
}
