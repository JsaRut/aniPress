package p139d.p143b.p184i.p192f;

import android.content.ContentResolver;
import android.net.Uri;
import java.util.HashMap;
import java.util.Map;
import p139d.p143b.p148c.p152d.C1691j;
import p139d.p143b.p148c.p154f.C1703a;
import p139d.p143b.p148c.p156h.C1716b;
import p139d.p143b.p148c.p160l.C1731c;
import p139d.p143b.p184i.p196j.AbstractC1918b;
import p139d.p143b.p184i.p196j.C1920d;
import p139d.p143b.p184i.p200n.C1938Ca;
import p139d.p143b.p184i.p200n.C1944Fa;
import p139d.p143b.p184i.p200n.InterfaceC1948Ha;
import p139d.p143b.p184i.p200n.InterfaceC1976da;
import p139d.p143b.p184i.p200n.InterfaceC1996na;
import p139d.p143b.p184i.p201o.C2023c;

/* renamed from: d.b.i.f.s */
/* loaded from: classes.dex */
public class C1902s {

    /* renamed from: a */
    private final ContentResolver f7019a;

    /* renamed from: b */
    private final C1901r f7020b;

    /* renamed from: c */
    private final InterfaceC1976da f7021c;

    /* renamed from: d */
    private final boolean f7022d;

    /* renamed from: e */
    private final boolean f7023e;

    /* renamed from: f */
    private final boolean f7024f;

    /* renamed from: g */
    private final C1938Ca f7025g;

    /* renamed from: h */
    private final boolean f7026h;

    /* renamed from: i */
    private final boolean f7027i;

    /* renamed from: j */
    private final boolean f7028j;

    /* renamed from: k */
    InterfaceC1996na<C1716b<AbstractC1918b>> f7029k;

    /* renamed from: l */
    InterfaceC1996na<C1920d> f7030l;

    /* renamed from: m */
    InterfaceC1996na<C1920d> f7031m;

    /* renamed from: n */
    InterfaceC1996na<Void> f7032n;

    /* renamed from: o */
    InterfaceC1996na<Void> f7033o;

    /* renamed from: p */
    private InterfaceC1996na<C1920d> f7034p;

    /* renamed from: q */
    InterfaceC1996na<C1716b<AbstractC1918b>> f7035q;

    /* renamed from: r */
    InterfaceC1996na<C1716b<AbstractC1918b>> f7036r;

    /* renamed from: s */
    InterfaceC1996na<C1716b<AbstractC1918b>> f7037s;

    /* renamed from: t */
    InterfaceC1996na<C1716b<AbstractC1918b>> f7038t;

    /* renamed from: u */
    InterfaceC1996na<C1716b<AbstractC1918b>> f7039u;

    /* renamed from: v */
    InterfaceC1996na<C1716b<AbstractC1918b>> f7040v;

    /* renamed from: w */
    InterfaceC1996na<C1716b<AbstractC1918b>> f7041w;

    /* renamed from: x */
    Map<InterfaceC1996na<C1716b<AbstractC1918b>>, InterfaceC1996na<C1716b<AbstractC1918b>>> f7042x = new HashMap();

    /* renamed from: y */
    Map<InterfaceC1996na<C1716b<AbstractC1918b>>, InterfaceC1996na<Void>> f7043y = new HashMap();

    /* renamed from: z */
    Map<InterfaceC1996na<C1716b<AbstractC1918b>>, InterfaceC1996na<C1716b<AbstractC1918b>>> f7044z = new HashMap();

    public C1902s(ContentResolver contentResolver, C1901r c1901r, InterfaceC1976da interfaceC1976da, boolean z, boolean z2, C1938Ca c1938Ca, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.f7019a = contentResolver;
        this.f7020b = c1901r;
        this.f7021c = interfaceC1976da;
        this.f7022d = z;
        this.f7023e = z2;
        this.f7025g = c1938Ca;
        this.f7026h = z3;
        this.f7027i = z4;
        this.f7024f = z5;
        this.f7028j = z6;
    }

    /* renamed from: a */
    private synchronized InterfaceC1996na<C1920d> m7830a() {
        if (this.f7030l == null) {
            this.f7030l = this.f7020b.m7803a(m7849g(this.f7020b.m7816f()), this.f7025g);
        }
        return this.f7030l;
    }

    /* renamed from: a */
    private synchronized InterfaceC1996na<C1716b<AbstractC1918b>> m7831a(InterfaceC1996na<C1716b<AbstractC1918b>> interfaceC1996na) {
        InterfaceC1996na<C1716b<AbstractC1918b>> interfaceC1996na2;
        interfaceC1996na2 = this.f7044z.get(interfaceC1996na);
        if (interfaceC1996na2 == null) {
            interfaceC1996na2 = this.f7020b.m7815e(interfaceC1996na);
            this.f7044z.put(interfaceC1996na, interfaceC1996na2);
        }
        return interfaceC1996na2;
    }

