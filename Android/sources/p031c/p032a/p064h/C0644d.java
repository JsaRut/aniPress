package p031c.p032a.p064h;

/* renamed from: c.a.h.d */
/* loaded from: classes.dex */
public final class C0644d {

    /* renamed from: a */
    private byte[] f2998a;

    /* renamed from: b */
    private int f2999b;

    /* renamed from: c */
    private int f3000c;

    public C0644d() {
        this(32);
    }

    private C0644d(int i) {
        this.f2998a = new byte[32];
        this.f2999b = 0;
        this.f3000c = -1;
    }

    /* renamed from: a */
    private static void m3281a(long j, int i) {
        long j2 = 1 << i;
        if (j < 0 || j > j2) {
            throw new IllegalArgumentException(j + " out of range for " + i + " bit value");
        }
    }

    /* renamed from: d */
    private void m3282d(int i) {
        byte[] bArr = this.f2998a;
        int length = bArr.length;
        int i2 = this.f2999b;
        if (length - i2 >= i) {
            return;
        }
        int length2 = bArr.length * 2;
        if (length2 < i2 + i) {
            length2 = i2 + i;
        }
        byte[] bArr2 = new byte[length2];
        System.arraycopy(this.f2998a, 0, bArr2, 0, this.f2999b);
        this.f2998a = bArr2;
    }

    /* renamed from: a */
    public final int m3283a() {
        return this.f2999b;
    }

    /* renamed from: a */
    public final void m3284a(int i) {
        if (i > this.f2999b) {
            throw new IllegalArgumentException("cannot jump past end of data");
        }
        this.f2999b = i;
    }

    /* renamed from: a */
    public final void m3285a(int i, int i2) {
        m3281a(i, 16);
        if (i2 > this.f2999b - 2) {
            throw new IllegalArgumentException("cannot write past end of data");
        }
        byte[] bArr = this.f2998a;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 1] = (byte) (i & 255);
    }

    /* renamed from: a */
    public final void m3286a(long j) {
        m3281a(j, 32);
        m3282d(4);
        byte[] bArr = this.f2998a;
        int i = this.f2999b;
        this.f2999b = i + 1;
        bArr[i] = (byte) ((j >>> 24) & 255);
        int i2 = this.f2999b;
        this.f2999b = i2 + 1;
        bArr[i2] = (byte) ((j >>> 16) & 255);
        int i3 = this.f2999b;
        this.f2999b = i3 + 1;
        bArr[i3] = (byte) ((j >>> 8) & 255);
        int i4 = this.f2999b;
        this.f2999b = i4 + 1;
        bArr[i4] = (byte) (j & 255);
    }

    /* renamed from: a */
    public final void m3287a(byte[] bArr) {
        m3288a(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public final void m3288a(byte[] bArr, int i, int i2) {
        m3282d(i2);
        System.arraycopy(bArr, i, this.f2998a, this.f2999b, i2);
        this.f2999b += i2;
    }

    /* renamed from: b */
    public final void m3289b(int i) {
        m3281a(0L, 8);
        m3282d(1);
        byte[] bArr = this.f2998a;
        int i2 = this.f2999b;
        this.f2999b = i2 + 1;
        bArr[i2] = 0;
    }

    /* renamed from: b */
    public final byte[] m3290b() {
        int i = this.f2999b;
        byte[] bArr = new byte[i];
        System.arraycopy(this.f2998a, 0, bArr, 0, i);
        return bArr;
    }

    /* renamed from: c */
    public final void m3291c(int i) {
        m3281a(i, 16);
        m3282d(2);
        byte[] bArr = this.f2998a;
        int i2 = this.f2999b;
        this.f2999b = i2 + 1;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        int i3 = this.f2999b;
        this.f2999b = i3 + 1;
        bArr[i3] = (byte) (i & 255);
    }
}
