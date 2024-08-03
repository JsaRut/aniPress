package android.support.v4.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.widget.NestedScrollView;

/* renamed from: android.support.v4.widget.r */
/* loaded from: classes.dex */
class C0300r implements Parcelable.Creator<NestedScrollView.C0282c> {
    @Override // android.os.Parcelable.Creator
    public NestedScrollView.C0282c createFromParcel(Parcel parcel) {
        return new NestedScrollView.C0282c(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public NestedScrollView.C0282c[] newArray(int i) {
        return new NestedScrollView.C0282c[i];
    }
}
