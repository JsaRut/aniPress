package p139d.p143b.p184i.p194h;

import p139d.p143b.p183h.C1826b;
import p139d.p143b.p183h.C1827c;
import p139d.p143b.p184i.p191e.C1878b;
import p139d.p143b.p184i.p196j.AbstractC1918b;
import p139d.p143b.p184i.p196j.C1920d;
import p139d.p143b.p184i.p196j.InterfaceC1923g;

/* renamed from: d.b.i.h.b */
/* loaded from: classes.dex */
public class C1908b implements InterfaceC1910d {

    /* renamed from: a */
    final /* synthetic */ C1909c f7049a;

    public C1908b(C1909c c1909c) {
        this.f7049a = c1909c;
    }

    @Override // p139d.p143b.p184i.p194h.InterfaceC1910d
    /* renamed from: a */
    public AbstractC1918b mo7874a(C1920d c1920d, int i, InterfaceC1923g interfaceC1923g, C1878b c1878b) {
        C1827c m7921r = c1920d.m7921r();
        if (m7921r == C1826b.f6739a) {
            return this.f7049a.m7878d(c1920d, i, interfaceC1923g, c1878b);
        }
        if (m7921r == C1826b.f6741c) {
            return this.f7049a.m7877c(c1920d, i, interfaceC1923g, c1878b);
        }
        if (m7921r == C1826b.f6747i) {
            return this.f7049a.m7876b(c1920d, i, interfaceC1923g, c1878b);
        }
        if (m7921r != C1827c.f6749a) {
            return this.f7049a.m7875a(c1920d, c1878b);
        }
        throw new C1907a("unknown image format", c1920d);
    }
}
