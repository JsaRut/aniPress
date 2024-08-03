package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;

/* renamed from: android.support.v4.media.session.g */
/* loaded from: classes.dex */
class C0246g implements Parcelable.Creator<MediaSessionCompat.QueueItem> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public MediaSessionCompat.QueueItem createFromParcel(Parcel parcel) {
        return new MediaSessionCompat.QueueItem(parcel);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public MediaSessionCompat.QueueItem[] newArray(int i) {
        return new MediaSessionCompat.QueueItem[i];
    }
}
