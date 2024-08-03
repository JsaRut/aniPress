package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new C0250k();

    /* renamed from: a */
    public int f1025a;

    /* renamed from: b */
    public int f1026b;

    /* renamed from: c */
    public int f1027c;

    /* renamed from: d */
    public int f1028d;

    /* renamed from: e */
    public int f1029e;

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f1025a = parcel.readInt();
        this.f1027c = parcel.readInt();
        this.f1028d = parcel.readInt();
        this.f1029e = parcel.readInt();
        this.f1026b = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f1025a);
        parcel.writeInt(this.f1027c);
        parcel.writeInt(this.f1028d);
        parcel.writeInt(this.f1029e);
        parcel.writeInt(this.f1026b);
    }
}
