package android.support.v4.media;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: android.support.v4.media.h */
/* loaded from: classes.dex */
class C0233h implements Parcelable.Creator<MediaDescriptionCompat> {
    @Override // android.os.Parcelable.Creator
    public MediaDescriptionCompat createFromParcel(Parcel parcel) {
        return Build.VERSION.SDK_INT < 21 ? new MediaDescriptionCompat(parcel) : MediaDescriptionCompat.m1220a(C0234i.m1244a(parcel));
    }

    @Override // android.os.Parcelable.Creator
    public MediaDescriptionCompat[] newArray(int i) {
        return new MediaDescriptionCompat[i];
    }
}
