package p139d.p143b.p184i.p200n;

import p139d.p143b.p184i.p200n.InterfaceC1976da;

/* renamed from: d.b.i.n.C */
/* loaded from: classes.dex */
class RunnableC1937C implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C1935B f7110a;

    /* renamed from: b */
    final /* synthetic */ InterfaceC1976da.a f7111b;

    /* renamed from: c */
    final /* synthetic */ C1941E f7112c;

    public RunnableC1937C(C1941E c1941e, C1935B c1935b, InterfaceC1976da.a aVar) {
        this.f7112c = c1941e;
        this.f7110a = c1935b;
        this.f7111b = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f7112c.m7972b(this.f7110a, this.f7111b);
    }
}
