package p139d.p143b.p184i.p200n;

import p139d.p143b.p148c.p159k.C1728f;
import p139d.p143b.p184i.p196j.C1920d;
import p139d.p143b.p184i.p200n.C1949I;
import p139d.p143b.p184i.p200n.C1999p;
import p139d.p143b.p184i.p201o.C2023c;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: d.b.i.n.q */
/* loaded from: classes.dex */
public class C2001q implements C1949I.a {

    /* renamed from: a */
    final /* synthetic */ C1999p f7307a;

    /* renamed from: b */
    final /* synthetic */ InterfaceC1998oa f7308b;

    /* renamed from: c */
    final /* synthetic */ C1999p.c f7309c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2001q(C1999p.c cVar, C1999p c1999p, InterfaceC1998oa interfaceC1998oa) {
        this.f7309c = cVar;
        this.f7307a = c1999p;
        this.f7308b = interfaceC1998oa;
    }

    @Override // p139d.p143b.p184i.p200n.C1949I.a
    /* renamed from: a */
    public void mo7994a(C1920d c1920d, int i) {
        boolean z;
        boolean z2;
        if (c1920d != null) {
            z = C1999p.this.f7292f;
            if (z || !AbstractC1973c.m8080b(i, 16)) {
                C2023c mo8109c = this.f7308b.mo8109c();
                z2 = C1999p.this.f7293g;
                if (z2 || !C1728f.m7089i(mo8109c.m8249o())) {
                    c1920d.m7914g(C2017y.m8231b(mo8109c, c1920d));
                }
            }
            this.f7309c.m8182c(c1920d, i);
        }
    }
}
