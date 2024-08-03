package p139d.p225c.p226a.p227a.p270n;

/* renamed from: d.c.a.a.n.y */
/* loaded from: classes.dex */
public final class C2648y {
    /* renamed from: a */
    public static int m11259a(int i, int i2) {
        for (int i3 = 1; i3 <= 2; i3++) {
            int i4 = (i + i3) % 3;
            if (m11260b(i4, i2)) {
                return i4;
            }
        }
        return i;
    }

    /* renamed from: b */
    public static boolean m11260b(int i, int i2) {
        if (i != 0) {
            return i != 1 ? i == 2 && (i2 & 2) != 0 : (i2 & 1) != 0;
        }
        return true;
    }
}
