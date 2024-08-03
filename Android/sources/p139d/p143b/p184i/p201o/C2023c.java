package p139d.p143b.p184i.p201o;

import android.net.Uri;
import java.io.File;
import p139d.p143b.p145b.p146a.InterfaceC1648d;
import p139d.p143b.p148c.p152d.C1690i;
import p139d.p143b.p148c.p154f.C1703a;
import p139d.p143b.p148c.p159k.C1728f;
import p139d.p143b.p184i.p191e.C1877a;
import p139d.p143b.p184i.p191e.C1878b;
import p139d.p143b.p184i.p191e.C1881e;
import p139d.p143b.p184i.p191e.C1882f;
import p139d.p143b.p184i.p191e.EnumC1880d;
import p139d.p143b.p184i.p197k.InterfaceC1926c;

/* renamed from: d.b.i.o.c */
/* loaded from: classes.dex */
public class C2023c {

    /* renamed from: a */
    private final a f7362a;

    /* renamed from: b */
    private final Uri f7363b;

    /* renamed from: c */
    private final int f7364c;

    /* renamed from: d */
    private File f7365d;

    /* renamed from: e */
    private final boolean f7366e;

    /* renamed from: f */
    private final boolean f7367f;

    /* renamed from: g */
    private final C1878b f7368g;

    /* renamed from: h */
    private final C1881e f7369h;

    /* renamed from: i */
    private final C1882f f7370i;

    /* renamed from: j */
    private final C1877a f7371j;

    /* renamed from: k */
    private final EnumC1880d f7372k;

    /* renamed from: l */
    private final b f7373l;

    /* renamed from: m */
    private final boolean f7374m;

    /* renamed from: n */
    private final boolean f7375n;

    /* renamed from: o */
    private final InterfaceC2025e f7376o;

    /* renamed from: p */
    private final InterfaceC1926c f7377p;

    /* renamed from: d.b.i.o.c$a */
    /* loaded from: classes.dex */
    public enum a {
        SMALL,
        DEFAULT
    }

    /* renamed from: d.b.i.o.c$b */
    /* loaded from: classes.dex */
    public enum b {
        FULL_FETCH(1),
        DISK_CACHE(2),
        ENCODED_MEMORY_CACHE(3),
        BITMAP_MEMORY_CACHE(4);


        /* renamed from: f */
        private int f7386f;

        b(int i) {
            this.f7386f = i;
        }

        /* renamed from: a */
        public static b m8253a(b bVar, b bVar2) {
            return bVar.m8254b() > bVar2.m8254b() ? bVar : bVar2;
        }

        /* renamed from: b */
        public int m8254b() {
            return this.f7386f;
        }
    }

    public C2023c(C2024d c2024d) {
        this.f7362a = c2024d.m8271c();
        this.f7363b = c2024d.m8280k();
        this.f7364c = m8234a(this.f7363b);
        this.f7366e = c2024d.m8284o();
        this.f7367f = c2024d.m8282m();
        this.f7368g = c2024d.m8273d();
        this.f7369h = c2024d.m8278i();
        this.f7370i = c2024d.m8279j() == null ? C1882f.m7660a() : c2024d.m8279j();
        this.f7371j = c2024d.m8268b();
        this.f7372k = c2024d.m8277h();
        this.f7373l = c2024d.m8274e();
        this.f7374m = c2024d.m8281l();
        this.f7375n = c2024d.m8283n();
        this.f7376o = c2024d.m8275f();
        this.f7377p = c2024d.m8276g();
    }

    /* renamed from: a */
    private static int m8234a(Uri uri) {
        if (uri == null) {
            return -1;
        }
        if (C1728f.m7089i(uri)) {
            return 0;
        }
        if (C1728f.m7087g(uri)) {
            return C1703a.m7035b(C1703a.m7034a(uri.getPath())) ? 2 : 3;
        }
        if (C1728f.m7086f(uri)) {
            return 4;
        }
        if (C1728f.m7083c(uri)) {
            return 5;
        }
        if (C1728f.m7088h(uri)) {
            return 6;
        }
        if (C1728f.m7082b(uri)) {
            return 7;
        }
        return C1728f.m7090j(uri) ? 8 : -1;
    }

