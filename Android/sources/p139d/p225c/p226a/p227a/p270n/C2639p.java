package p139d.p225c.p226a.p227a.p270n;

import java.util.Arrays;

/* renamed from: d.c.a.a.n.p */
/* loaded from: classes.dex */
public final class C2639p {

    /* renamed from: a */
    private int f10974a;

    /* renamed from: b */
    private long[] f10975b;

    public C2639p() {
        this(32);
    }

    public C2639p(int i) {
        this.f10975b = new long[i];
    }

    /* renamed from: a */
    public int m11161a() {
        return this.f10974a;
    }

    /* renamed from: a */
    public long m11162a(int i) {
        if (i >= 0 && i < this.f10974a) {
            return this.f10975b[i];
        }
        throw new IndexOutOfBoundsException("Invalid index " + i + ", size is " + this.f10974a);
    }

    /* renamed from: a */
    public void m11163a(long j) {
        int i = this.f10974a;
        long[] jArr = this.f10975b;
        if (i == jArr.length) {
            this.f10975b = Arrays.copyOf(jArr, i * 2);
        }
        long[] jArr2 = this.f10975b;
        int i2 = this.f10974a;
        this.f10974a = i2 + 1;
        jArr2[i2] = j;
    }

    /* renamed from: b */
    public long[] m11164b() {
        return Arrays.copyOf(this.f10975b, this.f10974a);
    }
}
