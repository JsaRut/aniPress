package p139d.p225c.p226a.p227a.p234f.p242h;

import java.util.Collections;
import java.util.List;
import p139d.p225c.p226a.p227a.C2676s;
import p139d.p225c.p226a.p227a.p231d.C2213m;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2325i;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2337q;
import p139d.p225c.p226a.p227a.p234f.p242h.InterfaceC2296G;
import p139d.p225c.p226a.p227a.p270n.C2644u;

/* renamed from: d.c.a.a.f.h.k */
/* loaded from: classes.dex */
public final class C2309k implements InterfaceC2310l {

    /* renamed from: a */
    private final List<InterfaceC2296G.a> f8941a;

    /* renamed from: b */
    private final InterfaceC2337q[] f8942b;

    /* renamed from: c */
    private boolean f8943c;

    /* renamed from: d */
    private int f8944d;

    /* renamed from: e */
    private int f8945e;

    /* renamed from: f */
    private long f8946f;

    public C2309k(List<InterfaceC2296G.a> list) {
        this.f8941a = list;
        this.f8942b = new InterfaceC2337q[list.size()];
    }

    /* renamed from: a */
    private boolean m9595a(C2644u c2644u, int i) {
        if (c2644u.m11208a() == 0) {
            return false;
        }
        if (c2644u.m11238t() != i) {
            this.f8943c = false;
        }
        this.f8944d--;
        return this.f8943c;
    }

    @Override // p139d.p225c.p226a.p227a.p234f.p242h.InterfaceC2310l
    /* renamed from: a */
    public void mo9560a() {
        this.f8943c = false;
    }

    @Override // p139d.p225c.p226a.p227a.p234f.p242h.InterfaceC2310l
    /* renamed from: a */
    public void mo9561a(long j, int i) {
        if ((i & 4) == 0) {
            return;
        }
        this.f8943c = true;
        this.f8946f = j;
        this.f8945e = 0;
        this.f8944d = 2;
    }

    @Override // p139d.p225c.p226a.p227a.p234f.p242h.InterfaceC2310l
    /* renamed from: a */
    public void mo9562a(InterfaceC2325i interfaceC2325i, InterfaceC2296G.d dVar) {
        for (int i = 0; i < this.f8942b.length; i++) {
            InterfaceC2296G.a aVar = this.f8941a.get(i);
            dVar.m9548a();
            InterfaceC2337q mo9671a = interfaceC2325i.mo9671a(dVar.m9550c(), 3);
            mo9671a.mo9433a(C2676s.m11429a(dVar.m9549b(), "application/dvbsubs", (String) null, -1, 0, (List<byte[]>) Collections.singletonList(aVar.f8857c), aVar.f8855a, (C2213m) null));
            this.f8942b[i] = mo9671a;
        }
    }

    @Override // p139d.p225c.p226a.p227a.p234f.p242h.InterfaceC2310l
    /* renamed from: a */
    public void mo9563a(C2644u c2644u) {
        if (this.f8943c) {
            if (this.f8944d != 2 || m9595a(c2644u, 32)) {
                if (this.f8944d != 1 || m9595a(c2644u, 0)) {
                    int m11217c = c2644u.m11217c();
                    int m11208a = c2644u.m11208a();
                    for (InterfaceC2337q interfaceC2337q : this.f8942b) {
                        c2644u.m11222e(m11217c);
                        interfaceC2337q.mo9432a(c2644u, m11208a);
                    }
                    this.f8945e += m11208a;
                }
            }
        }
    }

    @Override // p139d.p225c.p226a.p227a.p234f.p242h.InterfaceC2310l
    /* renamed from: b */
    public void mo9564b() {
        if (this.f8943c) {
            for (InterfaceC2337q interfaceC2337q : this.f8942b) {
                interfaceC2337q.mo9431a(this.f8946f, 1, this.f8945e, 0, null);
            }
            this.f8943c = false;
        }
    }
}
