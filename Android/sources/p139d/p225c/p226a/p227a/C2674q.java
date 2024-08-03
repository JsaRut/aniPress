package p139d.p225c.p226a.p227a;

import java.util.HashSet;

/* renamed from: d.c.a.a.q */
/* loaded from: classes.dex */
public final class C2674q {

    /* renamed from: a */
    private static final HashSet<String> f11172a = new HashSet<>();

    /* renamed from: b */
    private static String f11173b = "goog.exo.core";

    /* renamed from: a */
    public static synchronized String m11417a() {
        String str;
        synchronized (C2674q.class) {
            str = f11173b;
        }
        return str;
    }

    /* renamed from: a */
    public static synchronized void m11418a(String str) {
        synchronized (C2674q.class) {
            if (f11172a.add(str)) {
                f11173b += ", " + str;
            }
        }
    }
}
