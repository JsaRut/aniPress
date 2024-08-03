package p139d.p225c.p226a.p227a.p245h.p247b;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: d.c.a.a.h.b.s */
/* loaded from: classes.dex */
public final class C2372s extends AbstractC2368o {
    public static final Parcelable.Creator<C2372s> CREATOR = new C2371r();

    /* renamed from: a */
    public final int f9314a;

    /* renamed from: b */
    public final int f9315b;

    /* renamed from: c */
    public final int f9316c;

    /* renamed from: d */
    public final int[] f9317d;

    /* renamed from: e */
    public final int[] f9318e;

    public C2372s(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f9314a = i;
        this.f9315b = i2;
        this.f9316c = i3;
        this.f9317d = iArr;
        this.f9318e = iArr2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2372s(Parcel parcel) {
        super("MLLT");
        this.f9314a = parcel.readInt();
        this.f9315b = parcel.readInt();
        this.f9316c = parcel.readInt();
        this.f9317d = parcel.createIntArray();
        this.f9318e = parcel.createIntArray();
    }

    @Override // p139d.p225c.p226a.p227a.p245h.p247b.AbstractC2368o, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2372s.class != obj.getClass()) {
            return false;
        }
        C2372s c2372s = (C2372s) obj;
        return this.f9314a == c2372s.f9314a && this.f9315b == c2372s.f9315b && this.f9316c == c2372s.f9316c && Arrays.equals(this.f9317d, c2372s.f9317d) && Arrays.equals(this.f9318e, c2372s.f9318e);
    }

    public int hashCode() {
        return ((((((((527 + this.f9314a) * 31) + this.f9315b) * 31) + this.f9316c) * 31) + Arrays.hashCode(this.f9317d)) * 31) + Arrays.hashCode(this.f9318e);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f9314a);
        parcel.writeInt(this.f9315b);
        parcel.writeInt(this.f9316c);
        parcel.writeIntArray(this.f9317d);
        parcel.writeIntArray(this.f9318e);
    }
}
