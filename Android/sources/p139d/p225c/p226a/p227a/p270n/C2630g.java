package p139d.p225c.p226a.p227a.p270n;

import android.util.Pair;
import java.util.ArrayList;
import p000a.p005b.p022d.p023a.C0121j;
import p139d.p225c.p226a.p227a.C2683z;

/* renamed from: d.c.a.a.n.g */
/* loaded from: classes.dex */
public final class C2630g {

    /* renamed from: a */
    private static final byte[] f10944a = {0, 0, 0, 1};

    /* renamed from: b */
    private static final int[] f10945b = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* renamed from: c */
    private static final int[] f10946c = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* renamed from: a */
    private static int m11115a(C2643t c2643t) {
        int m11191a = c2643t.m11191a(5);
        return m11191a == 31 ? c2643t.m11191a(6) + 32 : m11191a;
    }

    /* renamed from: a */
    private static int m11116a(byte[] bArr, int i) {
        int length = bArr.length - f10944a.length;
        while (i <= length) {
            if (m11125b(bArr, i)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: a */
    public static Pair<Integer, Integer> m11117a(C2643t c2643t, boolean z) {
        int m11115a = m11115a(c2643t);
        int m11123b = m11123b(c2643t);
        int m11191a = c2643t.m11191a(4);
        if (m11115a == 5 || m11115a == 29) {
            m11123b = m11123b(c2643t);
            m11115a = m11115a(c2643t);
            if (m11115a == 22) {
                m11191a = c2643t.m11191a(4);
            }
        }
        if (z) {
            if (m11115a != 1 && m11115a != 2 && m11115a != 3 && m11115a != 4 && m11115a != 6 && m11115a != 7 && m11115a != 17) {
                switch (m11115a) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw new C2683z("Unsupported audio object type: " + m11115a);
                }
            }
            m11119a(c2643t, m11115a, m11191a);
            switch (m11115a) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int m11191a2 = c2643t.m11191a(2);
                    if (m11191a2 == 2 || m11191a2 == 3) {
                        throw new C2683z("Unsupported epConfig: " + m11191a2);
                    }
            }
        }
        int i = f10946c[m11191a];
        C2628e.m11111a(i != -1);
        return Pair.create(Integer.valueOf(m11123b), Integer.valueOf(i));
    }

    /* renamed from: a */
    public static Pair<Integer, Integer> m11118a(byte[] bArr) {
        return m11117a(new C2643t(bArr), false);
    }

    /* renamed from: a */
    private static void m11119a(C2643t c2643t, int i, int i2) {
        c2643t.m11201c(1);
        if (c2643t.m11204e()) {
            c2643t.m11201c(14);
        }
        boolean m11204e = c2643t.m11204e();
        if (i2 == 0) {
            throw new UnsupportedOperationException();
        }
        if (i == 6 || i == 20) {
            c2643t.m11201c(3);
        }
        if (m11204e) {
            if (i == 22) {
                c2643t.m11201c(16);
            }
            if (i == 17 || i == 19 || i == 20 || i == 23) {
                c2643t.m11201c(3);
            }
            c2643t.m11201c(1);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: a */
    public static byte[] m11120a(int i, int i2) {
        int i3 = 0;
        int i4 = 0;
        int i5 = -1;
        while (true) {
            int[] iArr = f10945b;
            if (i4 >= iArr.length) {
                break;
            }
            if (i == iArr[i4]) {
                i5 = i4;
            }
            i4++;
        }
        int i6 = -1;
        while (true) {
            int[] iArr2 = f10946c;
            if (i3 >= iArr2.length) {
                break;
            }
            if (i2 == iArr2[i3]) {
                i6 = i3;
            }
            i3++;
        }
        if (i != -1 && i6 != -1) {
            return m11121a(2, i5, i6);
        }
        throw new IllegalArgumentException("Invalid sample rate or number of channels: " + i + ", " + i2);
    }

    /* renamed from: a */
    public static byte[] m11121a(int i, int i2, int i3) {
        return new byte[]{(byte) (((i << 3) & 248) | ((i2 >> 1) & 7)), (byte) (((i2 << 7) & 128) | ((i3 << 3) & C0121j.AppCompatTheme_windowNoTitle))};
    }

    /* renamed from: a */
    public static byte[] m11122a(byte[] bArr, int i, int i2) {
        byte[] bArr2 = f10944a;
        byte[] bArr3 = new byte[bArr2.length + i2];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i, bArr3, f10944a.length, i2);
        return bArr3;
    }

    /* renamed from: b */
    private static int m11123b(C2643t c2643t) {
        int m11191a = c2643t.m11191a(4);
        if (m11191a == 15) {
            return c2643t.m11191a(24);
        }
        C2628e.m11111a(m11191a < 13);
        return f10945b[m11191a];
    }

    /* renamed from: b */
    public static String m11124b(int i, int i2, int i3) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
    }

    /* renamed from: b */
    private static boolean m11125b(byte[] bArr, int i) {
        if (bArr.length - i <= f10944a.length) {
            return false;
        }
        int i2 = 0;
        while (true) {
            byte[] bArr2 = f10944a;
            if (i2 >= bArr2.length) {
                return true;
            }
            if (bArr[i + i2] != bArr2[i2]) {
                return false;
            }
            i2++;
        }
    }

    /* renamed from: b */
    public static byte[][] m11126b(byte[] bArr) {
        if (!m11125b(bArr, 0)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        do {
            arrayList.add(Integer.valueOf(i));
            i = m11116a(bArr, i + f10944a.length);
        } while (i != -1);
        byte[][] bArr2 = new byte[arrayList.size()];
        int i2 = 0;
        while (i2 < arrayList.size()) {
            int intValue = ((Integer) arrayList.get(i2)).intValue();
            byte[] bArr3 = new byte[(i2 < arrayList.size() + (-1) ? ((Integer) arrayList.get(i2 + 1)).intValue() : bArr.length) - intValue];
            System.arraycopy(bArr, intValue, bArr3, 0, bArr3.length);
            bArr2[i2] = bArr3;
            i2++;
        }
        return bArr2;
    }
}
