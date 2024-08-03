package p139d.p225c.p226a.p227a.p250j.p257e;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import java.io.IOException;
import java.util.ArrayList;
import p139d.p225c.p226a.p227a.C2200d;
import p139d.p225c.p226a.p227a.C2674q;
import p139d.p225c.p226a.p227a.C2683z;
import p139d.p225c.p226a.p227a.InterfaceC2517k;
import p139d.p225c.p226a.p227a.p250j.AbstractC2503m;
import p139d.p225c.p226a.p227a.p250j.C2406G;
import p139d.p225c.p226a.p227a.p250j.C2509s;
import p139d.p225c.p226a.p227a.p250j.InterfaceC2508r;
import p139d.p225c.p226a.p227a.p250j.InterfaceC2514x;
import p139d.p225c.p226a.p227a.p250j.InterfaceC2515y;
import p139d.p225c.p226a.p227a.p250j.InterfaceC2516z;
import p139d.p225c.p226a.p227a.p250j.p257e.InterfaceC2493c;
import p139d.p225c.p226a.p227a.p250j.p257e.p258a.C2489a;
import p139d.p225c.p226a.p227a.p250j.p257e.p258a.C2490b;
import p139d.p225c.p226a.p227a.p250j.p257e.p258a.C2491c;
import p139d.p225c.p226a.p227a.p269m.C2583B;
import p139d.p225c.p226a.p227a.p269m.C2606t;
import p139d.p225c.p226a.p227a.p269m.C2612z;
import p139d.p225c.p226a.p227a.p269m.InterfaceC2582A;
import p139d.p225c.p226a.p227a.p269m.InterfaceC2586E;
import p139d.p225c.p226a.p227a.p269m.InterfaceC2590d;
import p139d.p225c.p226a.p227a.p269m.InterfaceC2597k;
import p139d.p225c.p226a.p227a.p269m.InterfaceC2610x;
import p139d.p225c.p226a.p227a.p270n.C2628e;

/* renamed from: d.c.a.a.j.e.e */
/* loaded from: classes.dex */
public final class C2495e extends AbstractC2503m implements C2612z.a<C2583B<C2489a>> {

    /* renamed from: f */
    private final boolean f10137f;

    /* renamed from: g */
    private final Uri f10138g;

    /* renamed from: h */
    private final InterfaceC2597k.a f10139h;

    /* renamed from: i */
    private final InterfaceC2493c.a f10140i;

    /* renamed from: j */
    private final InterfaceC2508r f10141j;

    /* renamed from: k */
    private final InterfaceC2610x f10142k;

    /* renamed from: l */
    private final long f10143l;

    /* renamed from: m */
    private final InterfaceC2516z.a f10144m;

    /* renamed from: n */
    private final C2583B.a<? extends C2489a> f10145n;

    /* renamed from: o */
    private final ArrayList<C2494d> f10146o;

    /* renamed from: p */
    private final Object f10147p;

    /* renamed from: q */
    private InterfaceC2597k f10148q;

    /* renamed from: r */
    private C2612z f10149r;

    /* renamed from: s */
    private InterfaceC2582A f10150s;

    /* renamed from: t */
    private InterfaceC2586E f10151t;

    /* renamed from: u */
    private long f10152u;

    /* renamed from: v */
    private C2489a f10153v;

    /* renamed from: w */
    private Handler f10154w;

    static {
        C2674q.m11418a("goog.exo.smoothstreaming");
    }

    @Deprecated
    public C2495e(Uri uri, InterfaceC2597k.a aVar, InterfaceC2493c.a aVar2, int i, long j, Handler handler, InterfaceC2516z interfaceC2516z) {
        this(uri, aVar, new C2490b(), aVar2, i, j, handler, interfaceC2516z);
    }

    @Deprecated
    public C2495e(Uri uri, InterfaceC2597k.a aVar, C2583B.a<? extends C2489a> aVar2, InterfaceC2493c.a aVar3, int i, long j, Handler handler, InterfaceC2516z interfaceC2516z) {
        this(null, uri, aVar, aVar2, aVar3, new C2509s(), new C2606t(i), j, null);
        if (handler == null || interfaceC2516z == null) {
            return;
        }
        mo10433a(handler, interfaceC2516z);
    }

    private C2495e(C2489a c2489a, Uri uri, InterfaceC2597k.a aVar, C2583B.a<? extends C2489a> aVar2, InterfaceC2493c.a aVar3, InterfaceC2508r interfaceC2508r, InterfaceC2610x interfaceC2610x, long j, Object obj) {
        C2628e.m11113b(c2489a == null || !c2489a.f10057d);
        this.f10153v = c2489a;
        this.f10138g = uri == null ? null : C2491c.m10414a(uri);
        this.f10139h = aVar;
        this.f10145n = aVar2;
        this.f10140i = aVar3;
        this.f10141j = interfaceC2508r;
        this.f10142k = interfaceC2610x;
        this.f10143l = j;
        this.f10144m = m10431a((InterfaceC2515y.a) null);
        this.f10147p = obj;
        this.f10137f = c2489a != null;
        this.f10146o = new ArrayList<>();
    }