    /* renamed from: a */
    private InterfaceC1996na<C1716b<AbstractC1918b>> m7832a(InterfaceC1996na<C1920d> interfaceC1996na, InterfaceC1948Ha<C1920d>[] interfaceC1948HaArr) {
        return m7842d(m7837b(m7849g(interfaceC1996na), interfaceC1948HaArr));
    }

    /* renamed from: a */
    private InterfaceC1996na<C1920d> m7833a(InterfaceC1948Ha<C1920d>[] interfaceC1948HaArr) {
        return this.f7020b.m7807a(this.f7020b.m7804a(interfaceC1948HaArr), true, this.f7026h);
    }

    /* renamed from: a */
    private static String m7834a(Uri uri) {
        String valueOf = String.valueOf(uri);
        if (valueOf.length() <= 30) {
            return valueOf;
        }
        return valueOf.substring(0, 30) + "...";
    }

    /* renamed from: b */
    private synchronized InterfaceC1996na<C1920d> m7835b() {
        if (this.f7031m == null) {
            this.f7031m = this.f7020b.m7803a(m7838c(), this.f7025g);
        }
        return this.f7031m;
    }

    /* renamed from: b */
    private synchronized InterfaceC1996na<C1716b<AbstractC1918b>> m7836b(InterfaceC1996na<C1716b<AbstractC1918b>> interfaceC1996na) {
        if (!this.f7042x.containsKey(interfaceC1996na)) {
            this.f7042x.put(interfaceC1996na, this.f7020b.m7826l(this.f7020b.m7827m(interfaceC1996na)));
        }
        return this.f7042x.get(interfaceC1996na);
    }

    /* renamed from: b */
    private InterfaceC1996na<C1920d> m7837b(InterfaceC1996na<C1920d> interfaceC1996na, InterfaceC1948Ha<C1920d>[] interfaceC1948HaArr) {
        C1944Fa m7828o = this.f7020b.m7828o(this.f7020b.m7807a(C1901r.m7800a(interfaceC1996na), true, this.f7026h));
        C1901r c1901r = this.f7020b;
        return C1901r.m7801a(m7833a(interfaceC1948HaArr), m7828o);
    }

    /* renamed from: c */
    private synchronized InterfaceC1996na<C1920d> m7838c() {
        if (this.f7034p == null) {
            this.f7034p = C1901r.m7800a(m7849g(this.f7020b.m7805a(this.f7021c)));
            this.f7034p = this.f7020b.m7807a(this.f7034p, this.f7022d, this.f7026h);
        }
        return this.f7034p;
    }

    /* renamed from: c */
    private InterfaceC1996na<C1716b<AbstractC1918b>> m7839c(InterfaceC1996na<C1716b<AbstractC1918b>> interfaceC1996na) {
        return this.f7020b.m7809b(this.f7020b.m7803a(this.f7020b.m7811c(this.f7020b.m7813d(interfaceC1996na)), this.f7025g));
    }

    /* renamed from: c */
    private InterfaceC1996na<C1716b<AbstractC1918b>> m7840c(C2023c c2023c) {
        C1691j.m6971a(c2023c);
        Uri m8249o = c2023c.m8249o();
        C1691j.m6972a(m8249o, "Uri is null.");
        int m8250p = c2023c.m8250p();
        if (m8250p == 0) {
            return m7853k();
        }
        switch (m8250p) {
            case 2:
                return m7852j();
            case 3:
                return m7850h();
            case 4:
                return C1703a.m7035b(this.f7019a.getType(m8249o)) ? m7852j() : m7846f();
            case 5:
                return m7844e();
            case 6:
                return m7851i();
            case 7:
                return m7841d();
            case 8:
                return m7855m();
            default:
                throw new IllegalArgumentException("Unsupported uri scheme! Uri is: " + m7834a(m8249o));
        }
    }

    /* renamed from: d */
    private synchronized InterfaceC1996na<C1716b<AbstractC1918b>> m7841d() {
        if (this.f7040v == null) {
            InterfaceC1996na<C1920d> m7806a = this.f7020b.m7806a();
            if (C1731c.f6272a && (!this.f7023e || C1731c.f6275d == null)) {
                m7806a = this.f7020b.m7829p(m7806a);
            }
            C1901r c1901r = this.f7020b;
            this.f7040v = m7842d(this.f7020b.m7807a(C1901r.m7800a(m7806a), true, this.f7026h));
        }
        return this.f7040v;
    }

    /* renamed from: d */
    private InterfaceC1996na<C1716b<AbstractC1918b>> m7842d(InterfaceC1996na<C1920d> interfaceC1996na) {
        return m7839c(this.f7020b.m7817f(interfaceC1996na));
    }

