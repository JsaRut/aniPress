package p139d.p225c.p226a.p227a;

import p139d.p225c.p226a.p227a.p250j.C2413N;
import p139d.p225c.p226a.p227a.p250j.C2505o;
import p139d.p225c.p226a.p227a.p250j.C2511u;
import p139d.p225c.p226a.p227a.p250j.InterfaceC2404E;
import p139d.p225c.p226a.p227a.p250j.InterfaceC2514x;
import p139d.p225c.p226a.p227a.p250j.InterfaceC2515y;
import p139d.p225c.p226a.p227a.p268l.AbstractC2579m;
import p139d.p225c.p226a.p227a.p268l.C2578l;
import p139d.p225c.p226a.p227a.p268l.C2580n;
import p139d.p225c.p226a.p227a.p268l.InterfaceC2577k;
import p139d.p225c.p226a.p227a.p269m.InterfaceC2590d;
import p139d.p225c.p226a.p227a.p270n.C2628e;
import p139d.p225c.p226a.p227a.p270n.C2638o;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: d.c.a.a.w */
/* loaded from: classes.dex */
public final class C2680w {

    /* renamed from: a */
    public final InterfaceC2514x f11206a;

    /* renamed from: b */
    public final Object f11207b;

    /* renamed from: c */
    public final InterfaceC2404E[] f11208c;

    /* renamed from: d */
    public final boolean[] f11209d;

    /* renamed from: e */
    public boolean f11210e;

    /* renamed from: f */
    public boolean f11211f;

    /* renamed from: g */
    public C2681x f11212g;

    /* renamed from: h */
    public C2680w f11213h;

    /* renamed from: i */
    public C2413N f11214i;

    /* renamed from: j */
    public C2580n f11215j;

    /* renamed from: k */
    private final InterfaceC2144I[] f11216k;

    /* renamed from: l */
    private final AbstractC2579m f11217l;

    /* renamed from: m */
    private final InterfaceC2515y f11218m;

    /* renamed from: n */
    private long f11219n;

    /* renamed from: o */
    private C2580n f11220o;

    public C2680w(InterfaceC2144I[] interfaceC2144IArr, long j, AbstractC2579m abstractC2579m, InterfaceC2590d interfaceC2590d, InterfaceC2515y interfaceC2515y, C2681x c2681x) {
        this.f11216k = interfaceC2144IArr;
        this.f11219n = j - c2681x.f11222b;
        this.f11217l = abstractC2579m;
        this.f11218m = interfaceC2515y;
        Object obj = c2681x.f11221a.f10271a;
        C2628e.m11110a(obj);
        this.f11207b = obj;
        this.f11212g = c2681x;
        this.f11208c = new InterfaceC2404E[interfaceC2144IArr.length];
        this.f11209d = new boolean[interfaceC2144IArr.length];
        InterfaceC2514x mo9889a = interfaceC2515y.mo9889a(c2681x.f11221a, interfaceC2590d);
        long j2 = c2681x.f11221a.f10275e;
        this.f11206a = j2 != Long.MIN_VALUE ? new C2505o(mo9889a, true, 0L, j2) : mo9889a;
    }

    /* renamed from: a */
    private void m11445a(C2580n c2580n) {
        for (int i = 0; i < c2580n.f10731a; i++) {
            boolean m10893a = c2580n.m10893a(i);
            InterfaceC2577k m10887a = c2580n.f10733c.m10887a(i);
            if (m10893a && m10887a != null) {
                m10887a.mo10823e();
            }
        }
    }

    /* renamed from: a */
    private void m11446a(InterfaceC2404E[] interfaceC2404EArr) {
        int i = 0;
        while (true) {
            InterfaceC2144I[] interfaceC2144IArr = this.f11216k;
            if (i >= interfaceC2144IArr.length) {
                return;
            }
            if (interfaceC2144IArr[i].mo8568f() == 6 && this.f11215j.m10893a(i)) {
                interfaceC2404EArr[i] = new C2511u();
            }
            i++;
        }
    }

    /* renamed from: b */
    private void m11447b(C2580n c2580n) {
        for (int i = 0; i < c2580n.f10731a; i++) {
            boolean m10893a = c2580n.m10893a(i);
            InterfaceC2577k m10887a = c2580n.f10733c.m10887a(i);
            if (m10893a && m10887a != null) {
                m10887a.mo10812c();
            }
        }
    }

    /* renamed from: b */
    private void m11448b(InterfaceC2404E[] interfaceC2404EArr) {
        int i = 0;
        while (true) {
            InterfaceC2144I[] interfaceC2144IArr = this.f11216k;
            if (i >= interfaceC2144IArr.length) {
                return;
            }
            if (interfaceC2144IArr[i].mo8568f() == 6) {
                interfaceC2404EArr[i] = null;
            }
            i++;
        }
    }

