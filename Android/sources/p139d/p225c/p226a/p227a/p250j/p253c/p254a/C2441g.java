package p139d.p225c.p226a.p227a.p250j.p253c.p254a;

import p139d.p225c.p226a.p227a.p270n.C2622I;

/* renamed from: d.c.a.a.j.c.a.g */
/* loaded from: classes.dex */
public class C2441g {

    /* renamed from: a */
    public final String f9626a;

    /* renamed from: b */
    public final String f9627b;

    /* renamed from: c */
    public final String f9628c;

    /* renamed from: d */
    public final String f9629d;

    /* renamed from: e */
    public final String f9630e;

    public C2441g(String str, String str2, String str3, String str4, String str5) {
        this.f9626a = str;
        this.f9627b = str2;
        this.f9628c = str3;
        this.f9629d = str4;
        this.f9630e = str5;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2441g.class != obj.getClass()) {
            return false;
        }
        C2441g c2441g = (C2441g) obj;
        return C2622I.m11067a((Object) this.f9626a, (Object) c2441g.f9626a) && C2622I.m11067a((Object) this.f9627b, (Object) c2441g.f9627b) && C2622I.m11067a((Object) this.f9628c, (Object) c2441g.f9628c) && C2622I.m11067a((Object) this.f9629d, (Object) c2441g.f9629d) && C2622I.m11067a((Object) this.f9630e, (Object) c2441g.f9630e);
    }

    public int hashCode() {
        String str = this.f9626a;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f9627b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f9628c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f9629d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f9630e;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }
}
