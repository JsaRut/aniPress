package p031c.p032a.p050Q;

import java.math.BigInteger;
import p031c.p032a.p066j.C0675a;

/* renamed from: c.a.Q.a */
/* loaded from: classes.dex */
public final class C0558a {

    /* renamed from: a */
    private static final BigInteger f2708a = BigInteger.ONE.shiftLeft(64);

    /* renamed from: b */
    private byte[] f2709b;

    /* renamed from: c */
    private int f2710c = 0;

    /* renamed from: d */
    private int f2711d = -1;

    public C0558a(int i) {
        this.f2709b = new byte[i];
    }

    /* renamed from: b */
    private void m2925b(int i) {
        byte[] bArr = this.f2709b;
        int length = bArr.length;
        int i2 = this.f2710c;
        if (length - i2 >= i) {
            return;
        }
        int length2 = bArr.length * 2;
        if (length2 < i2 + i) {
            length2 = i2 + i;
        }
        byte[] bArr2 = new byte[length2];
        System.arraycopy(this.f2709b, 0, bArr2, 0, this.f2710c);
        this.f2709b = bArr2;
    }

    /* renamed from: a */
    public final void m2926a(int i) {
        long j = i;
        if (j < 0 || j > 65536) {
            C0675a.m3475g("JCommonPackager", j + " out of range for 16 bit value max:65536");
        }
        m2925b(2);
        byte[] bArr = this.f2709b;
        int i2 = this.f2710c;
        this.f2710c = i2 + 1;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        int i3 = this.f2710c;
        this.f2710c = i3 + 1;
        bArr[i3] = (byte) (i & 255);
    }

    /* renamed from: a */
    public final void m2927a(long j) {
        m2925b(8);
        byte[] bArr = this.f2709b;
        int i = this.f2710c;
        this.f2710c = i + 1;
        bArr[i] = (byte) ((j >>> 56) & 255);
        int i2 = this.f2710c;
        this.f2710c = i2 + 1;
        bArr[i2] = (byte) ((j >>> 48) & 255);
        int i3 = this.f2710c;
        this.f2710c = i3 + 1;
        bArr[i3] = (byte) ((j >>> 40) & 255);
        int i4 = this.f2710c;
        this.f2710c = i4 + 1;
        bArr[i4] = (byte) ((j >>> 32) & 255);
        int i5 = this.f2710c;
        this.f2710c = i5 + 1;
        bArr[i5] = (byte) ((j >>> 24) & 255);
        int i6 = this.f2710c;
        this.f2710c = i6 + 1;
        bArr[i6] = (byte) ((j >>> 16) & 255);
        int i7 = this.f2710c;
        this.f2710c = i7 + 1;
        bArr[i7] = (byte) ((j >>> 8) & 255);
        int i8 = this.f2710c;
        this.f2710c = i8 + 1;
        bArr[i8] = (byte) (j & 255);
    }

    /* renamed from: a */
    public final void m2928a(byte[] bArr, int i, int i2) {
        m2925b(i2);
        System.arraycopy(bArr, 0, this.f2709b, this.f2710c, i2);
        this.f2710c += i2;
    }

    /* renamed from: a */
    public final byte[] m2929a() {
        int i = this.f2710c;
        byte[] bArr = new byte[i];
        System.arraycopy(this.f2709b, 0, bArr, 0, i);
        return bArr;
    }
}
