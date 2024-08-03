package p139d.p143b.p184i.p192f;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import com.facebook.imagepipeline.memory.C1008u;
import com.facebook.imagepipeline.memory.C1009v;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p139d.p143b.p145b.p147b.C1661g;
import p139d.p143b.p148c.p152d.C1691j;
import p139d.p143b.p148c.p152d.InterfaceC1694m;
import p139d.p143b.p148c.p155g.C1707d;
import p139d.p143b.p148c.p155g.InterfaceC1706c;
import p139d.p143b.p148c.p160l.C1731c;
import p139d.p143b.p148c.p160l.InterfaceC1729a;
import p139d.p143b.p148c.p160l.InterfaceC1730b;
import p139d.p143b.p184i.p189c.AbstractC1842f;
import p139d.p143b.p184i.p189c.C1840d;
import p139d.p143b.p184i.p190d.C1845B;
import p139d.p143b.p184i.p190d.C1848E;
import p139d.p143b.p184i.p190d.C1856f;
import p139d.p143b.p184i.p190d.C1867q;
import p139d.p143b.p184i.p190d.C1868r;
import p139d.p143b.p184i.p190d.C1869s;
import p139d.p143b.p184i.p190d.C1870t;
import p139d.p143b.p184i.p190d.InterfaceC1863m;
import p139d.p143b.p184i.p190d.InterfaceC1875y;
import p139d.p143b.p184i.p192f.C1897n;
import p139d.p143b.p184i.p194h.C1911e;
import p139d.p143b.p184i.p194h.C1915i;
import p139d.p143b.p184i.p194h.InterfaceC1910d;
import p139d.p143b.p184i.p194h.InterfaceC1912f;
import p139d.p143b.p184i.p197k.InterfaceC1926c;
import p139d.p143b.p184i.p200n.C1941E;
import p139d.p143b.p184i.p200n.InterfaceC1976da;

/* renamed from: d.b.i.f.l */
/* loaded from: classes.dex */
public class C1895l {

    /* renamed from: a */
    private static b f6897a = new b(null);

    /* renamed from: b */
    private final Bitmap.Config f6898b;

    /* renamed from: c */
    private final InterfaceC1694m<C1845B> f6899c;

    /* renamed from: d */
    private final C1867q.a f6900d;

    /* renamed from: e */
    private final InterfaceC1863m f6901e;

    /* renamed from: f */
    private final Context f6902f;

    /* renamed from: g */
    private final boolean f6903g;

    /* renamed from: h */
    private final InterfaceC1889f f6904h;

    /* renamed from: i */
    private final InterfaceC1694m<C1845B> f6905i;

    /* renamed from: j */
    private final InterfaceC1888e f6906j;

    /* renamed from: k */
    private final InterfaceC1875y f6907k;

    /* renamed from: l */
    private final InterfaceC1910d f6908l;

    /* renamed from: m */
    private final InterfaceC1694m<Boolean> f6909m;

    /* renamed from: n */
    private final C1661g f6910n;

    /* renamed from: o */
    private final InterfaceC1706c f6911o;

    /* renamed from: p */
    private final InterfaceC1976da f6912p;

    /* renamed from: q */
    private final int f6913q;

    /* renamed from: r */
    private final AbstractC1842f f6914r;

    /* renamed from: s */
    private final C1009v f6915s;

    /* renamed from: t */
    private final InterfaceC1912f f6916t;

    /* renamed from: u */
    private final Set<InterfaceC1926c> f6917u;

    /* renamed from: v */
    private final boolean f6918v;

    /* renamed from: w */
    private final C1661g f6919w;

    /* renamed from: x */
    private final C1911e f6920x;

    /* renamed from: y */
    private final C1897n f6921y;

    /* renamed from: z */
    private final boolean f6922z;

    /* renamed from: d.b.i.f.l$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        private Bitmap.Config f6923a;

        /* renamed from: b */
        private InterfaceC1694m<C1845B> f6924b;

        /* renamed from: c */
        private C1867q.a f6925c;

        /* renamed from: d */
        private InterfaceC1863m f6926d;

        /* renamed from: e */
        private final Context f6927e;

        /* renamed from: f */
        private boolean f6928f;

