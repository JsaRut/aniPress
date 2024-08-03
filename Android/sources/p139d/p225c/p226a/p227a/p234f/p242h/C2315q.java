package p139d.p225c.p226a.p227a.p234f.p242h;

import p139d.p225c.p226a.p227a.C2676s;
import p139d.p225c.p226a.p227a.p231d.C2213m;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2325i;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2337q;
import p139d.p225c.p226a.p227a.p234f.p242h.InterfaceC2296G;
import p139d.p225c.p226a.p227a.p270n.C2638o;
import p139d.p225c.p226a.p227a.p270n.C2644u;

/* renamed from: d.c.a.a.f.h.q */
/* loaded from: classes.dex */
public final class C2315q implements InterfaceC2310l {

    /* renamed from: a */
    private final C2644u f9045a = new C2644u(10);

    /* renamed from: b */
    private InterfaceC2337q f9046b;

    /* renamed from: c */
    private boolean f9047c;

    /* renamed from: d */
    private long f9048d;

    /* renamed from: e */
    private int f9049e;

    /* renamed from: f */
    private int f9050f;

    @Override // p139d.p225c.p226a.p227a.p234f.p242h.InterfaceC2310l
    /* renamed from: a */
    public void mo9560a() {
        this.f9047c = false;
    }

    @Override // p139d.p225c.p226a.p227a.p234f.p242h.InterfaceC2310l
    /* renamed from: a */
    public void mo9561a(long j, int i) {
        if ((i & 4) == 0) {
            return;
        }
        this.f9047c = true;
        this.f9048d = j;
        this.f9049e = 0;
        this.f9050f = 0;
    }

    @Override // p139d.p225c.p226a.p227a.p234f.p242h.InterfaceC2310l
    /* renamed from: a */
    public void mo9562a(InterfaceC2325i interfaceC2325i, InterfaceC2296G.d dVar) {
        dVar.m9548a();
        this.f9046b = interfaceC2325i.mo9671a(dVar.m9550c(), 4);
        this.f9046b.mo9433a(C2676s.m11430a(dVar.m9549b(), "application/id3", (String) null, -1, (C2213m) null));
    }

    @Override // p139d.p225c.p226a.p227a.p234f.p242h.InterfaceC2310l
    /* renamed from: a */
    public void mo9563a(C2644u c2644u) {
        if (this.f9047c) {
            int m11208a = c2644u.m11208a();
            int i = this.f9050f;
            if (i < 10) {
                int min = Math.min(m11208a, 10 - i);
                System.arraycopy(c2644u.f11004a, c2644u.m11217c(), this.f9045a.f11004a, this.f9050f, min);
                if (this.f9050f + min == 10) {
                    this.f9045a.m11222e(0);
                    if (73 != this.f9045a.m11238t() || 68 != this.f9045a.m11238t() || 51 != this.f9045a.m11238t()) {
                        C2638o.m11160d("Id3Reader", "Discarding invalid ID3 tag");
                        this.f9047c = false;
                        return;
                    } else {
                        this.f9045a.m11224f(3);
                        this.f9049e = this.f9045a.m11237s() + 10;
                    }
                }
            }
            int min2 = Math.min(m11208a, this.f9049e - this.f9050f);
            this.f9046b.mo9432a(c2644u, min2);
            this.f9050f += min2;
        }
    }

    @Override // p139d.p225c.p226a.p227a.p234f.p242h.InterfaceC2310l
    /* renamed from: b */
    public void mo9564b() {
        int i;
        if (this.f9047c && (i = this.f9049e) != 0 && this.f9050f == i) {
            this.f9046b.mo9431a(this.f9048d, 1, i, 0, null);
            this.f9047c = false;
        }
    }
}
