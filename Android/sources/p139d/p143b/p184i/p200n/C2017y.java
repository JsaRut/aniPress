package p139d.p143b.p184i.p200n;

import p139d.p143b.p148c.p152d.C1691j;
import p139d.p143b.p148c.p153e.C1700a;
import p139d.p143b.p183h.C1826b;
import p139d.p143b.p184i.p191e.C1881e;
import p139d.p143b.p184i.p196j.C1920d;
import p139d.p143b.p184i.p201o.C2023c;

/* renamed from: d.b.i.n.y */
/* loaded from: classes.dex */
public class C2017y {
    /* renamed from: a */
    static float m8228a(C2023c c2023c, C1920d c1920d) {
        C1691j.m6974a(C1920d.m7903d(c1920d));
        C1881e m8246l = c2023c.m8246l();
        if (m8246l == null || m8246l.f6866b <= 0 || m8246l.f6865a <= 0 || c1920d.m7926w() == 0 || c1920d.m7920q() == 0) {
            return 1.0f;
        }
        int m8232c = m8232c(c2023c, c1920d);
        boolean z = m8232c == 90 || m8232c == 270;
        int m7920q = z ? c1920d.m7920q() : c1920d.m7926w();
        int m7926w = z ? c1920d.m7926w() : c1920d.m7920q();
        float f = m8246l.f6865a / m7920q;
        float f2 = m8246l.f6866b / m7926w;
        float max = Math.max(f, f2);
        C1700a.m7008b("DownsampleUtil", "Downsample - Specified size: %dx%d, image size: %dx%d ratio: %.1f x %.1f, ratio: %.3f for %s", Integer.valueOf(m8246l.f6865a), Integer.valueOf(m8246l.f6866b), Integer.valueOf(m7920q), Integer.valueOf(m7926w), Float.valueOf(f), Float.valueOf(f2), Float.valueOf(max), c2023c.m8249o().toString());
        return max;
    }

    /* renamed from: a */
    static int m8229a(float f) {
        if (f > 0.6666667f) {
            return 1;
        }
        int i = 2;
        while (true) {
            double d2 = i;
            double pow = Math.pow(d2, 2.0d);
            Double.isNaN(d2);
            Double.isNaN(d2);
            if ((1.0d / d2) + ((1.0d / (pow - d2)) * 0.3333333432674408d) <= f) {
                return i - 1;
            }
            i++;
        }
    }

    /* renamed from: b */
    static int m8230b(float f) {
        if (f > 0.6666667f) {
            return 1;
        }
        int i = 2;
        while (true) {
            int i2 = i * 2;
            double d2 = i2;
            Double.isNaN(d2);
            double d3 = 1.0d / d2;
            if (d3 + (0.3333333432674408d * d3) <= f) {
                return i;
            }
            i = i2;
        }
    }

    /* renamed from: b */
    public static int m8231b(C2023c c2023c, C1920d c1920d) {
        if (!C1920d.m7903d(c1920d)) {
            return 1;
        }
        float m8228a = m8228a(c2023c, c1920d);
        int m8230b = c1920d.m7921r() == C1826b.f6739a ? m8230b(m8228a) : m8229a(m8228a);
        int max = Math.max(c1920d.m7920q(), c1920d.m7926w());
        C1881e m8246l = c2023c.m8246l();
        float f = m8246l != null ? m8246l.f6867c : 2048.0f;
        while (max / m8230b > f) {
            m8230b = c1920d.m7921r() == C1826b.f6739a ? m8230b * 2 : m8230b + 1;
        }
        return m8230b;
    }

    /* renamed from: c */
    private static int m8232c(C2023c c2023c, C1920d c1920d) {
        if (!c2023c.m8247m().m7666g()) {
            return 0;
        }
        int m7923t = c1920d.m7923t();
        C1691j.m6974a(m7923t == 0 || m7923t == 90 || m7923t == 180 || m7923t == 270);
        return m7923t;
    }
}
