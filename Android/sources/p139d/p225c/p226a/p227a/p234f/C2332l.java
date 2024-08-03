package p139d.p225c.p226a.p227a.p234f;

import java.io.EOFException;
import p139d.p225c.p226a.p227a.p245h.C2353b;
import p139d.p225c.p226a.p227a.p245h.p247b.C2367n;
import p139d.p225c.p226a.p227a.p270n.C2644u;

/* renamed from: d.c.a.a.f.l */
/* loaded from: classes.dex */
public final class C2332l {

    /* renamed from: a */
    private final C2644u f9150a = new C2644u(10);

    /* renamed from: a */
    public C2353b m9691a(InterfaceC2289h interfaceC2289h, C2367n.a aVar) {
        C2353b c2353b = null;
        int i = 0;
        while (true) {
            try {
                interfaceC2289h.mo9276a(this.f9150a.f11004a, 0, 10);
                this.f9150a.m11222e(0);
                if (this.f9150a.m11241w() != C2367n.f9305b) {
                    break;
                }
                this.f9150a.m11224f(3);
                int m11237s = this.f9150a.m11237s();
                int i2 = m11237s + 10;
                if (c2353b == null) {
                    byte[] bArr = new byte[i2];
                    System.arraycopy(this.f9150a.f11004a, 0, bArr, 0, 10);
                    interfaceC2289h.mo9276a(bArr, 10, m11237s);
                    c2353b = new C2367n(aVar).m9836a(bArr, i2);
                } else {
                    interfaceC2289h.mo9275a(m11237s);
                }
                i += i2;
            } catch (EOFException unused) {
            }
        }
        interfaceC2289h.mo9280b();
        interfaceC2289h.mo9275a(i);
        return c2353b;
    }
}
