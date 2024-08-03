package p139d.p225c.p226a.p227a.p234f.p240f;

import java.io.EOFException;
import p139d.p225c.p226a.p227a.C2683z;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2289h;
import p139d.p225c.p226a.p227a.p270n.C2622I;
import p139d.p225c.p226a.p227a.p270n.C2644u;

/* renamed from: d.c.a.a.f.f.g */
/* loaded from: classes.dex */
final class C2279g {

    /* renamed from: a */
    private static final int f8729a = C2622I.m11078b("OggS");

    /* renamed from: b */
    public int f8730b;

    /* renamed from: c */
    public int f8731c;

    /* renamed from: d */
    public long f8732d;

    /* renamed from: e */
    public long f8733e;

    /* renamed from: f */
    public long f8734f;

    /* renamed from: g */
    public long f8735g;

    /* renamed from: h */
    public int f8736h;

    /* renamed from: i */
    public int f8737i;

    /* renamed from: j */
    public int f8738j;

    /* renamed from: k */
    public final int[] f8739k = new int[255];

    /* renamed from: l */
    private final C2644u f8740l = new C2644u(255);

    /* renamed from: a */
    public void m9466a() {
        this.f8730b = 0;
        this.f8731c = 0;
        this.f8732d = 0L;
        this.f8733e = 0L;
        this.f8734f = 0L;
        this.f8735g = 0L;
        this.f8736h = 0;
        this.f8737i = 0;
        this.f8738j = 0;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: a */
    public boolean m9467a(InterfaceC2289h interfaceC2289h, boolean z) {
        this.f8740l.m11207B();
        m9466a();
        if (!(interfaceC2289h.getLength() == -1 || interfaceC2289h.getLength() - interfaceC2289h.mo9274a() >= 27) || !interfaceC2289h.mo9282b(this.f8740l.f11004a, 0, 27, true)) {
            if (z) {
                return false;
            }
            throw new EOFException();
        }
        if (this.f8740l.m11240v() != f8729a) {
            if (z) {
                return false;
            }
            throw new C2683z("expected OggS capture pattern at begin of page");
        }
        this.f8730b = this.f8740l.m11238t();
        if (this.f8730b != 0) {
            if (z) {
                return false;
            }
            throw new C2683z("unsupported bit stream revision");
        }
        this.f8731c = this.f8740l.m11238t();
        this.f8732d = this.f8740l.m11230l();
        this.f8733e = this.f8740l.m11231m();
        this.f8734f = this.f8740l.m11231m();
        this.f8735g = this.f8740l.m11231m();
        this.f8736h = this.f8740l.m11238t();
        this.f8737i = this.f8736h + 27;
        this.f8740l.m11207B();
        interfaceC2289h.mo9276a(this.f8740l.f11004a, 0, this.f8736h);
        for (int i = 0; i < this.f8736h; i++) {
            this.f8739k[i] = this.f8740l.m11238t();
            this.f8738j += this.f8739k[i];
        }
        return true;
    }
}
