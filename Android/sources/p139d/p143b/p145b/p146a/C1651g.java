package p139d.p143b.p145b.p146a;

import p139d.p143b.p145b.p146a.InterfaceC1645a;

/* renamed from: d.b.b.a.g */
/* loaded from: classes.dex */
public class C1651g implements InterfaceC1645a {

    /* renamed from: a */
    private static C1651g f6105a;

    private C1651g() {
    }

    /* renamed from: a */
    public static synchronized C1651g m6823a() {
        C1651g c1651g;
        synchronized (C1651g.class) {
            if (f6105a == null) {
                f6105a = new C1651g();
            }
            c1651g = f6105a;
        }
        return c1651g;
    }

    @Override // p139d.p143b.p145b.p146a.InterfaceC1645a
    /* renamed from: a */
    public void mo6808a(InterfaceC1645a.a aVar, Class<?> cls, String str, Throwable th) {
    }
}
