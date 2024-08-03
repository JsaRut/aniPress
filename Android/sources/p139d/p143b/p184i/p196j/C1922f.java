package p139d.p143b.p184i.p196j;

/* renamed from: d.b.i.j.f */
/* loaded from: classes.dex */
public class C1922f implements InterfaceC1923g {

    /* renamed from: a */
    public static final InterfaceC1923g f7079a = m7929a(Integer.MAX_VALUE, true, true);

    /* renamed from: b */
    int f7080b;

    /* renamed from: c */
    boolean f7081c;

    /* renamed from: d */
    boolean f7082d;

    private C1922f(int i, boolean z, boolean z2) {
        this.f7080b = i;
        this.f7081c = z;
        this.f7082d = z2;
    }

    /* renamed from: a */
    public static InterfaceC1923g m7929a(int i, boolean z, boolean z2) {
        return new C1922f(i, z, z2);
    }

    @Override // p139d.p143b.p184i.p196j.InterfaceC1923g
    /* renamed from: a */
    public boolean mo7930a() {
        return this.f7082d;
    }

    @Override // p139d.p143b.p184i.p196j.InterfaceC1923g
    /* renamed from: b */
    public boolean mo7931b() {
        return this.f7081c;
    }

    @Override // p139d.p143b.p184i.p196j.InterfaceC1923g
    /* renamed from: c */
    public int mo7932c() {
        return this.f7080b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1922f)) {
            return false;
        }
        C1922f c1922f = (C1922f) obj;
        return this.f7080b == c1922f.f7080b && this.f7081c == c1922f.f7081c && this.f7082d == c1922f.f7082d;
    }

    public int hashCode() {
        return (this.f7080b ^ (this.f7081c ? 4194304 : 0)) ^ (this.f7082d ? 8388608 : 0);
    }
}
