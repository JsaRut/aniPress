package p139d.p225c.p226a.p227a.p250j.p255d.p256a;

import java.util.Collections;
import java.util.List;
import p139d.p225c.p226a.p227a.p231d.C2213m;

/* renamed from: d.c.a.a.j.d.a.e */
/* loaded from: classes.dex */
public final class C2466e extends AbstractC2467f {

    /* renamed from: d */
    public final int f9839d;

    /* renamed from: e */
    public final long f9840e;

    /* renamed from: f */
    public final long f9841f;

    /* renamed from: g */
    public final boolean f9842g;

    /* renamed from: h */
    public final int f9843h;

    /* renamed from: i */
    public final long f9844i;

    /* renamed from: j */
    public final int f9845j;

    /* renamed from: k */
    public final long f9846k;

    /* renamed from: l */
    public final boolean f9847l;

    /* renamed from: m */
    public final boolean f9848m;

    /* renamed from: n */
    public final C2213m f9849n;

    /* renamed from: o */
    public final List<a> f9850o;

    /* renamed from: p */
    public final long f9851p;

    /* renamed from: d.c.a.a.j.d.a.e$a */
    /* loaded from: classes.dex */
    public static final class a implements Comparable<Long> {

        /* renamed from: a */
        public final String f9852a;

        /* renamed from: b */
        public final a f9853b;

        /* renamed from: c */
        public final long f9854c;

        /* renamed from: d */
        public final String f9855d;

        /* renamed from: e */
        public final int f9856e;

        /* renamed from: f */
        public final long f9857f;

        /* renamed from: g */
        public final C2213m f9858g;

        /* renamed from: h */
        public final String f9859h;

        /* renamed from: i */
        public final String f9860i;

        /* renamed from: j */
        public final long f9861j;

        /* renamed from: k */
        public final long f9862k;

        /* renamed from: l */
        public final boolean f9863l;

        public a(String str, long j, long j2) {
            this(str, null, "", 0L, -1, -9223372036854775807L, null, null, null, j, j2, false);
        }

        public a(String str, a aVar, String str2, long j, int i, long j2, C2213m c2213m, String str3, String str4, long j3, long j4, boolean z) {
            this.f9852a = str;
            this.f9853b = aVar;
            this.f9855d = str2;
            this.f9854c = j;
            this.f9856e = i;
            this.f9857f = j2;
            this.f9858g = c2213m;
            this.f9859h = str3;
            this.f9860i = str4;
            this.f9861j = j3;
            this.f9862k = j4;
            this.f9863l = z;
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(Long l) {
            if (this.f9857f > l.longValue()) {
                return 1;
            }
            return this.f9857f < l.longValue() ? -1 : 0;
        }
    }

    public C2466e(int i, String str, List<String> list, long j, long j2, boolean z, int i2, long j3, int i3, long j4, boolean z2, boolean z3, boolean z4, C2213m c2213m, List<a> list2) {
        super(str, list, z2);
        this.f9839d = i;
        this.f9841f = j2;
        this.f9842g = z;
        this.f9843h = i2;
        this.f9844i = j3;
        this.f9845j = i3;
        this.f9846k = j4;
        this.f9847l = z3;
        this.f9848m = z4;
        this.f9849n = c2213m;
        this.f9850o = Collections.unmodifiableList(list2);
        if (list2.isEmpty()) {
            this.f9851p = 0L;
        } else {
            a aVar = list2.get(list2.size() - 1);
            this.f9851p = aVar.f9857f + aVar.f9854c;
        }
        this.f9840e = j == -9223372036854775807L ? -9223372036854775807L : j >= 0 ? j : this.f9851p + j;
    }

    /* renamed from: a */
    public C2466e m10274a() {
        return this.f9847l ? this : new C2466e(this.f9839d, this.f9864a, this.f9865b, this.f9840e, this.f9841f, this.f9842g, this.f9843h, this.f9844i, this.f9845j, this.f9846k, this.f9866c, true, this.f9848m, this.f9849n, this.f9850o);
    }

    /* renamed from: a */
    public C2466e m10275a(long j, int i) {
        return new C2466e(this.f9839d, this.f9864a, this.f9865b, this.f9840e, j, true, i, this.f9844i, this.f9845j, this.f9846k, this.f9866c, this.f9847l, this.f9848m, this.f9849n, this.f9850o);
    }

    /* renamed from: a */
    public boolean m10276a(C2466e c2466e) {
        if (c2466e == null) {
            return true;
        }
        long j = this.f9844i;
        long j2 = c2466e.f9844i;
        if (j > j2) {
            return true;
        }
        if (j < j2) {
            return false;
        }
        int size = this.f9850o.size();
        int size2 = c2466e.f9850o.size();
        if (size <= size2) {
            return size == size2 && this.f9847l && !c2466e.f9847l;
        }
        return true;
    }

    /* renamed from: b */
    public long m10277b() {
        return this.f9841f + this.f9851p;
    }
}
