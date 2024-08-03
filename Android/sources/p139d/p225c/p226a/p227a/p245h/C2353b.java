package p139d.p225c.p226a.p227a.p245h;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* renamed from: d.c.a.a.h.b */
/* loaded from: classes.dex */
public final class C2353b implements Parcelable {
    public static final Parcelable.Creator<C2353b> CREATOR = new C2348a();

    /* renamed from: a */
    private final a[] f9279a;

    /* renamed from: d.c.a.a.h.b$a */
    /* loaded from: classes.dex */
    public interface a extends Parcelable {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2353b(Parcel parcel) {
        this.f9279a = new a[parcel.readInt()];
        int i = 0;
        while (true) {
            a[] aVarArr = this.f9279a;
            if (i >= aVarArr.length) {
                return;
            }
            aVarArr[i] = (a) parcel.readParcelable(a.class.getClassLoader());
            i++;
        }
    }

    public C2353b(List<? extends a> list) {
        if (list == null) {
            this.f9279a = new a[0];
        } else {
            this.f9279a = new a[list.size()];
            list.toArray(this.f9279a);
        }
    }

    public C2353b(a... aVarArr) {
        this.f9279a = aVarArr == null ? new a[0] : aVarArr;
    }

    /* renamed from: a */
    public int m9810a() {
        return this.f9279a.length;
    }

    /* renamed from: a */
    public a m9811a(int i) {
        return this.f9279a[i];
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2353b.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f9279a, ((C2353b) obj).f9279a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f9279a);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f9279a.length);
        for (a aVar : this.f9279a) {
            parcel.writeParcelable(aVar, 0);
        }
    }
}
