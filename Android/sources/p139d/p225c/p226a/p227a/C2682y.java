package p139d.p225c.p226a.p227a;

import android.util.Pair;
import p139d.p225c.p226a.p227a.AbstractC2151P;
import p139d.p225c.p226a.p227a.p250j.InterfaceC2514x;
import p139d.p225c.p226a.p227a.p250j.InterfaceC2515y;
import p139d.p225c.p226a.p227a.p268l.AbstractC2579m;
import p139d.p225c.p226a.p227a.p269m.InterfaceC2590d;
import p139d.p225c.p226a.p227a.p270n.C2628e;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: d.c.a.a.y */
/* loaded from: classes.dex */
public final class C2682y {

    /* renamed from: c */
    private long f11229c;

    /* renamed from: e */
    private int f11231e;

    /* renamed from: f */
    private boolean f11232f;

    /* renamed from: g */
    private C2680w f11233g;

    /* renamed from: h */
    private C2680w f11234h;

    /* renamed from: i */
    private C2680w f11235i;

    /* renamed from: j */
    private int f11236j;

    /* renamed from: k */
    private Object f11237k;

    /* renamed from: l */
    private long f11238l;

    /* renamed from: a */
    private final AbstractC2151P.a f11227a = new AbstractC2151P.a();

    /* renamed from: b */
    private final AbstractC2151P.b f11228b = new AbstractC2151P.b();

    /* renamed from: d */
    private AbstractC2151P f11230d = AbstractC2151P.f7699a;

    /* renamed from: a */
    private long m11465a(Object obj) {
        int mo8637a;
        int i = this.f11230d.m8648a(obj, this.f11227a).f7702c;
        Object obj2 = this.f11237k;
        if (obj2 != null && (mo8637a = this.f11230d.mo8637a(obj2)) != -1 && this.f11230d.m8647a(mo8637a, this.f11227a).f7702c == i) {
            return this.f11238l;
        }
        for (C2680w m11490c = m11490c(); m11490c != null; m11490c = m11490c.f11213h) {
            if (m11490c.f11207b.equals(obj)) {
                return m11490c.f11212g.f11221a.f10274d;
            }
        }
        for (C2680w m11490c2 = m11490c(); m11490c2 != null; m11490c2 = m11490c2.f11213h) {
            int mo8637a2 = this.f11230d.mo8637a(m11490c2.f11207b);
            if (mo8637a2 != -1 && this.f11230d.m8647a(mo8637a2, this.f11227a).f7702c == i) {
                return m11490c2.f11212g.f11221a.f10274d;
            }
        }
        long j = this.f11229c;
        this.f11229c = 1 + j;
        return j;
    }

    /* renamed from: a */
    private C2681x m11466a(C2136A c2136a) {
        return m11467a(c2136a.f7630d, c2136a.f7632f, c2136a.f7631e);
    }

    /* renamed from: a */
    private C2681x m11467a(InterfaceC2515y.a aVar, long j, long j2) {
        this.f11230d.m8648a(aVar.f10271a, this.f11227a);
        if (!aVar.m10487a()) {
            return m11470a(aVar.f10271a, j2, aVar.f10274d);
        }
        if (this.f11227a.m8667c(aVar.f10272b, aVar.f10273c)) {
            return m11469a(aVar.f10271a, aVar.f10272b, aVar.f10273c, j, aVar.f10274d);
        }
        return null;
    }

