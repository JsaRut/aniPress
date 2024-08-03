package p139d.p143b.p184i.p200n;

import p139d.p143b.p145b.p146a.InterfaceC1648d;
import p139d.p143b.p148c.p156h.C1716b;
import p139d.p143b.p184i.p190d.InterfaceC1844A;
import p139d.p143b.p184i.p196j.AbstractC1918b;
import p139d.p143b.p184i.p196j.InterfaceC1923g;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: d.b.i.n.i */
/* loaded from: classes.dex */
public class C1985i extends AbstractC2005s<C1716b<AbstractC1918b>, C1716b<AbstractC1918b>> {

    /* renamed from: c */
    final /* synthetic */ InterfaceC1648d f7250c;

    /* renamed from: d */
    final /* synthetic */ boolean f7251d;

    /* renamed from: e */
    final /* synthetic */ C1987j f7252e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1985i(C1987j c1987j, InterfaceC1995n interfaceC1995n, InterfaceC1648d interfaceC1648d, boolean z) {
        super(interfaceC1995n);
        this.f7252e = c1987j;
        this.f7250c = interfaceC1648d;
        this.f7251d = z;
    }

    @Override // p139d.p143b.p184i.p200n.AbstractC1973c
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void mo7860b(C1716b<AbstractC1918b> c1716b, int i) {
        InterfaceC1844A interfaceC1844A;
        InterfaceC1844A interfaceC1844A2;
        boolean m8077a = AbstractC1973c.m8077a(i);
        C1716b<AbstractC1918b> c1716b2 = null;
        if (c1716b == null) {
            if (m8077a) {
                m8188c().mo8085a(null, i);
                return;
            }
            return;
        }
        if (c1716b.m7048n().m7893q() || AbstractC1973c.m8080b(i, 8)) {
            m8188c().mo8085a(c1716b, i);
            return;
        }
        if (!m8077a) {
            interfaceC1844A2 = this.f7252e.f7253a;
            C1716b<AbstractC1918b> c1716b3 = interfaceC1844A2.get(this.f7250c);
            if (c1716b3 != null) {
                try {
                    InterfaceC1923g mo7891o = c1716b.m7048n().mo7891o();
                    InterfaceC1923g mo7891o2 = c1716b3.m7048n().mo7891o();
                    if (mo7891o2.mo7930a() || mo7891o2.mo7932c() >= mo7891o.mo7932c()) {
                        m8188c().mo8085a(c1716b3, i);
                        return;
                    }
                } finally {
                    C1716b.m7045b(c1716b3);
                }
            }
        }
        if (this.f7251d) {
            interfaceC1844A = this.f7252e.f7253a;
            c1716b2 = interfaceC1844A.mo7552a(this.f7250c, c1716b);
        }
        if (m8077a) {
            try {
                m8188c().mo8083a(1.0f);
            } finally {
                C1716b.m7045b(c1716b2);
            }
        }
        InterfaceC1995n<C1716b<AbstractC1918b>> m8188c = m8188c();
        if (c1716b2 != null) {
            c1716b = c1716b2;
        }
        m8188c.mo8085a(c1716b, i);
    }
}
