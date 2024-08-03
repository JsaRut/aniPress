package p139d.p143b.p184i.p190d;

import p139d.p143b.p148c.p152d.InterfaceC1692k;
import p139d.p143b.p148c.p156h.C1716b;

/* renamed from: d.b.i.d.z */
/* loaded from: classes.dex */
public class C1876z<K, V> implements InterfaceC1844A<K, V> {

    /* renamed from: a */
    private final InterfaceC1844A<K, V> f6841a;

    /* renamed from: b */
    private final InterfaceC1846C f6842b;

    public C1876z(InterfaceC1844A<K, V> interfaceC1844A, InterfaceC1846C interfaceC1846C) {
        this.f6841a = interfaceC1844A;
        this.f6842b = interfaceC1846C;
    }

    @Override // p139d.p143b.p184i.p190d.InterfaceC1844A
    /* renamed from: a */
    public int mo7551a(InterfaceC1692k<K> interfaceC1692k) {
        return this.f6841a.mo7551a(interfaceC1692k);
    }

    @Override // p139d.p143b.p184i.p190d.InterfaceC1844A
    /* renamed from: a */
    public C1716b<V> mo7552a(K k, C1716b<V> c1716b) {
        this.f6842b.mo7554a();
        return this.f6841a.mo7552a(k, c1716b);
    }

    @Override // p139d.p143b.p184i.p190d.InterfaceC1844A
    /* renamed from: b */
    public boolean mo7553b(InterfaceC1692k<K> interfaceC1692k) {
        return this.f6841a.mo7553b(interfaceC1692k);
    }

    @Override // p139d.p143b.p184i.p190d.InterfaceC1844A
    public C1716b<V> get(K k) {
        C1716b<V> c1716b = this.f6841a.get(k);
        if (c1716b == null) {
            this.f6842b.mo7556b();
        } else {
            this.f6842b.mo7555a(k);
        }
        return c1716b;
    }
}
