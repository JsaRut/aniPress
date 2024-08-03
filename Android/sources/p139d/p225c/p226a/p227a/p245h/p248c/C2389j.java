package p139d.p225c.p226a.p227a.p245h.p248c;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p139d.p225c.p226a.p227a.p270n.C2644u;

/* renamed from: d.c.a.a.h.c.j */
/* loaded from: classes.dex */
public final class C2389j extends AbstractC2382c {
    public static final Parcelable.Creator<C2389j> CREATOR = new C2388i();

    /* renamed from: a */
    public final List<b> f9347a;

    /* renamed from: d.c.a.a.h.c.j$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final int f9348a;

        /* renamed from: b */
        public final long f9349b;

        private a(int i, long j) {
            this.f9348a = i;
            this.f9349b = j;
        }

        /* synthetic */ a(int i, long j, C2388i c2388i) {
            this(i, j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public static a m9847b(Parcel parcel) {
            return new a(parcel.readInt(), parcel.readLong());
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public void m9848c(Parcel parcel) {
            parcel.writeInt(this.f9348a);
            parcel.writeLong(this.f9349b);
        }
    }

    /* renamed from: d.c.a.a.h.c.j$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        public final long f9350a;

        /* renamed from: b */
        public final boolean f9351b;

        /* renamed from: c */
        public final boolean f9352c;

        /* renamed from: d */
        public final boolean f9353d;

        /* renamed from: e */
        public final long f9354e;

        /* renamed from: f */
        public final List<a> f9355f;

        /* renamed from: g */
        public final boolean f9356g;

        /* renamed from: h */
        public final long f9357h;

        /* renamed from: i */
        public final int f9358i;

        /* renamed from: j */
        public final int f9359j;

        /* renamed from: k */
        public final int f9360k;

        private b(long j, boolean z, boolean z2, boolean z3, List<a> list, long j2, boolean z4, long j3, int i, int i2, int i3) {
            this.f9350a = j;
            this.f9351b = z;
            this.f9352c = z2;
            this.f9353d = z3;
            this.f9355f = Collections.unmodifiableList(list);
            this.f9354e = j2;
            this.f9356g = z4;
            this.f9357h = j3;
            this.f9358i = i;
            this.f9359j = i2;
            this.f9360k = i3;
        }

        private b(Parcel parcel) {
            this.f9350a = parcel.readLong();
            this.f9351b = parcel.readByte() == 1;
            this.f9352c = parcel.readByte() == 1;
            this.f9353d = parcel.readByte() == 1;
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i < readInt; i++) {
                arrayList.add(a.m9847b(parcel));
            }
            this.f9355f = Collections.unmodifiableList(arrayList);
            this.f9354e = parcel.readLong();
            this.f9356g = parcel.readByte() == 1;
            this.f9357h = parcel.readLong();
            this.f9358i = parcel.readInt();
            this.f9359j = parcel.readInt();
            this.f9360k = parcel.readInt();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public static b m9852b(Parcel parcel) {
            return new b(parcel);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public static b m9853b(C2644u c2644u) {
            ArrayList arrayList;
            boolean z;
            long j;
            boolean z2;
            long j2;
            int i;
            int i2;
            int i3;
            boolean z3;
            boolean z4;
            long j3;
            long m11240v = c2644u.m11240v();
            boolean z5 = (c2644u.m11238t() & 128) != 0;
            ArrayList arrayList2 = new ArrayList();
            if (z5) {
                arrayList = arrayList2;
                z = false;
                j = -9223372036854775807L;
                z2 = false;
                j2 = -9223372036854775807L;
                i = 0;
                i2 = 0;
                i3 = 0;
                z3 = false;
            } else {
                int m11238t = c2644u.m11238t();
                boolean z6 = (m11238t & 128) != 0;
                boolean z7 = (m11238t & 64) != 0;
                boolean z8 = (m11238t & 32) != 0;
                long m11240v2 = z7 ? c2644u.m11240v() : -9223372036854775807L;
                if (!z7) {
                    int m11238t2 = c2644u.m11238t();
                    ArrayList arrayList3 = new ArrayList(m11238t2);
                    for (int i4 = 0; i4 < m11238t2; i4++) {
                        arrayList3.add(new a(c2644u.m11238t(), c2644u.m11240v(), null));
                    }
                    arrayList2 = arrayList3;
                }
                if (z8) {
                    long m11238t3 = c2644u.m11238t();
                    z4 = (128 & m11238t3) != 0;
                    j3 = ((((m11238t3 & 1) << 32) | c2644u.m11240v()) * 1000) / 90;
                } else {
                    z4 = false;
                    j3 = -9223372036854775807L;
                }
                int m11244z = c2644u.m11244z();
                int m11238t4 = c2644u.m11238t();
                i3 = c2644u.m11238t();
                z3 = z7;
                j = m11240v2;
                j2 = j3;
                arrayList = arrayList2;
                i = m11244z;
                i2 = m11238t4;
                z = z6;
                z2 = z4;
            }
            return new b(m11240v, z5, z, z3, arrayList, j, z2, j2, i, i2, i3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public void m9854c(Parcel parcel) {
            parcel.writeLong(this.f9350a);
            parcel.writeByte(this.f9351b ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f9352c ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f9353d ? (byte) 1 : (byte) 0);
            int size = this.f9355f.size();
            parcel.writeInt(size);
            for (int i = 0; i < size; i++) {
                this.f9355f.get(i).m9848c(parcel);
            }
            parcel.writeLong(this.f9354e);
            parcel.writeByte(this.f9356g ? (byte) 1 : (byte) 0);
            parcel.writeLong(this.f9357h);
            parcel.writeInt(this.f9358i);
            parcel.writeInt(this.f9359j);
            parcel.writeInt(this.f9360k);
        }
    }

    private C2389j(Parcel parcel) {
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add(b.m9852b(parcel));
        }
        this.f9347a = Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C2389j(Parcel parcel, C2388i c2388i) {
        this(parcel);
    }

    private C2389j(List<b> list) {
        this.f9347a = Collections.unmodifiableList(list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C2389j m9844a(C2644u c2644u) {
        int m11238t = c2644u.m11238t();
        ArrayList arrayList = new ArrayList(m11238t);
        for (int i = 0; i < m11238t; i++) {
            arrayList.add(b.m9853b(c2644u));
        }
        return new C2389j(arrayList);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int size = this.f9347a.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            this.f9347a.get(i2).m9854c(parcel);
        }
    }
}
