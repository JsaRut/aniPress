package p139d.p143b.p184i.p200n;

import java.util.Map;
import p139d.p143b.p148c.p150b.AbstractRunnableC1677e;

/* renamed from: d.b.i.n.wa */
/* loaded from: classes.dex */
public abstract class AbstractC2014wa<T> extends AbstractRunnableC1677e<T> {

    /* renamed from: b */
    private final InterfaceC1995n<T> f7341b;

    /* renamed from: c */
    private final InterfaceC2002qa f7342c;

    /* renamed from: d */
    private final String f7343d;

    /* renamed from: e */
    private final String f7344e;

    public AbstractC2014wa(InterfaceC1995n<T> interfaceC1995n, InterfaceC2002qa interfaceC2002qa, String str, String str2) {
        this.f7341b = interfaceC1995n;
        this.f7342c = interfaceC2002qa;
        this.f7343d = str;
        this.f7344e = str2;
        this.f7342c.mo5339a(this.f7344e, this.f7343d);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p139d.p143b.p148c.p150b.AbstractRunnableC1677e
    /* renamed from: a */
    public void mo6940a(Exception exc) {
        InterfaceC2002qa interfaceC2002qa = this.f7342c;
        String str = this.f7344e;
        interfaceC2002qa.mo5341a(str, this.f7343d, exc, interfaceC2002qa.mo5343a(str) ? m8224b(exc) : null);
        this.f7341b.mo8086a(exc);
    }

    /* renamed from: b */
    protected Map<String, String> m8224b(Exception exc) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p139d.p143b.p148c.p150b.AbstractRunnableC1677e
    /* renamed from: b */
    public void mo6943b(T t) {
        InterfaceC2002qa interfaceC2002qa = this.f7342c;
        String str = this.f7344e;
        interfaceC2002qa.mo5345b(str, this.f7343d, interfaceC2002qa.mo5343a(str) ? mo8022c(t) : null);
        this.f7341b.mo8085a(t, 1);
    }

    /* renamed from: c */
    protected Map<String, String> mo8022c(T t) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p139d.p143b.p148c.p150b.AbstractRunnableC1677e
    /* renamed from: c */
    public void mo6944c() {
        InterfaceC2002qa interfaceC2002qa = this.f7342c;
        String str = this.f7344e;
        interfaceC2002qa.mo5342a(str, this.f7343d, interfaceC2002qa.mo5343a(str) ? m8225d() : null);
        this.f7341b.mo8082a();
    }

    /* renamed from: d */
    protected Map<String, String> m8225d() {
        return null;
    }
}
