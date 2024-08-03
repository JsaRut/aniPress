package p139d.p225c.p226a.p227a.p234f.p240f;

import java.io.EOFException;
import java.io.IOException;
import p139d.p225c.p226a.p227a.p234f.C2336p;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2289h;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2335o;
import p139d.p225c.p226a.p227a.p270n.C2628e;

/* renamed from: d.c.a.a.f.f.c */
/* loaded from: classes.dex */
public final class C2275c implements InterfaceC2280h {

    /* renamed from: a */
    private final C2279g f8700a = new C2279g();

    /* renamed from: b */
    private final long f8701b;

    /* renamed from: c */
    private final long f8702c;

    /* renamed from: d */
    private final AbstractC2283k f8703d;

    /* renamed from: e */
    private int f8704e;

    /* renamed from: f */
    private long f8705f;

    /* renamed from: g */
    private long f8706g;

    /* renamed from: h */
    private long f8707h;

    /* renamed from: i */
    private long f8708i;

    /* renamed from: j */
    private long f8709j;

    /* renamed from: k */
    private long f8710k;

    /* renamed from: l */
    private long f8711l;

    /* renamed from: d.c.a.a.f.f.c$a */
    /* loaded from: classes.dex */
    public class a implements InterfaceC2335o {
        private a() {
        }

        /* synthetic */ a(C2275c c2275c, C2274b c2274b) {
            this();
        }

        @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2335o
        /* renamed from: b */
        public InterfaceC2335o.a mo9138b(long j) {
            if (j == 0) {
                return new InterfaceC2335o.a(new C2336p(0L, C2275c.this.f8701b));
            }
            long m9477b = C2275c.this.f8703d.m9477b(j);
            C2275c c2275c = C2275c.this;
            return new InterfaceC2335o.a(new C2336p(j, c2275c.m9434a(c2275c.f8701b, m9477b, 30000L)));
        }

        @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2335o
        /* renamed from: c */
        public boolean mo9140c() {
            return true;
        }

        @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2335o
        /* renamed from: d */
        public long mo9141d() {
            return C2275c.this.f8703d.m9474a(C2275c.this.f8705f);
        }
    }

    public C2275c(long j, long j2, AbstractC2283k abstractC2283k, long j3, long j4, boolean z) {
        C2628e.m11111a(j >= 0 && j2 > j);
        this.f8703d = abstractC2283k;
        this.f8701b = j;
        this.f8702c = j2;
        if (j3 != j2 - j && !z) {
            this.f8704e = 0;
        } else {
            this.f8705f = j4;
            this.f8704e = 3;
        }
    }

    /* renamed from: a */
    public long m9434a(long j, long j2, long j3) {
        long j4 = this.f8702c;
        long j5 = this.f8701b;
        long j6 = j + (((j2 * (j4 - j5)) / this.f8705f) - j3);
        if (j6 < j5) {
            j6 = j5;
        }
        long j7 = this.f8702c;
        return j6 >= j7 ? j7 - 1 : j6;
    }

    /* renamed from: a */
    public long m9439a(long j, InterfaceC2289h interfaceC2289h) {
        if (this.f8708i == this.f8709j) {
            return -(this.f8710k + 2);
        }
        long position = interfaceC2289h.getPosition();
        if (!m9443a(interfaceC2289h, this.f8709j)) {
            long j2 = this.f8708i;
            if (j2 != position) {
                return j2;
            }
            throw new IOException("No ogg page can be found.");
        }
        this.f8700a.m9467a(interfaceC2289h, false);
        interfaceC2289h.mo9280b();
        C2279g c2279g = this.f8700a;
        long j3 = j - c2279g.f8732d;
        int i = c2279g.f8737i + c2279g.f8738j;
        if (j3 >= 0 && j3 <= 72000) {
            interfaceC2289h.mo9283c(i);
            return -(this.f8700a.f8732d + 2);
        }
        if (j3 < 0) {
            this.f8709j = position;
            this.f8711l = this.f8700a.f8732d;
        } else {
            long j4 = i;
            this.f8708i = interfaceC2289h.getPosition() + j4;
            this.f8710k = this.f8700a.f8732d;
            if ((this.f8709j - this.f8708i) + j4 < 100000) {
                interfaceC2289h.mo9283c(i);
                return -(this.f8710k + 2);
            }
        }
        long j5 = this.f8709j;
        long j6 = this.f8708i;
        if (j5 - j6 < 100000) {
            this.f8709j = j6;
            return j6;
        }
        long position2 = interfaceC2289h.getPosition() - (i * (j3 > 0 ? 1L : 2L));
        long j7 = this.f8709j;
        long j8 = this.f8708i;
        return Math.min(Math.max(position2 + ((j3 * (j7 - j8)) / (this.f8711l - this.f8710k)), j8), this.f8709j - 1);
    }

