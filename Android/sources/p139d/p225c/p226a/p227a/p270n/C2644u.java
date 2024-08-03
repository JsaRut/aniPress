package p139d.p225c.p226a.p227a.p270n;

import java.nio.charset.Charset;

/* renamed from: d.c.a.a.n.u */
/* loaded from: classes.dex */
public final class C2644u {

    /* renamed from: a */
    public byte[] f11004a;

    /* renamed from: b */
    private int f11005b;

    /* renamed from: c */
    private int f11006c;

    public C2644u() {
        this.f11004a = C2622I.f10921f;
    }

    public C2644u(int i) {
        this.f11004a = new byte[i];
        this.f11006c = i;
    }

    public C2644u(byte[] bArr) {
        this.f11004a = bArr;
        this.f11006c = bArr.length;
    }

    public C2644u(byte[] bArr, int i) {
        this.f11004a = bArr;
        this.f11006c = i;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: A */
    public long m11206A() {
        int i;
        int i2;
        long j = this.f11004a[this.f11005b];
        int i3 = 7;
        while (true) {
            if (i3 < 0) {
                break;
            }
            if (((1 << i3) & j) != 0) {
                i3--;
            } else if (i3 < 6) {
                j &= r6 - 1;
                i2 = 7 - i3;
            } else if (i3 == 7) {
                i2 = 1;
            }
        }
        i2 = 0;
        if (i2 == 0) {
            throw new NumberFormatException("Invalid UTF-8 sequence first byte: " + j);
        }
        for (i = 1; i < i2; i++) {
            if ((this.f11004a[this.f11005b + i] & 192) != 128) {
                throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j);
            }
            j = (j << 6) | (r3 & 63);
        }
        this.f11005b += i2;
        return j;
    }

    /* renamed from: B */
    public void m11207B() {
        this.f11005b = 0;
        this.f11006c = 0;
    }

    /* renamed from: a */
    public int m11208a() {
        return this.f11006c - this.f11005b;
    }

    /* renamed from: a */
    public String m11209a(int i) {
        if (i == 0) {
            return "";
        }
        int i2 = (this.f11005b + i) - 1;
        String m11057a = C2622I.m11057a(this.f11004a, this.f11005b, (i2 >= this.f11006c || this.f11004a[i2] != 0) ? i : i - 1);
        this.f11005b += i;
        return m11057a;
    }

    /* renamed from: a */
    public String m11210a(int i, Charset charset) {
        String str = new String(this.f11004a, this.f11005b, i, charset);
        this.f11005b += i;
        return str;
    }

    /* renamed from: a */
    public void m11211a(C2643t c2643t, int i) {
        m11214a(c2643t.f11000a, 0, i);
        c2643t.m11198b(0);
    }

    /* renamed from: a */
    public void m11212a(byte[] bArr) {
        m11213a(bArr, bArr.length);
    }

    /* renamed from: a */
    public void m11213a(byte[] bArr, int i) {
        this.f11004a = bArr;
        this.f11006c = i;
        this.f11005b = 0;
    }

    /* renamed from: a */
    public void m11214a(byte[] bArr, int i, int i2) {
        System.arraycopy(this.f11004a, this.f11005b, bArr, i, i2);
        this.f11005b += i2;
    }

    /* renamed from: b */
    public int m11215b() {
        return this.f11004a.length;
    }

    /* renamed from: b */
    public String m11216b(int i) {
        return m11210a(i, Charset.forName("UTF-8"));
    }

    /* renamed from: c */
    public int m11217c() {
        return this.f11005b;
    }

    /* renamed from: c */
    public void m11218c(int i) {
        m11213a(m11215b() < i ? new byte[i] : this.f11004a, i);
    }

    /* renamed from: d */
    public int m11219d() {
        return this.f11006c;
    }

    /* renamed from: d */
    public void m11220d(int i) {
        C2628e.m11111a(i >= 0 && i <= this.f11004a.length);
        this.f11006c = i;
    }

    /* renamed from: e */
    public char m11221e() {
        byte[] bArr = this.f11004a;
        int i = this.f11005b;
        return (char) ((bArr[i + 1] & 255) | ((bArr[i] & 255) << 8));
    }

    /* renamed from: e */
    public void m11222e(int i) {
        C2628e.m11111a(i >= 0 && i <= this.f11006c);
        this.f11005b = i;
    }

    /* renamed from: f */
    public int m11223f() {
        return this.f11004a[this.f11005b] & 255;
    }

    /* renamed from: f */
    public void m11224f(int i) {
        m11222e(this.f11005b + i);
    }

    /* renamed from: g */
    public double m11225g() {
        return Double.longBitsToDouble(m11234p());
    }