        /* renamed from: g */
        private InterfaceC1694m<C1845B> f6929g;

        /* renamed from: h */
        private InterfaceC1888e f6930h;

        /* renamed from: i */
        private InterfaceC1875y f6931i;

        /* renamed from: j */
        private InterfaceC1910d f6932j;

        /* renamed from: k */
        private InterfaceC1694m<Boolean> f6933k;

        /* renamed from: l */
        private C1661g f6934l;

        /* renamed from: m */
        private InterfaceC1706c f6935m;

        /* renamed from: n */
        private InterfaceC1976da f6936n;

        /* renamed from: o */
        private AbstractC1842f f6937o;

        /* renamed from: p */
        private C1009v f6938p;

        /* renamed from: q */
        private InterfaceC1912f f6939q;

        /* renamed from: r */
        private Set<InterfaceC1926c> f6940r;

        /* renamed from: s */
        private boolean f6941s;

        /* renamed from: t */
        private C1661g f6942t;

        /* renamed from: u */
        private InterfaceC1889f f6943u;

        /* renamed from: v */
        private C1911e f6944v;

        /* renamed from: w */
        private int f6945w;

        /* renamed from: x */
        private final C1897n.a f6946x;

        /* renamed from: y */
        private boolean f6947y;

        private a(Context context) {
            this.f6928f = false;
            this.f6941s = true;
            this.f6945w = -1;
            this.f6946x = new C1897n.a(this);
            this.f6947y = true;
            C1691j.m6971a(context);
            this.f6927e = context;
        }

        /* synthetic */ a(Context context, C1894k c1894k) {
            this(context);
        }

        /* renamed from: a */
        public a m7749a(InterfaceC1976da interfaceC1976da) {
            this.f6936n = interfaceC1976da;
            return this;
        }

        /* renamed from: a */
        public a m7750a(Set<InterfaceC1926c> set) {
            this.f6940r = set;
            return this;
        }

        /* renamed from: a */
        public a m7751a(boolean z) {
            this.f6928f = z;
            return this;
        }

