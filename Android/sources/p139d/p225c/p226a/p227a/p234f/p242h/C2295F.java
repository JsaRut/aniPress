package p139d.p225c.p226a.p227a.p234f.p242h;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p139d.p225c.p226a.p227a.C2683z;
import p139d.p225c.p226a.p227a.p234f.AbstractC2227a;
import p139d.p225c.p226a.p227a.p234f.C2334n;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2287g;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2289h;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2325i;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2330j;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2335o;
import p139d.p225c.p226a.p227a.p234f.p242h.InterfaceC2296G;
import p139d.p225c.p226a.p227a.p270n.C2619F;
import p139d.p225c.p226a.p227a.p270n.C2622I;
import p139d.p225c.p226a.p227a.p270n.C2628e;
import p139d.p225c.p226a.p227a.p270n.C2643t;
import p139d.p225c.p226a.p227a.p270n.C2644u;

/* renamed from: d.c.a.a.f.h.F */
/* loaded from: classes.dex */
public final class C2295F implements InterfaceC2287g {

    /* renamed from: a */
    public static final InterfaceC2330j f8826a = C2302d.f8872a;

    /* renamed from: b */
    private static final long f8827b = C2622I.m11078b("AC-3");

    /* renamed from: c */
    private static final long f8828c = C2622I.m11078b("EAC3");

    /* renamed from: d */
    private static final long f8829d = C2622I.m11078b("HEVC");

    /* renamed from: e */
    private final int f8830e;

    /* renamed from: f */
    private final List<C2619F> f8831f;

    /* renamed from: g */
    private final C2644u f8832g;

    /* renamed from: h */
    private final SparseIntArray f8833h;

    /* renamed from: i */
    private final InterfaceC2296G.c f8834i;

    /* renamed from: j */
    private final SparseArray<InterfaceC2296G> f8835j;

    /* renamed from: k */
    private final SparseBooleanArray f8836k;

    /* renamed from: l */
    private final SparseBooleanArray f8837l;

    /* renamed from: m */
    private final C2294E f8838m;

    /* renamed from: n */
    private C2293D f8839n;

    /* renamed from: o */
    private InterfaceC2325i f8840o;

    /* renamed from: p */
    private int f8841p;

    /* renamed from: q */
    private boolean f8842q;

    /* renamed from: r */
    private boolean f8843r;

    /* renamed from: s */
    private boolean f8844s;

    /* renamed from: t */
    private InterfaceC2296G f8845t;

    /* renamed from: u */
    private int f8846u;

    /* renamed from: v */
    private int f8847v;

    /* renamed from: d.c.a.a.f.h.F$a */
    /* loaded from: classes.dex */
    public class a implements InterfaceC2324z {

        /* renamed from: a */
        private final C2643t f8848a = new C2643t(new byte[4]);

        public a() {
        }

        @Override // p139d.p225c.p226a.p227a.p234f.p242h.InterfaceC2324z
        /* renamed from: a */
        public void mo9508a(C2619F c2619f, InterfaceC2325i interfaceC2325i, InterfaceC2296G.d dVar) {
        }

        @Override // p139d.p225c.p226a.p227a.p234f.p242h.InterfaceC2324z
        /* renamed from: a */
        public void mo9509a(C2644u c2644u) {
            if (c2644u.m11238t() != 0) {
                return;
            }
            c2644u.m11224f(7);
            int m11208a = c2644u.m11208a() / 4;
            for (int i = 0; i < m11208a; i++) {
                c2644u.m11211a(this.f8848a, 4);
                int m11191a = this.f8848a.m11191a(16);
                this.f8848a.m11201c(3);
                if (m11191a == 0) {
                    this.f8848a.m11201c(13);
                } else {
                    int m11191a2 = this.f8848a.m11191a(13);
                    C2295F.this.f8835j.put(m11191a2, new C2290A(new b(m11191a2)));
                    C2295F.m9532d(C2295F.this);
                }
            }
            if (C2295F.this.f8830e != 2) {
                C2295F.this.f8835j.remove(0);
            }
        }
    }

