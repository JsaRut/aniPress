package p139d.p143b.p184i.p192f;

import android.content.Context;
import android.os.Build;
import android.support.v4.util.C0267m;
import com.facebook.imagepipeline.memory.C1009v;
import p139d.p143b.p145b.p146a.InterfaceC1648d;
import p139d.p143b.p145b.p147b.InterfaceC1668n;
import p139d.p143b.p148c.p152d.C1691j;
import p139d.p143b.p148c.p152d.C1698q;
import p139d.p143b.p148c.p153e.C1700a;
import p139d.p143b.p148c.p155g.InterfaceC1710g;
import p139d.p143b.p184i.p185a.p186a.C1831b;
import p139d.p143b.p184i.p185a.p186a.InterfaceC1830a;
import p139d.p143b.p184i.p189c.AbstractC1842f;
import p139d.p143b.p184i.p189c.C1837a;
import p139d.p143b.p184i.p189c.C1838b;
import p139d.p143b.p184i.p189c.C1839c;
import p139d.p143b.p184i.p189c.C1841e;
import p139d.p143b.p184i.p190d.C1852b;
import p139d.p143b.p184i.p190d.C1854d;
import p139d.p143b.p184i.p190d.C1862l;
import p139d.p143b.p184i.p190d.C1867q;
import p139d.p143b.p184i.p190d.C1872v;
import p139d.p143b.p184i.p190d.C1874x;
import p139d.p143b.p184i.p190d.C1876z;
import p139d.p143b.p184i.p194h.C1909c;
import p139d.p143b.p184i.p194h.InterfaceC1910d;
import p139d.p143b.p184i.p195i.InterfaceC1916a;
import p139d.p143b.p184i.p196j.AbstractC1918b;
import p139d.p143b.p184i.p198l.C1927a;
import p139d.p143b.p184i.p198l.C1929c;
import p139d.p143b.p184i.p198l.C1930d;
import p139d.p143b.p184i.p198l.InterfaceC1931e;
import p139d.p143b.p184i.p200n.C1938Ca;

/* renamed from: d.b.i.f.o */
/* loaded from: classes.dex */
public class C1898o {

    /* renamed from: a */
    private static final Class<?> f6974a = C1898o.class;

    /* renamed from: b */
    private static C1898o f6975b;

    /* renamed from: c */
    private final C1938Ca f6976c;

    /* renamed from: d */
    private final C1895l f6977d;

    /* renamed from: e */
    private C1867q<InterfaceC1648d, AbstractC1918b> f6978e;

    /* renamed from: f */
    private C1876z<InterfaceC1648d, AbstractC1918b> f6979f;

    /* renamed from: g */
    private C1867q<InterfaceC1648d, InterfaceC1710g> f6980g;

    /* renamed from: h */
    private C1876z<InterfaceC1648d, InterfaceC1710g> f6981h;

    /* renamed from: i */
    private C1862l f6982i;

    /* renamed from: j */
    private InterfaceC1668n f6983j;

    /* renamed from: k */
    private InterfaceC1910d f6984k;

    /* renamed from: l */
    private C1893j f6985l;

    /* renamed from: m */
    private C1901r f6986m;

    /* renamed from: n */
    private C1902s f6987n;

    /* renamed from: o */
    private C1862l f6988o;

    /* renamed from: p */
    private InterfaceC1668n f6989p;

    /* renamed from: q */
    private AbstractC1842f f6990q;

    /* renamed from: r */
    private InterfaceC1931e f6991r;

    /* renamed from: s */
    private InterfaceC1830a f6992s;

    public C1898o(C1895l c1895l) {
        C1691j.m6971a(c1895l);
        this.f6977d = c1895l;
        this.f6976c = new C1938Ca(c1895l.m7707h().mo7668b());
    }

