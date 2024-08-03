package p139d.p225c.p226a.p227a.p245h.p248c;

import android.os.Parcel;
import android.os.Parcelable;
import p139d.p225c.p226a.p227a.p270n.C2644u;

/* renamed from: d.c.a.a.h.c.b */
/* loaded from: classes.dex */
public final class C2381b extends AbstractC2382c {
    public static final Parcelable.Creator<C2381b> CREATOR = new C2380a();

    /* renamed from: a */
    public final long f9325a;

    /* renamed from: b */
    public final long f9326b;

    /* renamed from: c */
    public final byte[] f9327c;

    private C2381b(long j, byte[] bArr, long j2) {
        this.f9325a = j2;
        this.f9326b = j;
        this.f9327c = bArr;
    }

    private C2381b(Parcel parcel) {
        this.f9325a = parcel.readLong();
        this.f9326b = parcel.readLong();
        this.f9327c = new byte[parcel.readInt()];
        parcel.readByteArray(this.f9327c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C2381b(Parcel parcel, C2380a c2380a) {
        this(parcel);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C2381b m9840a(C2644u c2644u, int i, long j) {
        long m11240v = c2644u.m11240v();
        byte[] bArr = new byte[i - 4];
        c2644u.m11214a(bArr, 0, bArr.length);
        return new C2381b(m11240v, bArr, j);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f9325a);
        parcel.writeLong(this.f9326b);
        parcel.writeInt(this.f9327c.length);
        parcel.writeByteArray(this.f9327c);
    }
}
