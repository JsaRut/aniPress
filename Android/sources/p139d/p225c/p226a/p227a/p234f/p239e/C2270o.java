package p139d.p225c.p226a.p227a.p234f.p239e;

import p139d.p225c.p226a.p227a.p234f.InterfaceC2289h;
import p139d.p225c.p226a.p227a.p270n.C2644u;

/* renamed from: d.c.a.a.f.e.o */
/* loaded from: classes.dex */
final class C2270o {

    /* renamed from: a */
    public C2260e f8672a;

    /* renamed from: b */
    public long f8673b;

    /* renamed from: c */
    public long f8674c;

    /* renamed from: d */
    public long f8675d;

    /* renamed from: e */
    public int f8676e;

    /* renamed from: f */
    public int f8677f;

    /* renamed from: g */
    public long[] f8678g;

    /* renamed from: h */
    public int[] f8679h;

    /* renamed from: i */
    public int[] f8680i;

    /* renamed from: j */
    public int[] f8681j;

    /* renamed from: k */
    public long[] f8682k;

    /* renamed from: l */
    public boolean[] f8683l;

    /* renamed from: m */
    public boolean f8684m;

    /* renamed from: n */
    public boolean[] f8685n;

    /* renamed from: o */
    public C2269n f8686o;

    /* renamed from: p */
    public int f8687p;

    /* renamed from: q */
    public C2644u f8688q;

    /* renamed from: r */
    public boolean f8689r;

    /* renamed from: s */
    public long f8690s;

    /* renamed from: a */
    public long m9421a(int i) {
        return this.f8682k[i] + this.f8681j[i];
    }

    /* renamed from: a */
    public void m9422a() {
        this.f8676e = 0;
        this.f8690s = 0L;
        this.f8684m = false;
        this.f8689r = false;
        this.f8686o = null;
    }

    /* renamed from: a */
    public void m9423a(int i, int i2) {
        this.f8676e = i;
        this.f8677f = i2;
        int[] iArr = this.f8679h;
        if (iArr == null || iArr.length < i) {
            this.f8678g = new long[i];
            this.f8679h = new int[i];
        }
        int[] iArr2 = this.f8680i;
        if (iArr2 == null || iArr2.length < i2) {
            int i3 = (i2 * 125) / 100;
            this.f8680i = new int[i3];
            this.f8681j = new int[i3];
            this.f8682k = new long[i3];
            this.f8683l = new boolean[i3];
            this.f8685n = new boolean[i3];
        }
    }

    /* renamed from: a */
    public void m9424a(InterfaceC2289h interfaceC2289h) {
        interfaceC2289h.readFully(this.f8688q.f11004a, 0, this.f8687p);
        this.f8688q.m11222e(0);
        this.f8689r = false;
    }

    /* renamed from: a */
    public void m9425a(C2644u c2644u) {
        c2644u.m11214a(this.f8688q.f11004a, 0, this.f8687p);
        this.f8688q.m11222e(0);
        this.f8689r = false;
    }

    /* renamed from: b */
    public void m9426b(int i) {
        C2644u c2644u = this.f8688q;
        if (c2644u == null || c2644u.m11219d() < i) {
            this.f8688q = new C2644u(i);
        }
        this.f8687p = i;
        this.f8684m = true;
        this.f8689r = true;
    }

    /* renamed from: c */
    public boolean m9427c(int i) {
        return this.f8684m && this.f8685n[i];
    }
}
