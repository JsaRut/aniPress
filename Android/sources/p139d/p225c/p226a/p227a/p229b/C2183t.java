package p139d.p225c.p226a.p227a.p229b;

/* renamed from: d.c.a.a.b.t */
/* loaded from: classes.dex */
public final class C2183t {

    /* renamed from: a */
    public final int f7923a;

    /* renamed from: b */
    public final float f7924b;

    public C2183t(int i, float f) {
        this.f7923a = i;
        this.f7924b = f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2183t.class != obj.getClass()) {
            return false;
        }
        C2183t c2183t = (C2183t) obj;
        return this.f7923a == c2183t.f7923a && Float.compare(c2183t.f7924b, this.f7924b) == 0;
    }

    public int hashCode() {
        return ((527 + this.f7923a) * 31) + Float.floatToIntBits(this.f7924b);
    }
}
