package p139d.p225c.p226a.p227a.p271o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p139d.p225c.p226a.p227a.p270n.C2622I;

/* renamed from: d.c.a.a.o.j */
/* loaded from: classes.dex */
public final class C2662j implements Parcelable {
    public static final Parcelable.Creator<C2662j> CREATOR = new C2661i();

    /* renamed from: a */
    public final int f11042a;

    /* renamed from: b */
    public final int f11043b;

    /* renamed from: c */
    public final int f11044c;

    /* renamed from: d */
    public final byte[] f11045d;

    /* renamed from: e */
    private int f11046e;

    public C2662j(int i, int i2, int i3, byte[] bArr) {
        this.f11042a = i;
        this.f11043b = i2;
        this.f11044c = i3;
        this.f11045d = bArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2662j(Parcel parcel) {
        this.f11042a = parcel.readInt();
        this.f11043b = parcel.readInt();
        this.f11044c = parcel.readInt();
        this.f11045d = C2622I.m11065a(parcel) ? parcel.createByteArray() : null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2662j.class != obj.getClass()) {
            return false;
        }
        C2662j c2662j = (C2662j) obj;
        return this.f11042a == c2662j.f11042a && this.f11043b == c2662j.f11043b && this.f11044c == c2662j.f11044c && Arrays.equals(this.f11045d, c2662j.f11045d);
    }

    public int hashCode() {
        if (this.f11046e == 0) {
            this.f11046e = ((((((527 + this.f11042a) * 31) + this.f11043b) * 31) + this.f11044c) * 31) + Arrays.hashCode(this.f11045d);
        }
        return this.f11046e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ColorInfo(");
        sb.append(this.f11042a);
        sb.append(", ");
        sb.append(this.f11043b);
        sb.append(", ");
        sb.append(this.f11044c);
        sb.append(", ");
        sb.append(this.f11045d != null);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f11042a);
        parcel.writeInt(this.f11043b);
        parcel.writeInt(this.f11044c);
        C2622I.m11059a(parcel, this.f11045d != null);
        byte[] bArr = this.f11045d;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
    }
}
