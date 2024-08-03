package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.app.ComponentCallbacksC0205l;

/* renamed from: android.support.v4.app.m */
/* loaded from: classes.dex */
class C0206m implements Parcelable.ClassLoaderCreator<ComponentCallbacksC0205l.d> {
    @Override // android.os.Parcelable.Creator
    public ComponentCallbacksC0205l.d createFromParcel(Parcel parcel) {
        return new ComponentCallbacksC0205l.d(parcel, null);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.ClassLoaderCreator
    public ComponentCallbacksC0205l.d createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new ComponentCallbacksC0205l.d(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public ComponentCallbacksC0205l.d[] newArray(int i) {
        return new ComponentCallbacksC0205l.d[i];
    }
}
