package p000a.p005b.p009c.p019h;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: a.b.c.h.b */
/* loaded from: classes.dex */
class C0083b implements Parcelable.ClassLoaderCreator<AbstractC0088c> {
    @Override // android.os.Parcelable.Creator
    public AbstractC0088c createFromParcel(Parcel parcel) {
        return createFromParcel(parcel, (ClassLoader) null);
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public AbstractC0088c createFromParcel(Parcel parcel, ClassLoader classLoader) {
        if (parcel.readParcelable(classLoader) == null) {
            return AbstractC0088c.f376a;
        }
        throw new IllegalStateException("superState must be null");
    }

    @Override // android.os.Parcelable.Creator
    public AbstractC0088c[] newArray(int i) {
        return new AbstractC0088c[i];
    }
}