        /* renamed from: a */
        public C1895l m7752a() {
            return new C1895l(this, null);
        }
    }

    /* renamed from: d.b.i.f.l$b */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        private boolean f6948a;

        private b() {
            this.f6948a = false;
        }

        /* synthetic */ b(C1894k c1894k) {
            this();
        }

        /* renamed from: a */
        public boolean m7753a() {
            return this.f6948a;
        }
    }

    private C1895l(a aVar) {
        C1840d c1840d;
        this.f6921y = aVar.f6946x.m7776a();
        this.f6899c = aVar.f6924b == null ? new C1868r((ActivityManager) aVar.f6927e.getSystemService("activity")) : aVar.f6924b;
        this.f6900d = aVar.f6925c == null ? new C1856f() : aVar.f6925c;
        this.f6898b = aVar.f6923a == null ? Bitmap.Config.ARGB_8888 : aVar.f6923a;
        this.f6901e = aVar.f6926d == null ? C1869s.m7638a() : aVar.f6926d;
        Context context = aVar.f6927e;
        C1691j.m6971a(context);
        this.f6902f = context;
        this.f6904h = aVar.f6943u == null ? new C1885b(new C1887d()) : aVar.f6943u;
        this.f6903g = aVar.f6928f;
        this.f6905i = aVar.f6929g == null ? new C1870t() : aVar.f6929g;
        this.f6907k = aVar.f6931i == null ? C1848E.m7557i() : aVar.f6931i;
        this.f6908l = aVar.f6932j;
        this.f6909m = aVar.f6933k == null ? new C1894k(this) : aVar.f6933k;
        this.f6910n = aVar.f6934l == null ? m7699b(aVar.f6927e) : aVar.f6934l;
        this.f6911o = aVar.f6935m == null ? C1707d.m7038a() : aVar.f6935m;
        this.f6913q = aVar.f6945w < 0 ? 30000 : aVar.f6945w;
        this.f6912p = aVar.f6936n == null ? new C1941E(this.f6913q) : aVar.f6936n;
        this.f6914r = aVar.f6937o;
        this.f6915s = aVar.f6938p == null ? new C1009v(C1008u.m5052i().m5069a()) : aVar.f6938p;
        this.f6916t = aVar.f6939q == null ? new C1915i() : aVar.f6939q;
        this.f6917u = aVar.f6940r == null ? new HashSet<>() : aVar.f6940r;
        this.f6918v = aVar.f6941s;
        this.f6919w = aVar.f6942t == null ? this.f6910n : aVar.f6942t;
        this.f6920x = aVar.f6944v;
        this.f6906j = aVar.f6930h == null ? new C1884a(this.f6915s.m5072c()) : aVar.f6930h;
        this.f6922z = aVar.f6947y;
        InterfaceC1730b m7760g = this.f6921y.m7760g();
        if (m7760g != null) {
            c1840d = new C1840d(m7717r());
        } else if (!this.f6921y.m7765l() || !C1731c.f6272a || (m7760g = C1731c.m7095a()) == null) {
            return;
        } else {
            c1840d = new C1840d(m7717r());
        }
        m7698a(m7760g, this.f6921y, c1840d);
    }

    /* synthetic */ C1895l(a aVar, C1894k c1894k) {
        this(aVar);
    }

    /* renamed from: a */
    public static a m7697a(Context context) {
        return new a(context, null);
    }

    /* renamed from: a */
    private static void m7698a(InterfaceC1730b interfaceC1730b, C1897n c1897n, InterfaceC1729a interfaceC1729a) {
        C1731c.f6275d = interfaceC1730b;
        InterfaceC1730b.a m7761h = c1897n.m7761h();
        if (m7761h != null) {
            interfaceC1730b.m7094a(m7761h);
        }
        if (interfaceC1729a != null) {
            interfaceC1730b.m7093a(interfaceC1729a);
        }
    }

    /* renamed from: b */
    private static C1661g m7699b(Context context) {
        return C1661g.m6869a(context).m6894a();
    }

    /* renamed from: f */
    public static b m7700f() {
        return f6897a;
    }

    /* renamed from: a */
    public Bitmap.Config m7701a() {
        return this.f6898b;
    }

    /* renamed from: b */
    public InterfaceC1694m<C1845B> m7702b() {
        return this.f6899c;
    }

    /* renamed from: c */
    public C1867q.a m7703c() {
        return this.f6900d;
    }

    /* renamed from: d */
    public InterfaceC1863m m7704d() {
        return this.f6901e;
    }

    /* renamed from: e */
    public Context m7705e() {
        return this.f6902f;
    }

    /* renamed from: g */
    public InterfaceC1694m<C1845B> m7706g() {
        return this.f6905i;
    }

    /* renamed from: h */
    public InterfaceC1888e m7707h() {
        return this.f6906j;
    }

    /* renamed from: i */
    public C1897n m7708i() {
        return this.f6921y;
    }

    /* renamed from: j */
    public InterfaceC1889f m7709j() {
        return this.f6904h;
    }

    /* renamed from: k */
    public InterfaceC1875y m7710k() {
        return this.f6907k;
    }

    /* renamed from: l */
    public InterfaceC1910d m7711l() {
        return this.f6908l;
    }

    /* renamed from: m */
    public C1911e m7712m() {
        return this.f6920x;
    }

    /* renamed from: n */
    public InterfaceC1694m<Boolean> m7713n() {
        return this.f6909m;
    }

    /* renamed from: o */
    public C1661g m7714o() {
        return this.f6910n;
    }

    /* renamed from: p */
    public InterfaceC1706c m7715p() {
        return this.f6911o;
    }

    /* renamed from: q */
    public InterfaceC1976da m7716q() {
        return this.f6912p;
    }

    /* renamed from: r */
    public C1009v m7717r() {
        return this.f6915s;
    }

    /* renamed from: s */
    public InterfaceC1912f m7718s() {
        return this.f6916t;
    }

    /* renamed from: t */
    public Set<InterfaceC1926c> m7719t() {
        return Collections.unmodifiableSet(this.f6917u);
    }

    /* renamed from: u */
    public C1661g m7720u() {
        return this.f6919w;
    }

    /* renamed from: v */
    public boolean m7721v() {
        return this.f6922z;
    }

    /* renamed from: w */
    public boolean m7722w() {
        return this.f6903g;
    }

    /* renamed from: x */
    public boolean m7723x() {
        return this.f6918v;
    }
}
