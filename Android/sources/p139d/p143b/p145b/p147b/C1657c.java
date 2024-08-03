package p139d.p143b.p145b.p147b;

import p139d.p143b.p145b.p147b.InterfaceC1662h;

/* renamed from: d.b.b.b.c */
/* loaded from: classes.dex */
class C1657c implements InterfaceC1666l {

    /* renamed from: a */
    final /* synthetic */ C1658d f6130a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1657c(C1658d c1658d) {
        this.f6130a = c1658d;
    }

    @Override // java.util.Comparator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(InterfaceC1662h.a aVar, InterfaceC1662h.a aVar2) {
        long mo6858b = aVar.mo6858b();
        long mo6858b2 = aVar2.mo6858b();
        if (mo6858b < mo6858b2) {
            return -1;
        }
        return mo6858b2 == mo6858b ? 0 : 1;
    }
}
