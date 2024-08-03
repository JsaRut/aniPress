package p139d.p225c.p226a.p227a.p259k.p260a;

import java.util.Collections;
import java.util.List;
import p139d.p225c.p226a.p227a.p259k.C2527b;
import p139d.p225c.p226a.p227a.p259k.InterfaceC2537e;
import p139d.p225c.p226a.p227a.p270n.C2628e;

/* renamed from: d.c.a.a.k.a.g */
/* loaded from: classes.dex */
final class C2525g implements InterfaceC2537e {

    /* renamed from: a */
    private final List<C2527b> f10387a;

    public C2525g(List<C2527b> list) {
        this.f10387a = list;
    }

    @Override // p139d.p225c.p226a.p227a.p259k.InterfaceC2537e
    /* renamed from: a */
    public int mo10603a() {
        return 1;
    }

    @Override // p139d.p225c.p226a.p227a.p259k.InterfaceC2537e
    /* renamed from: a */
    public int mo10604a(long j) {
        return j < 0 ? 0 : -1;
    }

    @Override // p139d.p225c.p226a.p227a.p259k.InterfaceC2537e
    /* renamed from: a */
    public long mo10605a(int i) {
        C2628e.m11111a(i == 0);
        return 0L;
    }

    @Override // p139d.p225c.p226a.p227a.p259k.InterfaceC2537e
    /* renamed from: b */
    public List<C2527b> mo10606b(long j) {
        return j >= 0 ? this.f10387a : Collections.emptyList();
    }
}
