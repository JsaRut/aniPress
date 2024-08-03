package p139d.p225c.p226a.p227a.p234f;

import p139d.p225c.p226a.p227a.p234f.InterfaceC2335o;
import p139d.p225c.p226a.p227a.p270n.C2622I;
import p139d.p225c.p226a.p227a.p270n.C2628e;

/* renamed from: d.c.a.a.f.a */
/* loaded from: classes.dex */
public abstract class AbstractC2227a {

    /* renamed from: a */
    protected final a f8138a;

    /* renamed from: b */
    protected final g f8139b;

    /* renamed from: c */
    protected d f8140c;

    /* renamed from: d */
    private final int f8141d;

    /* renamed from: d.c.a.a.f.a$a */
    /* loaded from: classes.dex */
    public static class a implements InterfaceC2335o {

        /* renamed from: a */
        private final e f8142a;

        /* renamed from: b */
        private final long f8143b;

        /* renamed from: c */
        private final long f8144c;

        /* renamed from: d */
        private final long f8145d;

        /* renamed from: e */
        private final long f8146e;

        /* renamed from: f */
        private final long f8147f;

        /* renamed from: g */
        private final long f8148g;

        public a(e eVar, long j, long j2, long j3, long j4, long j5, long j6) {
            this.f8142a = eVar;
            this.f8143b = j;
            this.f8144c = j2;
            this.f8145d = j3;
            this.f8146e = j4;
            this.f8147f = j5;
            this.f8148g = j6;
        }

        @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2335o
        /* renamed from: b */
        public InterfaceC2335o.a mo9138b(long j) {
            this.f8142a.mo9143a(j);
            return new InterfaceC2335o.a(new C2336p(j, d.m9163a(j, this.f8144c, this.f8145d, this.f8146e, this.f8147f, this.f8148g)));
        }

        /* renamed from: c */
        public long m9139c(long j) {
            this.f8142a.mo9143a(j);
            return j;
        }

        @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2335o
        /* renamed from: c */
        public boolean mo9140c() {
            return true;
        }

        @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2335o
        /* renamed from: d */
        public long mo9141d() {
            return this.f8143b;
        }
    }

    /* renamed from: d.c.a.a.f.a$b */
    /* loaded from: classes.dex */
    public static final class b implements e {
        @Override // p139d.p225c.p226a.p227a.p234f.AbstractC2227a.e
        /* renamed from: a */
        public long mo9143a(long j) {
            return j;
        }
    }

    /* renamed from: d.c.a.a.f.a$c */
    /* loaded from: classes.dex */
    public static final class c {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d.c.a.a.f.a$d */
    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a */
        private final long f8171a;

        /* renamed from: b */
        private final long f8172b;

        /* renamed from: c */
        private final long f8173c;

        /* renamed from: d */
        private long f8174d;

        /* renamed from: e */
        private long f8175e;

        /* renamed from: f */
        private long f8176f;

        /* renamed from: g */
        private long f8177g;

        /* renamed from: h */
        private long f8178h;

