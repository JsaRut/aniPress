package p139d.p143b.p169g.p170a.p171a;

import android.content.Context;
import android.net.Uri;
import java.util.Set;
import p139d.p143b.p145b.p146a.InterfaceC1648d;
import p139d.p143b.p148c.p152d.C1686e;
import p139d.p143b.p148c.p156h.C1716b;
import p139d.p143b.p161d.InterfaceC1736e;
import p139d.p143b.p169g.p170a.p171a.p172a.InterfaceC1755b;
import p139d.p143b.p169g.p170a.p171a.p172a.InterfaceC1759f;
import p139d.p143b.p169g.p175c.AbstractC1777e;
import p139d.p143b.p169g.p175c.InterfaceC1779g;
import p139d.p143b.p169g.p181h.InterfaceC1815a;
import p139d.p143b.p184i.p190d.InterfaceC1863m;
import p139d.p143b.p184i.p191e.C1882f;
import p139d.p143b.p184i.p192f.C1893j;
import p139d.p143b.p184i.p195i.InterfaceC1916a;
import p139d.p143b.p184i.p196j.AbstractC1918b;
import p139d.p143b.p184i.p196j.InterfaceC1921e;
import p139d.p143b.p184i.p197k.InterfaceC1926c;
import p139d.p143b.p184i.p201o.C2023c;
import p139d.p143b.p184i.p201o.C2024d;
import p139d.p143b.p184i.p202p.C2030c;

/* renamed from: d.b.g.a.a.f */
/* loaded from: classes.dex */
public class C1766f extends AbstractC1777e<C1766f, C2023c, C1716b<AbstractC1918b>, InterfaceC1921e> {

    /* renamed from: s */
    private final C1893j f6400s;

    /* renamed from: t */
    private final C1768h f6401t;

    /* renamed from: u */
    private C1686e<InterfaceC1916a> f6402u;

    /* renamed from: v */
    private InterfaceC1755b f6403v;

    /* renamed from: w */
    private InterfaceC1759f f6404w;

    public C1766f(Context context, C1768h c1768h, C1893j c1893j, Set<InterfaceC1779g> set) {
        super(context, set);
        this.f6400s = c1893j;
        this.f6401t = c1768h;
    }

    /* renamed from: a */
    public static C2023c.b m7237a(AbstractC1777e.a aVar) {
        int i = C1765e.f6399a[aVar.ordinal()];
        if (i == 1) {
            return C2023c.b.FULL_FETCH;
        }
        if (i == 2) {
            return C2023c.b.DISK_CACHE;
        }
        if (i == 3) {
            return C2023c.b.BITMAP_MEMORY_CACHE;
        }
        throw new RuntimeException("Cache level" + aVar + "is not supported. ");
    }

    /* renamed from: m */
    private InterfaceC1648d m7238m() {
        C2023c m7314f = m7314f();
        InterfaceC1863m m7696e = this.f6400s.m7696e();
        if (m7696e == null || m7314f == null) {
            return null;
        }
        return m7314f.m8240f() != null ? m7696e.mo7602b(m7314f, m7310c()) : m7696e.mo7601a(m7314f, m7310c());
    }

    @Override // p139d.p143b.p169g.p175c.AbstractC1777e
    /* renamed from: a */
    public InterfaceC1736e<C1716b<AbstractC1918b>> mo7239a(InterfaceC1815a interfaceC1815a, String str, C2023c c2023c, Object obj, AbstractC1777e.a aVar) {
        return this.f6400s.m7686a(c2023c, obj, m7237a(aVar), m7241b(interfaceC1815a));
    }

    @Override // p139d.p143b.p169g.p181h.InterfaceC1818d
    /* renamed from: a */
    public C1766f mo7240a(Uri uri) {
        C2023c m8257a;
        if (uri == null) {
            m8257a = null;
        } else {
            C2024d m8255a = C2024d.m8255a(uri);
            m8255a.m8262a(C1882f.m7661b());
            m8257a = m8255a.m8257a();
        }
        super.m7307b((C1766f) m8257a);
        return this;
    }

    /* renamed from: b */
    protected InterfaceC1926c m7241b(InterfaceC1815a interfaceC1815a) {
        if (interfaceC1815a instanceof C1764d) {
            return ((C1764d) interfaceC1815a).m7236q();
        }
        return null;
    }

    @Override // p139d.p143b.p169g.p175c.AbstractC1777e
    /* renamed from: j */
    public C1764d mo7242j() {
        C2030c.m8290a("obtainController");
        try {
            InterfaceC1815a m7315g = m7315g();
            String m7295b = AbstractC1777e.m7295b();
            C1764d m7243a = m7315g instanceof C1764d ? (C1764d) m7315g : this.f6401t.m7243a();
            m7243a.m7219a(m7297a(m7243a, m7295b), m7295b, m7238m(), m7310c(), this.f6402u, this.f6403v);
            m7243a.m7221a(this.f6404w);
            return m7243a;
        } finally {
            C2030c.m8289a();
        }
    }
}
