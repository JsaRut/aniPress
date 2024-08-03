package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: android.support.v4.media.session.k */
/* loaded from: classes.dex */
class C0250k implements Parcelable.Creator<ParcelableVolumeInfo> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public ParcelableVolumeInfo createFromParcel(Parcel parcel) {
        return new ParcelableVolumeInfo(parcel);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public ParcelableVolumeInfo[] newArray(int i) {
        return new ParcelableVolumeInfo[i];
    }
}