    /* renamed from: h */
    public int m11226h() {
        byte[] bArr = this.f11004a;
        int i = this.f11005b;
        this.f11005b = i + 1;
        int i2 = (bArr[i] & 255) << 24;
        int i3 = this.f11005b;
        this.f11005b = i3 + 1;
        int i4 = i2 | ((bArr[i3] & 255) << 16);
        int i5 = this.f11005b;
        this.f11005b = i5 + 1;
        int i6 = i4 | ((bArr[i5] & 255) << 8);
        int i7 = this.f11005b;
        this.f11005b = i7 + 1;
        return (bArr[i7] & 255) | i6;
    }

    /* renamed from: i */
    public int m11227i() {
        byte[] bArr = this.f11004a;
        int i = this.f11005b;
        this.f11005b = i + 1;
        int i2 = ((bArr[i] & 255) << 24) >> 8;
        int i3 = this.f11005b;
        this.f11005b = i3 + 1;
        int i4 = i2 | ((bArr[i3] & 255) << 8);
        int i5 = this.f11005b;
        this.f11005b = i5 + 1;
        return (bArr[i5] & 255) | i4;
    }

    /* renamed from: j */
    public String m11228j() {
        if (m11208a() == 0) {
            return null;
        }
        int i = this.f11005b;
        while (i < this.f11006c && !C2622I.m11095g(this.f11004a[i])) {
            i++;
        }
        int i2 = this.f11005b;
        if (i - i2 >= 3) {
            byte[] bArr = this.f11004a;
            if (bArr[i2] == -17 && bArr[i2 + 1] == -69 && bArr[i2 + 2] == -65) {
                this.f11005b = i2 + 3;
            }
        }
        byte[] bArr2 = this.f11004a;
        int i3 = this.f11005b;
        String m11057a = C2622I.m11057a(bArr2, i3, i - i3);
        this.f11005b = i;
        int i4 = this.f11005b;
        int i5 = this.f11006c;
        if (i4 == i5) {
            return m11057a;
        }
        if (this.f11004a[i4] == 13) {
            this.f11005b = i4 + 1;
            if (this.f11005b == i5) {
                return m11057a;
            }
        }
        byte[] bArr3 = this.f11004a;
        int i6 = this.f11005b;
        if (bArr3[i6] == 10) {
            this.f11005b = i6 + 1;
        }
        return m11057a;
    }

    /* renamed from: k */
    public int m11229k() {
        byte[] bArr = this.f11004a;
        int i = this.f11005b;
        this.f11005b = i + 1;
        int i2 = bArr[i] & 255;
        int i3 = this.f11005b;
        this.f11005b = i3 + 1;
        int i4 = i2 | ((bArr[i3] & 255) << 8);
        int i5 = this.f11005b;
        this.f11005b = i5 + 1;
        int i6 = i4 | ((bArr[i5] & 255) << 16);
        int i7 = this.f11005b;
        this.f11005b = i7 + 1;
        return ((bArr[i7] & 255) << 24) | i6;
    }

    /* renamed from: l */
    public long m11230l() {
        byte[] bArr = this.f11004a;
        this.f11005b = this.f11005b + 1;
        this.f11005b = this.f11005b + 1;
        long j = (bArr[r1] & 255) | ((bArr[r5] & 255) << 8);
        this.f11005b = this.f11005b + 1;
        long j2 = j | ((bArr[r5] & 255) << 16);
        this.f11005b = this.f11005b + 1;
        long j3 = j2 | ((bArr[r5] & 255) << 24);
        this.f11005b = this.f11005b + 1;
        long j4 = j3 | ((bArr[r5] & 255) << 32);
        this.f11005b = this.f11005b + 1;
        long j5 = j4 | ((bArr[r5] & 255) << 40);
        this.f11005b = this.f11005b + 1;
        long j6 = j5 | ((bArr[r5] & 255) << 48);
        this.f11005b = this.f11005b + 1;
        return j6 | ((255 & bArr[r5]) << 56);
    }

    /* renamed from: m */
    public long m11231m() {
        byte[] bArr = this.f11004a;
        this.f11005b = this.f11005b + 1;
        this.f11005b = this.f11005b + 1;
        long j = (bArr[r1] & 255) | ((bArr[r5] & 255) << 8);
        this.f11005b = this.f11005b + 1;
        long j2 = j | ((bArr[r5] & 255) << 16);
        this.f11005b = this.f11005b + 1;
        return j2 | ((255 & bArr[r5]) << 24);
    }

    /* renamed from: n */
    public int m11232n() {
        int m11229k = m11229k();
        if (m11229k >= 0) {
            return m11229k;
        }
        throw new IllegalStateException("Top bit not zero: " + m11229k);
    }

