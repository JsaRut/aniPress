package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: android.support.v4.media.session.l */
/* loaded from: classes.dex */
class C0251l implements Parcelable.Creator<PlaybackStateCompat> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public PlaybackStateCompat createFromParcel(Parcel parcel) {
        return new PlaybackStateCompat(parcel);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public PlaybackStateCompat[] newArray(int i) {
        return new PlaybackStateCompat[i];
    }
}
