package p139d.p143b.p184i.p191e;

import java.util.regex.Pattern;
import p139d.p143b.p148c.p152d.C1691j;
import p139d.p143b.p148c.p159k.C1724b;

/* renamed from: d.b.i.e.a */
/* loaded from: classes.dex */
public class C1877a {

    /* renamed from: a */
    private static Pattern f6843a;

    /* renamed from: b */
    public final int f6844b;

    /* renamed from: c */
    public final int f6845c;

    public C1877a(int i, int i2) {
        this.f6844b = i;
        this.f6845c = i2;
    }

    /* renamed from: a */
    public static C1877a m7643a(int i) {
        C1691j.m6974a(i >= 0);
        return new C1877a(i, Integer.MAX_VALUE);
    }

    /* renamed from: a */
    public static C1877a m7644a(String str) {
        if (str == null) {
            return null;
        }
        if (f6843a == null) {
            f6843a = Pattern.compile("[-/ ]");
        }
        try {
            String[] split = f6843a.split(str);
            C1691j.m6974a(split.length == 4);
            C1691j.m6974a(split[0].equals("bytes"));
            int parseInt = Integer.parseInt(split[1]);
            int parseInt2 = Integer.parseInt(split[2]);
            int parseInt3 = Integer.parseInt(split[3]);
            C1691j.m6974a(parseInt2 > parseInt);
            C1691j.m6974a(parseInt3 > parseInt2);
            return parseInt2 < parseInt3 - 1 ? new C1877a(parseInt, parseInt2) : new C1877a(parseInt, Integer.MAX_VALUE);
        } catch (IllegalArgumentException e2) {
            throw new IllegalArgumentException(String.format(null, "Invalid Content-Range header value: \"%s\"", str), e2);
        }
    }

    /* renamed from: b */
    public static C1877a m7645b(int i) {
        C1691j.m6974a(i > 0);
        return new C1877a(0, i);
    }

    /* renamed from: c */
    private static String m7646c(int i) {
        return i == Integer.MAX_VALUE ? "" : Integer.toString(i);
    }

    /* renamed from: a */
    public String m7647a() {
        return String.format(null, "bytes=%s-%s", m7646c(this.f6844b), m7646c(this.f6845c));
    }

    /* renamed from: a */
    public boolean m7648a(C1877a c1877a) {
        return c1877a != null && this.f6844b <= c1877a.f6844b && this.f6845c >= c1877a.f6845c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1877a)) {
            return false;
        }
        C1877a c1877a = (C1877a) obj;
        return this.f6844b == c1877a.f6844b && this.f6845c == c1877a.f6845c;
    }

    public int hashCode() {
        return C1724b.m7072a(this.f6844b, this.f6845c);
    }

    public String toString() {
        return String.format(null, "%s-%s", m7646c(this.f6844b), m7646c(this.f6845c));
    }
}
