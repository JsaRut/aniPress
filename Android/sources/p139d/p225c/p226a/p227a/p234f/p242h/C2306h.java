package p139d.p225c.p226a.p227a.p234f.p242h;

import android.util.Pair;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p139d.p225c.p226a.p227a.C2676s;
import p139d.p225c.p226a.p227a.p231d.C2213m;
import p139d.p225c.p226a.p227a.p234f.C2272f;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2325i;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2337q;
import p139d.p225c.p226a.p227a.p234f.p242h.InterfaceC2296G;
import p139d.p225c.p226a.p227a.p270n.C2630g;
import p139d.p225c.p226a.p227a.p270n.C2638o;
import p139d.p225c.p226a.p227a.p270n.C2643t;
import p139d.p225c.p226a.p227a.p270n.C2644u;

/* renamed from: d.c.a.a.f.h.h */
/* loaded from: classes.dex */
public final class C2306h implements InterfaceC2310l {

    /* renamed from: a */
    private static final byte[] f8906a = {73, 68, 51};

    /* renamed from: b */
    private final boolean f8907b;

    /* renamed from: c */
    private final C2643t f8908c;

    /* renamed from: d */
    private final C2644u f8909d;

    /* renamed from: e */
    private final String f8910e;

    /* renamed from: f */
    private String f8911f;

    /* renamed from: g */
    private InterfaceC2337q f8912g;

    /* renamed from: h */
    private InterfaceC2337q f8913h;

    /* renamed from: i */
    private int f8914i;

    /* renamed from: j */
    private int f8915j;

    /* renamed from: k */
    private int f8916k;

    /* renamed from: l */
    private boolean f8917l;

    /* renamed from: m */
    private boolean f8918m;

    /* renamed from: n */
    private int f8919n;

    /* renamed from: o */
    private int f8920o;

    /* renamed from: p */
    private int f8921p;

    /* renamed from: q */
    private boolean f8922q;

    /* renamed from: r */
    private long f8923r;

    /* renamed from: s */
    private int f8924s;

    /* renamed from: t */
    private long f8925t;

    /* renamed from: u */
    private InterfaceC2337q f8926u;

    /* renamed from: v */
    private long f8927v;

    public C2306h(boolean z) {
        this(z, null);
    }

    public C2306h(boolean z, String str) {
        this.f8908c = new C2643t(new byte[7]);
        this.f8909d = new C2644u(Arrays.copyOf(f8906a, 10));
        m9584h();
        this.f8919n = -1;
        this.f8920o = -1;
        this.f8923r = -9223372036854775807L;
        this.f8907b = z;
        this.f8910e = str;
    }

    /* renamed from: a */
    private void m9571a(InterfaceC2337q interfaceC2337q, long j, int i, int i2) {
        this.f8914i = 4;
        this.f8915j = i;
        this.f8926u = interfaceC2337q;
        this.f8927v = j;
        this.f8924s = i2;
    }

    /* renamed from: a */
    private boolean m9572a(byte b2, byte b3) {
        return m9573a(((b2 & 255) << 8) | (b3 & 255));
    }

    /* renamed from: a */
    public static boolean m9573a(int i) {
        return (i & 65526) == 65520;
    }

    /* renamed from: a */
    private boolean m9574a(C2644u c2644u, int i) {
        c2644u.m11222e(i + 1);
        if (!m9577b(c2644u, this.f8908c.f11000a, 1)) {
            return false;
        }
        this.f8908c.m11198b(4);
        int m11191a = this.f8908c.m11191a(1);
        int i2 = this.f8919n;
        if (i2 != -1 && m11191a != i2) {
            return false;
        }
        if (this.f8920o != -1) {
            if (!m9577b(c2644u, this.f8908c.f11000a, 1)) {
                return true;
            }
            this.f8908c.m11198b(2);
            if (this.f8908c.m11191a(4) != this.f8920o) {
                return false;
            }
            c2644u.m11222e(i + 2);
        }
        if (!m9577b(c2644u, this.f8908c.f11000a, 4)) {
            return true;
        }
        this.f8908c.m11198b(14);
        int m11191a2 = this.f8908c.m11191a(13);
        if (m11191a2 <= 6) {
            return false;
        }
        int i3 = i + m11191a2;
        int i4 = i3 + 1;
        if (i4 >= c2644u.m11219d()) {
            return true;
        }
        byte[] bArr = c2644u.f11004a;
        return m9572a(bArr[i3], bArr[i4]) && (this.f8919n == -1 || ((c2644u.f11004a[i4] & 8) >> 3) == m11191a);
    }

