package p139d.p143b.p184i.p200n;

import java.util.concurrent.Future;
import p139d.p143b.p184i.p200n.InterfaceC1976da;

/* renamed from: d.b.i.n.D */
/* loaded from: classes.dex */
class C1939D extends C1979f {

    /* renamed from: a */
    final /* synthetic */ Future f7116a;

    /* renamed from: b */
    final /* synthetic */ InterfaceC1976da.a f7117b;

    /* renamed from: c */
    final /* synthetic */ C1941E f7118c;

    public C1939D(C1941E c1941e, Future future, InterfaceC1976da.a aVar) {
        this.f7118c = c1941e;
        this.f7116a = future;
        this.f7117b = aVar;
    }

    @Override // p139d.p143b.p184i.p200n.InterfaceC2000pa
    /* renamed from: a */
    public void mo7534a() {
        if (this.f7116a.cancel(false)) {
            this.f7117b.mo8073a();
        }
    }
}
