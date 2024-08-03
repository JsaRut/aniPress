package p139d.p225c.p226a.p227a.p259k.p267h;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p139d.p225c.p226a.p227a.p270n.C2622I;
import p139d.p225c.p226a.p227a.p270n.C2631h;
import p139d.p225c.p226a.p227a.p270n.C2644u;

/* renamed from: d.c.a.a.k.h.a */
/* loaded from: classes.dex */
final class C2551a {

    /* renamed from: a */
    private static final Pattern f10557a = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* renamed from: b */
    private final C2644u f10558b = new C2644u();

    /* renamed from: c */
    private final StringBuilder f10559c = new StringBuilder();

    /* renamed from: a */
    private static char m10717a(C2644u c2644u, int i) {
        return (char) c2644u.f11004a[i];
    }

    /* renamed from: a */
    static String m10718a(C2644u c2644u, StringBuilder sb) {
        m10724c(c2644u);
        if (c2644u.m11208a() == 0) {
            return null;
        }
        String m10721b = m10721b(c2644u, sb);
        if (!"".equals(m10721b)) {
            return m10721b;
        }
        return "" + ((char) c2644u.m11238t());
    }

    /* renamed from: a */
    private void m10719a(C2554d c2554d, String str) {
        if ("".equals(str)) {
            return;
        }
        int indexOf = str.indexOf(91);
        if (indexOf != -1) {
            Matcher matcher = f10557a.matcher(str.substring(indexOf));
            if (matcher.matches()) {
                c2554d.m10746d(matcher.group(1));
            }
            str = str.substring(0, indexOf);
        }
        String[] m11073a = C2622I.m11073a(str, "\\.");
        String str2 = m11073a[0];
        int indexOf2 = str2.indexOf(35);
        if (indexOf2 != -1) {
            c2554d.m10744c(str2.substring(0, indexOf2));
            c2554d.m10741b(str2.substring(indexOf2 + 1));
        } else {
            c2554d.m10744c(str2);
        }
        if (m11073a.length > 1) {
            c2554d.m10737a((String[]) Arrays.copyOfRange(m11073a, 1, m11073a.length));
        }
    }

    /* renamed from: a */
    private static void m10720a(C2644u c2644u, C2554d c2554d, StringBuilder sb) {
        m10724c(c2644u);
        String m10721b = m10721b(c2644u, sb);
        if (!"".equals(m10721b) && ":".equals(m10718a(c2644u, sb))) {
            m10724c(c2644u);
            String m10723c = m10723c(c2644u, sb);
            if (m10723c == null || "".equals(m10723c)) {
                return;
            }
            int m11217c = c2644u.m11217c();
            String m10718a = m10718a(c2644u, sb);
            if (!";".equals(m10718a)) {
                if (!"}".equals(m10718a)) {
                    return;
                } else {
                    c2644u.m11222e(m11217c);
                }
            }
            if ("color".equals(m10721b)) {
                c2554d.m10739b(C2631h.m11129a(m10723c));
                return;
            }
            if ("background-color".equals(m10721b)) {
                c2554d.m10734a(C2631h.m11129a(m10723c));
                return;
            }
            if ("text-decoration".equals(m10721b)) {
                if ("underline".equals(m10723c)) {
                    c2554d.m10742c(true);
                }
            } else {
                if ("font-family".equals(m10721b)) {
                    c2554d.m10735a(m10723c);
                    return;
                }
                if ("font-weight".equals(m10721b)) {
                    if ("bold".equals(m10723c)) {
                        c2554d.m10736a(true);
                    }
                } else if ("font-style".equals(m10721b) && "italic".equals(m10723c)) {
                    c2554d.m10740b(true);
                }
            }
        }
    }

    /* renamed from: b */
    private static String m10721b(C2644u c2644u, StringBuilder sb) {
        boolean z = false;
        sb.setLength(0);
        int m11217c = c2644u.m11217c();
        int m11219d = c2644u.m11219d();
        while (m11217c < m11219d && !z) {
            char c2 = (char) c2644u.f11004a[m11217c];
            if ((c2 < 'A' || c2 > 'Z') && ((c2 < 'a' || c2 > 'z') && !((c2 >= '0' && c2 <= '9') || c2 == '#' || c2 == '-' || c2 == '.' || c2 == '_'))) {
                z = true;
            } else {
                m11217c++;
                sb.append(c2);
            }
        }
        c2644u.m11224f(m11217c - c2644u.m11217c());
        return sb.toString();
    }

