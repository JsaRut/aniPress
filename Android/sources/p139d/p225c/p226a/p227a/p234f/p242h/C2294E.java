package p139d.p225c.p226a.p227a.p234f.p242h;

import p139d.p225c.p226a.p227a.p234f.C2334n;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2289h;
import p139d.p225c.p226a.p227a.p270n.C2619F;
import p139d.p225c.p226a.p227a.p270n.C2622I;
import p139d.p225c.p226a.p227a.p270n.C2644u;

/* renamed from: d.c.a.a.f.h.E */
/* loaded from: classes.dex */
final class C2294E {

    /* renamed from: c */
    private boolean f8820c;

    /* renamed from: d */
    private boolean f8821d;

    /* renamed from: e */
    private boolean f8822e;

    /* renamed from: a */
    private final C2619F f8818a = new C2619F(0);

    /* renamed from: f */
    private long f8823f = -9223372036854775807L;

    /* renamed from: g */
    private long f8824g = -9223372036854775807L;

    /* renamed from: h */
    private long f8825h = -9223372036854775807L;

    /* renamed from: b */
    private final C2644u f8819b = new C2644u();

    /* renamed from: a */
    private int m9511a(InterfaceC2289h interfaceC2289h) {
        this.f8819b.m11212a(C2622I.f10921f);
        this.f8820c = true;
        interfaceC2289h.mo9280b();
        return 0;
    }

    /* renamed from: a */
    private long m9512a(C2644u c2644u, int i) {
        int m11219d = c2644u.m11219d();
        for (int m11217c = c2644u.m11217c(); m11217c < m11219d; m11217c++) {
            if (c2644u.f11004a[m11217c] == 71) {
                long m9552a = C2297H.m9552a(c2644u, m11217c, i);
                if (m9552a != -9223372036854775807L) {
                    return m9552a;
                }
            }
        }
        return -9223372036854775807L;
    }

    /* renamed from: b */
    private int m9513b(InterfaceC2289h interfaceC2289h, C2334n c2334n, int i) {
        int min = (int) Math.min(112800L, interfaceC2289h.getLength());
        long j = 0;
        if (interfaceC2289h.getPosition() != j) {
            c2334n.f9165a = j;
            return 1;
        }
        this.f8819b.m11218c(min);
        interfaceC2289h.mo9280b();
        interfaceC2289h.mo9276a(this.f8819b.f11004a, 0, min);
        this.f8823f = m9512a(this.f8819b, i);
        this.f8821d = true;
        return 0;
    }

    /* renamed from: b */
    private long m9514b(C2644u c2644u, int i) {
        int m11217c = c2644u.m11217c();
        int m11219d = c2644u.m11219d();
        while (true) {
            m11219d--;
            if (m11219d < m11217c) {
                return -9223372036854775807L;
            }
            if (c2644u.f11004a[m11219d] == 71) {
                long m9552a = C2297H.m9552a(c2644u, m11219d, i);
                if (m9552a != -9223372036854775807L) {
                    return m9552a;
                }
            }
        }
    }

    /* renamed from: c */
    private int m9515c(InterfaceC2289h interfaceC2289h, C2334n c2334n, int i) {
        long length = interfaceC2289h.getLength();
        int min = (int) Math.min(112800L, length);
        long j = length - min;
        if (interfaceC2289h.getPosition() != j) {
            c2334n.f9165a = j;
            return 1;
        }
        this.f8819b.m11218c(min);
        interfaceC2289h.mo9280b();
        interfaceC2289h.mo9276a(this.f8819b.f11004a, 0, min);
        this.f8824g = m9514b(this.f8819b, i);
        this.f8822e = true;
        return 0;
    }

    /* renamed from: a */
    public int m9516a(InterfaceC2289h interfaceC2289h, C2334n c2334n, int i) {
        if (i <= 0) {
            return m9511a(interfaceC2289h);
        }
        if (!this.f8822e) {
            return m9515c(interfaceC2289h, c2334n, i);
        }
        if (this.f8824g == -9223372036854775807L) {
            return m9511a(interfaceC2289h);
        }
        if (!this.f8821d) {
            return m9513b(interfaceC2289h, c2334n, i);
        }
        long j = this.f8823f;
        if (j == -9223372036854775807L) {
            return m9511a(interfaceC2289h);
        }
        this.f8825h = this.f8818a.m11022b(this.f8824g) - this.f8818a.m11022b(j);
        return m9511a(interfaceC2289h);
    }

    /* renamed from: a */
    public long m9517a() {
        return this.f8825h;
    }

    /* renamed from: b */
    public C2619F m9518b() {
        return this.f8818a;
    }

    /* renamed from: c */
    public boolean m9519c() {
        return this.f8820c;
    }
}
