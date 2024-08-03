package p139d.p143b.p169g.p170a.p171a;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.facebook.common.time.RealtimeSinceBootClock;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import p139d.p143b.p145b.p146a.InterfaceC1648d;
import p139d.p143b.p148c.p152d.C1686e;
import p139d.p143b.p148c.p152d.C1690i;
import p139d.p143b.p148c.p152d.C1691j;
import p139d.p143b.p148c.p152d.InterfaceC1694m;
import p139d.p143b.p148c.p153e.C1700a;
import p139d.p143b.p148c.p156h.C1716b;
import p139d.p143b.p161d.InterfaceC1736e;
import p139d.p143b.p167f.p168a.InterfaceC1749a;
import p139d.p143b.p169g.p170a.p171a.p172a.C1751a;
import p139d.p143b.p169g.p170a.p171a.p172a.C1756c;
import p139d.p143b.p169g.p170a.p171a.p172a.C1760g;
import p139d.p143b.p169g.p170a.p171a.p172a.InterfaceC1755b;
import p139d.p143b.p169g.p170a.p171a.p172a.InterfaceC1759f;
import p139d.p143b.p169g.p174b.C1770b;
import p139d.p143b.p169g.p175c.AbstractC1774b;
import p139d.p143b.p169g.p175c.InterfaceC1779g;
import p139d.p143b.p169g.p176d.C1782a;
import p139d.p143b.p169g.p176d.p177a.C1783a;
import p139d.p143b.p169g.p178e.C1803s;
import p139d.p143b.p169g.p178e.C1804t;
import p139d.p143b.p169g.p181h.InterfaceC1816b;
import p139d.p143b.p184i.p190d.InterfaceC1844A;
import p139d.p143b.p184i.p195i.InterfaceC1916a;
import p139d.p143b.p184i.p196j.AbstractC1918b;
import p139d.p143b.p184i.p196j.InterfaceC1921e;
import p139d.p143b.p184i.p197k.C1925b;
import p139d.p143b.p184i.p197k.InterfaceC1926c;

/* renamed from: d.b.g.a.a.d */
/* loaded from: classes.dex */
public class C1764d extends AbstractC1774b<C1716b<AbstractC1918b>, InterfaceC1921e> {

    /* renamed from: w */
    private static final Class<?> f6387w = C1764d.class;

    /* renamed from: A */
    private final InterfaceC1844A<InterfaceC1648d, AbstractC1918b> f6388A;

    /* renamed from: B */
    private InterfaceC1648d f6389B;

    /* renamed from: C */
    private InterfaceC1694m<InterfaceC1736e<C1716b<AbstractC1918b>>> f6390C;

    /* renamed from: D */
    private boolean f6391D;

    /* renamed from: E */
    private C1686e<InterfaceC1916a> f6392E;

    /* renamed from: F */
    private C1760g f6393F;

    /* renamed from: G */
    private Set<InterfaceC1926c> f6394G;

    /* renamed from: H */
    private InterfaceC1755b f6395H;

    /* renamed from: x */
    private final Resources f6396x;

    /* renamed from: y */
    private final InterfaceC1916a f6397y;

    /* renamed from: z */
    private final C1686e<InterfaceC1916a> f6398z;

    public C1764d(Resources resources, C1770b c1770b, InterfaceC1916a interfaceC1916a, Executor executor, InterfaceC1844A<InterfaceC1648d, AbstractC1918b> interfaceC1844A, C1686e<InterfaceC1916a> c1686e) {
        super(c1770b, executor, null, null);
        this.f6396x = resources;
        this.f6397y = new C1750a(resources, interfaceC1916a);
        this.f6398z = c1686e;
        this.f6388A = interfaceC1844A;
    }

    /* renamed from: a */
    private Drawable m7213a(C1686e<InterfaceC1916a> c1686e, AbstractC1918b abstractC1918b) {
        Drawable mo7166b;
        if (c1686e == null) {
            return null;
        }
        Iterator<InterfaceC1916a> it = c1686e.iterator();
        while (it.hasNext()) {
            InterfaceC1916a next = it.next();
            if (next.mo7165a(abstractC1918b) && (mo7166b = next.mo7166b(abstractC1918b)) != null) {
                return mo7166b;
            }
        }
        return null;
    }

