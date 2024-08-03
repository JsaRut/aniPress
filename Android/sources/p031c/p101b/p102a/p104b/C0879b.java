package p031c.p101b.p102a.p104b;

import java.util.Set;

/* renamed from: c.b.a.b.b */
/* loaded from: classes.dex */
public class C0879b {

    /* renamed from: a */
    private long f3699a;

    /* renamed from: b */
    public String f3700b;

    /* renamed from: c */
    public Set<String> f3701c;

    /* renamed from: d */
    public InterfaceC0888k f3702d;

    /* renamed from: e */
    public int f3703e;

    /* renamed from: f */
    public int f3704f;

    /* renamed from: g */
    public int f3705g;

    public C0879b(int i, String str, long j, int i2, int i3) {
        this.f3704f = 0;
        this.f3705g = 0;
        this.f3703e = i;
        this.f3700b = str;
        this.f3699a = j;
        this.f3704f = i2;
        this.f3705g = i3;
    }

    public C0879b(int i, Set<String> set, long j, int i2, int i3) {
        this.f3704f = 0;
        this.f3705g = 0;
        this.f3703e = i;
        this.f3701c = set;
        this.f3699a = j;
        this.f3704f = i2;
        this.f3705g = i3;
    }

    /* renamed from: a */
    public boolean m4304a(long j) {
        return this.f3704f == 0 && System.currentTimeMillis() - this.f3699a > j + 10000;
    }

    public String toString() {
        return "CallBackParams{sendTime=" + this.f3699a + ", alias='" + this.f3700b + "', tags=" + this.f3701c + ", tagAliasCallBack=" + this.f3702d + ", sequence=" + this.f3703e + ", protoType=" + this.f3704f + ", action=" + this.f3705g + '}';
    }
}
