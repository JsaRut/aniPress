package p139d.p225c.p226a.p227a.p250j.p253c.p254a;

import java.util.List;
import p139d.p225c.p226a.p227a.C2676s;
import p139d.p225c.p226a.p227a.p270n.C2622I;

/* renamed from: d.c.a.a.j.c.a.k */
/* loaded from: classes.dex */
public abstract class AbstractC2445k {

    /* renamed from: a */
    final C2442h f9648a;

    /* renamed from: b */
    final long f9649b;

    /* renamed from: c */
    final long f9650c;

    /* renamed from: d.c.a.a.j.c.a.k$a */
    /* loaded from: classes.dex */
    public static abstract class a extends AbstractC2445k {

        /* renamed from: d */
        final long f9651d;

        /* renamed from: e */
        final long f9652e;

        /* renamed from: f */
        final List<d> f9653f;

        public a(C2442h c2442h, long j, long j2, long j3, long j4, List<d> list) {
            super(c2442h, j, j2);
            this.f9651d = j3;
            this.f9652e = j4;
            this.f9653f = list;
        }

        /* renamed from: a */
        public abstract int mo10116a(long j);

        /* renamed from: a */
        public final long m10117a(long j, long j2) {
            List<d> list = this.f9653f;
            if (list != null) {
                return (list.get((int) (j - this.f9651d)).f9658b * 1000000) / this.f9649b;
            }
            int mo10116a = mo10116a(j2);
            return (mo10116a == -1 || j != (m10119b() + ((long) mo10116a)) - 1) ? (this.f9652e * 1000000) / this.f9649b : j2 - m10120b(j);
        }

        /* renamed from: a */
        public abstract C2442h mo10118a(AbstractC2444j abstractC2444j, long j);

        /* renamed from: b */
        public long m10119b() {
            return this.f9651d;
        }

        /* renamed from: b */
        public final long m10120b(long j) {
            List<d> list = this.f9653f;
            return C2622I.m11085c(list != null ? list.get((int) (j - this.f9651d)).f9657a - this.f9650c : (j - this.f9651d) * this.f9652e, 1000000L, this.f9649b);
        }

        /* renamed from: b */
        public long m10121b(long j, long j2) {
            long m10119b = m10119b();
            long mo10116a = mo10116a(j2);
            if (mo10116a == 0) {
                return m10119b;
            }
            if (this.f9653f == null) {
                long j3 = (j / ((this.f9652e * 1000000) / this.f9649b)) + this.f9651d;
                return j3 < m10119b ? m10119b : mo10116a == -1 ? j3 : Math.min(j3, (m10119b + mo10116a) - 1);
            }
            long j4 = (mo10116a + m10119b) - 1;
            long j5 = m10119b;
            while (j5 <= j4) {
                long j6 = ((j4 - j5) / 2) + j5;
                long m10120b = m10120b(j6);
                if (m10120b < j) {
                    j5 = j6 + 1;
                } else {
                    if (m10120b <= j) {
                        return j6;
                    }
                    j4 = j6 - 1;
                }
            }
            return j5 == m10119b ? j5 : j4;
        }

        /* renamed from: c */
        public boolean mo10122c() {
            return this.f9653f != null;
        }
    }

    /* renamed from: d.c.a.a.j.c.a.k$b */
    /* loaded from: classes.dex */
    public static class b extends a {

        /* renamed from: g */
        final List<C2442h> f9654g;

        public b(C2442h c2442h, long j, long j2, long j3, long j4, List<d> list, List<C2442h> list2) {
            super(c2442h, j, j2, j3, j4, list);
            this.f9654g = list2;
        }

        @Override // p139d.p225c.p226a.p227a.p250j.p253c.p254a.AbstractC2445k.a
        /* renamed from: a */
        public int mo10116a(long j) {
            return this.f9654g.size();
        }

