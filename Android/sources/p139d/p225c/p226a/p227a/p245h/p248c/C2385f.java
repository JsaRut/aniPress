package p139d.p225c.p226a.p227a.p245h.p248c;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p139d.p225c.p226a.p227a.p270n.C2619F;
import p139d.p225c.p226a.p227a.p270n.C2644u;

/* renamed from: d.c.a.a.h.c.f */
/* loaded from: classes.dex */
public final class C2385f extends AbstractC2382c {
    public static final Parcelable.Creator<C2385f> CREATOR = new C2384e();

    /* renamed from: a */
    public final long f9331a;

    /* renamed from: b */
    public final boolean f9332b;

    /* renamed from: c */
    public final boolean f9333c;

    /* renamed from: d */
    public final boolean f9334d;

    /* renamed from: e */
    public final boolean f9335e;

    /* renamed from: f */
    public final long f9336f;

    /* renamed from: g */
    public final long f9337g;

    /* renamed from: h */
    public final List<a> f9338h;

    /* renamed from: i */
    public final boolean f9339i;

    /* renamed from: j */
    public final long f9340j;

    /* renamed from: k */
    public final int f9341k;

    /* renamed from: l */
    public final int f9342l;

    /* renamed from: m */
    public final int f9343m;

    /* renamed from: d.c.a.a.h.c.f$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final int f9344a;

        /* renamed from: b */
        public final long f9345b;

        /* renamed from: c */
        public final long f9346c;

        private a(int i, long j, long j2) {
            this.f9344a = i;
            this.f9345b = j;
            this.f9346c = j2;
        }

        /* synthetic */ a(int i, long j, long j2, C2384e c2384e) {
            this(i, j, j2);
        }

        /* renamed from: a */
        public static a m9842a(Parcel parcel) {
            return new a(parcel.readInt(), parcel.readLong(), parcel.readLong());
        }

        /* renamed from: b */
        public void m9843b(Parcel parcel) {
            parcel.writeInt(this.f9344a);
            parcel.writeLong(this.f9345b);
            parcel.writeLong(this.f9346c);
        }
    }

    private C2385f(long j, boolean z, boolean z2, boolean z3, boolean z4, long j2, long j3, List<a> list, boolean z5, long j4, int i, int i2, int i3) {
        this.f9331a = j;
        this.f9332b = z;
        this.f9333c = z2;
        this.f9334d = z3;
        this.f9335e = z4;
        this.f9336f = j2;
        this.f9337g = j3;
        this.f9338h = Collections.unmodifiableList(list);
        this.f9339i = z5;
        this.f9340j = j4;
        this.f9341k = i;
        this.f9342l = i2;
        this.f9343m = i3;
    }

    private C2385f(Parcel parcel) {
        this.f9331a = parcel.readLong();
        this.f9332b = parcel.readByte() == 1;
        this.f9333c = parcel.readByte() == 1;
        this.f9334d = parcel.readByte() == 1;
        this.f9335e = parcel.readByte() == 1;
        this.f9336f = parcel.readLong();
        this.f9337g = parcel.readLong();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add(a.m9842a(parcel));
        }
        this.f9338h = Collections.unmodifiableList(arrayList);
        this.f9339i = parcel.readByte() == 1;
        this.f9340j = parcel.readLong();
        this.f9341k = parcel.readInt();
        this.f9342l = parcel.readInt();
        this.f9343m = parcel.readInt();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C2385f(Parcel parcel, C2384e c2384e) {
        this(parcel);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C2385f m9841a(C2644u c2644u, long j, C2619F c2619f) {
        List list;
        boolean z;
        boolean z2;
        long j2;
        boolean z3;
        long j3;
        int i;
        int i2;
        int i3;
        boolean z4;
        List list2;
        long j4;
        boolean z5;
        long m11240v = c2644u.m11240v();
        boolean z6 = (c2644u.m11238t() & 128) != 0;
        List emptyList = Collections.emptyList();
        if (z6) {
            list = emptyList;
            z = false;
            z2 = false;
            j2 = -9223372036854775807L;
            z3 = false;
            j3 = -9223372036854775807L;
            i = 0;
            i2 = 0;
            i3 = 0;
            z4 = false;
        } else {
            int m11238t = c2644u.m11238t();
            boolean z7 = (m11238t & 128) != 0;
            boolean z8 = (m11238t & 64) != 0;
            boolean z9 = (m11238t & 32) != 0;
            boolean z10 = (m11238t & 16) != 0;
            long m9855a = (!z8 || z10) ? -9223372036854775807L : C2391l.m9855a(c2644u, j);
            if (z8) {
                list2 = emptyList;
            } else {
                int m11238t2 = c2644u.m11238t();
                list2 = new ArrayList(m11238t2);
                for (int i4 = 0; i4 < m11238t2; i4++) {
                    int m11238t3 = c2644u.m11238t();
                    long m9855a2 = !z10 ? C2391l.m9855a(c2644u, j) : -9223372036854775807L;
                    list2.add(new a(m11238t3, m9855a2, c2619f.m11022b(m9855a2), null));
                }
            }
            if (z9) {
                long m11238t4 = c2644u.m11238t();
                z5 = (128 & m11238t4) != 0;
                j4 = ((((m11238t4 & 1) << 32) | c2644u.m11240v()) * 1000) / 90;
            } else {
                j4 = -9223372036854775807L;
                z5 = false;
            }
            int m11244z = c2644u.m11244z();
            i2 = c2644u.m11238t();
            i3 = c2644u.m11238t();
            z = z7;
            z4 = z8;
            list = list2;
            boolean z11 = z5;
            i = m11244z;
            long j5 = j4;
            z2 = z10;
            j2 = m9855a;
            z3 = z11;
            j3 = j5;
        }
        return new C2385f(m11240v, z6, z, z4, z2, j2, c2619f.m11022b(j2), list, z3, j3, i, i2, i3);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f9331a);
        parcel.writeByte(this.f9332b ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f9333c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f9334d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f9335e ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f9336f);
        parcel.writeLong(this.f9337g);
        int size = this.f9338h.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            this.f9338h.get(i2).m9843b(parcel);
        }
        parcel.writeByte(this.f9339i ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f9340j);
        parcel.writeInt(this.f9341k);
        parcel.writeInt(this.f9342l);
        parcel.writeInt(this.f9343m);
    }
}
