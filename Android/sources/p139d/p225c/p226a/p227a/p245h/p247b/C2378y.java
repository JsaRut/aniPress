package p139d.p225c.p226a.p227a.p245h.p247b;

import android.os.Parcel;
import android.os.Parcelable;
import p139d.p225c.p226a.p227a.p270n.C2622I;

/* renamed from: d.c.a.a.h.b.y */
/* loaded from: classes.dex */
public final class C2378y extends AbstractC2368o {
    public static final Parcelable.Creator<C2378y> CREATOR = new C2377x();

    /* renamed from: a */
    public final String f9323a;

    /* renamed from: b */
    public final String f9324b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C2378y(android.os.Parcel r2) {
        /*
            r1 = this;
            java.lang.String r0 = r2.readString()
            p139d.p225c.p226a.p227a.p270n.C2622I.m11050a(r0)
            java.lang.String r0 = (java.lang.String) r0
            r1.<init>(r0)
            java.lang.String r0 = r2.readString()
            r1.f9323a = r0
            java.lang.String r2 = r2.readString()
            p139d.p225c.p226a.p227a.p270n.C2622I.m11050a(r2)
            java.lang.String r2 = (java.lang.String) r2
            r1.f9324b = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p139d.p225c.p226a.p227a.p245h.p247b.C2378y.<init>(android.os.Parcel):void");
    }

    public C2378y(String str, String str2, String str3) {
        super(str);
        this.f9323a = str2;
        this.f9324b = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2378y.class != obj.getClass()) {
            return false;
        }
        C2378y c2378y = (C2378y) obj;
        return super.f9310a.equals(((AbstractC2368o) c2378y).f9310a) && C2622I.m11067a((Object) this.f9323a, (Object) c2378y.f9323a) && C2622I.m11067a((Object) this.f9324b, (Object) c2378y.f9324b);
    }

    public int hashCode() {
        int hashCode = (527 + super.f9310a.hashCode()) * 31;
        String str = this.f9323a;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f9324b;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // p139d.p225c.p226a.p227a.p245h.p247b.AbstractC2368o
    public String toString() {
        return super.f9310a + ": url=" + this.f9324b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(super.f9310a);
        parcel.writeString(this.f9323a);
        parcel.writeString(this.f9324b);
    }
}
