package p139d.p225c.p226a.p227a.p250j;

import android.net.Uri;
import p139d.p225c.p226a.p227a.AbstractC2151P;
import p139d.p225c.p226a.p227a.C2676s;
import p139d.p225c.p226a.p227a.InterfaceC2517k;
import p139d.p225c.p226a.p227a.p250j.InterfaceC2515y;
import p139d.p225c.p226a.p227a.p269m.C2600n;
import p139d.p225c.p226a.p227a.p269m.C2606t;
import p139d.p225c.p226a.p227a.p269m.InterfaceC2586E;
import p139d.p225c.p226a.p227a.p269m.InterfaceC2590d;
import p139d.p225c.p226a.p227a.p269m.InterfaceC2597k;
import p139d.p225c.p226a.p227a.p269m.InterfaceC2610x;

/* renamed from: d.c.a.a.j.J */
/* loaded from: classes.dex */
public final class C2409J extends AbstractC2503m {

    /* renamed from: f */
    private final C2600n f9472f;

    /* renamed from: g */
    private final InterfaceC2597k.a f9473g;

    /* renamed from: h */
    private final C2676s f9474h;

    /* renamed from: i */
    private final long f9475i;

    /* renamed from: j */
    private final InterfaceC2610x f9476j;

    /* renamed from: k */
    private final boolean f9477k;

    /* renamed from: l */
    private final AbstractC2151P f9478l;

    /* renamed from: m */
    private final Object f9479m;

    /* renamed from: n */
    private InterfaceC2586E f9480n;

    @Deprecated
    public C2409J(Uri uri, InterfaceC2597k.a aVar, C2676s c2676s, long j) {
        this(uri, aVar, c2676s, j, 3);
    }

    @Deprecated
    public C2409J(Uri uri, InterfaceC2597k.a aVar, C2676s c2676s, long j, int i) {
        this(uri, aVar, c2676s, j, new C2606t(i), false, null);
    }

    private C2409J(Uri uri, InterfaceC2597k.a aVar, C2676s c2676s, long j, InterfaceC2610x interfaceC2610x, boolean z, Object obj) {
        this.f9473g = aVar;
        this.f9474h = c2676s;
        this.f9475i = j;
        this.f9476j = interfaceC2610x;
        this.f9477k = z;
        this.f9479m = obj;
        this.f9472f = new C2600n(uri, 3);
        this.f9478l = new C2406G(j, true, false, obj);
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2515y
    /* renamed from: a */
    public InterfaceC2514x mo9889a(InterfaceC2515y.a aVar, InterfaceC2590d interfaceC2590d) {
        return new C2408I(this.f9472f, this.f9473g, this.f9480n, this.f9474h, this.f9475i, this.f9476j, m10431a(aVar), this.f9477k);
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2515y
    /* renamed from: a */
    public void mo9891a() {
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2515y
    /* renamed from: a */
    public void mo9892a(InterfaceC2514x interfaceC2514x) {
        ((C2408I) interfaceC2514x).m9966a();
    }

    @Override // p139d.p225c.p226a.p227a.p250j.AbstractC2503m
    /* renamed from: a */
    public void mo9893a(InterfaceC2517k interfaceC2517k, boolean z, InterfaceC2586E interfaceC2586E) {
        this.f9480n = interfaceC2586E;
        m10434a(this.f9478l, (Object) null);
    }

    @Override // p139d.p225c.p226a.p227a.p250j.AbstractC2503m
    /* renamed from: b */
    public void mo9895b() {
    }
}
