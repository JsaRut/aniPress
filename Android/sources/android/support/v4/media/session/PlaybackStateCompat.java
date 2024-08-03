package android.support.v4.media.session;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.C0253n;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new C0251l();

    /* renamed from: a */
    final int f1030a;

    /* renamed from: b */
    final long f1031b;

    /* renamed from: c */
    final long f1032c;

    /* renamed from: d */
    final float f1033d;

    /* renamed from: e */
    final long f1034e;

    /* renamed from: f */
    final int f1035f;

    /* renamed from: g */
    final CharSequence f1036g;

    /* renamed from: h */
    final long f1037h;

    /* renamed from: i */
    List<CustomAction> f1038i;

    /* renamed from: j */
    final long f1039j;

    /* renamed from: k */
    final Bundle f1040k;

    /* renamed from: l */
    private Object f1041l;

    /* loaded from: classes.dex */
    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new C0252m();

        /* renamed from: a */
        private final String f1042a;

        /* renamed from: b */
        private final CharSequence f1043b;

        /* renamed from: c */
        private final int f1044c;

        /* renamed from: d */
        private final Bundle f1045d;

        /* renamed from: e */
        private Object f1046e;

        public CustomAction(Parcel parcel) {
            this.f1042a = parcel.readString();
            this.f1043b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f1044c = parcel.readInt();
            this.f1045d = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }

        CustomAction(String str, CharSequence charSequence, int i, Bundle bundle) {
            this.f1042a = str;
            this.f1043b = charSequence;
            this.f1044c = i;
            this.f1045d = bundle;
        }

        /* renamed from: a */
        public static CustomAction m1278a(Object obj) {
            if (obj == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            CustomAction customAction = new CustomAction(C0253n.a.m1320a(obj), C0253n.a.m1323d(obj), C0253n.a.m1322c(obj), C0253n.a.m1321b(obj));
            customAction.f1046e = obj;
            return customAction;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "Action:mName='" + ((Object) this.f1043b) + ", mIcon=" + this.f1044c + ", mExtras=" + this.f1045d;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f1042a);
            TextUtils.writeToParcel(this.f1043b, parcel, i);
            parcel.writeInt(this.f1044c);
            parcel.writeBundle(this.f1045d);
        }
    }

    PlaybackStateCompat(int i, long j, long j2, float f, long j3, int i2, CharSequence charSequence, long j4, List<CustomAction> list, long j5, Bundle bundle) {
        this.f1030a = i;
        this.f1031b = j;
        this.f1032c = j2;
        this.f1033d = f;
        this.f1034e = j3;
        this.f1035f = i2;
        this.f1036g = charSequence;
        this.f1037h = j4;
        this.f1038i = new ArrayList(list);
        this.f1039j = j5;
        this.f1040k = bundle;
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.f1030a = parcel.readInt();
        this.f1031b = parcel.readLong();
        this.f1033d = parcel.readFloat();
        this.f1037h = parcel.readLong();
        this.f1032c = parcel.readLong();
        this.f1034e = parcel.readLong();
        this.f1036g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f1038i = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f1039j = parcel.readLong();
        this.f1040k = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f1035f = parcel.readInt();
    }

    /* renamed from: a */
    public static PlaybackStateCompat m1277a(Object obj) {
        ArrayList arrayList;
        if (obj == null || Build.VERSION.SDK_INT < 21) {
            return null;
        }
        List<Object> m1314d = C0253n.m1314d(obj);
        if (m1314d != null) {
            ArrayList arrayList2 = new ArrayList(m1314d.size());
            Iterator<Object> it = m1314d.iterator();
            while (it.hasNext()) {
                arrayList2.add(CustomAction.m1278a(it.next()));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(C0253n.m1319i(obj), C0253n.m1318h(obj), C0253n.m1313c(obj), C0253n.m1317g(obj), C0253n.m1311a(obj), 0, C0253n.m1315e(obj), C0253n.m1316f(obj), arrayList, C0253n.m1312b(obj), Build.VERSION.SDK_INT >= 22 ? C0254o.m1324a(obj) : null);
        playbackStateCompat.f1041l = obj;
        return playbackStateCompat;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "PlaybackState {state=" + this.f1030a + ", position=" + this.f1031b + ", buffered position=" + this.f1032c + ", speed=" + this.f1033d + ", updated=" + this.f1037h + ", actions=" + this.f1034e + ", error code=" + this.f1035f + ", error message=" + this.f1036g + ", custom actions=" + this.f1038i + ", active item id=" + this.f1039j + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f1030a);
        parcel.writeLong(this.f1031b);
        parcel.writeFloat(this.f1033d);
        parcel.writeLong(this.f1037h);
        parcel.writeLong(this.f1032c);
        parcel.writeLong(this.f1034e);
        TextUtils.writeToParcel(this.f1036g, parcel, i);
        parcel.writeTypedList(this.f1038i);
        parcel.writeLong(this.f1039j);
        parcel.writeBundle(this.f1040k);
        parcel.writeInt(this.f1035f);
    }
}
