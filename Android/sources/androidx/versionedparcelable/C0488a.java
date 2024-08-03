package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: androidx.versionedparcelable.a */
/* loaded from: classes.dex */
class C0488a implements Parcelable.Creator<ParcelImpl> {
    @Override // android.os.Parcelable.Creator
    public ParcelImpl createFromParcel(Parcel parcel) {
        return new ParcelImpl(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public ParcelImpl[] newArray(int i) {
        return new ParcelImpl[i];
    }
}
