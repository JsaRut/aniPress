package p139d.p143b.p184i.p200n;

import java.io.InputStream;
import p139d.p143b.p184i.p200n.InterfaceC1976da;

/* renamed from: d.b.i.n.ba */
/* loaded from: classes.dex */
class C1972ba implements InterfaceC1976da.a {

    /* renamed from: a */
    final /* synthetic */ C1935B f7208a;

    /* renamed from: b */
    final /* synthetic */ C1974ca f7209b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1972ba(C1974ca c1974ca, C1935B c1935b) {
        this.f7209b = c1974ca;
        this.f7208a = c1935b;
    }

    @Override // p139d.p143b.p184i.p200n.InterfaceC1976da.a
    /* renamed from: a */
    public void mo8073a() {
        this.f7209b.m8090a(this.f7208a);
    }

    @Override // p139d.p143b.p184i.p200n.InterfaceC1976da.a
    /* renamed from: a */
    public void mo8074a(InputStream inputStream, int i) {
        this.f7209b.m8096a(this.f7208a, inputStream, i);
    }

    @Override // p139d.p143b.p184i.p200n.InterfaceC1976da.a
    /* renamed from: a */
    public void mo8075a(Throwable th) {
        this.f7209b.m8091a(this.f7208a, th);
    }
}
