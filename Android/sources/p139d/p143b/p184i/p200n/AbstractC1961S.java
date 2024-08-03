package p139d.p143b.p184i.p200n;

import java.io.InputStream;
import java.util.concurrent.Executor;
import p139d.p143b.p148c.p152d.C1683b;
import p139d.p143b.p148c.p155g.InterfaceC1710g;
import p139d.p143b.p148c.p155g.InterfaceC1711h;
import p139d.p143b.p148c.p156h.C1716b;
import p139d.p143b.p184i.p196j.C1920d;
import p139d.p143b.p184i.p201o.C2023c;

/* renamed from: d.b.i.n.S */
/* loaded from: classes.dex */
public abstract class AbstractC1961S implements InterfaceC1996na<C1920d> {

    /* renamed from: a */
    private final Executor f7183a;

    /* renamed from: b */
    private final InterfaceC1711h f7184b;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC1961S(Executor executor, InterfaceC1711h interfaceC1711h) {
        this.f7183a = executor;
        this.f7184b = interfaceC1711h;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C1920d mo8001a(C2023c c2023c);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public C1920d m8030a(InputStream inputStream, int i) {
        C1716b c1716b = null;
        try {
            c1716b = C1716b.m7043a(i <= 0 ? this.f7184b.mo5035a(inputStream) : this.f7184b.mo5036a(inputStream, i));
            return new C1920d((C1716b<InterfaceC1710g>) c1716b);
        } finally {
            C1683b.m6954a(inputStream);
            C1716b.m7045b(c1716b);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public abstract String mo8002a();

    @Override // p139d.p143b.p184i.p200n.InterfaceC1996na
    /* renamed from: a */
    public void mo7950a(InterfaceC1995n<C1920d> interfaceC1995n, InterfaceC1998oa interfaceC1998oa) {
        InterfaceC2002qa mo8111e = interfaceC1998oa.mo8111e();
        String id = interfaceC1998oa.getId();
        C1959P c1959p = new C1959P(this, interfaceC1995n, mo8111e, mo8002a(), id, interfaceC1998oa.mo8109c(), mo8111e, id);
        interfaceC1998oa.mo8106a(new C1960Q(this, c1959p));
        this.f7183a.execute(c1959p);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public C1920d m8031b(InputStream inputStream, int i) {
        return m8030a(inputStream, i);
    }
}
