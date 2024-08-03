package p139d.p143b.p184i.p200n;

import p139d.p143b.p183h.C1827c;
import p139d.p143b.p184i.p190d.C1862l;
import p139d.p143b.p184i.p190d.InterfaceC1863m;
import p139d.p143b.p184i.p196j.C1920d;
import p139d.p143b.p184i.p201o.C2023c;

/* renamed from: d.b.i.n.x */
/* loaded from: classes.dex */
public class C2015x implements InterfaceC1996na<C1920d> {

    /* renamed from: a */
    private final C1862l f7345a;

    /* renamed from: b */
    private final C1862l f7346b;

    /* renamed from: c */
    private final InterfaceC1863m f7347c;

    /* renamed from: d */
    private final InterfaceC1996na<C1920d> f7348d;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d.b.i.n.x$a */
    /* loaded from: classes.dex */
    public static class a extends AbstractC2005s<C1920d, C1920d> {

        /* renamed from: c */
        private final InterfaceC1998oa f7349c;

        /* renamed from: d */
        private final C1862l f7350d;

        /* renamed from: e */
        private final C1862l f7351e;

        /* renamed from: f */
        private final InterfaceC1863m f7352f;

        private a(InterfaceC1995n<C1920d> interfaceC1995n, InterfaceC1998oa interfaceC1998oa, C1862l c1862l, C1862l c1862l2, InterfaceC1863m interfaceC1863m) {
            super(interfaceC1995n);
            this.f7349c = interfaceC1998oa;
            this.f7350d = c1862l;
            this.f7351e = c1862l2;
            this.f7352f = interfaceC1863m;
        }

        @Override // p139d.p143b.p184i.p200n.AbstractC1973c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo7860b(C1920d c1920d, int i) {
            if (!AbstractC1973c.m8079b(i) && c1920d != null && !AbstractC1973c.m8078a(i, 10) && c1920d.m7921r() != C1827c.f6749a) {
                C2023c mo8109c = this.f7349c.mo8109c();
                (mo8109c.m8236b() == C2023c.a.SMALL ? this.f7351e : this.f7350d).m7595a(this.f7352f.mo7603c(mo8109c, this.f7349c.mo8103a()), c1920d);
            }
            m8188c().mo8085a(c1920d, i);
        }
    }

    public C2015x(C1862l c1862l, C1862l c1862l2, InterfaceC1863m interfaceC1863m, InterfaceC1996na<C1920d> interfaceC1996na) {
        this.f7345a = c1862l;
        this.f7346b = c1862l2;
        this.f7347c = interfaceC1863m;
        this.f7348d = interfaceC1996na;
    }

    /* renamed from: b */
    private void m8226b(InterfaceC1995n<C1920d> interfaceC1995n, InterfaceC1998oa interfaceC1998oa) {
        if (interfaceC1998oa.mo8113g().m8254b() >= C2023c.b.DISK_CACHE.m8254b()) {
            interfaceC1995n.mo8085a(null, 1);
            return;
        }
        if (interfaceC1998oa.mo8109c().m8251q()) {
            interfaceC1995n = new a(interfaceC1995n, interfaceC1998oa, this.f7345a, this.f7346b, this.f7347c);
        }
        this.f7348d.mo7950a(interfaceC1995n, interfaceC1998oa);
    }

    @Override // p139d.p143b.p184i.p200n.InterfaceC1996na
    /* renamed from: a */
    public void mo7950a(InterfaceC1995n<C1920d> interfaceC1995n, InterfaceC1998oa interfaceC1998oa) {
        m8226b(interfaceC1995n, interfaceC1998oa);
    }
}