    /* renamed from: a */
    private boolean m9575a(C2644u c2644u, byte[] bArr, int i) {
        int min = Math.min(c2644u.m11208a(), i - this.f8915j);
        c2644u.m11214a(bArr, this.f8915j, min);
        this.f8915j += min;
        return this.f8915j == i;
    }

    /* renamed from: b */
    private void m9576b(C2644u c2644u) {
        if (c2644u.m11208a() == 0) {
            return;
        }
        this.f8908c.f11000a[0] = c2644u.f11004a[c2644u.m11217c()];
        this.f8908c.m11198b(2);
        int m11191a = this.f8908c.m11191a(4);
        int i = this.f8920o;
        if (i != -1 && m11191a != i) {
            m9582f();
            return;
        }
        if (!this.f8918m) {
            this.f8918m = true;
            this.f8919n = this.f8921p;
            this.f8920o = m11191a;
        }
        m9585i();
    }

    /* renamed from: b */
    private boolean m9577b(C2644u c2644u, byte[] bArr, int i) {
        if (c2644u.m11208a() < i) {
            return false;
        }
        c2644u.m11214a(bArr, 0, i);
        return true;
    }

    /* renamed from: c */
    private void m9578c(C2644u c2644u) {
        int i;
        byte[] bArr = c2644u.f11004a;
        int m11217c = c2644u.m11217c();
        int m11219d = c2644u.m11219d();
        while (m11217c < m11219d) {
            int i2 = m11217c + 1;
            int i3 = bArr[m11217c] & 255;
            if (this.f8916k == 512 && m9572a((byte) -1, (byte) i3) && (this.f8918m || m9574a(c2644u, i2 - 2))) {
                this.f8921p = (i3 & 8) >> 3;
                this.f8917l = (i3 & 1) == 0;
                if (this.f8918m) {
                    m9585i();
                } else {
                    m9583g();
                }
                c2644u.m11222e(i2);
                return;
            }
            int i4 = this.f8916k;
            int i5 = i3 | i4;
            if (i5 != 329) {
                if (i5 == 511) {
                    this.f8916k = 512;
                } else if (i5 == 836) {
                    i = 1024;
                } else if (i5 == 1075) {
                    m9586j();
                    c2644u.m11222e(i2);
                    return;
                } else if (i4 != 256) {
                    this.f8916k = 256;
                    i2--;
                }
                m11217c = i2;
            } else {
                i = 768;
            }
            this.f8916k = i;
            m11217c = i2;
        }
        c2644u.m11222e(m11217c);
    }

    /* renamed from: d */
    private void m9579d() {
        this.f8908c.m11198b(0);
        if (this.f8922q) {
            this.f8908c.m11201c(10);
        } else {
            int m11191a = this.f8908c.m11191a(2) + 1;
            if (m11191a != 2) {
                C2638o.m11160d("AdtsReader", "Detected audio object type: " + m11191a + ", but assuming AAC LC.");
                m11191a = 2;
            }
            this.f8908c.m11201c(5);
            byte[] m11121a = C2630g.m11121a(m11191a, this.f8920o, this.f8908c.m11191a(3));
            Pair<Integer, Integer> m11118a = C2630g.m11118a(m11121a);
            C2676s m11426a = C2676s.m11426a(this.f8911f, "audio/mp4a-latm", (String) null, -1, -1, ((Integer) m11118a.second).intValue(), ((Integer) m11118a.first).intValue(), (List<byte[]>) Collections.singletonList(m11121a), (C2213m) null, 0, this.f8910e);
            this.f8923r = 1024000000 / m11426a.f11196u;
            this.f8912g.mo9433a(m11426a);
            this.f8922q = true;
        }
        this.f8908c.m11201c(4);
        int m11191a2 = (this.f8908c.m11191a(13) - 2) - 5;
        if (this.f8917l) {
            m11191a2 -= 2;
        }
        m9571a(this.f8912g, this.f8923r, 0, m11191a2);
    }

