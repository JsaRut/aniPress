package p031c.p101b.p102a.p111i;

import java.math.BigInteger;
import p031c.p101b.p102a.p114l.C0923b;

/* renamed from: c.b.a.i.e */
/* loaded from: classes.dex */
public class C0914e {

    /* renamed from: a */
    private static final BigInteger f3895a = BigInteger.ONE.shiftLeft(64);

    /* renamed from: b */
    private byte[] f3896b;

    /* renamed from: c */
    private int f3897c = 0;

    /* renamed from: d */
    private int f3898d = -1;

    public C0914e(int i) {
        this.f3896b = new byte[i];
    }

    /* renamed from: a */
    private void m4549a(long j, int i) {
        long j2 = 1 << i;
        if (j < 0 || j > j2) {
            C0923b.m4653i("OutputDataUtil", j + " out of range for " + i + " bit value max:" + j2);
        }
    }

    /* renamed from: c */
    private void m4550c(int i) {
        byte[] bArr = this.f3896b;
        int length = bArr.length;
        int i2 = this.f3897c;
        if (length - i2 >= i) {
            return;
        }
        int length2 = bArr.length * 2;
        if (length2 < i2 + i) {
            length2 = i2 + i;
        }
        byte[] bArr2 = new byte[length2];
        System.arraycopy(this.f3896b, 0, bArr2, 0, this.f3897c);
        this.f3896b = bArr2;
    }

    /* renamed from: a */
    public void m4551a(int i) {
        m4549a(i, 8);
        m4550c(1);
        byte[] bArr = this.f3896b;
        int i2 = this.f3897c;
        this.f3897c = i2 + 1;
        bArr[i2] = (byte) (i & 255);
    }

    /* renamed from: a */
    public void m4552a(long j) {
        m4550c(8);
        byte[] bArr = this.f3896b;
        int i = this.f3897c;
        this.f3897c = i + 1;
        bArr[i] = (byte) ((j >>> 56) & 255);
        int i2 = this.f3897c;
        this.f3897c = i2 + 1;
        bArr[i2] = (byte) ((j >>> 48) & 255);
        int i3 = this.f3897c;
        this.f3897c = i3 + 1;
        bArr[i3] = (byte) ((j >>> 40) & 255);
        int i4 = this.f3897c;
        this.f3897c = i4 + 1;
        bArr[i4] = (byte) ((j >>> 32) & 255);
        int i5 = this.f3897c;
        this.f3897c = i5 + 1;
        bArr[i5] = (byte) ((j >>> 24) & 255);
        int i6 = this.f3897c;
        this.f3897c = i6 + 1;
        bArr[i6] = (byte) ((j >>> 16) & 255);
        int i7 = this.f3897c;
        this.f3897c = i7 + 1;
        bArr[i7] = (byte) ((j >>> 8) & 255);
        int i8 = this.f3897c;
        this.f3897c = i8 + 1;
        bArr[i8] = (byte) (j & 255);
    }

    /* renamed from: a */
    public void m4553a(byte[] bArr) {
        m4556b(bArr.length);
        m4554a(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public void m4554a(byte[] bArr, int i, int i2) {
        m4550c(i2);
        System.arraycopy(bArr, i, this.f3896b, this.f3897c, i2);
        this.f3897c += i2;
    }

    /* renamed from: a */
    public byte[] m4555a() {
        int i = this.f3897c;
        byte[] bArr = new byte[i];
        System.arraycopy(this.f3896b, 0, bArr, 0, i);
        return bArr;
    }

    /* renamed from: b */
    public void m4556b(int i) {
        m4549a(i, 16);
        m4550c(2);
        byte[] bArr = this.f3896b;
        int i2 = this.f3897c;
        this.f3897c = i2 + 1;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        int i3 = this.f3897c;
        this.f3897c = i3 + 1;
        bArr[i3] = (byte) (i & 255);
    }
}
