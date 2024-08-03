package p139d.p225c.p226a.p227a.p245h.p247b;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p139d.p225c.p226a.p227a.p270n.C2622I;

/* renamed from: d.c.a.a.h.b.c */
/* loaded from: classes.dex */
public final class C2356c extends AbstractC2368o {
    public static final Parcelable.Creator<C2356c> CREATOR = new C2355b();

    /* renamed from: a */
    public final String f9281a;

    /* renamed from: b */
    public final String f9282b;

    /* renamed from: c */
    public final int f9283c;

    /* renamed from: d */
    public final byte[] f9284d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2356c(Parcel parcel) {
        super("APIC");
        String readString = parcel.readString();
        C2622I.m11050a(readString);
        this.f9281a = readString;
        String readString2 = parcel.readString();
        C2622I.m11050a(readString2);
        this.f9282b = readString2;
        this.f9283c = parcel.readInt();
        byte[] createByteArray = parcel.createByteArray();
        C2622I.m11050a(createByteArray);
        this.f9284d = createByteArray;
    }

    public C2356c(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.f9281a = str;
        this.f9282b = str2;
        this.f9283c = i;
        this.f9284d = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2356c.class != obj.getClass()) {
            return false;
        }
        C2356c c2356c = (C2356c) obj;
        return this.f9283c == c2356c.f9283c && C2622I.m11067a((Object) this.f9281a, (Object) c2356c.f9281a) && C2622I.m11067a((Object) this.f9282b, (Object) c2356c.f9282b) && Arrays.equals(this.f9284d, c2356c.f9284d);
    }

    public int hashCode() {
        int i = (527 + this.f9283c) * 31;
        String str = this.f9281a;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f9282b;
        return ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Arrays.hashCode(this.f9284d);
    }

    @Override // p139d.p225c.p226a.p227a.p245h.p247b.AbstractC2368o
    public String toString() {
        return super.f9310a + ": mimeType=" + this.f9281a + ", description=" + this.f9282b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f9281a);
        parcel.writeString(this.f9282b);
        parcel.writeInt(this.f9283c);
        parcel.writeByteArray(this.f9284d);
    }
}
