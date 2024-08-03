package p139d.p225c.p226a.p227a.p234f.p239e;

import p139d.p225c.p226a.p227a.p270n.C2622I;

/* renamed from: d.c.a.a.f.e.g */
/* loaded from: classes.dex */
final class C2262g {

    /* renamed from: d.c.a.a.f.e.g$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final long[] f8542a;

        /* renamed from: b */
        public final int[] f8543b;

        /* renamed from: c */
        public final int f8544c;

        /* renamed from: d */
        public final long[] f8545d;

        /* renamed from: e */
        public final int[] f8546e;

        /* renamed from: f */
        public final long f8547f;

        private a(long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
            this.f8542a = jArr;
            this.f8543b = iArr;
            this.f8544c = i;
            this.f8545d = jArr2;
            this.f8546e = iArr2;
            this.f8547f = j;
        }
    }

    /* renamed from: a */
    public static a m9339a(int i, long[] jArr, int[] iArr, long j) {
        int i2 = 8192 / i;
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += C2622I.m11037a(i4, i2);
        }
        long[] jArr2 = new long[i3];
        int[] iArr2 = new int[i3];
        long[] jArr3 = new long[i3];
        int[] iArr3 = new int[i3];
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < iArr.length; i8++) {
            int i9 = iArr[i8];
            long j2 = jArr[i8];
            while (i9 > 0) {
                int min = Math.min(i2, i9);
                jArr2[i6] = j2;
                iArr2[i6] = i * min;
                i7 = Math.max(i7, iArr2[i6]);
                jArr3[i6] = i5 * j;
                iArr3[i6] = 1;
                j2 += iArr2[i6];
                i5 += min;
                i9 -= min;
                i6++;
            }
        }
        return new a(jArr2, iArr2, i7, jArr3, iArr3, j * i5);
    }
}
