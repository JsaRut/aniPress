package android.support.v4.media.session;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import java.util.List;

/* renamed from: android.support.v4.media.session.a */
/* loaded from: classes.dex */
public interface InterfaceC0240a extends IInterface {

    /* renamed from: android.support.v4.media.session.a$a */
    /* loaded from: classes.dex */
    public static abstract class a extends Binder implements InterfaceC0240a {
        public a() {
            attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1598968902) {
                parcel2.writeString("android.support.v4.media.session.IMediaControllerCallback");
                return true;
            }
            switch (i) {
                case 1:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    mo1281a(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 2:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    mo1265a();
                    return true;
                case 3:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    mo1280a(parcel.readInt() != 0 ? PlaybackStateCompat.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 4:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    mo1267a(parcel.readInt() != 0 ? MediaMetadataCompat.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 5:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    mo1270a(parcel.createTypedArrayList(MediaSessionCompat.QueueItem.CREATOR));
                    return true;
                case 6:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    mo1269a(parcel.readInt() != 0 ? (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 7:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    mo1266a(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 8:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    mo1268a(parcel.readInt() != 0 ? ParcelableVolumeInfo.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 9:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    mo1279a(parcel.readInt());
                    return true;
                case 10:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    mo1285b(parcel.readInt() != 0);
                    return true;
                case 11:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    mo1282a(parcel.readInt() != 0);
                    return true;
                case 12:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    mo1284b(parcel.readInt());
                    return true;
                case 13:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    mo1283b();
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo1265a();

    /* renamed from: a */
    void mo1279a(int i);

    /* renamed from: a */
    void mo1266a(Bundle bundle);

    /* renamed from: a */
    void mo1267a(MediaMetadataCompat mediaMetadataCompat);

    /* renamed from: a */
    void mo1268a(ParcelableVolumeInfo parcelableVolumeInfo);

    /* renamed from: a */
    void mo1280a(PlaybackStateCompat playbackStateCompat);

    /* renamed from: a */
    void mo1269a(CharSequence charSequence);

    /* renamed from: a */
    void mo1281a(String str, Bundle bundle);

    /* renamed from: a */
    void mo1270a(List<MediaSessionCompat.QueueItem> list);

    /* renamed from: a */
    void mo1282a(boolean z);

    /* renamed from: b */
    void mo1283b();

    /* renamed from: b */
    void mo1284b(int i);

    /* renamed from: b */
    void mo1285b(boolean z);
}