    /* renamed from: d.c.a.a.f.h.F$b */
    /* loaded from: classes.dex */
    private class b implements InterfaceC2324z {

        /* renamed from: a */
        private final C2643t f8850a = new C2643t(new byte[5]);

        /* renamed from: b */
        private final SparseArray<InterfaceC2296G> f8851b = new SparseArray<>();

        /* renamed from: c */
        private final SparseIntArray f8852c = new SparseIntArray();

        /* renamed from: d */
        private final int f8853d;

        public b(int i) {
            this.f8853d = i;
        }

        /* renamed from: a */
        private InterfaceC2296G.b m9544a(C2644u c2644u, int i) {
            int m11217c = c2644u.m11217c();
            int i2 = i + m11217c;
            String str = null;
            int i3 = -1;
            ArrayList arrayList = null;
            while (c2644u.m11217c() < i2) {
                int m11238t = c2644u.m11238t();
                int m11217c2 = c2644u.m11217c() + c2644u.m11238t();
                if (m11238t == 5) {
                    long m11240v = c2644u.m11240v();
                    if (m11240v != C2295F.f8827b) {
                        if (m11240v != C2295F.f8828c) {
                            if (m11240v == C2295F.f8829d) {
                                i3 = 36;
                            }
                        }
                        i3 = 135;
                    }
                    i3 = 129;
                } else {
                    if (m11238t != 106) {
                        if (m11238t != 122) {
                            if (m11238t == 123) {
                                i3 = 138;
                            } else if (m11238t == 10) {
                                str = c2644u.m11216b(3).trim();
                            } else if (m11238t == 89) {
                                ArrayList arrayList2 = new ArrayList();
                                while (c2644u.m11217c() < m11217c2) {
                                    String trim = c2644u.m11216b(3).trim();
                                    int m11238t2 = c2644u.m11238t();
                                    byte[] bArr = new byte[4];
                                    c2644u.m11214a(bArr, 0, 4);
                                    arrayList2.add(new InterfaceC2296G.a(trim, m11238t2, bArr));
                                }
                                arrayList = arrayList2;
                                i3 = 89;
                            }
                        }
                        i3 = 135;
                    }
                    i3 = 129;
                }
                c2644u.m11224f(m11217c2 - c2644u.m11217c());
            }
            c2644u.m11222e(i2);
            return new InterfaceC2296G.b(i3, str, arrayList, Arrays.copyOfRange(c2644u.f11004a, m11217c, i2));
        }

        @Override // p139d.p225c.p226a.p227a.p234f.p242h.InterfaceC2324z
        /* renamed from: a */
        public void mo9508a(C2619F c2619f, InterfaceC2325i interfaceC2325i, InterfaceC2296G.d dVar) {
        }

