package p031c.p032a.p069m;

import java.util.Arrays;

/* renamed from: c.a.m.b */
/* loaded from: classes.dex */
public final class C0685b {

    /* renamed from: a */
    private byte[] f3163a = {-42, -112, -23, -2, -52, -31, 61, -73, 22, -74, 20, -62, 40, -5, 44, 5, 43, 103, -102, 118, 42, -66, 4, -61, -86, 68, 19, 38, 73, -122, 6, -103, -100, 66, 80, -12, -111, -17, -104, 122, 51, 84, 11, 67, -19, -49, -84, 98, -28, -77, 28, -87, -55, 8, -24, -107, Byte.MIN_VALUE, -33, -108, -6, 117, -113, 63, -90, 71, 7, -89, -4, -13, 115, 23, -70, -125, 89, 60, 25, -26, -123, 79, -88, 104, 107, -127, -78, 113, 100, -38, -117, -8, -21, 15, 75, 112, 86, -99, 53, 30, 36, 14, 94, 99, 88, -47, -94, 37, 34, 124, 59, 1, 33, 120, -121, -44, 0, 70, 87, -97, -45, 39, 82, 76, 54, 2, -25, -96, -60, -56, -98, -22, -65, -118, -46, 64, -57, 56, -75, -93, -9, -14, -50, -7, 97, 21, -95, -32, -82, 93, -92, -101, 52, 26, 85, -83, -109, 50, 48, -11, -116, -79, -29, 29, -10, -30, 46, -126, 102, -54, 96, -64, 41, 35, -85, 13, 83, 78, 111, -43, -37, 55, 69, -34, -3, -114, 47, 3, -1, 106, 114, 109, 108, 91, 81, -115, 27, -81, -110, -69, -35, -68, Byte.MAX_VALUE, 17, -39, 92, 65, 31, 16, 90, -40, 10, -63, 49, -120, -91, -51, 123, -67, 45, 116, -48, 18, -72, -27, -76, -80, -119, 105, -105, 74, 12, -106, 119, 126, 101, -71, -15, 9, -59, 110, -58, -124, 24, -16, 125, -20, 58, -36, 77, 32, 121, -18, 95, 62, -41, -53, 57, 72};

    /* renamed from: b */
    private int[] f3164b = {462357, 472066609, 943670861, 1415275113, 1886879365, -1936483679, -1464879427, -993275175, -521670923, -66909679, 404694573, 876298825, 1347903077, 1819507329, -2003855715, -1532251463, -1060647211, -589042959, -117504499, 337322537, 808926789, 1280531041, 1752135293, -2071227751, -1599623499, -1128019247, -656414995, -184876535, 269950501, 741554753, 1213159005, 1684763257};

    /* renamed from: a */
    private static int m3509a(char c2) {
        return (byte) "0123456789abcdef".indexOf(c2);
    }

    /* renamed from: a */
    private int m3510a(int i) {
        byte[] bArr = this.f3163a;
        return (bArr[i & 255] & 255) | ((bArr[(i >>> 24) & 255] & 255) << 24) | ((bArr[(i >>> 16) & 255] & 255) << 16) | ((bArr[(i >>> 8) & 255] & 255) << 8);
    }

    /* renamed from: a */
    private static int m3511a(int i, int i2) {
        return (i >>> (32 - i2)) | (i << i2);
    }

    /* renamed from: a */
    private static void m3512a(byte[] bArr, byte[] bArr2) {
        for (int i = 0; i < 16; i++) {
            bArr[i] = (byte) (bArr[i] ^ bArr2[i]);
        }
    }

    /* renamed from: a */
    private void m3513a(byte[] bArr, byte[] bArr2, int[] iArr) {
        int[] m3515a = m3515a(bArr);
        for (int i = 0; i < 32; i += 4) {
            m3515a[0] = m3515a[0] ^ m3517b(m3510a(((m3515a[1] ^ m3515a[2]) ^ m3515a[3]) ^ iArr[i]));
            m3515a[1] = m3515a[1] ^ m3517b(m3510a(((m3515a[2] ^ m3515a[3]) ^ m3515a[0]) ^ iArr[i + 1]));
            m3515a[2] = m3515a[2] ^ m3517b(m3510a(((m3515a[3] ^ m3515a[0]) ^ m3515a[1]) ^ iArr[i + 2]));
            m3515a[3] = m3515a[3] ^ m3517b(m3510a(((m3515a[1] ^ m3515a[0]) ^ m3515a[2]) ^ iArr[i + 3]));
        }
        for (int i2 = 0; i2 < 16; i2 += 4) {
            int i3 = 3 - (i2 / 4);
            bArr2[i2] = (byte) ((m3515a[i3] >>> 24) & 255);
            bArr2[i2 + 1] = (byte) ((m3515a[i3] >>> 16) & 255);
            bArr2[i2 + 2] = (byte) ((m3515a[i3] >>> 8) & 255);
            bArr2[i2 + 3] = (byte) (m3515a[i3] & 255);
        }
    }

