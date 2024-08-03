package p139d.p225c.p226a.p227a.p234f.p237c;

import java.util.ArrayDeque;
import p139d.p225c.p226a.p227a.C2683z;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2289h;
import p139d.p225c.p226a.p227a.p270n.C2628e;

/* renamed from: d.c.a.a.f.c.c */
/* loaded from: classes.dex */
final class C2240c implements InterfaceC2241d {

    /* renamed from: a */
    private final byte[] f8225a = new byte[8];

    /* renamed from: b */
    private final ArrayDeque<a> f8226b = new ArrayDeque<>();

    /* renamed from: c */
    private final C2246i f8227c = new C2246i();

    /* renamed from: d */
    private InterfaceC2242e f8228d;

    /* renamed from: e */
    private int f8229e;

    /* renamed from: f */
    private int f8230f;

    /* renamed from: g */
    private long f8231g;

    /* renamed from: d.c.a.a.f.c.c$a */
    /* loaded from: classes.dex */
    private static final class a {

        /* renamed from: a */
        private final int f8232a;

        /* renamed from: b */
        private final long f8233b;

        private a(int i, long j) {
            this.f8232a = i;
            this.f8233b = j;
        }
    }

    /* renamed from: a */
    private double m9210a(InterfaceC2289h interfaceC2289h, int i) {
        return i == 4 ? Float.intBitsToFloat((int) r0) : Double.longBitsToDouble(m9212b(interfaceC2289h, i));
    }

    /* renamed from: b */
    private long m9211b(InterfaceC2289h interfaceC2289h) {
        interfaceC2289h.mo9280b();
        while (true) {
            interfaceC2289h.mo9276a(this.f8225a, 0, 4);
            int m9263a = C2246i.m9263a(this.f8225a[0]);
            if (m9263a != -1 && m9263a <= 4) {
                int m9264a = (int) C2246i.m9264a(this.f8225a, m9263a, false);
                if (this.f8228d.mo9225c(m9264a)) {
                    interfaceC2289h.mo9283c(m9263a);
                    return m9264a;
                }
            }
            interfaceC2289h.mo9283c(1);
        }
    }

    /* renamed from: b */
    private long m9212b(InterfaceC2289h interfaceC2289h, int i) {
        interfaceC2289h.readFully(this.f8225a, 0, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | (this.f8225a[i2] & 255);
        }
        return j;
    }

    /* renamed from: c */
    private String m9213c(InterfaceC2289h interfaceC2289h, int i) {
        if (i == 0) {
            return "";
        }
        byte[] bArr = new byte[i];
        interfaceC2289h.readFully(bArr, 0, i);
        while (i > 0 && bArr[i - 1] == 0) {
            i--;
        }
        return new String(bArr, 0, i);
    }

    @Override // p139d.p225c.p226a.p227a.p234f.p237c.InterfaceC2241d
    /* renamed from: a */
    public void mo9214a(InterfaceC2242e interfaceC2242e) {
        this.f8228d = interfaceC2242e;
    }

    @Override // p139d.p225c.p226a.p227a.p234f.p237c.InterfaceC2241d
    /* renamed from: a */
    public boolean mo9215a(InterfaceC2289h interfaceC2289h) {
        C2628e.m11113b(this.f8228d != null);
        while (true) {
            if (!this.f8226b.isEmpty() && interfaceC2289h.getPosition() >= this.f8226b.peek().f8233b) {
                this.f8228d.mo9218a(this.f8226b.pop().f8232a);
                return true;
            }
            if (this.f8229e == 0) {
                long m9266a = this.f8227c.m9266a(interfaceC2289h, true, false, 4);
                if (m9266a == -2) {
                    m9266a = m9211b(interfaceC2289h);
                }
                if (m9266a == -1) {
                    return false;
                }
                this.f8230f = (int) m9266a;
                this.f8229e = 1;
            }
            if (this.f8229e == 1) {
                this.f8231g = this.f8227c.m9266a(interfaceC2289h, false, true, 8);
                this.f8229e = 2;
            }
            int mo9224b = this.f8228d.mo9224b(this.f8230f);
            if (mo9224b != 0) {
                if (mo9224b == 1) {
                    long position = interfaceC2289h.getPosition();
                    this.f8226b.push(new a(this.f8230f, this.f8231g + position));
                    this.f8228d.mo9222a(this.f8230f, position, this.f8231g);
                    this.f8229e = 0;
                    return true;
                }
                if (mo9224b == 2) {
                    long j = this.f8231g;
                    if (j <= 8) {
                        this.f8228d.mo9221a(this.f8230f, m9212b(interfaceC2289h, (int) j));
                        this.f8229e = 0;
                        return true;
                    }
                    throw new C2683z("Invalid integer size: " + this.f8231g);
                }
                if (mo9224b == 3) {
                    long j2 = this.f8231g;
                    if (j2 <= 2147483647L) {
                        this.f8228d.mo9223a(this.f8230f, m9213c(interfaceC2289h, (int) j2));
                        this.f8229e = 0;
                        return true;
                    }
                    throw new C2683z("String element size: " + this.f8231g);
                }
                if (mo9224b == 4) {
                    this.f8228d.mo9220a(this.f8230f, (int) this.f8231g, interfaceC2289h);
                    this.f8229e = 0;
                    return true;
                }
                if (mo9224b != 5) {
                    throw new C2683z("Invalid element type " + mo9224b);
                }
                long j3 = this.f8231g;
                if (j3 == 4 || j3 == 8) {
                    this.f8228d.mo9219a(this.f8230f, m9210a(interfaceC2289h, (int) this.f8231g));
                    this.f8229e = 0;
                    return true;
                }
                throw new C2683z("Invalid float size: " + this.f8231g);
            }
            interfaceC2289h.mo9283c((int) this.f8231g);
            this.f8229e = 0;
        }
    }

    @Override // p139d.p225c.p226a.p227a.p234f.p237c.InterfaceC2241d
    public void reset() {
        this.f8229e = 0;
        this.f8226b.clear();
        this.f8227c.m9267b();
    }
}
