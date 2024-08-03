package p139d.p225c.p226a.p227a.p270n;

/* renamed from: d.c.a.a.n.F */
/* loaded from: classes.dex */
public final class C2619F {

    /* renamed from: a */
    private long f10913a;

    /* renamed from: b */
    private long f10914b;

    /* renamed from: c */
    private volatile long f10915c = -9223372036854775807L;

    public C2619F(long j) {
        m11025d(j);
    }

    /* renamed from: c */
    public static long m11017c(long j) {
        return (j * 1000000) / 90000;
    }

    /* renamed from: e */
    public static long m11018e(long j) {
        return (j * 90000) / 1000000;
    }

    /* renamed from: a */
    public long m11019a() {
        return this.f10913a;
    }

    /* renamed from: a */
    public long m11020a(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.f10915c != -9223372036854775807L) {
            this.f10915c = j;
        } else {
            long j2 = this.f10913a;
            if (j2 != Long.MAX_VALUE) {
                this.f10914b = j2 - j;
            }
            synchronized (this) {
                this.f10915c = j;
                notifyAll();
            }
        }
        return j + this.f10914b;
    }

    /* renamed from: b */
    public long m11021b() {
        if (this.f10915c != -9223372036854775807L) {
            return this.f10914b + this.f10915c;
        }
        long j = this.f10913a;
        if (j != Long.MAX_VALUE) {
            return j;
        }
        return -9223372036854775807L;
    }

    /* renamed from: b */
    public long m11022b(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.f10915c != -9223372036854775807L) {
            long m11018e = m11018e(this.f10915c);
            long j2 = (4294967296L + m11018e) / 8589934592L;
            long j3 = ((j2 - 1) * 8589934592L) + j;
            j += j2 * 8589934592L;
            if (Math.abs(j3 - m11018e) < Math.abs(j - m11018e)) {
                j = j3;
            }
        }
        return m11020a(m11017c(j));
    }

    /* renamed from: c */
    public long m11023c() {
        if (this.f10913a == Long.MAX_VALUE) {
            return 0L;
        }
        if (this.f10915c == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return this.f10914b;
    }

    /* renamed from: d */
    public void m11024d() {
        this.f10915c = -9223372036854775807L;
    }

    /* renamed from: d */
    public synchronized void m11025d(long j) {
        C2628e.m11113b(this.f10915c == -9223372036854775807L);
        this.f10913a = j;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: e */
    public synchronized void m11026e() {
        while (this.f10915c == -9223372036854775807L) {
            wait();
        }
    }
}
