package android.support.v4.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.widget.C0293k;

/* renamed from: android.support.v4.widget.l */
/* loaded from: classes.dex */
class C0294l implements Parcelable.ClassLoaderCreator<C0293k.e> {
    @Override // android.os.Parcelable.Creator
    public C0293k.e createFromParcel(Parcel parcel) {
        return new C0293k.e(parcel, null);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.ClassLoaderCreator
    public C0293k.e createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new C0293k.e(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public C0293k.e[] newArray(int i) {
        return new C0293k.e[i];
    }
}
