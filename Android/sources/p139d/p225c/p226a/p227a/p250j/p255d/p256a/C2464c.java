package p139d.p225c.p226a.p227a.p250j.p255d.p256a;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import java.io.IOException;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import p139d.p225c.p226a.p227a.C2200d;
import p139d.p225c.p226a.p227a.C2683z;
import p139d.p225c.p226a.p227a.p250j.InterfaceC2516z;
import p139d.p225c.p226a.p227a.p250j.p255d.InterfaceC2476g;
import p139d.p225c.p226a.p227a.p250j.p255d.p256a.C2465d;
import p139d.p225c.p226a.p227a.p250j.p255d.p256a.C2466e;
import p139d.p225c.p226a.p227a.p250j.p255d.p256a.InterfaceC2470i;
import p139d.p225c.p226a.p227a.p269m.C2583B;
import p139d.p225c.p226a.p227a.p269m.C2612z;
import p139d.p225c.p226a.p227a.p269m.InterfaceC2610x;
import p139d.p225c.p226a.p227a.p270n.C2621H;
import p139d.p225c.p226a.p227a.p270n.C2628e;

/* renamed from: d.c.a.a.j.d.a.c */
/* loaded from: classes.dex */
public final class C2464c implements InterfaceC2470i, C2612z.a<C2583B<AbstractC2467f>> {

    /* renamed from: a */
    public static final InterfaceC2470i.a f9803a = new InterfaceC2470i.a() { // from class: d.c.a.a.j.d.a.a
    };

    /* renamed from: b */
    private final InterfaceC2476g f9804b;

    /* renamed from: c */
    private final InterfaceC2469h f9805c;

    /* renamed from: d */
    private final InterfaceC2610x f9806d;

    /* renamed from: e */
    private final IdentityHashMap<C2465d.a, a> f9807e;

    /* renamed from: f */
    private final List<InterfaceC2470i.b> f9808f;

    /* renamed from: g */
    private C2583B.a<AbstractC2467f> f9809g;

    /* renamed from: h */
    private InterfaceC2516z.a f9810h;

    /* renamed from: i */
    private C2612z f9811i;

    /* renamed from: j */
    private Handler f9812j;

    /* renamed from: k */
    private InterfaceC2470i.e f9813k;

    /* renamed from: l */
    private C2465d f9814l;

    /* renamed from: m */
    private C2465d.a f9815m;

    /* renamed from: n */
    private C2466e f9816n;

    /* renamed from: o */
    private boolean f9817o;

    /* renamed from: p */
    private long f9818p;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d.c.a.a.j.d.a.c$a */
    /* loaded from: classes.dex */
    public final class a implements C2612z.a<C2583B<AbstractC2467f>>, Runnable {

        /* renamed from: a */
        private final C2465d.a f9819a;

        /* renamed from: b */
        private final C2612z f9820b = new C2612z("DefaultHlsPlaylistTracker:MediaPlaylist");

        /* renamed from: c */
        private final C2583B<AbstractC2467f> f9821c;

        /* renamed from: d */
        private C2466e f9822d;

        /* renamed from: e */
        private long f9823e;

        /* renamed from: f */
        private long f9824f;

        /* renamed from: g */
        private long f9825g;

        /* renamed from: h */
        private long f9826h;

        /* renamed from: i */
        private boolean f9827i;

        /* renamed from: j */
        private IOException f9828j;

