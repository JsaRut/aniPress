package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: android.support.v4.app.C */
/* loaded from: classes.dex */
public final class C0163C implements Parcelable {
    public static final Parcelable.Creator<C0163C> CREATOR = new C0162B();

    /* renamed from: a */
    C0167F[] f617a;

    /* renamed from: b */
    int[] f618b;

    /* renamed from: c */
    C0199f[] f619c;

    /* renamed from: d */
    int f620d;

    /* renamed from: e */
    int f621e;

    public C0163C() {
        this.f620d = -1;
    }

    public C0163C(Parcel parcel) {
        this.f620d = -1;
        this.f617a = (C0167F[]) parcel.createTypedArray(C0167F.CREATOR);
        this.f618b = parcel.createIntArray();
        this.f619c = (C0199f[]) parcel.createTypedArray(C0199f.CREATOR);
        this.f620d = parcel.readInt();
        this.f621e = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedArray(this.f617a, i);
        parcel.writeIntArray(this.f618b);
        parcel.writeTypedArray(this.f619c, i);
        parcel.writeInt(this.f620d);
        parcel.writeInt(this.f621e);
    }
}
