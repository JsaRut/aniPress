package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseIntArray;

/* renamed from: androidx.versionedparcelable.c */
/* loaded from: classes.dex */
class C0490c extends AbstractC0489b {

    /* renamed from: a */
    private final SparseIntArray f2523a;

    /* renamed from: b */
    private final Parcel f2524b;

    /* renamed from: c */
    private final int f2525c;

    /* renamed from: d */
    private final int f2526d;

    /* renamed from: e */
    private final String f2527e;

    /* renamed from: f */
    private int f2528f;

    /* renamed from: g */
    private int f2529g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0490c(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "");
    }

    C0490c(Parcel parcel, int i, int i2, String str) {
        this.f2523a = new SparseIntArray();
        this.f2528f = -1;
        this.f2529g = 0;
        this.f2524b = parcel;
        this.f2525c = i;
        this.f2526d = i2;
        this.f2529g = this.f2525c;
        this.f2527e = str;
    }

    /* renamed from: d */
    private int m2625d(int i) {
        int readInt;
        do {
            int i2 = this.f2529g;
            if (i2 >= this.f2526d) {
                return -1;
            }
            this.f2524b.setDataPosition(i2);
            int readInt2 = this.f2524b.readInt();
            readInt = this.f2524b.readInt();
            this.f2529g += readInt2;
        } while (readInt != i);
        return this.f2524b.dataPosition();
    }

    @Override // androidx.versionedparcelable.AbstractC0489b
    /* renamed from: a */
    public void mo2603a() {
        int i = this.f2528f;
        if (i >= 0) {
            int i2 = this.f2523a.get(i);
            int dataPosition = this.f2524b.dataPosition();
            this.f2524b.setDataPosition(i2);
            this.f2524b.writeInt(dataPosition - i2);
            this.f2524b.setDataPosition(dataPosition);
        }
    }

    @Override // androidx.versionedparcelable.AbstractC0489b
    /* renamed from: a */
    public void mo2604a(Parcelable parcelable) {
        this.f2524b.writeParcelable(parcelable, 0);
    }

    @Override // androidx.versionedparcelable.AbstractC0489b
    /* renamed from: a */
    public void mo2606a(String str) {
        this.f2524b.writeString(str);
    }

    @Override // androidx.versionedparcelable.AbstractC0489b
    /* renamed from: a */
    public void mo2608a(byte[] bArr) {
        if (bArr == null) {
            this.f2524b.writeInt(-1);
        } else {
            this.f2524b.writeInt(bArr.length);
            this.f2524b.writeByteArray(bArr);
        }
    }

    @Override // androidx.versionedparcelable.AbstractC0489b
    /* renamed from: a */
    public boolean mo2609a(int i) {
        int m2625d = m2625d(i);
        if (m2625d == -1) {
            return false;
        }
        this.f2524b.setDataPosition(m2625d);
        return true;
    }

    @Override // androidx.versionedparcelable.AbstractC0489b
    /* renamed from: b */
    protected AbstractC0489b mo2611b() {
        Parcel parcel = this.f2524b;
        int dataPosition = parcel.dataPosition();
        int i = this.f2529g;
        if (i == this.f2525c) {
            i = this.f2526d;
        }
        return new C0490c(parcel, dataPosition, i, this.f2527e + "  ");
    }

    @Override // androidx.versionedparcelable.AbstractC0489b
    /* renamed from: b */
    public void mo2612b(int i) {
        mo2603a();
        this.f2528f = i;
        this.f2523a.put(i, this.f2524b.dataPosition());
        mo2618c(0);
        mo2618c(i);
    }

    @Override // androidx.versionedparcelable.AbstractC0489b
    /* renamed from: c */
    public void mo2618c(int i) {
        this.f2524b.writeInt(i);
    }

    @Override // androidx.versionedparcelable.AbstractC0489b
    /* renamed from: d */
    public byte[] mo2620d() {
        int readInt = this.f2524b.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f2524b.readByteArray(bArr);
        return bArr;
    }

    @Override // androidx.versionedparcelable.AbstractC0489b
    /* renamed from: e */
    public int mo2621e() {
        return this.f2524b.readInt();
    }

    @Override // androidx.versionedparcelable.AbstractC0489b
    /* renamed from: f */
    public <T extends Parcelable> T mo2622f() {
        return (T) this.f2524b.readParcelable(C0490c.class.getClassLoader());
    }

    @Override // androidx.versionedparcelable.AbstractC0489b
    /* renamed from: g */
    public String mo2623g() {
        return this.f2524b.readString();
    }
}
