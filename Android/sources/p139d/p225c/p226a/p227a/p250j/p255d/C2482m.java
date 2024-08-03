package p139d.p225c.p226a.p227a.p250j.p255d;

import p139d.p225c.p226a.p227a.C2677t;
import p139d.p225c.p226a.p227a.p230c.C2196f;
import p139d.p225c.p226a.p227a.p250j.InterfaceC2404E;
import p139d.p225c.p226a.p227a.p270n.C2628e;

/* renamed from: d.c.a.a.j.d.m */
/* loaded from: classes.dex */
public final class C2482m implements InterfaceC2404E {

    /* renamed from: a */
    private final int f9993a;

    /* renamed from: b */
    private final C2483n f9994b;

    /* renamed from: c */
    private int f9995c = -1;

    public C2482m(C2483n c2483n, int i) {
        this.f9994b = c2483n;
        this.f9993a = i;
    }

    /* renamed from: e */
    private boolean m10345e() {
        int i = this.f9995c;
        return (i == -1 || i == -3 || i == -2) ? false : true;
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2404E
    /* renamed from: a */
    public int mo9960a(C2677t c2677t, C2196f c2196f, boolean z) {
        if (m10345e()) {
            return this.f9994b.m10367a(this.f9995c, c2677t, c2196f, z);
        }
        return -3;
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2404E
    /* renamed from: a */
    public void mo9961a() {
        if (this.f9995c == -2) {
            throw new C2484o(this.f9994b.m10380f().m9978a(this.f9993a).m9976a(0).f11182g);
        }
        this.f9994b.m10381i();
    }

    /* renamed from: b */
    public void m10346b() {
        C2628e.m11111a(this.f9995c == -1);
        this.f9995c = this.f9994b.m10365a(this.f9993a);
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2404E
    /* renamed from: c */
    public boolean mo9962c() {
        return this.f9995c == -3 || (m10345e() && this.f9994b.m10374b(this.f9995c));
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2404E
    /* renamed from: d */
    public int mo9963d(long j) {
        if (m10345e()) {
            return this.f9994b.m10366a(this.f9995c, j);
        }
        return 0;
    }

    /* renamed from: d */
    public void m10347d() {
        if (this.f9995c != -1) {
            this.f9994b.m10377c(this.f9993a);
            this.f9995c = -1;
        }
    }
}
