package p139d.p225c.p226a.p227a.p234f.p242h;

import java.util.Collections;
import java.util.List;
import p139d.p225c.p226a.p227a.C2676s;
import p139d.p225c.p226a.p227a.p231d.C2213m;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2325i;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2337q;
import p139d.p225c.p226a.p227a.p234f.p242h.InterfaceC2296G;
import p139d.p225c.p226a.p227a.p270n.C2638o;
import p139d.p225c.p226a.p227a.p270n.C2642s;
import p139d.p225c.p226a.p227a.p270n.C2644u;
import p139d.p225c.p226a.p227a.p270n.C2645v;

/* renamed from: d.c.a.a.f.h.p */
/* loaded from: classes.dex */
public final class C2314p implements InterfaceC2310l {

    /* renamed from: a */
    private final C2291B f9018a;

    /* renamed from: b */
    private String f9019b;

    /* renamed from: c */
    private InterfaceC2337q f9020c;

    /* renamed from: d */
    private a f9021d;

    /* renamed from: e */
    private boolean f9022e;

    /* renamed from: l */
    private long f9029l;

    /* renamed from: m */
    private long f9030m;

    /* renamed from: f */
    private final boolean[] f9023f = new boolean[3];

    /* renamed from: g */
    private final C2318t f9024g = new C2318t(32, 128);

    /* renamed from: h */
    private final C2318t f9025h = new C2318t(33, 128);

    /* renamed from: i */
    private final C2318t f9026i = new C2318t(34, 128);

    /* renamed from: j */
    private final C2318t f9027j = new C2318t(39, 128);

    /* renamed from: k */
    private final C2318t f9028k = new C2318t(40, 128);

    /* renamed from: n */
    private final C2644u f9031n = new C2644u();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d.c.a.a.f.h.p$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private final InterfaceC2337q f9032a;

        /* renamed from: b */
        private long f9033b;

        /* renamed from: c */
        private boolean f9034c;

        /* renamed from: d */
        private int f9035d;

        /* renamed from: e */
        private long f9036e;

        /* renamed from: f */
        private boolean f9037f;

        /* renamed from: g */
        private boolean f9038g;

        /* renamed from: h */
        private boolean f9039h;

        /* renamed from: i */
        private boolean f9040i;

        /* renamed from: j */
        private boolean f9041j;

        /* renamed from: k */
        private long f9042k;

        /* renamed from: l */
        private long f9043l;

        /* renamed from: m */
        private boolean f9044m;

        public a(InterfaceC2337q interfaceC2337q) {
            this.f9032a = interfaceC2337q;
        }

        /* renamed from: a */
        private void m9623a(int i) {
            boolean z = this.f9044m;
            this.f9032a.mo9431a(this.f9043l, z ? 1 : 0, (int) (this.f9033b - this.f9042k), i, null);
        }

        /* renamed from: a */
        public void m9624a() {
            this.f9037f = false;
            this.f9038g = false;
            this.f9039h = false;
            this.f9040i = false;
            this.f9041j = false;
        }

        /* renamed from: a */
        public void m9625a(long j, int i) {
            if (this.f9041j && this.f9038g) {
                this.f9044m = this.f9034c;
                this.f9041j = false;
            } else if (this.f9039h || this.f9038g) {
                if (this.f9040i) {
                    m9623a(i + ((int) (j - this.f9033b)));
                }
                this.f9042k = this.f9033b;
                this.f9043l = this.f9036e;
                this.f9040i = true;
                this.f9044m = this.f9034c;
            }
        }

        /* renamed from: a */
        public void m9626a(long j, int i, int i2, long j2) {
            this.f9038g = false;
            this.f9039h = false;
            this.f9036e = j2;
            this.f9035d = 0;
            this.f9033b = j;
            boolean z = true;
            if (i2 >= 32) {
                if (!this.f9041j && this.f9040i) {
                    m9623a(i);
                    this.f9040i = false;
                }
                if (i2 <= 34) {
                    this.f9039h = !this.f9041j;
                    this.f9041j = true;
                }
            }
            this.f9034c = i2 >= 16 && i2 <= 21;
            if (!this.f9034c && i2 > 9) {
                z = false;
            }
            this.f9037f = z;
        }

