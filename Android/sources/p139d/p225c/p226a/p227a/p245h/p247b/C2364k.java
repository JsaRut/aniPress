package p139d.p225c.p226a.p227a.p245h.p247b;

import android.os.Parcel;
import android.os.Parcelable;
import p139d.p225c.p226a.p227a.p270n.C2622I;

/* renamed from: d.c.a.a.h.b.k */
/* loaded from: classes.dex */
public final class C2364k extends AbstractC2368o {
    public static final Parcelable.Creator<C2364k> CREATOR = new C2363j();

    /* renamed from: a */
    public final String f9297a;

    /* renamed from: b */
    public final String f9298b;

    /* renamed from: c */
    public final String f9299c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2364k(Parcel parcel) {
        super("COMM");
        String readString = parcel.readString();
        C2622I.m11050a(readString);
        this.f9297a = readString;
        String readString2 = parcel.readString();
        C2622I.m11050a(readString2);
        this.f9298b = readString2;
        String readString3 = parcel.readString();
        C2622I.m11050a(readString3);
        this.f9299c = readString3;
    }

    public C2364k(String str, String str2, String str3) {
        super("COMM");
        this.f9297a = str;
        this.f9298b = str2;
        this.f9299c = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2364k.class != obj.getClass()) {
            return false;
        }
        C2364k c2364k = (C2364k) obj;
        return C2622I.m11067a((Object) this.f9298b, (Object) c2364k.f9298b) && C2622I.m11067a((Object) this.f9297a, (Object) c2364k.f9297a) && C2622I.m11067a((Object) this.f9299c, (Object) c2364k.f9299c);
    }

    public int hashCode() {
        String str = this.f9297a;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f9298b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f9299c;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // p139d.p225c.p226a.p227a.p245h.p247b.AbstractC2368o
    public String toString() {
        return super.f9310a + ": language=" + this.f9297a + ", description=" + this.f9298b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(super.f9310a);
        parcel.writeString(this.f9297a);
        parcel.writeString(this.f9299c);
    }
}