    /* renamed from: d */
    private static void m7843d(C2023c c2023c) {
        C1691j.m6971a(c2023c);
        C1691j.m6974a(c2023c.m8239e().m8254b() <= C2023c.b.ENCODED_MEMORY_CACHE.m8254b());
    }

    /* renamed from: e */
    private synchronized InterfaceC1996na<C1716b<AbstractC1918b>> m7844e() {
        if (this.f7039u == null) {
            this.f7039u = m7845e(this.f7020b.m7808b());
        }
        return this.f7039u;
    }

    /* renamed from: e */
    private InterfaceC1996na<C1716b<AbstractC1918b>> m7845e(InterfaceC1996na<C1920d> interfaceC1996na) {
        return m7832a(interfaceC1996na, new InterfaceC1948Ha[]{this.f7020b.m7814e()});
    }

    /* renamed from: f */
    private synchronized InterfaceC1996na<C1716b<AbstractC1918b>> m7846f() {
        if (this.f7037s == null) {
            this.f7037s = m7832a(this.f7020b.m7810c(), new InterfaceC1948Ha[]{this.f7020b.m7812d(), this.f7020b.m7814e()});
        }
        return this.f7037s;
    }

    /* renamed from: f */
    private InterfaceC1996na<C1920d> m7847f(InterfaceC1996na<C1920d> interfaceC1996na) {
        if (this.f7024f) {
            interfaceC1996na = this.f7020b.m7825k(interfaceC1996na);
        }
        return this.f7020b.m7819g(this.f7020b.m7821h(interfaceC1996na));
    }

    /* renamed from: g */
    private synchronized InterfaceC1996na<Void> m7848g() {
        if (this.f7032n == null) {
            this.f7032n = C1901r.m7802n(m7830a());
        }
        return this.f7032n;
    }

    /* renamed from: g */
    private InterfaceC1996na<C1920d> m7849g(InterfaceC1996na<C1920d> interfaceC1996na) {
        if (C1731c.f6272a && (!this.f7023e || C1731c.f6275d == null)) {
            interfaceC1996na = this.f7020b.m7829p(interfaceC1996na);
        }
        if (this.f7028j) {
            interfaceC1996na = m7847f(interfaceC1996na);
        }
        return this.f7020b.m7823i(this.f7020b.m7824j(interfaceC1996na));
    }

    /* renamed from: h */
    private synchronized InterfaceC1996na<C1716b<AbstractC1918b>> m7850h() {
        if (this.f7035q == null) {
            this.f7035q = m7845e(this.f7020b.m7816f());
        }
        return this.f7035q;
    }

    /* renamed from: i */
    private synchronized InterfaceC1996na<C1716b<AbstractC1918b>> m7851i() {
        if (this.f7038t == null) {
            this.f7038t = m7845e(this.f7020b.m7818g());
        }
        return this.f7038t;
    }

    /* renamed from: j */
    private synchronized InterfaceC1996na<C1716b<AbstractC1918b>> m7852j() {
        if (this.f7036r == null) {
            this.f7036r = m7839c(this.f7020b.m7820h());
        }
        return this.f7036r;
    }

    /* renamed from: k */
    private synchronized InterfaceC1996na<C1716b<AbstractC1918b>> m7853k() {
        if (this.f7029k == null) {
            this.f7029k = m7842d(m7838c());
        }
        return this.f7029k;
    }

    /* renamed from: l */
    private synchronized InterfaceC1996na<Void> m7854l() {
        if (this.f7033o == null) {
            this.f7033o = C1901r.m7802n(m7835b());
        }
        return this.f7033o;
    }

    /* renamed from: m */
    private synchronized InterfaceC1996na<C1716b<AbstractC1918b>> m7855m() {
        if (this.f7041w == null) {
            this.f7041w = m7845e(this.f7020b.m7822i());
        }
        return this.f7041w;
    }

    /* renamed from: a */
    public InterfaceC1996na<C1716b<AbstractC1918b>> m7856a(C2023c c2023c) {
        InterfaceC1996na<C1716b<AbstractC1918b>> m7840c = m7840c(c2023c);
        if (c2023c.m8240f() != null) {
            m7840c = m7836b(m7840c);
        }
        return this.f7027i ? m7831a(m7840c) : m7840c;
    }

    /* renamed from: b */
    public InterfaceC1996na<Void> m7857b(C2023c c2023c) {
        m7843d(c2023c);
        int m8250p = c2023c.m8250p();
        if (m8250p == 0) {
            return m7854l();
        }
        if (m8250p == 2 || m8250p == 3) {
            return m7848g();
        }
        throw new IllegalArgumentException("Unsupported uri scheme for encoded image fetch! Uri is: " + m7834a(c2023c.m8249o()));
    }
}
