package p139d.p225c.p226a.p227a.p234f.p238d;

import android.util.Pair;
import p139d.p225c.p226a.p227a.C2200d;
import p139d.p225c.p226a.p227a.p234f.C2336p;
import p139d.p225c.p226a.p227a.p234f.InterfaceC2335o;
import p139d.p225c.p226a.p227a.p234f.p238d.C2252e;
import p139d.p225c.p226a.p227a.p245h.p247b.C2372s;
import p139d.p225c.p226a.p227a.p270n.C2622I;

/* renamed from: d.c.a.a.f.d.d */
/* loaded from: classes.dex */
public final class C2251d implements C2252e.a {

    /* renamed from: a */
    private final long[] f8358a;

    /* renamed from: b */
    private final long[] f8359b;

    /* renamed from: c */
    private final long f8360c;

    private C2251d(long[] jArr, long[] jArr2) {
        this.f8358a = jArr;
        this.f8359b = jArr2;
        this.f8360c = C2200d.m9047a(jArr2[jArr2.length - 1]);
    }

    /* renamed from: a */
    private static Pair<Long, Long> m9287a(long j, long[] jArr, long[] jArr2) {
        double d2;
        Long valueOf;
        Long valueOf2;
        int m11079b = C2622I.m11079b(jArr, j, true, true);
        long j2 = jArr[m11079b];
        long j3 = jArr2[m11079b];
        int i = m11079b + 1;
        if (i == jArr.length) {
            valueOf = Long.valueOf(j2);
            valueOf2 = Long.valueOf(j3);
        } else {
            long j4 = jArr[i];
            long j5 = jArr2[i];
            if (j4 == j2) {
                d2 = 0.0d;
            } else {
                double d3 = j;
                double d4 = j2;
                Double.isNaN(d3);
                Double.isNaN(d4);
                double d5 = j4 - j2;
                Double.isNaN(d5);
                d2 = (d3 - d4) / d5;
            }
            double d6 = j5 - j3;
            Double.isNaN(d6);
            valueOf = Long.valueOf(j);
            valueOf2 = Long.valueOf(((long) (d2 * d6)) + j3);
        }
        return Pair.create(valueOf, valueOf2);
    }

    /* renamed from: a */
    public static C2251d m9288a(long j, C2372s c2372s) {
        int length = c2372s.f9317d.length;
        int i = length + 1;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        jArr[0] = j;
        long j2 = 0;
        jArr2[0] = 0;
        for (int i2 = 1; i2 <= length; i2++) {
            int i3 = i2 - 1;
            j += c2372s.f9315b + c2372s.f9317d[i3];
            j2 += c2372s.f9316c + c2372s.f9318e[i3];
            jArr[i2] = j;
            jArr2[i2] = j2;
        }
        return new C2251d(jArr, jArr2);
    }

    @Override // p139d.p225c.p226a.p227a.p234f.p238d.C2252e.a
    /* renamed from: a */
    public long mo9285a(long j) {
        return C2200d.m9047a(((Long) m9287a(j, this.f8358a, this.f8359b).second).longValue());
    }

    @Override // p139d.p225c.p226a.p227a.p234f.p238d.C2252e.a
    /* renamed from: b */
    public long mo9286b() {
        return -1L;
    }

    @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2335o
    /* renamed from: b */
    public InterfaceC2335o.a mo9138b(long j) {
        Pair<Long, Long> m9287a = m9287a(C2200d.m9048b(C2622I.m11081b(j, 0L, this.f8360c)), this.f8359b, this.f8358a);
        return new InterfaceC2335o.a(new C2336p(C2200d.m9047a(((Long) m9287a.first).longValue()), ((Long) m9287a.second).longValue()));
    }

    @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2335o
    /* renamed from: c */
    public boolean mo9140c() {
        return true;
    }

    @Override // p139d.p225c.p226a.p227a.p234f.InterfaceC2335o
    /* renamed from: d */
    public long mo9141d() {
        return this.f8360c;
    }
}
