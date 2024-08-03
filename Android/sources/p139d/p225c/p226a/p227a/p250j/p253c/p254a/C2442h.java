package p139d.p225c.p226a.p227a.p250j.p253c.p254a;

import android.net.Uri;
import p139d.p225c.p226a.p227a.p270n.C2621H;

/* renamed from: d.c.a.a.j.c.a.h */
/* loaded from: classes.dex */
public final class C2442h {

    /* renamed from: a */
    public final long f9631a;

    /* renamed from: b */
    public final long f9632b;

    /* renamed from: c */
    private final String f9633c;

    /* renamed from: d */
    private int f9634d;

    public C2442h(String str, long j, long j2) {
        this.f9633c = str == null ? "" : str;
        this.f9631a = j;
        this.f9632b = j2;
    }

    /* renamed from: a */
    public Uri m10098a(String str) {
        return C2621H.m11034b(str, this.f9633c);
    }

    /* renamed from: a */
    public C2442h m10099a(C2442h c2442h, String str) {
        String m10100b = m10100b(str);
        if (c2442h != null && m10100b.equals(c2442h.m10100b(str))) {
            long j = this.f9632b;
            if (j != -1) {
                long j2 = this.f9631a;
                if (j2 + j == c2442h.f9631a) {
                    long j3 = c2442h.f9632b;
                    return new C2442h(m10100b, j2, j3 != -1 ? j + j3 : -1L);
                }
            }
            long j4 = c2442h.f9632b;
            if (j4 != -1) {
                long j5 = c2442h.f9631a;
                if (j5 + j4 == this.f9631a) {
                    long j6 = this.f9632b;
                    return new C2442h(m10100b, j5, j6 != -1 ? j4 + j6 : -1L);
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    public String m10100b(String str) {
        return C2621H.m11031a(str, this.f9633c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2442h.class != obj.getClass()) {
            return false;
        }
        C2442h c2442h = (C2442h) obj;
        return this.f9631a == c2442h.f9631a && this.f9632b == c2442h.f9632b && this.f9633c.equals(c2442h.f9633c);
    }

    public int hashCode() {
        if (this.f9634d == 0) {
            this.f9634d = ((((527 + ((int) this.f9631a)) * 31) + ((int) this.f9632b)) * 31) + this.f9633c.hashCode();
        }
        return this.f9634d;
    }

    public String toString() {
        return "RangedUri(referenceUri=" + this.f9633c + ", start=" + this.f9631a + ", length=" + this.f9632b + ")";
    }
}
