package p139d.p225c.p226a.p227a;

import p139d.p225c.p226a.p227a.p270n.C2628e;

/* renamed from: d.c.a.a.B */
/* loaded from: classes.dex */
public final class C2137B {

    /* renamed from: a */
    public static final C2137B f7641a = new C2137B(1.0f);

    /* renamed from: b */
    public final float f7642b;

    /* renamed from: c */
    public final float f7643c;

    /* renamed from: d */
    public final boolean f7644d;

    /* renamed from: e */
    private final int f7645e;

    public C2137B(float f) {
        this(f, 1.0f, false);
    }

    public C2137B(float f, float f2) {
        this(f, f2, false);
    }

    public C2137B(float f, float f2, boolean z) {
        C2628e.m11111a(f > 0.0f);
        C2628e.m11111a(f2 > 0.0f);
        this.f7642b = f;
        this.f7643c = f2;
        this.f7644d = z;
        this.f7645e = Math.round(f * 1000.0f);
    }

    /* renamed from: a */
    public long m8509a(long j) {
        return j * this.f7645e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2137B.class != obj.getClass()) {
            return false;
        }
        C2137B c2137b = (C2137B) obj;
        return this.f7642b == c2137b.f7642b && this.f7643c == c2137b.f7643c && this.f7644d == c2137b.f7644d;
    }

    public int hashCode() {
        return ((((527 + Float.floatToRawIntBits(this.f7642b)) * 31) + Float.floatToRawIntBits(this.f7643c)) * 31) + (this.f7644d ? 1 : 0);
    }
}