    /* renamed from: o */
    public int m11233o() {
        byte[] bArr = this.f11004a;
        int i = this.f11005b;
        this.f11005b = i + 1;
        int i2 = bArr[i] & 255;
        int i3 = this.f11005b;
        this.f11005b = i3 + 1;
        return ((bArr[i3] & 255) << 8) | i2;
    }

    /* renamed from: p */
    public long m11234p() {
        byte[] bArr = this.f11004a;
        this.f11005b = this.f11005b + 1;
        this.f11005b = this.f11005b + 1;
        long j = ((bArr[r1] & 255) << 56) | ((bArr[r5] & 255) << 48);
        this.f11005b = this.f11005b + 1;
        long j2 = j | ((bArr[r5] & 255) << 40);
        this.f11005b = this.f11005b + 1;
        long j3 = j2 | ((bArr[r5] & 255) << 32);
        this.f11005b = this.f11005b + 1;
        long j4 = j3 | ((bArr[r5] & 255) << 24);
        this.f11005b = this.f11005b + 1;
        long j5 = j4 | ((bArr[r5] & 255) << 16);
        this.f11005b = this.f11005b + 1;
        long j6 = j5 | ((bArr[r5] & 255) << 8);
        this.f11005b = this.f11005b + 1;
        return j6 | (255 & bArr[r5]);
    }

    /* renamed from: q */
    public String m11235q() {
        if (m11208a() == 0) {
            return null;
        }
        int i = this.f11005b;
        while (i < this.f11006c && this.f11004a[i] != 0) {
            i++;
        }
        byte[] bArr = this.f11004a;
        int i2 = this.f11005b;
        String m11057a = C2622I.m11057a(bArr, i2, i - i2);
        this.f11005b = i;
        int i3 = this.f11005b;
        if (i3 < this.f11006c) {
            this.f11005b = i3 + 1;
        }
        return m11057a;
    }

    /* renamed from: r */
    public short m11236r() {
        byte[] bArr = this.f11004a;
        int i = this.f11005b;
        this.f11005b = i + 1;
        int i2 = (bArr[i] & 255) << 8;
        int i3 = this.f11005b;
        this.f11005b = i3 + 1;
        return (short) ((bArr[i3] & 255) | i2);
    }

    /* renamed from: s */
    public int m11237s() {
        return (m11238t() << 21) | (m11238t() << 14) | (m11238t() << 7) | m11238t();
    }

    /* renamed from: t */
    public int m11238t() {
        byte[] bArr = this.f11004a;
        int i = this.f11005b;
        this.f11005b = i + 1;
        return bArr[i] & 255;
    }

    /* renamed from: u */
    public int m11239u() {
        byte[] bArr = this.f11004a;
        int i = this.f11005b;
        this.f11005b = i + 1;
        int i2 = (bArr[i] & 255) << 8;
        int i3 = this.f11005b;
        this.f11005b = i3 + 1;
        int i4 = (bArr[i3] & 255) | i2;
        this.f11005b += 2;
        return i4;
    }

    /* renamed from: v */
    public long m11240v() {
        byte[] bArr = this.f11004a;
        this.f11005b = this.f11005b + 1;
        this.f11005b = this.f11005b + 1;
        long j = ((bArr[r1] & 255) << 24) | ((bArr[r5] & 255) << 16);
        this.f11005b = this.f11005b + 1;
        long j2 = j | ((bArr[r5] & 255) << 8);
        this.f11005b = this.f11005b + 1;
        return j2 | (255 & bArr[r5]);
    }

    /* renamed from: w */
    public int m11241w() {
        byte[] bArr = this.f11004a;
        int i = this.f11005b;
        this.f11005b = i + 1;
        int i2 = (bArr[i] & 255) << 16;
        int i3 = this.f11005b;
        this.f11005b = i3 + 1;
        int i4 = i2 | ((bArr[i3] & 255) << 8);
        int i5 = this.f11005b;
        this.f11005b = i5 + 1;
        return (bArr[i5] & 255) | i4;
    }

    /* renamed from: x */
    public int m11242x() {
        int m11226h = m11226h();
        if (m11226h >= 0) {
            return m11226h;
        }
        throw new IllegalStateException("Top bit not zero: " + m11226h);
    }

    /* renamed from: y */
    public long m11243y() {
        long m11234p = m11234p();
        if (m11234p >= 0) {
            return m11234p;
        }
        throw new IllegalStateException("Top bit not zero: " + m11234p);
    }

    /* renamed from: z */
    public int m11244z() {
        byte[] bArr = this.f11004a;
        int i = this.f11005b;
        this.f11005b = i + 1;
        int i2 = (bArr[i] & 255) << 8;
        int i3 = this.f11005b;
        this.f11005b = i3 + 1;
        return (bArr[i3] & 255) | i2;
    }
}
