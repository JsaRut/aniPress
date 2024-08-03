package p139d.p225c.p226a.p227a.p245h.p248c;

import android.os.Parcel;
import android.os.Parcelable;
import p139d.p225c.p226a.p227a.p270n.C2619F;
import p139d.p225c.p226a.p227a.p270n.C2644u;

/* renamed from: d.c.a.a.h.c.l */
/* loaded from: classes.dex */
public final class C2391l extends AbstractC2382c {
    public static final Parcelable.Creator<C2391l> CREATOR = new C2390k();

    /* renamed from: a */
    public final long f9361a;

    /* renamed from: b */
    public final long f9362b;

    private C2391l(long j, long j2) {
        this.f9361a = j;
        this.f9362b = j2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C2391l(long j, long j2, C2390k c2390k) {
        this(j, j2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static long m9855a(C2644u c2644u, long j) {
        long m11238t = c2644u.m11238t();
        if ((128 & m11238t) != 0) {
            return 8589934591L & ((((m11238t & 1) << 32) | c2644u.m11240v()) + j);
        }
        return -9223372036854775807L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C2391l m9856a(C2644u c2644u, long j, C2619F c2619f) {
        long m9855a = m9855a(c2644u, j);
        return new C2391l(m9855a, c2619f.m11022b(m9855a));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f9361a);
        parcel.writeLong(this.f9362b);
    }
}
