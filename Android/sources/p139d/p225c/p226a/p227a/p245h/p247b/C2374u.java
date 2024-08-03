package p139d.p225c.p226a.p227a.p245h.p247b;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p139d.p225c.p226a.p227a.p270n.C2622I;

/* renamed from: d.c.a.a.h.b.u */
/* loaded from: classes.dex */
public final class C2374u extends AbstractC2368o {
    public static final Parcelable.Creator<C2374u> CREATOR = new C2373t();

    /* renamed from: a */
    public final String f9319a;

    /* renamed from: b */
    public final byte[] f9320b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2374u(Parcel parcel) {
        super("PRIV");
        String readString = parcel.readString();
        C2622I.m11050a(readString);
        this.f9319a = readString;
        byte[] createByteArray = parcel.createByteArray();
        C2622I.m11050a(createByteArray);
        this.f9320b = createByteArray;
    }

    public C2374u(String str, byte[] bArr) {
        super("PRIV");
        this.f9319a = str;
        this.f9320b = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2374u.class != obj.getClass()) {
            return false;
        }
        C2374u c2374u = (C2374u) obj;
        return C2622I.m11067a((Object) this.f9319a, (Object) c2374u.f9319a) && Arrays.equals(this.f9320b, c2374u.f9320b);
    }

    public int hashCode() {
        String str = this.f9319a;
        return ((527 + (str != null ? str.hashCode() : 0)) * 31) + Arrays.hashCode(this.f9320b);
    }

    @Override // p139d.p225c.p226a.p227a.p245h.p247b.AbstractC2368o
    public String toString() {
        return super.f9310a + ": owner=" + this.f9319a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f9319a);
        parcel.writeByteArray(this.f9320b);
    }
}
