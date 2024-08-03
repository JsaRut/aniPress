package p139d.p225c.p226a.p227a.p234f.p242h;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p139d.p225c.p226a.p227a.C2676s;
import p139d.p225c.p226a.p227a.p234f.p242h.InterfaceC2296G;
import p139d.p225c.p226a.p227a.p259k.p260a.C2522d;
import p139d.p225c.p226a.p227a.p270n.C2644u;

/* renamed from: d.c.a.a.f.h.i */
/* loaded from: classes.dex */
public final class C2307i implements InterfaceC2296G.c {

    /* renamed from: a */
    private final int f8928a;

    /* renamed from: b */
    private final List<C2676s> f8929b;

    public C2307i(int i) {
        this(i, Collections.singletonList(C2676s.m11419a(null, "application/cea-608", 0, null)));
    }

    public C2307i(int i, List<C2676s> list) {
        this.f8928a = i;
        this.f8929b = list;
    }

    /* renamed from: a */
    private C2291B m9588a(InterfaceC2296G.b bVar) {
        return new C2291B(m9591c(bVar));
    }

    /* renamed from: a */
    private boolean m9589a(int i) {
        return (i & this.f8928a) != 0;
    }

    /* renamed from: b */
    private C2298I m9590b(InterfaceC2296G.b bVar) {
        return new C2298I(m9591c(bVar));
    }

    /* renamed from: c */
    private List<C2676s> m9591c(InterfaceC2296G.b bVar) {
        String str;
        int i;
        if (m9589a(32)) {
            return this.f8929b;
        }
        C2644u c2644u = new C2644u(bVar.f8861d);
        List<C2676s> list = this.f8929b;
        while (c2644u.m11208a() > 0) {
            int m11238t = c2644u.m11238t();
            int m11217c = c2644u.m11217c() + c2644u.m11238t();
            if (m11238t == 134) {
                list = new ArrayList<>();
                int m11238t2 = c2644u.m11238t() & 31;
                for (int i2 = 0; i2 < m11238t2; i2++) {
                    String m11216b = c2644u.m11216b(3);
                    int m11238t3 = c2644u.m11238t();
                    boolean z = (m11238t3 & 128) != 0;
                    if (z) {
                        i = m11238t3 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte m11238t4 = (byte) c2644u.m11238t();
                    c2644u.m11224f(1);
                    list.add(C2676s.m11427a(null, str, null, -1, 0, m11216b, i, null, Long.MAX_VALUE, z ? C2522d.m10598a((m11238t4 & 64) != 0) : null));
                }
            }
            c2644u.m11222e(m11217c);
        }
        return list;
    }

    @Override // p139d.p225c.p226a.p227a.p234f.p242h.InterfaceC2296G.c
    /* renamed from: a */
    public SparseArray<InterfaceC2296G> mo9545a() {
        return new SparseArray<>();
    }

    @Override // p139d.p225c.p226a.p227a.p234f.p242h.InterfaceC2296G.c
    /* renamed from: a */
    public InterfaceC2296G mo9546a(int i, InterfaceC2296G.b bVar) {
        if (i == 2) {
            return new C2319u(new C2311m(m9590b(bVar)));
        }
        if (i == 3 || i == 4) {
            return new C2319u(new C2317s(bVar.f8859b));
        }
        if (i == 15) {
            if (m9589a(2)) {
                return null;
            }
            return new C2319u(new C2306h(false, bVar.f8859b));
        }
        if (i == 17) {
            if (m9589a(2)) {
                return null;
            }
            return new C2319u(new C2316r(bVar.f8859b));
        }
        if (i == 21) {
            return new C2319u(new C2315q());
        }
        if (i == 27) {
            if (m9589a(4)) {
                return null;
            }
            return new C2319u(new C2313o(m9588a(bVar), m9589a(1), m9589a(8)));
        }
        if (i == 36) {
            return new C2319u(new C2314p(m9588a(bVar)));
        }
        if (i == 89) {
            return new C2319u(new C2309k(bVar.f8860c));
        }
        if (i != 138) {
            if (i != 129) {
                if (i != 130) {
                    if (i == 134) {
                        if (m9589a(16)) {
                            return null;
                        }
                        return new C2290A(new C2292C());
                    }
                    if (i != 135) {
                        return null;
                    }
                }
            }
            return new C2319u(new C2304f(bVar.f8859b));
        }
        return new C2319u(new C2308j(bVar.f8859b));
    }
}
