package p139d.p143b.p184i.p200n;

import android.util.Pair;
import p139d.p143b.p145b.p146a.InterfaceC1648d;
import p139d.p143b.p148c.p156h.C1716b;
import p139d.p143b.p184i.p190d.InterfaceC1863m;
import p139d.p143b.p184i.p196j.AbstractC1918b;
import p139d.p143b.p184i.p201o.C2023c;

/* renamed from: d.b.i.n.h */
/* loaded from: classes.dex */
public class C1983h extends AbstractC1970aa<Pair<InterfaceC1648d, C2023c.b>, C1716b<AbstractC1918b>> {

    /* renamed from: c */
    private final InterfaceC1863m f7242c;

    public C1983h(InterfaceC1863m interfaceC1863m, InterfaceC1996na interfaceC1996na) {
        super(interfaceC1996na);
        this.f7242c = interfaceC1863m;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p139d.p143b.p184i.p200n.AbstractC1970aa
    /* renamed from: a */
    public Pair<InterfaceC1648d, C2023c.b> mo8050a(InterfaceC1998oa interfaceC1998oa) {
        return Pair.create(this.f7242c.mo7601a(interfaceC1998oa.mo8109c(), interfaceC1998oa.mo8103a()), interfaceC1998oa.mo8113g());
    }

    @Override // p139d.p143b.p184i.p200n.AbstractC1970aa
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public C1716b<AbstractC1918b> mo8049a(C1716b<AbstractC1918b> c1716b) {
        return C1716b.m7042a((C1716b) c1716b);
    }
}
