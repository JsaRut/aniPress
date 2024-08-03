package p139d.p143b.p184i.p193g;

import p139d.p143b.p148c.p152d.C1691j;
import p139d.p143b.p161d.AbstractC1734c;
import p139d.p143b.p184i.p197k.InterfaceC1926c;
import p139d.p143b.p184i.p200n.AbstractC1973c;
import p139d.p143b.p184i.p200n.C2012va;
import p139d.p143b.p184i.p200n.InterfaceC1995n;
import p139d.p143b.p184i.p200n.InterfaceC1996na;
import p139d.p143b.p184i.p201o.InterfaceC2022b;

/* renamed from: d.b.i.g.b */
/* loaded from: classes.dex */
public abstract class AbstractC1904b<T> extends AbstractC1734c<T> implements InterfaceC2022b {

    /* renamed from: g */
    private final C2012va f7046g;

    /* renamed from: h */
    private final InterfaceC1926c f7047h;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC1904b(InterfaceC1996na<T> interfaceC1996na, C2012va c2012va, InterfaceC1926c interfaceC1926c) {
        this.f7046g = c2012va;
        this.f7047h = interfaceC1926c;
        this.f7047h.mo5336a(c2012va.mo8109c(), this.f7046g.mo8103a(), this.f7046g.getId(), this.f7046g.mo8110d());
        interfaceC1996na.mo7950a(m7866j(), c2012va);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public void m7865c(Throwable th) {
        if (super.mo7116a(th)) {
            this.f7047h.mo5337a(this.f7046g.mo8109c(), this.f7046g.getId(), th, this.f7046g.mo8110d());
        }
    }

    /* renamed from: j */
    private InterfaceC1995n<T> m7866j() {
        return new C1903a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public synchronized void m7867k() {
        C1691j.m6978b(m7121f());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7868a(T t, int i) {
        boolean m8077a = AbstractC1973c.m8077a(i);
        if (super.m7115a((AbstractC1904b<T>) t, m8077a) && m8077a) {
            this.f7047h.mo5338a(this.f7046g.mo8109c(), this.f7046g.getId(), this.f7046g.mo8110d());
        }
    }

    @Override // p139d.p143b.p161d.AbstractC1734c, p139d.p143b.p161d.InterfaceC1736e
    public boolean close() {
        if (!super.close()) {
            return false;
        }
        if (super.mo7117b()) {
            return true;
        }
        this.f7047h.mo5344b(this.f7046g.getId());
        this.f7046g.m8114h();
        return true;
    }
}
