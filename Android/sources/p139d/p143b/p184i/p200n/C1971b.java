package p139d.p143b.p184i.p200n;

import p139d.p143b.p184i.p196j.C1920d;

/* renamed from: d.b.i.n.b */
/* loaded from: classes.dex */
public class C1971b implements InterfaceC1996na<C1920d> {

    /* renamed from: a */
    private final InterfaceC1996na<C1920d> f7207a;

    /* renamed from: d.b.i.n.b$a */
    /* loaded from: classes.dex */
    private static class a extends AbstractC2005s<C1920d, C1920d> {
        private a(InterfaceC1995n<C1920d> interfaceC1995n) {
            super(interfaceC1995n);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p139d.p143b.p184i.p200n.AbstractC1973c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo7860b(C1920d c1920d, int i) {
            if (c1920d == null) {
                m8188c().mo8085a(null, i);
                return;
            }
            if (!C1920d.m7903d(c1920d)) {
                c1920d.m7928y();
            }
            m8188c().mo8085a(c1920d, i);
        }
    }

    public C1971b(InterfaceC1996na<C1920d> interfaceC1996na) {
        this.f7207a = interfaceC1996na;
    }

    @Override // p139d.p143b.p184i.p200n.InterfaceC1996na
    /* renamed from: a */
    public void mo7950a(InterfaceC1995n<C1920d> interfaceC1995n, InterfaceC1998oa interfaceC1998oa) {
        this.f7207a.mo7950a(new a(interfaceC1995n), interfaceC1998oa);
    }
}