        @Override // p139d.p225c.p226a.p227a.p234f.p242h.InterfaceC2324z
        /* renamed from: a */
        public void mo9509a(C2644u c2644u) {
            C2619F c2619f;
            if (c2644u.m11238t() != 2) {
                return;
            }
            if (C2295F.this.f8830e == 1 || C2295F.this.f8830e == 2 || C2295F.this.f8841p == 1) {
                c2619f = (C2619F) C2295F.this.f8831f.get(0);
            } else {
                c2619f = new C2619F(((C2619F) C2295F.this.f8831f.get(0)).m11019a());
                C2295F.this.f8831f.add(c2619f);
            }
            c2644u.m11224f(2);
            int m11244z = c2644u.m11244z();
            int i = 3;
            c2644u.m11224f(3);
            c2644u.m11211a(this.f8850a, 2);
            this.f8850a.m11201c(3);
            int i2 = 13;
            C2295F.this.f8847v = this.f8850a.m11191a(13);
            c2644u.m11211a(this.f8850a, 2);
            int i3 = 4;
            this.f8850a.m11201c(4);
            c2644u.m11224f(this.f8850a.m11191a(12));
            if (C2295F.this.f8830e == 2 && C2295F.this.f8845t == null) {
                InterfaceC2296G.b bVar = new InterfaceC2296G.b(21, null, null, C2622I.f10921f);
                C2295F c2295f = C2295F.this;
                c2295f.f8845t = c2295f.f8834i.mo9546a(21, bVar);
                C2295F.this.f8845t.mo9504a(c2619f, C2295F.this.f8840o, new InterfaceC2296G.d(m11244z, 21, 8192));
            }
            this.f8851b.clear();
            this.f8852c.clear();
            int m11208a = c2644u.m11208a();
            while (m11208a > 0) {
                c2644u.m11211a(this.f8850a, 5);
                int m11191a = this.f8850a.m11191a(8);
                this.f8850a.m11201c(i);
                int m11191a2 = this.f8850a.m11191a(i2);
                this.f8850a.m11201c(i3);
                int m11191a3 = this.f8850a.m11191a(12);
                InterfaceC2296G.b m9544a = m9544a(c2644u, m11191a3);
                if (m11191a == 6) {
                    m11191a = m9544a.f8858a;
                }
                m11208a -= m11191a3 + 5;
                int i4 = C2295F.this.f8830e == 2 ? m11191a : m11191a2;
                if (!C2295F.this.f8836k.get(i4)) {
                    InterfaceC2296G mo9546a = (C2295F.this.f8830e == 2 && m11191a == 21) ? C2295F.this.f8845t : C2295F.this.f8834i.mo9546a(m11191a, m9544a);
                    if (C2295F.this.f8830e != 2 || m11191a2 < this.f8852c.get(i4, 8192)) {
                        this.f8852c.put(i4, m11191a2);
                        this.f8851b.put(i4, mo9546a);
                    }
                }
                i = 3;
                i3 = 4;
                i2 = 13;
            }
            int size = this.f8852c.size();
            for (int i5 = 0; i5 < size; i5++) {
                int keyAt = this.f8852c.keyAt(i5);
                int valueAt = this.f8852c.valueAt(i5);
                C2295F.this.f8836k.put(keyAt, true);
                C2295F.this.f8837l.put(valueAt, true);
                InterfaceC2296G valueAt2 = this.f8851b.valueAt(i5);
                if (valueAt2 != null) {
                    if (valueAt2 != C2295F.this.f8845t) {
                        valueAt2.mo9504a(c2619f, C2295F.this.f8840o, new InterfaceC2296G.d(m11244z, keyAt, 8192));
                    }
                    C2295F.this.f8835j.put(valueAt, valueAt2);
                }
            }
            if (C2295F.this.f8830e != 2) {
                C2295F.this.f8835j.remove(this.f8853d);
                C2295F c2295f2 = C2295F.this;
                c2295f2.f8841p = c2295f2.f8830e != 1 ? C2295F.this.f8841p - 1 : 0;
                if (C2295F.this.f8841p != 0) {
                    return;
                } else {
                    C2295F.this.f8840o.mo9672a();
                }
            } else {
                if (C2295F.this.f8842q) {
                    return;
                }
                C2295F.this.f8840o.mo9672a();
                C2295F.this.f8841p = 0;
            }
            C2295F.this.f8842q = true;
        }
    }

    public C2295F() {
        this(0);
    }

    public C2295F(int i) {
        this(1, i);
    }

    public C2295F(int i, int i2) {
        this(i, new C2619F(0L), new C2307i(i2));
    }

    public C2295F(int i, C2619F c2619f, InterfaceC2296G.c cVar) {
        C2628e.m11110a(cVar);
        this.f8834i = cVar;
        this.f8830e = i;
        if (i == 1 || i == 2) {
            this.f8831f = Collections.singletonList(c2619f);
        } else {
            this.f8831f = new ArrayList();
            this.f8831f.add(c2619f);
        }
        this.f8832g = new C2644u(new byte[9400], 0);
        this.f8836k = new SparseBooleanArray();
        this.f8837l = new SparseBooleanArray();
        this.f8835j = new SparseArray<>();
        this.f8833h = new SparseIntArray();
        this.f8838m = new C2294E();
        this.f8847v = -1;
        m9539g();
    }

