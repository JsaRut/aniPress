package p139d.p225c.p226a.p227a.p234f;

/* renamed from: d.c.a.a.f.m */
/* loaded from: classes.dex */
public final class C2333m {

    /* renamed from: a */
    private static final String[] f9151a = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* renamed from: b */
    private static final int[] f9152b = {44100, 48000, 32000};

    /* renamed from: c */
    private static final int[] f9153c = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* renamed from: d */
    private static final int[] f9154d = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* renamed from: e */
    private static final int[] f9155e = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* renamed from: f */
    private static final int[] f9156f = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* renamed from: g */
    private static final int[] f9157g = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    /* renamed from: h */
    public int f9158h;

    /* renamed from: i */
    public String f9159i;

    /* renamed from: j */
    public int f9160j;

    /* renamed from: k */
    public int f9161k;

    /* renamed from: l */
    public int f9162l;

    /* renamed from: m */
    public int f9163m;

    /* renamed from: n */
    public int f9164n;

    /* renamed from: a */
    public static int m9692a(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        if ((i & (-2097152)) != -2097152 || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return -1;
        }
        int i6 = f9152b[i5];
        if (i2 == 2) {
            i6 /= 2;
        } else if (i2 == 0) {
            i6 /= 4;
        }
        int i7 = (i >>> 9) & 1;
        if (i3 == 3) {
            return ((((i2 == 3 ? f9153c[i4 - 1] : f9154d[i4 - 1]) * 12) / i6) + i7) * 4;
        }
        int i8 = i2 == 3 ? i3 == 2 ? f9155e[i4 - 1] : f9156f[i4 - 1] : f9157g[i4 - 1];
        if (i2 == 3) {
            return ((i8 * 144) / i6) + i7;
        }
        return (((i3 == 1 ? 72 : 144) * i8) / i6) + i7;
    }

    /* renamed from: a */
    private void m9693a(int i, String str, int i2, int i3, int i4, int i5, int i6) {
        this.f9158h = i;
        this.f9159i = str;
        this.f9160j = i2;
        this.f9161k = i3;
        this.f9162l = i4;
        this.f9163m = i5;
        this.f9164n = i6;
    }

    /* renamed from: a */
    public static boolean m9694a(int i, C2333m c2333m) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        if ((i & (-2097152)) != -2097152 || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return false;
        }
        int i8 = f9152b[i5];
        if (i2 == 2) {
            i8 /= 2;
        } else if (i2 == 0) {
            i8 /= 4;
        }
        int i9 = i8;
        int i10 = (i >>> 9) & 1;
        if (i3 == 3) {
            i6 = ((((i2 == 3 ? f9153c[i4 - 1] : f9154d[i4 - 1]) * 12) / i9) + i10) * 4;
            i7 = 384;
        } else {
            if (i2 == 3) {
                i6 = (((i3 == 2 ? f9155e[i4 - 1] : f9156f[i4 - 1]) * 144) / i9) + i10;
                i7 = 1152;
            } else {
                int i11 = f9157g[i4 - 1];
                int i12 = i3 == 1 ? 576 : 1152;
                i6 = (((i3 == 1 ? 72 : 144) * i11) / i9) + i10;
                i7 = i12;
            }
        }
        c2333m.m9693a(i2, f9151a[3 - i3], i6, i9, ((i >> 6) & 3) == 3 ? 1 : 2, ((i6 * 8) * i9) / i7, i7);
        return true;
    }
}
