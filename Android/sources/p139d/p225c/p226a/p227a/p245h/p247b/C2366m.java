package p139d.p225c.p226a.p227a.p245h.p247b;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p139d.p225c.p226a.p227a.p270n.C2622I;

/* renamed from: d.c.a.a.h.b.m */
/* loaded from: classes.dex */
public final class C2366m extends AbstractC2368o {
    public static final Parcelable.Creator<C2366m> CREATOR = new C2365l();

    /* renamed from: a */
    public final String f9300a;

    /* renamed from: b */
    public final String f9301b;

    /* renamed from: c */
    public final String f9302c;

    /* renamed from: d */
    public final byte[] f9303d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2366m(Parcel parcel) {
        super("GEOB");
        String readString = parcel.readString();
        C2622I.m11050a(readString);
        this.f9300a = readString;
        String readString2 = parcel.readString();
        C2622I.m11050a(readString2);
        this.f9301b = readString2;
        String readString3 = parcel.readString();
        C2622I.m11050a(readString3);
        this.f9302c = readString3;
        byte[] createByteArray = parcel.createByteArray();
        C2622I.m11050a(createByteArray);
        this.f9303d = createByteArray;
    }

    public C2366m(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f9300a = str;
        this.f9301b = str2;
        this.f9302c = str3;
        this.f9303d = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2366m.class != obj.getClass()) {
            return false;
        }
        C2366m c2366m = (C2366m) obj;
        return C2622I.m11067a((Object) this.f9300a, (Object) c2366m.f9300a) && C2622I.m11067a((Object) this.f9301b, (Object) c2366m.f9301b) && C2622I.m11067a((Object) this.f9302c, (Object) c2366m.f9302c) && Arrays.equals(this.f9303d, c2366m.f9303d);
    }

    public int hashCode() {
        String str = this.f9300a;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f9301b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f9302c;
        return ((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + Arrays.hashCode(this.f9303d);
    }

    @Override // p139d.p225c.p226a.p227a.p245h.p247b.AbstractC2368o
    public String toString() {
        return super.f9310a + ": mimeType=" + this.f9300a + ", filename=" + this.f9301b + ", description=" + this.f9302c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f9300a);
        parcel.writeString(this.f9301b);
        parcel.writeString(this.f9302c);
        parcel.writeByteArray(this.f9303d);
    }
}
