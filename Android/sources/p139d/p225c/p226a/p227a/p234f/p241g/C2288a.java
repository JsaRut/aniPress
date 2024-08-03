package p139d.p225c.p226a.p227a.p234f.p241g;

import java.io.IOException;
import p139d.p225c.p226a.p227a.C2676s;
import p139d.p225c.p226a.p227a.C2683z;
import p139d.p225c.p226a.p227a.p234f.C2334n;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2287g;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2289h;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2325i;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2335o;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2337q;
import p139d.p225c.p226a.p227a.p270n.C2622I;
import p139d.p225c.p226a.p227a.p270n.C2644u;

/* renamed from: d.c.a.a.f.g.a */
/* loaded from: classes.dex */
public final class C2288a implements InterfaceC2287g {

    /* renamed from: a */
    private static final int f8795a = C2622I.m11078b("RCC\u0001");

    /* renamed from: b */
    private final C2676s f8796b;

    /* renamed from: d */
    private InterfaceC2337q f8798d;

    /* renamed from: f */
    private int f8800f;

    /* renamed from: g */
    private long f8801g;

    /* renamed from: h */
    private int f8802h;

    /* renamed from: i */
    private int f8803i;

    /* renamed from: c */
    private final C2644u f8797c = new C2644u(9);

    /* renamed from: e */
    private int f8799e = 0;

    public C2288a(C2676s c2676s) {
        this.f8796b = c2676s;
    }

    /* renamed from: b */
    private boolean m9500b(InterfaceC2289h interfaceC2289h) {
        this.f8797c.m11207B();
        if (!interfaceC2289h.mo9278a(this.f8797c.f11004a, 0, 8, true)) {
            return false;
        }
        if (this.f8797c.m11226h() != f8795a) {
            throw new IOException("Input not RawCC");
        }
        this.f8800f = this.f8797c.m11238t();
        return true;
    }

    /* renamed from: c */
    private void m9501c(InterfaceC2289h interfaceC2289h) {
        while (this.f8802h > 0) {
            this.f8797c.m11207B();
            interfaceC2289h.readFully(this.f8797c.f11004a, 0, 3);
            this.f8798d.mo9432a(this.f8797c, 3);
            this.f8803i += 3;
            this.f8802h--;
        }
        int i = this.f8803i;
        if (i > 0) {
            this.f8798d.mo9431a(this.f8801g, 1, i, 0, null);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: d */
    private boolean m9502d(InterfaceC2289h interfaceC2289h) {
        long m11234p;
        this.f8797c.m11207B();
        int i = this.f8800f;
        if (i == 0) {
            if (!interfaceC2289h.mo9278a(this.f8797c.f11004a, 0, 5, true)) {
                return false;
            }
            m11234p = (this.f8797c.m11240v() * 1000) / 45;
        } else {
            if (i != 1) {
                throw new C2683z("Unsupported version number: " + this.f8800f);
            }
            if (!interfaceC2289h.mo9278a(this.f8797c.f11004a, 0, 9, true)) {
                return false;
            }
            m11234p = this.f8797c.m11234p();
        }
        this.f8801g = m11234p;
        this.f8802h = this.f8797c.m11238t();
        this.f8803i = 0;
        return true;
    }

    @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2287g
    /* renamed from: a */
    public int mo9157a(InterfaceC2289h interfaceC2289h, C2334n c2334n) {
        while (true) {
            int i = this.f8799e;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException();
                    }
                    m9501c(interfaceC2289h);
                    this.f8799e = 1;
                    return 0;
                }
                if (!m9502d(interfaceC2289h)) {
                    this.f8799e = 0;
                    return -1;
                }
                this.f8799e = 2;
            } else {
                if (!m9500b(interfaceC2289h)) {
                    return -1;
                }
                this.f8799e = 1;
            }
        }
    }

    @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2287g
    /* renamed from: a */
    public void mo9158a() {
    }

    @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2287g
    /* renamed from: a */
    public void mo9159a(long j, long j2) {
        this.f8799e = 0;
    }

    @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2287g
    /* renamed from: a */
    public void mo9160a(InterfaceC2325i interfaceC2325i) {
        interfaceC2325i.mo9673a(new InterfaceC2335o.b(-9223372036854775807L));
        this.f8798d = interfaceC2325i.mo9671a(0, 3);
        interfaceC2325i.mo9672a();
        this.f8798d.mo9433a(this.f8796b);
    }

    @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2287g
    /* renamed from: a */
    public boolean mo9161a(InterfaceC2289h interfaceC2289h) {
        this.f8797c.m11207B();
        interfaceC2289h.mo9276a(this.f8797c.f11004a, 0, 8);
        return this.f8797c.m11226h() == f8795a;
    }
}
