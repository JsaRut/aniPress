package android.support.v7.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v7.widget.Toolbar;

/* renamed from: android.support.v7.widget.za */
/* loaded from: classes.dex */
class C0487za implements Parcelable.ClassLoaderCreator<Toolbar.C0428d> {
    @Override // android.os.Parcelable.Creator
    public Toolbar.C0428d createFromParcel(Parcel parcel) {
        return new Toolbar.C0428d(parcel, null);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.ClassLoaderCreator
    public Toolbar.C0428d createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new Toolbar.C0428d(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public Toolbar.C0428d[] newArray(int i) {
        return new Toolbar.C0428d[i];
    }
}
