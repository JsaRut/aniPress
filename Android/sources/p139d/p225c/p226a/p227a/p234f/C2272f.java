package p139d.p225c.p226a.p227a.p234f;

import java.io.EOFException;
import p139d.p225c.p226a.p227a.C2676s;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2337q;
import p139d.p225c.p226a.p227a.p270n.C2644u;

/* renamed from: d.c.a.a.f.f */
/* loaded from: classes.dex */
public final class C2272f implements InterfaceC2337q {
    @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2337q
    /* renamed from: a */
    public int mo9430a(InterfaceC2289h interfaceC2289h, int i, boolean z) {
        int mo9279b = interfaceC2289h.mo9279b(i);
        if (mo9279b != -1) {
            return mo9279b;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2337q
    /* renamed from: a */
    public void mo9431a(long j, int i, int i2, int i3, InterfaceC2337q.a aVar) {
    }

    @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2337q
    /* renamed from: a */
    public void mo9432a(C2644u c2644u, int i) {
        c2644u.m11224f(i);
    }

    @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2337q
    /* renamed from: a */
    public void mo9433a(C2676s c2676s) {
    }
}
