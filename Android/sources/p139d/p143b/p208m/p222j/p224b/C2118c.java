package p139d.p143b.p208m.p222j.p224b;

import java.util.List;
import p139d.p143b.p184i.p192f.C1893j;
import p139d.p143b.p184i.p192f.C1898o;

/* renamed from: d.b.m.j.b.c */
/* loaded from: classes.dex */
public class C2118c {

    /* renamed from: d.b.m.j.b.c$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        private final C2116a f7597a;

        /* renamed from: b */
        private final C2116a f7598b;

        private a(C2116a c2116a, C2116a c2116a2) {
            this.f7597a = c2116a;
            this.f7598b = c2116a2;
        }

        /* synthetic */ a(C2116a c2116a, C2116a c2116a2, C2117b c2117b) {
            this(c2116a, c2116a2);
        }

        /* renamed from: a */
        public C2116a m8466a() {
            return this.f7597a;
        }

        /* renamed from: b */
        public C2116a m8467b() {
            return this.f7598b;
        }
    }

    /* renamed from: a */
    public static a m8464a(int i, int i2, List<C2116a> list) {
        return m8465a(i, i2, list, 1.0d);
    }

    /* renamed from: a */
    public static a m8465a(int i, int i2, List<C2116a> list, double d2) {
        if (list.isEmpty()) {
            return new a(null, null);
        }
        if (list.size() == 1) {
            return new a(list.get(0), null);
        }
        if (i <= 0 || i2 <= 0) {
            return new a(null, null);
        }
        C1893j m7793e = C1898o.m7782f().m7793e();
        double d3 = i * i2;
        Double.isNaN(d3);
        double d4 = d3 * d2;
        double d5 = Double.MAX_VALUE;
        double d6 = Double.MAX_VALUE;
        C2116a c2116a = null;
        C2116a c2116a2 = null;
        for (C2116a c2116a3 : list) {
            double abs = Math.abs(1.0d - (c2116a3.m8460a() / d4));
            if (abs < d5) {
                c2116a2 = c2116a3;
                d5 = abs;
            }
            if (abs < d6 && (m7793e.m7688a(c2116a3.m8462c()) || m7793e.m7693b(c2116a3.m8462c()))) {
                c2116a = c2116a3;
                d6 = abs;
            }
        }
        if (c2116a != null && c2116a2 != null && c2116a.m8461b().equals(c2116a2.m8461b())) {
            c2116a = null;
        }
        return new a(c2116a2, c2116a);
    }
}
