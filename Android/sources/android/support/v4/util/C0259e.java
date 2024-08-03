package android.support.v4.util;

/* renamed from: android.support.v4.util.e */
/* loaded from: classes.dex */
class C0259e {

    /* renamed from: a */
    static final int[] f1074a = new int[0];

    /* renamed from: b */
    static final long[] f1075b = new long[0];

    /* renamed from: c */
    static final Object[] f1076c = new Object[0];

    /* renamed from: a */
    public static int m1347a(int i) {
        for (int i2 = 4; i2 < 32; i2++) {
            int i3 = (1 << i2) - 12;
            if (i <= i3) {
                return i3;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m1348a(int[] iArr, int i, int i2) {
        int i3 = i - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i2) {
                i4 = i5 + 1;
            } else {
                if (i6 <= i2) {
                    return i5;
                }
                i3 = i5 - 1;
            }
        }
        return i4 ^ (-1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m1349a(long[] jArr, int i, long j) {
        int i2 = i - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            long j2 = jArr[i4];
            if (j2 < j) {
                i3 = i4 + 1;
            } else {
                if (j2 <= j) {
                    return i4;
                }
                i2 = i4 - 1;
            }
        }
        return i3 ^ (-1);
    }

    /* renamed from: a */
    public static boolean m1350a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: b */
    public static int m1351b(int i) {
        return m1347a(i * 4) / 4;
    }

    /* renamed from: c */
    public static int m1352c(int i) {
        return m1347a(i * 8) / 8;
    }
}
