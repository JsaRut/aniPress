package p139d.p225c.p226a.p227a.p229b;

import java.nio.ShortBuffer;
import java.util.Arrays;
import p139d.p225c.p226a.p227a.p270n.C2628e;

/* renamed from: d.c.a.a.b.E */
/* loaded from: classes.dex */
final class C2160E {

    /* renamed from: a */
    private final int f7780a;

    /* renamed from: b */
    private final int f7781b;

    /* renamed from: c */
    private final float f7782c;

    /* renamed from: d */
    private final float f7783d;

    /* renamed from: e */
    private final float f7784e;

    /* renamed from: f */
    private final int f7785f;

    /* renamed from: g */
    private final int f7786g;

    /* renamed from: h */
    private final int f7787h;

    /* renamed from: i */
    private final short[] f7788i;

    /* renamed from: j */
    private short[] f7789j;

    /* renamed from: k */
    private int f7790k;

    /* renamed from: l */
    private short[] f7791l;

    /* renamed from: m */
    private int f7792m;

    /* renamed from: n */
    private short[] f7793n;

    /* renamed from: o */
    private int f7794o;

    /* renamed from: p */
    private int f7795p;

    /* renamed from: q */
    private int f7796q;

    /* renamed from: r */
    private int f7797r;

    /* renamed from: s */
    private int f7798s;

    /* renamed from: t */
    private int f7799t;

    /* renamed from: u */
    private int f7800u;

    /* renamed from: v */
    private int f7801v;

    public C2160E(int i, int i2, float f, float f2, int i3) {
        this.f7780a = i;
        this.f7781b = i2;
        this.f7782c = f;
        this.f7783d = f2;
        this.f7784e = i / i3;
        this.f7785f = i / 400;
        this.f7786g = i / 65;
        this.f7787h = this.f7786g * 2;
        int i4 = this.f7787h;
        this.f7788i = new short[i4];
        this.f7789j = new short[i4 * i2];
        this.f7791l = new short[i4 * i2];
        this.f7793n = new short[i4 * i2];
    }

