package p139d.p225c.p226a.p227a.p234f.p242h;

import p139d.p225c.p226a.p227a.p270n.C2644u;

/* renamed from: d.c.a.a.f.h.H */
/* loaded from: classes.dex */
public final class C2297H {
    /* renamed from: a */
    public static int m9551a(byte[] bArr, int i, int i2) {
        while (i < i2 && bArr[i] != 71) {
            i++;
        }
        return i;
    }

    /* renamed from: a */
    public static long m9552a(C2644u c2644u, int i, int i2) {
        c2644u.m11222e(i);
        if (c2644u.m11208a() < 5) {
            return -9223372036854775807L;
        }
        int m11226h = c2644u.m11226h();
        if ((8388608 & m11226h) != 0 || ((2096896 & m11226h) >> 8) != i2) {
            return -9223372036854775807L;
        }
        if (((m11226h & 32) != 0) && c2644u.m11238t() >= 7 && c2644u.m11208a() >= 7) {
            if ((c2644u.m11238t() & 16) == 16) {
                byte[] bArr = new byte[6];
                c2644u.m11214a(bArr, 0, bArr.length);
                return m9553a(bArr);
            }
        }
        return -9223372036854775807L;
    }

    /* renamed from: a */
    private static long m9553a(byte[] bArr) {
        return ((bArr[0] & 255) << 25) | ((bArr[1] & 255) << 17) | ((bArr[2] & 255) << 9) | ((bArr[3] & 255) << 1) | ((255 & bArr[4]) >> 7);
    }
}
