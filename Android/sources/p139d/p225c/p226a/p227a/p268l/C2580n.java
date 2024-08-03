package p139d.p225c.p226a.p227a.p268l;

import p139d.p225c.p226a.p227a.C2145J;
import p139d.p225c.p226a.p227a.p270n.C2622I;

/* renamed from: d.c.a.a.l.n */
/* loaded from: classes.dex */
public final class C2580n {

    /* renamed from: a */
    public final int f10731a;

    /* renamed from: b */
    public final C2145J[] f10732b;

    /* renamed from: c */
    public final C2578l f10733c;

    /* renamed from: d */
    public final Object f10734d;

    public C2580n(C2145J[] c2145jArr, InterfaceC2577k[] interfaceC2577kArr, Object obj) {
        this.f10732b = c2145jArr;
        this.f10733c = new C2578l(interfaceC2577kArr);
        this.f10734d = obj;
        this.f10731a = c2145jArr.length;
    }

    /* renamed from: a */
    public boolean m10893a(int i) {
        return this.f10732b[i] != null;
    }

    /* renamed from: a */
    public boolean m10894a(C2580n c2580n) {
        if (c2580n == null || c2580n.f10733c.f10726a != this.f10733c.f10726a) {
            return false;
        }
        for (int i = 0; i < this.f10733c.f10726a; i++) {
            if (!m10895a(c2580n, i)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public boolean m10895a(C2580n c2580n, int i) {
        return c2580n != null && C2622I.m11067a(this.f10732b[i], c2580n.f10732b[i]) && C2622I.m11067a(this.f10733c.m10887a(i), c2580n.f10733c.m10887a(i));
    }
}
