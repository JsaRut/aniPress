package p139d.p225c.p226a.p227a.p250j;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: d.c.a.a.j.N */
/* loaded from: classes.dex */
public final class C2413N implements Parcelable {

    /* renamed from: b */
    public final int f9485b;

    /* renamed from: c */
    private final C2411L[] f9486c;

    /* renamed from: d */
    private int f9487d;

    /* renamed from: a */
    public static final C2413N f9484a = new C2413N(new C2411L[0]);
    public static final Parcelable.Creator<C2413N> CREATOR = new C2412M();

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2413N(Parcel parcel) {
        this.f9485b = parcel.readInt();
        this.f9486c = new C2411L[this.f9485b];
        for (int i = 0; i < this.f9485b; i++) {
            this.f9486c[i] = (C2411L) parcel.readParcelable(C2411L.class.getClassLoader());
        }
    }

    public C2413N(C2411L... c2411lArr) {
        this.f9486c = c2411lArr;
        this.f9485b = c2411lArr.length;
    }

    /* renamed from: a */
    public int m9977a(C2411L c2411l) {
        for (int i = 0; i < this.f9485b; i++) {
            if (this.f9486c[i] == c2411l) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public C2411L m9978a(int i) {
        return this.f9486c[i];
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2413N.class != obj.getClass()) {
            return false;
        }
        C2413N c2413n = (C2413N) obj;
        return this.f9485b == c2413n.f9485b && Arrays.equals(this.f9486c, c2413n.f9486c);
    }

    public int hashCode() {
        if (this.f9487d == 0) {
            this.f9487d = Arrays.hashCode(this.f9486c);
        }
        return this.f9487d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f9485b);
        for (int i2 = 0; i2 < this.f9485b; i2++) {
            parcel.writeParcelable(this.f9486c[i2], 0);
        }
    }
}
