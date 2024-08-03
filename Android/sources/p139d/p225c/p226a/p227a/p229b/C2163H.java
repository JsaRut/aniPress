package p139d.p225c.p226a.p227a.p229b;

import p139d.p225c.p226a.p227a.p270n.C2622I;

/* renamed from: d.c.a.a.b.H */
/* loaded from: classes.dex */
public final class C2163H {

    /* renamed from: a */
    public static final int f7829a = C2622I.m11078b("RIFF");

    /* renamed from: b */
    public static final int f7830b = C2622I.m11078b("WAVE");

    /* renamed from: c */
    public static final int f7831c = C2622I.m11078b("fmt ");

    /* renamed from: d */
    public static final int f7832d = C2622I.m11078b("data");

    /* renamed from: a */
    public static int m8846a(int i, int i2) {
        if (i != 1) {
            if (i == 3) {
                return i2 == 32 ? 4 : 0;
            }
            if (i != 65534) {
                if (i != 6) {
                    return i != 7 ? 0 : 268435456;
                }
                return 536870912;
            }
        }
        return C2622I.m11084c(i2);
    }
}
