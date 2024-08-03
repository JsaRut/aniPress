package p139d.p143b.p184i.p201o;

import android.net.Uri;
import p139d.p143b.p148c.p152d.C1691j;
import p139d.p143b.p148c.p159k.C1728f;
import p139d.p143b.p184i.p191e.C1877a;
import p139d.p143b.p184i.p191e.C1878b;
import p139d.p143b.p184i.p191e.C1881e;
import p139d.p143b.p184i.p191e.C1882f;
import p139d.p143b.p184i.p191e.EnumC1880d;
import p139d.p143b.p184i.p192f.C1895l;
import p139d.p143b.p184i.p197k.InterfaceC1926c;
import p139d.p143b.p184i.p201o.C2023c;

/* renamed from: d.b.i.o.d */
/* loaded from: classes.dex */
public class C2024d {

    /* renamed from: m */
    private InterfaceC1926c f7399m;

    /* renamed from: a */
    private Uri f7387a = null;

    /* renamed from: b */
    private C2023c.b f7388b = C2023c.b.FULL_FETCH;

    /* renamed from: c */
    private C1881e f7389c = null;

    /* renamed from: d */
    private C1882f f7390d = null;

    /* renamed from: e */
    private C1878b f7391e = C1878b.m7649a();

    /* renamed from: f */
    private C2023c.a f7392f = C2023c.a.DEFAULT;

    /* renamed from: g */
    private boolean f7393g = C1895l.m7700f().m7753a();

    /* renamed from: h */
    private boolean f7394h = false;

    /* renamed from: i */
    private EnumC1880d f7395i = EnumC1880d.HIGH;

    /* renamed from: j */
    private InterfaceC2025e f7396j = null;

    /* renamed from: k */
    private boolean f7397k = true;

    /* renamed from: l */
    private boolean f7398l = true;

    /* renamed from: n */
    private C1877a f7400n = null;

    /* renamed from: d.b.i.o.d$a */
    /* loaded from: classes.dex */
    public static class a extends RuntimeException {
        public a(String str) {
            super("Invalid request builder: " + str);
        }
    }

    private C2024d() {
    }

    /* renamed from: a */
    public static C2024d m8255a(Uri uri) {
        C2024d c2024d = new C2024d();
        c2024d.m8269b(uri);
        return c2024d;
    }

    /* renamed from: a */
    public static C2024d m8256a(C2023c c2023c) {
        C2024d m8255a = m8255a(c2023c.m8249o());
        m8255a.m8259a(c2023c.m8237c());
        m8255a.m8258a(c2023c.m8235a());
        m8255a.m8264a(c2023c.m8236b());
        m8255a.m8270b(c2023c.m8238d());
        m8255a.m8265a(c2023c.m8239e());
        m8255a.m8266a(c2023c.m8240f());
        m8255a.m8272c(c2023c.m8244j());
        m8255a.m8260a(c2023c.m8243i());
        m8255a.m8261a(c2023c.m8246l());
        m8255a.m8263a(c2023c.m8245k());
        m8255a.m8262a(c2023c.m8247m());
        return m8255a;
    }

    /* renamed from: a */
    public C2023c m8257a() {
        m8285p();
        return new C2023c(this);
    }

    /* renamed from: a */
    public C2024d m8258a(C1877a c1877a) {
        this.f7400n = c1877a;
        return this;
    }

    /* renamed from: a */
    public C2024d m8259a(C1878b c1878b) {
        this.f7391e = c1878b;
        return this;
    }

    /* renamed from: a */
    public C2024d m8260a(EnumC1880d enumC1880d) {
        this.f7395i = enumC1880d;
        return this;
    }

    /* renamed from: a */
    public C2024d m8261a(C1881e c1881e) {
        this.f7389c = c1881e;
        return this;
    }

    /* renamed from: a */
    public C2024d m8262a(C1882f c1882f) {
        this.f7390d = c1882f;
        return this;
    }

    /* renamed from: a */
    public C2024d m8263a(InterfaceC1926c interfaceC1926c) {
        this.f7399m = interfaceC1926c;
        return this;
    }

    /* renamed from: a */
    public C2024d m8264a(C2023c.a aVar) {
        this.f7392f = aVar;
        return this;
    }

    /* renamed from: a */
    public C2024d m8265a(C2023c.b bVar) {
        this.f7388b = bVar;
        return this;
    }

    /* renamed from: a */
    public C2024d m8266a(InterfaceC2025e interfaceC2025e) {
        this.f7396j = interfaceC2025e;
        return this;
    }

    @Deprecated
    /* renamed from: a */
    public C2024d m8267a(boolean z) {
        m8262a(z ? C1882f.m7660a() : C1882f.m7662d());
        return this;
    }

    /* renamed from: b */
    public C1877a m8268b() {
        return this.f7400n;
    }

    /* renamed from: b */
    public C2024d m8269b(Uri uri) {
        C1691j.m6971a(uri);
        this.f7387a = uri;
        return this;
    }

    /* renamed from: b */
    public C2024d m8270b(boolean z) {
        this.f7394h = z;
        return this;
    }

    /* renamed from: c */
    public C2023c.a m8271c() {
        return this.f7392f;
    }

    /* renamed from: c */
    public C2024d m8272c(boolean z) {
        this.f7393g = z;
        return this;
    }

    /* renamed from: d */
    public C1878b m8273d() {
        return this.f7391e;
    }

    /* renamed from: e */
    public C2023c.b m8274e() {
        return this.f7388b;
    }

    /* renamed from: f */
    public InterfaceC2025e m8275f() {
        return this.f7396j;
    }

    /* renamed from: g */
    public InterfaceC1926c m8276g() {
        return this.f7399m;
    }

    /* renamed from: h */
    public EnumC1880d m8277h() {
        return this.f7395i;
    }

    /* renamed from: i */
    public C1881e m8278i() {
        return this.f7389c;
    }

    /* renamed from: j */
    public C1882f m8279j() {
        return this.f7390d;
    }

    /* renamed from: k */
    public Uri m8280k() {
        return this.f7387a;
    }

    /* renamed from: l */
    public boolean m8281l() {
        return this.f7397k && C1728f.m7089i(this.f7387a);
    }

    /* renamed from: m */
    public boolean m8282m() {
        return this.f7394h;
    }

    /* renamed from: n */
    public boolean m8283n() {
        return this.f7398l;
    }

    /* renamed from: o */
    public boolean m8284o() {
        return this.f7393g;
    }

    /* renamed from: p */
    protected void m8285p() {
        Uri uri = this.f7387a;
        if (uri == null) {
            throw new a("Source must be set!");
        }
        if (C1728f.m7088h(uri)) {
            if (!this.f7387a.isAbsolute()) {
                throw new a("Resource URI path must be absolute.");
            }
            if (this.f7387a.getPath().isEmpty()) {
                throw new a("Resource URI must not be empty");
            }
            try {
                Integer.parseInt(this.f7387a.getPath().substring(1));
            } catch (NumberFormatException unused) {
                throw new a("Resource URI path must be a resource id.");
            }
        }
        if (C1728f.m7083c(this.f7387a) && !this.f7387a.isAbsolute()) {
            throw new a("Asset URI path must be absolute.");
        }
    }
}
