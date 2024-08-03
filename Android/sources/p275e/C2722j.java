package p275e;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* renamed from: e.j */
/* loaded from: classes.dex */
public class C2722j implements Serializable, Comparable<C2722j> {

    /* renamed from: a */
    static final char[] f11398a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: b */
    public static final C2722j f11399b = m11723a(new byte[0]);

    /* renamed from: c */
    final byte[] f11400c;

    /* renamed from: d */
    transient int f11401d;

    /* renamed from: e */
    transient String f11402e;

    public C2722j(byte[] bArr) {
        this.f11400c = bArr;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: a */
    private static int m11719a(char c2) {
        if (c2 >= '0' && c2 <= '9') {
            return c2 - '0';
        }
        char c3 = 'a';
        if (c2 < 'a' || c2 > 'f') {
            c3 = 'A';
            if (c2 < 'A' || c2 > 'F') {
                throw new IllegalArgumentException("Unexpected hex digit: " + c2);
            }
        }
        return (c2 - c3) + 10;
    }

    /* renamed from: a */
    static int m11720a(String str, int i) {
        int length = str.length();
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            if (i3 == i) {
                return i2;
            }
            int codePointAt = str.codePointAt(i2);
            if ((Character.isISOControl(codePointAt) && codePointAt != 10 && codePointAt != 13) || codePointAt == 65533) {
                return -1;
            }
            i3++;
            i2 += Character.charCount(codePointAt);
        }
        return str.length();
    }

    /* renamed from: a */
    public static C2722j m11721a(String str) {
        if (str == null) {
            throw new IllegalArgumentException("base64 == null");
        }
        byte[] m11667a = C2716d.m11667a(str);
        if (m11667a != null) {
            return new C2722j(m11667a);
        }
        return null;
    }

    /* renamed from: a */
    public static C2722j m11722a(String str, Charset charset) {
        if (str == null) {
            throw new IllegalArgumentException("s == null");
        }
        if (charset != null) {
            return new C2722j(str.getBytes(charset));
        }
        throw new IllegalArgumentException("charset == null");
    }

