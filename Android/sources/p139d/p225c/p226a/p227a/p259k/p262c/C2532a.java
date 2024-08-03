package p139d.p225c.p226a.p227a.p259k.p262c;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.zip.Inflater;
import p139d.p225c.p226a.p227a.p259k.AbstractC2531c;
import p139d.p225c.p226a.p227a.p259k.C2527b;
import p139d.p225c.p226a.p227a.p259k.InterfaceC2537e;
import p139d.p225c.p226a.p227a.p270n.C2622I;
import p139d.p225c.p226a.p227a.p270n.C2644u;

/* renamed from: d.c.a.a.k.c.a */
/* loaded from: classes.dex */
public final class C2532a extends AbstractC2531c {

    /* renamed from: o */
    private final C2644u f10462o;

    /* renamed from: p */
    private final C2644u f10463p;

    /* renamed from: q */
    private final a f10464q;

    /* renamed from: r */
    private Inflater f10465r;

    /* renamed from: d.c.a.a.k.c.a$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private final C2644u f10466a = new C2644u();

        /* renamed from: b */
        private final int[] f10467b = new int[256];

        /* renamed from: c */
        private boolean f10468c;

        /* renamed from: d */
        private int f10469d;

        /* renamed from: e */
        private int f10470e;

        /* renamed from: f */
        private int f10471f;

        /* renamed from: g */
        private int f10472g;

        /* renamed from: h */
        private int f10473h;

        /* renamed from: i */
        private int f10474i;

        /* renamed from: a */
        public void m10635a(C2644u c2644u, int i) {
            int m11241w;
            if (i < 4) {
                return;
            }
            c2644u.m11224f(3);
            int i2 = i - 4;
            if ((c2644u.m11238t() & 128) != 0) {
                if (i2 < 7 || (m11241w = c2644u.m11241w()) < 4) {
                    return;
                }
                this.f10473h = c2644u.m11244z();
                this.f10474i = c2644u.m11244z();
                this.f10466a.m11218c(m11241w - 4);
                i2 -= 7;
            }
            int m11217c = this.f10466a.m11217c();
            int m11219d = this.f10466a.m11219d();
            if (m11217c >= m11219d || i2 <= 0) {
                return;
            }
            int min = Math.min(i2, m11219d - m11217c);
            c2644u.m11214a(this.f10466a.f11004a, m11217c, min);
            this.f10466a.m11222e(m11217c + min);
        }

        /* renamed from: b */
        public void m10637b(C2644u c2644u, int i) {
            if (i < 19) {
                return;
            }
            this.f10469d = c2644u.m11244z();
            this.f10470e = c2644u.m11244z();
            c2644u.m11224f(11);
            this.f10471f = c2644u.m11244z();
            this.f10472g = c2644u.m11244z();
        }

        /* renamed from: c */
        public void m10639c(C2644u c2644u, int i) {
            if (i % 5 != 2) {
                return;
            }
            c2644u.m11224f(2);
            Arrays.fill(this.f10467b, 0);
            int i2 = i / 5;
            int i3 = 0;
            while (i3 < i2) {
                int m11238t = c2644u.m11238t();
                int m11238t2 = c2644u.m11238t();
                int m11238t3 = c2644u.m11238t();
                int m11238t4 = c2644u.m11238t();
                int m11238t5 = c2644u.m11238t();
                double d2 = m11238t2;
                double d3 = m11238t3 - 128;
                Double.isNaN(d3);
                Double.isNaN(d2);
                int i4 = (int) ((1.402d * d3) + d2);
                int i5 = i3;
                double d4 = m11238t4 - 128;
                Double.isNaN(d4);
                Double.isNaN(d2);
                Double.isNaN(d3);
                Double.isNaN(d4);
                Double.isNaN(d2);
                this.f10467b[m11238t] = C2622I.m11038a((int) (d2 + (d4 * 1.772d)), 0, 255) | (C2622I.m11038a((int) ((d2 - (0.34414d * d4)) - (d3 * 0.71414d)), 0, 255) << 8) | (m11238t5 << 24) | (C2622I.m11038a(i4, 0, 255) << 16);
                i3 = i5 + 1;
            }
            this.f10468c = true;
        }

