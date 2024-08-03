package p139d.p225c.p226a.p227a.p229b;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.List;
import p000a.p005b.p022d.p023a.C0121j;
import p139d.p225c.p226a.p227a.C2676s;
import p139d.p225c.p226a.p227a.p231d.C2213m;
import p139d.p225c.p226a.p227a.p270n.C2643t;

/* renamed from: d.c.a.a.b.y */
/* loaded from: classes.dex */
public final class C2188y {

    /* renamed from: a */
    private static final int[] f7998a = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* renamed from: b */
    private static final int[] f7999b = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* renamed from: c */
    private static final int[] f8000c = {64, C0121j.AppCompatTheme_windowActionBarOverlay, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    /* renamed from: a */
    public static int m8991a(ByteBuffer byteBuffer) {
        int i;
        int i2;
        int i3;
        int i4;
        int position = byteBuffer.position();
        byte b2 = byteBuffer.get(position);
        if (b2 != -2) {
            if (b2 == -1) {
                i = (byteBuffer.get(position + 4) & 7) << 4;
                i4 = position + 7;
            } else if (b2 != 31) {
                i = (byteBuffer.get(position + 4) & 1) << 6;
                i2 = position + 5;
            } else {
                i = (byteBuffer.get(position + 5) & 7) << 4;
                i4 = position + 6;
            }
            i3 = byteBuffer.get(i4) & 60;
            return (((i3 >> 2) | i) + 1) * 32;
        }
        i = (byteBuffer.get(position + 5) & 1) << 6;
        i2 = position + 4;
        i3 = byteBuffer.get(i2) & 252;
        return (((i3 >> 2) | i) + 1) * 32;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int m8992a(byte[] r7) {
        /*
            r0 = 0
            r1 = r7[r0]
            r2 = -2
            r3 = 7
            r4 = 6
            r5 = 1
            r6 = 4
            if (r1 == r2) goto L4f
            r2 = -1
            if (r1 == r2) goto L37
            r2 = 31
            if (r1 == r2) goto L26
            r1 = 5
            r1 = r7[r1]
            r1 = r1 & 3
            int r1 = r1 << 12
            r2 = r7[r4]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r6
            r1 = r1 | r2
            r7 = r7[r3]
        L20:
            r7 = r7 & 240(0xf0, float:3.36E-43)
            int r7 = r7 >> r6
            r7 = r7 | r1
            int r7 = r7 + r5
            goto L5e
        L26:
            r0 = r7[r4]
            r0 = r0 & 3
            int r0 = r0 << 12
            r1 = r7[r3]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r6
            r0 = r0 | r1
            r1 = 8
            r7 = r7[r1]
            goto L47
        L37:
            r0 = r7[r3]
            r0 = r0 & 3
            int r0 = r0 << 12
            r1 = r7[r4]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r6
            r0 = r0 | r1
            r1 = 9
            r7 = r7[r1]
        L47:
            r7 = r7 & 60
            int r7 = r7 >> 2
            r7 = r7 | r0
            int r7 = r7 + r5
            r0 = 1
            goto L5e
        L4f:
            r1 = r7[r6]
            r1 = r1 & 3
            int r1 = r1 << 12
            r2 = r7[r3]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r6
            r1 = r1 | r2
            r7 = r7[r4]
            goto L20
        L5e:
            if (r0 == 0) goto L64
            int r7 = r7 * 16
            int r7 = r7 / 14
        L64:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p139d.p225c.p226a.p227a.p229b.C2188y.m8992a(byte[]):int");
    }

    /* renamed from: a */
    public static C2676s m8993a(byte[] bArr, String str, String str2, C2213m c2213m) {
        C2643t m8996c = m8996c(bArr);
        m8996c.m11201c(60);
        int i = f7998a[m8996c.m11191a(6)];
        int i2 = f7999b[m8996c.m11191a(4)];
        int m11191a = m8996c.m11191a(5);
        int[] iArr = f8000c;
        int i3 = m11191a >= iArr.length ? -1 : (iArr[m11191a] * 1000) / 2;
        m8996c.m11201c(10);
        return C2676s.m11426a(str, "audio/vnd.dts", (String) null, i3, -1, i + (m8996c.m11191a(2) > 0 ? 1 : 0), i2, (List<byte[]>) null, c2213m, 0, str2);
    }

    /* renamed from: a */
    public static boolean m8994a(int i) {
        return i == 2147385345 || i == -25230976 || i == 536864768 || i == -14745368;
    }

    /* renamed from: b */
    public static int m8995b(byte[] bArr) {
        int i;
        byte b2;
        int i2;
        byte b3;
        byte b4 = bArr[0];
        if (b4 != -2) {
            if (b4 == -1) {
                i = (bArr[4] & 7) << 4;
                b3 = bArr[7];
            } else if (b4 != 31) {
                i = (bArr[4] & 1) << 6;
                b2 = bArr[5];
            } else {
                i = (bArr[5] & 7) << 4;
                b3 = bArr[6];
            }
            i2 = b3 & 60;
            return (((i2 >> 2) | i) + 1) * 32;
        }
        i = (bArr[5] & 1) << 6;
        b2 = bArr[4];
        i2 = b2 & 252;
        return (((i2 >> 2) | i) + 1) * 32;
    }

    /* renamed from: c */
    private static C2643t m8996c(byte[] bArr) {
        if (bArr[0] == Byte.MAX_VALUE) {
            return new C2643t(bArr);
        }
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        if (m8997d(copyOf)) {
            for (int i = 0; i < copyOf.length - 1; i += 2) {
                byte b2 = copyOf[i];
                int i2 = i + 1;
                copyOf[i] = copyOf[i2];
                copyOf[i2] = b2;
            }
        }
        C2643t c2643t = new C2643t(copyOf);
        if (copyOf[0] == 31) {
            C2643t c2643t2 = new C2643t(copyOf);
            while (c2643t2.m11190a() >= 16) {
                c2643t2.m11201c(2);
                c2643t.m11192a(c2643t2.m11191a(14), 14);
            }
        }
        c2643t.m11194a(copyOf);
        return c2643t;
    }

    /* renamed from: d */
    private static boolean m8997d(byte[] bArr) {
        return bArr[0] == -2 || bArr[0] == -1;
    }
}
