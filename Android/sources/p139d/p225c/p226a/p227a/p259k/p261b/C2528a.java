package p139d.p225c.p226a.p227a.p259k.p261b;

import java.util.List;
import p139d.p225c.p226a.p227a.p259k.AbstractC2531c;
import p139d.p225c.p226a.p227a.p270n.C2644u;

/* renamed from: d.c.a.a.k.b.a */
/* loaded from: classes.dex */
public final class C2528a extends AbstractC2531c {

    /* renamed from: o */
    private final C2529b f10403o;

    public C2528a(List<byte[]> list) {
        super("DvbDecoder");
        C2644u c2644u = new C2644u(list.get(0));
        this.f10403o = new C2529b(c2644u.m11244z(), c2644u.m11244z());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p139d.p225c.p226a.p227a.p259k.AbstractC2531c
    /* renamed from: a */
    public C2530c mo10610a(byte[] bArr, int i, boolean z) {
        if (z) {
            this.f10403o.m10628a();
        }
        return new C2530c(this.f10403o.m10627a(bArr, i));
    }
}
