package p139d.p225c.p226a.p227a.p270n;

/* renamed from: d.c.a.a.n.v */
/* loaded from: classes.dex */
public final class C2645v {

    /* renamed from: a */
    private byte[] f11007a;

    /* renamed from: b */
    private int f11008b;

    /* renamed from: c */
    private int f11009c;

    /* renamed from: d */
    private int f11010d;

    public C2645v(byte[] bArr, int i, int i2) {
        m11248a(bArr, i, i2);
    }

    /* renamed from: d */
    private boolean m11245d(int i) {
        if (2 <= i && i < this.f11008b) {
            byte[] bArr = this.f11007a;
            if (bArr[i] == 3 && bArr[i - 2] == 0 && bArr[i - 1] == 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    private void m11246f() {
        int i;
        int i2 = this.f11009c;
        C2628e.m11113b(i2 >= 0 && (i2 < (i = this.f11008b) || (i2 == i && this.f11010d == 0)));
    }

    /* renamed from: g */
    private int m11247g() {
        int i = 0;
        while (!m11252b()) {
            i++;
        }
        return ((1 << i) - 1) + (i > 0 ? m11251b(i) : 0);
    }

    /* renamed from: a */
    public void m11248a(byte[] bArr, int i, int i2) {
        this.f11007a = bArr;
        this.f11009c = i;
        this.f11008b = i2;
        this.f11010d = 0;
        m11246f();
    }

    /* renamed from: a */
    public boolean m11249a() {
        int i = this.f11009c;
        int i2 = this.f11010d;
        int i3 = 0;
        while (this.f11009c < this.f11008b && !m11252b()) {
            i3++;
        }
        boolean z = this.f11009c == this.f11008b;
        this.f11009c = i;
        this.f11010d = i2;
        return !z && m11250a((i3 * 2) + 1);
    }

    /* renamed from: a */
    public boolean m11250a(int i) {
        int i2 = this.f11009c;
        int i3 = i / 8;
        int i4 = i2 + i3;
        int i5 = (this.f11010d + i) - (i3 * 8);
        if (i5 > 7) {
            i4++;
            i5 -= 8;
        }
        while (true) {
            i2++;
            if (i2 > i4 || i4 >= this.f11008b) {
                break;
            }
            if (m11245d(i2)) {
                i4++;
                i2 += 2;
            }
        }
        int i6 = this.f11008b;
        if (i4 >= i6) {
            return i4 == i6 && i5 == 0;
        }
        return true;
    }

    /* renamed from: b */
    public int m11251b(int i) {
        int i2;
        this.f11010d += i;
        int i3 = 0;
        while (true) {
            i2 = this.f11010d;
            if (i2 <= 8) {
                break;
            }
            this.f11010d = i2 - 8;
            byte[] bArr = this.f11007a;
            int i4 = this.f11009c;
            i3 |= (bArr[i4] & 255) << this.f11010d;
            if (!m11245d(i4 + 1)) {
                r3 = 1;
            }
            this.f11009c = i4 + r3;
        }
        byte[] bArr2 = this.f11007a;
        int i5 = this.f11009c;
        int i6 = ((-1) >>> (32 - i)) & (i3 | ((bArr2[i5] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.f11010d = 0;
            this.f11009c = i5 + (m11245d(i5 + 1) ? 2 : 1);
        }
        m11246f();
        return i6;
    }

    /* renamed from: b */
    public boolean m11252b() {
        boolean z = (this.f11007a[this.f11009c] & (128 >> this.f11010d)) != 0;
        m11256e();
        return z;
    }

    /* renamed from: c */
    public int m11253c() {
        int m11247g = m11247g();
        return (m11247g % 2 == 0 ? -1 : 1) * ((m11247g + 1) / 2);
    }

    /* renamed from: c */
    public void m11254c(int i) {
        int i2 = this.f11009c;
        int i3 = i / 8;
        this.f11009c = i2 + i3;
        this.f11010d += i - (i3 * 8);
        int i4 = this.f11010d;
        if (i4 > 7) {
            this.f11009c++;
            this.f11010d = i4 - 8;
        }
        while (true) {
            i2++;
            if (i2 > this.f11009c) {
                m11246f();
                return;
            } else if (m11245d(i2)) {
                this.f11009c++;
                i2 += 2;
            }
        }
    }

    /* renamed from: d */
    public int m11255d() {
        return m11247g();
    }

    /* renamed from: e */
    public void m11256e() {
        int i = this.f11010d + 1;
        this.f11010d = i;
        if (i == 8) {
            this.f11010d = 0;
            int i2 = this.f11009c;
            this.f11009c = i2 + (m11245d(i2 + 1) ? 2 : 1);
        }
        m11246f();
    }
}
