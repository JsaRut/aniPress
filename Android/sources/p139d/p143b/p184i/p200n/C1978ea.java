package p139d.p143b.p184i.p200n;

import java.util.Map;
import p030b.C0502k;
import p030b.InterfaceC0497f;
import p139d.p143b.p145b.p146a.InterfaceC1648d;
import p139d.p143b.p184i.p191e.C1877a;
import p139d.p143b.p184i.p196j.C1920d;
import p139d.p143b.p184i.p201o.C2023c;
import p139d.p143b.p184i.p201o.C2024d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: d.b.i.n.ea */
/* loaded from: classes.dex */
public class C1978ea implements InterfaceC0497f<C1920d, Void> {

    /* renamed from: a */
    final /* synthetic */ InterfaceC2002qa f7224a;

    /* renamed from: b */
    final /* synthetic */ String f7225b;

    /* renamed from: c */
    final /* synthetic */ InterfaceC1995n f7226c;

    /* renamed from: d */
    final /* synthetic */ InterfaceC1998oa f7227d;

    /* renamed from: e */
    final /* synthetic */ InterfaceC1648d f7228e;

    /* renamed from: f */
    final /* synthetic */ C1982ga f7229f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1978ea(C1982ga c1982ga, InterfaceC2002qa interfaceC2002qa, String str, InterfaceC1995n interfaceC1995n, InterfaceC1998oa interfaceC1998oa, InterfaceC1648d interfaceC1648d) {
        this.f7229f = c1982ga;
        this.f7224a = interfaceC2002qa;
        this.f7225b = str;
        this.f7226c = interfaceC1995n;
        this.f7227d = interfaceC1998oa;
        this.f7228e = interfaceC1648d;
    }

    @Override // p030b.InterfaceC0497f
    /* renamed from: a, reason: avoid collision after fix types in other method */
    public Void mo2635a(C0502k<C1920d> c0502k) {
        boolean m8125b;
        m8125b = C1982ga.m8125b(c0502k);
        if (m8125b) {
            this.f7224a.mo5342a(this.f7225b, "PartialDiskCacheProducer", (Map<String, String>) null);
            this.f7226c.mo8082a();
        } else if (c0502k.m2652f()) {
            this.f7224a.mo5341a(this.f7225b, "PartialDiskCacheProducer", c0502k.m2646a(), null);
            this.f7229f.m8122a((InterfaceC1995n<C1920d>) this.f7226c, this.f7227d, this.f7228e, (C1920d) null);
        } else {
            C1920d m2647b = c0502k.m2647b();
            if (m2647b != null) {
                InterfaceC2002qa interfaceC2002qa = this.f7224a;
                String str = this.f7225b;
                interfaceC2002qa.mo5345b(str, "PartialDiskCacheProducer", C1982ga.m8120a(interfaceC2002qa, str, true, m2647b.m7925v()));
                C1877a m7645b = C1877a.m7645b(m2647b.m7925v() - 1);
                m2647b.m7907a(m7645b);
                int m7925v = m2647b.m7925v();
                C2023c mo8109c = this.f7227d.mo8109c();
                if (m7645b.m7648a(mo8109c.m8235a())) {
                    this.f7224a.mo7174a(this.f7225b, "PartialDiskCacheProducer", true);
                    this.f7226c.mo8085a(m2647b, 9);
                } else {
                    this.f7226c.mo8085a(m2647b, 8);
                    C2024d m8256a = C2024d.m8256a(mo8109c);
                    m8256a.m8258a(C1877a.m7643a(m7925v - 1));
                    C2012va c2012va = new C2012va(m8256a.m8257a(), this.f7227d);
                    this.f7229f.m8122a((InterfaceC1995n<C1920d>) this.f7226c, c2012va, this.f7228e, m2647b);
                }
            } else {
                InterfaceC2002qa interfaceC2002qa2 = this.f7224a;
                String str2 = this.f7225b;
                interfaceC2002qa2.mo5345b(str2, "PartialDiskCacheProducer", C1982ga.m8120a(interfaceC2002qa2, str2, false, 0));
                this.f7229f.m8122a((InterfaceC1995n<C1920d>) this.f7226c, this.f7227d, this.f7228e, m2647b);
            }
        }
        return null;
    }
}
