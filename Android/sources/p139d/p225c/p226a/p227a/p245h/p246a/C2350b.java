package p139d.p225c.p226a.p227a.p245h.p246a;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p139d.p225c.p226a.p227a.p245h.C2353b;
import p139d.p225c.p226a.p227a.p270n.C2622I;

/* renamed from: d.c.a.a.h.a.b */
/* loaded from: classes.dex */
public final class C2350b implements C2353b.a {
    public static final Parcelable.Creator<C2350b> CREATOR = new C2349a();

    /* renamed from: a */
    public final String f9270a;

    /* renamed from: b */
    public final String f9271b;

    /* renamed from: c */
    public final long f9272c;

    /* renamed from: d */
    public final long f9273d;

    /* renamed from: e */
    public final long f9274e;

    /* renamed from: f */
    public final byte[] f9275f;

    /* renamed from: g */
    private int f9276g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2350b(Parcel parcel) {
        String readString = parcel.readString();
        C2622I.m11050a(readString);
        this.f9270a = readString;
        String readString2 = parcel.readString();
        C2622I.m11050a(readString2);
        this.f9271b = readString2;
        this.f9273d = parcel.readLong();
        this.f9272c = parcel.readLong();
        this.f9274e = parcel.readLong();
        byte[] createByteArray = parcel.createByteArray();
        C2622I.m11050a(createByteArray);
        this.f9275f = createByteArray;
    }

    public C2350b(String str, String str2, long j, long j2, byte[] bArr, long j3) {
        this.f9270a = str;
        this.f9271b = str2;
        this.f9272c = j;
        this.f9274e = j2;
        this.f9275f = bArr;
        this.f9273d = j3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2350b.class != obj.getClass()) {
            return false;
        }
        C2350b c2350b = (C2350b) obj;
        return this.f9273d == c2350b.f9273d && this.f9272c == c2350b.f9272c && this.f9274e == c2350b.f9274e && C2622I.m11067a((Object) this.f9270a, (Object) c2350b.f9270a) && C2622I.m11067a((Object) this.f9271b, (Object) c2350b.f9271b) && Arrays.equals(this.f9275f, c2350b.f9275f);
    }

    public int hashCode() {
        if (this.f9276g == 0) {
            String str = this.f9270a;
            int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f9271b;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            long j = this.f9273d;
            int i = (((hashCode + hashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.f9272c;
            int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            long j3 = this.f9274e;
            this.f9276g = ((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + Arrays.hashCode(this.f9275f);
        }
        return this.f9276g;
    }

    public String toString() {
        return "EMSG: scheme=" + this.f9270a + ", id=" + this.f9274e + ", value=" + this.f9271b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f9270a);
        parcel.writeString(this.f9271b);
        parcel.writeLong(this.f9273d);
        parcel.writeLong(this.f9272c);
        parcel.writeLong(this.f9274e);
        parcel.writeByteArray(this.f9275f);
    }
}
