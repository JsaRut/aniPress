package p139d.p225c.p226a.p227a.p250j.p252b;

import p139d.p225c.p226a.p227a.C2676s;
import p139d.p225c.p226a.p227a.p234f.C2247d;
import p139d.p225c.p226a.p227a.p234f.C2334n;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2287g;
import p139d.p225c.p226a.p227a.p269m.C2600n;
import p139d.p225c.p226a.p227a.p269m.InterfaceC2597k;
import p139d.p225c.p226a.p227a.p270n.C2622I;
import p139d.p225c.p226a.p227a.p270n.C2628e;

/* renamed from: d.c.a.a.j.b.k */
/* loaded from: classes.dex */
public final class C2428k extends AbstractC2421d {

    /* renamed from: i */
    private static final C2334n f9573i = new C2334n();

    /* renamed from: j */
    private final C2422e f9574j;

    /* renamed from: k */
    private long f9575k;

    /* renamed from: l */
    private volatile boolean f9576l;

    public C2428k(InterfaceC2597k interfaceC2597k, C2600n c2600n, C2676s c2676s, int i, Object obj, C2422e c2422e) {
        super(interfaceC2597k, c2600n, 2, c2676s, i, obj, -9223372036854775807L, -9223372036854775807L);
        this.f9574j = c2422e;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p139d.p225c.p226a.p227a.p269m.C2612z.d
    /* renamed from: a */
    public void mo9973a() {
        C2600n m10927a = this.f9511a.m10927a(this.f9575k);
        try {
            C2247d c2247d = new C2247d(this.f9518h, m10927a.f10786e, this.f9518h.mo9121a(m10927a));
            if (this.f9575k == 0) {
                this.f9574j.m9996a(null, -9223372036854775807L, -9223372036854775807L);
            }
            try {
                InterfaceC2287g interfaceC2287g = this.f9574j.f9519a;
                int i = 0;
                while (i == 0 && !this.f9576l) {
                    i = interfaceC2287g.mo9157a(c2247d, f9573i);
                }
                boolean z = true;
                if (i == 1) {
                    z = false;
                }
                C2628e.m11113b(z);
            } finally {
                this.f9575k = c2247d.getPosition() - this.f9511a.f10786e;
            }
        } finally {
            C2622I.m11060a((InterfaceC2597k) this.f9518h);
        }
    }

    @Override // p139d.p225c.p226a.p227a.p269m.C2612z.d
    /* renamed from: b */
    public void mo9974b() {
        this.f9576l = true;
    }
}
