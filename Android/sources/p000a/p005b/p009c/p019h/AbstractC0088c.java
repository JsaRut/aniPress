package p000a.p005b.p009c.p019h;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: a.b.c.h.c */
/* loaded from: classes.dex */
public abstract class AbstractC0088c implements Parcelable {

    /* renamed from: b */
    private final Parcelable f377b;

    /* renamed from: a */
    public static final AbstractC0088c f376a = new C0079a();
    public static final Parcelable.Creator<AbstractC0088c> CREATOR = new C0083b();

    private AbstractC0088c() {
        this.f377b = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ AbstractC0088c(C0079a c0079a) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC0088c(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f377b = readParcelable == null ? f376a : readParcelable;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC0088c(Parcelable parcelable) {
        if (parcelable == null) {
            throw new IllegalArgumentException("superState must not be null");
        }
        this.f377b = parcelable == f376a ? null : parcelable;
    }

    /* renamed from: a */
    public final Parcelable m411a() {
        return this.f377b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f377b, i);
    }
}