        protected d(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
            this.f8171a = j;
            this.f8172b = j2;
            this.f8174d = j3;
            this.f8175e = j4;
            this.f8176f = j5;
            this.f8177g = j6;
            this.f8173c = j7;
            this.f8178h = m9163a(j2, j3, j4, j5, j6, j7);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public long m9162a() {
            return this.f8177g;
        }

        /* renamed from: a */
        protected static long m9163a(long j, long j2, long j3, long j4, long j5, long j6) {
            if (j4 + 1 >= j5 || j2 + 1 >= j3) {
                return j4;
            }
            long j7 = ((float) (j - j2)) * (((float) (j5 - j4)) / ((float) (j3 - j2)));
            return C2622I.m11081b(((j7 + j4) - j6) - (j7 / 20), j4, j5 - 1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public void m9165a(long j, long j2) {
            this.f8175e = j;
            this.f8177g = j2;
            m9177f();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public long m9167b() {
            return this.f8176f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public void m9169b(long j, long j2) {
            this.f8174d = j;
            this.f8176f = j2;
            m9177f();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public long m9171c() {
            return this.f8178h;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public long m9173d() {
            return this.f8171a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public long m9175e() {
            return this.f8172b;
        }

        /* renamed from: f */
        private void m9177f() {
            this.f8178h = m9163a(this.f8172b, this.f8174d, this.f8175e, this.f8176f, this.f8177g, this.f8173c);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d.c.a.a.f.a$e */
    /* loaded from: classes.dex */
    public interface e {
        /* renamed from: a */
        long mo9143a(long j);
    }

    /* renamed from: d.c.a.a.f.a$f */
    /* loaded from: classes.dex */
    public static final class f {

        /* renamed from: a */
        public static final f f8179a = new f(-3, -9223372036854775807L, -1);

        /* renamed from: b */
        private final int f8180b;

        /* renamed from: c */
        private final long f8181c;

        /* renamed from: d */
        private final long f8182d;

        private f(int i, long j, long j2) {
            this.f8180b = i;
            this.f8181c = j;
            this.f8182d = j2;
        }

        /* renamed from: a */
        public static f m9179a(long j) {
            return new f(0, -9223372036854775807L, j);
        }

        /* renamed from: a */
        public static f m9180a(long j, long j2) {
            return new f(-1, j, j2);
        }

        /* renamed from: b */
        public static f m9182b(long j, long j2) {
            return new f(-2, j, j2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d.c.a.a.f.a$g */
    /* loaded from: classes.dex */
    public interface g {
        /* renamed from: a */
        f mo9184a(InterfaceC2289h interfaceC2289h, long j, c cVar);

        /* renamed from: a */
        void mo9185a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC2227a(e eVar, g gVar, long j, long j2, long j3, long j4, long j5, long j6, int i) {
        this.f8139b = gVar;
        this.f8141d = i;
        this.f8138a = new a(eVar, j, j2, j3, j4, j5, j6);
    }

    /* renamed from: a */
    protected final int m9124a(InterfaceC2289h interfaceC2289h, long j, C2334n c2334n) {
        if (j == interfaceC2289h.getPosition()) {
            return 0;
        }
        c2334n.f9165a = j;
        return 1;
    }

    /* renamed from: a */
    public int m9125a(InterfaceC2289h interfaceC2289h, C2334n c2334n, c cVar) {
        g gVar = this.f8139b;
        C2628e.m11110a(gVar);
        g gVar2 = gVar;
        while (true) {
            d dVar = this.f8140c;
            C2628e.m11110a(dVar);
            d dVar2 = dVar;
            long m9167b = dVar2.m9167b();
            long m9162a = dVar2.m9162a();
            long m9171c = dVar2.m9171c();
            if (m9162a - m9167b <= this.f8141d) {
                m9128a(false, m9167b);
                return m9124a(interfaceC2289h, m9167b, c2334n);
            }
            if (!m9129a(interfaceC2289h, m9171c)) {
                return m9124a(interfaceC2289h, m9171c, c2334n);
            }
            interfaceC2289h.mo9280b();
            f mo9184a = gVar2.mo9184a(interfaceC2289h, dVar2.m9175e(), cVar);
            int i = mo9184a.f8180b;
            if (i == -3) {
                m9128a(false, m9171c);
                return m9124a(interfaceC2289h, m9171c, c2334n);
            }
            if (i == -2) {
                dVar2.m9169b(mo9184a.f8181c, mo9184a.f8182d);
            } else {
                if (i != -1) {
                    if (i != 0) {
                        throw new IllegalStateException("Invalid case");
                    }
                    m9128a(true, mo9184a.f8182d);
                    m9129a(interfaceC2289h, mo9184a.f8182d);
                    return m9124a(interfaceC2289h, mo9184a.f8182d, c2334n);
                }
                dVar2.m9165a(mo9184a.f8181c, mo9184a.f8182d);
            }
        }
    }

    /* renamed from: a */
    protected d m9126a(long j) {
        this.f8138a.m9139c(j);
        return new d(j, j, this.f8138a.f8144c, this.f8138a.f8145d, this.f8138a.f8146e, this.f8138a.f8147f, this.f8138a.f8148g);
    }

    /* renamed from: a */
    public final InterfaceC2335o m9127a() {
        return this.f8138a;
    }

    /* renamed from: a */
    protected final void m9128a(boolean z, long j) {
        this.f8140c = null;
        this.f8139b.mo9185a();
        m9131b(z, j);
    }

    /* renamed from: a */
    protected final boolean m9129a(InterfaceC2289h interfaceC2289h, long j) {
        long position = j - interfaceC2289h.getPosition();
        if (position < 0 || position > 262144) {
            return false;
        }
        interfaceC2289h.mo9283c((int) position);
        return true;
    }

    /* renamed from: b */
    public final void m9130b(long j) {
        d dVar = this.f8140c;
        if (dVar == null || dVar.m9173d() != j) {
            this.f8140c = m9126a(j);
        }
    }

    /* renamed from: b */
    protected void m9131b(boolean z, long j) {
    }

    /* renamed from: b */
    public final boolean m9132b() {
        return this.f8140c != null;
    }
}
