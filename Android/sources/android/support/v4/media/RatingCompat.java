package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new C0238m();

    /* renamed from: a */
    private final int f1005a;

    /* renamed from: b */
    private final float f1006b;

    public RatingCompat(int i, float f) {
        this.f1005a = i;
        this.f1006b = f;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return this.f1005a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Rating:style=");
        sb.append(this.f1005a);
        sb.append(" rating=");
        float f = this.f1006b;
        sb.append(f < 0.0f ? "unrated" : String.valueOf(f));
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f1005a);
        parcel.writeFloat(this.f1006b);
    }
}
