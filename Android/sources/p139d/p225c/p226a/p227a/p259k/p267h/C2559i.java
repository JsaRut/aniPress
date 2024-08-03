package p139d.p225c.p226a.p227a.p259k.p267h;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p139d.p225c.p226a.p227a.C2683z;
import p139d.p225c.p226a.p227a.p270n.C2622I;
import p139d.p225c.p226a.p227a.p270n.C2644u;

/* renamed from: d.c.a.a.k.h.i */
/* loaded from: classes.dex */
public final class C2559i {

    /* renamed from: a */
    private static final Pattern f10610a = Pattern.compile("^NOTE(( |\t).*)?$");

    /* renamed from: a */
    public static float m10789a(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    /* renamed from: a */
    public static Matcher m10790a(C2644u c2644u) {
        String m11228j;
        while (true) {
            String m11228j2 = c2644u.m11228j();
            if (m11228j2 == null) {
                return null;
            }
            if (f10610a.matcher(m11228j2).matches()) {
                do {
                    m11228j = c2644u.m11228j();
                    if (m11228j != null) {
                    }
                } while (!m11228j.isEmpty());
            } else {
                Matcher matcher = C2557g.f10595a.matcher(m11228j2);
                if (matcher.matches()) {
                    return matcher;
                }
            }
        }
    }

    /* renamed from: b */
    public static long m10791b(String str) {
        String[] m11083b = C2622I.m11083b(str, "\\.");
        long j = 0;
        for (String str2 : C2622I.m11073a(m11083b[0], ":")) {
            j = (j * 60) + Long.parseLong(str2);
        }
        long j2 = j * 1000;
        if (m11083b.length == 2) {
            j2 += Long.parseLong(m11083b[1]);
        }
        return j2 * 1000;
    }

    /* renamed from: b */
    public static boolean m10792b(C2644u c2644u) {
        String m11228j = c2644u.m11228j();
        return m11228j != null && m11228j.startsWith("WEBVTT");
    }

    /* renamed from: c */
    public static void m10793c(C2644u c2644u) {
        int m11217c = c2644u.m11217c();
        if (m10792b(c2644u)) {
            return;
        }
        c2644u.m11222e(m11217c);
        throw new C2683z("Expected WEBVTT. Got " + c2644u.m11228j());
    }
}
