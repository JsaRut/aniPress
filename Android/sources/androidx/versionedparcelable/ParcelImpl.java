package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new C0488a();

    /* renamed from: a */
    private final InterfaceC0491d f2522a;

    /* JADX INFO: Access modifiers changed from: protected */
    public ParcelImpl(Parcel parcel) {
        this.f2522a = new C0490c(parcel).m2624h();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        new C0490c(parcel).m2605a(this.f2522a);
    }
}