    /* renamed from: a */
    private C2681x m11468a(C2680w c2680w, long j) {
        long j2;
        Object obj;
        long j3;
        long j4;
        C2681x c2681x = c2680w.f11212g;
        long m11458c = (c2680w.m11458c() + c2681x.f11224d) - j;
        long j5 = 0;
        if (c2681x.f11225e) {
            int m8643a = this.f11230d.m8643a(this.f11230d.mo8637a(c2681x.f11221a.f10271a), this.f11227a, this.f11228b, this.f11231e, this.f11232f);
            if (m8643a == -1) {
                return null;
            }
            int i = this.f11230d.mo8638a(m8643a, this.f11227a, true).f7702c;
            Object obj2 = this.f11227a.f7701b;
            long j6 = c2681x.f11221a.f10274d;
            if (this.f11230d.m8649a(i, this.f11228b).f7711f == m8643a) {
                Pair<Object, Long> m8646a = this.f11230d.m8646a(this.f11228b, this.f11227a, i, -9223372036854775807L, Math.max(0L, m11458c));
                if (m8646a == null) {
                    return null;
                }
                Object obj3 = m8646a.first;
                long longValue = ((Long) m8646a.second).longValue();
                C2680w c2680w2 = c2680w.f11213h;
                if (c2680w2 == null || !c2680w2.f11207b.equals(obj3)) {
                    j4 = this.f11229c;
                    this.f11229c = 1 + j4;
                } else {
                    j4 = c2680w.f11213h.f11212g.f11221a.f10274d;
                }
                j5 = longValue;
                j3 = j4;
                obj = obj3;
            } else {
                obj = obj2;
                j3 = j6;
            }
            long j7 = j5;
            return m11467a(m11474b(obj, j7, j3), j7, j5);
        }
        InterfaceC2515y.a aVar = c2681x.f11221a;
        this.f11230d.m8648a(aVar.f10271a, this.f11227a);
        if (aVar.m10487a()) {
            int i2 = aVar.f10272b;
            int m8656a = this.f11227a.m8656a(i2);
            if (m8656a == -1) {
                return null;
            }
            int m8661b = this.f11227a.m8661b(i2, aVar.f10273c);
            if (m8661b < m8656a) {
                if (this.f11227a.m8667c(i2, m8661b)) {
                    return m11469a(aVar.f10271a, i2, m8661b, c2681x.f11223c, aVar.f10274d);
                }
                return null;
            }
            long j8 = c2681x.f11223c;
            if (this.f11227a.m8655a() == 1 && this.f11227a.m8664b(0) == 0) {
                AbstractC2151P abstractC2151P = this.f11230d;
                AbstractC2151P.b bVar = this.f11228b;
                AbstractC2151P.a aVar2 = this.f11227a;
                Pair<Object, Long> m8646a2 = abstractC2151P.m8646a(bVar, aVar2, aVar2.f7702c, -9223372036854775807L, Math.max(0L, m11458c));
                if (m8646a2 == null) {
                    return null;
                }
                j2 = ((Long) m8646a2.second).longValue();
            } else {
                j2 = j8;
            }
            return m11470a(aVar.f10271a, j2, aVar.f10274d);
        }
        long j9 = c2681x.f11221a.f10275e;
        if (j9 != Long.MIN_VALUE) {
            int m8662b = this.f11227a.m8662b(j9);
            if (m8662b == -1) {
                return m11470a(aVar.f10271a, c2681x.f11221a.f10275e, aVar.f10274d);
            }
            int m8665c = this.f11227a.m8665c(m8662b);
            if (this.f11227a.m8667c(m8662b, m8665c)) {
                return m11469a(aVar.f10271a, m8662b, m8665c, c2681x.f11221a.f10275e, aVar.f10274d);
            }
            return null;
        }
        int m8655a = this.f11227a.m8655a();
        if (m8655a == 0) {
            return null;
        }
        int i3 = m8655a - 1;
        if (this.f11227a.m8664b(i3) != Long.MIN_VALUE || this.f11227a.m8669d(i3)) {
            return null;
        }
        int m8665c2 = this.f11227a.m8665c(i3);
        if (!this.f11227a.m8667c(i3, m8665c2)) {
            return null;
        }
        return m11469a(aVar.f10271a, i3, m8665c2, this.f11227a.m8666c(), aVar.f10274d);
    }

    /* renamed from: a */
    private C2681x m11469a(Object obj, int i, int i2, long j, long j2) {
        InterfaceC2515y.a aVar = new InterfaceC2515y.a(obj, i, i2, j2);
        boolean m11471a = m11471a(aVar);
        boolean m11472a = m11472a(aVar, m11471a);
        return new C2681x(aVar, i2 == this.f11227a.m8665c(i) ? this.f11227a.m8663b() : 0L, j, this.f11230d.m8648a(aVar.f10271a, this.f11227a).m8658a(aVar.f10272b, aVar.f10273c), m11471a, m11472a);
    }

    /* renamed from: a */
    private C2681x m11470a(Object obj, long j, long j2) {
        int m8657a = this.f11227a.m8657a(j);
        long m8664b = m8657a == -1 ? Long.MIN_VALUE : this.f11227a.m8664b(m8657a);
        InterfaceC2515y.a aVar = new InterfaceC2515y.a(obj, j2, m8664b);
        this.f11230d.m8648a(aVar.f10271a, this.f11227a);
        boolean m11471a = m11471a(aVar);
        return new C2681x(aVar, j, -9223372036854775807L, m8664b == Long.MIN_VALUE ? this.f11227a.m8666c() : m8664b, m11471a, m11472a(aVar, m11471a));
    }

    /* renamed from: a */
    private boolean m11471a(InterfaceC2515y.a aVar) {
        int m8655a = this.f11230d.m8648a(aVar.f10271a, this.f11227a).m8655a();
        if (m8655a == 0) {
            return true;
        }
        int i = m8655a - 1;
        boolean m10487a = aVar.m10487a();
        if (this.f11227a.m8664b(i) != Long.MIN_VALUE) {
            return !m10487a && aVar.f10275e == Long.MIN_VALUE;
        }
        int m8656a = this.f11227a.m8656a(i);
        if (m8656a == -1) {
            return false;
        }
        if (m10487a && aVar.f10272b == i && aVar.f10273c == m8656a + (-1)) {
            return true;
        }
        return !m10487a && this.f11227a.m8665c(i) == m8656a;
    }

