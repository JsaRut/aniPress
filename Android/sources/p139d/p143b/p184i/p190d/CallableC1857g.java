package p139d.p143b.p184i.p190d;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import p139d.p143b.p145b.p146a.InterfaceC1648d;
import p139d.p143b.p148c.p153e.C1700a;
import p139d.p143b.p148c.p155g.InterfaceC1710g;
import p139d.p143b.p148c.p156h.C1716b;
import p139d.p143b.p184i.p196j.C1920d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: d.b.i.d.g */
/* loaded from: classes.dex */
public class CallableC1857g implements Callable<C1920d> {

    /* renamed from: a */
    final /* synthetic */ AtomicBoolean f6798a;

    /* renamed from: b */
    final /* synthetic */ InterfaceC1648d f6799b;

    /* renamed from: c */
    final /* synthetic */ C1862l f6800c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CallableC1857g(C1862l c1862l, AtomicBoolean atomicBoolean, InterfaceC1648d interfaceC1648d) {
        this.f6800c = c1862l;
        this.f6798a = atomicBoolean;
        this.f6799b = interfaceC1648d;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.concurrent.Callable
    public C1920d call() {
        C1849F c1849f;
        Class cls;
        InterfaceC1875y interfaceC1875y;
        InterfaceC1710g m7593e;
        Class cls2;
        Class cls3;
        InterfaceC1875y interfaceC1875y2;
        if (this.f6798a.get()) {
            throw new CancellationException();
        }
        c1849f = this.f6800c.f6815g;
        C1920d m7576b = c1849f.m7576b(this.f6799b);
        if (m7576b != null) {
            cls3 = C1862l.f6809a;
            C1700a.m7002b((Class<?>) cls3, "Found image for %s in staging area", this.f6799b.mo6817a());
            interfaceC1875y2 = this.f6800c.f6816h;
            interfaceC1875y2.mo7565c(this.f6799b);
        } else {
            cls = C1862l.f6809a;
            C1700a.m7002b((Class<?>) cls, "Did not find image for %s in staging area", this.f6799b.mo6817a());
            interfaceC1875y = this.f6800c.f6816h;
            interfaceC1875y.mo7568f();
            try {
                m7593e = this.f6800c.m7593e(this.f6799b);
                C1716b m7043a = C1716b.m7043a(m7593e);
                try {
                    m7576b = new C1920d((C1716b<InterfaceC1710g>) m7043a);
                } finally {
                    C1716b.m7045b(m7043a);
                }
            } catch (Exception unused) {
                return null;
            }
        }
        if (!Thread.interrupted()) {
            return m7576b;
        }
        cls2 = C1862l.f6809a;
        C1700a.m7001b((Class<?>) cls2, "Host thread was interrupted, decreasing reference count");
        if (m7576b != null) {
            m7576b.close();
        }
        throw new InterruptedException();
    }
}
