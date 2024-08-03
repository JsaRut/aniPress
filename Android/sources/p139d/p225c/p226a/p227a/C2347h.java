package p139d.p225c.p226a.p227a;

import p139d.p225c.p226a.p227a.p270n.C2615B;
import p139d.p225c.p226a.p227a.p270n.InterfaceC2629f;
import p139d.p225c.p226a.p227a.p270n.InterfaceC2640q;

/* renamed from: d.c.a.a.h */
/* loaded from: classes.dex */
final class C2347h implements InterfaceC2640q {

    /* renamed from: a */
    private final C2615B f9266a;

    /* renamed from: b */
    private final a f9267b;

    /* renamed from: c */
    private InterfaceC2143H f9268c;

    /* renamed from: d */
    private InterfaceC2640q f9269d;

    /* renamed from: d.c.a.a.h$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        void mo9805a(C2137B c2137b);
    }

    public C2347h(a aVar, InterfaceC2629f interfaceC2629f) {
        this.f9267b = aVar;
        this.f9266a = new C2615B(interfaceC2629f);
    }

    /* renamed from: f */
    private void m9797f() {
        this.f9266a.m10996a(this.f9269d.mo8773a());
        C2137B mo8788b = this.f9269d.mo8788b();
        if (mo8788b.equals(this.f9266a.mo8788b())) {
            return;
        }
        this.f9266a.mo8775a(mo8788b);
        this.f9267b.mo9805a(mo8788b);
    }

    /* renamed from: g */
    private boolean m9798g() {
        InterfaceC2143H interfaceC2143H = this.f9268c;
        return (interfaceC2143H == null || interfaceC2143H.mo8566d() || (!this.f9268c.mo8565c() && this.f9268c.mo8569g())) ? false : true;
    }

    @Override // p139d.p225c.p226a.p227a.p270n.InterfaceC2640q
    /* renamed from: a */
    public long mo8773a() {
        return m9798g() ? this.f9269d.mo8773a() : this.f9266a.mo8773a();
    }

    @Override // p139d.p225c.p226a.p227a.p270n.InterfaceC2640q
    /* renamed from: a */
    public C2137B mo8775a(C2137B c2137b) {
        InterfaceC2640q interfaceC2640q = this.f9269d;
        if (interfaceC2640q != null) {
            c2137b = interfaceC2640q.mo8775a(c2137b);
        }
        this.f9266a.mo8775a(c2137b);
        this.f9267b.mo9805a(c2137b);
        return c2137b;
    }

    /* renamed from: a */
    public void m9799a(long j) {
        this.f9266a.m10996a(j);
    }

    /* renamed from: a */
    public void m9800a(InterfaceC2143H interfaceC2143H) {
        if (interfaceC2143H == this.f9268c) {
            this.f9269d = null;
            this.f9268c = null;
        }
    }

    @Override // p139d.p225c.p226a.p227a.p270n.InterfaceC2640q
    /* renamed from: b */
    public C2137B mo8788b() {
        InterfaceC2640q interfaceC2640q = this.f9269d;
        return interfaceC2640q != null ? interfaceC2640q.mo8788b() : this.f9266a.mo8788b();
    }

    /* renamed from: b */
    public void m9801b(InterfaceC2143H interfaceC2143H) {
        InterfaceC2640q interfaceC2640q;
        InterfaceC2640q mo8575m = interfaceC2143H.mo8575m();
        if (mo8575m == null || mo8575m == (interfaceC2640q = this.f9269d)) {
            return;
        }
        if (interfaceC2640q != null) {
            throw C2399j.m9871a(new IllegalStateException("Multiple renderer media clocks enabled."));
        }
        this.f9269d = mo8575m;
        this.f9268c = interfaceC2143H;
        this.f9269d.mo8775a(this.f9266a.mo8788b());
        m9797f();
    }

    /* renamed from: c */
    public void m9802c() {
        this.f9266a.m10997c();
    }

    /* renamed from: d */
    public void m9803d() {
        this.f9266a.m10998d();
    }

    /* renamed from: e */
    public long m9804e() {
        if (!m9798g()) {
            return this.f9266a.mo8773a();
        }
        m9797f();
        return this.f9269d.mo8773a();
    }
}