    /* renamed from: a */
    private int m8818a(int i) {
        int min = Math.min(this.f7787h, this.f7797r);
        m8825a(this.f7789j, i, min);
        this.f7797r -= min;
        return min;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005a  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int m8819a(short[] r7, int r8) {
        /*
            r6 = this;
            int r0 = r6.f7780a
            r1 = 4000(0xfa0, float:5.605E-42)
            r2 = 1
            if (r0 <= r1) goto L9
            int r0 = r0 / r1
            goto La
        L9:
            r0 = 1
        La:
            int r1 = r6.f7781b
            if (r1 != r2) goto L19
            if (r0 != r2) goto L19
            int r0 = r6.f7785f
            int r1 = r6.f7786g
        L14:
            int r7 = r6.m8821a(r7, r8, r0, r1)
            goto L4d
        L19:
            r6.m8830b(r7, r8, r0)
            short[] r1 = r6.f7788i
            int r3 = r6.f7785f
            int r3 = r3 / r0
            int r4 = r6.f7786g
            int r4 = r4 / r0
            r5 = 0
            int r1 = r6.m8821a(r1, r5, r3, r4)
            if (r0 == r2) goto L4c
            int r1 = r1 * r0
            int r0 = r0 * 4
            int r3 = r1 - r0
            int r1 = r1 + r0
            int r0 = r6.f7785f
            if (r3 >= r0) goto L37
            goto L38
        L37:
            r0 = r3
        L38:
            int r3 = r6.f7786g
            if (r1 <= r3) goto L3d
            r1 = r3
        L3d:
            int r3 = r6.f7781b
            if (r3 != r2) goto L42
            goto L14
        L42:
            r6.m8830b(r7, r8, r2)
            short[] r7 = r6.f7788i
            int r7 = r6.m8821a(r7, r5, r0, r1)
            goto L4d
        L4c:
            r7 = r1
        L4d:
            int r8 = r6.f7800u
            int r0 = r6.f7801v
            boolean r8 = r6.m8826a(r8, r0)
            if (r8 == 0) goto L5a
            int r8 = r6.f7798s
            goto L5b
        L5a:
            r8 = r7
        L5b:
            int r0 = r6.f7800u
            r6.f7799t = r0
            r6.f7798s = r7
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p139d.p225c.p226a.p227a.p229b.C2160E.m8819a(short[], int):int");
    }

    /* renamed from: a */
    private int m8820a(short[] sArr, int i, float f, int i2) {
        int i3;
        if (f < 0.5f) {
            i3 = (int) ((i2 * f) / (1.0f - f));
        } else {
            this.f7797r = (int) ((i2 * ((2.0f * f) - 1.0f)) / (1.0f - f));
            i3 = i2;
        }
        int i4 = i2 + i3;
        this.f7791l = m8832c(this.f7791l, this.f7792m, i4);
        int i5 = this.f7781b;
        System.arraycopy(sArr, i * i5, this.f7791l, this.f7792m * i5, i5 * i2);
        m8824a(i3, this.f7781b, this.f7791l, this.f7792m + i2, sArr, i + i2, sArr, i);
        this.f7792m += i4;
        return i3;
    }

    /* renamed from: a */
    private int m8821a(short[] sArr, int i, int i2, int i3) {
        int i4 = i * this.f7781b;
        int i5 = 1;
        int i6 = 0;
        int i7 = 0;
        int i8 = 255;
        while (i2 <= i3) {
            int i9 = 0;
            for (int i10 = 0; i10 < i2; i10++) {
                i9 += Math.abs(sArr[i4 + i10] - sArr[(i4 + i2) + i10]);
            }
            if (i9 * i6 < i5 * i2) {
                i6 = i2;
                i5 = i9;
            }
            if (i9 * i8 > i7 * i2) {
                i8 = i2;
                i7 = i9;
            }
            i2++;
        }
        this.f7800u = i5 / i6;
        this.f7801v = i7 / i8;
        return i6;
    }

    /* renamed from: a */
    private void m8822a(float f) {
        int m8827b;
        int i = this.f7790k;
        if (i < this.f7787h) {
            return;
        }
        int i2 = 0;
        do {
            if (this.f7797r > 0) {
                m8827b = m8818a(i2);
            } else {
                int m8819a = m8819a(this.f7789j, i2);
                m8827b = ((double) f) > 1.0d ? m8819a + m8827b(this.f7789j, i2, f, m8819a) : m8820a(this.f7789j, i2, f, m8819a);
            }
            i2 += m8827b;
        } while (this.f7787h + i2 <= i);
        m8834d(i2);
    }

    /* renamed from: a */
    private void m8823a(float f, int i) {
        int i2;
        int i3;
        if (this.f7792m == i) {
            return;
        }
        int i4 = this.f7780a;
        int i5 = (int) (i4 / f);
        while (true) {
            if (i5 <= 16384 && i4 <= 16384) {
                break;
            }
            i5 /= 2;
            i4 /= 2;
        }
        m8829b(i);
        int i6 = 0;
        while (true) {
            int i7 = this.f7794o;
            if (i6 >= i7 - 1) {
                m8831c(i7 - 1);
                return;
            }
            while (true) {
                i2 = this.f7795p;
                int i8 = (i2 + 1) * i5;
                i3 = this.f7796q;
                if (i8 <= i3 * i4) {
                    break;
                }
                this.f7791l = m8832c(this.f7791l, this.f7792m, 1);
                int i9 = 0;
                while (true) {
                    int i10 = this.f7781b;
                    if (i9 < i10) {
                        this.f7791l[(this.f7792m * i10) + i9] = m8828b(this.f7793n, (i10 * i6) + i9, i4, i5);
                        i9++;
                    }
                }
                this.f7796q++;
                this.f7792m++;
            }
            this.f7795p = i2 + 1;
            if (this.f7795p == i4) {
                this.f7795p = 0;
                C2628e.m11113b(i3 == i5);
                this.f7796q = 0;
            }
            i6++;
        }
    }

    /* renamed from: a */
    private static void m8824a(int i, int i2, short[] sArr, int i3, short[] sArr2, int i4, short[] sArr3, int i5) {
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (i4 * i2) + i6;
            int i8 = (i5 * i2) + i6;
            int i9 = (i3 * i2) + i6;
            for (int i10 = 0; i10 < i; i10++) {
                sArr[i9] = (short) (((sArr2[i7] * (i - i10)) + (sArr3[i8] * i10)) / i);
                i9 += i2;
                i7 += i2;
                i8 += i2;
            }
        }
    }

    /* renamed from: a */
    private void m8825a(short[] sArr, int i, int i2) {
        this.f7791l = m8832c(this.f7791l, this.f7792m, i2);
        int i3 = this.f7781b;
        System.arraycopy(sArr, i * i3, this.f7791l, this.f7792m * i3, i3 * i2);
        this.f7792m += i2;
    }

    /* renamed from: a */
    private boolean m8826a(int i, int i2) {
        return i != 0 && this.f7798s != 0 && i2 <= i * 3 && i * 2 > this.f7799t * 3;
    }

    /* renamed from: b */
    private int m8827b(short[] sArr, int i, float f, int i2) {
        int i3;
        if (f >= 2.0f) {
            i3 = (int) (i2 / (f - 1.0f));
        } else {
            this.f7797r = (int) ((i2 * (2.0f - f)) / (f - 1.0f));
            i3 = i2;
        }
        this.f7791l = m8832c(this.f7791l, this.f7792m, i3);
        m8824a(i3, this.f7781b, this.f7791l, this.f7792m, sArr, i, sArr, i + i2);
        this.f7792m += i3;
        return i3;
    }

    /* renamed from: b */
    private short m8828b(short[] sArr, int i, int i2, int i3) {
        short s = sArr[i];
        short s2 = sArr[i + this.f7781b];
        int i4 = this.f7796q * i2;
        int i5 = this.f7795p;
        int i6 = i5 * i3;
        int i7 = (i5 + 1) * i3;
        int i8 = i7 - i4;
        int i9 = i7 - i6;
        return (short) (((s * i8) + ((i9 - i8) * s2)) / i9);
    }

    /* renamed from: b */
    private void m8829b(int i) {
        int i2 = this.f7792m - i;
        this.f7793n = m8832c(this.f7793n, this.f7794o, i2);
        short[] sArr = this.f7791l;
        int i3 = this.f7781b;
        System.arraycopy(sArr, i * i3, this.f7793n, this.f7794o * i3, i3 * i2);
        this.f7792m = i;
        this.f7794o += i2;
    }

    /* renamed from: b */
    private void m8830b(short[] sArr, int i, int i2) {
        int i3 = this.f7787h / i2;
        int i4 = this.f7781b;
        int i5 = i2 * i4;
        int i6 = i * i4;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = 0;
            for (int i9 = 0; i9 < i5; i9++) {
                i8 += sArr[(i7 * i5) + i6 + i9];
            }
            this.f7788i[i7] = (short) (i8 / i5);
        }
    }

