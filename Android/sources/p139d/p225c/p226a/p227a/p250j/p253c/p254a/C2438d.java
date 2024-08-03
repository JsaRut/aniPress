package p139d.p225c.p226a.p227a.p250j.p253c.p254a;

import p139d.p225c.p226a.p227a.p270n.C2622I;

/* renamed from: d.c.a.a.j.c.a.d */
/* loaded from: classes.dex */
public final class C2438d {

    /* renamed from: a */
    public final String f9614a;

    /* renamed from: b */
    public final String f9615b;

    /* renamed from: c */
    public final String f9616c;

    public C2438d(String str, String str2, String str3) {
        this.f9614a = str;
        this.f9615b = str2;
        this.f9616c = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2438d.class != obj.getClass()) {
            return false;
        }
        C2438d c2438d = (C2438d) obj;
        return C2622I.m11067a((Object) this.f9614a, (Object) c2438d.f9614a) && C2622I.m11067a((Object) this.f9615b, (Object) c2438d.f9615b) && C2622I.m11067a((Object) this.f9616c, (Object) c2438d.f9616c);
    }

    public int hashCode() {
        String str = this.f9614a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f9615b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f9616c;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }
}
