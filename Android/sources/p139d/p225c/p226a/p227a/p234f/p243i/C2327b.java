package p139d.p225c.p226a.p227a.p234f.p243i;

import java.util.List;
import p139d.p225c.p226a.p227a.C2676s;
import p139d.p225c.p226a.p227a.C2683z;
import p139d.p225c.p226a.p227a.p231d.C2213m;
import p139d.p225c.p226a.p227a.p234f.C2334n;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2287g;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2289h;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2325i;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2330j;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2337q;
import p139d.p225c.p226a.p227a.p270n.C2628e;

/* renamed from: d.c.a.a.f.i.b */
/* loaded from: classes.dex */
public final class C2327b implements InterfaceC2287g {

    /* renamed from: a */
    public static final InterfaceC2330j f9131a = new InterfaceC2330j() { // from class: d.c.a.a.f.i.a
        @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2330j
        /* renamed from: a */
        public final InterfaceC2287g[] mo9142a() {
            return C2327b.m9674b();
        }
    };

    /* renamed from: b */
    private InterfaceC2325i f9132b;

    /* renamed from: c */
    private InterfaceC2337q f9133c;

    /* renamed from: d */
    private C2328c f9134d;

    /* renamed from: e */
    private int f9135e;

    /* renamed from: f */
    private int f9136f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static /* synthetic */ InterfaceC2287g[] m9674b() {
        return new InterfaceC2287g[]{new C2327b()};
    }

    @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2287g
    /* renamed from: a */
    public int mo9157a(InterfaceC2289h interfaceC2289h, C2334n c2334n) {
        if (this.f9134d == null) {
            this.f9134d = C2329d.m9684a(interfaceC2289h);
            C2328c c2328c = this.f9134d;
            if (c2328c == null) {
                throw new C2683z("Unsupported or unrecognized wav header.");
            }
            this.f9133c.mo9433a(C2676s.m11425a((String) null, "audio/raw", (String) null, c2328c.m9675a(), 32768, this.f9134d.m9681h(), this.f9134d.m9682i(), this.f9134d.m9680g(), (List<byte[]>) null, (C2213m) null, 0, (String) null));
            this.f9135e = this.f9134d.m9678e();
        }
        if (!this.f9134d.m9683j()) {
            C2329d.m9685a(interfaceC2289h, this.f9134d);
            this.f9132b.mo9673a(this.f9134d);
        }
        long m9679f = this.f9134d.m9679f();
        C2628e.m11113b(m9679f != -1);
        long position = m9679f - interfaceC2289h.getPosition();
        if (position <= 0) {
            return -1;
        }
        int mo9430a = this.f9133c.mo9430a(interfaceC2289h, (int) Math.min(32768 - this.f9136f, position), true);
        if (mo9430a != -1) {
            this.f9136f += mo9430a;
        }
        int i = this.f9136f / this.f9135e;
        if (i > 0) {
            long m9676a = this.f9134d.m9676a(interfaceC2289h.getPosition() - this.f9136f);
            int i2 = i * this.f9135e;
            this.f9136f -= i2;
            this.f9133c.mo9431a(m9676a, 1, i2, this.f9136f, null);
        }
        return mo9430a == -1 ? -1 : 0;
    }

    @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2287g
    /* renamed from: a */
    public void mo9158a() {
    }

    @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2287g
    /* renamed from: a */
    public void mo9159a(long j, long j2) {
        this.f9136f = 0;
    }

    @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2287g
    /* renamed from: a */
    public void mo9160a(InterfaceC2325i interfaceC2325i) {
        this.f9132b = interfaceC2325i;
        this.f9133c = interfaceC2325i.mo9671a(0, 1);
        this.f9134d = null;
        interfaceC2325i.mo9672a();
    }

    @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2287g
    /* renamed from: a */
    public boolean mo9161a(InterfaceC2289h interfaceC2289h) {
        return C2329d.m9684a(interfaceC2289h) != null;
    }
}
