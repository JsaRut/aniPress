package p139d.p225c.p226a.p227a;

import android.util.Pair;
import p139d.p225c.p226a.p227a.p250j.p251a.C2416a;
import p139d.p225c.p226a.p227a.p270n.C2628e;

/* renamed from: d.c.a.a.P */
/* loaded from: classes.dex */
public abstract class AbstractC2151P {

    /* renamed from: a */
    public static final AbstractC2151P f7699a = new C2150O();

    /* renamed from: d.c.a.a.P$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public Object f7700a;

        /* renamed from: b */
        public Object f7701b;

        /* renamed from: c */
        public int f7702c;

        /* renamed from: d */
        public long f7703d;

        /* renamed from: e */
        private long f7704e;

        /* renamed from: f */
        private C2416a f7705f;

        /* renamed from: a */
        public int m8655a() {
            return this.f7705f.f9492b;
        }

        /* renamed from: a */
        public int m8656a(int i) {
            return this.f7705f.f9494d[i].f9497a;
        }

        /* renamed from: a */
        public int m8657a(long j) {
            return this.f7705f.m9981a(j);
        }

        /* renamed from: a */
        public long m8658a(int i, int i2) {
            C2416a.a aVar = this.f7705f.f9494d[i];
            if (aVar.f9497a != -1) {
                return aVar.f9500d[i2];
            }
            return -9223372036854775807L;
        }

        /* renamed from: a */
        public a m8659a(Object obj, Object obj2, int i, long j, long j2) {
            m8660a(obj, obj2, i, j, j2, C2416a.f9491a);
            return this;
        }

        /* renamed from: a */
        public a m8660a(Object obj, Object obj2, int i, long j, long j2, C2416a c2416a) {
            this.f7700a = obj;
            this.f7701b = obj2;
            this.f7702c = i;
            this.f7703d = j;
            this.f7704e = j2;
            this.f7705f = c2416a;
            return this;
        }

        /* renamed from: b */
        public int m8661b(int i, int i2) {
            return this.f7705f.f9494d[i].m9984a(i2);
        }

        /* renamed from: b */
        public int m8662b(long j) {
            return this.f7705f.m9982b(j);
        }

        /* renamed from: b */
        public long m8663b() {
            return this.f7705f.f9495e;
        }

        /* renamed from: b */
        public long m8664b(int i) {
            return this.f7705f.f9493c[i];
        }

        /* renamed from: c */
        public int m8665c(int i) {
            return this.f7705f.f9494d[i].m9983a();
        }

        /* renamed from: c */
        public long m8666c() {
            return this.f7703d;
        }

        /* renamed from: c */
        public boolean m8667c(int i, int i2) {
            C2416a.a aVar = this.f7705f.f9494d[i];
            return (aVar.f9497a == -1 || aVar.f9499c[i2] == 0) ? false : true;
        }

        /* renamed from: d */
        public long m8668d() {
            return C2200d.m9048b(this.f7704e);
        }

        /* renamed from: d */
        public boolean m8669d(int i) {
            return !this.f7705f.f9494d[i].m9985b();
        }