    /* renamed from: a */
    public static byte[] m3514a(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        char[] charArray = str.toLowerCase().toCharArray();
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) (m3509a(charArray[i2 + 1]) | (m3509a(charArray[i2]) << 4));
        }
        return bArr;
    }

    /* renamed from: a */
    private static int[] m3515a(byte[] bArr) {
        int[] iArr = new int[4];
        for (int i = 0; i < 4; i++) {
            int i2 = i * 4;
            iArr[i] = (bArr[i2 + 3] & 255) | ((bArr[i2] & 255) << 24) | ((bArr[i2 + 1] & 255) << 16) | ((bArr[i2 + 2] & 255) << 8);
        }
        return iArr;
    }

    /* renamed from: a */
    private int[] m3516a(byte[] bArr, boolean z) {
        int[] m3515a = m3515a(bArr);
        m3515a[0] = m3515a[0] ^ (-1548633402);
        m3515a[1] = m3515a[1] ^ 1453994832;
        m3515a[2] = m3515a[2] ^ 1736282519;
        m3515a[3] = m3515a[3] ^ (-1301273892);
        int[] iArr = new int[32];
        for (int i = 0; i < 32; i += 4) {
            int m3519c = m3515a[0] ^ m3519c(m3510a(((m3515a[1] ^ m3515a[2]) ^ m3515a[3]) ^ this.f3164b[i]));
            m3515a[0] = m3519c;
            iArr[i] = m3519c;
            int i2 = i + 1;
            int m3519c2 = m3515a[1] ^ m3519c(m3510a(((m3515a[2] ^ m3515a[3]) ^ m3515a[0]) ^ this.f3164b[i2]));
            m3515a[1] = m3519c2;
            iArr[i2] = m3519c2;
            int i3 = i + 2;
            int m3519c3 = m3515a[2] ^ m3519c(m3510a(((m3515a[3] ^ m3515a[0]) ^ m3515a[1]) ^ this.f3164b[i3]));
            m3515a[2] = m3519c3;
            iArr[i3] = m3519c3;
            int i4 = i + 3;
            int m3519c4 = m3515a[3] ^ m3519c(m3510a(((m3515a[0] ^ m3515a[1]) ^ m3515a[2]) ^ this.f3164b[i4]));
            m3515a[3] = m3519c4;
            iArr[i4] = m3519c4;
        }
        if (z) {
            for (int i5 = 0; i5 < 16; i5++) {
                int i6 = iArr[i5];
                int i7 = 31 - i5;
                iArr[i5] = iArr[i7];
                iArr[i7] = i6;
            }
        }
        return iArr;
    }

    /* renamed from: b */
    private int m3517b(int i) {
        return m3511a(i, 24) ^ (((m3511a(i, 2) ^ i) ^ m3511a(i, 10)) ^ m3511a(i, 18));
    }

    /* renamed from: b */
    private static byte[] m3518b(byte[] bArr) {
        int length = 16 - (bArr.length % 16);
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length + length);
        for (int i = 0; i < length; i++) {
            copyOf[bArr.length + i] = (byte) length;
        }
        return copyOf;
    }

    /* renamed from: c */
    private int m3519c(int i) {
        return m3511a(i, 23) ^ (m3511a(i, 13) ^ i);
    }

    /* renamed from: a */
    public final byte[] m3520a(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        if (bArr2 == null || bArr2.length != 16) {
            throw new IllegalArgumentException("key's length should be 16");
        }
        if (bArr3 != null && bArr3.length != 16) {
            bArr3 = null;
        }
        byte[] m3518b = m3518b(bArr);
        int[] m3516a = m3516a(bArr2, false);
        byte[] bArr4 = new byte[16];
        byte[] bArr5 = new byte[m3518b.length];
        byte[] bArr6 = bArr3;
        int i = 0;
        while (true) {
            int i2 = i + 16;
            if (i2 > m3518b.length) {
                return bArr5;
            }
            System.arraycopy(m3518b, i, bArr4, 0, 16);
            if (bArr6 != null) {
                m3512a(bArr4, bArr6);
            } else {
                bArr6 = new byte[16];
            }
            m3513a(bArr4, bArr6, m3516a);
            System.arraycopy(bArr6, 0, bArr5, i, bArr6.length);
            i = i2;
        }
    }

    /* renamed from: b */
    public final byte[] m3521b(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        if (bArr2 == null || bArr2.length != 16) {
            throw new IllegalArgumentException("key's length should be 16");
        }
        if (bArr3 != null && bArr3.length != 16) {
            bArr3 = null;
        }
        int[] m3516a = m3516a(bArr2, true);
        byte[] bArr4 = new byte[16];
        byte[] bArr5 = new byte[16];
        byte[] bArr6 = new byte[bArr.length];
        byte[] bArr7 = bArr3;
        int i = 0;
        while (true) {
            int i2 = i + 16;
            if (i2 > bArr.length) {
                byte[] bArr8 = new byte[bArr6.length - bArr6[bArr6.length - 1]];
                System.arraycopy(bArr6, 0, bArr8, 0, bArr8.length);
                return bArr8;
            }
            System.arraycopy(bArr, i, bArr4, 0, 16);
            m3513a(bArr4, bArr5, m3516a);
            if (bArr7 != null) {
                m3512a(bArr5, bArr7);
            } else {
                bArr7 = new byte[16];
            }
            System.arraycopy(bArr, i, bArr7, 0, 16);
            System.arraycopy(bArr5, 0, bArr6, i, 16);
            i = i2;
        }
    }
}