    /* renamed from: a */
    private void m9523a(long j) {
        InterfaceC2325i interfaceC2325i;
        InterfaceC2335o bVar;
        if (this.f8843r) {
            return;
        }
        this.f8843r = true;
        if (this.f8838m.m9517a() != -9223372036854775807L) {
            this.f8839n = new C2293D(this.f8838m.m9518b(), this.f8838m.m9517a(), j, this.f8847v);
            interfaceC2325i = this.f8840o;
            bVar = this.f8839n.m9127a();
        } else {
            interfaceC2325i = this.f8840o;
            bVar = new InterfaceC2335o.b(this.f8838m.m9517a());
        }
        interfaceC2325i.mo9673a(bVar);
    }

    /* renamed from: a */
    private boolean m9524a(int i) {
        return this.f8830e == 2 || this.f8842q || !this.f8837l.get(i, false);
    }

    /* renamed from: b */
    private boolean m9529b(InterfaceC2289h interfaceC2289h) {
        C2644u c2644u = this.f8832g;
        byte[] bArr = c2644u.f11004a;
        if (9400 - c2644u.m11217c() < 188) {
            int m11208a = this.f8832g.m11208a();
            if (m11208a > 0) {
                System.arraycopy(bArr, this.f8832g.m11217c(), bArr, 0, m11208a);
            }
            this.f8832g.m11213a(bArr, m11208a);
        }
        while (this.f8832g.m11208a() < 188) {
            int m11219d = this.f8832g.m11219d();
            int read = interfaceC2289h.read(bArr, m11219d, 9400 - m11219d);
            if (read == -1) {
                return false;
            }
            this.f8832g.m11220d(m11219d + read);
        }
        return true;
    }

    /* renamed from: d */
    static /* synthetic */ int m9532d(C2295F c2295f) {
        int i = c2295f.f8841p;
        c2295f.f8841p = i + 1;
        return i;
    }

    /* renamed from: e */
    public static /* synthetic */ InterfaceC2287g[] m9535e() {
        return new InterfaceC2287g[]{new C2295F()};
    }

    /* renamed from: f */
    private int m9536f() {
        int m11217c = this.f8832g.m11217c();
        int m11219d = this.f8832g.m11219d();
        int m9551a = C2297H.m9551a(this.f8832g.f11004a, m11217c, m11219d);
        this.f8832g.m11222e(m9551a);
        int i = m9551a + 188;
        if (i > m11219d) {
            this.f8846u += m9551a - m11217c;
            if (this.f8830e == 2 && this.f8846u > 376) {
                throw new C2683z("Cannot find sync byte. Most likely not a Transport Stream.");
            }
        } else {
            this.f8846u = 0;
        }
        return i;
    }

    /* renamed from: g */
    private void m9539g() {
        this.f8836k.clear();
        this.f8835j.clear();
        SparseArray<InterfaceC2296G> mo9545a = this.f8834i.mo9545a();
        int size = mo9545a.size();
        for (int i = 0; i < size; i++) {
            this.f8835j.put(mo9545a.keyAt(i), mo9545a.valueAt(i));
        }
        this.f8835j.put(0, new C2290A(new a()));
        this.f8845t = null;
    }

