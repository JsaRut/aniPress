package p139d.p225c.p226a.p227a.p232e.p233a;

import okhttp3.CacheControl;
import okhttp3.Call;
import p139d.p225c.p226a.p227a.p269m.InterfaceC2586E;
import p139d.p225c.p226a.p227a.p269m.InterfaceC2609w;

/* renamed from: d.c.a.a.e.a.b */
/* loaded from: classes.dex */
public final class C2225b extends InterfaceC2609w.a {

    /* renamed from: b */
    private final Call.Factory f8134b;

    /* renamed from: c */
    private final String f8135c;

    /* renamed from: d */
    private final InterfaceC2586E f8136d;

    /* renamed from: e */
    private final CacheControl f8137e;

    public C2225b(Call.Factory factory, String str, InterfaceC2586E interfaceC2586E) {
        this(factory, str, interfaceC2586E, null);
    }

    public C2225b(Call.Factory factory, String str, InterfaceC2586E interfaceC2586E, CacheControl cacheControl) {
        this.f8134b = factory;
        this.f8135c = str;
        this.f8136d = interfaceC2586E;
        this.f8137e = cacheControl;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p139d.p225c.p226a.p227a.p269m.InterfaceC2609w.a
    /* renamed from: a */
    public C2224a mo9123a(InterfaceC2609w.f fVar) {
        C2224a c2224a = new C2224a(this.f8134b, this.f8135c, null, this.f8137e, fVar);
        InterfaceC2586E interfaceC2586E = this.f8136d;
        if (interfaceC2586E != null) {
            c2224a.mo10300a(interfaceC2586E);
        }
        return c2224a;
    }
}