        /* renamed from: a */
        public void m9627a(byte[] bArr, int i, int i2) {
            if (this.f9037f) {
                int i3 = this.f9035d;
                int i4 = (i + 2) - i3;
                if (i4 >= i2) {
                    this.f9035d = i3 + (i2 - i);
                } else {
                    this.f9038g = (bArr[i4] & 128) != 0;
                    this.f9037f = false;
                }
            }
        }
    }

    public C2314p(C2291B c2291b) {
        this.f9018a = c2291b;
    }

    /* renamed from: a */
    private static C2676s m9617a(String str, C2318t c2318t, C2318t c2318t2, C2318t c2318t3) {
        float f;
        int i = c2318t.f9087e;
        byte[] bArr = new byte[c2318t2.f9087e + i + c2318t3.f9087e];
        System.arraycopy(c2318t.f9086d, 0, bArr, 0, i);
        System.arraycopy(c2318t2.f9086d, 0, bArr, c2318t.f9087e, c2318t2.f9087e);
        System.arraycopy(c2318t3.f9086d, 0, bArr, c2318t.f9087e + c2318t2.f9087e, c2318t3.f9087e);
        C2645v c2645v = new C2645v(c2318t2.f9086d, 0, c2318t2.f9087e);
        c2645v.m11254c(44);
        int m11251b = c2645v.m11251b(3);
        c2645v.m11256e();
        c2645v.m11254c(88);
        c2645v.m11254c(8);
        int i2 = 0;
        for (int i3 = 0; i3 < m11251b; i3++) {
            if (c2645v.m11252b()) {
                i2 += 89;
            }
            if (c2645v.m11252b()) {
                i2 += 8;
            }
        }
        c2645v.m11254c(i2);
        if (m11251b > 0) {
            c2645v.m11254c((8 - m11251b) * 2);
        }
        c2645v.m11255d();
        int m11255d = c2645v.m11255d();
        if (m11255d == 3) {
            c2645v.m11256e();
        }
        int m11255d2 = c2645v.m11255d();
        int m11255d3 = c2645v.m11255d();
        if (c2645v.m11252b()) {
            int m11255d4 = c2645v.m11255d();
            int m11255d5 = c2645v.m11255d();
            int m11255d6 = c2645v.m11255d();
            int m11255d7 = c2645v.m11255d();
            m11255d2 -= ((m11255d == 1 || m11255d == 2) ? 2 : 1) * (m11255d4 + m11255d5);
            m11255d3 -= (m11255d == 1 ? 2 : 1) * (m11255d6 + m11255d7);
        }
        int i4 = m11255d2;
        int i5 = m11255d3;
        c2645v.m11255d();
        c2645v.m11255d();
        int m11255d8 = c2645v.m11255d();
        for (int i6 = c2645v.m11252b() ? 0 : m11251b; i6 <= m11251b; i6++) {
            c2645v.m11255d();
            c2645v.m11255d();
            c2645v.m11255d();
        }
        c2645v.m11255d();
        c2645v.m11255d();
        c2645v.m11255d();
        c2645v.m11255d();
        c2645v.m11255d();
        c2645v.m11255d();
        if (c2645v.m11252b() && c2645v.m11252b()) {
            m9619a(c2645v);
        }
        c2645v.m11254c(2);
        if (c2645v.m11252b()) {
            c2645v.m11254c(8);
            c2645v.m11255d();
            c2645v.m11255d();
            c2645v.m11256e();
        }
        m9622b(c2645v);
        if (c2645v.m11252b()) {
            for (int i7 = 0; i7 < c2645v.m11255d(); i7++) {
                c2645v.m11254c(m11255d8 + 4 + 1);
            }
        }
        c2645v.m11254c(2);
        float f2 = 1.0f;
        if (c2645v.m11252b() && c2645v.m11252b()) {
            int m11251b2 = c2645v.m11251b(8);
            if (m11251b2 == 255) {
                int m11251b3 = c2645v.m11251b(16);
                int m11251b4 = c2645v.m11251b(16);
                if (m11251b3 != 0 && m11251b4 != 0) {
                    f2 = m11251b3 / m11251b4;
                }
                f = f2;
            } else {
                float[] fArr = C2642s.f10981b;
                if (m11251b2 < fArr.length) {
                    f = fArr[m11251b2];
                } else {
                    C2638o.m11160d("H265Reader", "Unexpected aspect_ratio_idc value: " + m11251b2);
                }
            }
            return C2676s.m11422a(str, "video/hevc", (String) null, -1, -1, i4, i5, -1.0f, (List<byte[]>) Collections.singletonList(bArr), -1, f, (C2213m) null);
        }
        f = 1.0f;
        return C2676s.m11422a(str, "video/hevc", (String) null, -1, -1, i4, i5, -1.0f, (List<byte[]>) Collections.singletonList(bArr), -1, f, (C2213m) null);
    }

    /* renamed from: a */
    private void m9618a(long j, int i, int i2, long j2) {
        if (this.f9022e) {
            this.f9021d.m9625a(j, i);
        } else {
            this.f9024g.m9641a(i2);
            this.f9025h.m9641a(i2);
            this.f9026i.m9641a(i2);
            if (this.f9024g.m9640a() && this.f9025h.m9640a() && this.f9026i.m9640a()) {
                this.f9020c.mo9433a(m9617a(this.f9019b, this.f9024g, this.f9025h, this.f9026i));
                this.f9022e = true;
            }
        }
        if (this.f9027j.m9641a(i2)) {
            C2318t c2318t = this.f9027j;
            this.f9031n.m11213a(this.f9027j.f9086d, C2642s.m11187c(c2318t.f9086d, c2318t.f9087e));
            this.f9031n.m11224f(5);
            this.f9018a.m9506a(j2, this.f9031n);
        }
        if (this.f9028k.m9641a(i2)) {
            C2318t c2318t2 = this.f9028k;
            this.f9031n.m11213a(this.f9028k.f9086d, C2642s.m11187c(c2318t2.f9086d, c2318t2.f9087e));
            this.f9031n.m11224f(5);
            this.f9018a.m9506a(j2, this.f9031n);
        }
    }

    /* renamed from: a */
    private static void m9619a(C2645v c2645v) {
        for (int i = 0; i < 4; i++) {
            int i2 = 0;
            while (i2 < 6) {
                if (c2645v.m11252b()) {
                    int min = Math.min(64, 1 << ((i << 1) + 4));
                    if (i > 1) {
                        c2645v.m11253c();
                    }
                    for (int i3 = 0; i3 < min; i3++) {
                        c2645v.m11253c();
                    }
                } else {
                    c2645v.m11255d();
                }
                int i4 = 3;
                if (i != 3) {
                    i4 = 1;
                }
                i2 += i4;
            }
        }
    }

    /* renamed from: a */
    private void m9620a(byte[] bArr, int i, int i2) {
        if (this.f9022e) {
            this.f9021d.m9627a(bArr, i, i2);
        } else {
            this.f9024g.m9639a(bArr, i, i2);
            this.f9025h.m9639a(bArr, i, i2);
            this.f9026i.m9639a(bArr, i, i2);
        }
        this.f9027j.m9639a(bArr, i, i2);
        this.f9028k.m9639a(bArr, i, i2);
    }

    /* renamed from: b */
    private void m9621b(long j, int i, int i2, long j2) {
        if (this.f9022e) {
            this.f9021d.m9626a(j, i, i2, j2);
        } else {
            this.f9024g.m9643b(i2);
            this.f9025h.m9643b(i2);
            this.f9026i.m9643b(i2);
        }
        this.f9027j.m9643b(i2);
        this.f9028k.m9643b(i2);
    }

    /* renamed from: b */
    private static void m9622b(C2645v c2645v) {
        int m11255d = c2645v.m11255d();
        boolean z = false;
        int i = 0;
        for (int i2 = 0; i2 < m11255d; i2++) {
            if (i2 != 0) {
                z = c2645v.m11252b();
            }
            if (z) {
                c2645v.m11256e();
                c2645v.m11255d();
                for (int i3 = 0; i3 <= i; i3++) {
                    if (c2645v.m11252b()) {
                        c2645v.m11256e();
                    }
                }
            } else {
                int m11255d2 = c2645v.m11255d();
                int m11255d3 = c2645v.m11255d();
                int i4 = m11255d2 + m11255d3;
                for (int i5 = 0; i5 < m11255d2; i5++) {
                    c2645v.m11255d();
                    c2645v.m11256e();
                }
                for (int i6 = 0; i6 < m11255d3; i6++) {
                    c2645v.m11255d();
                    c2645v.m11256e();
                }
                i = i4;
            }
        }
    }

    @Override // p139d.p225c.p226a.p227a.p234f.p242h.InterfaceC2310l
    /* renamed from: a */
    public void mo9560a() {
        C2642s.m11183a(this.f9023f);
        this.f9024g.m9642b();
        this.f9025h.m9642b();
        this.f9026i.m9642b();
        this.f9027j.m9642b();
        this.f9028k.m9642b();
        this.f9021d.m9624a();
        this.f9029l = 0L;
    }

    @Override // p139d.p225c.p226a.p227a.p234f.p242h.InterfaceC2310l
    /* renamed from: a */
    public void mo9561a(long j, int i) {
        this.f9030m = j;
    }

    @Override // p139d.p225c.p226a.p227a.p234f.p242h.InterfaceC2310l
    /* renamed from: a */
    public void mo9562a(InterfaceC2325i interfaceC2325i, InterfaceC2296G.d dVar) {
        dVar.m9548a();
        this.f9019b = dVar.m9549b();
        this.f9020c = interfaceC2325i.mo9671a(dVar.m9550c(), 2);
        this.f9021d = new a(this.f9020c);
        this.f9018a.m9507a(interfaceC2325i, dVar);
    }

    @Override // p139d.p225c.p226a.p227a.p234f.p242h.InterfaceC2310l
    /* renamed from: a */
    public void mo9563a(C2644u c2644u) {
        while (c2644u.m11208a() > 0) {
            int m11217c = c2644u.m11217c();
            int m11219d = c2644u.m11219d();
            byte[] bArr = c2644u.f11004a;
            this.f9029l += c2644u.m11208a();
            this.f9020c.mo9432a(c2644u, c2644u.m11208a());
            while (m11217c < m11219d) {
                int m11179a = C2642s.m11179a(bArr, m11217c, m11219d, this.f9023f);
                if (m11179a == m11219d) {
                    m9620a(bArr, m11217c, m11219d);
                    return;
                }
                int m11178a = C2642s.m11178a(bArr, m11179a);
                int i = m11179a - m11217c;
                if (i > 0) {
                    m9620a(bArr, m11217c, m11179a);
                }
                int i2 = m11219d - m11179a;
                long j = this.f9029l - i2;
                m9618a(j, i2, i < 0 ? -i : 0, this.f9030m);
                m9621b(j, i2, m11178a, this.f9030m);
                m11217c = m11179a + 3;
            }
        }
    }

    @Override // p139d.p225c.p226a.p227a.p234f.p242h.InterfaceC2310l
    /* renamed from: b */
    public void mo9564b() {
    }
}
