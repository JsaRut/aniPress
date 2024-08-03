package p139d.p143b.p184i.p200n;

import p139d.p143b.p184i.p196j.C1920d;
import p139d.p143b.p184i.p201o.C2023c;

/* renamed from: d.b.i.n.m */
/* loaded from: classes.dex */
public class C1993m implements InterfaceC1996na<C1920d> {

    /* renamed from: a */
    private final InterfaceC1996na<C1920d> f7281a;

    /* renamed from: b */
    private final InterfaceC1996na<C1920d> f7282b;

    /* renamed from: d.b.i.n.m$a */
    /* loaded from: classes.dex */
    private class a extends AbstractC2005s<C1920d, C1920d> {

        /* renamed from: c */
        private InterfaceC1998oa f7283c;

        private a(InterfaceC1995n<C1920d> interfaceC1995n, InterfaceC1998oa interfaceC1998oa) {
            super(interfaceC1995n);
            this.f7283c = interfaceC1998oa;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p139d.p143b.p184i.p200n.AbstractC1973c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo7860b(C1920d c1920d, int i) {
            C2023c mo8109c = this.f7283c.mo8109c();
            boolean m8077a = AbstractC1973c.m8077a(i);
            boolean m7998a = C1950Ia.m7998a(c1920d, mo8109c.m8246l());
            if (c1920d != null && (m7998a || mo8109c.m8238d())) {
                if (!m8077a || !m7998a) {
                    i = AbstractC1973c.m8081c(i, 1);
                }
                m8188c().mo8085a(c1920d, i);
            }
            if (!m8077a || m7998a) {
                return;
            }
            C1920d.m7902b(c1920d);
            C1993m.this.f7282b.mo7950a(m8188c(), this.f7283c);
        }

        @Override // p139d.p143b.p184i.p200n.AbstractC2005s, p139d.p143b.p184i.p200n.AbstractC1973c
        /* renamed from: b */
        protected void mo7861b(Throwable th) {
            C1993m.this.f7282b.mo7950a(m8188c(), this.f7283c);
        }
    }

    public C1993m(InterfaceC1996na<C1920d> interfaceC1996na, InterfaceC1996na<C1920d> interfaceC1996na2) {
        this.f7281a = interfaceC1996na;
        this.f7282b = interfaceC1996na2;
    }

    @Override // p139d.p143b.p184i.p200n.InterfaceC1996na
    /* renamed from: a */
    public void mo7950a(InterfaceC1995n<C1920d> interfaceC1995n, InterfaceC1998oa interfaceC1998oa) {
        this.f7281a.mo7950a(new a(interfaceC1995n, interfaceC1998oa), interfaceC1998oa);
    }
}
