package p139d.p225c.p226a.p227a.p234f.p242h;

import java.util.List;
import p139d.p225c.p226a.p227a.C2676s;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2325i;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2337q;
import p139d.p225c.p226a.p227a.p234f.p242h.InterfaceC2296G;
import p139d.p225c.p226a.p227a.p259k.p260a.C2526h;
import p139d.p225c.p226a.p227a.p270n.C2628e;
import p139d.p225c.p226a.p227a.p270n.C2644u;

/* renamed from: d.c.a.a.f.h.B */
/* loaded from: classes.dex */
final class C2291B {

    /* renamed from: a */
    private final List<C2676s> f8810a;

    /* renamed from: b */
    private final InterfaceC2337q[] f8811b;

    public C2291B(List<C2676s> list) {
        this.f8810a = list;
        this.f8811b = new InterfaceC2337q[list.size()];
    }

    /* renamed from: a */
    public void m9506a(long j, C2644u c2644u) {
        C2526h.m10608a(j, c2644u, this.f8811b);
    }

    /* renamed from: a */
    public void m9507a(InterfaceC2325i interfaceC2325i, InterfaceC2296G.d dVar) {
        for (int i = 0; i < this.f8811b.length; i++) {
            dVar.m9548a();
            InterfaceC2337q mo9671a = interfaceC2325i.mo9671a(dVar.m9550c(), 3);
            C2676s c2676s = this.f8810a.get(i);
            String str = c2676s.f11182g;
            C2628e.m11112a("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption mime type provided: " + str);
            String str2 = c2676s.f11176a;
            if (str2 == null) {
                str2 = dVar.m9549b();
            }
            mo9671a.mo9433a(C2676s.m11427a(str2, str, null, -1, c2676s.f11200y, c2676s.f11201z, c2676s.f11174A, null, Long.MAX_VALUE, c2676s.f11184i));
            this.f8811b[i] = mo9671a;
        }
    }
}