    @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2287g
    /* renamed from: a */
    public int mo9157a(InterfaceC2289h interfaceC2289h, C2334n c2334n) {
        long length = interfaceC2289h.getLength();
        if (this.f8842q) {
            if (((length == -1 || this.f8830e == 2) ? false : true) && !this.f8838m.m9519c()) {
                return this.f8838m.m9516a(interfaceC2289h, c2334n, this.f8847v);
            }
            m9523a(length);
            if (this.f8844s) {
                this.f8844s = false;
                mo9159a(0L, 0L);
                if (interfaceC2289h.getPosition() != 0) {
                    c2334n.f9165a = 0L;
                    return 1;
                }
            }
            C2293D c2293d = this.f8839n;
            if (c2293d != null && c2293d.m9132b()) {
                return this.f8839n.m9125a(interfaceC2289h, c2334n, (AbstractC2227a.c) null);
            }
        }
        if (!m9529b(interfaceC2289h)) {
            return -1;
        }
        int m9536f = m9536f();
        int m11219d = this.f8832g.m11219d();
        if (m9536f > m11219d) {
            return 0;
        }
        int m11226h = this.f8832g.m11226h();
        if ((8388608 & m11226h) == 0) {
            int i = ((4194304 & m11226h) != 0 ? 1 : 0) | 0;
            int i2 = (2096896 & m11226h) >> 8;
            boolean z = (m11226h & 32) != 0;
            InterfaceC2296G interfaceC2296G = (m11226h & 16) != 0 ? this.f8835j.get(i2) : null;
            if (interfaceC2296G != null) {
                if (this.f8830e != 2) {
                    int i3 = m11226h & 15;
                    int i4 = this.f8833h.get(i2, i3 - 1);
                    this.f8833h.put(i2, i3);
                    if (i4 != i3) {
                        if (i3 != ((i4 + 1) & 15)) {
                            interfaceC2296G.mo9503a();
                        }
                    }
                }
                if (z) {
                    int m11238t = this.f8832g.m11238t();
                    i |= (this.f8832g.m11238t() & 64) != 0 ? 2 : 0;
                    this.f8832g.m11224f(m11238t - 1);
                }
                boolean z2 = this.f8842q;
                if (m9524a(i2)) {
                    this.f8832g.m11220d(m9536f);
                    interfaceC2296G.mo9505a(this.f8832g, i);
                    this.f8832g.m11220d(m11219d);
                }
                if (this.f8830e != 2 && !z2 && this.f8842q && length != -1) {
                    this.f8844s = true;
                }
            }
        }
        this.f8832g.m11222e(m9536f);
        return 0;
    }

    @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2287g
    /* renamed from: a */
    public void mo9158a() {
    }

    @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2287g
    /* renamed from: a */
    public void mo9159a(long j, long j2) {
        C2293D c2293d;
        C2628e.m11113b(this.f8830e != 2);
        int size = this.f8831f.size();
        for (int i = 0; i < size; i++) {
            C2619F c2619f = this.f8831f.get(i);
            if ((c2619f.m11023c() == -9223372036854775807L) || (c2619f.m11023c() != 0 && c2619f.m11019a() != j2)) {
                c2619f.m11024d();
                c2619f.m11025d(j2);
            }
        }
        if (j2 != 0 && (c2293d = this.f8839n) != null) {
            c2293d.m9130b(j2);
        }
        this.f8832g.m11207B();
        this.f8833h.clear();
        for (int i2 = 0; i2 < this.f8835j.size(); i2++) {
            this.f8835j.valueAt(i2).mo9503a();
        }
        this.f8846u = 0;
    }

    @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2287g
    /* renamed from: a */
    public void mo9160a(InterfaceC2325i interfaceC2325i) {
        this.f8840o = interfaceC2325i;
    }

    @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2287g
    /* renamed from: a */
    public boolean mo9161a(InterfaceC2289h interfaceC2289h) {
        boolean z;
        byte[] bArr = this.f8832g.f11004a;
        interfaceC2289h.mo9276a(bArr, 0, 940);
        for (int i = 0; i < 188; i++) {
            int i2 = 0;
            while (true) {
                if (i2 >= 5) {
                    z = true;
                    break;
                }
                if (bArr[(i2 * 188) + i] != 71) {
                    z = false;
                    break;
                }
                i2++;
            }
            if (z) {
                interfaceC2289h.mo9283c(i);
                return true;
            }
        }
        return false;
    }
}
