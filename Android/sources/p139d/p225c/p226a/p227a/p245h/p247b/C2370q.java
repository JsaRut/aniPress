package p139d.p225c.p226a.p227a.p245h.p247b;

import android.os.Parcel;
import android.os.Parcelable;
import p139d.p225c.p226a.p227a.p270n.C2622I;

/* renamed from: d.c.a.a.h.b.q */
/* loaded from: classes.dex */
public final class C2370q extends AbstractC2368o {
    public static final Parcelable.Creator<C2370q> CREATOR = new C2369p();

    /* renamed from: a */
    public final String f9311a;

    /* renamed from: b */
    public final String f9312b;

    /* renamed from: c */
    public final String f9313c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2370q(Parcel parcel) {
        super("----");
        String readString = parcel.readString();
        C2622I.m11050a(readString);
        this.f9311a = readString;
        String readString2 = parcel.readString();
        C2622I.m11050a(readString2);
        this.f9312b = readString2;
        String readString3 = parcel.readString();
        C2622I.m11050a(readString3);
        this.f9313c = readString3;
    }

    public C2370q(String str, String str2, String str3) {
        super("----");
        this.f9311a = str;
        this.f9312b = str2;
        this.f9313c = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2370q.class != obj.getClass()) {
            return false;
        }
        C2370q c2370q = (C2370q) obj;
        return C2622I.m11067a((Object) this.f9312b, (Object) c2370q.f9312b) && C2622I.m11067a((Object) this.f9311a, (Object) c2370q.f9311a) && C2622I.m11067a((Object) this.f9313c, (Object) c2370q.f9313c);
    }

    public int hashCode() {
        String str = this.f9311a;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f9312b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f9313c;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // p139d.p225c.p226a.p227a.p245h.p247b.AbstractC2368o
    public String toString() {
        return super.f9310a + ": domain=" + this.f9311a + ", description=" + this.f9312b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(super.f9310a);
        parcel.writeString(this.f9311a);
        parcel.writeString(this.f9313c);
    }
}