    /* renamed from: d */
    private void m9580d(C2644u c2644u) {
        int min = Math.min(c2644u.m11208a(), this.f8924s - this.f8915j);
        this.f8926u.mo9432a(c2644u, min);
        this.f8915j += min;
        int i = this.f8915j;
        int i2 = this.f8924s;
        if (i == i2) {
            this.f8926u.mo9431a(this.f8925t, 1, i2, 0, null);
            this.f8925t += this.f8927v;
            m9584h();
        }
    }

    /* renamed from: e */
    private void m9581e() {
        this.f8913h.mo9432a(this.f8909d, 10);
        this.f8909d.m11222e(6);
        m9571a(this.f8913h, 0L, 10, this.f8909d.m11237s() + 10);
    }

    /* renamed from: f */
    private void m9582f() {
        this.f8918m = false;
        m9584h();
    }

    /* renamed from: g */
    private void m9583g() {
        this.f8914i = 1;
        this.f8915j = 0;
    }

    /* renamed from: h */
    private void m9584h() {
        this.f8914i = 0;
        this.f8915j = 0;
        this.f8916k = 256;
    }

    /* renamed from: i */
    private void m9585i() {
        this.f8914i = 3;
        this.f8915j = 0;
    }

    /* renamed from: j */
    private void m9586j() {
        this.f8914i = 2;
        this.f8915j = f8906a.length;
        this.f8924s = 0;
        this.f8909d.m11222e(0);
    }

    @Override // p139d.p225c.p226a.p227a.p234f.p242h.InterfaceC2310l
    /* renamed from: a */
    public void mo9560a() {
        m9582f();
    }

    @Override // p139d.p225c.p226a.p227a.p234f.p242h.InterfaceC2310l
    /* renamed from: a */
    public void mo9561a(long j, int i) {
        this.f8925t = j;
    }

    @Override // p139d.p225c.p226a.p227a.p234f.p242h.InterfaceC2310l
    /* renamed from: a */
    public void mo9562a(InterfaceC2325i interfaceC2325i, InterfaceC2296G.d dVar) {
        dVar.m9548a();
        this.f8911f = dVar.m9549b();
        this.f8912g = interfaceC2325i.mo9671a(dVar.m9550c(), 1);
        if (!this.f8907b) {
            this.f8913h = new C2272f();
            return;
        }
        dVar.m9548a();
        this.f8913h = interfaceC2325i.mo9671a(dVar.m9550c(), 4);
        this.f8913h.mo9433a(C2676s.m11430a(dVar.m9549b(), "application/id3", (String) null, -1, (C2213m) null));
    }

    @Override // p139d.p225c.p226a.p227a.p234f.p242h.InterfaceC2310l
    /* renamed from: a */
    public void mo9563a(C2644u c2644u) {
        while (c2644u.m11208a() > 0) {
            int i = this.f8914i;
            if (i == 0) {
                m9578c(c2644u);
            } else if (i == 1) {
                m9576b(c2644u);
            } else if (i != 2) {
                if (i == 3) {
                    if (m9575a(c2644u, this.f8908c.f11000a, this.f8917l ? 7 : 5)) {
                        m9579d();
                    }
                } else {
                    if (i != 4) {
                        throw new IllegalStateException();
                    }
                    m9580d(c2644u);
                }
            } else if (m9575a(c2644u, this.f8909d.f11004a, 10)) {
                m9581e();
            }
        }
    }

    @Override // p139d.p225c.p226a.p227a.p234f.p242h.InterfaceC2310l
    /* renamed from: b */
    public void mo9564b() {
    }

    /* renamed from: c */
    public long m9587c() {
        return this.f8923r;
    }
}
