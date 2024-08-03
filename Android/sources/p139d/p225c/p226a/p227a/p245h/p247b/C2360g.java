package p139d.p225c.p226a.p227a.p245h.p247b;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p139d.p225c.p226a.p227a.p270n.C2622I;

/* renamed from: d.c.a.a.h.b.g */
/* loaded from: classes.dex */
public final class C2360g extends AbstractC2368o {
    public static final Parcelable.Creator<C2360g> CREATOR = new C2359f();

    /* renamed from: a */
    public final String f9286a;

    /* renamed from: b */
    public final int f9287b;

    /* renamed from: c */
    public final int f9288c;

    /* renamed from: d */
    public final long f9289d;

    /* renamed from: e */
    public final long f9290e;

    /* renamed from: f */
    private final AbstractC2368o[] f9291f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2360g(Parcel parcel) {
        super("CHAP");
        String readString = parcel.readString();
        C2622I.m11050a(readString);
        this.f9286a = readString;
        this.f9287b = parcel.readInt();
        this.f9288c = parcel.readInt();
        this.f9289d = parcel.readLong();
        this.f9290e = parcel.readLong();
        int readInt = parcel.readInt();
        this.f9291f = new AbstractC2368o[readInt];
        for (int i = 0; i < readInt; i++) {
            this.f9291f[i] = (AbstractC2368o) parcel.readParcelable(AbstractC2368o.class.getClassLoader());
        }
    }

    public C2360g(String str, int i, int i2, long j, long j2, AbstractC2368o[] abstractC2368oArr) {
        super("CHAP");
        this.f9286a = str;
        this.f9287b = i;
        this.f9288c = i2;
        this.f9289d = j;
        this.f9290e = j2;
        this.f9291f = abstractC2368oArr;
    }

    @Override // p139d.p225c.p226a.p227a.p245h.p247b.AbstractC2368o, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2360g.class != obj.getClass()) {
            return false;
        }
        C2360g c2360g = (C2360g) obj;
        return this.f9287b == c2360g.f9287b && this.f9288c == c2360g.f9288c && this.f9289d == c2360g.f9289d && this.f9290e == c2360g.f9290e && C2622I.m11067a((Object) this.f9286a, (Object) c2360g.f9286a) && Arrays.equals(this.f9291f, c2360g.f9291f);
    }

    public int hashCode() {
        int i = (((((((527 + this.f9287b) * 31) + this.f9288c) * 31) + ((int) this.f9289d)) * 31) + ((int) this.f9290e)) * 31;
        String str = this.f9286a;
        return i + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f9286a);
        parcel.writeInt(this.f9287b);
        parcel.writeInt(this.f9288c);
        parcel.writeLong(this.f9289d);
        parcel.writeLong(this.f9290e);
        parcel.writeInt(this.f9291f.length);
        for (AbstractC2368o abstractC2368o : this.f9291f) {
            parcel.writeParcelable(abstractC2368o, 0);
        }
    }
}
