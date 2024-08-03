package p139d.p225c.p226a.p227a.p234f;

import p139d.p225c.p226a.p227a.p270n.C2628e;

/* renamed from: d.c.a.a.f.o */
/* loaded from: classes.dex */
public interface InterfaceC2335o {

    /* renamed from: d.c.a.a.f.o$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final C2336p f9166a;

        /* renamed from: b */
        public final C2336p f9167b;

        public a(C2336p c2336p) {
            this(c2336p, c2336p);
        }

        public a(C2336p c2336p, C2336p c2336p2) {
            C2628e.m11110a(c2336p);
            this.f9166a = c2336p;
            C2628e.m11110a(c2336p2);
            this.f9167b = c2336p2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f9166a.equals(aVar.f9166a) && this.f9167b.equals(aVar.f9167b);
        }

        public int hashCode() {
            return (this.f9166a.hashCode() * 31) + this.f9167b.hashCode();
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            sb.append(this.f9166a);
            if (this.f9166a.equals(this.f9167b)) {
                str = "";
            } else {
                str = ", " + this.f9167b;
            }
            sb.append(str);
            sb.append("]");
            return sb.toString();
        }
    }

    /* renamed from: d.c.a.a.f.o$b */
    /* loaded from: classes.dex */
    public static final class b implements InterfaceC2335o {

        /* renamed from: a */
        private final long f9168a;

        /* renamed from: b */
        private final a f9169b;

        public b(long j) {
            this(j, 0L);
        }

        public b(long j, long j2) {
            this.f9168a = j;
            this.f9169b = new a(j2 == 0 ? C2336p.f9170a : new C2336p(0L, j2));
        }

        @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2335o
        /* renamed from: b */
        public a mo9138b(long j) {
            return this.f9169b;
        }

        @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2335o
        /* renamed from: c */
        public boolean mo9140c() {
            return false;
        }

        @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2335o
        /* renamed from: d */
        public long mo9141d() {
            return this.f9168a;
        }
    }

    /* renamed from: b */
    a mo9138b(long j);

    /* renamed from: c */
    boolean mo9140c();

    /* renamed from: d */
    long mo9141d();
}
