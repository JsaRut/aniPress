package p139d.p225c.p226a.p227a.p270n;

/* renamed from: d.c.a.a.n.t */
/* loaded from: classes.dex */
public final class C2643t {

    /* renamed from: a */
    public byte[] f11000a;

    /* renamed from: b */
    private int f11001b;

    /* renamed from: c */
    private int f11002c;

    /* renamed from: d */
    private int f11003d;

    public C2643t() {
        this.f11000a = C2622I.f10921f;
    }

    public C2643t(byte[] bArr) {
        this(bArr, bArr.length);
    }

    public C2643t(byte[] bArr, int i) {
        this.f11000a = bArr;
        this.f11003d = i;
    }

    /* renamed from: g */
    private void m11189g() {
        int i;
        int i2 = this.f11001b;
        C2628e.m11113b(i2 >= 0 && (i2 < (i = this.f11003d) || (i2 == i && this.f11002c == 0)));
    }

    /* renamed from: a */
    public int m11190a() {
        return ((this.f11003d - this.f11001b) * 8) - this.f11002c;
    }

    /* renamed from: a */
    public int m11191a(int i) {
        int i2;
        if (i == 0) {
            return 0;
        }
        this.f11002c += i;
        int i3 = 0;
        while (true) {
            i2 = this.f11002c;
            if (i2 <= 8) {
                break;
            }
            this.f11002c = i2 - 8;
            byte[] bArr = this.f11000a;
            int i4 = this.f11001b;
            this.f11001b = i4 + 1;
            i3 |= (bArr[i4] & 255) << this.f11002c;
        }
        byte[] bArr2 = this.f11000a;
        int i5 = this.f11001b;
        int i6 = ((-1) >>> (32 - i)) & (i3 | ((bArr2[i5] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.f11002c = 0;
            this.f11001b = i5 + 1;
        }
        m11189g();
        return i6;
    }

    /* renamed from: a */
    public void m11192a(int i, int i2) {
        if (i2 < 32) {
            i &= (1 << i2) - 1;
        }
        int min = Math.min(8 - this.f11002c, i2);
        int i3 = this.f11002c;
        int i4 = (8 - i3) - min;
        byte[] bArr = this.f11000a;
        int i5 = this.f11001b;
        bArr[i5] = (byte) (((65280 >> i3) | ((1 << i4) - 1)) & bArr[i5]);
        int i6 = i2 - min;
        bArr[i5] = (byte) (((i >>> i6) << i4) | bArr[i5]);
        int i7 = i5 + 1;
        while (i6 > 8) {
            this.f11000a[i7] = (byte) (i >>> (i6 - 8));
            i6 -= 8;
            i7++;
        }
        int i8 = 8 - i6;
        byte[] bArr2 = this.f11000a;
        bArr2[i7] = (byte) (bArr2[i7] & ((1 << i8) - 1));
        bArr2[i7] = (byte) (((i & ((1 << i6) - 1)) << i8) | bArr2[i7]);
        m11201c(i2);
        m11189g();
    }

    /* renamed from: a */
    public void m11193a(C2644u c2644u) {
        m11195a(c2644u.f11004a, c2644u.m11219d());
        m11198b(c2644u.m11217c() * 8);
    }

    /* renamed from: a */
    public void m11194a(byte[] bArr) {
        m11195a(bArr, bArr.length);
    }

    /* renamed from: a */
    public void m11195a(byte[] bArr, int i) {
        this.f11000a = bArr;
        this.f11001b = 0;
        this.f11002c = 0;
        this.f11003d = i;
    }

    /* renamed from: a */
    public void m11196a(byte[] bArr, int i, int i2) {
        int i3 = (i2 >> 3) + i;
        while (i < i3) {
            byte[] bArr2 = this.f11000a;
            int i4 = this.f11001b;
            this.f11001b = i4 + 1;
            byte b2 = bArr2[i4];
            int i5 = this.f11002c;
            bArr[i] = (byte) (b2 << i5);
            bArr[i] = (byte) (((255 & bArr2[this.f11001b]) >> (8 - i5)) | bArr[i]);
            i++;
        }
        int i6 = i2 & 7;
        if (i6 == 0) {
            return;
        }
        bArr[i3] = (byte) (bArr[i3] & (255 >> i6));
        int i7 = this.f11002c;
        if (i7 + i6 > 8) {
            int i8 = bArr[i3];
            byte[] bArr3 = this.f11000a;
            int i9 = this.f11001b;
            this.f11001b = i9 + 1;
            bArr[i3] = (byte) (i8 | ((bArr3[i9] & 255) << i7));
            this.f11002c = i7 - 8;
        }
        this.f11002c += i6;
        byte[] bArr4 = this.f11000a;
        int i10 = this.f11001b;
        int i11 = bArr4[i10] & 255;
        int i12 = this.f11002c;
        bArr[i3] = (byte) (((byte) ((i11 >> (8 - i12)) << (8 - i6))) | bArr[i3]);
        if (i12 == 8) {
            this.f11002c = 0;
            this.f11001b = i10 + 1;
        }
        m11189g();
    }

    /* renamed from: b */
    public void m11197b() {
        if (this.f11002c == 0) {
            return;
        }
        this.f11002c = 0;
        this.f11001b++;
        m11189g();
    }

    /* renamed from: b */
    public void m11198b(int i) {
        this.f11001b = i / 8;
        this.f11002c = i - (this.f11001b * 8);
        m11189g();
    }

    /* renamed from: b */
    public void m11199b(byte[] bArr, int i, int i2) {
        C2628e.m11113b(this.f11002c == 0);
        System.arraycopy(this.f11000a, this.f11001b, bArr, i, i2);
        this.f11001b += i2;
        m11189g();
    }

    /* renamed from: c */
    public int m11200c() {
        C2628e.m11113b(this.f11002c == 0);
        return this.f11001b;
    }

    /* renamed from: c */
    public void m11201c(int i) {
        int i2 = i / 8;
        this.f11001b += i2;
        this.f11002c += i - (i2 * 8);
        int i3 = this.f11002c;
        if (i3 > 7) {
            this.f11001b++;
            this.f11002c = i3 - 8;
        }
        m11189g();
    }

    /* renamed from: d */
    public int m11202d() {
        return (this.f11001b * 8) + this.f11002c;
    }

    /* renamed from: d */
    public void m11203d(int i) {
        C2628e.m11113b(this.f11002c == 0);
        this.f11001b += i;
        m11189g();
    }

    /* renamed from: e */
    public boolean m11204e() {
        boolean z = (this.f11000a[this.f11001b] & (128 >> this.f11002c)) != 0;
        m11205f();
        return z;
    }

    /* renamed from: f */
    public void m11205f() {
        int i = this.f11002c + 1;
        this.f11002c = i;
        if (i == 8) {
            this.f11002c = 0;
            this.f11001b++;
        }
        m11189g();
    }
}
