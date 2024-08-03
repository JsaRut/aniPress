package android.support.v4.media;

import android.media.MediaDescription;
import android.net.Uri;

/* renamed from: android.support.v4.media.j */
/* loaded from: classes.dex */
class C0235j {

    /* renamed from: android.support.v4.media.j$a */
    /* loaded from: classes.dex */
    static class a {
        /* renamed from: a */
        public static void m1262a(Object obj, Uri uri) {
            ((MediaDescription.Builder) obj).setMediaUri(uri);
        }
    }

    /* renamed from: a */
    public static Uri m1261a(Object obj) {
        return ((MediaDescription) obj).getMediaUri();
    }
}
