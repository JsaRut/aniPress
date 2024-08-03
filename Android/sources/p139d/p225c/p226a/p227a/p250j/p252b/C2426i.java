package p139d.p225c.p226a.p227a.p250j.p252b;

import p139d.p225c.p226a.p227a.C2676s;
import p139d.p225c.p226a.p227a.p234f.C2247d;
import p139d.p225c.p226a.p227a.p234f.C2334n;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2287g;
import p139d.p225c.p226a.p227a.p269m.C2600n;
import p139d.p225c.p226a.p227a.p269m.InterfaceC2597k;
import p139d.p225c.p226a.p227a.p270n.C2622I;
import p139d.p225c.p226a.p227a.p270n.C2628e;

/* renamed from: d.c.a.a.j.b.i */
/* loaded from: classes.dex */
public class C2426i extends AbstractC2418a {

    /* renamed from: n */
    private static final C2334n f9564n = new C2334n();

    /* renamed from: o */
    private final int f9565o;

    /* renamed from: p */
    private final long f9566p;

    /* renamed from: q */
    private final C2422e f9567q;

    /* renamed from: r */
    private long f9568r;

    /* renamed from: s */
    private volatile boolean f9569s;

    /* renamed from: t */
    private boolean f9570t;

    public C2426i(InterfaceC2597k interfaceC2597k, C2600n c2600n, C2676s c2676s, int i, Object obj, long j, long j2, long j3, long j4, long j5, int i2, long j6, C2422e c2422e) {
        super(interfaceC2597k, c2600n, c2676s, i, obj, j, j2, j3, j4, j5);
        this.f9565o = i2;
        this.f9566p = j6;
        this.f9567q = c2422e;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p139d.p225c.p226a.p227a.p269m.C2612z.d
    /* renamed from: a */
    public final void mo9973a() {
        C2600n m10927a = this.f9511a.m10927a(this.f9568r);
        try {
            C2247d c2247d = new C2247d(this.f9518h, m10927a.f10786e, this.f9518h.mo9121a(m10927a));
            if (this.f9568r == 0) {
                C2420c m9988i = m9988i();
                m9988i.m9990a(this.f9566p);
                this.f9567q.m9996a(m9988i, this.f9502j == -9223372036854775807L ? -9223372036854775807L : this.f9502j - this.f9566p, this.f9503k == -9223372036854775807L ? -9223372036854775807L : this.f9503k - this.f9566p);
            }
            try {
                InterfaceC2287g interfaceC2287g = this.f9567q.f9519a;
                int i = 0;
                while (i == 0 && !this.f9569s) {
                    i = interfaceC2287g.mo9157a(c2247d, f9564n);
                }
                C2628e.m11113b(i != 1);
                C2622I.m11060a((InterfaceC2597k) this.f9518h);
                this.f9570t = true;
            } finally {
                this.f9568r = c2247d.getPosition() - this.f9511a.f10786e;
            }
        } catch (Throwable th) {
            C2622I.m11060a((InterfaceC2597k) this.f9518h);
            throw th;
        }
    }

    @Override // p139d.p225c.p226a.p227a.p269m.C2612z.d
    /* renamed from: b */
    public final void mo9974b() {
        this.f9569s = true;
    }

    @Override // p139d.p225c.p226a.p227a.p250j.p252b.AbstractC2429l
    /* renamed from: g */
    public long mo10032g() {
        return this.f9577i + this.f9565o;
    }

    @Override // p139d.p225c.p226a.p227a.p250j.p252b.AbstractC2429l
    /* renamed from: h */
    public boolean mo10033h() {
        return this.f9570t;
    }
}