    /* renamed from: b */
    static void m10722b(C2644u c2644u) {
        do {
        } while (!TextUtils.isEmpty(c2644u.m11228j()));
    }

    /* renamed from: c */
    private static String m10723c(C2644u c2644u, StringBuilder sb) {
        StringBuilder sb2 = new StringBuilder();
        boolean z = false;
        while (!z) {
            int m11217c = c2644u.m11217c();
            String m10718a = m10718a(c2644u, sb);
            if (m10718a == null) {
                return null;
            }
            if ("}".equals(m10718a) || ";".equals(m10718a)) {
                c2644u.m11222e(m11217c);
                z = true;
            } else {
                sb2.append(m10718a);
            }
        }
        return sb2.toString();
    }

    /* renamed from: c */
    static void m10724c(C2644u c2644u) {
        while (true) {
            for (boolean z = true; c2644u.m11208a() > 0 && z; z = false) {
                if (!m10727e(c2644u) && !m10726d(c2644u)) {
                }
            }
            return;
        }
    }

    /* renamed from: d */
    private static String m10725d(C2644u c2644u, StringBuilder sb) {
        m10724c(c2644u);
        if (c2644u.m11208a() < 5 || !"::cue".equals(c2644u.m11216b(5))) {
            return null;
        }
        int m11217c = c2644u.m11217c();
        String m10718a = m10718a(c2644u, sb);
        if (m10718a == null) {
            return null;
        }
        if ("{".equals(m10718a)) {
            c2644u.m11222e(m11217c);
            return "";
        }
        String m10728f = "(".equals(m10718a) ? m10728f(c2644u) : null;
        String m10718a2 = m10718a(c2644u, sb);
        if (!")".equals(m10718a2) || m10718a2 == null) {
            return null;
        }
        return m10728f;
    }

    /* renamed from: d */
    private static boolean m10726d(C2644u c2644u) {
        int m11217c = c2644u.m11217c();
        int m11219d = c2644u.m11219d();
        byte[] bArr = c2644u.f11004a;
        if (m11217c + 2 > m11219d) {
            return false;
        }
        int i = m11217c + 1;
        if (bArr[m11217c] != 47) {
            return false;
        }
        int i2 = i + 1;
        if (bArr[i] != 42) {
            return false;
        }
        while (true) {
            int i3 = i2 + 1;
            if (i3 >= m11219d) {
                c2644u.m11224f(m11219d - c2644u.m11217c());
                return true;
            }
            if (((char) bArr[i2]) == '*' && ((char) bArr[i3]) == '/') {
                i2 = i3 + 1;
                m11219d = i2;
            } else {
                i2 = i3;
            }
        }
    }

    /* renamed from: e */
    private static boolean m10727e(C2644u c2644u) {
        char m10717a = m10717a(c2644u, c2644u.m11217c());
        if (m10717a != '\t' && m10717a != '\n' && m10717a != '\f' && m10717a != '\r' && m10717a != ' ') {
            return false;
        }
        c2644u.m11224f(1);
        return true;
    }

    /* renamed from: f */
    private static String m10728f(C2644u c2644u) {
        int m11217c = c2644u.m11217c();
        int m11219d = c2644u.m11219d();
        boolean z = false;
        while (m11217c < m11219d && !z) {
            int i = m11217c + 1;
            z = ((char) c2644u.f11004a[m11217c]) == ')';
            m11217c = i;
        }
        return c2644u.m11216b((m11217c - 1) - c2644u.m11217c()).trim();
    }

    /* renamed from: a */
    public C2554d m10729a(C2644u c2644u) {
        this.f10559c.setLength(0);
        int m11217c = c2644u.m11217c();
        m10722b(c2644u);
        this.f10558b.m11213a(c2644u.f11004a, c2644u.m11217c());
        this.f10558b.m11222e(m11217c);
        String m10725d = m10725d(this.f10558b, this.f10559c);
        if (m10725d == null || !"{".equals(m10718a(this.f10558b, this.f10559c))) {
            return null;
        }
        C2554d c2554d = new C2554d();
        m10719a(c2554d, m10725d);
        String str = null;
        boolean z = false;
        while (!z) {
            int m11217c2 = this.f10558b.m11217c();
            str = m10718a(this.f10558b, this.f10559c);
            boolean z2 = str == null || "}".equals(str);
            if (!z2) {
                this.f10558b.m11222e(m11217c2);
                m10720a(this.f10558b, c2554d, this.f10559c);
            }
            z = z2;
        }
        if ("}".equals(str)) {
            return c2554d;
        }
        return null;
    }
}