    /* renamed from: c */
    private void m11449c(C2580n c2580n) {
        C2580n c2580n2 = this.f11220o;
        if (c2580n2 != null) {
            m11445a(c2580n2);
        }
        this.f11220o = c2580n;
        C2580n c2580n3 = this.f11220o;
        if (c2580n3 != null) {
            m11447b(c2580n3);
        }
    }

    /* renamed from: a */
    public long m11450a() {
        if (!this.f11210e) {
            return this.f11212g.f11222b;
        }
        long mo9887g = this.f11211f ? this.f11206a.mo9887g() : Long.MIN_VALUE;
        return mo9887g == Long.MIN_VALUE ? this.f11212g.f11224d : mo9887g;
    }

    /* renamed from: a */
    public long m11451a(long j, boolean z) {
        return m11452a(j, z, new boolean[this.f11216k.length]);
    }

    /* renamed from: a */
    public long m11452a(long j, boolean z, boolean[] zArr) {
        int i = 0;
        while (true) {
            C2580n c2580n = this.f11215j;
            boolean z2 = true;
            if (i >= c2580n.f10731a) {
                break;
            }
            boolean[] zArr2 = this.f11209d;
            if (z || !c2580n.m10895a(this.f11220o, i)) {
                z2 = false;
            }
            zArr2[i] = z2;
            i++;
        }
        m11448b(this.f11208c);
        m11449c(this.f11215j);
        C2578l c2578l = this.f11215j.f10733c;
        long mo9876a = this.f11206a.mo9876a(c2578l.m10888a(), this.f11209d, this.f11208c, zArr, j);
        m11446a(this.f11208c);
        this.f11211f = false;
        int i2 = 0;
        while (true) {
            InterfaceC2404E[] interfaceC2404EArr = this.f11208c;
            if (i2 >= interfaceC2404EArr.length) {
                return mo9876a;
            }
            if (interfaceC2404EArr[i2] != null) {
                C2628e.m11113b(this.f11215j.m10893a(i2));
                if (this.f11216k[i2].mo8568f() != 6) {
                    this.f11211f = true;
                }
            } else {
                C2628e.m11113b(c2578l.m10887a(i2) == null);
            }
            i2++;
        }
    }

    /* renamed from: a */
    public void m11453a(float f) {
        this.f11210e = true;
        this.f11214i = this.f11206a.mo9886f();
        m11457b(f);
        long m11451a = m11451a(this.f11212g.f11222b, false);
        long j = this.f11219n;
        C2681x c2681x = this.f11212g;
        this.f11219n = j + (c2681x.f11222b - m11451a);
        this.f11212g = c2681x.m11464a(m11451a);
    }

    /* renamed from: a */
    public void m11454a(long j) {
        this.f11206a.mo9882b(m11459c(j));
    }

    /* renamed from: b */
    public long m11455b() {
        if (this.f11210e) {
            return this.f11206a.mo9880b();
        }
        return 0L;
    }

    /* renamed from: b */
    public void m11456b(long j) {
        if (this.f11210e) {
            this.f11206a.mo9883c(m11459c(j));
        }
    }

    /* renamed from: b */
    public boolean m11457b(float f) {
        C2580n mo10876a = this.f11217l.mo10876a(this.f11216k, this.f11214i);
        if (mo10876a.m10894a(this.f11220o)) {
            return false;
        }
        this.f11215j = mo10876a;
        for (InterfaceC2577k interfaceC2577k : this.f11215j.f10733c.m10888a()) {
            if (interfaceC2577k != null) {
                interfaceC2577k.mo10811a(f);
            }
        }
        return true;
    }

    /* renamed from: c */
    public long m11458c() {
        return this.f11219n;
    }

    /* renamed from: c */
    public long m11459c(long j) {
        return j - m11458c();
    }

    /* renamed from: d */
    public long m11460d() {
        return this.f11212g.f11222b + this.f11219n;
    }

    /* renamed from: d */
    public long m11461d(long j) {
        return j + m11458c();
    }

    /* renamed from: e */
    public boolean m11462e() {
        return this.f11210e && (!this.f11211f || this.f11206a.mo9887g() == Long.MIN_VALUE);
    }

    /* renamed from: f */
    public void m11463f() {
        InterfaceC2515y interfaceC2515y;
        InterfaceC2514x interfaceC2514x;
        m11449c((C2580n) null);
        try {
            if (this.f11212g.f11221a.f10275e != Long.MIN_VALUE) {
                interfaceC2515y = this.f11218m;
                interfaceC2514x = ((C2505o) this.f11206a).f10184a;
            } else {
                interfaceC2515y = this.f11218m;
                interfaceC2514x = this.f11206a;
            }
            interfaceC2515y.mo9892a(interfaceC2514x);
        } catch (RuntimeException e2) {
            C2638o.m11156a("MediaPeriodHolder", "Period release failed.", e2);
        }
    }
}