        /* renamed from: a */
        public C2527b m10640a() {
            int i;
            if (this.f10469d == 0 || this.f10470e == 0 || this.f10473h == 0 || this.f10474i == 0 || this.f10466a.m11219d() == 0 || this.f10466a.m11217c() != this.f10466a.m11219d() || !this.f10468c) {
                return null;
            }
            this.f10466a.m11222e(0);
            int[] iArr = new int[this.f10473h * this.f10474i];
            int i2 = 0;
            while (i2 < iArr.length) {
                int m11238t = this.f10466a.m11238t();
                if (m11238t != 0) {
                    i = i2 + 1;
                    iArr[i2] = this.f10467b[m11238t];
                } else {
                    int m11238t2 = this.f10466a.m11238t();
                    if (m11238t2 != 0) {
                        i = ((m11238t2 & 64) == 0 ? m11238t2 & 63 : ((m11238t2 & 63) << 8) | this.f10466a.m11238t()) + i2;
                        Arrays.fill(iArr, i2, i, (m11238t2 & 128) == 0 ? 0 : this.f10467b[this.f10466a.m11238t()]);
                    }
                }
                i2 = i;
            }
            Bitmap createBitmap = Bitmap.createBitmap(iArr, this.f10473h, this.f10474i, Bitmap.Config.ARGB_8888);
            float f = this.f10471f;
            int i3 = this.f10469d;
            float f2 = f / i3;
            float f3 = this.f10472g;
            int i4 = this.f10470e;
            return new C2527b(createBitmap, f2, 0, f3 / i4, 0, this.f10473h / i3, this.f10474i / i4);
        }

        /* renamed from: b */
        public void m10641b() {
            this.f10469d = 0;
            this.f10470e = 0;
            this.f10471f = 0;
            this.f10472g = 0;
            this.f10473h = 0;
            this.f10474i = 0;
            this.f10466a.m11218c(0);
            this.f10468c = false;
        }
    }

    public C2532a() {
        super("PgsDecoder");
        this.f10462o = new C2644u();
        this.f10463p = new C2644u();
        this.f10464q = new a();
    }

    /* renamed from: a */
    private static C2527b m10632a(C2644u c2644u, a aVar) {
        int m11219d = c2644u.m11219d();
        int m11238t = c2644u.m11238t();
        int m11244z = c2644u.m11244z();
        int m11217c = c2644u.m11217c() + m11244z;
        C2527b c2527b = null;
        if (m11217c > m11219d) {
            c2644u.m11222e(m11219d);
            return null;
        }
        if (m11238t != 128) {
            switch (m11238t) {
                case 20:
                    aVar.m10639c(c2644u, m11244z);
                    break;
                case 21:
                    aVar.m10635a(c2644u, m11244z);
                    break;
                case 22:
                    aVar.m10637b(c2644u, m11244z);
                    break;
            }
        } else {
            c2527b = aVar.m10640a();
            aVar.m10641b();
        }
        c2644u.m11222e(m11217c);
        return c2527b;
    }

    /* renamed from: a */
    private void m10633a(C2644u c2644u) {
        if (c2644u.m11208a() <= 0 || c2644u.m11223f() != 120) {
            return;
        }
        if (this.f10465r == null) {
            this.f10465r = new Inflater();
        }
        if (C2622I.m11066a(c2644u, this.f10463p, this.f10465r)) {
            C2644u c2644u2 = this.f10463p;
            c2644u.m11213a(c2644u2.f11004a, c2644u2.m11219d());
        }
    }

    @Override // p139d.p225c.p226a.p227a.p259k.AbstractC2531c
    /* renamed from: a */
    protected InterfaceC2537e mo10610a(byte[] bArr, int i, boolean z) {
        this.f10462o.m11213a(bArr, i);
        m10633a(this.f10462o);
        this.f10464q.m10641b();
        ArrayList arrayList = new ArrayList();
        while (this.f10462o.m11208a() >= 3) {
            C2527b m10632a = m10632a(this.f10462o, this.f10464q);
            if (m10632a != null) {
                arrayList.add(m10632a);
            }
        }
        return new C2533b(Collections.unmodifiableList(arrayList));
    }
}
