package p139d.p225c.p226a.p227a.p270n;

import p139d.p225c.p226a.p227a.C2137B;
import p139d.p225c.p226a.p227a.C2200d;

/* renamed from: d.c.a.a.n.B */
/* loaded from: classes.dex */
public final class C2615B implements InterfaceC2640q {

    /* renamed from: a */
    private final InterfaceC2629f f10903a;

    /* renamed from: b */
    private boolean f10904b;

    /* renamed from: c */
    private long f10905c;

    /* renamed from: d */
    private long f10906d;

    /* renamed from: e */
    private C2137B f10907e = C2137B.f7641a;

    public C2615B(InterfaceC2629f interfaceC2629f) {
        this.f10903a = interfaceC2629f;
    }

    @Override // p139d.p225c.p226a.p227a.p270n.InterfaceC2640q
    /* renamed from: a */
    public long mo8773a() {
        long j = this.f10905c;
        if (!this.f10904b) {
            return j;
        }
        long mo11001b = this.f10903a.mo11001b() - this.f10906d;
        C2137B c2137b = this.f10907e;
        return j + (c2137b.f7642b == 1.0f ? C2200d.m9047a(mo11001b) : c2137b.m8509a(mo11001b));
    }

    @Override // p139d.p225c.p226a.p227a.p270n.InterfaceC2640q
    /* renamed from: a */
    public C2137B mo8775a(C2137B c2137b) {
        if (this.f10904b) {
            m10996a(mo8773a());
        }
        this.f10907e = c2137b;
        return c2137b;
    }

    /* renamed from: a */
    public void m10996a(long j) {
        this.f10905c = j;
        if (this.f10904b) {
            this.f10906d = this.f10903a.mo11001b();
        }
    }

    @Override // p139d.p225c.p226a.p227a.p270n.InterfaceC2640q
    /* renamed from: b */
    public C2137B mo8788b() {
        return this.f10907e;
    }

    /* renamed from: c */
    public void m10997c() {
        if (this.f10904b) {
            return;
        }
        this.f10906d = this.f10903a.mo11001b();
        this.f10904b = true;
    }

    /* renamed from: d */
    public void m10998d() {
        if (this.f10904b) {
            m10996a(mo8773a());
            this.f10904b = false;
        }
    }
}
