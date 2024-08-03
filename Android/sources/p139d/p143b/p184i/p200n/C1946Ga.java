package p139d.p143b.p184i.p200n;

import p139d.p143b.p148c.p152d.C1691j;
import p139d.p143b.p184i.p191e.C1881e;
import p139d.p143b.p184i.p196j.C1920d;

/* renamed from: d.b.i.n.Ga */
/* loaded from: classes.dex */
public class C1946Ga implements InterfaceC1996na<C1920d> {

    /* renamed from: a */
    private final InterfaceC1948Ha<C1920d>[] f7131a;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d.b.i.n.Ga$a */
    /* loaded from: classes.dex */
    public class a extends AbstractC2005s<C1920d, C1920d> {

        /* renamed from: c */
        private final InterfaceC1998oa f7132c;

        /* renamed from: d */
        private final int f7133d;

        /* renamed from: e */
        private final C1881e f7134e;

        public a(InterfaceC1995n<C1920d> interfaceC1995n, InterfaceC1998oa interfaceC1998oa, int i) {
            super(interfaceC1995n);
            this.f7132c = interfaceC1998oa;
            this.f7133d = i;
            this.f7134e = this.f7132c.mo8109c().m8246l();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p139d.p143b.p184i.p200n.AbstractC1973c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo7860b(C1920d c1920d, int i) {
            if (c1920d != null && (AbstractC1973c.m8079b(i) || C1950Ia.m7998a(c1920d, this.f7134e))) {
                m8188c().mo8085a(c1920d, i);
            } else if (AbstractC1973c.m8077a(i)) {
                C1920d.m7902b(c1920d);
                if (C1946Ga.this.m7979a(this.f7133d + 1, m8188c(), this.f7132c)) {
                    return;
                }
                m8188c().mo8085a(null, 1);
            }
        }

        @Override // p139d.p143b.p184i.p200n.AbstractC2005s, p139d.p143b.p184i.p200n.AbstractC1973c
        /* renamed from: b */
        protected void mo7861b(Throwable th) {
            if (C1946Ga.this.m7979a(this.f7133d + 1, m8188c(), this.f7132c)) {
                return;
            }
            m8188c().mo8086a(th);
        }
    }

    public C1946Ga(InterfaceC1948Ha<C1920d>... interfaceC1948HaArr) {
        C1691j.m6971a(interfaceC1948HaArr);
        this.f7131a = interfaceC1948HaArr;
        C1691j.m6969a(0, this.f7131a.length);
    }

    /* renamed from: a */
    private int m7978a(int i, C1881e c1881e) {
        while (true) {
            InterfaceC1948Ha<C1920d>[] interfaceC1948HaArr = this.f7131a;
            if (i >= interfaceC1948HaArr.length) {
                return -1;
            }
            if (interfaceC1948HaArr[i].mo7982a(c1881e)) {
                return i;
            }
            i++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public boolean m7979a(int i, InterfaceC1995n<C1920d> interfaceC1995n, InterfaceC1998oa interfaceC1998oa) {
        int m7978a = m7978a(i, interfaceC1998oa.mo8109c().m8246l());
        if (m7978a == -1) {
            return false;
        }
        this.f7131a[m7978a].mo7950a(new a(interfaceC1995n, interfaceC1998oa, m7978a), interfaceC1998oa);
        return true;
    }

    @Override // p139d.p143b.p184i.p200n.InterfaceC1996na
    /* renamed from: a */
    public void mo7950a(InterfaceC1995n<C1920d> interfaceC1995n, InterfaceC1998oa interfaceC1998oa) {
        if (interfaceC1998oa.mo8109c().m8246l() != null && m7979a(0, interfaceC1995n, interfaceC1998oa)) {
            return;
        }
        interfaceC1995n.mo8085a(null, 1);
    }
}
