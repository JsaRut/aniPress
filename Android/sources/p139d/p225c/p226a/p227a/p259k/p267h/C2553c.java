package p139d.p225c.p226a.p227a.p259k.p267h;

import java.util.Collections;
import java.util.List;
import p139d.p225c.p226a.p227a.p259k.C2527b;
import p139d.p225c.p226a.p227a.p259k.InterfaceC2537e;
import p139d.p225c.p226a.p227a.p270n.C2628e;

/* renamed from: d.c.a.a.k.h.c */
/* loaded from: classes.dex */
final class C2553c implements InterfaceC2537e {

    /* renamed from: a */
    private final List<C2527b> f10565a;

    public C2553c(List<C2527b> list) {
        this.f10565a = Collections.unmodifiableList(list);
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
        return j >= 0 ? this.f10565a : Collections.emptyList();
    }
}
