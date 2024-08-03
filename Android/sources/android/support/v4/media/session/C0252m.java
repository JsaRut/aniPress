package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.PlaybackStateCompat;

/* renamed from: android.support.v4.media.session.m */
/* loaded from: classes.dex */
class C0252m implements Parcelable.Creator<PlaybackStateCompat.CustomAction> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public PlaybackStateCompat.CustomAction createFromParcel(Parcel parcel) {
        return new PlaybackStateCompat.CustomAction(parcel);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public PlaybackStateCompat.CustomAction[] newArray(int i) {
        return new PlaybackStateCompat.CustomAction[i];
    }
}
