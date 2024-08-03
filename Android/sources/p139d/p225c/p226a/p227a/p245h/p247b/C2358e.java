package p139d.p225c.p226a.p227a.p245h.p247b;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: d.c.a.a.h.b.e */
/* loaded from: classes.dex */
public final class C2358e extends AbstractC2368o {
    public static final Parcelable.Creator<C2358e> CREATOR = new C2357d();

    /* renamed from: a */
    public final byte[] f9285a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C2358e(android.os.Parcel r2) {
        /*
            r1 = this;
            java.lang.String r0 = r2.readString()
            p139d.p225c.p226a.p227a.p270n.C2622I.m11050a(r0)
            java.lang.String r0 = (java.lang.String) r0
            r1.<init>(r0)
            byte[] r2 = r2.createByteArray()
            p139d.p225c.p226a.p227a.p270n.C2622I.m11050a(r2)
            byte[] r2 = (byte[]) r2
            r1.f9285a = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p139d.p225c.p226a.p227a.p245h.p247b.C2358e.<init>(android.os.Parcel):void");
    }

    public C2358e(String str, byte[] bArr) {
        super(str);
        this.f9285a = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2358e.class != obj.getClass()) {
            return false;
        }
        C2358e c2358e = (C2358e) obj;
        return super.f9310a.equals(((AbstractC2368o) c2358e).f9310a) && Arrays.equals(this.f9285a, c2358e.f9285a);
    }

    public int hashCode() {
        return ((527 + super.f9310a.hashCode()) * 31) + Arrays.hashCode(this.f9285a);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(super.f9310a);
        parcel.writeByteArray(this.f9285a);
    }
}
