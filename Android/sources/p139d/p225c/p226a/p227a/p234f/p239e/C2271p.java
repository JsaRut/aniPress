package p139d.p225c.p226a.p227a.p234f.p239e;

import p139d.p225c.p226a.p227a.p270n.C2622I;
import p139d.p225c.p226a.p227a.p270n.C2628e;

/* renamed from: d.c.a.a.f.e.p */
/* loaded from: classes.dex */
final class C2271p {

    /* renamed from: a */
    public final C2268m f8691a;

    /* renamed from: b */
    public final int f8692b;

    /* renamed from: c */
    public final long[] f8693c;

    /* renamed from: d */
    public final int[] f8694d;

    /* renamed from: e */
    public final int f8695e;

    /* renamed from: f */
    public final long[] f8696f;

    /* renamed from: g */
    public final int[] f8697g;

    /* renamed from: h */
    public final long f8698h;

    public C2271p(C2268m c2268m, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
        C2628e.m11111a(iArr.length == jArr2.length);
        C2628e.m11111a(jArr.length == jArr2.length);
        C2628e.m11111a(iArr2.length == jArr2.length);
        this.f8691a = c2268m;
        this.f8693c = jArr;
        this.f8694d = iArr;
        this.f8695e = i;
        this.f8696f = jArr2;
        this.f8697g = iArr2;
        this.f8698h = j;
        this.f8692b = jArr.length;
    }

    /* renamed from: a */
    public int m9428a(long j) {
        for (int m11079b = C2622I.m11079b(this.f8696f, j, true, false); m11079b >= 0; m11079b--) {
            if ((this.f8697g[m11079b] & 1) != 0) {
                return m11079b;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public int m9429b(long j) {
        for (int m11042a = C2622I.m11042a(this.f8696f, j, true, false); m11042a < this.f8696f.length; m11042a++) {
            if ((this.f8697g[m11042a] & 1) != 0) {
                return m11042a;
            }
        }
        return -1;
    }
}
