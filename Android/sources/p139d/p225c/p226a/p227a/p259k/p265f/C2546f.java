package p139d.p225c.p226a.p227a.p259k.p265f;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import p139d.p225c.p226a.p227a.p259k.C2527b;
import p139d.p225c.p226a.p227a.p259k.InterfaceC2537e;
import p139d.p225c.p226a.p227a.p270n.C2622I;

/* renamed from: d.c.a.a.k.f.f */
/* loaded from: classes.dex */
final class C2546f implements InterfaceC2537e {

    /* renamed from: a */
    private final C2542b f10541a;

    /* renamed from: b */
    private final long[] f10542b;

    /* renamed from: c */
    private final Map<String, C2545e> f10543c;

    /* renamed from: d */
    private final Map<String, C2543c> f10544d;

    /* renamed from: e */
    private final Map<String, String> f10545e;

    public C2546f(C2542b c2542b, Map<String, C2545e> map, Map<String, C2543c> map2, Map<String, String> map3) {
        this.f10541a = c2542b;
        this.f10544d = map2;
        this.f10545e = map3;
        this.f10543c = map != null ? Collections.unmodifiableMap(map) : Collections.emptyMap();
        this.f10542b = c2542b.m10678b();
    }

    @Override // p139d.p225c.p226a.p227a.p259k.InterfaceC2537e
    /* renamed from: a */
    public int mo10603a() {
        return this.f10542b.length;
    }

    @Override // p139d.p225c.p226a.p227a.p259k.InterfaceC2537e
    /* renamed from: a */
    public int mo10604a(long j) {
        int m11042a = C2622I.m11042a(this.f10542b, j, false, false);
        if (m11042a < this.f10542b.length) {
            return m11042a;
        }
        return -1;
    }

    @Override // p139d.p225c.p226a.p227a.p259k.InterfaceC2537e
    /* renamed from: a */
    public long mo10605a(int i) {
        return this.f10542b[i];
    }

    @Override // p139d.p225c.p226a.p227a.p259k.InterfaceC2537e
    /* renamed from: b */
    public List<C2527b> mo10606b(long j) {
        return this.f10541a.m10675a(j, this.f10543c, this.f10544d, this.f10545e);
    }
}
