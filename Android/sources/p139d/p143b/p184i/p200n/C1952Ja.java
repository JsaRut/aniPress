package p139d.p143b.p184i.p200n;

import p139d.p143b.p148c.p155g.AbstractC1713j;
import p139d.p143b.p148c.p155g.InterfaceC1710g;
import p139d.p143b.p148c.p155g.InterfaceC1711h;
import p139d.p143b.p148c.p156h.C1716b;
import p139d.p143b.p184i.p196j.C1920d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: d.b.i.n.Ja */
/* loaded from: classes.dex */
public class C1952Ja extends AbstractC2014wa<C1920d> {

    /* renamed from: f */
    final /* synthetic */ C1920d f7154f;

    /* renamed from: g */
    final /* synthetic */ C1954Ka f7155g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1952Ja(C1954Ka c1954Ka, InterfaceC1995n interfaceC1995n, InterfaceC2002qa interfaceC2002qa, String str, String str2, C1920d c1920d) {
        super(interfaceC1995n, interfaceC2002qa, str, str2);
        this.f7155g = c1954Ka;
        this.f7154f = c1920d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p139d.p143b.p148c.p150b.AbstractRunnableC1677e
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void mo6941a(C1920d c1920d) {
        C1920d.m7902b(c1920d);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p139d.p143b.p184i.p200n.AbstractC2014wa, p139d.p143b.p148c.p150b.AbstractRunnableC1677e
    /* renamed from: a */
    public void mo6940a(Exception exc) {
        C1920d.m7902b(this.f7154f);
        super.mo6940a(exc);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p139d.p143b.p148c.p150b.AbstractRunnableC1677e
    /* renamed from: b */
    public C1920d mo6942b() {
        InterfaceC1711h interfaceC1711h;
        interfaceC1711h = this.f7155g.f7159b;
        AbstractC1713j mo5039a = interfaceC1711h.mo5039a();
        try {
            C1954Ka.m8013b(this.f7154f, mo5039a);
            C1716b m7043a = C1716b.m7043a(mo5039a.mo5043m());
            try {
                C1920d c1920d = new C1920d((C1716b<InterfaceC1710g>) m7043a);
                c1920d.m7909c(this.f7154f);
                return c1920d;
            } finally {
                C1716b.m7045b(m7043a);
            }
        } finally {
            mo5039a.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p139d.p143b.p184i.p200n.AbstractC2014wa, p139d.p143b.p148c.p150b.AbstractRunnableC1677e
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo6943b(C1920d c1920d) {
        C1920d.m7902b(this.f7154f);
        super.mo6943b((C1952Ja) c1920d);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p139d.p143b.p184i.p200n.AbstractC2014wa, p139d.p143b.p148c.p150b.AbstractRunnableC1677e
    /* renamed from: c */
    public void mo6944c() {
        C1920d.m7902b(this.f7154f);
        super.mo6944c();
    }
}
