package p139d.p225c.p226a.p227a.p245h.p247b;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p139d.p225c.p226a.p227a.p270n.C2622I;

/* renamed from: d.c.a.a.h.b.i */
/* loaded from: classes.dex */
public final class C2362i extends AbstractC2368o {
    public static final Parcelable.Creator<C2362i> CREATOR = new C2361h();

    /* renamed from: a */
    public final String f9292a;

    /* renamed from: b */
    public final boolean f9293b;

    /* renamed from: c */
    public final boolean f9294c;

    /* renamed from: d */
    public final String[] f9295d;

    /* renamed from: e */
    private final AbstractC2368o[] f9296e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2362i(Parcel parcel) {
        super("CTOC");
        String readString = parcel.readString();
        C2622I.m11050a(readString);
        this.f9292a = readString;
        this.f9293b = parcel.readByte() != 0;
        this.f9294c = parcel.readByte() != 0;
        this.f9295d = parcel.createStringArray();
        int readInt = parcel.readInt();
        this.f9296e = new AbstractC2368o[readInt];
        for (int i = 0; i < readInt; i++) {
            this.f9296e[i] = (AbstractC2368o) parcel.readParcelable(AbstractC2368o.class.getClassLoader());
        }
    }

    public C2362i(String str, boolean z, boolean z2, String[] strArr, AbstractC2368o[] abstractC2368oArr) {
        super("CTOC");
        this.f9292a = str;
        this.f9293b = z;
        this.f9294c = z2;
        this.f9295d = strArr;
        this.f9296e = abstractC2368oArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2362i.class != obj.getClass()) {
            return false;
        }
        C2362i c2362i = (C2362i) obj;
        return this.f9293b == c2362i.f9293b && this.f9294c == c2362i.f9294c && C2622I.m11067a((Object) this.f9292a, (Object) c2362i.f9292a) && Arrays.equals(this.f9295d, c2362i.f9295d) && Arrays.equals(this.f9296e, c2362i.f9296e);
    }

    public int hashCode() {
        int i = (((527 + (this.f9293b ? 1 : 0)) * 31) + (this.f9294c ? 1 : 0)) * 31;
        String str = this.f9292a;
        return i + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f9292a);
        parcel.writeByte(this.f9293b ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f9294c ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f9295d);
        parcel.writeInt(this.f9296e.length);
        for (AbstractC2368o abstractC2368o : this.f9296e) {
            parcel.writeParcelable(abstractC2368o, 0);
        }
    }
}
