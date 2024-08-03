package p031c.p032a.p092s.p093a;

import java.math.BigInteger;
import p031c.p032a.p094t.C0841d;

/* renamed from: c.a.s.a.b */
/* loaded from: classes.dex */
public class C0825b {

    /* renamed from: a */
    private static final BigInteger f3559a = BigInteger.ONE.shiftLeft(64);

    /* renamed from: b */
    private byte[] f3560b;

    /* renamed from: c */
    private int f3561c = 0;

    /* renamed from: d */
    private int f3562d = -1;

    public C0825b(int i) {
        this.f3560b = new byte[i];
    }

    /* renamed from: a */
    private void m4034a(long j, int i) {
        long j2 = 1 << i;
        if (j < 0 || j > j2) {
            C0841d.m4106c("OutputDataUtil", j + " out of range for " + i + " bit value max:" + j2);
        }
    }

    /* renamed from: c */
    private void m4035c(int i) {
        byte[] bArr = this.f3560b;
        int length = bArr.length;
        int i2 = this.f3561c;
        if (length - i2 >= i) {
            return;
        }
        int length2 = bArr.length * 2;
        if (length2 < i2 + i) {
            length2 = i2 + i;
        }
        byte[] bArr2 = new byte[length2];
        System.arraycopy(this.f3560b, 0, bArr2, 0, this.f3561c);
        this.f3560b = bArr2;
    }

    /* renamed from: a */
    public int m4036a() {
        return this.f3561c;
    }

    /* renamed from: a */
    public void m4037a(int i) {
        m4034a(i, 16);
        m4035c(2);
        byte[] bArr = this.f3560b;
        int i2 = this.f3561c;
        this.f3561c = i2 + 1;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        int i3 = this.f3561c;
        this.f3561c = i3 + 1;
        bArr[i3] = (byte) (i & 255);
    }

    /* renamed from: a */
    public void m4038a(int i, int i2) {
        m4034a(i, 16);
        if (i2 > this.f3561c - 2) {
            throw new IllegalArgumentException("cannot write past end of data");
        }
        byte[] bArr = this.f3560b;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 1] = (byte) (i & 255);
    }

    /* renamed from: a */
    public void m4039a(long j) {
        m4034a(j, 32);
        m4035c(4);
        byte[] bArr = this.f3560b;
        int i = this.f3561c;
        this.f3561c = i + 1;
        bArr[i] = (byte) ((j >>> 24) & 255);
        int i2 = this.f3561c;
        this.f3561c = i2 + 1;
        bArr[i2] = (byte) ((j >>> 16) & 255);
        int i3 = this.f3561c;
        this.f3561c = i3 + 1;
        bArr[i3] = (byte) ((j >>> 8) & 255);
        int i4 = this.f3561c;
        this.f3561c = i4 + 1;
        bArr[i4] = (byte) (j & 255);
    }

    /* renamed from: a */
    public void m4040a(byte[] bArr) {
        m4037a(bArr.length);
        m4041a(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public void m4041a(byte[] bArr, int i, int i2) {
        m4035c(i2);
        System.arraycopy(bArr, i, this.f3560b, this.f3561c, i2);
        this.f3561c += i2;
    }

    /* renamed from: b */
    public void m4042b(int i) {
        m4034a(i, 8);
        m4035c(1);
        byte[] bArr = this.f3560b;
        int i2 = this.f3561c;
        this.f3561c = i2 + 1;
        bArr[i2] = (byte) (i & 255);
    }

    /* renamed from: b */
    public void m4043b(long j) {
        m4035c(8);
        byte[] bArr = this.f3560b;
        int i = this.f3561c;
        this.f3561c = i + 1;
        bArr[i] = (byte) ((j >>> 56) & 255);
        int i2 = this.f3561c;
        this.f3561c = i2 + 1;
        bArr[i2] = (byte) ((j >>> 48) & 255);
        int i3 = this.f3561c;
        this.f3561c = i3 + 1;
        bArr[i3] = (byte) ((j >>> 40) & 255);
        int i4 = this.f3561c;
        this.f3561c = i4 + 1;
        bArr[i4] = (byte) ((j >>> 32) & 255);
        int i5 = this.f3561c;
        this.f3561c = i5 + 1;
        bArr[i5] = (byte) ((j >>> 24) & 255);
        int i6 = this.f3561c;
        this.f3561c = i6 + 1;
        bArr[i6] = (byte) ((j >>> 16) & 255);
        int i7 = this.f3561c;
        this.f3561c = i7 + 1;
        bArr[i7] = (byte) ((j >>> 8) & 255);
        int i8 = this.f3561c;
        this.f3561c = i8 + 1;
        bArr[i8] = (byte) (j & 255);
    }

    /* renamed from: b */
    public byte[] m4044b() {
        int i = this.f3561c;
        byte[] bArr = new byte[i];
        System.arraycopy(this.f3560b, 0, bArr, 0, i);
        return bArr;
    }
}
