package p139d.p225c.p226a.p227a.p271o;

import java.util.Collections;
import java.util.List;
import p139d.p225c.p226a.p227a.C2683z;
import p139d.p225c.p226a.p227a.p270n.C2642s;
import p139d.p225c.p226a.p227a.p270n.C2644u;

/* renamed from: d.c.a.a.o.m */
/* loaded from: classes.dex */
public final class C2665m {

    /* renamed from: a */
    public final List<byte[]> f11057a;

    /* renamed from: b */
    public final int f11058b;

    private C2665m(List<byte[]> list, int i) {
        this.f11057a = list;
        this.f11058b = i;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: a */
    public static C2665m m11275a(C2644u c2644u) {
        try {
            c2644u.m11224f(21);
            int m11238t = c2644u.m11238t() & 3;
            int m11238t2 = c2644u.m11238t();
            int m11217c = c2644u.m11217c();
            int i = 0;
            int i2 = 0;
            while (i < m11238t2) {
                c2644u.m11224f(1);
                int m11244z = c2644u.m11244z();
                int i3 = i2;
                for (int i4 = 0; i4 < m11244z; i4++) {
                    int m11244z2 = c2644u.m11244z();
                    i3 += m11244z2 + 4;
                    c2644u.m11224f(m11244z2);
                }
                i++;
                i2 = i3;
            }
            c2644u.m11222e(m11217c);
            byte[] bArr = new byte[i2];
            int i5 = 0;
            int i6 = 0;
            while (i5 < m11238t2) {
                c2644u.m11224f(1);
                int m11244z3 = c2644u.m11244z();
                int i7 = i6;
                for (int i8 = 0; i8 < m11244z3; i8++) {
                    int m11244z4 = c2644u.m11244z();
                    System.arraycopy(C2642s.f10980a, 0, bArr, i7, C2642s.f10980a.length);
                    int length = i7 + C2642s.f10980a.length;
                    System.arraycopy(c2644u.f11004a, c2644u.m11217c(), bArr, length, m11244z4);
                    i7 = length + m11244z4;
                    c2644u.m11224f(m11244z4);
                }
                i5++;
                i6 = i7;
            }
            return new C2665m(i2 == 0 ? null : Collections.singletonList(bArr), m11238t + 1);
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw new C2683z("Error parsing HEVC config", e2);
        }
    }
}
