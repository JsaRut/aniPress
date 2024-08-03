package p139d.p225c.p226a.p227a.p234f.p240f;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p139d.p225c.p226a.p227a.C2676s;
import p139d.p225c.p226a.p227a.p231d.C2213m;
import p139d.p225c.p226a.p227a.p234f.C2336p;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2289h;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2335o;
import p139d.p225c.p226a.p227a.p234f.p240f.AbstractC2283k;
import p139d.p225c.p226a.p227a.p270n.C2622I;
import p139d.p225c.p226a.p227a.p270n.C2636m;
import p139d.p225c.p226a.p227a.p270n.C2644u;

/* renamed from: d.c.a.a.f.f.d */
/* loaded from: classes.dex */
final class C2276d extends AbstractC2283k {

    /* renamed from: n */
    private C2636m f8713n;

    /* renamed from: o */
    private a f8714o;

    /* renamed from: d.c.a.a.f.f.d$a */
    /* loaded from: classes.dex */
    private class a implements InterfaceC2280h, InterfaceC2335o {

        /* renamed from: a */
        private long[] f8715a;

        /* renamed from: b */
        private long[] f8716b;

        /* renamed from: c */
        private long f8717c = -1;

        /* renamed from: d */
        private long f8718d = -1;

        public a() {
        }

        @Override // p139d.p225c.p226a.p227a.p234f.p240f.InterfaceC2280h
        /* renamed from: a */
        public long mo9440a(InterfaceC2289h interfaceC2289h) {
            long j = this.f8718d;
            if (j < 0) {
                return -1L;
            }
            long j2 = -(j + 2);
            this.f8718d = -1L;
            return j2;
        }

        @Override // p139d.p225c.p226a.p227a.p234f.p240f.InterfaceC2280h
        /* renamed from: a */
        public InterfaceC2335o mo9442a() {
            return this;
        }

        /* renamed from: a */
        public void m9455a(C2644u c2644u) {
            c2644u.m11224f(1);
            int m11241w = c2644u.m11241w() / 18;
            this.f8715a = new long[m11241w];
            this.f8716b = new long[m11241w];
            for (int i = 0; i < m11241w; i++) {
                this.f8715a[i] = c2644u.m11234p();
                this.f8716b[i] = c2644u.m11234p();
                c2644u.m11224f(2);
            }
        }

        @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2335o
        /* renamed from: b */
        public InterfaceC2335o.a mo9138b(long j) {
            int m11079b = C2622I.m11079b(this.f8715a, C2276d.this.m9477b(j), true, true);
            long m9474a = C2276d.this.m9474a(this.f8715a[m11079b]);
            C2336p c2336p = new C2336p(m9474a, this.f8717c + this.f8716b[m11079b]);
            if (m9474a < j) {
                long[] jArr = this.f8715a;
                if (m11079b != jArr.length - 1) {
                    int i = m11079b + 1;
                    return new InterfaceC2335o.a(c2336p, new C2336p(C2276d.this.m9474a(jArr[i]), this.f8717c + this.f8716b[i]));
                }
            }
            return new InterfaceC2335o.a(c2336p);
        }

        @Override // p139d.p225c.p226a.p227a.p234f.p240f.InterfaceC2280h
        /* renamed from: c */
        public long mo9446c(long j) {
            long m9477b = C2276d.this.m9477b(j);
            this.f8718d = this.f8715a[C2622I.m11079b(this.f8715a, m9477b, true, true)];
            return m9477b;
        }

        @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2335o
        /* renamed from: c */
        public boolean mo9140c() {
            return true;
        }

        @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2335o
        /* renamed from: d */
        public long mo9141d() {
            return C2276d.this.f8713n.m11153b();
        }

        /* renamed from: d */
        public void m9456d(long j) {
            this.f8717c = j;
        }
    }

    /* renamed from: a */
    private static boolean m9449a(byte[] bArr) {
        return bArr[0] == -1;
    }

    /* renamed from: b */
    public static boolean m9450b(C2644u c2644u) {
        return c2644u.m11208a() >= 5 && c2644u.m11238t() == 127 && c2644u.m11240v() == 1179402563;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0009. Please report as an issue. */
    /* renamed from: c */
    private int m9451c(C2644u c2644u) {
        int i;
        int i2;
        int i3 = (c2644u.f11004a[2] & 255) >> 4;
        switch (i3) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                i = 576;
                i2 = i3 - 2;
                return i << i2;
            case 6:
            case 7:
                c2644u.m11224f(4);
                c2644u.m11206A();
                int m11238t = i3 == 6 ? c2644u.m11238t() : c2644u.m11244z();
                c2644u.m11222e(0);
                return m11238t + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                i = 256;
                i2 = i3 - 8;
                return i << i2;
            default:
                return -1;
        }
    }

    @Override // p139d.p225c.p226a.p227a.p234f.p240f.AbstractC2283k
    /* renamed from: a */
    protected long mo9452a(C2644u c2644u) {
        if (m9449a(c2644u.f11004a)) {
            return m9451c(c2644u);
        }
        return -1L;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p139d.p225c.p226a.p227a.p234f.p240f.AbstractC2283k
    /* renamed from: a */
    public void mo9453a(boolean z) {
        super.mo9453a(z);
        if (z) {
            this.f8713n = null;
            this.f8714o = null;
        }
    }

    @Override // p139d.p225c.p226a.p227a.p234f.p240f.AbstractC2283k
    /* renamed from: a */
    protected boolean mo9454a(C2644u c2644u, long j, AbstractC2283k.a aVar) {
        byte[] bArr = c2644u.f11004a;
        if (this.f8713n == null) {
            this.f8713n = new C2636m(bArr, 17);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 9, c2644u.m11219d());
            copyOfRange[4] = Byte.MIN_VALUE;
            List singletonList = Collections.singletonList(copyOfRange);
            int m11152a = this.f8713n.m11152a();
            C2636m c2636m = this.f8713n;
            aVar.f8757a = C2676s.m11426a((String) null, "audio/flac", (String) null, -1, m11152a, c2636m.f10969f, c2636m.f10968e, (List<byte[]>) singletonList, (C2213m) null, 0, (String) null);
            return true;
        }
        if ((bArr[0] & Byte.MAX_VALUE) == 3) {
            this.f8714o = new a();
            this.f8714o.m9455a(c2644u);
            return true;
        }
        if (!m9449a(bArr)) {
            return true;
        }
        a aVar2 = this.f8714o;
        if (aVar2 != null) {
            aVar2.m9456d(j);
            aVar.f8758b = this.f8714o;
        }
        return false;
    }
}
