package p139d.p225c.p226a.p227a.p259k.p266g;

import java.util.Collections;
import java.util.List;
import p139d.p225c.p226a.p227a.p259k.C2527b;
import p139d.p225c.p226a.p227a.p259k.InterfaceC2537e;
import p139d.p225c.p226a.p227a.p270n.C2628e;

/* renamed from: d.c.a.a.k.g.b */
/* loaded from: classes.dex */
final class C2549b implements InterfaceC2537e {

    /* renamed from: a */
    public static final C2549b f10555a = new C2549b();

    /* renamed from: b */
    private final List<C2527b> f10556b;

    private C2549b() {
        this.f10556b = Collections.emptyList();
    }

    public C2549b(C2527b c2527b) {
        this.f10556b = Collections.singletonList(c2527b);
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
        return j >= 0 ? this.f10556b : Collections.emptyList();
    }
}
