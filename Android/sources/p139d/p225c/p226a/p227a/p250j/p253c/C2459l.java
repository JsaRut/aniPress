package p139d.p225c.p226a.p227a.p250j.p253c;

import android.os.Handler;
import android.os.Message;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import p139d.p225c.p226a.p227a.C2676s;
import p139d.p225c.p226a.p227a.C2677t;
import p139d.p225c.p226a.p227a.C2683z;
import p139d.p225c.p226a.p227a.p230c.C2196f;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2289h;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2337q;
import p139d.p225c.p226a.p227a.p245h.C2394f;
import p139d.p225c.p226a.p227a.p245h.p246a.C2350b;
import p139d.p225c.p226a.p227a.p245h.p246a.C2351c;
import p139d.p225c.p226a.p227a.p250j.C2403D;
import p139d.p225c.p226a.p227a.p250j.p252b.AbstractC2421d;
import p139d.p225c.p226a.p227a.p250j.p253c.p254a.C2436b;
import p139d.p225c.p226a.p227a.p269m.InterfaceC2590d;
import p139d.p225c.p226a.p227a.p270n.C2622I;
import p139d.p225c.p226a.p227a.p270n.C2644u;

/* renamed from: d.c.a.a.j.c.l */
/* loaded from: classes.dex */
public final class C2459l implements Handler.Callback {

    /* renamed from: a */
    private final InterfaceC2590d f9777a;

    /* renamed from: b */
    private final b f9778b;

    /* renamed from: f */
    private C2436b f9782f;

    /* renamed from: g */
    private long f9783g;

    /* renamed from: j */
    private boolean f9786j;

    /* renamed from: k */
    private boolean f9787k;

    /* renamed from: e */
    private final TreeMap<Long, Long> f9781e = new TreeMap<>();

    /* renamed from: d */
    private final Handler f9780d = C2622I.m11047a((Handler.Callback) this);

    /* renamed from: c */
    private final C2351c f9779c = new C2351c();

    /* renamed from: h */
    private long f9784h = -9223372036854775807L;

    /* renamed from: i */
    private long f9785i = -9223372036854775807L;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d.c.a.a.j.c.l$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final long f9788a;

        /* renamed from: b */
        public final long f9789b;

