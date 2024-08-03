package p031c.p032a.p064h;

/* renamed from: c.a.h.a */
/* loaded from: classes.dex */
public final class C0641a {

    /* renamed from: a */
    private C0642b[] f2991a = new C0642b[17];

    /* renamed from: a */
    public final int m3267a(C0648h c0648h) {
        int i = -1;
        for (C0642b c0642b = this.f2991a[(c0648h.hashCode() & Integer.MAX_VALUE) % 17]; c0642b != null; c0642b = c0642b.f2994c) {
            if (c0642b.f2992a.equals(c0648h)) {
                i = c0642b.f2993b;
            }
        }
        return i;
    }

    /* renamed from: a */
    public final void m3268a(int i, C0648h c0648h) {
        if (i > 16383) {
            return;
        }
        int hashCode = (c0648h.hashCode() & Integer.MAX_VALUE) % 17;
        C0642b c0642b = new C0642b((byte) 0);
        c0642b.f2992a = c0648h;
        c0642b.f2993b = i;
        C0642b[] c0642bArr = this.f2991a;
        c0642b.f2994c = c0642bArr[hashCode];
        c0642bArr[hashCode] = c0642b;
    }
}
