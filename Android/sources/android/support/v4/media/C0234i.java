package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: android.support.v4.media.i */
/* loaded from: classes.dex */
public class C0234i {

    /* renamed from: android.support.v4.media.i$a */
    /* loaded from: classes.dex */
    static class a {
        /* renamed from: a */
        public static Object m1252a() {
            return new MediaDescription.Builder();
        }

        /* renamed from: a */
        public static Object m1253a(Object obj) {
            return ((MediaDescription.Builder) obj).build();
        }

        /* renamed from: a */
        public static void m1254a(Object obj, Bitmap bitmap) {
            ((MediaDescription.Builder) obj).setIconBitmap(bitmap);
        }

        /* renamed from: a */
        public static void m1255a(Object obj, Uri uri) {
            ((MediaDescription.Builder) obj).setIconUri(uri);
        }

        /* renamed from: a */
        public static void m1256a(Object obj, Bundle bundle) {
            ((MediaDescription.Builder) obj).setExtras(bundle);
        }

        /* renamed from: a */
        public static void m1257a(Object obj, CharSequence charSequence) {
            ((MediaDescription.Builder) obj).setDescription(charSequence);
        }

        /* renamed from: a */
        public static void m1258a(Object obj, String str) {
            ((MediaDescription.Builder) obj).setMediaId(str);
        }

        /* renamed from: b */
        public static void m1259b(Object obj, CharSequence charSequence) {
            ((MediaDescription.Builder) obj).setSubtitle(charSequence);
        }

        /* renamed from: c */
        public static void m1260c(Object obj, CharSequence charSequence) {
            ((MediaDescription.Builder) obj).setTitle(charSequence);
        }
    }

    /* renamed from: a */
    public static CharSequence m1243a(Object obj) {
        return ((MediaDescription) obj).getDescription();
    }

    /* renamed from: a */
    public static Object m1244a(Parcel parcel) {
        return MediaDescription.CREATOR.createFromParcel(parcel);
    }

    /* renamed from: a */
    public static void m1245a(Object obj, Parcel parcel, int i) {
        ((MediaDescription) obj).writeToParcel(parcel, i);
    }

    /* renamed from: b */
    public static Bundle m1246b(Object obj) {
        return ((MediaDescription) obj).getExtras();
    }

    /* renamed from: c */
    public static Bitmap m1247c(Object obj) {
        return ((MediaDescription) obj).getIconBitmap();
    }

    /* renamed from: d */
    public static Uri m1248d(Object obj) {
        return ((MediaDescription) obj).getIconUri();
    }

    /* renamed from: e */
    public static String m1249e(Object obj) {
        return ((MediaDescription) obj).getMediaId();
    }

    /* renamed from: f */
    public static CharSequence m1250f(Object obj) {
        return ((MediaDescription) obj).getSubtitle();
    }

    /* renamed from: g */
    public static CharSequence m1251g(Object obj) {
        return ((MediaDescription) obj).getTitle();
    }
}