        public a(long j, long j2) {
            this.f9788a = j;
            this.f9789b = j2;
        }
    }

    /* renamed from: d.c.a.a.j.c.l$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: a */
        void mo10174a();

        /* renamed from: a */
        void mo10175a(long j);
    }

    /* renamed from: d.c.a.a.j.c.l$c */
    /* loaded from: classes.dex */
    public final class c implements InterfaceC2337q {

        /* renamed from: a */
        private final C2403D f9790a;

        /* renamed from: b */
        private final C2677t f9791b = new C2677t();

        /* renamed from: c */
        private final C2394f f9792c = new C2394f();

        c(C2403D c2403d) {
            this.f9790a = c2403d;
        }

        /* renamed from: a */
        private void m10219a(long j, long j2) {
            C2459l.this.f9780d.sendMessage(C2459l.this.f9780d.obtainMessage(1, new a(j, j2)));
        }

        /* renamed from: a */
        private void m10220a(long j, C2350b c2350b) {
            long m10207b = C2459l.m10207b(c2350b);
            if (m10207b == -9223372036854775807L) {
                return;
            }
            m10219a(j, m10207b);
        }

        /* renamed from: b */
        private C2394f m10221b() {
            this.f9792c.mo9006b();
            if (this.f9790a.m9935a(this.f9791b, (C2196f) this.f9792c, false, false, 0L) != -4) {
                return null;
            }
            this.f9792c.m9027f();
            return this.f9792c;
        }

        /* renamed from: c */
        private void m10222c() {
            while (this.f9790a.m9951j()) {
                C2394f m10221b = m10221b();
                if (m10221b != null) {
                    long j = m10221b.f8041d;
                    C2350b c2350b = (C2350b) C2459l.this.f9779c.mo9806a(m10221b).m9811a(0);
                    if (C2459l.m10206a(c2350b.f9270a, c2350b.f9271b)) {
                        m10220a(j, c2350b);
                    }
                }
            }
            this.f9790a.m9943c();
        }

        @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2337q
        /* renamed from: a */
        public int mo9430a(InterfaceC2289h interfaceC2289h, int i, boolean z) {
            return this.f9790a.mo9430a(interfaceC2289h, i, z);
        }

        /* renamed from: a */
        public void m10223a() {
            this.f9790a.m9953l();
        }

        @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2337q
        /* renamed from: a */
        public void mo9431a(long j, int i, int i2, int i3, InterfaceC2337q.a aVar) {
            this.f9790a.mo9431a(j, i, i2, i3, aVar);
            m10222c();
        }

        @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2337q
        /* renamed from: a */
        public void mo9432a(C2644u c2644u, int i) {
            this.f9790a.mo9432a(c2644u, i);
        }

        @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2337q
        /* renamed from: a */
        public void mo9433a(C2676s c2676s) {
            this.f9790a.mo9433a(c2676s);
        }

        /* renamed from: a */
        public boolean m10224a(long j) {
            return C2459l.this.m10215a(j);
        }

        /* renamed from: a */
        public boolean m10225a(AbstractC2421d abstractC2421d) {
            return C2459l.this.m10216a(abstractC2421d);
        }

        /* renamed from: b */
        public void m10226b(AbstractC2421d abstractC2421d) {
            C2459l.this.m10218b(abstractC2421d);
        }
    }

    public C2459l(C2436b c2436b, b bVar, InterfaceC2590d interfaceC2590d) {
        this.f9782f = c2436b;
        this.f9778b = bVar;
        this.f9777a = interfaceC2590d;
    }

    /* renamed from: a */
    private void m10205a(long j, long j2) {
        Long l = this.f9781e.get(Long.valueOf(j2));
        if (l != null && l.longValue() <= j) {
            return;
        }
        this.f9781e.put(Long.valueOf(j2), Long.valueOf(j));
    }

    /* renamed from: a */
    public static boolean m10206a(String str, String str2) {
        return "urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || "2".equals(str2) || "3".equals(str2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static long m10207b(C2350b c2350b) {
        try {
            return C2622I.m11094g(C2622I.m11056a(c2350b.f9275f));
        } catch (C2683z unused) {
            return -9223372036854775807L;
        }
    }

    /* renamed from: b */
    private Map.Entry<Long, Long> m10209b(long j) {
        return this.f9781e.ceilingEntry(Long.valueOf(j));
    }

    /* renamed from: c */
    private void m10210c() {
        long j = this.f9785i;
        if (j == -9223372036854775807L || j != this.f9784h) {
            this.f9786j = true;
            this.f9785i = this.f9784h;
            this.f9778b.mo10174a();
        }
    }

    /* renamed from: d */
    private void m10211d() {
        this.f9778b.mo10175a(this.f9783g);
    }

    /* renamed from: e */
    private void m10212e() {
        Iterator<Map.Entry<Long, Long>> it = this.f9781e.entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getKey().longValue() < this.f9782f.f9597h) {
                it.remove();
            }
        }
    }

    /* renamed from: a */
    public c m10213a() {
        return new c(new C2403D(this.f9777a));
    }

    /* renamed from: a */
    public void m10214a(C2436b c2436b) {
        this.f9786j = false;
        this.f9783g = -9223372036854775807L;
        this.f9782f = c2436b;
        m10212e();
    }

    /* renamed from: a */
    boolean m10215a(long j) {
        C2436b c2436b = this.f9782f;
        boolean z = false;
        if (!c2436b.f9593d) {
            return false;
        }
        if (this.f9786j) {
            return true;
        }
        Map.Entry<Long, Long> m10209b = m10209b(c2436b.f9597h);
        if (m10209b != null && m10209b.getValue().longValue() < j) {
            this.f9783g = m10209b.getKey().longValue();
            m10211d();
            z = true;
        }
        if (z) {
            m10210c();
        }
        return z;
    }

    /* renamed from: a */
    boolean m10216a(AbstractC2421d abstractC2421d) {
        if (!this.f9782f.f9593d) {
            return false;
        }
        if (this.f9786j) {
            return true;
        }
        long j = this.f9784h;
        if (!(j != -9223372036854775807L && j < abstractC2421d.f9516f)) {
            return false;
        }
        m10210c();
        return true;
    }

    /* renamed from: b */
    public void m10217b() {
        this.f9787k = true;
        this.f9780d.removeCallbacksAndMessages(null);
    }

    /* renamed from: b */
    void m10218b(AbstractC2421d abstractC2421d) {
        long j = this.f9784h;
        if (j != -9223372036854775807L || abstractC2421d.f9517g > j) {
            this.f9784h = abstractC2421d.f9517g;
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (this.f9787k) {
            return true;
        }
        if (message.what != 1) {
            return false;
        }
        a aVar = (a) message.obj;
        m10205a(aVar.f9788a, aVar.f9789b);
        return true;
    }
}
