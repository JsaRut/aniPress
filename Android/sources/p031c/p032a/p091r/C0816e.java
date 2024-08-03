package p031c.p032a.p091r;

import java.math.BigInteger;
import p031c.p032a.p066j.C0675a;

/* renamed from: c.a.r.e */
/* loaded from: classes.dex */
public final class C0816e {

    /* renamed from: a */
    private static final BigInteger f3551a = BigInteger.ONE.shiftLeft(64);

    /* renamed from: b */
    private byte[] f3552b;

    /* renamed from: c */
    private int f3553c = 0;

    /* renamed from: d */
    private int f3554d = -1;

    public C0816e(int i) {
        this.f3552b = new byte[i];
    }

    /* renamed from: a */
    private static void m3970a(long j, int i) {
        long j2 = 1 << i;
        if (j < 0 || j > j2) {
            C0675a.m3475g("Outputer", j + " out of range for " + i + " bit value max:" + j2);
        }
    }

    /* renamed from: a */
    private void m3971a(byte[] bArr, int i, int i2) {
        m3972c(i2);
        System.arraycopy(bArr, 0, this.f3552b, this.f3553c, i2);
        this.f3553c += i2;
    }

    /* renamed from: c */
    private void m3972c(int i) {
        byte[] bArr = this.f3552b;
        int length = bArr.length;
        int i2 = this.f3553c;
        if (length - i2 >= i) {
            return;
        }
        int length2 = bArr.length * 2;
        if (length2 < i2 + i) {
            length2 = i2 + i;
        }
        byte[] bArr2 = new byte[length2];
        System.arraycopy(this.f3552b, 0, bArr2, 0, this.f3553c);
        this.f3552b = bArr2;
    }

    /* renamed from: a */
    public final int m3973a() {
        return this.f3553c;
    }

    /* renamed from: a */
    public final void m3974a(int i) {
        m3970a(i, 8);
        m3972c(1);
        byte[] bArr = this.f3552b;
        int i2 = this.f3553c;
        this.f3553c = i2 + 1;
        bArr[i2] = (byte) (i & 255);
    }

    /* renamed from: a */
    public final void m3975a(int i, int i2) {
        m3970a(i, 8);
        if (4 > this.f3553c - 1) {
            throw new IllegalArgumentException("cannot write past end of data");
        }
        this.f3552b[4] = (byte) (i & 255);
    }

    /* renamed from: a */
    public final void m3976a(long j) {
        m3970a(j, 32);
        m3972c(4);
        byte[] bArr = this.f3552b;
        int i = this.f3553c;
        this.f3553c = i + 1;
        bArr[i] = (byte) ((j >>> 24) & 255);
        int i2 = this.f3553c;
        this.f3553c = i2 + 1;
        bArr[i2] = (byte) ((j >>> 16) & 255);
        int i3 = this.f3553c;
        this.f3553c = i3 + 1;
        bArr[i3] = (byte) ((j >>> 8) & 255);
        int i4 = this.f3553c;
        this.f3553c = i4 + 1;
        bArr[i4] = (byte) (j & 255);
    }

    /* renamed from: a */
    public final void m3977a(String str) {
        byte[] m4000j = C0819h.m4000j(str);
        m3979b(m4000j.length);
        m3971a(m4000j, 0, m4000j.length);
    }

    /* renamed from: a */
    public final void m3978a(byte[] bArr) {
        m3971a(bArr, 0, bArr.length);
    }

    /* renamed from: b */
    public final void m3979b(int i) {
        m3970a(i, 16);
        m3972c(2);
        byte[] bArr = this.f3552b;
        int i2 = this.f3553c;
        this.f3553c = i2 + 1;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        int i3 = this.f3553c;
        this.f3553c = i3 + 1;
        bArr[i3] = (byte) (i & 255);
    }

    /* renamed from: b */
    public final void m3980b(int i, int i2) {
        m3970a(i, 16);
        if (this.f3553c - 2 < 0) {
            throw new IllegalArgumentException("cannot write past end of data");
        }
        byte[] bArr = this.f3552b;
        bArr[0] = (byte) ((i >>> 8) & 255);
        bArr[1] = (byte) (i & 255);
    }

    /* renamed from: b */
    public final void m3981b(long j) {
        m3972c(8);
        byte[] bArr = this.f3552b;
        int i = this.f3553c;
        this.f3553c = i + 1;
        bArr[i] = (byte) ((j >>> 56) & 255);
        int i2 = this.f3553c;
        this.f3553c = i2 + 1;
        bArr[i2] = (byte) ((j >>> 48) & 255);
        int i3 = this.f3553c;
        this.f3553c = i3 + 1;
        bArr[i3] = (byte) ((j >>> 40) & 255);
        int i4 = this.f3553c;
        this.f3553c = i4 + 1;
        bArr[i4] = (byte) ((j >>> 32) & 255);
        int i5 = this.f3553c;
        this.f3553c = i5 + 1;
        bArr[i5] = (byte) ((j >>> 24) & 255);
        int i6 = this.f3553c;
        this.f3553c = i6 + 1;
        bArr[i6] = (byte) ((j >>> 16) & 255);
        int i7 = this.f3553c;
        this.f3553c = i7 + 1;
        bArr[i7] = (byte) ((j >>> 8) & 255);
        int i8 = this.f3553c;
        this.f3553c = i8 + 1;
        bArr[i8] = (byte) (j & 255);
    }

    /* renamed from: b */
    public final byte[] m3982b() {
        int i = this.f3553c;
        byte[] bArr = new byte[i];
        System.arraycopy(this.f3552b, 0, bArr, 0, i);
        return bArr;
    }
}
