package p139d.p143b.p184i.p200n;

import p139d.p143b.p184i.p196j.C1920d;
import p139d.p143b.p184i.p201o.C2023c;

/* renamed from: d.b.i.n.P */
/* loaded from: classes.dex */
class C1959P extends AbstractC2014wa<C1920d> {

    /* renamed from: f */
    final /* synthetic */ C2023c f7177f;

    /* renamed from: g */
    final /* synthetic */ InterfaceC2002qa f7178g;

    /* renamed from: h */
    final /* synthetic */ String f7179h;

    /* renamed from: i */
    final /* synthetic */ AbstractC1961S f7180i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1959P(AbstractC1961S abstractC1961S, InterfaceC1995n interfaceC1995n, InterfaceC2002qa interfaceC2002qa, String str, String str2, C2023c c2023c, InterfaceC2002qa interfaceC2002qa2, String str3) {
        super(interfaceC1995n, interfaceC2002qa, str, str2);
        this.f7180i = abstractC1961S;
        this.f7177f = c2023c;
        this.f7178g = interfaceC2002qa2;
        this.f7179h = str3;
    }

    @Override // p139d.p143b.p148c.p150b.AbstractRunnableC1677e
    /* renamed from: a */
    public void mo6941a(C1920d c1920d) {
        C1920d.m7902b(c1920d);
    }

    @Override // p139d.p143b.p148c.p150b.AbstractRunnableC1677e
    /* renamed from: b */
    public C1920d mo6942b() {
        C1920d mo8001a = this.f7180i.mo8001a(this.f7177f);
        if (mo8001a == null) {
            this.f7178g.mo7174a(this.f7179h, this.f7180i.mo8002a(), false);
            return null;
        }
        mo8001a.m7928y();
        this.f7178g.mo7174a(this.f7179h, this.f7180i.mo8002a(), true);
        return mo8001a;
    }
}
