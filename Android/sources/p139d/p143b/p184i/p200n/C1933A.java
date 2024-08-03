package p139d.p143b.p184i.p200n;

import p139d.p143b.p145b.p146a.InterfaceC1648d;
import p139d.p143b.p148c.p152d.C1687f;
import p139d.p143b.p148c.p155g.InterfaceC1710g;
import p139d.p143b.p148c.p156h.C1716b;
import p139d.p143b.p184i.p190d.InterfaceC1844A;
import p139d.p143b.p184i.p190d.InterfaceC1863m;
import p139d.p143b.p184i.p196j.C1920d;
import p139d.p143b.p184i.p201o.C2023c;

/* renamed from: d.b.i.n.A */
/* loaded from: classes.dex */
public class C1933A implements InterfaceC1996na<C1920d> {

    /* renamed from: a */
    private final InterfaceC1844A<InterfaceC1648d, InterfaceC1710g> f7095a;

    /* renamed from: b */
    private final InterfaceC1863m f7096b;

    /* renamed from: c */
    private final InterfaceC1996na<C1920d> f7097c;

    /* renamed from: d.b.i.n.A$a */
    /* loaded from: classes.dex */
    private static class a extends AbstractC2005s<C1920d, C1920d> {

        /* renamed from: c */
        private final InterfaceC1844A<InterfaceC1648d, InterfaceC1710g> f7098c;

        /* renamed from: d */
        private final InterfaceC1648d f7099d;

        /* renamed from: e */
        private final boolean f7100e;

        public a(InterfaceC1995n<C1920d> interfaceC1995n, InterfaceC1844A<InterfaceC1648d, InterfaceC1710g> interfaceC1844A, InterfaceC1648d interfaceC1648d, boolean z) {
            super(interfaceC1995n);
            this.f7098c = interfaceC1844A;
            this.f7099d = interfaceC1648d;
            this.f7100e = z;
        }

        @Override // p139d.p143b.p184i.p200n.AbstractC1973c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo7860b(C1920d c1920d, int i) {
            C1716b<InterfaceC1710g> m7917n;
            if (!AbstractC1973c.m8079b(i) && c1920d != null && !AbstractC1973c.m8078a(i, 10) && (m7917n = c1920d.m7917n()) != null) {
                try {
                    C1716b<InterfaceC1710g> mo7552a = this.f7100e ? this.f7098c.mo7552a(this.f7099d, m7917n) : null;
                    if (mo7552a != null) {
                        try {
                            C1920d c1920d2 = new C1920d(mo7552a);
                            c1920d2.m7909c(c1920d);
                            try {
                                m8188c().mo8083a(1.0f);
                                m8188c().mo8085a(c1920d2, i);
                                return;
                            } finally {
                                C1920d.m7902b(c1920d2);
                            }
                        } finally {
                            C1716b.m7045b(mo7552a);
                        }
                    }
                } finally {
                    C1716b.m7045b(m7917n);
                }
            }
            m8188c().mo8085a(c1920d, i);
        }
    }

    public C1933A(InterfaceC1844A<InterfaceC1648d, InterfaceC1710g> interfaceC1844A, InterfaceC1863m interfaceC1863m, InterfaceC1996na<C1920d> interfaceC1996na) {
        this.f7095a = interfaceC1844A;
        this.f7096b = interfaceC1863m;
        this.f7097c = interfaceC1996na;
    }

    @Override // p139d.p143b.p184i.p200n.InterfaceC1996na
    /* renamed from: a */
    public void mo7950a(InterfaceC1995n<C1920d> interfaceC1995n, InterfaceC1998oa interfaceC1998oa) {
        String id = interfaceC1998oa.getId();
        InterfaceC2002qa mo8111e = interfaceC1998oa.mo8111e();
        mo8111e.mo5339a(id, "EncodedMemoryCacheProducer");
        InterfaceC1648d mo7603c = this.f7096b.mo7603c(interfaceC1998oa.mo8109c(), interfaceC1998oa.mo8103a());
        C1716b<InterfaceC1710g> c1716b = this.f7095a.get(mo7603c);
        try {
            if (c1716b != null) {
                C1920d c1920d = new C1920d(c1716b);
                try {
                    mo8111e.mo5345b(id, "EncodedMemoryCacheProducer", mo8111e.mo5343a(id) ? C1687f.m6957a("cached_value_found", "true") : null);
                    mo8111e.mo7174a(id, "EncodedMemoryCacheProducer", true);
                    interfaceC1995n.mo8083a(1.0f);
                    interfaceC1995n.mo8085a(c1920d, 1);
                    return;
                } finally {
                    C1920d.m7902b(c1920d);
                }
            }
            if (interfaceC1998oa.mo8113g().m8254b() >= C2023c.b.ENCODED_MEMORY_CACHE.m8254b()) {
                mo8111e.mo5345b(id, "EncodedMemoryCacheProducer", mo8111e.mo5343a(id) ? C1687f.m6957a("cached_value_found", "false") : null);
                mo8111e.mo7174a(id, "EncodedMemoryCacheProducer", false);
                interfaceC1995n.mo8085a(null, 1);
            } else {
                a aVar = new a(interfaceC1995n, this.f7095a, mo7603c, interfaceC1998oa.mo8109c().m8252r());
                mo8111e.mo5345b(id, "EncodedMemoryCacheProducer", mo8111e.mo5343a(id) ? C1687f.m6957a("cached_value_found", "false") : null);
                this.f7097c.mo7950a(aVar, interfaceC1998oa);
            }
        } finally {
            C1716b.m7045b(c1716b);
        }
    }
}
