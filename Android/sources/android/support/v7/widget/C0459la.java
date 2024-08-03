package android.support.v7.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v7.widget.SearchView;

/* renamed from: android.support.v7.widget.la */
/* loaded from: classes.dex */
class C0459la implements Parcelable.ClassLoaderCreator<SearchView.C0422e> {
    @Override // android.os.Parcelable.Creator
    public SearchView.C0422e createFromParcel(Parcel parcel) {
        return new SearchView.C0422e(parcel, null);
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public SearchView.C0422e createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new SearchView.C0422e(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public SearchView.C0422e[] newArray(int i) {
        return new SearchView.C0422e[i];
    }
}
