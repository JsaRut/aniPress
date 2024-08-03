package p139d.p225c.p226a.p227a.p245h;

import p139d.p225c.p226a.p227a.C2676s;
import p139d.p225c.p226a.p227a.p245h.p246a.C2351c;
import p139d.p225c.p226a.p227a.p245h.p247b.C2367n;
import p139d.p225c.p226a.p227a.p245h.p248c.C2383d;

/* renamed from: d.c.a.a.h.d */
/* loaded from: classes.dex */
class C2392d implements InterfaceC2393e {
    @Override // p139d.p225c.p226a.p227a.p245h.InterfaceC2393e
    /* renamed from: a */
    public boolean mo9857a(C2676s c2676s) {
        String str = c2676s.f11182g;
        return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str);
    }

    @Override // p139d.p225c.p226a.p227a.p245h.InterfaceC2393e
    /* renamed from: b */
    public InterfaceC2379c mo9858b(C2676s c2676s) {
        char c2;
        String str = c2676s.f11182g;
        int hashCode = str.hashCode();
        if (hashCode == -1248341703) {
            if (str.equals("application/id3")) {
                c2 = 0;
            }
            c2 = 65535;
        } else if (hashCode != 1154383568) {
            if (hashCode == 1652648887 && str.equals("application/x-scte35")) {
                c2 = 2;
            }
            c2 = 65535;
        } else {
            if (str.equals("application/x-emsg")) {
                c2 = 1;
            }
            c2 = 65535;
        }
        if (c2 == 0) {
            return new C2367n();
        }
        if (c2 == 1) {
            return new C2351c();
        }
        if (c2 == 2) {
            return new C2383d();
        }
        throw new IllegalArgumentException("Attempted to create decoder for unsupported format");
    }
}
