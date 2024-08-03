package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: android.support.v4.media.m */
/* loaded from: classes.dex */
class C0238m implements Parcelable.Creator<RatingCompat> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public RatingCompat createFromParcel(Parcel parcel) {
        return new RatingCompat(parcel.readInt(), parcel.readFloat());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public RatingCompat[] newArray(int i) {
        return new RatingCompat[i];
    }
}
