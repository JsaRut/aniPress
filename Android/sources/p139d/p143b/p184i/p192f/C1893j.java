package p139d.p143b.p184i.p192f;

import android.net.Uri;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLong;
import p139d.p143b.p145b.p146a.InterfaceC1648d;
import p139d.p143b.p148c.p152d.InterfaceC1692k;
import p139d.p143b.p148c.p152d.InterfaceC1694m;
import p139d.p143b.p148c.p155g.InterfaceC1710g;
import p139d.p143b.p148c.p156h.C1716b;
import p139d.p143b.p148c.p159k.C1728f;
import p139d.p143b.p161d.C1738g;
import p139d.p143b.p161d.InterfaceC1736e;
import p139d.p143b.p184i.p190d.C1862l;
import p139d.p143b.p184i.p190d.InterfaceC1844A;
import p139d.p143b.p184i.p190d.InterfaceC1863m;
import p139d.p143b.p184i.p191e.EnumC1880d;
import p139d.p143b.p184i.p193g.C1905c;
import p139d.p143b.p184i.p193g.C1906d;
import p139d.p143b.p184i.p196j.AbstractC1918b;
import p139d.p143b.p184i.p197k.C1925b;
import p139d.p143b.p184i.p197k.InterfaceC1926c;
import p139d.p143b.p184i.p200n.C1938Ca;
import p139d.p143b.p184i.p200n.C2012va;
import p139d.p143b.p184i.p200n.InterfaceC1996na;
import p139d.p143b.p184i.p201o.C2023c;
import p139d.p143b.p184i.p201o.C2024d;

/* renamed from: d.b.i.f.j */
/* loaded from: classes.dex */
public class C1893j {

    /* renamed from: a */
    private static final CancellationException f6883a = new CancellationException("Prefetching is not enabled");

    /* renamed from: b */
    private final C1902s f6884b;

    /* renamed from: c */
    private final InterfaceC1926c f6885c;

    /* renamed from: d */
    private final InterfaceC1694m<Boolean> f6886d;

    /* renamed from: e */
    private final InterfaceC1844A<InterfaceC1648d, AbstractC1918b> f6887e;

    /* renamed from: f */
    private final InterfaceC1844A<InterfaceC1648d, InterfaceC1710g> f6888f;

    /* renamed from: g */
    private final C1862l f6889g;

    /* renamed from: h */
    private final C1862l f6890h;

    /* renamed from: i */
    private final InterfaceC1863m f6891i;

    /* renamed from: j */
    private final C1938Ca f6892j;

    /* renamed from: k */
    private final InterfaceC1694m<Boolean> f6893k;

    /* renamed from: l */
    private AtomicLong f6894l = new AtomicLong();

    /* renamed from: m */
    private final InterfaceC1694m<Boolean> f6895m;

    public C1893j(C1902s c1902s, Set<InterfaceC1926c> set, InterfaceC1694m<Boolean> interfaceC1694m, InterfaceC1844A<InterfaceC1648d, AbstractC1918b> interfaceC1844A, InterfaceC1844A<InterfaceC1648d, InterfaceC1710g> interfaceC1844A2, C1862l c1862l, C1862l c1862l2, InterfaceC1863m interfaceC1863m, C1938Ca c1938Ca, InterfaceC1694m<Boolean> interfaceC1694m2, InterfaceC1694m<Boolean> interfaceC1694m3) {
        this.f6884b = c1902s;
        this.f6885c = new C1925b(set);
        this.f6886d = interfaceC1694m;
        this.f6887e = interfaceC1844A;
        this.f6888f = interfaceC1844A2;
        this.f6889g = c1862l;
        this.f6890h = c1862l2;
        this.f6891i = interfaceC1863m;
        this.f6892j = c1938Ca;
        this.f6893k = interfaceC1694m2;
        this.f6895m = interfaceC1694m3;
    }

    /* renamed from: a */
    private InterfaceC1736e<Void> m7678a(InterfaceC1996na<Void> interfaceC1996na, C2023c c2023c, C2023c.b bVar, Object obj, EnumC1880d enumC1880d) {
        InterfaceC1926c m7680a = m7680a(c2023c, (InterfaceC1926c) null);
        try {
            return C1906d.m7872a(interfaceC1996na, new C2012va(c2023c, m7682f(), m7680a, obj, C2023c.b.m8253a(c2023c.m8239e(), bVar), true, false, enumC1880d), m7680a);
        } catch (Exception e2) {
            return C1738g.m7128b(e2);
        }
    }

