package p139d.p143b.p169g.p175c;

import p139d.p143b.p161d.AbstractC1735d;
import p139d.p143b.p161d.InterfaceC1736e;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: Add missing generic type declarations: [T] */
/* renamed from: d.b.g.c.a */
/* loaded from: classes.dex */
public class C1773a<T> extends AbstractC1735d<T> {

    /* renamed from: a */
    final /* synthetic */ String f6452a;

    /* renamed from: b */
    final /* synthetic */ boolean f6453b;

    /* renamed from: c */
    final /* synthetic */ AbstractC1774b f6454c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1773a(AbstractC1774b abstractC1774b, String str, boolean z) {
        this.f6454c = abstractC1774b;
        this.f6452a = str;
        this.f6453b = z;
    }

    @Override // p139d.p143b.p161d.AbstractC1735d, p139d.p143b.p161d.InterfaceC1739h
    /* renamed from: d */
    public void mo7126d(InterfaceC1736e<T> interfaceC1736e) {
        boolean mo7117b = interfaceC1736e.mo7117b();
        this.f6454c.m7263a(this.f6452a, interfaceC1736e, interfaceC1736e.mo7119d(), mo7117b);
    }

    @Override // p139d.p143b.p161d.AbstractC1735d
    /* renamed from: e */
    public void mo5357e(InterfaceC1736e<T> interfaceC1736e) {
        this.f6454c.m7265a(this.f6452a, (InterfaceC1736e) interfaceC1736e, interfaceC1736e.mo7118c(), true);
    }

    @Override // p139d.p143b.p161d.AbstractC1735d
    /* renamed from: f */
    public void mo5358f(InterfaceC1736e<T> interfaceC1736e) {
        boolean mo7117b = interfaceC1736e.mo7117b();
        float mo7119d = interfaceC1736e.mo7119d();
        T result = interfaceC1736e.getResult();
        if (result != null) {
            this.f6454c.m7264a(this.f6452a, interfaceC1736e, result, mo7119d, mo7117b, this.f6453b);
        } else if (mo7117b) {
            this.f6454c.m7265a(this.f6452a, (InterfaceC1736e) interfaceC1736e, (Throwable) new NullPointerException(), true);
        }
    }
}
