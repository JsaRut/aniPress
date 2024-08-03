package p139d.p225c.p226a.p227a.p234f;

import java.util.Arrays;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2335o;
import p139d.p225c.p226a.p227a.p270n.C2622I;

/* renamed from: d.c.a.a.f.b */
/* loaded from: classes.dex */
public final class C2230b implements InterfaceC2335o {

    /* renamed from: a */
    public final int f8183a;

    /* renamed from: b */
    public final int[] f8184b;

    /* renamed from: c */
    public final long[] f8185c;

    /* renamed from: d */
    public final long[] f8186d;

    /* renamed from: e */
    public final long[] f8187e;

    /* renamed from: f */
    private final long f8188f;

    public C2230b(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f8184b = iArr;
        this.f8185c = jArr;
        this.f8186d = jArr2;
        this.f8187e = jArr3;
        this.f8183a = iArr.length;
        int i = this.f8183a;
        if (i > 0) {
            this.f8188f = jArr2[i - 1] + jArr3[i - 1];
        } else {
            this.f8188f = 0L;
        }
    }

    @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2335o
    /* renamed from: b */
    public InterfaceC2335o.a mo9138b(long j) {
        int m9186c = m9186c(j);
        C2336p c2336p = new C2336p(this.f8187e[m9186c], this.f8185c[m9186c]);
        if (c2336p.f9171b >= j || m9186c == this.f8183a - 1) {
            return new InterfaceC2335o.a(c2336p);
        }
        int i = m9186c + 1;
        return new InterfaceC2335o.a(c2336p, new C2336p(this.f8187e[i], this.f8185c[i]));
    }

    /* renamed from: c */
    public int m9186c(long j) {
        return C2622I.m11079b(this.f8187e, j, true, true);
    }

    @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2335o
    /* renamed from: c */
    public boolean mo9140c() {
        return true;
    }

    @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2335o
    /* renamed from: d */
    public long mo9141d() {
        return this.f8188f;
    }

    public String toString() {
        return "ChunkIndex(length=" + this.f8183a + ", sizes=" + Arrays.toString(this.f8184b) + ", offsets=" + Arrays.toString(this.f8185c) + ", timeUs=" + Arrays.toString(this.f8187e) + ", durationsUs=" + Arrays.toString(this.f8186d) + ")";
    }
}
