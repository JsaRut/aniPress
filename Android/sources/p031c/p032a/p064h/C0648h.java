package p031c.p032a.p064h;

import java.io.IOException;
import java.io.Serializable;
import java.text.DecimalFormat;

/* renamed from: c.a.h.h */
/* loaded from: classes.dex */
public final class C0648h implements Serializable, Comparable {

    /* renamed from: c */
    public static final C0648h f3020c;

    /* renamed from: d */
    public static final C0648h f3021d;

    /* renamed from: g */
    private static final C0648h f3024g;

    /* renamed from: h */
    private byte[] f3025h;

    /* renamed from: i */
    private long f3026i;

    /* renamed from: j */
    private int f3027j;

    /* renamed from: a */
    private static final byte[] f3018a = {0};

    /* renamed from: b */
    private static final byte[] f3019b = {1, 42};

    /* renamed from: e */
    private static final DecimalFormat f3022e = new DecimalFormat();

    /* renamed from: f */
    private static final byte[] f3023f = new byte[256];

    static {
        f3022e.setMinimumIntegerDigits(3);
        int i = 0;
        while (true) {
            byte[] bArr = f3023f;
            if (i >= bArr.length) {
                C0648h c0648h = new C0648h();
                f3020c = c0648h;
                c0648h.m3320b(f3018a, 0, 1);
                C0648h c0648h2 = new C0648h();
                f3021d = c0648h2;
                c0648h2.f3025h = new byte[0];
                C0648h c0648h3 = new C0648h();
                f3024g = c0648h3;
                c0648h3.m3320b(f3019b, 0, 1);
                return;
            }
            if (i < 65 || i > 90) {
                f3023f[i] = (byte) i;
            } else {
                bArr[i] = (byte) ((i - 65) + 97);
            }
            i++;
        }
    }

    private C0648h() {
    }

