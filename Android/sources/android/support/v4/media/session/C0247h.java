package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;

/* renamed from: android.support.v4.media.session.h */
/* loaded from: classes.dex */
class C0247h implements Parcelable.Creator<MediaSessionCompat.ResultReceiverWrapper> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public MediaSessionCompat.ResultReceiverWrapper createFromParcel(Parcel parcel) {
        return new MediaSessionCompat.ResultReceiverWrapper(parcel);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public MediaSessionCompat.ResultReceiverWrapper[] newArray(int i) {
        return new MediaSessionCompat.ResultReceiverWrapper[i];
    }
}
