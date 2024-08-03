package p031c.p032a.p063g;

import java.util.Comparator;

/* renamed from: c.a.g.f */
/* loaded from: classes.dex */
final class C0624f implements Comparator<C0622d> {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(C0622d c0622d, C0622d c0622d2) {
        C0622d c0622d3 = c0622d;
        C0622d c0622d4 = c0622d2;
        if (c0622d3.equals(c0622d4)) {
            return 0;
        }
        int i = c0622d3.f2914b;
        int i2 = c0622d4.f2914b;
        if (i > i2) {
            return -1;
        }
        if (i < i2) {
            return 1;
        }
        int i3 = c0622d3.f2917e;
        int i4 = c0622d4.f2917e;
        if (i3 > i4) {
            return -1;
        }
        if (i3 < i4) {
            return 1;
        }
        long j = c0622d3.f2916d;
        if (j != 0) {
            long j2 = c0622d4.f2916d;
            if (j2 != 0) {
                if (j < j2) {
                    return -1;
                }
                if (j > j2) {
                    return 1;
                }
            }
        }
        long j3 = c0622d3.f2915c;
        if (j3 == 0) {
            return 0;
        }
        long j4 = c0622d4.f2915c;
        if (j4 == 0) {
            return 0;
        }
        if (j3 > j4 + 180000) {
            return -1;
        }
        return j3 < j4 - 180000 ? 1 : 0;
    }
}
