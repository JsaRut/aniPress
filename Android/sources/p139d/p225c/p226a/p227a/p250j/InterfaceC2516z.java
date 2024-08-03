package p139d.p225c.p226a.p227a.p250j;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import p139d.p225c.p226a.p227a.C2200d;
import p139d.p225c.p226a.p227a.C2676s;
import p139d.p225c.p226a.p227a.p250j.InterfaceC2515y;
import p139d.p225c.p226a.p227a.p250j.InterfaceC2516z;
import p139d.p225c.p226a.p227a.p269m.C2600n;
import p139d.p225c.p226a.p227a.p270n.C2628e;

/* renamed from: d.c.a.a.j.z */
/* loaded from: classes.dex */
public interface InterfaceC2516z {

    /* renamed from: d.c.a.a.j.z$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final int f10276a;

        /* renamed from: b */
        public final InterfaceC2515y.a f10277b;

        /* renamed from: c */
        private final CopyOnWriteArrayList<C2804a> f10278c;

        /* renamed from: d */
        private final long f10279d;

        /* renamed from: d.c.a.a.j.z$a$a */
        /* loaded from: classes.dex */
        public static final class C2804a {

            /* renamed from: a */
            public final Handler f10280a;

            /* renamed from: b */
            public final InterfaceC2516z f10281b;

            public C2804a(Handler handler, InterfaceC2516z interfaceC2516z) {
                this.f10280a = handler;
                this.f10281b = interfaceC2516z;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null, 0L);
        }

        private a(CopyOnWriteArrayList<C2804a> copyOnWriteArrayList, int i, InterfaceC2515y.a aVar, long j) {
            this.f10278c = copyOnWriteArrayList;
            this.f10276a = i;
            this.f10277b = aVar;
            this.f10279d = j;
        }

