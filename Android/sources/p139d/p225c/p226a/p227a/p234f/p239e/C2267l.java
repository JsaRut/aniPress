package p139d.p225c.p226a.p227a.p234f.p239e;

import p139d.p225c.p226a.p227a.p234f.InterfaceC2289h;
import p139d.p225c.p226a.p227a.p270n.C2622I;
import p139d.p225c.p226a.p227a.p270n.C2644u;

/* renamed from: d.c.a.a.f.e.l */
/* loaded from: classes.dex */
final class C2267l {

    /* renamed from: a */
    private static final int[] f8655a = {C2622I.m11078b("isom"), C2622I.m11078b("iso2"), C2622I.m11078b("iso3"), C2622I.m11078b("iso4"), C2622I.m11078b("iso5"), C2622I.m11078b("iso6"), C2622I.m11078b("avc1"), C2622I.m11078b("hvc1"), C2622I.m11078b("hev1"), C2622I.m11078b("mp41"), C2622I.m11078b("mp42"), C2622I.m11078b("3g2a"), C2622I.m11078b("3g2b"), C2622I.m11078b("3gr6"), C2622I.m11078b("3gs6"), C2622I.m11078b("3ge6"), C2622I.m11078b("3gg6"), C2622I.m11078b("M4V "), C2622I.m11078b("M4A "), C2622I.m11078b("f4v "), C2622I.m11078b("kddi"), C2622I.m11078b("M4VP"), C2622I.m11078b("qt  "), C2622I.m11078b("MSNV")};

    /* renamed from: a */
    private static boolean m9415a(int i) {
        if ((i >>> 8) == C2622I.m11078b("3gp")) {
            return true;
        }
        for (int i2 : f8655a) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m9416a(InterfaceC2289h interfaceC2289h) {
        return m9417a(interfaceC2289h, true);
    }

    /* renamed from: a */
    private static boolean m9417a(InterfaceC2289h interfaceC2289h, boolean z) {
        boolean z2;
        long length = interfaceC2289h.getLength();
        long j = -1;
        if (length == -1 || length > 4096) {
            length = 4096;
        }
        int i = (int) length;
        C2644u c2644u = new C2644u(64);
        int i2 = 0;
        boolean z3 = false;
        while (i2 < i) {
            c2644u.m11218c(8);
            interfaceC2289h.mo9276a(c2644u.f11004a, 0, 8);
            long m11240v = c2644u.m11240v();
            int m11226h = c2644u.m11226h();
            int i3 = 16;
            if (m11240v == 1) {
                interfaceC2289h.mo9276a(c2644u.f11004a, 8, 8);
                c2644u.m11220d(16);
                m11240v = c2644u.m11243y();
            } else {
                if (m11240v == 0) {
                    long length2 = interfaceC2289h.getLength();
                    if (length2 != j) {
                        m11240v = 8 + (length2 - interfaceC2289h.getPosition());
                    }
                }
                i3 = 8;
            }
            long j2 = i3;
            if (m11240v < j2) {
                return false;
            }
            i2 += i3;
            if (m11226h != AbstractC2258c.f8404B) {
                if (m11226h == AbstractC2258c.f8422K || m11226h == AbstractC2258c.f8426M) {
                    z2 = true;
                    break;
                }
                if ((i2 + m11240v) - j2 >= i) {
                    break;
                }
                int i4 = (int) (m11240v - j2);
                i2 += i4;
                if (m11226h == AbstractC2258c.f8449a) {
                    if (i4 < 8) {
                        return false;
                    }
                    c2644u.m11218c(i4);
                    interfaceC2289h.mo9276a(c2644u.f11004a, 0, i4);
                    int i5 = i4 / 4;
                    int i6 = 0;
                    while (true) {
                        if (i6 >= i5) {
                            break;
                        }
                        if (i6 == 1) {
                            c2644u.m11224f(4);
                        } else if (m9415a(c2644u.m11226h())) {
                            z3 = true;
                            break;
                        }
                        i6++;
                    }
                    if (!z3) {
                        return false;
                    }
                } else if (i4 != 0) {
                    interfaceC2289h.mo9275a(i4);
                }
                j = -1;
            }
        }
        z2 = false;
        return z3 && z == z2;
    }

    /* renamed from: b */
    public static boolean m9418b(InterfaceC2289h interfaceC2289h) {
        return m9417a(interfaceC2289h, false);
    }
}
