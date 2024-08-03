package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.app.C0195d;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;

/* renamed from: android.support.v4.app.f */
/* loaded from: classes.dex */
public final class C0199f implements Parcelable {
    public static final Parcelable.Creator<C0199f> CREATOR = new C0197e();

    /* renamed from: a */
    final int[] f755a;

    /* renamed from: b */
    final int f756b;

    /* renamed from: c */
    final int f757c;

    /* renamed from: d */
    final String f758d;

    /* renamed from: e */
    final int f759e;

    /* renamed from: f */
    final int f760f;

    /* renamed from: g */
    final CharSequence f761g;

    /* renamed from: h */
    final int f762h;

    /* renamed from: i */
    final CharSequence f763i;

    /* renamed from: j */
    final ArrayList<String> f764j;

    /* renamed from: k */
    final ArrayList<String> f765k;

    /* renamed from: l */
    final boolean f766l;

    public C0199f(Parcel parcel) {
        this.f755a = parcel.createIntArray();
        this.f756b = parcel.readInt();
        this.f757c = parcel.readInt();
        this.f758d = parcel.readString();
        this.f759e = parcel.readInt();
        this.f760f = parcel.readInt();
        this.f761g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f762h = parcel.readInt();
        this.f763i = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f764j = parcel.createStringArrayList();
        this.f765k = parcel.createStringArrayList();
        this.f766l = parcel.readInt() != 0;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public C0199f(C0195d c0195d) {
        int size = c0195d.f725b.size();
        this.f755a = new int[size * 6];
        if (!c0195d.f732i) {
            throw new IllegalStateException("Not on back stack");
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            C0195d.a aVar = c0195d.f725b.get(i2);
            int[] iArr = this.f755a;
            int i3 = i + 1;
            iArr[i] = aVar.f745a;
            int i4 = i3 + 1;
            ComponentCallbacksC0205l componentCallbacksC0205l = aVar.f746b;
            iArr[i3] = componentCallbacksC0205l != null ? componentCallbacksC0205l.f811g : -1;
            int[] iArr2 = this.f755a;
            int i5 = i4 + 1;
            iArr2[i4] = aVar.f747c;
            int i6 = i5 + 1;
            iArr2[i5] = aVar.f748d;
            int i7 = i6 + 1;
            iArr2[i6] = aVar.f749e;
            i = i7 + 1;
            iArr2[i7] = aVar.f750f;
        }
        this.f756b = c0195d.f730g;
        this.f757c = c0195d.f731h;
        this.f758d = c0195d.f734k;
        this.f759e = c0195d.f736m;
        this.f760f = c0195d.f737n;
        this.f761g = c0195d.f738o;
        this.f762h = c0195d.f739p;
        this.f763i = c0195d.f740q;
        this.f764j = c0195d.f741r;
        this.f765k = c0195d.f742s;
        this.f766l = c0195d.f743t;
    }

    /* renamed from: a */
    public C0195d m883a(LayoutInflaterFactory2C0219z layoutInflaterFactory2C0219z) {
        C0195d c0195d = new C0195d(layoutInflaterFactory2C0219z);
        int i = 0;
        int i2 = 0;
        while (i < this.f755a.length) {
            C0195d.a aVar = new C0195d.a();
            int i3 = i + 1;
            aVar.f745a = this.f755a[i];
            if (LayoutInflaterFactory2C0219z.f887a) {
                Log.v("FragmentManager", "Instantiate " + c0195d + " op #" + i2 + " base fragment #" + this.f755a[i3]);
            }
            int i4 = i3 + 1;
            int i5 = this.f755a[i3];
            aVar.f746b = i5 >= 0 ? layoutInflaterFactory2C0219z.f907k.get(i5) : null;
            int[] iArr = this.f755a;
            int i6 = i4 + 1;
            aVar.f747c = iArr[i4];
            int i7 = i6 + 1;
            aVar.f748d = iArr[i6];
            int i8 = i7 + 1;
            aVar.f749e = iArr[i7];
            aVar.f750f = iArr[i8];
            c0195d.f726c = aVar.f747c;
            c0195d.f727d = aVar.f748d;
            c0195d.f728e = aVar.f749e;
            c0195d.f729f = aVar.f750f;
            c0195d.m862a(aVar);
            i2++;
            i = i8 + 1;
        }
        c0195d.f730g = this.f756b;
        c0195d.f731h = this.f757c;
        c0195d.f734k = this.f758d;
        c0195d.f736m = this.f759e;
        c0195d.f732i = true;
        c0195d.f737n = this.f760f;
        c0195d.f738o = this.f761g;
        c0195d.f739p = this.f762h;
        c0195d.f740q = this.f763i;
        c0195d.f741r = this.f764j;
        c0195d.f742s = this.f765k;
        c0195d.f743t = this.f766l;
        c0195d.m861a(1);
        return c0195d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f755a);
        parcel.writeInt(this.f756b);
        parcel.writeInt(this.f757c);
        parcel.writeString(this.f758d);
        parcel.writeInt(this.f759e);
        parcel.writeInt(this.f760f);
        TextUtils.writeToParcel(this.f761g, parcel, 0);
        parcel.writeInt(this.f762h);
        TextUtils.writeToParcel(this.f763i, parcel, 0);
        parcel.writeStringList(this.f764j);
        parcel.writeStringList(this.f765k);
        parcel.writeInt(this.f766l ? 1 : 0);
    }
}
