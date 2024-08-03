package p139d.p225c.p226a.p227a.p250j;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p139d.p225c.p226a.p227a.C2676s;
import p139d.p225c.p226a.p227a.p270n.C2628e;

/* renamed from: d.c.a.a.j.L */
/* loaded from: classes.dex */
public final class C2411L implements Parcelable {
    public static final Parcelable.Creator<C2411L> CREATOR = new C2410K();

    /* renamed from: a */
    public final int f9481a;

    /* renamed from: b */
    private final C2676s[] f9482b;

    /* renamed from: c */
    private int f9483c;

    public C2411L(Parcel parcel) {
        this.f9481a = parcel.readInt();
        this.f9482b = new C2676s[this.f9481a];
        for (int i = 0; i < this.f9481a; i++) {
            this.f9482b[i] = (C2676s) parcel.readParcelable(C2676s.class.getClassLoader());
        }
    }

    public C2411L(C2676s... c2676sArr) {
        C2628e.m11113b(c2676sArr.length > 0);
        this.f9482b = c2676sArr;
        this.f9481a = c2676sArr.length;
    }

    /* renamed from: a */
    public int m9975a(C2676s c2676s) {
        int i = 0;
        while (true) {
            C2676s[] c2676sArr = this.f9482b;
            if (i >= c2676sArr.length) {
                return -1;
            }
            if (c2676s == c2676sArr[i]) {
                return i;
            }
            i++;
        }
    }

    /* renamed from: a */
    public C2676s m9976a(int i) {
        return this.f9482b[i];
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2411L.class != obj.getClass()) {
            return false;
        }
        C2411L c2411l = (C2411L) obj;
        return this.f9481a == c2411l.f9481a && Arrays.equals(this.f9482b, c2411l.f9482b);
    }

    public int hashCode() {
        if (this.f9483c == 0) {
            this.f9483c = 527 + Arrays.hashCode(this.f9482b);
        }
        return this.f9483c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f9481a);
        for (int i2 = 0; i2 < this.f9481a; i2++) {
            parcel.writeParcelable(this.f9482b[i2], 0);
        }
    }
}
