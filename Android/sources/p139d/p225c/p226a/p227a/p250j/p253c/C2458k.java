package p139d.p225c.p226a.p227a.p250j.p253c;

import p139d.p225c.p226a.p227a.C2676s;
import p139d.p225c.p226a.p227a.C2677t;
import p139d.p225c.p226a.p227a.p230c.C2196f;
import p139d.p225c.p226a.p227a.p245h.p246a.C2352d;
import p139d.p225c.p226a.p227a.p250j.InterfaceC2404E;
import p139d.p225c.p226a.p227a.p250j.p253c.p254a.C2439e;
import p139d.p225c.p226a.p227a.p270n.C2622I;

/* renamed from: d.c.a.a.j.c.k */
/* loaded from: classes.dex */
final class C2458k implements InterfaceC2404E {

    /* renamed from: a */
    private final C2676s f9769a;

    /* renamed from: c */
    private long[] f9771c;

    /* renamed from: d */
    private boolean f9772d;

    /* renamed from: e */
    private C2439e f9773e;

    /* renamed from: f */
    private boolean f9774f;

    /* renamed from: g */
    private int f9775g;

    /* renamed from: b */
    private final C2352d f9770b = new C2352d();

    /* renamed from: h */
    private long f9776h = -9223372036854775807L;

    public C2458k(C2439e c2439e, C2676s c2676s, boolean z) {
        this.f9769a = c2676s;
        this.f9773e = c2439e;
        this.f9771c = c2439e.f9618b;
        m10201a(c2439e, z);
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2404E
    /* renamed from: a */
    public int mo9960a(C2677t c2677t, C2196f c2196f, boolean z) {
        if (z || !this.f9774f) {
            c2677t.f11202a = this.f9769a;
            this.f9774f = true;
            return -5;
        }
        int i = this.f9775g;
        if (i == this.f9771c.length) {
            if (this.f9772d) {
                return -3;
            }
            c2196f.m9012e(4);
            return -4;
        }
        this.f9775g = i + 1;
        C2352d c2352d = this.f9770b;
        C2439e c2439e = this.f9773e;
        byte[] m9809a = c2352d.m9809a(c2439e.f9617a[i], c2439e.f9621e);
        if (m9809a == null) {
            return -3;
        }
        c2196f.m9028f(m9809a.length);
        c2196f.m9012e(1);
        c2196f.f8040c.put(m9809a);
        c2196f.f8041d = this.f9771c[i];
        return -4;
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2404E
    /* renamed from: a */
    public void mo9961a() {
    }

    /* renamed from: a */
    public void m10200a(long j) {
        boolean z = false;
        this.f9775g = C2622I.m11042a(this.f9771c, j, true, false);
        if (this.f9772d && this.f9775g == this.f9771c.length) {
            z = true;
        }
        if (!z) {
            j = -9223372036854775807L;
        }
        this.f9776h = j;
    }

    /* renamed from: a */
    public void m10201a(C2439e c2439e, boolean z) {
        int i = this.f9775g;
        long j = i == 0 ? -9223372036854775807L : this.f9771c[i - 1];
        this.f9772d = z;
        this.f9773e = c2439e;
        this.f9771c = c2439e.f9618b;
        long j2 = this.f9776h;
        if (j2 != -9223372036854775807L) {
            m10200a(j2);
        } else if (j != -9223372036854775807L) {
            this.f9775g = C2622I.m11042a(this.f9771c, j, false, false);
        }
    }

    /* renamed from: b */
    public String m10202b() {
        return this.f9773e.m10096a();
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2404E
    /* renamed from: c */
    public boolean mo9962c() {
        return true;
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2404E
    /* renamed from: d */
    public int mo9963d(long j) {
        int max = Math.max(this.f9775g, C2622I.m11042a(this.f9771c, j, true, false));
        int i = max - this.f9775g;
        this.f9775g = max;
        return i;
    }
}