    /* renamed from: a */
    public static AbstractC1842f m7778a(C1009v c1009v, InterfaceC1931e interfaceC1931e) {
        int i = Build.VERSION.SDK_INT;
        return i >= 21 ? new C1837a(c1009v.m5070a()) : i >= 11 ? new C1841e(new C1838b(c1009v.m5074e()), interfaceC1931e) : new C1839c();
    }

    /* renamed from: a */
    public static InterfaceC1931e m7779a(C1009v c1009v, boolean z) {
        int i = Build.VERSION.SDK_INT;
        if (i < 21) {
            return (!z || i >= 19) ? new C1930d(c1009v.m5071b()) : new C1929c();
        }
        int m5072c = c1009v.m5072c();
        return new C1927a(c1009v.m5070a(), m5072c, new C0267m(m5072c));
    }

    /* renamed from: a */
    public static synchronized void m7780a(C1895l c1895l) {
        synchronized (C1898o.class) {
            if (f6975b != null) {
                C1700a.m7009c(f6974a, "ImagePipelineFactory has already been initialized! `ImagePipelineFactory.initialize(...)` should only be called once to avoid unexpected behavior.");
            }
            f6975b = new C1898o(c1895l);
        }
    }

    /* renamed from: b */
    public static synchronized void m7781b(Context context) {
        synchronized (C1898o.class) {
            m7780a(C1895l.m7697a(context).m7752a());
        }
    }

    /* renamed from: f */
    public static C1898o m7782f() {
        C1898o c1898o = f6975b;
        C1691j.m6972a(c1898o, "ImagePipelineFactory was not initialized!");
        return c1898o;
    }

    /* renamed from: l */
    private InterfaceC1830a m7783l() {
        if (this.f6992s == null) {
            this.f6992s = C1831b.m7532a(m7796i(), this.f6977d.m7707h(), m7788a());
        }
        return this.f6992s;
    }

    /* renamed from: m */
    private InterfaceC1910d m7784m() {
        InterfaceC1910d interfaceC1910d;
        InterfaceC1910d interfaceC1910d2;
        if (this.f6984k == null) {
            if (this.f6977d.m7711l() != null) {
                this.f6984k = this.f6977d.m7711l();
            } else {
                InterfaceC1830a m7783l = m7783l();
                if (m7783l != null) {
                    interfaceC1910d2 = m7783l.m7529a(this.f6977d.m7701a());
                    interfaceC1910d = m7783l.m7531b(this.f6977d.m7701a());
                } else {
                    interfaceC1910d = null;
                    interfaceC1910d2 = null;
                }
                if (this.f6977d.m7712m() != null) {
                    m7797j();
                    this.f6977d.m7712m().m7879a();
                    throw null;
                }
                this.f6984k = new C1909c(interfaceC1910d2, interfaceC1910d, m7797j());
            }
        }
        return this.f6984k;
    }

    /* renamed from: n */
    private C1901r m7785n() {
        if (this.f6986m == null) {
            this.f6986m = this.f6977d.m7708i().m7757d().mo7777a(this.f6977d.m7705e(), this.f6977d.m7717r().m5076g(), m7784m(), this.f6977d.m7718s(), this.f6977d.m7722w(), this.f6977d.m7723x(), this.f6977d.m7708i().m7762i(), this.f6977d.m7707h(), this.f6977d.m7717r().m5074e(), m7790b(), m7792d(), m7794g(), m7787p(), this.f6977d.m7704d(), m7796i(), this.f6977d.m7708i().m7756c(), this.f6977d.m7708i().m7755b(), this.f6977d.m7708i().m7754a());
        }
        return this.f6986m;
    }

    /* renamed from: o */
    private C1902s m7786o() {
        boolean z = Build.VERSION.SDK_INT >= 24 && this.f6977d.m7708i().m7758e();
        if (this.f6987n == null) {
            this.f6987n = new C1902s(this.f6977d.m7705e().getApplicationContext().getContentResolver(), m7785n(), this.f6977d.m7716q(), this.f6977d.m7723x(), this.f6977d.m7708i().m7765l(), this.f6976c, this.f6977d.m7708i().m7759f(), z, this.f6977d.m7708i().m7764k(), this.f6977d.m7721v());
        }
        return this.f6987n;
    }

