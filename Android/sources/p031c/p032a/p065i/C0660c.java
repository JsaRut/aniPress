package p031c.p032a.p065i;

/* renamed from: c.a.i.c */
/* loaded from: classes.dex */
public final class C0660c {

    /* renamed from: a */
    int f3059a = 0;

    /* renamed from: b */
    public long f3060b;

    /* renamed from: c */
    public String f3061c;

    /* renamed from: d */
    int f3062d;

    /* renamed from: e */
    int f3063e;

    /* renamed from: f */
    long f3064f;

    /* renamed from: g */
    byte[] f3065g;

    /* renamed from: h */
    long f3066h;

    /* renamed from: i */
    long f3067i;

    /* renamed from: j */
    boolean f3068j;

    public C0660c(long j, String str, int i, int i2, long j2, long j3, byte[] bArr) {
        this.f3060b = j;
        this.f3061c = str;
        this.f3062d = i;
        this.f3063e = i2;
        this.f3064f = j2;
        this.f3067i = j3;
        this.f3065g = bArr;
        if (j3 > 0) {
            this.f3068j = true;
        }
    }

    public final String toString() {
        return "InnerRequest{times=" + this.f3059a + ", requestId=" + this.f3060b + ", sdkType='" + this.f3061c + "', command=" + this.f3062d + ", ver=" + this.f3063e + ", rid=" + this.f3064f + ", reqeustTime=" + this.f3066h + ", timeout=" + this.f3067i + '}';
    }
}
