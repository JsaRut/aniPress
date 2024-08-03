package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;
import java.util.ArrayList;
import p000a.p005b.p009c.p016e.C0052c;

/* loaded from: classes.dex */
class MediaBrowserCompat$SearchResultReceiver extends C0052c {

    /* renamed from: d */
    private final String f979d;

    /* renamed from: e */
    private final Bundle f980e;

    /* renamed from: f */
    private final AbstractC0232g f981f;

    @Override // p000a.p005b.p009c.p016e.C0052c
    /* renamed from: a */
    protected void mo234a(int i, Bundle bundle) {
        MediaSessionCompat.m1271a(bundle);
        if (i != 0 || bundle == null || !bundle.containsKey("search_results")) {
            this.f981f.m1241a(this.f979d, this.f980e);
            return;
        }
        Parcelable[] parcelableArray = bundle.getParcelableArray("search_results");
        ArrayList arrayList = null;
        if (parcelableArray != null) {
            arrayList = new ArrayList();
            for (Parcelable parcelable : parcelableArray) {
                arrayList.add((MediaBrowserCompat$MediaItem) parcelable);
            }
        }
        this.f981f.m1242a(this.f979d, this.f980e, arrayList);
    }
}
