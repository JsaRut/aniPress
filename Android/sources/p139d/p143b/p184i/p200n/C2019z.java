package p139d.p143b.p184i.p200n;

import android.util.Pair;
import p139d.p143b.p145b.p146a.InterfaceC1648d;
import p139d.p143b.p184i.p190d.InterfaceC1863m;
import p139d.p143b.p184i.p196j.C1920d;
import p139d.p143b.p184i.p201o.C2023c;

/* renamed from: d.b.i.n.z */
/* loaded from: classes.dex */
public class C2019z extends AbstractC1970aa<Pair<InterfaceC1648d, C2023c.b>, C1920d> {

    /* renamed from: c */
    private final InterfaceC1863m f7355c;

    public C2019z(InterfaceC1863m interfaceC1863m, InterfaceC1996na interfaceC1996na) {
        super(interfaceC1996na);
        this.f7355c = interfaceC1863m;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p139d.p143b.p184i.p200n.AbstractC1970aa
    /* renamed from: a */
    public Pair<InterfaceC1648d, C2023c.b> mo8050a(InterfaceC1998oa interfaceC1998oa) {
        return Pair.create(this.f7355c.mo7603c(interfaceC1998oa.mo8109c(), interfaceC1998oa.mo8103a()), interfaceC1998oa.mo8113g());
    }

    @Override // p139d.p143b.p184i.p200n.AbstractC1970aa
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public C1920d mo8049a(C1920d c1920d) {
        return C1920d.m7901a(c1920d);
    }
}
