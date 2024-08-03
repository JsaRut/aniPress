package p139d.p225c.p226a.p227a.p250j.p255d;

import android.net.Uri;
import android.os.Handler;
import java.util.List;
import p139d.p225c.p226a.p227a.C2200d;
import p139d.p225c.p226a.p227a.C2674q;
import p139d.p225c.p226a.p227a.InterfaceC2517k;
import p139d.p225c.p226a.p227a.p250j.AbstractC2503m;
import p139d.p225c.p226a.p227a.p250j.C2406G;
import p139d.p225c.p226a.p227a.p250j.C2509s;
import p139d.p225c.p226a.p227a.p250j.InterfaceC2508r;
import p139d.p225c.p226a.p227a.p250j.InterfaceC2514x;
import p139d.p225c.p226a.p227a.p250j.InterfaceC2515y;
import p139d.p225c.p226a.p227a.p250j.InterfaceC2516z;
import p139d.p225c.p226a.p227a.p250j.p255d.p256a.AbstractC2467f;
import p139d.p225c.p226a.p227a.p250j.p255d.p256a.C2464c;
import p139d.p225c.p226a.p227a.p250j.p255d.p256a.C2466e;
import p139d.p225c.p226a.p227a.p250j.p255d.p256a.C2468g;
import p139d.p225c.p226a.p227a.p250j.p255d.p256a.InterfaceC2470i;
import p139d.p225c.p226a.p227a.p269m.C2583B;
import p139d.p225c.p226a.p227a.p269m.C2606t;
import p139d.p225c.p226a.p227a.p269m.InterfaceC2586E;
import p139d.p225c.p226a.p227a.p269m.InterfaceC2590d;
import p139d.p225c.p226a.p227a.p269m.InterfaceC2597k;
import p139d.p225c.p226a.p227a.p269m.InterfaceC2610x;

/* renamed from: d.c.a.a.j.d.l */
/* loaded from: classes.dex */
public final class C2481l extends AbstractC2503m implements InterfaceC2470i.e {

    /* renamed from: f */
    private final InterfaceC2477h f9984f;

    /* renamed from: g */
    private final Uri f9985g;

    /* renamed from: h */
    private final InterfaceC2476g f9986h;

    /* renamed from: i */
    private final InterfaceC2508r f9987i;

    /* renamed from: j */
    private final InterfaceC2610x f9988j;

    /* renamed from: k */
    private final boolean f9989k;

    /* renamed from: l */
    private final InterfaceC2470i f9990l;

    /* renamed from: m */
    private final Object f9991m;

    /* renamed from: n */
    private InterfaceC2586E f9992n;

    static {
        C2674q.m11418a("goog.exo.hls");
    }

    @Deprecated
    public C2481l(Uri uri, InterfaceC2476g interfaceC2476g, InterfaceC2477h interfaceC2477h, int i, Handler handler, InterfaceC2516z interfaceC2516z, C2583B.a<AbstractC2467f> aVar) {
        this(uri, interfaceC2476g, interfaceC2477h, new C2509s(), new C2606t(i), new C2464c(interfaceC2476g, new C2606t(i), aVar), false, null);
        if (handler == null || interfaceC2516z == null) {
            return;
        }
        mo10433a(handler, interfaceC2516z);
    }

    private C2481l(Uri uri, InterfaceC2476g interfaceC2476g, InterfaceC2477h interfaceC2477h, InterfaceC2508r interfaceC2508r, InterfaceC2610x interfaceC2610x, InterfaceC2470i interfaceC2470i, boolean z, Object obj) {
        this.f9985g = uri;
        this.f9986h = interfaceC2476g;
        this.f9984f = interfaceC2477h;
        this.f9987i = interfaceC2508r;
        this.f9988j = interfaceC2610x;
        this.f9990l = interfaceC2470i;
        this.f9989k = z;
        this.f9991m = obj;
    }

    @Deprecated
    public C2481l(Uri uri, InterfaceC2597k.a aVar, int i, Handler handler, InterfaceC2516z interfaceC2516z) {
        this(uri, new C2473d(aVar), InterfaceC2477h.f9939a, i, handler, interfaceC2516z, new C2468g());
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2515y
    /* renamed from: a */
    public InterfaceC2514x mo9889a(InterfaceC2515y.a aVar, InterfaceC2590d interfaceC2590d) {
        return new C2480k(this.f9984f, this.f9990l, this.f9986h, this.f9992n, this.f9988j, m10431a(aVar), interfaceC2590d, this.f9987i, this.f9989k);
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2515y
    /* renamed from: a */
    public void mo9891a() {
        this.f9990l.mo10260d();
    }

    @Override // p139d.p225c.p226a.p227a.p250j.p255d.p256a.InterfaceC2470i.e
    /* renamed from: a */
    public void mo10299a(C2466e c2466e) {
        C2406G c2406g;
        long j;
        long m9048b = c2466e.f9848m ? C2200d.m9048b(c2466e.f9841f) : -9223372036854775807L;
        int i = c2466e.f9839d;
        long j2 = (i == 2 || i == 1) ? m9048b : -9223372036854775807L;
        long j3 = c2466e.f9840e;
        if (this.f9990l.mo10256b()) {
            long mo10250a = c2466e.f9841f - this.f9990l.mo10250a();
            long j4 = c2466e.f9847l ? mo10250a + c2466e.f9851p : -9223372036854775807L;
            List<C2466e.a> list = c2466e.f9850o;
            if (j3 == -9223372036854775807L) {
                j = list.isEmpty() ? 0L : list.get(Math.max(0, list.size() - 3)).f9857f;
            } else {
                j = j3;
            }
            c2406g = new C2406G(j2, m9048b, j4, c2466e.f9851p, mo10250a, j, true, !c2466e.f9847l, this.f9991m);
        } else {
            long j5 = j3 == -9223372036854775807L ? 0L : j3;
            long j6 = c2466e.f9851p;
            c2406g = new C2406G(j2, m9048b, j6, j6, 0L, j5, true, false, this.f9991m);
        }
        m10434a(c2406g, new C2478i(this.f9990l.mo10258c(), c2466e));
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2515y
    /* renamed from: a */
    public void mo9892a(InterfaceC2514x interfaceC2514x) {
        ((C2480k) interfaceC2514x).m10344h();
    }

    @Override // p139d.p225c.p226a.p227a.p250j.AbstractC2503m
    /* renamed from: a */
    public void mo9893a(InterfaceC2517k interfaceC2517k, boolean z, InterfaceC2586E interfaceC2586E) {
        this.f9992n = interfaceC2586E;
        this.f9990l.mo10252a(this.f9985g, m10431a((InterfaceC2515y.a) null), this);
    }

    @Override // p139d.p225c.p226a.p227a.p250j.AbstractC2503m
    /* renamed from: b */
    public void mo9895b() {
        this.f9990l.stop();
    }
}
