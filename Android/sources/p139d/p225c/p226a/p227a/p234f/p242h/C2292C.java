package p139d.p225c.p226a.p227a.p234f.p242h;

import p139d.p225c.p226a.p227a.C2676s;
import p139d.p225c.p226a.p227a.p231d.C2213m;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2325i;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2337q;
import p139d.p225c.p226a.p227a.p234f.p242h.InterfaceC2296G;
import p139d.p225c.p226a.p227a.p270n.C2619F;
import p139d.p225c.p226a.p227a.p270n.C2644u;

/* renamed from: d.c.a.a.f.h.C */
/* loaded from: classes.dex */
public final class C2292C implements InterfaceC2324z {

    /* renamed from: a */
    private C2619F f8812a;

    /* renamed from: b */
    private InterfaceC2337q f8813b;

    /* renamed from: c */
    private boolean f8814c;

    @Override // p139d.p225c.p226a.p227a.p234f.p242h.InterfaceC2324z
    /* renamed from: a */
    public void mo9508a(C2619F c2619f, InterfaceC2325i interfaceC2325i, InterfaceC2296G.d dVar) {
        this.f8812a = c2619f;
        dVar.m9548a();
        this.f8813b = interfaceC2325i.mo9671a(dVar.m9550c(), 4);
        this.f8813b.mo9433a(C2676s.m11430a(dVar.m9549b(), "application/x-scte35", (String) null, -1, (C2213m) null));
    }

    @Override // p139d.p225c.p226a.p227a.p234f.p242h.InterfaceC2324z
    /* renamed from: a */
    public void mo9509a(C2644u c2644u) {
        if (!this.f8814c) {
            if (this.f8812a.m11023c() == -9223372036854775807L) {
                return;
            }
            this.f8813b.mo9433a(C2676s.m11421a(null, "application/x-scte35", this.f8812a.m11023c()));
            this.f8814c = true;
        }
        int m11208a = c2644u.m11208a();
        this.f8813b.mo9432a(c2644u, m11208a);
        this.f8813b.mo9431a(this.f8812a.m11021b(), 1, m11208a, 0, null);
    }
}
