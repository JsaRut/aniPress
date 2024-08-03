package p139d.p225c.p226a.p227a.p234f.p242h;

import java.util.List;
import p139d.p225c.p226a.p227a.C2676s;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2325i;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2337q;
import p139d.p225c.p226a.p227a.p234f.p242h.InterfaceC2296G;
import p139d.p225c.p226a.p227a.p259k.p260a.C2526h;
import p139d.p225c.p226a.p227a.p270n.C2628e;
import p139d.p225c.p226a.p227a.p270n.C2644u;

/* renamed from: d.c.a.a.f.h.I */
/* loaded from: classes.dex */
final class C2298I {

    /* renamed from: a */
    private final List<C2676s> f8867a;

    /* renamed from: b */
    private final InterfaceC2337q[] f8868b;

    public C2298I(List<C2676s> list) {
        this.f8867a = list;
        this.f8868b = new InterfaceC2337q[list.size()];
    }

    /* renamed from: a */
    public void m9554a(long j, C2644u c2644u) {
        if (c2644u.m11208a() < 9) {
            return;
        }
        int m11226h = c2644u.m11226h();
        int m11226h2 = c2644u.m11226h();
        int m11238t = c2644u.m11238t();
        if (m11226h == 434 && m11226h2 == C2526h.f10388a && m11238t == 3) {
            C2526h.m10609b(j, c2644u, this.f8868b);
        }
    }

    /* renamed from: a */
    public void m9555a(InterfaceC2325i interfaceC2325i, InterfaceC2296G.d dVar) {
        for (int i = 0; i < this.f8868b.length; i++) {
            dVar.m9548a();
            InterfaceC2337q mo9671a = interfaceC2325i.mo9671a(dVar.m9550c(), 3);
            C2676s c2676s = this.f8867a.get(i);
            String str = c2676s.f11182g;
            C2628e.m11112a("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption mime type provided: " + str);
            mo9671a.mo9433a(C2676s.m11427a(dVar.m9549b(), str, null, -1, c2676s.f11200y, c2676s.f11201z, c2676s.f11174A, null, Long.MAX_VALUE, c2676s.f11184i));
            this.f8868b[i] = mo9671a;
        }
    }
}