    /* renamed from: a */
    public static C2722j m11723a(byte... bArr) {
        if (bArr != null) {
            return new C2722j((byte[]) bArr.clone());
        }
        throw new IllegalArgumentException("data == null");
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: b */
    public static C2722j m11724b(String str) {
        if (str == null) {
            throw new IllegalArgumentException("hex == null");
        }
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Unexpected hex string: " + str);
        }
        byte[] bArr = new byte[str.length() / 2];
        for (int i = 0; i < bArr.length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) ((m11719a(str.charAt(i2)) << 4) + m11719a(str.charAt(i2 + 1)));
        }
        return m11723a(bArr);
    }

    /* renamed from: c */
    public static C2722j m11725c(String str) {
        if (str == null) {
            throw new IllegalArgumentException("s == null");
        }
        C2722j c2722j = new C2722j(str.getBytes(C2712G.f11379a));
        c2722j.f11402e = str;
        return c2722j;
    }

    /* renamed from: d */
    private C2722j m11726d(String str) {
        try {
            return m11723a(MessageDigest.getInstance(str).digest(this.f11400c));
        } catch (NoSuchAlgorithmException e2) {
            throw new AssertionError(e2);
        }
    }

    /* renamed from: a */
    public byte mo11644a(int i) {
        return this.f11400c[i];
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(C2722j c2722j) {
        int mo11655h = mo11655h();
        int mo11655h2 = c2722j.mo11655h();
        int min = Math.min(mo11655h, mo11655h2);
        for (int i = 0; i < min; i++) {
            int mo11644a = mo11644a(i) & 255;
            int mo11644a2 = c2722j.mo11644a(i) & 255;
            if (mo11644a != mo11644a2) {
                return mo11644a < mo11644a2 ? -1 : 1;
            }
        }
        if (mo11655h == mo11655h2) {
            return 0;
        }
        return mo11655h < mo11655h2 ? -1 : 1;
    }

    /* renamed from: a */
    public C2722j mo11645a(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        byte[] bArr = this.f11400c;
        if (i2 > bArr.length) {
            throw new IllegalArgumentException("endIndex > length(" + this.f11400c.length + ")");
        }
        int i3 = i2 - i;
        if (i3 < 0) {
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        if (i == 0 && i2 == bArr.length) {
            return this;
        }
        byte[] bArr2 = new byte[i3];
        System.arraycopy(this.f11400c, i, bArr2, 0, i3);
        return new C2722j(bArr2);
    }

    /* renamed from: a */
    public void mo11646a(C2719g c2719g) {
        byte[] bArr = this.f11400c;
        c2719g.write(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public boolean mo11647a(int i, C2722j c2722j, int i2, int i3) {
        return c2722j.mo11648a(i2, this.f11400c, i, i3);
    }

    /* renamed from: a */
    public boolean mo11648a(int i, byte[] bArr, int i2, int i3) {
        if (i >= 0) {
            byte[] bArr2 = this.f11400c;
            if (i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && C2712G.m11663a(bArr2, i, bArr, i2, i3)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public String mo11649b() {
        return C2716d.m11665a(this.f11400c);
    }

    /* renamed from: b */
    public final boolean m11728b(C2722j c2722j) {
        return mo11647a(0, c2722j, 0, c2722j.mo11655h());
    }

    /* renamed from: c */
    public String mo11650c() {
        byte[] bArr = this.f11400c;
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b2 : bArr) {
            int i2 = i + 1;
            char[] cArr2 = f11398a;
            cArr[i] = cArr2[(b2 >> 4) & 15];
            i = i2 + 1;
            cArr[i2] = cArr2[b2 & 15];
        }
        return new String(cArr);
    }

    /* renamed from: d */
    public byte[] mo11651d() {
        return this.f11400c;
    }

    /* renamed from: e */
    public C2722j mo11652e() {
        return m11726d("MD5");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2722j) {
            C2722j c2722j = (C2722j) obj;
            int mo11655h = c2722j.mo11655h();
            byte[] bArr = this.f11400c;
            if (mo11655h == bArr.length && c2722j.mo11648a(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public C2722j mo11653f() {
        return m11726d("SHA-1");
    }

    /* renamed from: g */
    public C2722j mo11654g() {
        return m11726d("SHA-256");
    }

    /* renamed from: h */
    public int mo11655h() {
        return this.f11400c.length;
    }

    public int hashCode() {
        int i = this.f11401d;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.f11400c);
        this.f11401d = hashCode;
        return hashCode;
    }

    /* renamed from: i */
    public C2722j mo11656i() {
        int i = 0;
        while (true) {
            byte[] bArr = this.f11400c;
            if (i >= bArr.length) {
                return this;
            }
            byte b2 = bArr[i];
            if (b2 >= 65 && b2 <= 90) {
                byte[] bArr2 = (byte[]) bArr.clone();
                bArr2[i] = (byte) (b2 + 32);
                for (int i2 = i + 1; i2 < bArr2.length; i2++) {
                    byte b3 = bArr2[i2];
                    if (b3 >= 65 && b3 <= 90) {
                        bArr2[i2] = (byte) (b3 + 32);
                    }
                }
                return new C2722j(bArr2);
            }
            i++;
        }
    }

    /* renamed from: j */
    public byte[] mo11657j() {
        return (byte[]) this.f11400c.clone();
    }

    /* renamed from: k */
    public String mo11658k() {
        String str = this.f11402e;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.f11400c, C2712G.f11379a);
        this.f11402e = str2;
        return str2;
    }

    public String toString() {
        StringBuilder sb;
        StringBuilder sb2;
        if (this.f11400c.length == 0) {
            return "[size=0]";
        }
        String mo11658k = mo11658k();
        int m11720a = m11720a(mo11658k, 64);
        if (m11720a == -1) {
            if (this.f11400c.length <= 64) {
                sb2 = new StringBuilder();
                sb2.append("[hex=");
                sb2.append(mo11650c());
                sb2.append("]");
            } else {
                sb2 = new StringBuilder();
                sb2.append("[size=");
                sb2.append(this.f11400c.length);
                sb2.append(" hex=");
                sb2.append(mo11645a(0, 64).mo11650c());
                sb2.append("…]");
            }
            return sb2.toString();
        }
        String replace = mo11658k.substring(0, m11720a).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
        if (m11720a < mo11658k.length()) {
            sb = new StringBuilder();
            sb.append("[size=");
            sb.append(this.f11400c.length);
            sb.append(" text=");
            sb.append(replace);
            sb.append("…]");
        } else {
            sb = new StringBuilder();
            sb.append("[text=");
            sb.append(replace);
            sb.append("]");
        }
        return sb.toString();
    }
}
