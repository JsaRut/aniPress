package p139d.p225c.p226a.p227a.p234f.p243i;

import p139d.p225c.p226a.p227a.C2683z;
import p139d.p225c.p226a.p227a.p229b.C2163H;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2289h;
import p139d.p225c.p226a.p227a.p270n.C2622I;
import p139d.p225c.p226a.p227a.p270n.C2628e;
import p139d.p225c.p226a.p227a.p270n.C2638o;
import p139d.p225c.p226a.p227a.p270n.C2644u;

/* renamed from: d.c.a.a.f.i.d */
/* loaded from: classes.dex */
final class C2329d {

    /* renamed from: d.c.a.a.f.i.d$a */
    /* loaded from: classes.dex */
    private static final class a {

        /* renamed from: a */
        public final int f9145a;

        /* renamed from: b */
        public final long f9146b;

        private a(int i, long j) {
            this.f9145a = i;
            this.f9146b = j;
        }

        /* renamed from: a */
        public static a m9686a(InterfaceC2289h interfaceC2289h, C2644u c2644u) {
            interfaceC2289h.mo9276a(c2644u.f11004a, 0, 8);
            c2644u.m11222e(0);
            return new a(c2644u.m11226h(), c2644u.m11231m());
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: a */
    public static C2328c m9684a(InterfaceC2289h interfaceC2289h) {
        a m9686a;
        StringBuilder sb;
        C2628e.m11110a(interfaceC2289h);
        C2644u c2644u = new C2644u(16);
        if (a.m9686a(interfaceC2289h, c2644u).f9145a != C2163H.f7829a) {
            return null;
        }
        interfaceC2289h.mo9276a(c2644u.f11004a, 0, 4);
        c2644u.m11222e(0);
        int m11226h = c2644u.m11226h();
        if (m11226h != C2163H.f7830b) {
            sb = new StringBuilder();
            sb.append("Unsupported RIFF format: ");
            sb.append(m11226h);
        } else {
            while (true) {
                m9686a = a.m9686a(interfaceC2289h, c2644u);
                if (m9686a.f9145a == C2163H.f7831c) {
                    break;
                }
                interfaceC2289h.mo9275a((int) m9686a.f9146b);
            }
            C2628e.m11113b(m9686a.f9146b >= 16);
            interfaceC2289h.mo9276a(c2644u.f11004a, 0, 16);
            c2644u.m11222e(0);
            int m11233o = c2644u.m11233o();
            int m11233o2 = c2644u.m11233o();
            int m11232n = c2644u.m11232n();
            int m11232n2 = c2644u.m11232n();
            int m11233o3 = c2644u.m11233o();
            int m11233o4 = c2644u.m11233o();
            int i = (m11233o2 * m11233o4) / 8;
            if (m11233o3 != i) {
                throw new C2683z("Expected block alignment: " + i + "; got: " + m11233o3);
            }
            int m8846a = C2163H.m8846a(m11233o, m11233o4);
            if (m8846a != 0) {
                interfaceC2289h.mo9275a(((int) m9686a.f9146b) - 16);
                return new C2328c(m11233o2, m11232n, m11232n2, m11233o3, m11233o4, m8846a);
            }
            sb = new StringBuilder();
            sb.append("Unsupported WAV format: ");
            sb.append(m11233o4);
            sb.append(" bit/sample, type ");
            sb.append(m11233o);
        }
        C2638o.m11157b("WavHeaderReader", sb.toString());
        return null;
    }

    /* renamed from: a */
    public static void m9685a(InterfaceC2289h interfaceC2289h, C2328c c2328c) {
        C2628e.m11110a(interfaceC2289h);
        C2628e.m11110a(c2328c);
        interfaceC2289h.mo9280b();
        C2644u c2644u = new C2644u(8);
        while (true) {
            a m9686a = a.m9686a(interfaceC2289h, c2644u);
            if (m9686a.f9145a == C2622I.m11078b("data")) {
                interfaceC2289h.mo9283c(8);
                c2328c.m9677a(interfaceC2289h.getPosition(), m9686a.f9146b);
                return;
            }
            C2638o.m11160d("WavHeaderReader", "Ignoring unknown WAV chunk: " + m9686a.f9145a);
            long j = m9686a.f9146b + 8;
            if (m9686a.f9145a == C2622I.m11078b("RIFF")) {
                j = 12;
            }
            if (j > 2147483647L) {
                throw new C2683z("Chunk is too large (~2GB+) to skip; id: " + m9686a.f9145a);
            }
            interfaceC2289h.mo9283c((int) j);
        }
    }
}