        /* renamed from: a */
        private long m10488a(long j) {
            long m9048b = C2200d.m9048b(j);
            if (m9048b == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return this.f10279d + m9048b;
        }

        /* renamed from: a */
        private void m10489a(Handler handler, Runnable runnable) {
            if (handler.getLooper() == Looper.myLooper()) {
                runnable.run();
            } else {
                handler.post(runnable);
            }
        }

        /* renamed from: a */
        public a m10490a(int i, InterfaceC2515y.a aVar, long j) {
            return new a(this.f10278c, i, aVar, j);
        }

        /* renamed from: a */
        public void m10491a() {
            InterfaceC2515y.a aVar = this.f10277b;
            C2628e.m11110a(aVar);
            InterfaceC2515y.a aVar2 = aVar;
            Iterator<C2804a> it = this.f10278c.iterator();
            while (it.hasNext()) {
                C2804a next = it.next();
                m10489a(next.f10280a, new Runnable() { // from class: d.c.a.a.j.i

                    /* renamed from: b */
                    private final /* synthetic */ InterfaceC2516z f10167b;

                    /* renamed from: c */
                    private final /* synthetic */ InterfaceC2515y.a f10168c;

                    public /* synthetic */ RunnableC2499i(InterfaceC2516z interfaceC2516z, InterfaceC2515y.a aVar22) {
                        r2 = interfaceC2516z;
                        r3 = aVar22;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC2516z.a.this.m10499a(r2, r3);
                    }
                });
            }
        }

        /* renamed from: a */
        public void m10492a(int i, long j, long j2) {
            m10512b(new c(1, i, null, 3, null, m10488a(j), m10488a(j2)));
        }

        /* renamed from: a */
        public void m10493a(int i, C2676s c2676s, int i2, Object obj, long j) {
            m10497a(new c(1, i, c2676s, i2, obj, m10488a(j), -9223372036854775807L));
        }

        /* renamed from: a */
        public void m10494a(Handler handler, InterfaceC2516z interfaceC2516z) {
            C2628e.m11111a((handler == null || interfaceC2516z == null) ? false : true);
            this.f10278c.add(new C2804a(handler, interfaceC2516z));
        }

        /* renamed from: a */
        public void m10495a(b bVar, c cVar) {
            Iterator<C2804a> it = this.f10278c.iterator();
            while (it.hasNext()) {
                C2804a next = it.next();
                m10489a(next.f10280a, new Runnable() { // from class: d.c.a.a.j.e

                    /* renamed from: b */
                    private final /* synthetic */ InterfaceC2516z f10050b;

                    /* renamed from: c */
                    private final /* synthetic */ InterfaceC2516z.b f10051c;

                    /* renamed from: d */
                    private final /* synthetic */ InterfaceC2516z.c f10052d;

                    public /* synthetic */ RunnableC2487e(InterfaceC2516z interfaceC2516z, InterfaceC2516z.b bVar2, InterfaceC2516z.c cVar2) {
                        r2 = interfaceC2516z;
                        r3 = bVar2;
                        r4 = cVar2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC2516z.a.this.m10501a(r2, r3, r4);
                    }
                });
            }
        }

        /* renamed from: a */
        public void m10496a(b bVar, c cVar, IOException iOException, boolean z) {
            Iterator<C2804a> it = this.f10278c.iterator();
            while (it.hasNext()) {
                C2804a next = it.next();
                m10489a(next.f10280a, new Runnable() { // from class: d.c.a.a.j.d

                    /* renamed from: b */
                    private final /* synthetic */ InterfaceC2516z f9795b;

                    /* renamed from: c */
                    private final /* synthetic */ InterfaceC2516z.b f9796c;

                    /* renamed from: d */
                    private final /* synthetic */ InterfaceC2516z.c f9797d;

                    /* renamed from: e */
                    private final /* synthetic */ IOException f9798e;

                    /* renamed from: f */
                    private final /* synthetic */ boolean f9799f;

                    public /* synthetic */ RunnableC2460d(InterfaceC2516z interfaceC2516z, InterfaceC2516z.b bVar2, InterfaceC2516z.c cVar2, IOException iOException2, boolean z2) {
                        r2 = interfaceC2516z;
                        r3 = bVar2;
                        r4 = cVar2;
                        r5 = iOException2;
                        r6 = z2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC2516z.a.this.m10502a(r2, r3, r4, r5, r6);
                    }
                });
            }
        }

        /* renamed from: a */
        public void m10497a(c cVar) {
            Iterator<C2804a> it = this.f10278c.iterator();
            while (it.hasNext()) {
                C2804a next = it.next();
                m10489a(next.f10280a, new Runnable() { // from class: d.c.a.a.j.g

                    /* renamed from: b */
                    private final /* synthetic */ InterfaceC2516z f10160b;

                    /* renamed from: c */
                    private final /* synthetic */ InterfaceC2516z.c f10161c;

                    public /* synthetic */ RunnableC2497g(InterfaceC2516z interfaceC2516z, InterfaceC2516z.c cVar2) {
                        r2 = interfaceC2516z;
                        r3 = cVar2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC2516z.a.this.m10503a(r2, r3);
                    }
                });
            }
        }

        /* renamed from: a */
        public void m10498a(InterfaceC2516z interfaceC2516z) {
            Iterator<C2804a> it = this.f10278c.iterator();
            while (it.hasNext()) {
                C2804a next = it.next();
                if (next.f10281b == interfaceC2516z) {
                    this.f10278c.remove(next);
                }
            }
        }

        /* renamed from: a */
        public /* synthetic */ void m10499a(InterfaceC2516z interfaceC2516z, InterfaceC2515y.a aVar) {
            interfaceC2516z.mo8693c(this.f10276a, aVar);
        }

        /* renamed from: a */
        public /* synthetic */ void m10500a(InterfaceC2516z interfaceC2516z, InterfaceC2515y.a aVar, c cVar) {
            interfaceC2516z.mo8687a(this.f10276a, aVar, cVar);
        }

        /* renamed from: a */
        public /* synthetic */ void m10501a(InterfaceC2516z interfaceC2516z, b bVar, c cVar) {
            interfaceC2516z.mo8690b(this.f10276a, this.f10277b, bVar, cVar);
        }

        /* renamed from: a */
        public /* synthetic */ void m10502a(InterfaceC2516z interfaceC2516z, b bVar, c cVar, IOException iOException, boolean z) {
            interfaceC2516z.mo8686a(this.f10276a, this.f10277b, bVar, cVar, iOException, z);
        }

        /* renamed from: a */
        public /* synthetic */ void m10503a(InterfaceC2516z interfaceC2516z, c cVar) {
            interfaceC2516z.mo8691b(this.f10276a, this.f10277b, cVar);
        }

        /* renamed from: a */
        public void m10504a(C2600n c2600n, int i, int i2, C2676s c2676s, int i3, Object obj, long j, long j2, long j3) {
            m10518c(new b(c2600n, c2600n.f10782a, Collections.emptyMap(), j3, 0L, 0L), new c(i, i2, c2676s, i3, obj, m10488a(j), m10488a(j2)));
        }

        /* renamed from: a */
        public void m10505a(C2600n c2600n, int i, long j) {
            m10504a(c2600n, i, -1, (C2676s) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L, j);
        }

        /* renamed from: a */
        public void m10506a(C2600n c2600n, Uri uri, Map<String, List<String>> map, int i, int i2, C2676s c2676s, int i3, Object obj, long j, long j2, long j3, long j4, long j5) {
            m10495a(new b(c2600n, uri, map, j3, j4, j5), new c(i, i2, c2676s, i3, obj, m10488a(j), m10488a(j2)));
        }

        /* renamed from: a */
        public void m10507a(C2600n c2600n, Uri uri, Map<String, List<String>> map, int i, int i2, C2676s c2676s, int i3, Object obj, long j, long j2, long j3, long j4, long j5, IOException iOException, boolean z) {
            m10496a(new b(c2600n, uri, map, j3, j4, j5), new c(i, i2, c2676s, i3, obj, m10488a(j), m10488a(j2)), iOException, z);
        }

        /* renamed from: a */
        public void m10508a(C2600n c2600n, Uri uri, Map<String, List<String>> map, int i, long j, long j2, long j3) {
            m10506a(c2600n, uri, map, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, j, j2, j3);
        }

        /* renamed from: a */
        public void m10509a(C2600n c2600n, Uri uri, Map<String, List<String>> map, int i, long j, long j2, long j3, IOException iOException, boolean z) {
            m10507a(c2600n, uri, map, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, j, j2, j3, iOException, z);
        }

        /* renamed from: b */
        public void m10510b() {
            InterfaceC2515y.a aVar = this.f10277b;
            C2628e.m11110a(aVar);
            InterfaceC2515y.a aVar2 = aVar;
            Iterator<C2804a> it = this.f10278c.iterator();
            while (it.hasNext()) {
                C2804a next = it.next();
                m10489a(next.f10280a, new Runnable() { // from class: d.c.a.a.j.l

                    /* renamed from: b */
                    private final /* synthetic */ InterfaceC2516z f10177b;

                    /* renamed from: c */
                    private final /* synthetic */ InterfaceC2515y.a f10178c;

                    public /* synthetic */ RunnableC2502l(InterfaceC2516z interfaceC2516z, InterfaceC2515y.a aVar22) {
                        r2 = interfaceC2516z;
                        r3 = aVar22;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC2516z.a.this.m10513b(r2, r3);
                    }
                });
            }
        }

        /* renamed from: b */
        public void m10511b(b bVar, c cVar) {
            Iterator<C2804a> it = this.f10278c.iterator();
            while (it.hasNext()) {
                C2804a next = it.next();
                m10489a(next.f10280a, new Runnable() { // from class: d.c.a.a.j.h

                    /* renamed from: b */
                    private final /* synthetic */ InterfaceC2516z f10163b;

                    /* renamed from: c */
                    private final /* synthetic */ InterfaceC2516z.b f10164c;

                    /* renamed from: d */
                    private final /* synthetic */ InterfaceC2516z.c f10165d;

                    public /* synthetic */ RunnableC2498h(InterfaceC2516z interfaceC2516z, InterfaceC2516z.b bVar2, InterfaceC2516z.c cVar2) {
                        r2 = interfaceC2516z;
                        r3 = bVar2;
                        r4 = cVar2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC2516z.a.this.m10514b(r2, r3, r4);
                    }
                });
            }
        }

        /* renamed from: b */
        public void m10512b(c cVar) {
            InterfaceC2515y.a aVar = this.f10277b;
            C2628e.m11110a(aVar);
            InterfaceC2515y.a aVar2 = aVar;
            Iterator<C2804a> it = this.f10278c.iterator();
            while (it.hasNext()) {
                C2804a next = it.next();
                m10489a(next.f10280a, new Runnable() { // from class: d.c.a.a.j.f

                    /* renamed from: b */
                    private final /* synthetic */ InterfaceC2516z f10156b;

                    /* renamed from: c */
                    private final /* synthetic */ InterfaceC2515y.a f10157c;

                    /* renamed from: d */
                    private final /* synthetic */ InterfaceC2516z.c f10158d;

                    public /* synthetic */ RunnableC2496f(InterfaceC2516z interfaceC2516z, InterfaceC2515y.a aVar22, InterfaceC2516z.c cVar2) {
                        r2 = interfaceC2516z;
                        r3 = aVar22;
                        r4 = cVar2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC2516z.a.this.m10500a(r2, r3, r4);
                    }
                });
            }
        }

        /* renamed from: b */
        public /* synthetic */ void m10513b(InterfaceC2516z interfaceC2516z, InterfaceC2515y.a aVar) {
            interfaceC2516z.mo8689b(this.f10276a, aVar);
        }

        /* renamed from: b */
        public /* synthetic */ void m10514b(InterfaceC2516z interfaceC2516z, b bVar, c cVar) {
            interfaceC2516z.mo8685a(this.f10276a, this.f10277b, bVar, cVar);
        }

        /* renamed from: b */
        public void m10515b(C2600n c2600n, Uri uri, Map<String, List<String>> map, int i, int i2, C2676s c2676s, int i3, Object obj, long j, long j2, long j3, long j4, long j5) {
            m10511b(new b(c2600n, uri, map, j3, j4, j5), new c(i, i2, c2676s, i3, obj, m10488a(j), m10488a(j2)));
        }

        /* renamed from: b */
        public void m10516b(C2600n c2600n, Uri uri, Map<String, List<String>> map, int i, long j, long j2, long j3) {
            m10515b(c2600n, uri, map, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, j, j2, j3);
        }

        /* renamed from: c */
        public void m10517c() {
            InterfaceC2515y.a aVar = this.f10277b;
            C2628e.m11110a(aVar);
            InterfaceC2515y.a aVar2 = aVar;
            Iterator<C2804a> it = this.f10278c.iterator();
            while (it.hasNext()) {
                C2804a next = it.next();
                m10489a(next.f10280a, new Runnable() { // from class: d.c.a.a.j.j

                    /* renamed from: b */
                    private final /* synthetic */ InterfaceC2516z f10170b;

                    /* renamed from: c */
                    private final /* synthetic */ InterfaceC2515y.a f10171c;

                    public /* synthetic */ RunnableC2500j(InterfaceC2516z interfaceC2516z, InterfaceC2515y.a aVar22) {
                        r2 = interfaceC2516z;
                        r3 = aVar22;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC2516z.a.this.m10519c(r2, r3);
                    }
                });
            }
        }

        /* renamed from: c */
        public void m10518c(b bVar, c cVar) {
            Iterator<C2804a> it = this.f10278c.iterator();
            while (it.hasNext()) {
                C2804a next = it.next();
                m10489a(next.f10280a, new Runnable() { // from class: d.c.a.a.j.k

                    /* renamed from: b */
                    private final /* synthetic */ InterfaceC2516z f10173b;

                    /* renamed from: c */
                    private final /* synthetic */ InterfaceC2516z.b f10174c;

                    /* renamed from: d */
                    private final /* synthetic */ InterfaceC2516z.c f10175d;

                    public /* synthetic */ RunnableC2501k(InterfaceC2516z interfaceC2516z, InterfaceC2516z.b bVar2, InterfaceC2516z.c cVar2) {
                        r2 = interfaceC2516z;
                        r3 = bVar2;
                        r4 = cVar2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC2516z.a.this.m10520c(r2, r3, r4);
                    }
                });
            }
        }

        /* renamed from: c */
        public /* synthetic */ void m10519c(InterfaceC2516z interfaceC2516z, InterfaceC2515y.a aVar) {
            interfaceC2516z.mo8684a(this.f10276a, aVar);
        }

        /* renamed from: c */
        public /* synthetic */ void m10520c(InterfaceC2516z interfaceC2516z, b bVar, c cVar) {
            interfaceC2516z.mo8694c(this.f10276a, this.f10277b, bVar, cVar);
        }
    }