    /* renamed from: a */
    private boolean m11472a(InterfaceC2515y.a aVar, boolean z) {
        int mo8637a = this.f11230d.mo8637a(aVar.f10271a);
        return !this.f11230d.m8649a(this.f11230d.m8647a(mo8637a, this.f11227a).f7702c, this.f11228b).f7710e && this.f11230d.m8653b(mo8637a, this.f11227a, this.f11228b, this.f11231e, this.f11232f) && z;
    }

    /* renamed from: a */
    private boolean m11473a(C2680w c2680w, C2681x c2681x) {
        C2681x c2681x2 = c2680w.f11212g;
        return c2681x2.f11222b == c2681x.f11222b && c2681x2.f11221a.equals(c2681x.f11221a);
    }

    /* renamed from: b */
    private InterfaceC2515y.a m11474b(Object obj, long j, long j2) {
        this.f11230d.m8648a(obj, this.f11227a);
        int m8662b = this.f11227a.m8662b(j);
        if (m8662b != -1) {
            return new InterfaceC2515y.a(obj, m8662b, this.f11227a.m8665c(m8662b), j2);
        }
        int m8657a = this.f11227a.m8657a(j);
        return new InterfaceC2515y.a(obj, j2, m8657a == -1 ? Long.MIN_VALUE : this.f11227a.m8664b(m8657a));
    }

    /* renamed from: i */
    private boolean m11475i() {
        C2680w c2680w;
        C2680w m11490c = m11490c();
        if (m11490c == null) {
            return true;
        }
        int mo8637a = this.f11230d.mo8637a(m11490c.f11207b);
        while (true) {
            mo8637a = this.f11230d.m8643a(mo8637a, this.f11227a, this.f11228b, this.f11231e, this.f11232f);
            while (true) {
                C2680w c2680w2 = m11490c.f11213h;
                if (c2680w2 == null || m11490c.f11212g.f11225e) {
                    break;
                }
                m11490c = c2680w2;
            }
            if (mo8637a == -1 || (c2680w = m11490c.f11213h) == null || this.f11230d.mo8637a(c2680w.f11207b) != mo8637a) {
                break;
            }
            m11490c = m11490c.f11213h;
        }
        boolean m11487a = m11487a(m11490c);
        m11490c.f11212g = m11480a(m11490c.f11212g);
        return (m11487a && m11494g()) ? false : true;
    }

    /* renamed from: a */
    public InterfaceC2514x m11476a(InterfaceC2144I[] interfaceC2144IArr, AbstractC2579m abstractC2579m, InterfaceC2590d interfaceC2590d, InterfaceC2515y interfaceC2515y, C2681x c2681x) {
        C2680w c2680w = this.f11235i;
        C2680w c2680w2 = new C2680w(interfaceC2144IArr, c2680w == null ? c2681x.f11222b : c2680w.m11458c() + this.f11235i.f11212g.f11224d, abstractC2579m, interfaceC2590d, interfaceC2515y, c2681x);
        if (this.f11235i != null) {
            C2628e.m11113b(m11494g());
            this.f11235i.f11213h = c2680w2;
        }
        this.f11237k = null;
        this.f11235i = c2680w2;
        this.f11236j++;
        return c2680w2.f11206a;
    }

    /* renamed from: a */
    public InterfaceC2515y.a m11477a(Object obj, long j) {
        return m11474b(obj, j, m11465a(obj));
    }

    /* renamed from: a */
    public C2680w m11478a() {
        C2680w c2680w = this.f11233g;
        if (c2680w != null) {
            if (c2680w == this.f11234h) {
                this.f11234h = c2680w.f11213h;
            }
            this.f11233g.m11463f();
            this.f11236j--;
            if (this.f11236j == 0) {
                this.f11235i = null;
                C2680w c2680w2 = this.f11233g;
                this.f11237k = c2680w2.f11207b;
                this.f11238l = c2680w2.f11212g.f11221a.f10274d;
            }
            this.f11233g = this.f11233g.f11213h;
        } else {
            C2680w c2680w3 = this.f11235i;
            this.f11233g = c2680w3;
            this.f11234h = c2680w3;
        }
        return this.f11233g;
    }

    /* renamed from: a */
    public C2681x m11479a(long j, C2136A c2136a) {
        C2680w c2680w = this.f11235i;
        return c2680w == null ? m11466a(c2136a) : m11468a(c2680w, j);
    }