        /* renamed from: e */
        public long m8670e() {
            return this.f7704e;
        }
    }

    /* renamed from: d.c.a.a.P$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        public Object f7706a;

        /* renamed from: b */
        public long f7707b;

        /* renamed from: c */
        public long f7708c;

        /* renamed from: d */
        public boolean f7709d;

        /* renamed from: e */
        public boolean f7710e;

        /* renamed from: f */
        public int f7711f;

        /* renamed from: g */
        public int f7712g;

        /* renamed from: h */
        public long f7713h;

        /* renamed from: i */
        public long f7714i;

        /* renamed from: j */
        public long f7715j;

        /* renamed from: a */
        public long m8671a() {
            return C2200d.m9048b(this.f7713h);
        }

        /* renamed from: a */
        public b m8672a(Object obj, long j, long j2, boolean z, boolean z2, long j3, long j4, int i, int i2, long j5) {
            this.f7706a = obj;
            this.f7707b = j;
            this.f7708c = j2;
            this.f7709d = z;
            this.f7710e = z2;
            this.f7713h = j3;
            this.f7714i = j4;
            this.f7711f = i;
            this.f7712g = i2;
            this.f7715j = j5;
            return this;
        }

        /* renamed from: b */
        public long m8673b() {
            return this.f7713h;
        }

        /* renamed from: c */
        public long m8674c() {
            return C2200d.m9048b(this.f7714i);
        }

        /* renamed from: d */
        public long m8675d() {
            return this.f7715j;
        }
    }

    /* renamed from: a */
    public abstract int mo8636a();

    /* renamed from: a */
    public int m8642a(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == m8652b(z)) {
                return -1;
            }
            return i + 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == m8652b(z) ? m8644a(z) : i + 1;
        }
        throw new IllegalStateException();
    }

    /* renamed from: a */
    public final int m8643a(int i, a aVar, b bVar, int i2, boolean z) {
        int i3 = m8647a(i, aVar).f7702c;
        if (m8649a(i3, bVar).f7712g != i) {
            return i + 1;
        }
        int m8642a = m8642a(i3, i2, z);
        if (m8642a == -1) {
            return -1;
        }
        return m8649a(m8642a, bVar).f7711f;
    }

    /* renamed from: a */
    public abstract int mo8637a(Object obj);

    /* renamed from: a */
    public int m8644a(boolean z) {
        return m8654c() ? -1 : 0;
    }

    /* renamed from: a */
    public final Pair<Object, Long> m8645a(b bVar, a aVar, int i, long j) {
        return m8646a(bVar, aVar, i, j, 0L);
    }

    /* renamed from: a */
    public final Pair<Object, Long> m8646a(b bVar, a aVar, int i, long j, long j2) {
        C2628e.m11109a(i, 0, mo8641b());
        mo8639a(i, bVar, false, j2);
        if (j == -9223372036854775807L) {
            j = bVar.m8673b();
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = bVar.f7711f;
        long m8675d = bVar.m8675d() + j;
        while (true) {
            long m8666c = mo8638a(i2, aVar, true).m8666c();
            if (m8666c == -9223372036854775807L || m8675d < m8666c || i2 >= bVar.f7712g) {
                break;
            }
            m8675d -= m8666c;
            i2++;
        }
        return Pair.create(aVar.f7701b, Long.valueOf(m8675d));
    }

    /* renamed from: a */
    public final a m8647a(int i, a aVar) {
        return mo8638a(i, aVar, false);
    }

    /* renamed from: a */
    public abstract a mo8638a(int i, a aVar, boolean z);

    /* renamed from: a */
    public a m8648a(Object obj, a aVar) {
        return mo8638a(mo8637a(obj), aVar, true);
    }

    /* renamed from: a */
    public final b m8649a(int i, b bVar) {
        return m8650a(i, bVar, false);
    }

    /* renamed from: a */
    public final b m8650a(int i, b bVar, boolean z) {
        return mo8639a(i, bVar, z, 0L);
    }

    /* renamed from: a */
    public abstract b mo8639a(int i, b bVar, boolean z, long j);

    /* renamed from: a */
    public abstract Object mo8640a(int i);

    /* renamed from: b */
    public abstract int mo8641b();

    /* renamed from: b */
    public int m8651b(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == m8644a(z)) {
                return -1;
            }
            return i - 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == m8644a(z) ? m8652b(z) : i - 1;
        }
        throw new IllegalStateException();
    }

    /* renamed from: b */
    public int m8652b(boolean z) {
        if (m8654c()) {
            return -1;
        }
        return mo8641b() - 1;
    }

    /* renamed from: b */
    public final boolean m8653b(int i, a aVar, b bVar, int i2, boolean z) {
        return m8643a(i, aVar, bVar, i2, z) == -1;
    }

    /* renamed from: c */
    public final boolean m8654c() {
        return mo8641b() == 0;
    }
}
