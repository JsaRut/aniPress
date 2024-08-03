package p139d.p225c.p226a.p227a.p234f.p240f;

import java.util.Arrays;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2289h;
import p139d.p225c.p226a.p227a.p270n.C2628e;
import p139d.p225c.p226a.p227a.p270n.C2644u;

/* renamed from: d.c.a.a.f.f.f */
/* loaded from: classes.dex */
final class C2278f {

    /* renamed from: a */
    private final C2279g f8724a = new C2279g();

    /* renamed from: b */
    private final C2644u f8725b = new C2644u(new byte[65025], 0);

    /* renamed from: c */
    private int f8726c = -1;

    /* renamed from: d */
    private int f8727d;

    /* renamed from: e */
    private boolean f8728e;

    /* renamed from: a */
    private int m9460a(int i) {
        int i2;
        int i3 = 0;
        this.f8727d = 0;
        do {
            int i4 = this.f8727d;
            int i5 = i + i4;
            C2279g c2279g = this.f8724a;
            if (i5 >= c2279g.f8736h) {
                break;
            }
            int[] iArr = c2279g.f8739k;
            this.f8727d = i4 + 1;
            i2 = iArr[i4 + i];
            i3 += i2;
        } while (i2 == 255);
        return i3;
    }

    /* renamed from: a */
    public C2279g m9461a() {
        return this.f8724a;
    }

    /* renamed from: a */
    public boolean m9462a(InterfaceC2289h interfaceC2289h) {
        int i;
        C2628e.m11113b(interfaceC2289h != null);
        if (this.f8728e) {
            this.f8728e = false;
            this.f8725b.m11207B();
        }
        while (!this.f8728e) {
            if (this.f8726c < 0) {
                if (!this.f8724a.m9467a(interfaceC2289h, true)) {
                    return false;
                }
                C2279g c2279g = this.f8724a;
                int i2 = c2279g.f8737i;
                if ((c2279g.f8731c & 1) == 1 && this.f8725b.m11219d() == 0) {
                    i2 += m9460a(0);
                    i = this.f8727d + 0;
                } else {
                    i = 0;
                }
                interfaceC2289h.mo9283c(i2);
                this.f8726c = i;
            }
            int m9460a = m9460a(this.f8726c);
            int i3 = this.f8726c + this.f8727d;
            if (m9460a > 0) {
                if (this.f8725b.m11215b() < this.f8725b.m11219d() + m9460a) {
                    C2644u c2644u = this.f8725b;
                    c2644u.f11004a = Arrays.copyOf(c2644u.f11004a, c2644u.m11219d() + m9460a);
                }
                C2644u c2644u2 = this.f8725b;
                interfaceC2289h.readFully(c2644u2.f11004a, c2644u2.m11219d(), m9460a);
                C2644u c2644u3 = this.f8725b;
                c2644u3.m11220d(c2644u3.m11219d() + m9460a);
                this.f8728e = this.f8724a.f8739k[i3 + (-1)] != 255;
            }
            if (i3 == this.f8724a.f8736h) {
                i3 = -1;
            }
            this.f8726c = i3;
        }
        return true;
    }

    /* renamed from: b */
    public C2644u m9463b() {
        return this.f8725b;
    }

    /* renamed from: c */
    public void m9464c() {
        this.f8724a.m9466a();
        this.f8725b.m11207B();
        this.f8726c = -1;
        this.f8728e = false;
    }

    /* renamed from: d */
    public void m9465d() {
        C2644u c2644u = this.f8725b;
        byte[] bArr = c2644u.f11004a;
        if (bArr.length == 65025) {
            return;
        }
        c2644u.f11004a = Arrays.copyOf(bArr, Math.max(65025, c2644u.m11219d()));
    }
}
