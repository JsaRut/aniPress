package p139d.p143b.p184i.p193g;

import p139d.p143b.p148c.p156h.C1716b;
import p139d.p143b.p161d.InterfaceC1736e;
import p139d.p143b.p184i.p197k.InterfaceC1926c;
import p139d.p143b.p184i.p200n.C2012va;
import p139d.p143b.p184i.p200n.InterfaceC1996na;

/* renamed from: d.b.i.g.c */
/* loaded from: classes.dex */
public class C1905c<T> extends AbstractC1904b<C1716b<T>> {
    private C1905c(InterfaceC1996na<C1716b<T>> interfaceC1996na, C2012va c2012va, InterfaceC1926c interfaceC1926c) {
        super(interfaceC1996na, c2012va, interfaceC1926c);
    }

    /* renamed from: a */
    public static <T> InterfaceC1736e<C1716b<T>> m7869a(InterfaceC1996na<C1716b<T>> interfaceC1996na, C2012va c2012va, InterfaceC1926c interfaceC1926c) {
        return new C1905c(interfaceC1996na, c2012va, interfaceC1926c);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p139d.p143b.p161d.AbstractC1734c
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void mo7112a(C1716b<T> c1716b) {
        C1716b.m7045b(c1716b);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p139d.p143b.p184i.p193g.AbstractC1904b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void mo7868a(C1716b<T> c1716b, int i) {
        super.mo7868a((C1905c<T>) C1716b.m7042a((C1716b) c1716b), i);
    }

    @Override // p139d.p143b.p161d.AbstractC1734c, p139d.p143b.p161d.InterfaceC1736e
    public C1716b<T> getResult() {
        return C1716b.m7042a((C1716b) super.getResult());
    }
}
