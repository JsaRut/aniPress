package android.support.v4.media;

import android.os.Bundle;
import android.support.v4.media.session.MediaSessionCompat;
import android.util.Log;
import p000a.p005b.p009c.p016e.C0052c;

/* loaded from: classes.dex */
class MediaBrowserCompat$CustomActionResultReceiver extends C0052c {

    /* renamed from: d */
    private final String f972d;

    /* renamed from: e */
    private final Bundle f973e;

    /* renamed from: f */
    private final AbstractC0229d f974f;

    @Override // p000a.p005b.p009c.p016e.C0052c
    /* renamed from: a */
    protected void mo234a(int i, Bundle bundle) {
        if (this.f974f == null) {
            return;
        }
        MediaSessionCompat.m1271a(bundle);
        if (i == -1) {
            this.f974f.m1236a(this.f972d, this.f973e, bundle);
            return;
        }
        if (i == 0) {
            this.f974f.m1238c(this.f972d, this.f973e, bundle);
            return;
        }
        if (i == 1) {
            this.f974f.m1237b(this.f972d, this.f973e, bundle);
            return;
        }
        Log.w("MediaBrowserCompat", "Unknown result code: " + i + " (extras=" + this.f973e + ", resultData=" + bundle + ")");
    }
}
