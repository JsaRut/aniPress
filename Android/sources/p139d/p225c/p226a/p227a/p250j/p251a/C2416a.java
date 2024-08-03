package p139d.p225c.p226a.p227a.p250j.p251a;

import android.net.Uri;
import java.util.Arrays;
import p139d.p225c.p226a.p227a.p270n.C2628e;

/* renamed from: d.c.a.a.j.a.a */
/* loaded from: classes.dex */
public final class C2416a {

    /* renamed from: a */
    public static final C2416a f9491a = new C2416a(new long[0]);

    /* renamed from: b */
    public final int f9492b;

    /* renamed from: c */
    public final long[] f9493c;

    /* renamed from: d */
    public final a[] f9494d;

    /* renamed from: e */
    public final long f9495e;

    /* renamed from: f */
    public final long f9496f;

    /* renamed from: d.c.a.a.j.a.a$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final int f9497a;

        /* renamed from: b */
        public final Uri[] f9498b;

        /* renamed from: c */
        public final int[] f9499c;

        /* renamed from: d */
        public final long[] f9500d;

        public a() {
            this(-1, new int[0], new Uri[0], new long[0]);
        }

        private a(int i, int[] iArr, Uri[] uriArr, long[] jArr) {
            C2628e.m11111a(iArr.length == uriArr.length);
            this.f9497a = i;
            this.f9499c = iArr;
            this.f9498b = uriArr;
            this.f9500d = jArr;
        }

        /* renamed from: a */
        public int m9983a() {
            return m9984a(-1);
        }

        /* renamed from: a */
        public int m9984a(int i) {
            int i2 = i + 1;
            while (true) {
                int[] iArr = this.f9499c;
                if (i2 >= iArr.length || iArr[i2] == 0 || iArr[i2] == 1) {
                    break;
                }
                i2++;
            }
            return i2;
        }

        /* renamed from: b */
        public boolean m9985b() {
            return this.f9497a == -1 || m9983a() < this.f9497a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f9497a == aVar.f9497a && Arrays.equals(this.f9498b, aVar.f9498b) && Arrays.equals(this.f9499c, aVar.f9499c) && Arrays.equals(this.f9500d, aVar.f9500d);
        }

        public int hashCode() {
            return (((((this.f9497a * 31) + Arrays.hashCode(this.f9498b)) * 31) + Arrays.hashCode(this.f9499c)) * 31) + Arrays.hashCode(this.f9500d);
        }
    }

    public C2416a(long... jArr) {
        int length = jArr.length;
        this.f9492b = length;
        this.f9493c = Arrays.copyOf(jArr, length);
        this.f9494d = new a[length];
        for (int i = 0; i < length; i++) {
            this.f9494d[i] = new a();
        }
        this.f9495e = 0L;
        this.f9496f = -9223372036854775807L;
    }

    /* renamed from: a */
    private boolean m9980a(long j, int i) {
        long j2 = this.f9493c[i];
        if (j2 != Long.MIN_VALUE) {
            return j < j2;
        }
        long j3 = this.f9496f;
        return j3 == -9223372036854775807L || j < j3;
    }

    /* renamed from: a */
    public int m9981a(long j) {
        int i = 0;
        while (true) {
            long[] jArr = this.f9493c;
            if (i >= jArr.length || jArr[i] == Long.MIN_VALUE || (j < jArr[i] && this.f9494d[i].m9985b())) {
                break;
            }
            i++;
        }
        if (i < this.f9493c.length) {
            return i;
        }
        return -1;
    }

    /* renamed from: b */
    public int m9982b(long j) {
        int length = this.f9493c.length - 1;
        while (length >= 0 && m9980a(j, length)) {
            length--;
        }
        if (length < 0 || !this.f9494d[length].m9985b()) {
            return -1;
        }
        return length;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2416a.class != obj.getClass()) {
            return false;
        }
        C2416a c2416a = (C2416a) obj;
        return this.f9492b == c2416a.f9492b && this.f9495e == c2416a.f9495e && this.f9496f == c2416a.f9496f && Arrays.equals(this.f9493c, c2416a.f9493c) && Arrays.equals(this.f9494d, c2416a.f9494d);
    }

    public int hashCode() {
        return (((((((this.f9492b * 31) + ((int) this.f9495e)) * 31) + ((int) this.f9496f)) * 31) + Arrays.hashCode(this.f9493c)) * 31) + Arrays.hashCode(this.f9494d);
    }
}
