package android.support.v4.media.session;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;

/* renamed from: android.support.v4.media.session.i */
/* loaded from: classes.dex */
class C0248i implements Parcelable.Creator<MediaSessionCompat.Token> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public MediaSessionCompat.Token createFromParcel(Parcel parcel) {
        return new MediaSessionCompat.Token(Build.VERSION.SDK_INT >= 21 ? parcel.readParcelable(null) : parcel.readStrongBinder());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public MediaSessionCompat.Token[] newArray(int i) {
        return new MediaSessionCompat.Token[i];
    }
}
