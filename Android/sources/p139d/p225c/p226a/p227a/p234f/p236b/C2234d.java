package p139d.p225c.p226a.p227a.p234f.p236b;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import p139d.p225c.p226a.p227a.C2683z;
import p139d.p225c.p226a.p227a.p270n.C2644u;

/* renamed from: d.c.a.a.f.b.d */
/* loaded from: classes.dex */
final class C2234d extends AbstractC2235e {

    /* renamed from: b */
    private long f8211b;

    public C2234d() {
        super(null);
        this.f8211b = -9223372036854775807L;
    }

    /* renamed from: a */
    private static Object m9196a(C2644u c2644u, int i) {
        if (i == 0) {
            return m9199d(c2644u);
        }
        if (i == 1) {
            return m9197b(c2644u);
        }
        if (i == 2) {
            return m9203h(c2644u);
        }
        if (i == 3) {
            return m9201f(c2644u);
        }
        if (i == 8) {
            return m9200e(c2644u);
        }
        if (i == 10) {
            return m9202g(c2644u);
        }
        if (i != 11) {
            return null;
        }
        return m9198c(c2644u);
    }

    /* renamed from: b */
    private static Boolean m9197b(C2644u c2644u) {
        return Boolean.valueOf(c2644u.m11238t() == 1);
    }

    /* renamed from: c */
    private static Date m9198c(C2644u c2644u) {
        Date date = new Date((long) m9199d(c2644u).doubleValue());
        c2644u.m11224f(2);
        return date;
    }

    /* renamed from: d */
    private static Double m9199d(C2644u c2644u) {
        return Double.valueOf(Double.longBitsToDouble(c2644u.m11234p()));
    }

    /* renamed from: e */
    private static HashMap<String, Object> m9200e(C2644u c2644u) {
        int m11242x = c2644u.m11242x();
        HashMap<String, Object> hashMap = new HashMap<>(m11242x);
        for (int i = 0; i < m11242x; i++) {
            hashMap.put(m9203h(c2644u), m9196a(c2644u, m9204i(c2644u)));
        }
        return hashMap;
    }

    /* renamed from: f */
    private static HashMap<String, Object> m9201f(C2644u c2644u) {
        HashMap<String, Object> hashMap = new HashMap<>();
        while (true) {
            String m9203h = m9203h(c2644u);
            int m9204i = m9204i(c2644u);
            if (m9204i == 9) {
                return hashMap;
            }
            hashMap.put(m9203h, m9196a(c2644u, m9204i));
        }
    }

    /* renamed from: g */
    private static ArrayList<Object> m9202g(C2644u c2644u) {
        int m11242x = c2644u.m11242x();
        ArrayList<Object> arrayList = new ArrayList<>(m11242x);
        for (int i = 0; i < m11242x; i++) {
            arrayList.add(m9196a(c2644u, m9204i(c2644u)));
        }
        return arrayList;
    }

    /* renamed from: h */
    private static String m9203h(C2644u c2644u) {
        int m11244z = c2644u.m11244z();
        int m11217c = c2644u.m11217c();
        c2644u.m11224f(m11244z);
        return new String(c2644u.f11004a, m11217c, m11244z);
    }

    /* renamed from: i */
    private static int m9204i(C2644u c2644u) {
        return c2644u.m11238t();
    }

    /* renamed from: a */
    public long m9205a() {
        return this.f8211b;
    }

    @Override // p139d.p225c.p226a.p227a.p234f.p236b.AbstractC2235e
    /* renamed from: a */
    protected boolean mo9187a(C2644u c2644u) {
        return true;
    }

    @Override // p139d.p225c.p226a.p227a.p234f.p236b.AbstractC2235e
    /* renamed from: b */
    protected void mo9188b(C2644u c2644u, long j) {
        if (m9204i(c2644u) != 2) {
            throw new C2683z();
        }
        if ("onMetaData".equals(m9203h(c2644u)) && m9204i(c2644u) == 8) {
            HashMap<String, Object> m9200e = m9200e(c2644u);
            if (m9200e.containsKey("duration")) {
                double doubleValue = ((Double) m9200e.get("duration")).doubleValue();
                if (doubleValue > 0.0d) {
                    this.f8211b = (long) (doubleValue * 1000000.0d);
                }
            }
        }
    }
}
