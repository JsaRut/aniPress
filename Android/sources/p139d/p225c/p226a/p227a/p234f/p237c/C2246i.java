package p139d.p225c.p226a.p227a.p234f.p237c;

import p139d.p225c.p226a.p227a.p234f.InterfaceC2289h;

/* renamed from: d.c.a.a.f.c.i */
/* loaded from: classes.dex */
final class C2246i {

    /* renamed from: a */
    private static final long[] f8345a = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: b */
    private final byte[] f8346b = new byte[8];

    /* renamed from: c */
    private int f8347c;

    /* renamed from: d */
    private int f8348d;

    /* renamed from: a */
    public static int m9263a(int i) {
        int i2 = 0;
        while (true) {
            long[] jArr = f8345a;
            if (i2 >= jArr.length) {
                return -1;
            }
            if ((jArr[i2] & i) != 0) {
                return i2 + 1;
            }
            i2++;
        }
    }

    /* renamed from: a */
    public static long m9264a(byte[] bArr, int i, boolean z) {
        long j = bArr[0] & 255;
        if (z) {
            j &= f8345a[i - 1] ^ (-1);
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (bArr[i2] & 255);
        }
        return j;
    }

    /* renamed from: a */
    public int m9265a() {
        return this.f8348d;
    }

    /* renamed from: a */
    public long m9266a(InterfaceC2289h interfaceC2289h, boolean z, boolean z2, int i) {
        if (this.f8347c == 0) {
            if (!interfaceC2289h.mo9278a(this.f8346b, 0, 1, z)) {
                return -1L;
            }
            this.f8348d = m9263a(this.f8346b[0] & 255);
            if (this.f8348d == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f8347c = 1;
        }
        int i2 = this.f8348d;
        if (i2 > i) {
            this.f8347c = 0;
            return -2L;
        }
        if (i2 != 1) {
            interfaceC2289h.readFully(this.f8346b, 1, i2 - 1);
        }
        this.f8347c = 0;
        return m9264a(this.f8346b, this.f8348d, z2);
    }

    /* renamed from: b */
    public void m9267b() {
        this.f8347c = 0;
        this.f8348d = 0;
    }
}
