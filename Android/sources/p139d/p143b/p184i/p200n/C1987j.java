package p139d.p143b.p184i.p200n;

import p139d.p143b.p145b.p146a.InterfaceC1648d;
import p139d.p143b.p148c.p152d.C1687f;
import p139d.p143b.p148c.p156h.C1716b;
import p139d.p143b.p184i.p190d.InterfaceC1844A;
import p139d.p143b.p184i.p190d.InterfaceC1863m;
import p139d.p143b.p184i.p196j.AbstractC1918b;
import p139d.p143b.p184i.p201o.C2023c;

/* renamed from: d.b.i.n.j */
/* loaded from: classes.dex */
public class C1987j implements InterfaceC1996na<C1716b<AbstractC1918b>> {

    /* renamed from: a */
    private final InterfaceC1844A<InterfaceC1648d, AbstractC1918b> f7253a;

    /* renamed from: b */
    private final InterfaceC1863m f7254b;

    /* renamed from: c */
    private final InterfaceC1996na<C1716b<AbstractC1918b>> f7255c;

    public C1987j(InterfaceC1844A<InterfaceC1648d, AbstractC1918b> interfaceC1844A, InterfaceC1863m interfaceC1863m, InterfaceC1996na<C1716b<AbstractC1918b>> interfaceC1996na) {
        this.f7253a = interfaceC1844A;
        this.f7254b = interfaceC1863m;
        this.f7255c = interfaceC1996na;
    }

    /* renamed from: a */
    protected InterfaceC1995n<C1716b<AbstractC1918b>> mo8116a(InterfaceC1995n<C1716b<AbstractC1918b>> interfaceC1995n, InterfaceC1648d interfaceC1648d, boolean z) {
        return new C1985i(this, interfaceC1995n, interfaceC1648d, z);
    }

    /* renamed from: a */
    protected String mo8117a() {
        return "BitmapMemoryCacheProducer";
    }

    @Override // p139d.p143b.p184i.p200n.InterfaceC1996na
    /* renamed from: a */
    public void mo7950a(InterfaceC1995n<C1716b<AbstractC1918b>> interfaceC1995n, InterfaceC1998oa interfaceC1998oa) {
        InterfaceC2002qa mo8111e = interfaceC1998oa.mo8111e();
        String id = interfaceC1998oa.getId();
        mo8111e.mo5339a(id, mo8117a());
        InterfaceC1648d mo7601a = this.f7254b.mo7601a(interfaceC1998oa.mo8109c(), interfaceC1998oa.mo8103a());
        C1716b<AbstractC1918b> c1716b = this.f7253a.get(mo7601a);
        if (c1716b != null) {
            boolean mo7930a = c1716b.m7048n().mo7891o().mo7930a();
            if (mo7930a) {
                mo8111e.mo5345b(id, mo8117a(), mo8111e.mo5343a(id) ? C1687f.m6957a("cached_value_found", "true") : null);
                mo8111e.mo7174a(id, mo8117a(), true);
                interfaceC1995n.mo8083a(1.0f);
            }
            AbstractC1973c.m8076a(mo7930a);
            interfaceC1995n.mo8085a(c1716b, mo7930a ? 1 : 0);
            c1716b.close();
            if (mo7930a) {
                return;
            }
        }
        if (interfaceC1998oa.mo8113g().m8254b() >= C2023c.b.BITMAP_MEMORY_CACHE.m8254b()) {
            mo8111e.mo5345b(id, mo8117a(), mo8111e.mo5343a(id) ? C1687f.m6957a("cached_value_found", "false") : null);
            mo8111e.mo7174a(id, mo8117a(), false);
            interfaceC1995n.mo8085a(null, 1);
        } else {
            InterfaceC1995n<C1716b<AbstractC1918b>> mo8116a = mo8116a(interfaceC1995n, mo7601a, interfaceC1998oa.mo8109c().m8252r());
            mo8111e.mo5345b(id, mo8117a(), mo8111e.mo5343a(id) ? C1687f.m6957a("cached_value_found", "false") : null);
            this.f7255c.mo7950a(mo8116a, interfaceC1998oa);
        }
    }
}