        public a(C2465d.a aVar) {
            this.f9819a = aVar;
            this.f9821c = new C2583B<>(C2464c.this.f9804b.mo10302a(4), C2621H.m11034b(C2464c.this.f9814l.f9864a, aVar.f9837a), 4, C2464c.this.f9809g);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public void m10263a(C2466e c2466e, long j) {
            C2466e c2466e2 = this.f9822d;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f9823e = elapsedRealtime;
            this.f9822d = C2464c.this.m10238b(c2466e2, c2466e);
            C2466e c2466e3 = this.f9822d;
            if (c2466e3 != c2466e2) {
                this.f9828j = null;
                this.f9824f = elapsedRealtime;
                C2464c.this.m10234a(this.f9819a, c2466e3);
            } else if (!c2466e3.f9847l) {
                long size = c2466e.f9844i + c2466e.f9850o.size();
                C2466e c2466e4 = this.f9822d;
                if (size < c2466e4.f9844i) {
                    this.f9828j = new InterfaceC2470i.c(this.f9819a.f9837a);
                    C2464c.this.m10237a(this.f9819a, -9223372036854775807L);
                } else {
                    double d2 = elapsedRealtime - this.f9824f;
                    double m9048b = C2200d.m9048b(c2466e4.f9846k);
                    Double.isNaN(m9048b);
                    if (d2 > m9048b * 3.5d) {
                        this.f9828j = new InterfaceC2470i.d(this.f9819a.f9837a);
                        long mo10950b = C2464c.this.f9806d.mo10950b(4, j, this.f9828j, 1);
                        C2464c.this.m10237a(this.f9819a, mo10950b);
                        if (mo10950b != -9223372036854775807L) {
                            m10264a(mo10950b);
                        }
                    }
                }
            }
            C2466e c2466e5 = this.f9822d;
            this.f9825g = elapsedRealtime + C2200d.m9048b(c2466e5 != c2466e2 ? c2466e5.f9846k : c2466e5.f9846k / 2);
            if (this.f9819a != C2464c.this.f9815m || this.f9822d.f9847l) {
                return;
            }
            m10269c();
        }

        /* renamed from: a */
        private boolean m10264a(long j) {
            this.f9826h = SystemClock.elapsedRealtime() + j;
            return C2464c.this.f9815m == this.f9819a && !C2464c.this.m10246e();
        }

        /* renamed from: f */
        private void m10266f() {
            long m10960a = this.f9820b.m10960a(this.f9821c, this, C2464c.this.f9806d.mo10948a(this.f9821c.f10737b));
            InterfaceC2516z.a aVar = C2464c.this.f9810h;
            C2583B<AbstractC2467f> c2583b = this.f9821c;
            aVar.m10505a(c2583b.f10736a, c2583b.f10737b, m10960a);
        }

        /* renamed from: a */
        public C2466e m10267a() {
            return this.f9822d;
        }

        @Override // p139d.p225c.p226a.p227a.p269m.C2612z.a
        /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public C2612z.b mo9965a(C2583B<AbstractC2467f> c2583b, long j, long j2, IOException iOException, int i) {
            C2612z.b bVar;
            long mo10950b = C2464c.this.f9806d.mo10950b(c2583b.f10737b, j2, iOException, i);
            boolean z = mo10950b != -9223372036854775807L;
            boolean z2 = C2464c.this.m10237a(this.f9819a, mo10950b) || !z;
            if (z) {
                z2 |= m10264a(mo10950b);
            }
            if (z2) {
                long mo10949a = C2464c.this.f9806d.mo10949a(c2583b.f10737b, j2, iOException, i);
                bVar = mo10949a != -9223372036854775807L ? C2612z.m10955a(false, mo10949a) : C2612z.f10850d;
            } else {
                bVar = C2612z.f10849c;
            }
            C2464c.this.f9810h.m10509a(c2583b.f10736a, c2583b.m10899f(), c2583b.m10897d(), 4, j, j2, c2583b.m10896c(), iOException, !bVar.m10968a());
            return bVar;
        }

        @Override // p139d.p225c.p226a.p227a.p269m.C2612z.a
        /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public void mo9967a(C2583B<AbstractC2467f> c2583b, long j, long j2) {
            AbstractC2467f m10898e = c2583b.m10898e();
            if (!(m10898e instanceof C2466e)) {
                this.f9828j = new C2683z("Loaded playlist has unexpected type.");
            } else {
                m10263a((C2466e) m10898e, j2);
                C2464c.this.f9810h.m10516b(c2583b.f10736a, c2583b.m10899f(), c2583b.m10897d(), 4, j, j2, c2583b.m10896c());
            }
        }

        @Override // p139d.p225c.p226a.p227a.p269m.C2612z.a
        /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public void mo9968a(C2583B<AbstractC2467f> c2583b, long j, long j2, boolean z) {
            C2464c.this.f9810h.m10508a(c2583b.f10736a, c2583b.m10899f(), c2583b.m10897d(), 4, j, j2, c2583b.m10896c());
        }

        /* renamed from: b */
        public boolean m10268b() {
            int i;
            if (this.f9822d == null) {
                return false;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long max = Math.max(30000L, C2200d.m9048b(this.f9822d.f9851p));
            C2466e c2466e = this.f9822d;
            return c2466e.f9847l || (i = c2466e.f9839d) == 2 || i == 1 || this.f9823e + max > elapsedRealtime;
        }

        /* renamed from: c */
        public void m10269c() {
            this.f9826h = 0L;
            if (this.f9827i || this.f9820b.m10964c()) {
                return;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime >= this.f9825g) {
                m10266f();
            } else {
                this.f9827i = true;
                C2464c.this.f9812j.postDelayed(this, this.f9825g - elapsedRealtime);
            }
        }

        /* renamed from: d */
        public void m10270d() {
            this.f9820b.mo10177a();
            IOException iOException = this.f9828j;
            if (iOException != null) {
                throw iOException;
            }
        }

        /* renamed from: e */
        public void m10271e() {
            this.f9820b.m10965d();
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f9827i = false;
            m10266f();
        }
    }

    public C2464c(InterfaceC2476g interfaceC2476g, InterfaceC2610x interfaceC2610x, InterfaceC2469h interfaceC2469h) {
        this.f9804b = interfaceC2476g;
        this.f9805c = interfaceC2469h;
        this.f9806d = interfaceC2610x;
        this.f9808f = new ArrayList();
        this.f9807e = new IdentityHashMap<>();
        this.f9818p = -9223372036854775807L;
    }

    @Deprecated
    public C2464c(InterfaceC2476g interfaceC2476g, InterfaceC2610x interfaceC2610x, C2583B.a<AbstractC2467f> aVar) {
        this(interfaceC2476g, interfaceC2610x, m10232a(aVar));
    }

    /* renamed from: a */
    private static C2466e.a m10230a(C2466e c2466e, C2466e c2466e2) {
        int i = (int) (c2466e2.f9844i - c2466e.f9844i);
        List<C2466e.a> list = c2466e.f9850o;
        if (i < list.size()) {
            return list.get(i);
        }
        return null;
    }

    /* renamed from: a */
    private static InterfaceC2469h m10232a(C2583B.a<AbstractC2467f> aVar) {
        return new C2463b(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m10234a(C2465d.a aVar, C2466e c2466e) {
        if (aVar == this.f9815m) {
            if (this.f9816n == null) {
                this.f9817o = !c2466e.f9847l;
                this.f9818p = c2466e.f9841f;
            }
            this.f9816n = c2466e;
            this.f9813k.mo10299a(c2466e);
        }
        int size = this.f9808f.size();
        for (int i = 0; i < size; i++) {
            this.f9808f.get(i).mo10298c();
        }
    }

    /* renamed from: a */
    private void m10235a(List<C2465d.a> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C2465d.a aVar = list.get(i);
            this.f9807e.put(aVar, new a(aVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public boolean m10237a(C2465d.a aVar, long j) {
        int size = this.f9808f.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            z |= !this.f9808f.get(i).mo10297a(aVar, j);
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public C2466e m10238b(C2466e c2466e, C2466e c2466e2) {
        return !c2466e2.m10276a(c2466e) ? c2466e2.f9847l ? c2466e.m10274a() : c2466e : c2466e2.m10275a(m10242d(c2466e, c2466e2), m10240c(c2466e, c2466e2));
    }

    /* renamed from: c */
    private int m10240c(C2466e c2466e, C2466e c2466e2) {
        C2466e.a m10230a;
        if (c2466e2.f9842g) {
            return c2466e2.f9843h;
        }
        C2466e c2466e3 = this.f9816n;
        int i = c2466e3 != null ? c2466e3.f9843h : 0;
        return (c2466e == null || (m10230a = m10230a(c2466e, c2466e2)) == null) ? i : (c2466e.f9843h + m10230a.f9856e) - c2466e2.f9850o.get(0).f9856e;
    }

    /* renamed from: d */
    private long m10242d(C2466e c2466e, C2466e c2466e2) {
        if (c2466e2.f9848m) {
            return c2466e2.f9841f;
        }
        C2466e c2466e3 = this.f9816n;
        long j = c2466e3 != null ? c2466e3.f9841f : 0L;
        if (c2466e == null) {
            return j;
        }
        int size = c2466e.f9850o.size();
        C2466e.a m10230a = m10230a(c2466e, c2466e2);
        return m10230a != null ? c2466e.f9841f + m10230a.f9857f : ((long) size) == c2466e2.f9844i - c2466e.f9844i ? c2466e.m10277b() : j;
    }

    /* renamed from: d */
    private void m10244d(C2465d.a aVar) {
        if (aVar == this.f9815m || !this.f9814l.f9831e.contains(aVar)) {
            return;
        }
        C2466e c2466e = this.f9816n;
        if (c2466e == null || !c2466e.f9847l) {
            this.f9815m = aVar;
            this.f9807e.get(this.f9815m).m10269c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public boolean m10246e() {
        List<C2465d.a> list = this.f9814l.f9831e;
        int size = list.size();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (int i = 0; i < size; i++) {
            a aVar = this.f9807e.get(list.get(i));
            if (elapsedRealtime > aVar.f9826h) {
                this.f9815m = aVar.f9819a;
                aVar.m10269c();
                return true;
            }
        }
        return false;
    }

    @Override // p139d.p225c.p226a.p227a.p250j.p255d.p256a.InterfaceC2470i
    /* renamed from: a */
    public long mo10250a() {
        return this.f9818p;
    }

    @Override // p139d.p225c.p226a.p227a.p250j.p255d.p256a.InterfaceC2470i
    /* renamed from: a */
    public C2466e mo10251a(C2465d.a aVar, boolean z) {
        C2466e m10267a = this.f9807e.get(aVar).m10267a();
        if (m10267a != null && z) {
            m10244d(aVar);
        }
        return m10267a;
    }

    @Override // p139d.p225c.p226a.p227a.p269m.C2612z.a
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public C2612z.b mo9965a(C2583B<AbstractC2467f> c2583b, long j, long j2, IOException iOException, int i) {
        long mo10949a = this.f9806d.mo10949a(c2583b.f10737b, j2, iOException, i);
        boolean z = mo10949a == -9223372036854775807L;
        this.f9810h.m10509a(c2583b.f10736a, c2583b.m10899f(), c2583b.m10897d(), 4, j, j2, c2583b.m10896c(), iOException, z);
        return z ? C2612z.f10850d : C2612z.m10955a(false, mo10949a);
    }

    @Override // p139d.p225c.p226a.p227a.p250j.p255d.p256a.InterfaceC2470i
    /* renamed from: a */
    public void mo10252a(Uri uri, InterfaceC2516z.a aVar, InterfaceC2470i.e eVar) {
        this.f9812j = new Handler();
        this.f9810h = aVar;
        this.f9813k = eVar;
        C2583B c2583b = new C2583B(this.f9804b.mo10302a(4), uri, 4, this.f9805c.mo10227a());
        C2628e.m11113b(this.f9811i == null);
        this.f9811i = new C2612z("DefaultHlsPlaylistTracker:MasterPlaylist");
        aVar.m10505a(c2583b.f10736a, c2583b.f10737b, this.f9811i.m10960a(c2583b, this, this.f9806d.mo10948a(c2583b.f10737b)));
    }

    @Override // p139d.p225c.p226a.p227a.p250j.p255d.p256a.InterfaceC2470i
    /* renamed from: a */
    public void mo10253a(C2465d.a aVar) {
        this.f9807e.get(aVar).m10269c();
    }

    @Override // p139d.p225c.p226a.p227a.p250j.p255d.p256a.InterfaceC2470i
    /* renamed from: a */
    public void mo10254a(InterfaceC2470i.b bVar) {
        this.f9808f.remove(bVar);
    }

    @Override // p139d.p225c.p226a.p227a.p269m.C2612z.a
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo9967a(C2583B<AbstractC2467f> c2583b, long j, long j2) {
        AbstractC2467f m10898e = c2583b.m10898e();
        boolean z = m10898e instanceof C2466e;
        C2465d m10272a = z ? C2465d.m10272a(m10898e.f9864a) : (C2465d) m10898e;
        this.f9814l = m10272a;
        this.f9809g = this.f9805c.mo10228a(m10272a);
        this.f9815m = m10272a.f9831e.get(0);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(m10272a.f9831e);
        arrayList.addAll(m10272a.f9832f);
        arrayList.addAll(m10272a.f9833g);
        m10235a(arrayList);
        a aVar = this.f9807e.get(this.f9815m);
        if (z) {
            aVar.m10263a((C2466e) m10898e, j2);
        } else {
            aVar.m10269c();
        }
        this.f9810h.m10516b(c2583b.f10736a, c2583b.m10899f(), c2583b.m10897d(), 4, j, j2, c2583b.m10896c());
    }

    @Override // p139d.p225c.p226a.p227a.p269m.C2612z.a
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo9968a(C2583B<AbstractC2467f> c2583b, long j, long j2, boolean z) {
        this.f9810h.m10508a(c2583b.f10736a, c2583b.m10899f(), c2583b.m10897d(), 4, j, j2, c2583b.m10896c());
    }

    @Override // p139d.p225c.p226a.p227a.p250j.p255d.p256a.InterfaceC2470i
    /* renamed from: b */
    public void mo10255b(InterfaceC2470i.b bVar) {
        this.f9808f.add(bVar);
    }

    @Override // p139d.p225c.p226a.p227a.p250j.p255d.p256a.InterfaceC2470i
    /* renamed from: b */
    public boolean mo10256b() {
        return this.f9817o;
    }

    @Override // p139d.p225c.p226a.p227a.p250j.p255d.p256a.InterfaceC2470i
    /* renamed from: b */
    public boolean mo10257b(C2465d.a aVar) {
        return this.f9807e.get(aVar).m10268b();
    }

    @Override // p139d.p225c.p226a.p227a.p250j.p255d.p256a.InterfaceC2470i
    /* renamed from: c */
    public C2465d mo10258c() {
        return this.f9814l;
    }

    @Override // p139d.p225c.p226a.p227a.p250j.p255d.p256a.InterfaceC2470i
    /* renamed from: c */
    public void mo10259c(C2465d.a aVar) {
        this.f9807e.get(aVar).m10270d();
    }

    @Override // p139d.p225c.p226a.p227a.p250j.p255d.p256a.InterfaceC2470i
    /* renamed from: d */
    public void mo10260d() {
        C2612z c2612z = this.f9811i;
        if (c2612z != null) {
            c2612z.mo10177a();
        }
        C2465d.a aVar = this.f9815m;
        if (aVar != null) {
            mo10259c(aVar);
        }
    }

    @Override // p139d.p225c.p226a.p227a.p250j.p255d.p256a.InterfaceC2470i
    public void stop() {
        this.f9815m = null;
        this.f9816n = null;
        this.f9814l = null;
        this.f9818p = -9223372036854775807L;
        this.f9811i.m10965d();
        this.f9811i = null;
        Iterator<a> it = this.f9807e.values().iterator();
        while (it.hasNext()) {
            it.next().m10271e();
        }
        this.f9812j.removeCallbacksAndMessages(null);
        this.f9812j = null;
        this.f9807e.clear();
    }
}
