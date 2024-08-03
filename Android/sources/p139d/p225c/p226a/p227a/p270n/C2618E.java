package p139d.p225c.p226a.p227a.p270n;

import java.util.Arrays;

/* renamed from: d.c.a.a.n.E */
/* loaded from: classes.dex */
public final class C2618E<V> {

    /* renamed from: a */
    private long[] f10909a;

    /* renamed from: b */
    private V[] f10910b;

    /* renamed from: c */
    private int f10911c;

    /* renamed from: d */
    private int f10912d;

    public C2618E() {
        this(10);
    }

    public C2618E(int i) {
        this.f10909a = new long[i];
        this.f10910b = (V[]) m11010a(i);
    }

    /* renamed from: a */
    private V m11009a(long j, boolean z) {
        long j2 = Long.MAX_VALUE;
        V v = null;
        while (this.f10912d > 0) {
            long j3 = j - this.f10909a[this.f10911c];
            if (j3 < 0 && (z || (-j3) >= j2)) {
                break;
            }
            V[] vArr = this.f10910b;
            int i = this.f10911c;
            v = vArr[i];
            vArr[i] = null;
            this.f10911c = (i + 1) % vArr.length;
            this.f10912d--;
            j2 = j3;
        }
        return v;
    }

    /* renamed from: a */
    private static <V> V[] m11010a(int i) {
        return (V[]) new Object[i];
    }

    /* renamed from: b */
    private void m11011b() {
        int length = this.f10910b.length;
        if (this.f10912d < length) {
            return;
        }
        int i = length * 2;
        long[] jArr = new long[i];
        V[] vArr = (V[]) m11010a(i);
        int i2 = this.f10911c;
        int i3 = length - i2;
        System.arraycopy(this.f10909a, i2, jArr, 0, i3);
        System.arraycopy(this.f10910b, this.f10911c, vArr, 0, i3);
        int i4 = this.f10911c;
        if (i4 > 0) {
            System.arraycopy(this.f10909a, 0, jArr, i3, i4);
            System.arraycopy(this.f10910b, 0, vArr, i3, this.f10911c);
        }
        this.f10909a = jArr;
        this.f10910b = vArr;
        this.f10911c = 0;
    }

    /* renamed from: b */
    private void m11012b(long j) {
        if (this.f10912d > 0) {
            if (j <= this.f10909a[((this.f10911c + r0) - 1) % this.f10910b.length]) {
                m11015a();
            }
        }
    }

    /* renamed from: b */
    private void m11013b(long j, V v) {
        int i = this.f10911c;
        int i2 = this.f10912d;
        V[] vArr = this.f10910b;
        int length = (i + i2) % vArr.length;
        this.f10909a[length] = j;
        vArr[length] = v;
        this.f10912d = i2 + 1;
    }

    /* renamed from: a */
    public synchronized V m11014a(long j) {
        return m11009a(j, true);
    }

    /* renamed from: a */
    public synchronized void m11015a() {
        this.f10911c = 0;
        this.f10912d = 0;
        Arrays.fill(this.f10910b, (Object) null);
    }

    /* renamed from: a */
    public synchronized void m11016a(long j, V v) {
        m11012b(j);
        m11011b();
        m11013b(j, v);
    }
}
