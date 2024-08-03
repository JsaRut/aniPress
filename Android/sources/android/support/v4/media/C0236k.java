package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: android.support.v4.media.k */
/* loaded from: classes.dex */
class C0236k implements Parcelable.Creator<MediaMetadataCompat> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public MediaMetadataCompat createFromParcel(Parcel parcel) {
        return new MediaMetadataCompat(parcel);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public MediaMetadataCompat[] newArray(int i) {
        return new MediaMetadataCompat[i];
    }
}
