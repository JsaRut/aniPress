package p000a.p005b.p009c.p010a.p011a;

import java.lang.reflect.Array;

/* renamed from: a.b.c.a.a.e */
/* loaded from: classes.dex */
final class C0027e {
    /* renamed from: a */
    public static int m132a(int i) {
        if (i <= 4) {
            return 8;
        }
        return i * 2;
    }

    /* renamed from: a */
    public static int[] m133a(int[] iArr, int i, int i2) {
        if (i + 1 > iArr.length) {
            int[] iArr2 = new int[m132a(i)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            iArr = iArr2;
        }
        iArr[i] = i2;
        return iArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object[], java.lang.Object] */
    /* renamed from: a */
    public static <T> T[] m134a(T[] tArr, int i, T t) {
        if (i + 1 > tArr.length) {
            ?? r0 = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), m132a(i));
            System.arraycopy(tArr, 0, r0, 0, i);
            tArr = r0;
        }
        tArr[i] = t;
        return tArr;
    }
}
