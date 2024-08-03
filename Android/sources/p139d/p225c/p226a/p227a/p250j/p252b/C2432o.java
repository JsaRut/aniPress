package p139d.p225c.p226a.p227a.p250j.p252b;

import p139d.p225c.p226a.p227a.C2676s;
import p139d.p225c.p226a.p227a.p234f.C2247d;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2337q;
import p139d.p225c.p226a.p227a.p269m.C2600n;
import p139d.p225c.p226a.p227a.p269m.InterfaceC2597k;
import p139d.p225c.p226a.p227a.p270n.C2622I;

/* renamed from: d.c.a.a.j.b.o */
/* loaded from: classes.dex */
public final class C2432o extends AbstractC2418a {

    /* renamed from: n */
    private final int f9579n;

    /* renamed from: o */
    private final C2676s f9580o;

    /* renamed from: p */
    private long f9581p;

    /* renamed from: q */
    private boolean f9582q;

    public C2432o(InterfaceC2597k interfaceC2597k, C2600n c2600n, C2676s c2676s, int i, Object obj, long j, long j2, long j3, int i2, C2676s c2676s2) {
        super(interfaceC2597k, c2600n, c2676s, i, obj, j, j2, -9223372036854775807L, -9223372036854775807L, j3);
        this.f9579n = i2;
        this.f9580o = c2676s2;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p139d.p225c.p226a.p227a.p269m.C2612z.d
    /* renamed from: a */
    public void mo9973a() {
        try {
            long mo9121a = this.f9518h.mo9121a(this.f9511a.m10927a(this.f9581p));
            if (mo9121a != -1) {
                mo9121a += this.f9581p;
            }
            C2247d c2247d = new C2247d(this.f9518h, this.f9581p, mo9121a);
            C2420c m9988i = m9988i();
            m9988i.m9990a(0L);
            InterfaceC2337q mo9989a = m9988i.mo9989a(0, this.f9579n);
            mo9989a.mo9433a(this.f9580o);
            for (int i = 0; i != -1; i = mo9989a.mo9430a(c2247d, Integer.MAX_VALUE, true)) {
                this.f9581p += i;
            }
            mo9989a.mo9431a(this.f9516f, 1, (int) this.f9581p, 0, null);
            C2622I.m11060a((InterfaceC2597k) this.f9518h);
            this.f9582q = true;
        } catch (Throwable th) {
            C2622I.m11060a((InterfaceC2597k) this.f9518h);
            throw th;
        }
    }

    @Override // p139d.p225c.p226a.p227a.p269m.C2612z.d
    /* renamed from: b */
    public void mo9974b() {
    }

    @Override // p139d.p225c.p226a.p227a.p250j.p252b.AbstractC2429l
    /* renamed from: h */
    public boolean mo10033h() {
        return this.f9582q;
    }
}
