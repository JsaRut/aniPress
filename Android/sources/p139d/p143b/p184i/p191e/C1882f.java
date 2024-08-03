package p139d.p143b.p184i.p191e;

import p139d.p143b.p148c.p159k.C1724b;

/* renamed from: d.b.i.e.f */
/* loaded from: classes.dex */
public class C1882f {

    /* renamed from: a */
    private static final C1882f f6869a = new C1882f(-1, false);

    /* renamed from: b */
    private static final C1882f f6870b = new C1882f(-2, false);

    /* renamed from: c */
    private static final C1882f f6871c = new C1882f(-1, true);

    /* renamed from: d */
    private final int f6872d;

    /* renamed from: e */
    private final boolean f6873e;

    private C1882f(int i, boolean z) {
        this.f6872d = i;
        this.f6873e = z;
    }

    /* renamed from: a */
    public static C1882f m7660a() {
        return f6869a;
    }

    /* renamed from: b */
    public static C1882f m7661b() {
        return f6871c;
    }

    /* renamed from: d */
    public static C1882f m7662d() {
        return f6870b;
    }

    /* renamed from: c */
    public boolean m7663c() {
        return this.f6873e;
    }

    /* renamed from: e */
    public int m7664e() {
        if (m7666g()) {
            throw new IllegalStateException("Rotation is set to use EXIF");
        }
        return this.f6872d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1882f)) {
            return false;
        }
        C1882f c1882f = (C1882f) obj;
        return this.f6872d == c1882f.f6872d && this.f6873e == c1882f.f6873e;
    }

    /* renamed from: f */
    public boolean m7665f() {
        return this.f6872d != -2;
    }

    /* renamed from: g */
    public boolean m7666g() {
        return this.f6872d == -1;
    }

    public int hashCode() {
        return C1724b.m7074a(Integer.valueOf(this.f6872d), Boolean.valueOf(this.f6873e));
    }

    public String toString() {
        return String.format(null, "%d defer:%b", Integer.valueOf(this.f6872d), Boolean.valueOf(this.f6873e));
    }
}
