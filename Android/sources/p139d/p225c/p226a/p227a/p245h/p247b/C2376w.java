package p139d.p225c.p226a.p227a.p245h.p247b;

import android.os.Parcel;
import android.os.Parcelable;
import p139d.p225c.p226a.p227a.p270n.C2622I;

/* renamed from: d.c.a.a.h.b.w */
/* loaded from: classes.dex */
public final class C2376w extends AbstractC2368o {
    public static final Parcelable.Creator<C2376w> CREATOR = new C2375v();

    /* renamed from: a */
    public final String f9321a;

    /* renamed from: b */
    public final String f9322b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C2376w(android.os.Parcel r2) {
        /*
            r1 = this;
            java.lang.String r0 = r2.readString()
            p139d.p225c.p226a.p227a.p270n.C2622I.m11050a(r0)
            java.lang.String r0 = (java.lang.String) r0
            r1.<init>(r0)
            java.lang.String r0 = r2.readString()
            r1.f9321a = r0
            java.lang.String r2 = r2.readString()
            p139d.p225c.p226a.p227a.p270n.C2622I.m11050a(r2)
            java.lang.String r2 = (java.lang.String) r2
            r1.f9322b = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p139d.p225c.p226a.p227a.p245h.p247b.C2376w.<init>(android.os.Parcel):void");
    }

    public C2376w(String str, String str2, String str3) {
        super(str);
        this.f9321a = str2;
        this.f9322b = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2376w.class != obj.getClass()) {
            return false;
        }
        C2376w c2376w = (C2376w) obj;
        return super.f9310a.equals(((AbstractC2368o) c2376w).f9310a) && C2622I.m11067a((Object) this.f9321a, (Object) c2376w.f9321a) && C2622I.m11067a((Object) this.f9322b, (Object) c2376w.f9322b);
    }

    public int hashCode() {
        int hashCode = (527 + super.f9310a.hashCode()) * 31;
        String str = this.f9321a;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f9322b;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // p139d.p225c.p226a.p227a.p245h.p247b.AbstractC2368o
    public String toString() {
        return super.f9310a + ": value=" + this.f9322b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(super.f9310a);
        parcel.writeString(this.f9321a);
        parcel.writeString(this.f9322b);
    }
}
