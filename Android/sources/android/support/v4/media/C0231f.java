package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: android.support.v4.media.f */
/* loaded from: classes.dex */
class C0231f implements Parcelable.Creator<MediaBrowserCompat$MediaItem> {
    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.support.v4.media.MediaBrowserCompat$MediaItem] */
    @Override // android.os.Parcelable.Creator
    public MediaBrowserCompat$MediaItem createFromParcel(final Parcel parcel) {
        return new Parcelable(parcel) { // from class: android.support.v4.media.MediaBrowserCompat$MediaItem
            public static final Parcelable.Creator<MediaBrowserCompat$MediaItem> CREATOR = new C0231f();

            /* renamed from: a */
            private final int f977a;

            /* renamed from: b */
            private final MediaDescriptionCompat f978b;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f977a = parcel.readInt();
                this.f978b = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public String toString() {
                return "MediaItem{mFlags=" + this.f977a + ", mDescription=" + this.f978b + '}';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel2, int i) {
                parcel2.writeInt(this.f977a);
                this.f978b.writeToParcel(parcel2, i);
            }
        };
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public MediaBrowserCompat$MediaItem[] newArray(int i) {
        return new MediaBrowserCompat$MediaItem[i];
    }
}