    /* renamed from: a */
    private <T> InterfaceC1736e<C1716b<T>> m7679a(InterfaceC1996na<C1716b<T>> interfaceC1996na, C2023c c2023c, C2023c.b bVar, Object obj, InterfaceC1926c interfaceC1926c) {
        boolean z;
        InterfaceC1926c m7680a = m7680a(c2023c, interfaceC1926c);
        try {
            C2023c.b m8253a = C2023c.b.m8253a(c2023c.m8239e(), bVar);
            String m7682f = m7682f();
            if (!c2023c.m8244j() && C1728f.m7089i(c2023c.m8249o())) {
                z = false;
                return C1905c.m7869a(interfaceC1996na, new C2012va(c2023c, m7682f, m7680a, obj, m8253a, false, z, c2023c.m8243i()), m7680a);
            }
            z = true;
            return C1905c.m7869a(interfaceC1996na, new C2012va(c2023c, m7682f, m7680a, obj, m8253a, false, z, c2023c.m8243i()), m7680a);
        } catch (Exception e2) {
            return C1738g.m7128b(e2);
        }
    }

    /* renamed from: a */
    private InterfaceC1926c m7680a(C2023c c2023c, InterfaceC1926c interfaceC1926c) {
        return interfaceC1926c == null ? c2023c.m8245k() == null ? this.f6885c : new C1925b(this.f6885c, c2023c.m8245k()) : c2023c.m8245k() == null ? new C1925b(this.f6885c, interfaceC1926c) : new C1925b(this.f6885c, interfaceC1926c, c2023c.m8245k());
    }

    /* renamed from: c */
    private InterfaceC1692k<InterfaceC1648d> m7681c(Uri uri) {
        return new C1891h(this, uri);
    }

    /* renamed from: f */
    private String m7682f() {
        return String.valueOf(this.f6894l.getAndIncrement());
    }

    /* renamed from: a */
    public InterfaceC1736e<C1716b<AbstractC1918b>> m7683a(C2023c c2023c, Object obj) {
        return m7685a(c2023c, obj, C2023c.b.FULL_FETCH);
    }

    /* renamed from: a */
    public InterfaceC1736e<Void> m7684a(C2023c c2023c, Object obj, EnumC1880d enumC1880d) {
        if (!this.f6886d.get().booleanValue()) {
            return C1738g.m7128b(f6883a);
        }
        try {
            return m7678a(this.f6884b.m7857b(c2023c), c2023c, C2023c.b.FULL_FETCH, obj, enumC1880d);
        } catch (Exception e2) {
            return C1738g.m7128b(e2);
        }
    }

    /* renamed from: a */
    public InterfaceC1736e<C1716b<AbstractC1918b>> m7685a(C2023c c2023c, Object obj, C2023c.b bVar) {
        return m7686a(c2023c, obj, bVar, null);
    }

    /* renamed from: a */
    public InterfaceC1736e<C1716b<AbstractC1918b>> m7686a(C2023c c2023c, Object obj, C2023c.b bVar, InterfaceC1926c interfaceC1926c) {
        try {
            return m7679a(this.f6884b.m7856a(c2023c), c2023c, bVar, obj, interfaceC1926c);
        } catch (Exception e2) {
            return C1738g.m7128b(e2);
        }
    }

    /* renamed from: a */
    public void m7687a() {
        m7694c();
        m7692b();
    }

    /* renamed from: a */
    public boolean m7688a(Uri uri) {
        if (uri == null) {
            return false;
        }
        return this.f6887e.mo7553b(m7681c(uri));
    }

    /* renamed from: a */
    public boolean m7689a(Uri uri, C2023c.a aVar) {
        C2024d m8255a = C2024d.m8255a(uri);
        m8255a.m8264a(aVar);
        return m7690a(m8255a.m8257a());
    }

    /* renamed from: a */
    public boolean m7690a(C2023c c2023c) {
        C1862l c1862l;
        InterfaceC1648d mo7603c = this.f6891i.mo7603c(c2023c, null);
        int i = C1892i.f6882a[c2023c.m8236b().ordinal()];
        if (i == 1) {
            c1862l = this.f6889g;
        } else {
            if (i != 2) {
                return false;
            }
            c1862l = this.f6890h;
        }
        return c1862l.m7598b(mo7603c);
    }

    /* renamed from: b */
    public InterfaceC1736e<Void> m7691b(C2023c c2023c, Object obj) {
        return m7684a(c2023c, obj, EnumC1880d.MEDIUM);
    }

    /* renamed from: b */
    public void m7692b() {
        this.f6889g.m7597b();
        this.f6890h.m7597b();
    }

    /* renamed from: b */
    public boolean m7693b(Uri uri) {
        return m7689a(uri, C2023c.a.SMALL) || m7689a(uri, C2023c.a.DEFAULT);
    }

    /* renamed from: c */
    public void m7694c() {
        C1890g c1890g = new C1890g(this);
        this.f6887e.mo7551a(c1890g);
        this.f6888f.mo7551a(c1890g);
    }

    /* renamed from: d */
    public InterfaceC1844A<InterfaceC1648d, AbstractC1918b> m7695d() {
        return this.f6887e;
    }

    /* renamed from: e */
    public InterfaceC1863m m7696e() {
        return this.f6891i;
    }
}
