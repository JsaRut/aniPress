package android.support.v4.media.session;

import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class MediaSessionCompat {

    /* loaded from: classes.dex */
    public static final class QueueItem implements Parcelable {
        public static final Parcelable.Creator<QueueItem> CREATOR = new C0246g();

        /* renamed from: a */
        private final MediaDescriptionCompat f1018a;

        /* renamed from: b */
        private final long f1019b;

        /* renamed from: c */
        private Object f1020c;

        public QueueItem(Parcel parcel) {
            this.f1018a = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.f1019b = parcel.readLong();
        }

        private QueueItem(Object obj, MediaDescriptionCompat mediaDescriptionCompat, long j) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("Description cannot be null.");
            }
            if (j == -1) {
                throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
            }
            this.f1018a = mediaDescriptionCompat;
            this.f1019b = j;
            this.f1020c = obj;
        }

        /* renamed from: a */
        public static QueueItem m1272a(Object obj) {
            if (obj == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            return new QueueItem(obj, MediaDescriptionCompat.m1220a(C0249j.m1309a(obj)), C0249j.m1310b(obj));
        }

        /* renamed from: a */
        public static List<QueueItem> m1273a(List<?> list) {
            if (list == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            Iterator<?> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(m1272a(it.next()));
            }
            return arrayList;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "MediaSession.QueueItem {Description=" + this.f1018a + ", Id=" + this.f1019b + " }";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            this.f1018a.writeToParcel(parcel, i);
            parcel.writeLong(this.f1019b);
        }
    }

    /* loaded from: classes.dex */
    public static final class ResultReceiverWrapper implements Parcelable {
        public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new C0247h();

        /* renamed from: a */
        ResultReceiver f1021a;

        public ResultReceiverWrapper(Parcel parcel) {
            this.f1021a = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            this.f1021a.writeToParcel(parcel, i);
        }
    }

    /* loaded from: classes.dex */
    public static final class Token implements Parcelable {
        public static final Parcelable.Creator<Token> CREATOR = new C0248i();

        /* renamed from: a */
        private final Object f1022a;

        /* renamed from: b */
        private InterfaceC0241b f1023b;

        /* renamed from: c */
        private Bundle f1024c;

        public Token(Object obj) {
            this(obj, null, null);
        }

        Token(Object obj, InterfaceC0241b interfaceC0241b, Bundle bundle) {
            this.f1022a = obj;
            this.f1023b = interfaceC0241b;
            this.f1024c = bundle;
        }

        /* renamed from: a */
        public InterfaceC0241b m1274a() {
            return this.f1023b;
        }

        /* renamed from: a */
        public void m1275a(Bundle bundle) {
            this.f1024c = bundle;
        }

        /* renamed from: a */
        public void m1276a(InterfaceC0241b interfaceC0241b) {
            this.f1023b = interfaceC0241b;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Token)) {
                return false;
            }
            Token token = (Token) obj;
            Object obj2 = this.f1022a;
            if (obj2 == null) {
                return token.f1022a == null;
            }
            Object obj3 = token.f1022a;
            if (obj3 == null) {
                return false;
            }
            return obj2.equals(obj3);
        }

        public int hashCode() {
            Object obj = this.f1022a;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            if (Build.VERSION.SDK_INT >= 21) {
                parcel.writeParcelable((Parcelable) this.f1022a, i);
            } else {
                parcel.writeStrongBinder((IBinder) this.f1022a);
            }
        }
    }

    /* renamed from: a */
    public static void m1271a(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
        }
    }
}