    /* renamed from: d.c.a.a.j.z$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        public final C2600n f10282a;

        /* renamed from: b */
        public final Uri f10283b;

        /* renamed from: c */
        public final Map<String, List<String>> f10284c;

        /* renamed from: d */
        public final long f10285d;

        /* renamed from: e */
        public final long f10286e;

        /* renamed from: f */
        public final long f10287f;

        public b(C2600n c2600n, Uri uri, Map<String, List<String>> map, long j, long j2, long j3) {
            this.f10282a = c2600n;
            this.f10283b = uri;
            this.f10284c = map;
            this.f10285d = j;
            this.f10286e = j2;
            this.f10287f = j3;
        }
    }

    /* renamed from: d.c.a.a.j.z$c */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a */
        public final int f10288a;

        /* renamed from: b */
        public final int f10289b;

        /* renamed from: c */
        public final C2676s f10290c;

        /* renamed from: d */
        public final int f10291d;

        /* renamed from: e */
        public final Object f10292e;

        /* renamed from: f */
        public final long f10293f;

        /* renamed from: g */
        public final long f10294g;

        public c(int i, int i2, C2676s c2676s, int i3, Object obj, long j, long j2) {
            this.f10288a = i;
            this.f10289b = i2;
            this.f10290c = c2676s;
            this.f10291d = i3;
            this.f10292e = obj;
            this.f10293f = j;
            this.f10294g = j2;
        }
    }

    /* renamed from: a */
    void mo8684a(int i, InterfaceC2515y.a aVar);

    /* renamed from: a */
    void mo8685a(int i, InterfaceC2515y.a aVar, b bVar, c cVar);

    /* renamed from: a */
    void mo8686a(int i, InterfaceC2515y.a aVar, b bVar, c cVar, IOException iOException, boolean z);

    /* renamed from: a */
    void mo8687a(int i, InterfaceC2515y.a aVar, c cVar);

    /* renamed from: b */
    void mo8689b(int i, InterfaceC2515y.a aVar);

    /* renamed from: b */
    void mo8690b(int i, InterfaceC2515y.a aVar, b bVar, c cVar);

    /* renamed from: b */
    void mo8691b(int i, InterfaceC2515y.a aVar, c cVar);

    /* renamed from: c */
    void mo8693c(int i, InterfaceC2515y.a aVar);

    /* renamed from: c */
    void mo8694c(int i, InterfaceC2515y.a aVar, b bVar, c cVar);
}
