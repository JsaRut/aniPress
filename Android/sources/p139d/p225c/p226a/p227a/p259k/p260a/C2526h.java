package p139d.p225c.p226a.p227a.p259k.p260a;

import p139d.p225c.p226a.p227a.p234f.InterfaceC2337q;
import p139d.p225c.p226a.p227a.p270n.C2622I;
import p139d.p225c.p226a.p227a.p270n.C2638o;
import p139d.p225c.p226a.p227a.p270n.C2644u;

/* renamed from: d.c.a.a.k.a.h */
/* loaded from: classes.dex */
public final class C2526h {

    /* renamed from: a */
    public static final int f10388a = C2622I.m11078b("GA94");

    /* renamed from: a */
    private static int m10607a(C2644u c2644u) {
        int i = 0;
        while (c2644u.m11208a() != 0) {
            int m11238t = c2644u.m11238t();
            i += m11238t;
            if (m11238t != 255) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public static void m10608a(long j, C2644u c2644u, InterfaceC2337q[] interfaceC2337qArr) {
        while (true) {
            if (c2644u.m11208a() <= 1) {
                return;
            }
            int m10607a = m10607a(c2644u);
            int m10607a2 = m10607a(c2644u);
            int m11217c = c2644u.m11217c() + m10607a2;
            if (m10607a2 == -1 || m10607a2 > c2644u.m11208a()) {
                C2638o.m11160d("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                m11217c = c2644u.m11219d();
            } else if (m10607a == 4 && m10607a2 >= 8) {
                int m11238t = c2644u.m11238t();
                int m11244z = c2644u.m11244z();
                int m11226h = m11244z == 49 ? c2644u.m11226h() : 0;
                int m11238t2 = c2644u.m11238t();
                if (m11244z == 47) {
                    c2644u.m11224f(1);
                }
                boolean z = m11238t == 181 && (m11244z == 49 || m11244z == 47) && m11238t2 == 3;
                if (m11244z == 49) {
                    z &= m11226h == f10388a;
                }
                if (z) {
                    m10609b(j, c2644u, interfaceC2337qArr);
                }
            }
            c2644u.m11222e(m11217c);
        }
    }

    /* renamed from: b */
    public static void m10609b(long j, C2644u c2644u, InterfaceC2337q[] interfaceC2337qArr) {
        int m11238t = c2644u.m11238t();
        if ((m11238t & 64) != 0) {
            c2644u.m11224f(1);
            int i = (m11238t & 31) * 3;
            int m11217c = c2644u.m11217c();
            for (InterfaceC2337q interfaceC2337q : interfaceC2337qArr) {
                c2644u.m11222e(m11217c);
                interfaceC2337q.mo9432a(c2644u, i);
                interfaceC2337q.mo9431a(j, 1, i, 0, null);
            }
        }
    }
}
