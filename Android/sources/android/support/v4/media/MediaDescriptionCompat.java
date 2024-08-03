package android.support.v4.media;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.C0234i;
import android.support.v4.media.C0235j;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new C0233h();

    /* renamed from: a */
    private final String f982a;

    /* renamed from: b */
    private final CharSequence f983b;

    /* renamed from: c */
    private final CharSequence f984c;

    /* renamed from: d */
    private final CharSequence f985d;

    /* renamed from: e */
    private final Bitmap f986e;

    /* renamed from: f */
    private final Uri f987f;

    /* renamed from: g */
    private final Bundle f988g;

    /* renamed from: h */
    private final Uri f989h;

    /* renamed from: i */
    private Object f990i;

    /* renamed from: android.support.v4.media.MediaDescriptionCompat$a */
    /* loaded from: classes.dex */
    public static final class C0225a {

        /* renamed from: a */
        private String f991a;

        /* renamed from: b */
        private CharSequence f992b;

        /* renamed from: c */
        private CharSequence f993c;

        /* renamed from: d */
        private CharSequence f994d;

        /* renamed from: e */
        private Bitmap f995e;

        /* renamed from: f */
        private Uri f996f;

        /* renamed from: g */
        private Bundle f997g;

        /* renamed from: h */
        private Uri f998h;

        /* renamed from: a */
        public C0225a m1222a(Bitmap bitmap) {
            this.f995e = bitmap;
            return this;
        }

        /* renamed from: a */
        public C0225a m1223a(Uri uri) {
            this.f996f = uri;
            return this;
        }

        /* renamed from: a */
        public C0225a m1224a(Bundle bundle) {
            this.f997g = bundle;
            return this;
        }

        /* renamed from: a */
        public C0225a m1225a(CharSequence charSequence) {
            this.f994d = charSequence;
            return this;
        }

        /* renamed from: a */
        public C0225a m1226a(String str) {
            this.f991a = str;
            return this;
        }

        /* renamed from: a */
        public MediaDescriptionCompat m1227a() {
            return new MediaDescriptionCompat(this.f991a, this.f992b, this.f993c, this.f994d, this.f995e, this.f996f, this.f997g, this.f998h);
        }

        /* renamed from: b */
        public C0225a m1228b(Uri uri) {
            this.f998h = uri;
            return this;
        }

        /* renamed from: b */
        public C0225a m1229b(CharSequence charSequence) {
            this.f993c = charSequence;
            return this;
        }

        /* renamed from: c */
        public C0225a m1230c(CharSequence charSequence) {
            this.f992b = charSequence;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public MediaDescriptionCompat(Parcel parcel) {
        this.f982a = parcel.readString();
        this.f983b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f984c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f985d = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        ClassLoader classLoader = MediaDescriptionCompat.class.getClassLoader();
        this.f986e = (Bitmap) parcel.readParcelable(classLoader);
        this.f987f = (Uri) parcel.readParcelable(classLoader);
        this.f988g = parcel.readBundle(classLoader);
        this.f989h = (Uri) parcel.readParcelable(classLoader);
    }

    MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f982a = str;
        this.f983b = charSequence;
        this.f984c = charSequence2;
        this.f985d = charSequence3;
        this.f986e = bitmap;
        this.f987f = uri;
        this.f988g = bundle;
        this.f989h = uri2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006d  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.support.v4.media.MediaDescriptionCompat m1220a(java.lang.Object r8) {
        /*
            r0 = 0
            if (r8 == 0) goto L80
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 21
            if (r1 < r2) goto L80
            android.support.v4.media.MediaDescriptionCompat$a r1 = new android.support.v4.media.MediaDescriptionCompat$a
            r1.<init>()
            java.lang.String r2 = android.support.v4.media.C0234i.m1249e(r8)
            r1.m1226a(r2)
            java.lang.CharSequence r2 = android.support.v4.media.C0234i.m1251g(r8)
            r1.m1230c(r2)
            java.lang.CharSequence r2 = android.support.v4.media.C0234i.m1250f(r8)
            r1.m1229b(r2)
            java.lang.CharSequence r2 = android.support.v4.media.C0234i.m1243a(r8)
            r1.m1225a(r2)
            android.graphics.Bitmap r2 = android.support.v4.media.C0234i.m1247c(r8)
            r1.m1222a(r2)
            android.net.Uri r2 = android.support.v4.media.C0234i.m1248d(r8)
            r1.m1223a(r2)
            android.os.Bundle r2 = android.support.v4.media.C0234i.m1246b(r8)
            java.lang.String r3 = "android.support.v4.media.description.MEDIA_URI"
            if (r2 == 0) goto L4a
            android.support.v4.media.session.MediaSessionCompat.m1271a(r2)
            android.os.Parcelable r4 = r2.getParcelable(r3)
            android.net.Uri r4 = (android.net.Uri) r4
            goto L4b
        L4a:
            r4 = r0
        L4b:
            if (r4 == 0) goto L63
            java.lang.String r5 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            boolean r6 = r2.containsKey(r5)
            if (r6 == 0) goto L5d
            int r6 = r2.size()
            r7 = 2
            if (r6 != r7) goto L5d
            goto L64
        L5d:
            r2.remove(r3)
            r2.remove(r5)
        L63:
            r0 = r2
        L64:
            r1.m1224a(r0)
            if (r4 == 0) goto L6d
            r1.m1228b(r4)
            goto L7a
        L6d:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 23
            if (r0 < r2) goto L7a
            android.net.Uri r0 = android.support.v4.media.C0235j.m1261a(r8)
            r1.m1228b(r0)
        L7a:
            android.support.v4.media.MediaDescriptionCompat r0 = r1.m1227a()
            r0.f990i = r8
        L80:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.MediaDescriptionCompat.m1220a(java.lang.Object):android.support.v4.media.MediaDescriptionCompat");
    }

    /* renamed from: a */
    public Object m1221a() {
        if (this.f990i != null || Build.VERSION.SDK_INT < 21) {
            return this.f990i;
        }
        Object m1252a = C0234i.a.m1252a();
        C0234i.a.m1258a(m1252a, this.f982a);
        C0234i.a.m1260c(m1252a, this.f983b);
        C0234i.a.m1259b(m1252a, this.f984c);
        C0234i.a.m1257a(m1252a, this.f985d);
        C0234i.a.m1254a(m1252a, this.f986e);
        C0234i.a.m1255a(m1252a, this.f987f);
        Bundle bundle = this.f988g;
        if (Build.VERSION.SDK_INT < 23 && this.f989h != null) {
            if (bundle == null) {
                bundle = new Bundle();
                bundle.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
            }
            bundle.putParcelable("android.support.v4.media.description.MEDIA_URI", this.f989h);
        }
        C0234i.a.m1256a(m1252a, bundle);
        if (Build.VERSION.SDK_INT >= 23) {
            C0235j.a.m1262a(m1252a, this.f989h);
        }
        this.f990i = C0234i.a.m1253a(m1252a);
        return this.f990i;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return ((Object) this.f983b) + ", " + ((Object) this.f984c) + ", " + ((Object) this.f985d);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            C0234i.m1245a(m1221a(), parcel, i);
            return;
        }
        parcel.writeString(this.f982a);
        TextUtils.writeToParcel(this.f983b, parcel, i);
        TextUtils.writeToParcel(this.f984c, parcel, i);
        TextUtils.writeToParcel(this.f985d, parcel, i);
        parcel.writeParcelable(this.f986e, i);
        parcel.writeParcelable(this.f987f, i);
        parcel.writeBundle(this.f988g);
        parcel.writeParcelable(this.f989h, i);
    }
}