    /* renamed from: c */
    private void m10427c() {
        C2406G c2406g;
        for (int i = 0; i < this.f10146o.size(); i++) {
            this.f10146o.get(i).m10424a(this.f10153v);
        }
        long j = Long.MIN_VALUE;
        long j2 = Long.MAX_VALUE;
        for (C2489a.b bVar : this.f10153v.f10059f) {
            if (bVar.f10074k > 0) {
                long min = Math.min(j2, bVar.m10391b(0));
                j = Math.max(j, bVar.m10391b(bVar.f10074k - 1) + bVar.m10389a(bVar.f10074k - 1));
                j2 = min;
            }
        }
        if (j2 == Long.MAX_VALUE) {
            c2406g = new C2406G(this.f10153v.f10057d ? -9223372036854775807L : 0L, 0L, 0L, 0L, true, this.f10153v.f10057d, this.f10147p);
        } else {
            C2489a c2489a = this.f10153v;
            if (c2489a.f10057d) {
                long j3 = c2489a.f10061h;
                if (j3 != -9223372036854775807L && j3 > 0) {
                    j2 = Math.max(j2, j - j3);
                }
                long j4 = j2;
                long j5 = j - j4;
                long m9047a = j5 - C2200d.m9047a(this.f10143l);
                if (m9047a < 5000000) {
                    m9047a = Math.min(5000000L, j5 / 2);
                }
                c2406g = new C2406G(-9223372036854775807L, j5, j4, m9047a, true, true, this.f10147p);
            } else {
                long j6 = c2489a.f10060g;
                long j7 = j6 != -9223372036854775807L ? j6 : j - j2;
                c2406g = new C2406G(j2 + j7, j7, j2, 0L, true, false, this.f10147p);
            }
        }
        m10434a(c2406g, this.f10153v);
    }

    /* renamed from: d */
    private void m10428d() {
        if (this.f10153v.f10057d) {
            this.f10154w.postDelayed(new Runnable() { // from class: d.c.a.a.j.e.a
                @Override // java.lang.Runnable
                public final void run() {
                    C2495e.this.m10429e();
                }
            }, Math.max(0L, (this.f10152u + 5000) - SystemClock.elapsedRealtime()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public void m10429e() {
        C2583B c2583b = new C2583B(this.f10148q, this.f10138g, 4, this.f10145n);
        this.f10144m.m10505a(c2583b.f10736a, c2583b.f10737b, this.f10149r.m10960a(c2583b, this, this.f10142k.mo10948a(c2583b.f10737b)));
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2515y
    /* renamed from: a */
    public InterfaceC2514x mo9889a(InterfaceC2515y.a aVar, InterfaceC2590d interfaceC2590d) {
        C2494d c2494d = new C2494d(this.f10153v, this.f10140i, this.f10151t, this.f10141j, this.f10142k, m10431a(aVar), this.f10150s, interfaceC2590d);
        this.f10146o.add(c2494d);
        return c2494d;
    }

    @Override // p139d.p225c.p226a.p227a.p269m.C2612z.a
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public C2612z.b mo9965a(C2583B<C2489a> c2583b, long j, long j2, IOException iOException, int i) {
        boolean z = iOException instanceof C2683z;
        this.f10144m.m10509a(c2583b.f10736a, c2583b.m10899f(), c2583b.m10897d(), c2583b.f10737b, j, j2, c2583b.m10896c(), iOException, z);
        return z ? C2612z.f10850d : C2612z.f10847a;
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2515y
    /* renamed from: a */
    public void mo9891a() {
        this.f10150s.mo10177a();
    }

    @Override // p139d.p225c.p226a.p227a.p250j.InterfaceC2515y
    /* renamed from: a */
    public void mo9892a(InterfaceC2514x interfaceC2514x) {
        ((C2494d) interfaceC2514x).m10425c();
        this.f10146o.remove(interfaceC2514x);
    }

    @Override // p139d.p225c.p226a.p227a.p250j.AbstractC2503m
    /* renamed from: a */
    public void mo9893a(InterfaceC2517k interfaceC2517k, boolean z, InterfaceC2586E interfaceC2586E) {
        this.f10151t = interfaceC2586E;
        if (this.f10137f) {
            this.f10150s = new InterfaceC2582A.a();
            m10427c();
            return;
        }
        this.f10148q = this.f10139h.mo10923a();
        this.f10149r = new C2612z("Loader:Manifest");
        this.f10150s = this.f10149r;
        this.f10154w = new Handler();
        m10429e();
    }

    @Override // p139d.p225c.p226a.p227a.p269m.C2612z.a
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo9967a(C2583B<C2489a> c2583b, long j, long j2) {
        this.f10144m.m10516b(c2583b.f10736a, c2583b.m10899f(), c2583b.m10897d(), c2583b.f10737b, j, j2, c2583b.m10896c());
        this.f10153v = c2583b.m10898e();
        this.f10152u = j - j2;
        m10427c();
        m10428d();
    }

    @Override // p139d.p225c.p226a.p227a.p269m.C2612z.a
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo9968a(C2583B<C2489a> c2583b, long j, long j2, boolean z) {
        this.f10144m.m10508a(c2583b.f10736a, c2583b.m10899f(), c2583b.m10897d(), c2583b.f10737b, j, j2, c2583b.m10896c());
    }

    @Override // p139d.p225c.p226a.p227a.p250j.AbstractC2503m
    /* renamed from: b */
    public void mo9895b() {
        this.f10153v = this.f10137f ? this.f10153v : null;
        this.f10148q = null;
        this.f10152u = 0L;
        C2612z c2612z = this.f10149r;
        if (c2612z != null) {
            c2612z.m10965d();
            this.f10149r = null;
        }
        Handler handler = this.f10154w;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f10154w = null;
        }
    }
}
