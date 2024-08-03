package p031c.p032a.p063g;

import android.text.TextUtils;
import java.io.Serializable;
import java.net.InetAddress;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

/* renamed from: c.a.g.h */
/* loaded from: classes.dex */
public final class C0626h implements Serializable {

    /* renamed from: a */
    public String f2922a;

    /* renamed from: b */
    public int f2923b;

    /* renamed from: c */
    public transient InetAddress f2924c;

    public C0626h(String str, int i) {
        this.f2922a = str;
        this.f2923b = i;
    }

    public C0626h(InetAddress inetAddress, int i) {
        this.f2922a = inetAddress.getHostAddress();
        this.f2923b = i;
        this.f2924c = inetAddress;
    }

    /* renamed from: a */
    public static C0626h m3216a(String str) {
        int lastIndexOf;
        String substring;
        if (TextUtils.isEmpty(str) || (lastIndexOf = str.lastIndexOf(":")) < 0) {
            return null;
        }
        try {
            int intValue = Integer.decode(str.substring(lastIndexOf + 1)).intValue();
            if (lastIndexOf == 0) {
                substring = "";
            } else {
                int i = str.startsWith("[") ? 1 : 0;
                if (str.charAt(lastIndexOf - 1) == ']') {
                    lastIndexOf--;
                }
                substring = str.substring(i, lastIndexOf);
            }
            return new C0626h(substring, intValue);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static String m3217a(LinkedHashSet<C0626h> linkedHashSet) {
        if (linkedHashSet == null || linkedHashSet.isEmpty()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Iterator<C0626h> it = linkedHashSet.iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
            sb.append(",");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    /* renamed from: a */
    public static LinkedHashSet<C0626h> m3218a(LinkedHashMap<String, Integer> linkedHashMap) {
        LinkedHashSet<C0626h> linkedHashSet = new LinkedHashSet<>();
        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
            C0626h c0626h = new C0626h(entry.getKey(), entry.getValue().intValue());
            if (c0626h.m3221a()) {
                linkedHashSet.add(c0626h);
            }
        }
        return linkedHashSet;
    }

    /* renamed from: a */
    public static boolean m3219a(String str, int i) {
        return !TextUtils.isEmpty(str) && i > 0 && i <= 65535;
    }

    /* renamed from: b */
    public static LinkedHashSet<C0626h> m3220b(String str) {
        LinkedHashSet<C0626h> linkedHashSet = new LinkedHashSet<>();
        if (!TextUtils.isEmpty(str)) {
            for (String str2 : str.split(",")) {
                C0626h m3216a = m3216a(str2);
                if (m3216a != null && m3216a.m3221a()) {
                    linkedHashSet.add(m3216a);
                }
            }
        }
        return linkedHashSet;
    }

    /* renamed from: a */
    public final boolean m3221a() {
        int i;
        return !TextUtils.isEmpty(this.f2922a) && (i = this.f2923b) > 0 && i <= 65535;
    }

    public final boolean equals(Object obj) {
        String str;
        if (this == obj) {
            return true;
        }
        if (obj != null && C0626h.class == obj.getClass()) {
            C0626h c0626h = (C0626h) obj;
            if (this.f2923b == c0626h.f2923b && ((str = this.f2922a) == null ? c0626h.f2922a == null : str.equals(c0626h.f2922a))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f2922a;
        return ((str != null ? str.hashCode() : 0) * 31) + this.f2923b;
    }

    public final String toString() {
        StringBuilder sb;
        String str = ":";
        if (this.f2922a.contains(":")) {
            sb = new StringBuilder("[");
            sb.append(this.f2922a);
            str = "]:";
        } else {
            sb = new StringBuilder();
            sb.append(this.f2922a);
        }
        sb.append(str);
        sb.append(this.f2923b);
        return sb.toString();
    }
}
