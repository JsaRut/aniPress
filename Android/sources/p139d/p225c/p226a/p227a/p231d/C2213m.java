package p139d.p225c.p226a.p227a.p231d;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;
import p139d.p225c.p226a.p227a.C2200d;
import p139d.p225c.p226a.p227a.p270n.C2622I;
import p139d.p225c.p226a.p227a.p270n.C2628e;

/* renamed from: d.c.a.a.d.m */
/* loaded from: classes.dex */
public final class C2213m implements Comparator<a>, Parcelable {
    public static final Parcelable.Creator<C2213m> CREATOR = new C2211k();

    /* renamed from: a */
    private final a[] f8106a;

    /* renamed from: b */
    private int f8107b;

    /* renamed from: c */
    public final String f8108c;

    /* renamed from: d */
    public final int f8109d;

    /* renamed from: d.c.a.a.d.m$a */
    /* loaded from: classes.dex */
    public static final class a implements Parcelable {
        public static final Parcelable.Creator<a> CREATOR = new C2212l();

        /* renamed from: a */
        private int f8110a;

        /* renamed from: b */
        private final UUID f8111b;

        /* renamed from: c */
        public final String f8112c;

        /* renamed from: d */
        public final String f8113d;

        /* renamed from: e */
        public final byte[] f8114e;

        /* renamed from: f */
        public final boolean f8115f;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(Parcel parcel) {
            this.f8111b = new UUID(parcel.readLong(), parcel.readLong());
            this.f8112c = parcel.readString();
            this.f8113d = parcel.readString();
            this.f8114e = parcel.createByteArray();
            this.f8115f = parcel.readByte() != 0;
        }

        public a(UUID uuid, String str, String str2, byte[] bArr, boolean z) {
            C2628e.m11110a(uuid);
            this.f8111b = uuid;
            this.f8112c = str;
            C2628e.m11110a(str2);
            this.f8113d = str2;
            this.f8114e = bArr;
            this.f8115f = z;
        }

        public a(UUID uuid, String str, byte[] bArr) {
            this(uuid, str, bArr, false);
        }

        public a(UUID uuid, String str, byte[] bArr, boolean z) {
            this(uuid, null, str, bArr, z);
        }

        /* renamed from: a */
        public a m9094a(byte[] bArr) {
            return new a(this.f8111b, this.f8112c, this.f8113d, bArr, this.f8115f);
        }

        /* renamed from: a */
        public boolean m9095a() {
            return this.f8114e != null;
        }

        /* renamed from: a */
        public boolean m9096a(UUID uuid) {
            return C2200d.f8059a.equals(this.f8111b) || uuid.equals(this.f8111b);
        }

        /* renamed from: b */
        public boolean m9097b(a aVar) {
            return m9095a() && !aVar.m9095a() && m9096a(aVar.f8111b);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            a aVar = (a) obj;
            return C2622I.m11067a((Object) this.f8112c, (Object) aVar.f8112c) && C2622I.m11067a((Object) this.f8113d, (Object) aVar.f8113d) && C2622I.m11067a(this.f8111b, aVar.f8111b) && Arrays.equals(this.f8114e, aVar.f8114e);
        }

        public int hashCode() {
            if (this.f8110a == 0) {
                int hashCode = this.f8111b.hashCode() * 31;
                String str = this.f8112c;
                this.f8110a = ((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f8113d.hashCode()) * 31) + Arrays.hashCode(this.f8114e);
            }
            return this.f8110a;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.f8111b.getMostSignificantBits());
            parcel.writeLong(this.f8111b.getLeastSignificantBits());
            parcel.writeString(this.f8112c);
            parcel.writeString(this.f8113d);
            parcel.writeByteArray(this.f8114e);
            parcel.writeByte(this.f8115f ? (byte) 1 : (byte) 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2213m(Parcel parcel) {
        this.f8108c = parcel.readString();
        this.f8106a = (a[]) parcel.createTypedArray(a.CREATOR);
        this.f8109d = this.f8106a.length;
    }

    public C2213m(String str, List<a> list) {
        this(str, false, (a[]) list.toArray(new a[list.size()]));
    }

    private C2213m(String str, boolean z, a... aVarArr) {
        this.f8108c = str;
        aVarArr = z ? (a[]) aVarArr.clone() : aVarArr;
        Arrays.sort(aVarArr, this);
        this.f8106a = aVarArr;
        this.f8109d = aVarArr.length;
    }

    public C2213m(String str, a... aVarArr) {
        this(str, true, aVarArr);
    }

    public C2213m(List<a> list) {
        this(null, false, (a[]) list.toArray(new a[list.size()]));
    }

    public C2213m(a... aVarArr) {
        this((String) null, aVarArr);
    }

    /* renamed from: a */
    public static C2213m m9088a(C2213m c2213m, C2213m c2213m2) {
        String str;
        ArrayList arrayList = new ArrayList();
        if (c2213m != null) {
            str = c2213m.f8108c;
            for (a aVar : c2213m.f8106a) {
                if (aVar.m9095a()) {
                    arrayList.add(aVar);
                }
            }
        } else {
            str = null;
        }
        if (c2213m2 != null) {
            if (str == null) {
                str = c2213m2.f8108c;
            }
            int size = arrayList.size();
            for (a aVar2 : c2213m2.f8106a) {
                if (aVar2.m9095a() && !m9089a(arrayList, size, aVar2.f8111b)) {
                    arrayList.add(aVar2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C2213m(str, arrayList);
    }

    /* renamed from: a */
    private static boolean m9089a(ArrayList<a> arrayList, int i, UUID uuid) {
        for (int i2 = 0; i2 < i; i2++) {
            if (arrayList.get(i2).f8111b.equals(uuid)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Comparator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(a aVar, a aVar2) {
        return C2200d.f8059a.equals(aVar.f8111b) ? C2200d.f8059a.equals(aVar2.f8111b) ? 0 : 1 : aVar.f8111b.compareTo(aVar2.f8111b);
    }

    /* renamed from: a */
    public a m9091a(int i) {
        return this.f8106a[i];
    }

    /* renamed from: a */
    public C2213m m9092a(String str) {
        return C2622I.m11067a((Object) this.f8108c, (Object) str) ? this : new C2213m(str, false, this.f8106a);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2213m.class != obj.getClass()) {
            return false;
        }
        C2213m c2213m = (C2213m) obj;
        return C2622I.m11067a((Object) this.f8108c, (Object) c2213m.f8108c) && Arrays.equals(this.f8106a, c2213m.f8106a);
    }

    public int hashCode() {
        if (this.f8107b == 0) {
            String str = this.f8108c;
            this.f8107b = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f8106a);
        }
        return this.f8107b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f8108c);
        parcel.writeTypedArray(this.f8106a, 0);
    }
}