    /* renamed from: a */
    public C2681x m11480a(C2681x c2681x) {
        long j;
        boolean m11471a = m11471a(c2681x.f11221a);
        boolean m11472a = m11472a(c2681x.f11221a, m11471a);
        this.f11230d.m8648a(c2681x.f11221a.f10271a, this.f11227a);
        if (c2681x.f11221a.m10487a()) {
            AbstractC2151P.a aVar = this.f11227a;
            InterfaceC2515y.a aVar2 = c2681x.f11221a;
            j = aVar.m8658a(aVar2.f10272b, aVar2.f10273c);
        } else {
            j = c2681x.f11221a.f10275e;
            if (j == Long.MIN_VALUE) {
                j = this.f11227a.m8666c();
            }
        }
        return new C2681x(c2681x.f11221a, c2681x.f11222b, c2681x.f11223c, j, m11471a, m11472a);
    }

    /* renamed from: a */
    public void m11481a(long j) {
        C2680w c2680w = this.f11235i;
        if (c2680w != null) {
            c2680w.m11456b(j);
        }
    }

    /* renamed from: a */
    public void m11482a(AbstractC2151P abstractC2151P) {
        this.f11230d = abstractC2151P;
    }

    /* renamed from: a */
    public void m11483a(boolean z) {
        C2680w m11490c = m11490c();
        if (m11490c != null) {
            this.f11237k = z ? m11490c.f11207b : null;
            this.f11238l = m11490c.f11212g.f11221a.f10274d;
            m11490c.m11463f();
            m11487a(m11490c);
        } else if (!z) {
            this.f11237k = null;
        }
        this.f11233g = null;
        this.f11235i = null;
        this.f11234h = null;
        this.f11236j = 0;
    }

    /* renamed from: a */
    public boolean m11484a(int i) {
        this.f11231e = i;
        return m11475i();
    }

    /* renamed from: a */
    public boolean m11485a(InterfaceC2514x interfaceC2514x) {
        C2680w c2680w = this.f11235i;
        return c2680w != null && c2680w.f11206a == interfaceC2514x;
    }

    /* renamed from: a */
    public boolean m11486a(InterfaceC2515y.a aVar, long j) {
        int mo8637a = this.f11230d.mo8637a(aVar.f10271a);
        C2680w c2680w = null;
        C2680w m11490c = m11490c();
        while (m11490c != null) {
            if (c2680w == null) {
                m11490c.f11212g = m11480a(m11490c.f11212g);
            } else {
                if (mo8637a == -1 || !m11490c.f11207b.equals(this.f11230d.mo8640a(mo8637a))) {
                    return !m11487a(c2680w);
                }
                C2681x m11468a = m11468a(c2680w, j);
                if (m11468a == null) {
                    return !m11487a(c2680w);
                }
                m11490c.f11212g = m11480a(m11490c.f11212g);
                if (!m11473a(m11490c, m11468a)) {
                    return !m11487a(c2680w);
                }
            }
            if (m11490c.f11212g.f11225e) {
                mo8637a = this.f11230d.m8643a(mo8637a, this.f11227a, this.f11228b, this.f11231e, this.f11232f);
            }
            C2680w c2680w2 = m11490c;
            m11490c = m11490c.f11213h;
            c2680w = c2680w2;
        }
        return true;
    }

    /* renamed from: a */
    public boolean m11487a(C2680w c2680w) {
        boolean z = false;
        C2628e.m11113b(c2680w != null);
        this.f11235i = c2680w;
        while (true) {
            c2680w = c2680w.f11213h;
            if (c2680w == null) {
                this.f11235i.f11213h = null;
                return z;
            }
            if (c2680w == this.f11234h) {
                this.f11234h = this.f11233g;
                z = true;
            }
            c2680w.m11463f();
            this.f11236j--;
        }
    }

    /* renamed from: b */
    public C2680w m11488b() {
        C2680w c2680w = this.f11234h;
        C2628e.m11113b((c2680w == null || c2680w.f11213h == null) ? false : true);
        this.f11234h = this.f11234h.f11213h;
        return this.f11234h;
    }

    /* renamed from: b */
    public boolean m11489b(boolean z) {
        this.f11232f = z;
        return m11475i();
    }

    /* renamed from: c */
    public C2680w m11490c() {
        return m11494g() ? this.f11233g : this.f11235i;
    }

    /* renamed from: d */
    public C2680w m11491d() {
        return this.f11235i;
    }

    /* renamed from: e */
    public C2680w m11492e() {
        return this.f11233g;
    }

    /* renamed from: f */
    public C2680w m11493f() {
        return this.f11234h;
    }

    /* renamed from: g */
    public boolean m11494g() {
        return this.f11233g != null;
    }

    /* renamed from: h */
    public boolean m11495h() {
        C2680w c2680w = this.f11235i;
        return c2680w == null || (!c2680w.f11212g.f11226f && c2680w.m11462e() && this.f11235i.f11212g.f11224d != -9223372036854775807L && this.f11236j < 100);
    }
}