    /* renamed from: c */
    private void m8831c(int i) {
        if (i == 0) {
            return;
        }
        short[] sArr = this.f7793n;
        int i2 = this.f7781b;
        System.arraycopy(sArr, i * i2, sArr, 0, (this.f7794o - i) * i2);
        this.f7794o -= i;
    }

    /* renamed from: c */
    private short[] m8832c(short[] sArr, int i, int i2) {
        int length = sArr.length;
        int i3 = this.f7781b;
        int i4 = length / i3;
        return i + i2 <= i4 ? sArr : Arrays.copyOf(sArr, (((i4 * 3) / 2) + i2) * i3);
    }

    /* renamed from: d */
    private void m8833d() {
        int i = this.f7792m;
        float f = this.f7782c;
        float f2 = this.f7783d;
        float f3 = f / f2;
        float f4 = this.f7784e * f2;
        double d2 = f3;
        if (d2 > 1.00001d || d2 < 0.99999d) {
            m8822a(f3);
        } else {
            m8825a(this.f7789j, 0, this.f7790k);
            this.f7790k = 0;
        }
        if (f4 != 1.0f) {
            m8823a(f4, i);
        }
    }

    /* renamed from: d */
    private void m8834d(int i) {
        int i2 = this.f7790k - i;
        short[] sArr = this.f7789j;
        int i3 = this.f7781b;
        System.arraycopy(sArr, i * i3, sArr, 0, i3 * i2);
        this.f7790k = i2;
    }

    /* renamed from: a */
    public void m8835a() {
        this.f7790k = 0;
        this.f7792m = 0;
        this.f7794o = 0;
        this.f7795p = 0;
        this.f7796q = 0;
        this.f7797r = 0;
        this.f7798s = 0;
        this.f7799t = 0;
        this.f7800u = 0;
        this.f7801v = 0;
    }

    /* renamed from: a */
    public void m8836a(ShortBuffer shortBuffer) {
        int min = Math.min(shortBuffer.remaining() / this.f7781b, this.f7792m);
        shortBuffer.put(this.f7791l, 0, this.f7781b * min);
        this.f7792m -= min;
        short[] sArr = this.f7791l;
        int i = this.f7781b;
        System.arraycopy(sArr, min * i, sArr, 0, this.f7792m * i);
    }

    /* renamed from: b */
    public int m8837b() {
        return this.f7792m;
    }

    /* renamed from: b */
    public void m8838b(ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining();
        int i = this.f7781b;
        int i2 = remaining / i;
        this.f7789j = m8832c(this.f7789j, this.f7790k, i2);
        shortBuffer.get(this.f7789j, this.f7790k * this.f7781b, ((i * i2) * 2) / 2);
        this.f7790k += i2;
        m8833d();
    }

    /* renamed from: c */
    public void m8839c() {
        int i;
        int i2 = this.f7790k;
        float f = this.f7782c;
        float f2 = this.f7783d;
        int i3 = this.f7792m + ((int) ((((i2 / (f / f2)) + this.f7794o) / (this.f7784e * f2)) + 0.5f));
        this.f7789j = m8832c(this.f7789j, i2, (this.f7787h * 2) + i2);
        int i4 = 0;
        while (true) {
            i = this.f7787h;
            int i5 = this.f7781b;
            if (i4 >= i * 2 * i5) {
                break;
            }
            this.f7789j[(i5 * i2) + i4] = 0;
            i4++;
        }
        this.f7790k += i * 2;
        m8833d();
        if (this.f7792m > i3) {
            this.f7792m = i3;
        }
        this.f7790k = 0;
        this.f7797r = 0;
        this.f7794o = 0;
    }
}
