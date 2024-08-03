package android.support.v4.media;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.util.C0256b;

/* loaded from: classes.dex */
public final class MediaMetadataCompat implements Parcelable {
    public static final Parcelable.Creator<MediaMetadataCompat> CREATOR;

    /* renamed from: a */
    static final C0256b<String, Integer> f999a = new C0256b<>();

    /* renamed from: b */
    private static final String[] f1000b;

    /* renamed from: c */
    private static final String[] f1001c;

    /* renamed from: d */
    private static final String[] f1002d;

    /* renamed from: e */
    final Bundle f1003e;

    /* renamed from: f */
    private Object f1004f;

    static {
        f999a.put("android.media.metadata.TITLE", 1);
        f999a.put("android.media.metadata.ARTIST", 1);
        f999a.put("android.media.metadata.DURATION", 0);
        f999a.put("android.media.metadata.ALBUM", 1);
        f999a.put("android.media.metadata.AUTHOR", 1);
        f999a.put("android.media.metadata.WRITER", 1);
        f999a.put("android.media.metadata.COMPOSER", 1);
        f999a.put("android.media.metadata.COMPILATION", 1);
        f999a.put("android.media.metadata.DATE", 1);
        f999a.put("android.media.metadata.YEAR", 0);
        f999a.put("android.media.metadata.GENRE", 1);
        f999a.put("android.media.metadata.TRACK_NUMBER", 0);
        f999a.put("android.media.metadata.NUM_TRACKS", 0);
        f999a.put("android.media.metadata.DISC_NUMBER", 0);
        f999a.put("android.media.metadata.ALBUM_ARTIST", 1);
        f999a.put("android.media.metadata.ART", 2);
        f999a.put("android.media.metadata.ART_URI", 1);
        f999a.put("android.media.metadata.ALBUM_ART", 2);
        f999a.put("android.media.metadata.ALBUM_ART_URI", 1);
        f999a.put("android.media.metadata.USER_RATING", 3);
        f999a.put("android.media.metadata.RATING", 3);
        f999a.put("android.media.metadata.DISPLAY_TITLE", 1);
        f999a.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        f999a.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        f999a.put("android.media.metadata.DISPLAY_ICON", 2);
        f999a.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        f999a.put("android.media.metadata.MEDIA_ID", 1);
        f999a.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        f999a.put("android.media.metadata.MEDIA_URI", 1);
        f999a.put("android.media.metadata.ADVERTISEMENT", 0);
        f999a.put("android.media.metadata.DOWNLOAD_STATUS", 0);
        f1000b = new String[]{"android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.ALBUM", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.WRITER", "android.media.metadata.AUTHOR", "android.media.metadata.COMPOSER"};
        f1001c = new String[]{"android.media.metadata.DISPLAY_ICON", "android.media.metadata.ART", "android.media.metadata.ALBUM_ART"};
        f1002d = new String[]{"android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.ART_URI", "android.media.metadata.ALBUM_ART_URI"};
        CREATOR = new C0236k();
    }

    public MediaMetadataCompat(Parcel parcel) {
        this.f1003e = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
    }

    /* renamed from: a */
    public static MediaMetadataCompat m1231a(Object obj) {
        if (obj == null || Build.VERSION.SDK_INT < 21) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        C0237l.m1263a(obj, obtain, 0);
        obtain.setDataPosition(0);
        MediaMetadataCompat createFromParcel = CREATOR.createFromParcel(obtain);
        obtain.recycle();
        createFromParcel.f1004f = obj;
        return createFromParcel;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f1003e);
    }
}
