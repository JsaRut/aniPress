package p139d.p143b.p184i.p190d;

import java.util.concurrent.Callable;
import p139d.p143b.p145b.p146a.InterfaceC1648d;
import p139d.p143b.p145b.p147b.InterfaceC1668n;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: d.b.i.d.i */
/* loaded from: classes.dex */
public class CallableC1859i implements Callable<Void> {

    /* renamed from: a */
    final /* synthetic */ InterfaceC1648d f6804a;

    /* renamed from: b */
    final /* synthetic */ C1862l f6805b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CallableC1859i(C1862l c1862l, InterfaceC1648d interfaceC1648d) {
        this.f6805b = c1862l;
        this.f6804a = interfaceC1648d;
    }

    @Override // java.util.concurrent.Callable
    public Void call() {
        C1849F c1849f;
        InterfaceC1668n interfaceC1668n;
        c1849f = this.f6805b.f6815g;
        c1849f.m7578c(this.f6804a);
        interfaceC1668n = this.f6805b.f6810b;
        interfaceC1668n.mo6911c(this.f6804a);
        return null;
    }
}