    /* renamed from: a */
    public C1877a m8235a() {
        return this.f7371j;
    }

    /* renamed from: b */
    public a m8236b() {
        return this.f7362a;
    }

    /* renamed from: c */
    public C1878b m8237c() {
        return this.f7368g;
    }

    /* renamed from: d */
    public boolean m8238d() {
        return this.f7367f;
    }

    /* renamed from: e */
    public b m8239e() {
        return this.f7373l;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C2023c)) {
            return false;
        }
        C2023c c2023c = (C2023c) obj;
        if (!C1690i.m6963a(this.f7363b, c2023c.f7363b) || !C1690i.m6963a(this.f7362a, c2023c.f7362a) || !C1690i.m6963a(this.f7365d, c2023c.f7365d) || !C1690i.m6963a(this.f7371j, c2023c.f7371j) || !C1690i.m6963a(this.f7368g, c2023c.f7368g) || !C1690i.m6963a(this.f7369h, c2023c.f7369h) || !C1690i.m6963a(this.f7370i, c2023c.f7370i)) {
            return false;
        }
        InterfaceC2025e interfaceC2025e = this.f7376o;
        InterfaceC1648d mo5999a = interfaceC2025e != null ? interfaceC2025e.mo5999a() : null;
        InterfaceC2025e interfaceC2025e2 = c2023c.f7376o;
        return C1690i.m6963a(mo5999a, interfaceC2025e2 != null ? interfaceC2025e2.mo5999a() : null);
    }

    /* renamed from: f */
    public InterfaceC2025e m8240f() {
        return this.f7376o;
    }

    /* renamed from: g */
    public int m8241g() {
        C1881e c1881e = this.f7369h;
        if (c1881e != null) {
            return c1881e.f6866b;
        }
        return 2048;
    }

    /* renamed from: h */
    public int m8242h() {
        C1881e c1881e = this.f7369h;
        if (c1881e != null) {
            return c1881e.f6865a;
        }
        return 2048;
    }

    public int hashCode() {
        InterfaceC2025e interfaceC2025e = this.f7376o;
        return C1690i.m6960a(this.f7362a, this.f7363b, this.f7365d, this.f7371j, this.f7368g, this.f7369h, this.f7370i, interfaceC2025e != null ? interfaceC2025e.mo5999a() : null);
    }

    /* renamed from: i */
    public EnumC1880d m8243i() {
        return this.f7372k;
    }

    /* renamed from: j */
    public boolean m8244j() {
        return this.f7366e;
    }

    /* renamed from: k */
    public InterfaceC1926c m8245k() {
        return this.f7377p;
    }

    /* renamed from: l */
    public C1881e m8246l() {
        return this.f7369h;
    }

    /* renamed from: m */
    public C1882f m8247m() {
        return this.f7370i;
    }

    /* renamed from: n */
    public synchronized File m8248n() {
        if (this.f7365d == null) {
            this.f7365d = new File(this.f7363b.getPath());
        }
        return this.f7365d;
    }

    /* renamed from: o */
    public Uri m8249o() {
        return this.f7363b;
    }

    /* renamed from: p */
    public int m8250p() {
        return this.f7364c;
    }

    /* renamed from: q */
    public boolean m8251q() {
        return this.f7374m;
    }

    /* renamed from: r */
    public boolean m8252r() {
        return this.f7375n;
    }

    public String toString() {
        C1690i.a m6961a = C1690i.m6961a(this);
        m6961a.m6967a("uri", this.f7363b);
        m6961a.m6967a("cacheChoice", this.f7362a);
        m6961a.m6967a("decodeOptions", this.f7368g);
        m6961a.m6967a("postprocessor", this.f7376o);
        m6961a.m6967a("priority", this.f7372k);
        m6961a.m6967a("resizeOptions", this.f7369h);
        m6961a.m6967a("rotationOptions", this.f7370i);
        m6961a.m6967a("bytesRange", this.f7371j);
        return m6961a.toString();
    }
}
