package p139d.p225c.p226a.p227a.p234f;

/* renamed from: d.c.a.a.f.p */
/* loaded from: classes.dex */
public final class C2336p {

    /* renamed from: a */
    public static final C2336p f9170a = new C2336p(0, 0);

    /* renamed from: b */
    public final long f9171b;

    /* renamed from: c */
    public final long f9172c;

    public C2336p(long j, long j2) {
        this.f9171b = j;
        this.f9172c = j2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2336p.class != obj.getClass()) {
            return false;
        }
        C2336p c2336p = (C2336p) obj;
        return this.f9171b == c2336p.f9171b && this.f9172c == c2336p.f9172c;
    }

    public int hashCode() {
        return (((int) this.f9171b) * 31) + ((int) this.f9172c);
    }

    public String toString() {
        return "[timeUs=" + this.f9171b + ", position=" + this.f9172c + "]";
    }
}