    /* renamed from: a */
    private void m7214a(InterfaceC1694m<InterfaceC1736e<C1716b<AbstractC1918b>>> interfaceC1694m) {
        this.f6390C = interfaceC1694m;
        m7215a((AbstractC1918b) null);
    }

    /* renamed from: a */
    private void m7215a(AbstractC1918b abstractC1918b) {
        C1803s m7393a;
        if (this.f6391D) {
            if (m7288i() == null) {
                C1782a c1782a = new C1782a();
                m7272a((InterfaceC1779g) new C1783a(c1782a));
                m7281b((Drawable) c1782a);
            }
            if (m7288i() instanceof C1782a) {
                C1782a c1782a2 = (C1782a) m7288i();
                c1782a2.m7334a(m7290l());
                InterfaceC1816b mo7283c = mo7283c();
                C1804t.b bVar = null;
                if (mo7283c != null && (m7393a = C1804t.m7393a(mo7283c.mo7408a())) != null) {
                    bVar = m7393a.m7392c();
                }
                c1782a2.m7333a(bVar);
                if (abstractC1918b == null) {
                    c1782a2.m7329a();
                } else {
                    c1782a2.m7331a(abstractC1918b.mo6293n(), abstractC1918b.mo6292m());
                    c1782a2.m7330a(abstractC1918b.mo7892p());
                }
            }
        }
    }

