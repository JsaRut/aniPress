package p139d.p143b.p184i.p200n;

import p139d.p143b.p148c.p152d.C1691j;

/* renamed from: d.b.i.n.Ba */
/* loaded from: classes.dex */
public class C1936Ba<T> implements InterfaceC1996na<T> {

    /* renamed from: a */
    private final InterfaceC1996na<T> f7108a;

    /* renamed from: b */
    private final C1938Ca f7109b;

    public C1936Ba(InterfaceC1996na<T> interfaceC1996na, C1938Ca c1938Ca) {
        C1691j.m6971a(interfaceC1996na);
        this.f7108a = interfaceC1996na;
        this.f7109b = c1938Ca;
    }

    @Override // p139d.p143b.p184i.p200n.InterfaceC1996na
    /* renamed from: a */
    public void mo7950a(InterfaceC1995n<T> interfaceC1995n, InterfaceC1998oa interfaceC1998oa) {
        InterfaceC2002qa mo8111e = interfaceC1998oa.mo8111e();
        String id = interfaceC1998oa.getId();
        C2020za c2020za = new C2020za(this, interfaceC1995n, mo8111e, "BackgroundThreadHandoffProducer", id, mo8111e, id, interfaceC1995n, interfaceC1998oa);
        interfaceC1998oa.mo8106a(new C1934Aa(this, c2020za));
        this.f7109b.m7965a(c2020za);
    }
}
