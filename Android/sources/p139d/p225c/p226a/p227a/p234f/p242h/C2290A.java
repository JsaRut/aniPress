package p139d.p225c.p226a.p227a.p234f.p242h;

import p139d.p225c.p226a.p227a.p234f.InterfaceC2325i;
import p139d.p225c.p226a.p227a.p234f.p242h.InterfaceC2296G;
import p139d.p225c.p226a.p227a.p270n.C2619F;
import p139d.p225c.p226a.p227a.p270n.C2622I;
import p139d.p225c.p226a.p227a.p270n.C2644u;

/* renamed from: d.c.a.a.f.h.A */
/* loaded from: classes.dex */
public final class C2290A implements InterfaceC2296G {

    /* renamed from: a */
    private final InterfaceC2324z f8804a;

    /* renamed from: b */
    private final C2644u f8805b = new C2644u(32);

    /* renamed from: c */
    private int f8806c;

    /* renamed from: d */
    private int f8807d;

    /* renamed from: e */
    private boolean f8808e;

    /* renamed from: f */
    private boolean f8809f;

    public C2290A(InterfaceC2324z interfaceC2324z) {
        this.f8804a = interfaceC2324z;
    }

    @Override // p139d.p225c.p226a.p227a.p234f.p242h.InterfaceC2296G
    /* renamed from: a */
    public void mo9503a() {
        this.f8809f = true;
    }

    @Override // p139d.p225c.p226a.p227a.p234f.p242h.InterfaceC2296G
    /* renamed from: a */
    public void mo9504a(C2619F c2619f, InterfaceC2325i interfaceC2325i, InterfaceC2296G.d dVar) {
        this.f8804a.mo9508a(c2619f, interfaceC2325i, dVar);
        this.f8809f = true;
    }

    @Override // p139d.p225c.p226a.p227a.p234f.p242h.InterfaceC2296G
    /* renamed from: a */
    public void mo9505a(C2644u c2644u, int i) {
        C2644u c2644u2;
        boolean z = (i & 1) != 0;
        int m11238t = z ? c2644u.m11238t() + c2644u.m11217c() : -1;
        if (this.f8809f) {
            if (!z) {
                return;
            }
            this.f8809f = false;
            c2644u.m11222e(m11238t);
            this.f8807d = 0;
        }
        while (c2644u.m11208a() > 0) {
            int i2 = this.f8807d;
            if (i2 < 3) {
                if (i2 == 0) {
                    int m11238t2 = c2644u.m11238t();
                    c2644u.m11222e(c2644u.m11217c() - 1);
                    if (m11238t2 == 255) {
                        this.f8809f = true;
                        return;
                    }
                }
                int min = Math.min(c2644u.m11208a(), 3 - this.f8807d);
                c2644u.m11214a(this.f8805b.f11004a, this.f8807d, min);
                this.f8807d += min;
                if (this.f8807d == 3) {
                    this.f8805b.m11218c(3);
                    this.f8805b.m11224f(1);
                    int m11238t3 = this.f8805b.m11238t();
                    int m11238t4 = this.f8805b.m11238t();
                    this.f8808e = (m11238t3 & 128) != 0;
                    this.f8806c = (((m11238t3 & 15) << 8) | m11238t4) + 3;
                    int m11215b = this.f8805b.m11215b();
                    int i3 = this.f8806c;
                    if (m11215b < i3) {
                        C2644u c2644u3 = this.f8805b;
                        byte[] bArr = c2644u3.f11004a;
                        c2644u3.m11218c(Math.min(4098, Math.max(i3, bArr.length * 2)));
                        System.arraycopy(bArr, 0, this.f8805b.f11004a, 0, 3);
                    }
                }
            } else {
                int min2 = Math.min(c2644u.m11208a(), this.f8806c - this.f8807d);
                c2644u.m11214a(this.f8805b.f11004a, this.f8807d, min2);
                this.f8807d += min2;
                int i4 = this.f8807d;
                int i5 = this.f8806c;
                if (i4 != i5) {
                    continue;
                } else {
                    if (!this.f8808e) {
                        c2644u2 = this.f8805b;
                    } else if (C2622I.m11041a(this.f8805b.f11004a, 0, i5, -1) != 0) {
                        this.f8809f = true;
                        return;
                    } else {
                        c2644u2 = this.f8805b;
                        i5 = this.f8806c - 4;
                    }
                    c2644u2.m11218c(i5);
                    this.f8804a.mo9509a(this.f8805b);
                    this.f8807d = 0;
                }
            }
        }
    }
}
