package p139d.p225c.p226a.p227a;

import p139d.p225c.p226a.p227a.p270n.C2628e;

/* renamed from: d.c.a.a.L */
/* loaded from: classes.dex */
public final class C2147L {

    /* renamed from: a */
    public static final C2147L f7661a = new C2147L(0, 0);

    /* renamed from: b */
    public static final C2147L f7662b = new C2147L(Long.MAX_VALUE, Long.MAX_VALUE);

    /* renamed from: c */
    public static final C2147L f7663c = new C2147L(Long.MAX_VALUE, 0);

    /* renamed from: d */
    public static final C2147L f7664d = new C2147L(0, Long.MAX_VALUE);

    /* renamed from: e */
    public static final C2147L f7665e = f7661a;

    /* renamed from: f */
    public final long f7666f;

    /* renamed from: g */
    public final long f7667g;

    public C2147L(long j, long j2) {
        C2628e.m11111a(j >= 0);
        C2628e.m11111a(j2 >= 0);
        this.f7666f = j;
        this.f7667g = j2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2147L.class != obj.getClass()) {
            return false;
        }
        C2147L c2147l = (C2147L) obj;
        return this.f7666f == c2147l.f7666f && this.f7667g == c2147l.f7667g;
    }

    public int hashCode() {
        return (((int) this.f7666f) * 31) + ((int) this.f7667g);
    }
}