    @Override // p139d.p143b.p169g.p175c.AbstractC1774b
    /* renamed from: a */
    public Drawable mo7216a(C1716b<AbstractC1918b> c1716b) {
        C1691j.m6978b(C1716b.m7046c(c1716b));
        AbstractC1918b m7048n = c1716b.m7048n();
        m7215a(m7048n);
        Drawable m7213a = m7213a(this.f6392E, m7048n);
        if (m7213a != null) {
            return m7213a;
        }
        Drawable m7213a2 = m7213a(this.f6398z, m7048n);
        if (m7213a2 != null) {
            return m7213a2;
        }
        Drawable mo7166b = this.f6397y.mo7166b(m7048n);
        if (mo7166b != null) {
            return mo7166b;
        }
        throw new UnsupportedOperationException("Unrecognized image class: " + m7048n);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p139d.p143b.p169g.p175c.AbstractC1774b
    /* renamed from: a */
    protected void mo7217a(Drawable drawable) {
        if (drawable instanceof InterfaceC1749a) {
            ((InterfaceC1749a) drawable).m7162a();
        }
    }

    /* renamed from: a */
    public void m7218a(C1686e<InterfaceC1916a> c1686e) {
        this.f6392E = c1686e;
    }

    /* renamed from: a */
    public void m7219a(InterfaceC1694m<InterfaceC1736e<C1716b<AbstractC1918b>>> interfaceC1694m, String str, InterfaceC1648d interfaceC1648d, Object obj, C1686e<InterfaceC1916a> c1686e, InterfaceC1755b interfaceC1755b) {
        super.m7276a(str, obj);
        m7214a(interfaceC1694m);
        this.f6389B = interfaceC1648d;
        m7218a(c1686e);
        m7235p();
        m7220a(interfaceC1755b);
    }

    /* renamed from: a */
    public synchronized void m7220a(InterfaceC1755b interfaceC1755b) {
        if (this.f6395H instanceof C1751a) {
            ((C1751a) this.f6395H).m7167a(interfaceC1755b);
        } else if (this.f6395H != null) {
            this.f6395H = new C1751a(this.f6395H, interfaceC1755b);
        } else {
            this.f6395H = interfaceC1755b;
        }
    }

    /* renamed from: a */
    public synchronized void m7221a(InterfaceC1759f interfaceC1759f) {
        if (this.f6393F != null) {
            this.f6393F.m7183b();
        }
        if (interfaceC1759f != null) {
            if (this.f6393F == null) {
                this.f6393F = new C1760g(RealtimeSinceBootClock.get(), this);
            }
            this.f6393F.m7180a(interfaceC1759f);
            this.f6393F.m7182a(true);
        }
    }

    @Override // p139d.p143b.p169g.p175c.AbstractC1774b, p139d.p143b.p169g.p181h.InterfaceC1815a
    /* renamed from: a */
    public void mo7222a(InterfaceC1816b interfaceC1816b) {
        super.mo7222a(interfaceC1816b);
        m7215a((AbstractC1918b) null);
    }

    /* renamed from: a */
    public synchronized void m7223a(InterfaceC1926c interfaceC1926c) {
        if (this.f6394G == null) {
            this.f6394G = new HashSet();
        }
        this.f6394G.add(interfaceC1926c);
    }

    @Override // p139d.p143b.p169g.p175c.AbstractC1774b
    /* renamed from: a */
    public void mo7228b(String str, C1716b<AbstractC1918b> c1716b) {
        super.mo7228b(str, c1716b);
        synchronized (this) {
            if (this.f6395H != null) {
                this.f6395H.mo7168a(str, 3, true);
            }
        }
    }

    @Override // p139d.p143b.p169g.p175c.AbstractC1774b
    /* renamed from: b */
    public int mo7230c(C1716b<AbstractC1918b> c1716b) {
        if (c1716b != null) {
            return c1716b.m7049o();
        }
        return 0;
    }

    /* renamed from: b */
    public synchronized void m7226b(InterfaceC1755b interfaceC1755b) {
        if (this.f6395H instanceof C1751a) {
            ((C1751a) this.f6395H).m7169b(interfaceC1755b);
        } else if (this.f6395H != null) {
            this.f6395H = new C1751a(this.f6395H, interfaceC1755b);
        } else {
            this.f6395H = interfaceC1755b;
        }
    }

    /* renamed from: b */
    public synchronized void m7227b(InterfaceC1926c interfaceC1926c) {
        if (this.f6394G == null) {
            return;
        }
        this.f6394G.remove(interfaceC1926c);
    }

    /* renamed from: b */
    public void m7229b(boolean z) {
        this.f6391D = z;
    }

    @Override // p139d.p143b.p169g.p175c.AbstractC1774b
    /* renamed from: c */
    public InterfaceC1921e mo7231d(C1716b<AbstractC1918b> c1716b) {
        C1691j.m6978b(C1716b.m7046c(c1716b));
        return c1716b.m7048n();
    }

    @Override // p139d.p143b.p169g.p175c.AbstractC1774b
    /* renamed from: d */
    public void mo7232e(C1716b<AbstractC1918b> c1716b) {
        C1716b.m7045b(c1716b);
    }

    @Override // p139d.p143b.p169g.p175c.AbstractC1774b
    /* renamed from: g */
    public C1716b<AbstractC1918b> mo7233g() {
        InterfaceC1648d interfaceC1648d;
        InterfaceC1844A<InterfaceC1648d, AbstractC1918b> interfaceC1844A = this.f6388A;
        if (interfaceC1844A == null || (interfaceC1648d = this.f6389B) == null) {
            return null;
        }
        C1716b<AbstractC1918b> c1716b = interfaceC1844A.get(interfaceC1648d);
        if (c1716b == null || c1716b.m7048n().mo7891o().mo7930a()) {
            return c1716b;
        }
        c1716b.close();
        return null;
    }

    @Override // p139d.p143b.p169g.p175c.AbstractC1774b
    /* renamed from: j */
    protected InterfaceC1736e<C1716b<AbstractC1918b>> mo7234j() {
        if (C1700a.m7000a(2)) {
            C1700a.m7002b(f6387w, "controller %x: getDataSource", Integer.valueOf(System.identityHashCode(this)));
        }
        return this.f6390C.get();
    }

    /* renamed from: p */
    protected void m7235p() {
        synchronized (this) {
            this.f6395H = null;
        }
    }

    /* renamed from: q */
    public synchronized InterfaceC1926c m7236q() {
        C1756c c1756c = this.f6395H != null ? new C1756c(m7290l(), this.f6395H) : null;
        if (this.f6394G == null) {
            return c1756c;
        }
        C1925b c1925b = new C1925b(this.f6394G);
        if (c1756c != null) {
            c1925b.m7934a(c1756c);
        }
        return c1925b;
    }

    @Override // p139d.p143b.p169g.p175c.AbstractC1774b
    public String toString() {
        C1690i.a m6961a = C1690i.m6961a(this);
        m6961a.m6967a("super", super.toString());
        m6961a.m6967a("dataSourceSupplier", this.f6390C);
        return m6961a.toString();
    }
}
