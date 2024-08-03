package p139d.p225c.p226a.p227a.p234f.p242h;

import p139d.p225c.p226a.p227a.p234f.AbstractC2227a;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2289h;
import p139d.p225c.p226a.p227a.p270n.C2619F;
import p139d.p225c.p226a.p227a.p270n.C2622I;
import p139d.p225c.p226a.p227a.p270n.C2644u;

/* renamed from: d.c.a.a.f.h.D */
/* loaded from: classes.dex */
final class C2293D extends AbstractC2227a {

    /* renamed from: d.c.a.a.f.h.D$a */
    /* loaded from: classes.dex */
    private static final class a implements AbstractC2227a.g {

        /* renamed from: a */
        private final C2619F f8815a;

        /* renamed from: b */
        private final C2644u f8816b = new C2644u();

        /* renamed from: c */
        private final int f8817c;

        public a(int i, C2619F c2619f) {
            this.f8817c = i;
            this.f8815a = c2619f;
        }

        /* renamed from: a */
        private AbstractC2227a.f m9510a(C2644u c2644u, long j, long j2) {
            int m9551a;
            int m9551a2;
            int m11219d = c2644u.m11219d();
            long j3 = -1;
            long j4 = -1;
            long j5 = -9223372036854775807L;
            while (c2644u.m11208a() >= 188 && (m9551a2 = (m9551a = C2297H.m9551a(c2644u.f11004a, c2644u.m11217c(), m11219d)) + 188) <= m11219d) {
                long m9552a = C2297H.m9552a(c2644u, m9551a, this.f8817c);
                if (m9552a != -9223372036854775807L) {
                    long m11022b = this.f8815a.m11022b(m9552a);
                    if (m11022b > j) {
                        return j5 == -9223372036854775807L ? AbstractC2227a.f.m9180a(m11022b, j2) : AbstractC2227a.f.m9179a(j2 + j4);
                    }
                    if (100000 + m11022b > j) {
                        return AbstractC2227a.f.m9179a(j2 + m9551a);
                    }
                    j4 = m9551a;
                    j5 = m11022b;
                }
                c2644u.m11222e(m9551a2);
                j3 = m9551a2;
            }
            return j5 != -9223372036854775807L ? AbstractC2227a.f.m9182b(j5, j2 + j3) : AbstractC2227a.f.f8179a;
        }

        @Override // p139d.p225c.p226a.p227a.p234f.AbstractC2227a.g
        /* renamed from: a */
        public AbstractC2227a.f mo9184a(InterfaceC2289h interfaceC2289h, long j, AbstractC2227a.c cVar) {
            long position = interfaceC2289h.getPosition();
            int min = (int) Math.min(112800L, interfaceC2289h.getLength() - position);
            this.f8816b.m11218c(min);
            interfaceC2289h.mo9276a(this.f8816b.f11004a, 0, min);
            return m9510a(this.f8816b, j, position);
        }

        @Override // p139d.p225c.p226a.p227a.p234f.AbstractC2227a.g
        /* renamed from: a */
        public void mo9185a() {
            this.f8816b.m11212a(C2622I.f10921f);
        }
    }

    public C2293D(C2619F c2619f, long j, long j2, int i) {
        super(new AbstractC2227a.b(), new a(i, c2619f), j, 0L, j + 1, 0L, j2, 188L, 940);
    }
}
