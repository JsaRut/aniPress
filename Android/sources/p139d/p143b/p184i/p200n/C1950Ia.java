package p139d.p143b.p184i.p200n;

import p139d.p143b.p184i.p191e.C1881e;
import p139d.p143b.p184i.p196j.C1920d;

/* renamed from: d.b.i.n.Ia */
/* loaded from: classes.dex */
public final class C1950Ia {
    /* renamed from: a */
    public static int m7996a(int i) {
        return (int) (i * 1.3333334f);
    }

    /* renamed from: a */
    public static boolean m7997a(int i, int i2, C1881e c1881e) {
        return c1881e == null ? ((float) m7996a(i)) >= 2048.0f && m7996a(i2) >= 2048 : m7996a(i) >= c1881e.f6865a && m7996a(i2) >= c1881e.f6866b;
    }

    /* renamed from: a */
    public static boolean m7998a(C1920d c1920d, C1881e c1881e) {
        int m7920q;
        int m7926w;
        if (c1920d == null) {
            return false;
        }
        int m7923t = c1920d.m7923t();
        if (m7923t == 90 || m7923t == 270) {
            m7920q = c1920d.m7920q();
            m7926w = c1920d.m7926w();
        } else {
            m7920q = c1920d.m7926w();
            m7926w = c1920d.m7920q();
        }
        return m7997a(m7920q, m7926w, c1881e);
    }
}
