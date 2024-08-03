package p139d.p143b.p184i.p200n;

import p139d.p143b.p145b.p146a.InterfaceC1648d;
import p139d.p143b.p148c.p152d.C1687f;
import p139d.p143b.p148c.p156h.C1716b;
import p139d.p143b.p184i.p190d.InterfaceC1844A;
import p139d.p143b.p184i.p190d.InterfaceC1863m;
import p139d.p143b.p184i.p196j.AbstractC1918b;
import p139d.p143b.p184i.p201o.C2023c;
import p139d.p143b.p184i.p201o.InterfaceC2025e;
import p139d.p143b.p184i.p201o.InterfaceC2026f;

/* renamed from: d.b.i.n.ha */
/* loaded from: classes.dex */
public class C1984ha implements InterfaceC1996na<C1716b<AbstractC1918b>> {

    /* renamed from: a */
    private final InterfaceC1844A<InterfaceC1648d, AbstractC1918b> f7243a;

    /* renamed from: b */
    private final InterfaceC1863m f7244b;

    /* renamed from: c */
    private final InterfaceC1996na<C1716b<AbstractC1918b>> f7245c;

    /* renamed from: d.b.i.n.ha$a */
    /* loaded from: classes.dex */
    public static class a extends AbstractC2005s<C1716b<AbstractC1918b>, C1716b<AbstractC1918b>> {

        /* renamed from: c */
        private final InterfaceC1648d f7246c;

        /* renamed from: d */
        private final boolean f7247d;

        /* renamed from: e */
        private final InterfaceC1844A<InterfaceC1648d, AbstractC1918b> f7248e;

        /* renamed from: f */
        private final boolean f7249f;

        public a(InterfaceC1995n<C1716b<AbstractC1918b>> interfaceC1995n, InterfaceC1648d interfaceC1648d, boolean z, InterfaceC1844A<InterfaceC1648d, AbstractC1918b> interfaceC1844A, boolean z2) {
            super(interfaceC1995n);
            this.f7246c = interfaceC1648d;
            this.f7247d = z;
            this.f7248e = interfaceC1844A;
            this.f7249f = z2;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p139d.p143b.p184i.p200n.AbstractC1973c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo7860b(C1716b<AbstractC1918b> c1716b, int i) {
            if (c1716b == null) {
                if (AbstractC1973c.m8077a(i)) {
                    m8188c().mo8085a(null, i);
                }
            } else if (!AbstractC1973c.m8079b(i) || this.f7247d) {
                C1716b<AbstractC1918b> mo7552a = this.f7249f ? this.f7248e.mo7552a(this.f7246c, c1716b) : null;
                try {
                    m8188c().mo8083a(1.0f);
                    InterfaceC1995n<C1716b<AbstractC1918b>> m8188c = m8188c();
                    if (mo7552a != null) {
                        c1716b = mo7552a;
                    }
                    m8188c.mo8085a(c1716b, i);
                } finally {
                    C1716b.m7045b(mo7552a);
                }
            }
        }
    }

    public C1984ha(InterfaceC1844A<InterfaceC1648d, AbstractC1918b> interfaceC1844A, InterfaceC1863m interfaceC1863m, InterfaceC1996na<C1716b<AbstractC1918b>> interfaceC1996na) {
        this.f7243a = interfaceC1844A;
        this.f7244b = interfaceC1863m;
        this.f7245c = interfaceC1996na;
    }

    /* renamed from: a */
    protected String m8130a() {
        return "PostprocessedBitmapMemoryCacheProducer";
    }

    @Override // p139d.p143b.p184i.p200n.InterfaceC1996na
    /* renamed from: a */
    public void mo7950a(InterfaceC1995n<C1716b<AbstractC1918b>> interfaceC1995n, InterfaceC1998oa interfaceC1998oa) {
        InterfaceC2002qa mo8111e = interfaceC1998oa.mo8111e();
        String id = interfaceC1998oa.getId();
        C2023c mo8109c = interfaceC1998oa.mo8109c();
        Object mo8103a = interfaceC1998oa.mo8103a();
        InterfaceC2025e m8240f = mo8109c.m8240f();
        if (m8240f == null || m8240f.mo5999a() == null) {
            this.f7245c.mo7950a(interfaceC1995n, interfaceC1998oa);
            return;
        }
        mo8111e.mo5339a(id, m8130a());
        InterfaceC1648d mo7602b = this.f7244b.mo7602b(mo8109c, mo8103a);
        C1716b<AbstractC1918b> c1716b = this.f7243a.get(mo7602b);
        if (c1716b == null) {
            a aVar = new a(interfaceC1995n, mo7602b, m8240f instanceof InterfaceC2026f, this.f7243a, interfaceC1998oa.mo8109c().m8252r());
            mo8111e.mo5345b(id, m8130a(), mo8111e.mo5343a(id) ? C1687f.m6957a("cached_value_found", "false") : null);
            this.f7245c.mo7950a(aVar, interfaceC1998oa);
        } else {
            mo8111e.mo5345b(id, m8130a(), mo8111e.mo5343a(id) ? C1687f.m6957a("cached_value_found", "true") : null);
            mo8111e.mo7174a(id, "PostprocessedBitmapMemoryCacheProducer", true);
            interfaceC1995n.mo8083a(1.0f);
            interfaceC1995n.mo8085a(c1716b, 1);
            c1716b.close();
        }
    }
}
