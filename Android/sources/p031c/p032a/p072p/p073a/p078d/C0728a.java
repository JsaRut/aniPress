package p031c.p032a.p072p.p073a.p078d;

/* renamed from: c.a.p.a.d.a */
/* loaded from: classes.dex */
public final class C0728a {

    /* renamed from: a */
    private String f3308a;

    /* renamed from: b */
    private String f3309b;

    /* renamed from: c */
    private String f3310c;

    public C0728a(String str, String str2, String str3) {
        this.f3308a = str;
        this.f3309b = str2;
        this.f3310c = str3;
    }

    /* renamed from: a */
    public final String m3697a() {
        return this.f3308a;
    }

    /* renamed from: b */
    public final String m3698b() {
        return this.f3309b;
    }

    /* renamed from: c */
    public final String m3699c() {
        return this.f3310c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0728a)) {
            return false;
        }
        C0728a c0728a = (C0728a) obj;
        if (!this.f3308a.equals(c0728a.f3308a)) {
            return false;
        }
        String str = this.f3309b;
        if (str == null ? c0728a.f3309b != null : !str.equals(c0728a.f3309b)) {
            return false;
        }
        String str2 = this.f3310c;
        return str2 != null ? str2.equals(c0728a.f3310c) : c0728a.f3310c == null;
    }

    public final int hashCode() {
        int hashCode = this.f3308a.hashCode() * 31;
        String str = this.f3309b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f3310c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "ViewId{viewTreePath='" + this.f3308a + "', pos='" + this.f3309b + "', text='" + this.f3310c + "'}";
    }
}