    @Override // p139d.p225c.p226a.p227a.p234f.p240f.InterfaceC2280h
    /* renamed from: a */
    public long mo9440a(InterfaceC2289h interfaceC2289h) {
        int i = this.f8704e;
        if (i == 0) {
            this.f8706g = interfaceC2289h.getPosition();
            this.f8704e = 1;
            long j = this.f8702c - 65307;
            if (j > this.f8706g) {
                return j;
            }
        } else if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return -1L;
                }
                throw new IllegalStateException();
            }
            long j2 = this.f8707h;
            long j3 = 0;
            if (j2 != 0) {
                long m9439a = m9439a(j2, interfaceC2289h);
                if (m9439a >= 0) {
                    return m9439a;
                }
                j3 = m9441a(interfaceC2289h, this.f8707h, -(m9439a + 2));
            }
            this.f8704e = 3;
            return -(j3 + 2);
        }
        this.f8705f = m9444b(interfaceC2289h);
        this.f8704e = 3;
        return this.f8706g;
    }

    /* renamed from: a */
    long m9441a(InterfaceC2289h interfaceC2289h, long j, long j2) {
        this.f8700a.m9467a(interfaceC2289h, false);
        while (true) {
            C2279g c2279g = this.f8700a;
            if (c2279g.f8732d >= j) {
                interfaceC2289h.mo9280b();
                return j2;
            }
            interfaceC2289h.mo9283c(c2279g.f8737i + c2279g.f8738j);
            C2279g c2279g2 = this.f8700a;
            long j3 = c2279g2.f8732d;
            c2279g2.m9467a(interfaceC2289h, false);
            j2 = j3;
        }
    }

    @Override // p139d.p225c.p226a.p227a.p234f.p240f.InterfaceC2280h
    /* renamed from: a */
    public a mo9442a() {
        if (this.f8705f != 0) {
            return new a();
        }
        return null;
    }

    /* renamed from: a */
    boolean m9443a(InterfaceC2289h interfaceC2289h, long j) {
        int i;
        long min = Math.min(j + 3, this.f8702c);
        byte[] bArr = new byte[2048];
        int length = bArr.length;
        while (true) {
            int i2 = 0;
            if (interfaceC2289h.getPosition() + length > min) {
                int position = (int) (min - interfaceC2289h.getPosition());
                if (position < 4) {
                    return false;
                }
                length = position;
            }
            interfaceC2289h.mo9282b(bArr, 0, length, false);
            while (true) {
                i = length - 3;
                if (i2 < i) {
                    if (bArr[i2] == 79 && bArr[i2 + 1] == 103 && bArr[i2 + 2] == 103 && bArr[i2 + 3] == 83) {
                        interfaceC2289h.mo9283c(i2);
                        return true;
                    }
                    i2++;
                }
            }
            interfaceC2289h.mo9283c(i);
        }
    }

    /* renamed from: b */
    long m9444b(InterfaceC2289h interfaceC2289h) {
        m9447c(interfaceC2289h);
        this.f8700a.m9466a();
        while ((this.f8700a.f8731c & 4) != 4 && interfaceC2289h.getPosition() < this.f8702c) {
            this.f8700a.m9467a(interfaceC2289h, false);
            C2279g c2279g = this.f8700a;
            interfaceC2289h.mo9283c(c2279g.f8737i + c2279g.f8738j);
        }
        return this.f8700a.f8732d;
    }

    /* renamed from: b */
    public void m9445b() {
        this.f8708i = this.f8701b;
        this.f8709j = this.f8702c;
        this.f8710k = 0L;
        this.f8711l = this.f8705f;
    }

    @Override // p139d.p225c.p226a.p227a.p234f.p240f.InterfaceC2280h
    /* renamed from: c */
    public long mo9446c(long j) {
        int i = this.f8704e;
        C2628e.m11111a(i == 3 || i == 2);
        this.f8707h = j != 0 ? this.f8703d.m9477b(j) : 0L;
        this.f8704e = 2;
        m9445b();
        return this.f8707h;
    }

    /* renamed from: c */
    void m9447c(InterfaceC2289h interfaceC2289h) {
        if (!m9443a(interfaceC2289h, this.f8702c)) {
            throw new EOFException();
        }
    }
}
