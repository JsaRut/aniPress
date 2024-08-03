package p139d.p225c.p226a.p227a.p234f.p242h;

import p139d.p225c.p226a.p227a.p234f.AbstractC2227a;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2289h;
import p139d.p225c.p226a.p227a.p270n.C2619F;
import p139d.p225c.p226a.p227a.p270n.C2622I;
import p139d.p225c.p226a.p227a.p270n.C2644u;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: d.c.a.a.f.h.w */
/* loaded from: classes.dex */
public final class C2321w extends AbstractC2227a {

    /* renamed from: d.c.a.a.f.h.w$a */
    /* loaded from: classes.dex */
    private static final class a implements AbstractC2227a.g {

        /* renamed from: a */
        private final C2619F f9100a;

        /* renamed from: b */
        private final C2644u f9101b;

        private a(C2619F c2619f) {
            this.f9100a = c2619f;
            this.f9101b = new C2644u();
        }

        /* renamed from: a */
        private AbstractC2227a.f m9650a(C2644u c2644u, long j, long j2) {
            int i = -1;
            long j3 = -9223372036854775807L;
            int i2 = -1;
            while (c2644u.m11208a() >= 4) {
                if (C2321w.m9649b(c2644u.f11004a, c2644u.m11217c()) != 442) {
                    c2644u.m11224f(1);
                } else {
                    c2644u.m11224f(4);
                    long m9654a = C2322x.m9654a(c2644u);
                    if (m9654a != -9223372036854775807L) {
                        long m11022b = this.f9100a.m11022b(m9654a);
                        if (m11022b > j) {
                            return j3 == -9223372036854775807L ? AbstractC2227a.f.m9180a(m11022b, j2) : AbstractC2227a.f.m9179a(j2 + i2);
                        }
                        if (100000 + m11022b > j) {
                            return AbstractC2227a.f.m9179a(j2 + c2644u.m11217c());
                        }
                        i2 = c2644u.m11217c();
                        j3 = m11022b;
                    }
                    m9651a(c2644u);
                    i = c2644u.m11217c();
                }
            }
            return j3 != -9223372036854775807L ? AbstractC2227a.f.m9182b(j3, j2 + i) : AbstractC2227a.f.f8179a;
        }

        /* renamed from: a */
        private static void m9651a(C2644u c2644u) {
            int m9649b;
            int m11219d = c2644u.m11219d();
            if (c2644u.m11208a() < 10) {
                c2644u.m11222e(m11219d);
                return;
            }
            c2644u.m11224f(9);
            int m11238t = c2644u.m11238t() & 7;
            if (c2644u.m11208a() < m11238t) {
                c2644u.m11222e(m11219d);
                return;
            }
            c2644u.m11224f(m11238t);
            if (c2644u.m11208a() < 4) {
                c2644u.m11222e(m11219d);
                return;
            }
            if (C2321w.m9649b(c2644u.f11004a, c2644u.m11217c()) == 443) {
                c2644u.m11224f(4);
                int m11244z = c2644u.m11244z();
                if (c2644u.m11208a() < m11244z) {
                    c2644u.m11222e(m11219d);
                    return;
                }
                c2644u.m11224f(m11244z);
            }
            while (c2644u.m11208a() >= 4 && (m9649b = C2321w.m9649b(c2644u.f11004a, c2644u.m11217c())) != 442 && m9649b != 441 && (m9649b >>> 8) == 1) {
                c2644u.m11224f(4);
                if (c2644u.m11208a() < 2) {
                    c2644u.m11222e(m11219d);
                    return;
                }
                c2644u.m11222e(Math.min(c2644u.m11219d(), c2644u.m11217c() + c2644u.m11244z()));
            }
        }

        @Override // p139d.p225c.p226a.p227a.p234f.AbstractC2227a.g
        /* renamed from: a */
        public AbstractC2227a.f mo9184a(InterfaceC2289h interfaceC2289h, long j, AbstractC2227a.c cVar) {
            long position = interfaceC2289h.getPosition();
            int min = (int) Math.min(20000L, interfaceC2289h.getLength() - position);
            this.f9101b.m11218c(min);
            interfaceC2289h.mo9276a(this.f9101b.f11004a, 0, min);
            return m9650a(this.f9101b, j, position);
        }

        @Override // p139d.p225c.p226a.p227a.p234f.AbstractC2227a.g
        /* renamed from: a */
        public void mo9185a() {
            this.f9101b.m11212a(C2622I.f10921f);
        }
    }

    public C2321w(C2619F c2619f, long j, long j2) {
        super(new AbstractC2227a.b(), new a(c2619f), j, 0L, j + 1, 0L, j2, 188L, 1000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static int m9649b(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }
}