        @Override // p139d.p225c.p226a.p227a.p250j.p253c.p254a.AbstractC2445k.a
        /* renamed from: a */
        public C2442h mo10118a(AbstractC2444j abstractC2444j, long j) {
            return this.f9654g.get((int) (j - this.f9651d));
        }

        @Override // p139d.p225c.p226a.p227a.p250j.p253c.p254a.AbstractC2445k.a
        /* renamed from: c */
        public boolean mo10122c() {
            return true;
        }
    }

    /* renamed from: d.c.a.a.j.c.a.k$c */
    /* loaded from: classes.dex */
    public static class c extends a {

        /* renamed from: g */
        final C2447m f9655g;

        /* renamed from: h */
        final C2447m f9656h;

        public c(C2442h c2442h, long j, long j2, long j3, long j4, List<d> list, C2447m c2447m, C2447m c2447m2) {
            super(c2442h, j, j2, j3, j4, list);
            this.f9655g = c2447m;
            this.f9656h = c2447m2;
        }

        @Override // p139d.p225c.p226a.p227a.p250j.p253c.p254a.AbstractC2445k.a
        /* renamed from: a */
        public int mo10116a(long j) {
            List<d> list = this.f9653f;
            if (list != null) {
                return list.size();
            }
            if (j != -9223372036854775807L) {
                return (int) C2622I.m11044a(j, (this.f9652e * 1000000) / this.f9649b);
            }
            return -1;
        }

        @Override // p139d.p225c.p226a.p227a.p250j.p253c.p254a.AbstractC2445k
        /* renamed from: a */
        public C2442h mo10115a(AbstractC2444j abstractC2444j) {
            C2447m c2447m = this.f9655g;
            if (c2447m == null) {
                return super.mo10115a(abstractC2444j);
            }
            C2676s c2676s = abstractC2444j.f9637c;
            return new C2442h(c2447m.m10126a(c2676s.f11176a, 0L, c2676s.f11178c, 0L), 0L, -1L);
        }

        @Override // p139d.p225c.p226a.p227a.p250j.p253c.p254a.AbstractC2445k.a
        /* renamed from: a */
        public C2442h mo10118a(AbstractC2444j abstractC2444j, long j) {
            List<d> list = this.f9653f;
            long j2 = list != null ? list.get((int) (j - this.f9651d)).f9657a : (j - this.f9651d) * this.f9652e;
            C2447m c2447m = this.f9656h;
            C2676s c2676s = abstractC2444j.f9637c;
            return new C2442h(c2447m.m10126a(c2676s.f11176a, j, c2676s.f11178c, j2), 0L, -1L);
        }
    }

    /* renamed from: d.c.a.a.j.c.a.k$d */
    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a */
        final long f9657a;

        /* renamed from: b */
        final long f9658b;

        public d(long j, long j2) {
            this.f9657a = j;
            this.f9658b = j2;
        }
    }

    /* renamed from: d.c.a.a.j.c.a.k$e */
    /* loaded from: classes.dex */
    public static class e extends AbstractC2445k {

        /* renamed from: d */
        final long f9659d;

        /* renamed from: e */
        final long f9660e;

        public e() {
            this(null, 1L, 0L, 0L, 0L);
        }

        public e(C2442h c2442h, long j, long j2, long j3, long j4) {
            super(c2442h, j, j2);
            this.f9659d = j3;
            this.f9660e = j4;
        }

        /* renamed from: b */
        public C2442h m10123b() {
            long j = this.f9660e;
            if (j <= 0) {
                return null;
            }
            return new C2442h(null, this.f9659d, j);
        }
    }

    public AbstractC2445k(C2442h c2442h, long j, long j2) {
        this.f9648a = c2442h;
        this.f9649b = j;
        this.f9650c = j2;
    }

    /* renamed from: a */
    public long m10114a() {
        return C2622I.m11085c(this.f9650c, 1000000L, this.f9649b);
    }

    /* renamed from: a */
    public C2442h mo10115a(AbstractC2444j abstractC2444j) {
        return this.f9648a;
    }
}
