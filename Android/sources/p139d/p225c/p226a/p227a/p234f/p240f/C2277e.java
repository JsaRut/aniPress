package p139d.p225c.p226a.p227a.p234f.p240f;

import p139d.p225c.p226a.p227a.C2683z;
import p139d.p225c.p226a.p227a.p234f.C2334n;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2287g;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2289h;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2325i;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2330j;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2337q;
import p139d.p225c.p226a.p227a.p270n.C2644u;

/* renamed from: d.c.a.a.f.f.e */
/* loaded from: classes.dex */
public class C2277e implements InterfaceC2287g {

    /* renamed from: a */
    public static final InterfaceC2330j f8720a = new InterfaceC2330j() { // from class: d.c.a.a.f.f.a
        @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2330j
        /* renamed from: a */
        public final InterfaceC2287g[] mo9142a() {
            return C2277e.m9459b();
        }
    };

    /* renamed from: b */
    private InterfaceC2325i f8721b;

    /* renamed from: c */
    private AbstractC2283k f8722c;

    /* renamed from: d */
    private boolean f8723d;

    /* renamed from: a */
    private static C2644u m9457a(C2644u c2644u) {
        c2644u.m11222e(0);
        return c2644u;
    }

    /* renamed from: b */
    private boolean m9458b(InterfaceC2289h interfaceC2289h) {
        AbstractC2283k c2281i;
        C2279g c2279g = new C2279g();
        if (c2279g.m9467a(interfaceC2289h, true) && (c2279g.f8731c & 2) == 2) {
            int min = Math.min(c2279g.f8738j, 8);
            C2644u c2644u = new C2644u(min);
            interfaceC2289h.mo9276a(c2644u.f11004a, 0, min);
            m9457a(c2644u);
            if (C2276d.m9450b(c2644u)) {
                c2281i = new C2276d();
            } else {
                m9457a(c2644u);
                if (C2285m.m9487c(c2644u)) {
                    c2281i = new C2285m();
                } else {
                    m9457a(c2644u);
                    if (C2281i.m9470b(c2644u)) {
                        c2281i = new C2281i();
                    }
                }
            }
            this.f8722c = c2281i;
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static /* synthetic */ InterfaceC2287g[] m9459b() {
        return new InterfaceC2287g[]{new C2277e()};
    }

    @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2287g
    /* renamed from: a */
    public int mo9157a(InterfaceC2289h interfaceC2289h, C2334n c2334n) {
        if (this.f8722c == null) {
            if (!m9458b(interfaceC2289h)) {
                throw new C2683z("Failed to determine bitstream type");
            }
            interfaceC2289h.mo9280b();
        }
        if (!this.f8723d) {
            InterfaceC2337q mo9671a = this.f8721b.mo9671a(0, 1);
            this.f8721b.mo9672a();
            this.f8722c.m9476a(this.f8721b, mo9671a);
            this.f8723d = true;
        }
        return this.f8722c.m9473a(interfaceC2289h, c2334n);
    }

    @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2287g
    /* renamed from: a */
    public void mo9158a() {
    }

    @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2287g
    /* renamed from: a */
    public void mo9159a(long j, long j2) {
        AbstractC2283k abstractC2283k = this.f8722c;
        if (abstractC2283k != null) {
            abstractC2283k.m9475a(j, j2);
        }
    }

    @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2287g
    /* renamed from: a */
    public void mo9160a(InterfaceC2325i interfaceC2325i) {
        this.f8721b = interfaceC2325i;
    }

    @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2287g
    /* renamed from: a */
    public boolean mo9161a(InterfaceC2289h interfaceC2289h) {
        try {
            return m9458b(interfaceC2289h);
        } catch (C2683z unused) {
            return false;
        }
    }
}
