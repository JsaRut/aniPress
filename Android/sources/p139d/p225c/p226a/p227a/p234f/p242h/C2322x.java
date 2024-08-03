package p139d.p225c.p226a.p227a.p234f.p242h;

import p139d.p225c.p226a.p227a.p234f.C2334n;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2289h;
import p139d.p225c.p226a.p227a.p270n.C2619F;
import p139d.p225c.p226a.p227a.p270n.C2622I;
import p139d.p225c.p226a.p227a.p270n.C2644u;

/* renamed from: d.c.a.a.f.h.x */
/* loaded from: classes.dex */
final class C2322x {

    /* renamed from: c */
    private boolean f9104c;

    /* renamed from: d */
    private boolean f9105d;

    /* renamed from: e */
    private boolean f9106e;

    /* renamed from: a */
    private final C2619F f9102a = new C2619F(0);

    /* renamed from: f */
    private long f9107f = -9223372036854775807L;

    /* renamed from: g */
    private long f9108g = -9223372036854775807L;

    /* renamed from: h */
    private long f9109h = -9223372036854775807L;

    /* renamed from: b */
    private final C2644u f9103b = new C2644u();

    /* renamed from: a */
    private int m9652a(InterfaceC2289h interfaceC2289h) {
        this.f9103b.m11212a(C2622I.f10921f);
        this.f9104c = true;
        interfaceC2289h.mo9280b();
        return 0;
    }

    /* renamed from: a */
    private int m9653a(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    /* renamed from: a */
    public static long m9654a(C2644u c2644u) {
        int m11217c = c2644u.m11217c();
        if (c2644u.m11208a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        c2644u.m11214a(bArr, 0, bArr.length);
        c2644u.m11222e(m11217c);
        if (m9655a(bArr)) {
            return m9658b(bArr);
        }
        return -9223372036854775807L;
    }

    /* renamed from: a */
    private static boolean m9655a(byte[] bArr) {
        return (bArr[0] & 196) == 68 && (bArr[2] & 4) == 4 && (bArr[4] & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3;
    }

    /* renamed from: b */
    private int m9656b(InterfaceC2289h interfaceC2289h, C2334n c2334n) {
        int min = (int) Math.min(20000L, interfaceC2289h.getLength());
        long j = 0;
        if (interfaceC2289h.getPosition() != j) {
            c2334n.f9165a = j;
            return 1;
        }
        this.f9103b.m11218c(min);
        interfaceC2289h.mo9280b();
        interfaceC2289h.mo9276a(this.f9103b.f11004a, 0, min);
        this.f9107f = m9657b(this.f9103b);
        this.f9105d = true;
        return 0;
    }

    /* renamed from: b */
    private long m9657b(C2644u c2644u) {
        int m11219d = c2644u.m11219d();
        for (int m11217c = c2644u.m11217c(); m11217c < m11219d - 3; m11217c++) {
            if (m9653a(c2644u.f11004a, m11217c) == 442) {
                c2644u.m11222e(m11217c + 4);
                long m9654a = m9654a(c2644u);
                if (m9654a != -9223372036854775807L) {
                    return m9654a;
                }
            }
        }
        return -9223372036854775807L;
    }

    /* renamed from: b */
    private static long m9658b(byte[] bArr) {
        return (((bArr[0] & 56) >> 3) << 30) | ((bArr[0] & 3) << 28) | ((bArr[1] & 255) << 20) | (((bArr[2] & 248) >> 3) << 15) | ((bArr[2] & 3) << 13) | ((bArr[3] & 255) << 5) | ((bArr[4] & 248) >> 3);
    }

    /* renamed from: c */
    private int m9659c(InterfaceC2289h interfaceC2289h, C2334n c2334n) {
        long length = interfaceC2289h.getLength();
        int min = (int) Math.min(20000L, length);
        long j = length - min;
        if (interfaceC2289h.getPosition() != j) {
            c2334n.f9165a = j;
            return 1;
        }
        this.f9103b.m11218c(min);
        interfaceC2289h.mo9280b();
        interfaceC2289h.mo9276a(this.f9103b.f11004a, 0, min);
        this.f9108g = m9660c(this.f9103b);
        this.f9106e = true;
        return 0;
    }

    /* renamed from: c */
    private long m9660c(C2644u c2644u) {
        int m11217c = c2644u.m11217c();
        for (int m11219d = c2644u.m11219d() - 4; m11219d >= m11217c; m11219d--) {
            if (m9653a(c2644u.f11004a, m11219d) == 442) {
                c2644u.m11222e(m11219d + 4);
                long m9654a = m9654a(c2644u);
                if (m9654a != -9223372036854775807L) {
                    return m9654a;
                }
            }
        }
        return -9223372036854775807L;
    }

    /* renamed from: a */
    public int m9661a(InterfaceC2289h interfaceC2289h, C2334n c2334n) {
        if (!this.f9106e) {
            return m9659c(interfaceC2289h, c2334n);
        }
        if (this.f9108g == -9223372036854775807L) {
            return m9652a(interfaceC2289h);
        }
        if (!this.f9105d) {
            return m9656b(interfaceC2289h, c2334n);
        }
        long j = this.f9107f;
        if (j == -9223372036854775807L) {
            return m9652a(interfaceC2289h);
        }
        this.f9109h = this.f9102a.m11022b(this.f9108g) - this.f9102a.m11022b(j);
        return m9652a(interfaceC2289h);
    }

    /* renamed from: a */
    public long m9662a() {
        return this.f9109h;
    }

    /* renamed from: b */
    public C2619F m9663b() {
        return this.f9102a;
    }

    /* renamed from: c */
    public boolean m9664c() {
        return this.f9104c;
    }
}
