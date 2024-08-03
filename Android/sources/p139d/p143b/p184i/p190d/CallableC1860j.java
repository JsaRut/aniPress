package p139d.p143b.p184i.p190d;

import java.util.concurrent.Callable;
import p139d.p143b.p145b.p147b.InterfaceC1668n;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: d.b.i.d.j */
/* loaded from: classes.dex */
public class CallableC1860j implements Callable<Void> {

    /* renamed from: a */
    final /* synthetic */ C1862l f6806a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CallableC1860j(C1862l c1862l) {
        this.f6806a = c1862l;
    }

    @Override // java.util.concurrent.Callable
    public Void call() {
        C1849F c1849f;
        InterfaceC1668n interfaceC1668n;
        c1849f = this.f6806a.f6815g;
        c1849f.m7573a();
        interfaceC1668n = this.f6806a.f6810b;
        interfaceC1668n.mo6909a();
        return null;
    }
}
