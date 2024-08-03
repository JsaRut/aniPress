package p139d.p225c.p226a.p227a.p234f.p236b;

import p139d.p225c.p226a.p227a.C2676s;
import p139d.p225c.p226a.p227a.p231d.C2213m;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2337q;
import p139d.p225c.p226a.p227a.p234f.p236b.AbstractC2235e;
import p139d.p225c.p226a.p227a.p270n.C2642s;
import p139d.p225c.p226a.p227a.p270n.C2644u;
import p139d.p225c.p226a.p227a.p271o.C2660h;

/* renamed from: d.c.a.a.f.b.f */
/* loaded from: classes.dex */
final class C2236f extends AbstractC2235e {

    /* renamed from: b */
    private final C2644u f8213b;

    /* renamed from: c */
    private final C2644u f8214c;

    /* renamed from: d */
    private int f8215d;

    /* renamed from: e */
    private boolean f8216e;

    /* renamed from: f */
    private int f8217f;

    public C2236f(InterfaceC2337q interfaceC2337q) {
        super(interfaceC2337q);
        this.f8213b = new C2644u(C2642s.f10980a);
        this.f8214c = new C2644u(4);
    }

    @Override // p139d.p225c.p226a.p227a.p234f.p236b.AbstractC2235e
    /* renamed from: a */
    protected boolean mo9187a(C2644u c2644u) {
        int m11238t = c2644u.m11238t();
        int i = (m11238t >> 4) & 15;
        int i2 = m11238t & 15;
        if (i2 == 7) {
            this.f8217f = i;
            return i != 5;
        }
        throw new AbstractC2235e.a("Video format not supported: " + i2);
    }

    @Override // p139d.p225c.p226a.p227a.p234f.p236b.AbstractC2235e
    /* renamed from: b */
    protected void mo9188b(C2644u c2644u, long j) {
        int m11238t = c2644u.m11238t();
        long m11227i = j + (c2644u.m11227i() * 1000);
        if (m11238t == 0 && !this.f8216e) {
            C2644u c2644u2 = new C2644u(new byte[c2644u.m11208a()]);
            c2644u.m11214a(c2644u2.f11004a, 0, c2644u.m11208a());
            C2660h m11265a = C2660h.m11265a(c2644u2);
            this.f8215d = m11265a.f11038b;
            this.f8212a.mo9433a(C2676s.m11422a((String) null, "video/avc", (String) null, -1, -1, m11265a.f11039c, m11265a.f11040d, -1.0f, m11265a.f11037a, -1, m11265a.f11041e, (C2213m) null));
            this.f8216e = true;
            return;
        }
        if (m11238t == 1 && this.f8216e) {
            byte[] bArr = this.f8214c.f11004a;
            bArr[0] = 0;
            bArr[1] = 0;
            bArr[2] = 0;
            int i = 4 - this.f8215d;
            int i2 = 0;
            while (c2644u.m11208a() > 0) {
                c2644u.m11214a(this.f8214c.f11004a, i, this.f8215d);
                this.f8214c.m11222e(0);
                int m11242x = this.f8214c.m11242x();
                this.f8213b.m11222e(0);
                this.f8212a.mo9432a(this.f8213b, 4);
                this.f8212a.mo9432a(c2644u, m11242x);
                i2 = i2 + 4 + m11242x;
            }
            this.f8212a.mo9431a(m11227i, this.f8217f == 1 ? 1 : 0, i2, 0, null);
        }
    }
}