    /* renamed from: p */
    private C1862l m7787p() {
        if (this.f6988o == null) {
            this.f6988o = new C1862l(m7798k(), this.f6977d.m7717r().m5074e(), this.f6977d.m7717r().m5075f(), this.f6977d.m7707h().mo7671e(), this.f6977d.m7707h().mo7670d(), this.f6977d.m7710k());
        }
        return this.f6988o;
    }

    /* renamed from: a */
    public C1867q<InterfaceC1648d, AbstractC1918b> m7788a() {
        if (this.f6978e == null) {
            this.f6978e = C1852b.m7580a(this.f6977d.m7702b(), this.f6977d.m7715p(), this.f6977d.m7703c());
        }
        return this.f6978e;
    }

    /* renamed from: a */
    public InterfaceC1916a m7789a(Context context) {
        InterfaceC1830a m7783l = m7783l();
        if (m7783l == null) {
            return null;
        }
        return m7783l.m7530a(context);
    }

    /* renamed from: b */
    public C1876z<InterfaceC1648d, AbstractC1918b> m7790b() {
        if (this.f6979f == null) {
            this.f6979f = C1854d.m7581a(m7788a(), this.f6977d.m7710k());
        }
        return this.f6979f;
    }

    /* renamed from: c */
    public C1867q<InterfaceC1648d, InterfaceC1710g> m7791c() {
        if (this.f6980g == null) {
            this.f6980g = C1872v.m7641a(this.f6977d.m7706g(), this.f6977d.m7715p());
        }
        return this.f6980g;
    }

    /* renamed from: d */
    public C1876z<InterfaceC1648d, InterfaceC1710g> m7792d() {
        if (this.f6981h == null) {
            this.f6981h = C1874x.m7642a(m7791c(), this.f6977d.m7710k());
        }
        return this.f6981h;
    }

    /* renamed from: e */
    public C1893j m7793e() {
        if (this.f6985l == null) {
            this.f6985l = new C1893j(m7786o(), this.f6977d.m7719t(), this.f6977d.m7713n(), m7790b(), m7792d(), m7794g(), m7787p(), this.f6977d.m7704d(), this.f6976c, C1698q.m6983a(false), this.f6977d.m7708i().m7763j());
        }
        return this.f6985l;
    }

    /* renamed from: g */
    public C1862l m7794g() {
        if (this.f6982i == null) {
            this.f6982i = new C1862l(m7795h(), this.f6977d.m7717r().m5074e(), this.f6977d.m7717r().m5075f(), this.f6977d.m7707h().mo7671e(), this.f6977d.m7707h().mo7670d(), this.f6977d.m7710k());
        }
        return this.f6982i;
    }

    /* renamed from: h */
    public InterfaceC1668n m7795h() {
        if (this.f6983j == null) {
            this.f6983j = this.f6977d.m7709j().mo7674a(this.f6977d.m7714o());
        }
        return this.f6983j;
    }

    /* renamed from: i */
    public AbstractC1842f m7796i() {
        if (this.f6990q == null) {
            this.f6990q = m7778a(this.f6977d.m7717r(), m7797j());
        }
        return this.f6990q;
    }

    /* renamed from: j */
    public InterfaceC1931e m7797j() {
        if (this.f6991r == null) {
            this.f6991r = m7779a(this.f6977d.m7717r(), this.f6977d.m7708i().m7765l());
        }
        return this.f6991r;
    }

    /* renamed from: k */
    public InterfaceC1668n m7798k() {
        if (this.f6989p == null) {
            this.f6989p = this.f6977d.m7709j().mo7674a(this.f6977d.m7720u());
        }
        return this.f6989p;
    }
}
