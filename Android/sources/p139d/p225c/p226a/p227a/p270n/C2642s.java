package p139d.p225c.p226a.p227a.p270n;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: d.c.a.a.n.s */
/* loaded from: classes.dex */
public final class C2642s {

    /* renamed from: a */
    public static final byte[] f10980a = {0, 0, 0, 1};

    /* renamed from: b */
    public static final float[] f10981b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* renamed from: c */
    private static final Object f10982c = new Object();

    /* renamed from: d */
    private static int[] f10983d = new int[10];

    /* renamed from: d.c.a.a.n.s$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final int f10984a;

        /* renamed from: b */
        public final int f10985b;

        /* renamed from: c */
        public final boolean f10986c;

        public a(int i, int i2, boolean z) {
            this.f10984a = i;
            this.f10985b = i2;
            this.f10986c = z;
        }
    }

    /* renamed from: d.c.a.a.n.s$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        public final int f10987a;

        /* renamed from: b */
        public final int f10988b;

        /* renamed from: c */
        public final int f10989c;

        /* renamed from: d */
        public final int f10990d;

        /* renamed from: e */
        public final int f10991e;

        /* renamed from: f */
        public final int f10992f;

        /* renamed from: g */
        public final float f10993g;

        /* renamed from: h */
        public final boolean f10994h;

        /* renamed from: i */
        public final boolean f10995i;

        /* renamed from: j */
        public final int f10996j;

        /* renamed from: k */
        public final int f10997k;

        /* renamed from: l */
        public final int f10998l;

        /* renamed from: m */
        public final boolean f10999m;

        public b(int i, int i2, int i3, int i4, int i5, int i6, float f, boolean z, boolean z2, int i7, int i8, int i9, boolean z3) {
            this.f10987a = i;
            this.f10988b = i2;
            this.f10989c = i3;
            this.f10990d = i4;
            this.f10991e = i5;
            this.f10992f = i6;
            this.f10993g = f;
            this.f10994h = z;
            this.f10995i = z2;
            this.f10996j = i7;
            this.f10997k = i8;
            this.f10998l = i9;
            this.f10999m = z3;
        }
    }

    /* renamed from: a */
    public static int m11178a(byte[] bArr, int i) {
        return (bArr[i + 3] & 126) >> 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0097, code lost:            r8 = true;     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int m11179a(byte[] r7, int r8, int r9, boolean[] r10) {
        /*
            Method dump skipped, instructions count: 188
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p139d.p225c.p226a.p227a.p270n.C2642s.m11179a(byte[], int, int, boolean[]):int");
    }

    /* renamed from: a */
    public static a m11180a(byte[] bArr, int i, int i2) {
        C2645v c2645v = new C2645v(bArr, i, i2);
        c2645v.m11254c(8);
        int m11255d = c2645v.m11255d();
        int m11255d2 = c2645v.m11255d();
        c2645v.m11256e();
        return new a(m11255d, m11255d2, c2645v.m11252b());
    }

    /* renamed from: a */
    private static void m11181a(C2645v c2645v, int i) {
        int i2 = 8;
        int i3 = 8;
        for (int i4 = 0; i4 < i; i4++) {
            if (i2 != 0) {
                i2 = ((c2645v.m11253c() + i3) + 256) % 256;
            }
            if (i2 != 0) {
                i3 = i2;
            }
        }
    }

    /* renamed from: a */
    public static void m11182a(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = i + 1;
            if (i3 >= position) {
                byteBuffer.clear();
                return;
            }
            int i4 = byteBuffer.get(i) & 255;
            if (i2 == 3) {
                if (i4 == 1 && (byteBuffer.get(i3) & 31) == 7) {
                    ByteBuffer duplicate = byteBuffer.duplicate();
                    duplicate.position(i - 3);
                    duplicate.limit(position);
                    byteBuffer.position(0);
                    byteBuffer.put(duplicate);
                    return;
                }
            } else if (i4 == 0) {
                i2++;
            }
            if (i4 != 0) {
                i2 = 0;
            }
            i = i3;
        }
    }

    /* renamed from: a */
    public static void m11183a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    /* renamed from: a */
    public static boolean m11184a(String str, byte b2) {
        if ("video/avc".equals(str) && (b2 & 31) == 6) {
            return true;
        }
        return "video/hevc".equals(str) && ((b2 & 126) >> 1) == 39;
    }

    /* renamed from: b */
    public static int m11185b(byte[] bArr, int i) {
        return bArr[i + 3] & 31;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0145  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p139d.p225c.p226a.p227a.p270n.C2642s.b m11186b(byte[] r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p139d.p225c.p226a.p227a.p270n.C2642s.m11186b(byte[], int, int):d.c.a.a.n.s$b");
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: c */
    public static int m11187c(byte[] bArr, int i) {
        int i2;
        synchronized (f10982c) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < i) {
                try {
                    i3 = m11188c(bArr, i3, i);
                    if (i3 < i) {
                        if (f10983d.length <= i4) {
                            f10983d = Arrays.copyOf(f10983d, f10983d.length * 2);
                        }
                        f10983d[i4] = i3;
                        i3 += 3;
                        i4++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            i2 = i - i4;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < i4; i7++) {
                int i8 = f10983d[i7] - i6;
                System.arraycopy(bArr, i6, bArr, i5, i8);
                int i9 = i5 + i8;
                int i10 = i9 + 1;
                bArr[i9] = 0;
                i5 = i10 + 1;
                bArr[i10] = 0;
                i6 += i8 + 3;
            }
            System.arraycopy(bArr, i6, bArr, i5, i2 - i5);
        }
        return i2;
    }

    /* renamed from: c */
    private static int m11188c(byte[] bArr, int i, int i2) {
        while (i < i2 - 2) {
            if (bArr[i] == 0 && bArr[i + 1] == 0 && bArr[i + 2] == 3) {
                return i;
            }
            i++;
        }
        return i2;
    }
}
