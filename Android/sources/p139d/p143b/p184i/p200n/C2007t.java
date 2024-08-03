package p139d.p143b.p184i.p200n;

import java.util.Map;
import p030b.C0502k;
import p030b.InterfaceC0497f;
import p139d.p143b.p184i.p196j.C1920d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: d.b.i.n.t */
/* loaded from: classes.dex */
public class C2007t implements InterfaceC0497f<C1920d, Void> {

    /* renamed from: a */
    final /* synthetic */ InterfaceC2002qa f7317a;

    /* renamed from: b */
    final /* synthetic */ String f7318b;

    /* renamed from: c */
    final /* synthetic */ InterfaceC1995n f7319c;

    /* renamed from: d */
    final /* synthetic */ InterfaceC1998oa f7320d;

    /* renamed from: e */
    final /* synthetic */ C2011v f7321e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2007t(C2011v c2011v, InterfaceC2002qa interfaceC2002qa, String str, InterfaceC1995n interfaceC1995n, InterfaceC1998oa interfaceC1998oa) {
        this.f7321e = c2011v;
        this.f7317a = interfaceC2002qa;
        this.f7318b = str;
        this.f7319c = interfaceC1995n;
        this.f7320d = interfaceC1998oa;
    }

    @Override // p030b.InterfaceC0497f
    /* renamed from: a, reason: avoid collision after fix types in other method */
    public Void mo2635a(C0502k<C1920d> c0502k) {
        boolean m8222b;
        InterfaceC1996na interfaceC1996na;
        m8222b = C2011v.m8222b(c0502k);
        if (m8222b) {
            this.f7317a.mo5342a(this.f7318b, "DiskCacheProducer", (Map<String, String>) null);
            this.f7319c.mo8082a();
        } else {
            if (c0502k.m2652f()) {
                this.f7317a.mo5341a(this.f7318b, "DiskCacheProducer", c0502k.m2646a(), null);
            } else {
                C1920d m2647b = c0502k.m2647b();
                if (m2647b != null) {
                    InterfaceC2002qa interfaceC2002qa = this.f7317a;
                    String str = this.f7318b;
                    interfaceC2002qa.mo5345b(str, "DiskCacheProducer", C2011v.m8218a(interfaceC2002qa, str, true, m2647b.m7925v()));
                    this.f7317a.mo7174a(this.f7318b, "DiskCacheProducer", true);
                    this.f7319c.mo8083a(1.0f);
                    this.f7319c.mo8085a(m2647b, 1);
                    m2647b.close();
                } else {
                    InterfaceC2002qa interfaceC2002qa2 = this.f7317a;
                    String str2 = this.f7318b;
                    interfaceC2002qa2.mo5345b(str2, "DiskCacheProducer", C2011v.m8218a(interfaceC2002qa2, str2, false, 0));
                }
            }
            interfaceC1996na = this.f7321e.f7340d;
            interfaceC1996na.mo7950a(this.f7319c, this.f7320d);
        }
        return null;
    }
}
