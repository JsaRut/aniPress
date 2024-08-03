package p000a.p005b.p009c.p010a.p011a;

import p000a.p005b.p009c.p010a.p011a.C0030h;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: a.b.c.a.a.g */
/* loaded from: classes.dex */
public class RunnableC0029g implements Runnable {

    /* renamed from: a */
    final /* synthetic */ int f140a;

    /* renamed from: b */
    final /* synthetic */ C0030h.a f141b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC0029g(C0030h.a aVar, int i) {
        this.f141b = aVar;
        this.f140a = i;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f141b.mo139a(this.f140a);
    }
}
