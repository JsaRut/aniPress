package p139d.p225c.p226a.p227a.p234f;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p139d.p225c.p226a.p227a.p245h.C2353b;
import p139d.p225c.p226a.p227a.p245h.p247b.C2364k;
import p139d.p225c.p226a.p227a.p245h.p247b.C2370q;

/* renamed from: d.c.a.a.f.k */
/* loaded from: classes.dex */
public final class C2331k {

    /* renamed from: a */
    private static final Pattern f9147a = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: b */
    public int f9148b = -1;

    /* renamed from: c */
    public int f9149c = -1;

    /* renamed from: a */
    private boolean m9687a(String str) {
        Matcher matcher = f9147a.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            int parseInt = Integer.parseInt(matcher.group(1), 16);
            int parseInt2 = Integer.parseInt(matcher.group(2), 16);
            if (parseInt <= 0 && parseInt2 <= 0) {
                return false;
            }
            this.f9148b = parseInt;
            this.f9149c = parseInt2;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public boolean m9688a() {
        return (this.f9148b == -1 || this.f9149c == -1) ? false : true;
    }

    /* renamed from: a */
    public boolean m9689a(int i) {
        int i2 = i >> 12;
        int i3 = i & 4095;
        if (i2 <= 0 && i3 <= 0) {
            return false;
        }
        this.f9148b = i2;
        this.f9149c = i3;
        return true;
    }

    /* renamed from: a */
    public boolean m9690a(C2353b c2353b) {
        for (int i = 0; i < c2353b.m9810a(); i++) {
            C2353b.a m9811a = c2353b.m9811a(i);
            if (m9811a instanceof C2364k) {
                C2364k c2364k = (C2364k) m9811a;
                if ("iTunSMPB".equals(c2364k.f9298b) && m9687a(c2364k.f9299c)) {
                    return true;
                }
            } else if (m9811a instanceof C2370q) {
                C2370q c2370q = (C2370q) m9811a;
                if ("com.apple.iTunes".equals(c2370q.f9311a) && "iTunSMPB".equals(c2370q.f9312b) && m9687a(c2370q.f9313c)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }
}
