package com.facebook.react.common;

/* renamed from: com.facebook.react.common.d */
/* loaded from: classes.dex */
public class C1102d {

    /* renamed from: a */
    private long[] f4366a;

    /* renamed from: b */
    private int f4367b = 0;

    private C1102d(int i) {
        this.f4366a = new long[i];
    }

    /* renamed from: a */
    public static C1102d m5168a(int i) {
        return new C1102d(i);
    }

    /* renamed from: b */
    private void m5169b() {
        int i = this.f4367b;
        if (i == this.f4366a.length) {
            double d2 = i;
            Double.isNaN(d2);
            long[] jArr = new long[Math.max(i + 1, (int) (d2 * 1.8d))];
            System.arraycopy(this.f4366a, 0, jArr, 0, this.f4367b);
            this.f4366a = jArr;
        }
    }

    /* renamed from: a */
    public int m5170a() {
        return this.f4367b;
    }

    /* renamed from: a */
    public void m5171a(int i, long j) {
        if (i < this.f4367b) {
            this.f4366a[i] = j;
            return;
        }
        throw new IndexOutOfBoundsException("" + i + " >= " + this.f4367b);
    }

    /* renamed from: a */
    public void m5172a(long j) {
        m5169b();
        long[] jArr = this.f4366a;
        int i = this.f4367b;
        this.f4367b = i + 1;
        jArr[i] = j;
    }

    /* renamed from: b */
    public void m5173b(int i) {
        int i2 = this.f4367b;
        if (i <= i2) {
            this.f4367b = i2 - i;
            return;
        }
        throw new IndexOutOfBoundsException("Trying to drop " + i + " items from array of length " + this.f4367b);
    }

    /* renamed from: c */
    public long m5174c(int i) {
        if (i < this.f4367b) {
            return this.f4366a[i];
        }
        throw new IndexOutOfBoundsException("" + i + " >= " + this.f4367b);
    }
}
