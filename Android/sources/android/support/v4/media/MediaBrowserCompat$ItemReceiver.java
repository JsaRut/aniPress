package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;
import p000a.p005b.p009c.p016e.C0052c;

/* loaded from: classes.dex */
class MediaBrowserCompat$ItemReceiver extends C0052c {

    /* renamed from: d */
    private final String f975d;

    /* renamed from: e */
    private final AbstractC0230e f976e;

    @Override // p000a.p005b.p009c.p016e.C0052c
    /* renamed from: a */
    protected void mo234a(int i, Bundle bundle) {
        MediaSessionCompat.m1271a(bundle);
        if (i != 0 || bundle == null || !bundle.containsKey("media_item")) {
            this.f976e.m1240a(this.f975d);
            return;
        }
        Parcelable parcelable = bundle.getParcelable("media_item");
        if (parcelable == null || (parcelable instanceof MediaBrowserCompat$MediaItem)) {
            this.f976e.m1239a((MediaBrowserCompat$MediaItem) parcelable);
        } else {
            this.f976e.m1240a(this.f975d);
        }
    }
}
