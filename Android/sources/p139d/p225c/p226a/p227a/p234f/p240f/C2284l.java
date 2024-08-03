package p139d.p225c.p226a.p227a.p234f.p240f;

import p139d.p225c.p226a.p227a.p270n.C2628e;

/* renamed from: d.c.a.a.f.f.l */
/* loaded from: classes.dex */
final class C2284l {

    /* renamed from: a */
    private final byte[] f8759a;

    /* renamed from: b */
    private final int f8760b;

    /* renamed from: c */
    private int f8761c;

    /* renamed from: d */
    private int f8762d;

    public C2284l(byte[] bArr) {
        this.f8759a = bArr;
        this.f8760b = bArr.length;
    }

    /* renamed from: c */
    private void m9479c() {
        int i;
        int i2 = this.f8761c;
        C2628e.m11113b(i2 >= 0 && (i2 < (i = this.f8760b) || (i2 == i && this.f8762d == 0)));
    }

    /* renamed from: a */
    public int m9480a() {
        return (this.f8761c * 8) + this.f8762d;
    }

    /* renamed from: a */
    public int m9481a(int i) {
        int i2 = this.f8761c;
        int min = Math.min(i, 8 - this.f8762d);
        int i3 = i2 + 1;
        int i4 = ((this.f8759a[i2] & 255) >> this.f8762d) & (255 >> (8 - min));
        while (min < i) {
            i4 |= (this.f8759a[i3] & 255) << min;
            min += 8;
            i3++;
        }
        int i5 = i4 & ((-1) >>> (32 - i));
        m9482b(i);
        return i5;
    }

    /* renamed from: b */
    public void m9482b(int i) {
        int i2 = i / 8;
        this.f8761c += i2;
        this.f8762d += i - (i2 * 8);
        int i3 = this.f8762d;
        if (i3 > 7) {
            this.f8761c++;
            this.f8762d = i3 - 8;
        }
        m9479c();
    }

    /* renamed from: b */
    public boolean m9483b() {
        boolean z = (((this.f8759a[this.f8761c] & 255) >> this.f8762d) & 1) == 1;
        m9482b(1);
        return z;
    }
}