    public C0648h(C0643c c0643c) {
        byte[] bArr = new byte[64];
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            int m3278f = c0643c.m3278f();
            int i = m3278f & 192;
            if (i != 0) {
                if (i != 192) {
                    throw new IOException("bad label type");
                }
                int m3278f2 = c0643c.m3278f() + ((m3278f & (-193)) << 8);
                if (m3278f2 >= c0643c.m3270a() - 2) {
                    throw new IOException("bad compression");
                }
                if (!z2) {
                    c0643c.m3276d();
                    z2 = true;
                }
                c0643c.m3274b(m3278f2);
            } else {
                if (m3317b() >= 128) {
                    throw new IOException("too many labels");
                }
                if (m3278f == 0) {
                    m3316a(f3018a, 0, 1);
                    z = true;
                } else {
                    bArr[0] = (byte) m3278f;
                    c0643c.m3272a(bArr, 1, m3278f);
                    m3316a(bArr, 0, 1);
                }
            }
        }
        if (z2) {
            c0643c.m3277e();
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    private C0648h(C0648h c0648h, int i) {
        int m3317b = c0648h.m3317b();
        if (i > m3317b) {
            throw new IllegalArgumentException("attempted to remove too many labels");
        }
        this.f3025h = c0648h.f3025h;
        int i2 = m3317b - i;
        m3318b(i2);
        for (int i3 = 0; i3 < 7 && i3 < i2; i3++) {
            m3314a(i3, c0648h.m3308a(i3 + i));
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    private C0648h(String str, C0648h c0648h) {
        int i;
        boolean z;
        int i2;
        C0648h c0648h2;
        if (str.equals("")) {
            throw m3312a(str, "empty name");
        }
        if (str.equals("@")) {
            if (c0648h != null) {
                m3319b(c0648h, this);
                return;
            }
            c0648h2 = f3021d;
        } else {
            if (!str.equals(".")) {
                byte[] bArr = new byte[64];
                int i3 = 0;
                boolean z2 = false;
                int i4 = -1;
                int i5 = 1;
                int i6 = 0;
                for (int i7 = 0; i7 < str.length(); i7++) {
                    byte charAt = (byte) str.charAt(i7);
                    if (z2) {
                        if (charAt >= 48 && charAt <= 57 && i3 < 3) {
                            i3++;
                            i6 = (i6 * 10) + (charAt - 48);
                            if (i6 > 255) {
                                throw m3312a(str, "bad escape");
                            }
                            if (i3 >= 3) {
                                charAt = (byte) i6;
                            } else {
                                continue;
                            }
                        } else if (i3 > 0 && i3 < 3) {
                            throw m3312a(str, "bad escape");
                        }
                        if (i5 > 63) {
                            throw m3312a(str, "label too long");
                        }
                        i2 = i5 + 1;
                        bArr[i5] = charAt;
                        i4 = i5;
                        z2 = false;
                        i5 = i2;
                    } else {
                        if (charAt == 92) {
                            i3 = 0;
                            z2 = true;
                            i6 = 0;
                        } else if (charAt != 46) {
                            i4 = i4 == -1 ? i7 : i4;
                            if (i5 > 63) {
                                throw m3312a(str, "label too long");
                            }
                            i2 = i5 + 1;
                            bArr[i5] = charAt;
                            i5 = i2;
                        } else {
                            if (i4 == -1) {
                                throw m3312a(str, "invalid empty label");
                            }
                            bArr[0] = (byte) (i5 - 1);
                            m3315a(str, bArr, 0, 1);
                            i4 = -1;
                            i5 = 1;
                        }
                    }
                }
                if (i3 > 0 && i3 < 3) {
                    throw m3312a(str, "bad escape");
                }
                if (z2) {
                    throw m3312a(str, "bad escape");
                }
                if (i4 == -1) {
                    z = true;
                    i = 0;
                    m3315a(str, f3018a, 0, 1);
                } else {
                    i = 0;
                    bArr[0] = (byte) (i5 - 1);
                    m3315a(str, bArr, 0, 1);
                    z = false;
                }
                if (c0648h == null || z) {
                    return;
                }
                m3315a(str, c0648h.f3025h, c0648h.m3308a(i), c0648h.m3317b());
                return;
            }
            c0648h2 = f3020c;
        }
        m3319b(c0648h2, this);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: a */
    private final int m3308a(int i) {
        if (i == 0 && m3317b() == 0) {
            return 0;
        }
        if (i < 0 || i >= m3317b()) {
            throw new IllegalArgumentException("label out of range");
        }
        if (i < 7) {
            return ((int) (this.f3026i >>> ((7 - i) * 8))) & 255;
        }
        int m3308a = m3308a(6);
        for (int i2 = 6; i2 < i; i2++) {
            m3308a += this.f3025h[m3308a] + 1;
        }
        return m3308a;
    }

    /* renamed from: a */
    public static C0648h m3309a(C0648h c0648h, C0648h c0648h2) {
        if (c0648h.m3324a()) {
            return c0648h;
        }
        C0648h c0648h3 = new C0648h();
        m3319b(c0648h, c0648h3);
        c0648h3.m3316a(c0648h2.f3025h, c0648h2.m3308a(0), c0648h2.m3317b());
        return c0648h3;
    }

    /* renamed from: a */
    public static C0648h m3310a(String str) {
        return m3311a(str, (C0648h) null);
    }

    /* renamed from: a */
    public static C0648h m3311a(String str, C0648h c0648h) {
        return (!str.equals("@") || c0648h == null) ? str.equals(".") ? f3020c : new C0648h(str, c0648h) : c0648h;
    }

    /* renamed from: a */
    private static IOException m3312a(String str, String str2) {
        return new IOException("'" + str + "': " + str2);
    }

    /* renamed from: a */
    private static String m3313a(byte[] bArr, int i) {
        StringBuffer stringBuffer = new StringBuffer();
        int i2 = i + 1;
        int i3 = bArr[i];
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            int i5 = bArr[i4] & 255;
            if (i5 <= 32 || i5 >= 127) {
                stringBuffer.append('\\');
                stringBuffer.append(f3022e.format(i5));
            } else {
                if (i5 == 34 || i5 == 40 || i5 == 41 || i5 == 46 || i5 == 59 || i5 == 92 || i5 == 64 || i5 == 36) {
                    stringBuffer.append('\\');
                }
                stringBuffer.append((char) i5);
            }
        }
        return stringBuffer.toString();
    }

    /* renamed from: a */
    private final void m3314a(int i, int i2) {
        if (i >= 7) {
            return;
        }
        int i3 = (7 - i) * 8;
        this.f3026i &= (255 << i3) ^ (-1);
        this.f3026i = (i2 << i3) | this.f3026i;
    }

    /* renamed from: a */
    private final void m3315a(String str, byte[] bArr, int i, int i2) {
        try {
            m3316a(bArr, i, i2);
        } catch (Exception unused) {
            throw m3312a(str, "Name too long");
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: a */
    private final void m3316a(byte[] bArr, int i, int i2) {
        byte[] bArr2 = this.f3025h;
        int length = bArr2 == null ? 0 : bArr2.length - m3308a(0);
        int i3 = i;
        int i4 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            int i6 = bArr[i3];
            if (i6 > 63) {
                throw new IllegalStateException("invalid label");
            }
            int i7 = i6 + 1;
            i3 += i7;
            i4 += i7;
        }
        int i8 = length + i4;
        if (i8 > 255) {
            throw new IOException();
        }
        int m3317b = m3317b();
        int i9 = m3317b + i2;
        if (i9 > 128) {
            throw new IllegalStateException("too many labels");
        }
        byte[] bArr3 = new byte[i8];
        if (length != 0) {
            System.arraycopy(this.f3025h, m3308a(0), bArr3, 0, length);
        }
        System.arraycopy(bArr, i, bArr3, length, i4);
        this.f3025h = bArr3;
        for (int i10 = 0; i10 < i2; i10++) {
            m3314a(m3317b + i10, length);
            length += bArr3[length] + 1;
        }
        m3318b(i9);
    }

    /* renamed from: b */
    private final int m3317b() {
        return (int) (this.f3026i & 255);
    }

    /* renamed from: b */
    private final void m3318b(int i) {
        this.f3026i &= -256;
        this.f3026i |= i;
    }

    /* renamed from: b */
    private static final void m3319b(C0648h c0648h, C0648h c0648h2) {
        if (c0648h.m3308a(0) == 0) {
            c0648h2.f3025h = c0648h.f3025h;
            c0648h2.f3026i = c0648h.f3026i;
            return;
        }
        int m3308a = c0648h.m3308a(0);
        int length = c0648h.f3025h.length - m3308a;
        int m3317b = c0648h.m3317b();
        c0648h2.f3025h = new byte[length];
        System.arraycopy(c0648h.f3025h, m3308a, c0648h2.f3025h, 0, length);
        for (int i = 0; i < m3317b && i < 7; i++) {
            c0648h2.m3314a(i, c0648h.m3308a(i) - m3308a);
        }
        c0648h2.m3318b(m3317b);
    }

    /* renamed from: b */
    private final void m3320b(byte[] bArr, int i, int i2) {
        try {
            m3316a(bArr, 0, 1);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final void m3321a(C0644d c0644d) {
        byte[] bArr;
        int m3317b = m3317b();
        if (m3317b == 0) {
            bArr = new byte[0];
        } else {
            byte[] bArr2 = new byte[this.f3025h.length - m3308a(0)];
            int m3308a = m3308a(0);
            int i = 0;
            int i2 = 0;
            while (i < m3317b) {
                byte[] bArr3 = this.f3025h;
                byte b2 = bArr3[m3308a];
                if (b2 > 63) {
                    throw new IllegalStateException("invalid label");
                }
                int i3 = m3308a + 1;
                bArr2[i2] = bArr3[m3308a];
                i2++;
                int i4 = 0;
                while (i4 < b2) {
                    bArr2[i2] = f3023f[this.f3025h[i3] & 255];
                    i4++;
                    i2++;
                    i3++;
                }
                i++;
                m3308a = i3;
            }
            bArr = bArr2;
        }
        c0644d.m3287a(bArr);
    }

    /* renamed from: a */
    public final void m3322a(C0644d c0644d, C0641a c0641a) {
        int m3317b = m3317b();
        int i = 0;
        while (i < m3317b - 1) {
            C0648h c0648h = i == 0 ? this : new C0648h(this, i);
            int m3267a = c0641a != null ? c0641a.m3267a(c0648h) : -1;
            if (m3267a >= 0) {
                c0644d.m3291c(49152 | m3267a);
                return;
            }
            if (c0641a != null) {
                c0641a.m3268a(c0644d.m3283a(), c0648h);
            }
            int m3308a = m3308a(i);
            byte[] bArr = this.f3025h;
            c0644d.m3288a(bArr, m3308a, bArr[m3308a] + 1);
            i++;
        }
        c0644d.m3289b(0);
    }

    /* renamed from: a */
    public final void m3323a(C0644d c0644d, C0641a c0641a, boolean z) {
        if (z) {
            m3321a(c0644d);
        } else {
            m3322a(c0644d, (C0641a) null);
        }
    }

    /* renamed from: a */
    public final boolean m3324a() {
        int m3317b = m3317b();
        return m3317b != 0 && this.f3025h[m3308a(m3317b - 1)] == 0;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C0648h c0648h = (C0648h) obj;
        if (this == c0648h) {
            return 0;
        }
        int m3317b = m3317b();
        int m3317b2 = c0648h.m3317b();
        int i = m3317b > m3317b2 ? m3317b2 : m3317b;
        for (int i2 = 1; i2 <= i; i2++) {
            int m3308a = m3308a(m3317b - i2);
            int m3308a2 = c0648h.m3308a(m3317b2 - i2);
            byte b2 = this.f3025h[m3308a];
            byte b3 = c0648h.f3025h[m3308a2];
            for (int i3 = 0; i3 < b2 && i3 < b3; i3++) {
                byte[] bArr = f3023f;
                int i4 = bArr[this.f3025h[(i3 + m3308a) + 1] & 255] - bArr[c0648h.f3025h[(i3 + m3308a2) + 1] & 255];
                if (i4 != 0) {
                    return i4;
                }
            }
            if (b2 != b3) {
                return b2 - b3;
            }
        }
        return m3317b - m3317b2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof C0648h)) {
            return false;
        }
        C0648h c0648h = (C0648h) obj;
        if (c0648h.f3027j == 0) {
            c0648h.hashCode();
        }
        if (this.f3027j == 0) {
            hashCode();
        }
        if (c0648h.f3027j != this.f3027j || c0648h.m3317b() != m3317b()) {
            return false;
        }
        byte[] bArr = c0648h.f3025h;
        int m3308a = c0648h.m3308a(0);
        int m3317b = m3317b();
        int m3308a2 = m3308a(0);
        int i = m3308a;
        int i2 = 0;
        while (i2 < m3317b) {
            byte[] bArr2 = this.f3025h;
            if (bArr2[m3308a2] != bArr[i]) {
                return false;
            }
            int i3 = m3308a2 + 1;
            byte b2 = bArr2[m3308a2];
            int i4 = i + 1;
            if (b2 > 63) {
                throw new IllegalStateException("invalid label");
            }
            int i5 = i4;
            int i6 = 0;
            while (i6 < b2) {
                byte[] bArr3 = f3023f;
                int i7 = i3 + 1;
                int i8 = i5 + 1;
                if (bArr3[this.f3025h[i3] & 255] != bArr3[bArr[i5] & 255]) {
                    return false;
                }
                i6++;
                i5 = i8;
                i3 = i7;
            }
            i2++;
            i = i5;
            m3308a2 = i3;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.f3027j;
        if (i != 0) {
            return i;
        }
        int i2 = 0;
        int m3308a = m3308a(0);
        while (true) {
            byte[] bArr = this.f3025h;
            if (m3308a >= bArr.length) {
                this.f3027j = i2;
                return this.f3027j;
            }
            i2 += (i2 << 3) + f3023f[bArr[m3308a] & 255];
            m3308a++;
        }
    }

    public final String toString() {
        int m3317b = m3317b();
        if (m3317b == 0) {
            return "@";
        }
        int i = 0;
        if (m3317b == 1 && this.f3025h[m3308a(0)] == 0) {
            return ".";
        }
        StringBuffer stringBuffer = new StringBuffer();
        int m3308a = m3308a(0);
        while (true) {
            if (i >= m3317b) {
                break;
            }
            byte b2 = this.f3025h[m3308a];
            if (b2 > 63) {
                throw new IllegalStateException("invalid label");
            }
            if (b2 == 0) {
                stringBuffer.append('.');
                break;
            }
            if (i > 0) {
                stringBuffer.append('.');
            }
            stringBuffer.append(m3313a(this.f3025h, m3308a));
            m3308a += b2 + 1;
            i++;
        }
        return stringBuffer.toString();
    }
}
