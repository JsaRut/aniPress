package p139d.p225c.p226a.p227a.p270n;

/* renamed from: d.c.a.a.n.m */
/* loaded from: classes.dex */
public final class C2636m {

    /* renamed from: a */
    public final int f10964a;

    /* renamed from: b */
    public final int f10965b;

    /* renamed from: c */
    public final int f10966c;

    /* renamed from: d */
    public final int f10967d;

    /* renamed from: e */
    public final int f10968e;

    /* renamed from: f */
    public final int f10969f;

    /* renamed from: g */
    public final int f10970g;

    /* renamed from: h */
    public final long f10971h;

    public C2636m(byte[] bArr, int i) {
        C2643t c2643t = new C2643t(bArr);
        c2643t.m11198b(i * 8);
        this.f10964a = c2643t.m11191a(16);
        this.f10965b = c2643t.m11191a(16);
        this.f10966c = c2643t.m11191a(24);
        this.f10967d = c2643t.m11191a(24);
        this.f10968e = c2643t.m11191a(20);
        this.f10969f = c2643t.m11191a(3) + 1;
        this.f10970g = c2643t.m11191a(5) + 1;
        this.f10971h = ((c2643t.m11191a(4) & 15) << 32) | (c2643t.m11191a(32) & 4294967295L);
    }

    /* renamed from: a */
    public int m11152a() {
        return this.f10970g * this.f10968e;
    }

    /* renamed from: b */
    public long m11153b() {
        return (this.f10971h * 1000000) / this.f10968e;
    }
}
