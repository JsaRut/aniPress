package p275e;

import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: e.B */
/* loaded from: classes.dex */
public final class C2707B extends C2722j {

    /* renamed from: f */
    final transient byte[][] f11377f;

    /* renamed from: g */
    final transient int[] f11378g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2707B(C2719g c2719g, int i) {
        super(null);
        C2712G.m11661a(c2719g.f11390c, 0L, i);
        int i2 = 0;
        C2738z c2738z = c2719g.f11389b;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            int i5 = c2738z.f11439c;
            int i6 = c2738z.f11438b;
            if (i5 == i6) {
                throw new AssertionError("s.limit == s.pos");
            }
            i3 += i5 - i6;
            i4++;
            c2738z = c2738z.f11442f;
        }
        this.f11377f = new byte[i4];
        this.f11378g = new int[i4 * 2];
        C2738z c2738z2 = c2719g.f11389b;
        int i7 = 0;
        while (i2 < i) {
            this.f11377f[i7] = c2738z2.f11437a;
            i2 += c2738z2.f11439c - c2738z2.f11438b;
            if (i2 > i) {
                i2 = i;
            }
            int[] iArr = this.f11378g;
            iArr[i7] = i2;
            iArr[this.f11377f.length + i7] = c2738z2.f11438b;
            c2738z2.f11440d = true;
            i7++;
            c2738z2 = c2738z2.f11442f;
        }
    }

    /* renamed from: b */
    private int m11642b(int i) {
        int binarySearch = Arrays.binarySearch(this.f11378g, 0, this.f11377f.length, i + 1);
        return binarySearch >= 0 ? binarySearch : binarySearch ^ (-1);
    }

    /* renamed from: l */
    private C2722j m11643l() {
        return new C2722j(mo11657j());
    }

    @Override // p275e.C2722j
    /* renamed from: a */
    public byte mo11644a(int i) {
        C2712G.m11661a(this.f11378g[this.f11377f.length - 1], i, 1L);
        int m11642b = m11642b(i);
        int i2 = m11642b == 0 ? 0 : this.f11378g[m11642b - 1];
        int[] iArr = this.f11378g;
        byte[][] bArr = this.f11377f;
        return bArr[m11642b][(i - i2) + iArr[bArr.length + m11642b]];
    }

    @Override // p275e.C2722j
    /* renamed from: a */
    public C2722j mo11645a(int i, int i2) {
        return m11643l().mo11645a(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p275e.C2722j
    /* renamed from: a */
    public void mo11646a(C2719g c2719g) {
        int length = this.f11377f.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.f11378g;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            C2738z c2738z = new C2738z(this.f11377f[i], i3, (i3 + i4) - i2, true, false);
            C2738z c2738z2 = c2719g.f11389b;
            if (c2738z2 == null) {
                c2738z.f11443g = c2738z;
                c2738z.f11442f = c2738z;
                c2719g.f11389b = c2738z;
            } else {
                c2738z2.f11443g.m11756a(c2738z);
            }
            i++;
            i2 = i4;
        }
        c2719g.f11390c += i2;
    }

    @Override // p275e.C2722j
    /* renamed from: a */
    public boolean mo11647a(int i, C2722j c2722j, int i2, int i3) {
        if (i < 0 || i > mo11655h() - i3) {
            return false;
        }
        int m11642b = m11642b(i);
        while (i3 > 0) {
            int i4 = m11642b == 0 ? 0 : this.f11378g[m11642b - 1];
            int min = Math.min(i3, ((this.f11378g[m11642b] - i4) + i4) - i);
            int[] iArr = this.f11378g;
            byte[][] bArr = this.f11377f;
            if (!c2722j.mo11648a(i2, bArr[m11642b], (i - i4) + iArr[bArr.length + m11642b], min)) {
                return false;
            }
            i += min;
            i2 += min;
            i3 -= min;
            m11642b++;
        }
        return true;
    }

    @Override // p275e.C2722j
    /* renamed from: a */
    public boolean mo11648a(int i, byte[] bArr, int i2, int i3) {
        if (i < 0 || i > mo11655h() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int m11642b = m11642b(i);
        while (i3 > 0) {
            int i4 = m11642b == 0 ? 0 : this.f11378g[m11642b - 1];
            int min = Math.min(i3, ((this.f11378g[m11642b] - i4) + i4) - i);
            int[] iArr = this.f11378g;
            byte[][] bArr2 = this.f11377f;
            if (!C2712G.m11663a(bArr2[m11642b], (i - i4) + iArr[bArr2.length + m11642b], bArr, i2, min)) {
                return false;
            }
            i += min;
            i2 += min;
            i3 -= min;
            m11642b++;
        }
        return true;
    }

    @Override // p275e.C2722j
    /* renamed from: b */
    public String mo11649b() {
        return m11643l().mo11649b();
    }

    @Override // p275e.C2722j
    /* renamed from: c */
    public String mo11650c() {
        return m11643l().mo11650c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p275e.C2722j
    /* renamed from: d */
    public byte[] mo11651d() {
        return mo11657j();
    }

    @Override // p275e.C2722j
    /* renamed from: e */
    public C2722j mo11652e() {
        return m11643l().mo11652e();
    }

    @Override // p275e.C2722j
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2722j) {
            C2722j c2722j = (C2722j) obj;
            if (c2722j.mo11655h() == mo11655h() && mo11647a(0, c2722j, 0, mo11655h())) {
                return true;
            }
        }
        return false;
    }

    @Override // p275e.C2722j
    /* renamed from: f */
    public C2722j mo11653f() {
        return m11643l().mo11653f();
    }

    @Override // p275e.C2722j
    /* renamed from: g */
    public C2722j mo11654g() {
        return m11643l().mo11654g();
    }

    @Override // p275e.C2722j
    /* renamed from: h */
    public int mo11655h() {
        return this.f11378g[this.f11377f.length - 1];
    }

    @Override // p275e.C2722j
    public int hashCode() {
        int i = this.f11401d;
        if (i != 0) {
            return i;
        }
        int length = this.f11377f.length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            byte[] bArr = this.f11377f[i2];
            int[] iArr = this.f11378g;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
        this.f11401d = i3;
        return i3;
    }

    @Override // p275e.C2722j
    /* renamed from: i */
    public C2722j mo11656i() {
        return m11643l().mo11656i();
    }

    @Override // p275e.C2722j
    /* renamed from: j */
    public byte[] mo11657j() {
        int[] iArr = this.f11378g;
        byte[][] bArr = this.f11377f;
        byte[] bArr2 = new byte[iArr[bArr.length - 1]];
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr2 = this.f11378g;
            int i3 = iArr2[length + i];
            int i4 = iArr2[i];
            System.arraycopy(this.f11377f[i], i3, bArr2, i2, i4 - i2);
            i++;
            i2 = i4;
        }
        return bArr2;
    }

    @Override // p275e.C2722j
    /* renamed from: k */
    public String mo11658k() {
        return m11643l().mo11658k();
    }

    @Override // p275e.C2722j
    public String toString() {
        return m11643l().toString();
    }
}
