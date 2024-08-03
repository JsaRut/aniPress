package p139d.p143b.p184i.p190d;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p139d.p143b.p145b.p146a.InterfaceC1648d;
import p139d.p143b.p148c.p152d.C1691j;
import p139d.p143b.p148c.p153e.C1700a;
import p139d.p143b.p148c.p155g.InterfaceC1710g;
import p139d.p143b.p148c.p156h.C1716b;
import p139d.p143b.p184i.p196j.C1920d;

/* renamed from: d.b.i.d.F */
/* loaded from: classes.dex */
public class C1849F {

    /* renamed from: a */
    private static final Class<?> f6786a = C1849F.class;

    /* renamed from: b */
    private Map<InterfaceC1648d, C1920d> f6787b = new HashMap();

    private C1849F() {
    }

    /* renamed from: b */
    public static C1849F m7571b() {
        return new C1849F();
    }

    /* renamed from: c */
    private synchronized void m7572c() {
        C1700a.m7002b(f6786a, "Count = %d", Integer.valueOf(this.f6787b.size()));
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: a */
    public void m7573a() {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList(this.f6787b.values());
            this.f6787b.clear();
        }
        for (int i = 0; i < arrayList.size(); i++) {
            C1920d c1920d = (C1920d) arrayList.get(i);
            if (c1920d != null) {
                c1920d.close();
            }
        }
    }

    /* renamed from: a */
    public synchronized void m7574a(InterfaceC1648d interfaceC1648d, C1920d c1920d) {
        C1691j.m6971a(interfaceC1648d);
        C1691j.m6974a(C1920d.m7904e(c1920d));
        C1920d.m7902b(this.f6787b.put(interfaceC1648d, C1920d.m7901a(c1920d)));
        m7572c();
    }

    /* renamed from: a */
    public synchronized boolean m7575a(InterfaceC1648d interfaceC1648d) {
        C1691j.m6971a(interfaceC1648d);
        if (!this.f6787b.containsKey(interfaceC1648d)) {
            return false;
        }
        C1920d c1920d = this.f6787b.get(interfaceC1648d);
        synchronized (c1920d) {
            if (C1920d.m7904e(c1920d)) {
                return true;
            }
            this.f6787b.remove(interfaceC1648d);
            C1700a.m7011c(f6786a, "Found closed reference %d for key %s (%d)", Integer.valueOf(System.identityHashCode(c1920d)), interfaceC1648d.mo6817a(), Integer.valueOf(System.identityHashCode(interfaceC1648d)));
            return false;
        }
    }

    /* renamed from: b */
    public synchronized C1920d m7576b(InterfaceC1648d interfaceC1648d) {
        C1920d c1920d;
        C1691j.m6971a(interfaceC1648d);
        C1920d c1920d2 = this.f6787b.get(interfaceC1648d);
        if (c1920d2 != null) {
            synchronized (c1920d2) {
                if (!C1920d.m7904e(c1920d2)) {
                    this.f6787b.remove(interfaceC1648d);
                    C1700a.m7011c(f6786a, "Found closed reference %d for key %s (%d)", Integer.valueOf(System.identityHashCode(c1920d2)), interfaceC1648d.mo6817a(), Integer.valueOf(System.identityHashCode(interfaceC1648d)));
                    return null;
                }
                c1920d = C1920d.m7901a(c1920d2);
            }
        } else {
            c1920d = c1920d2;
        }
        return c1920d;
    }

    /* renamed from: b */
    public synchronized boolean m7577b(InterfaceC1648d interfaceC1648d, C1920d c1920d) {
        C1691j.m6971a(interfaceC1648d);
        C1691j.m6971a(c1920d);
        C1691j.m6974a(C1920d.m7904e(c1920d));
        C1920d c1920d2 = this.f6787b.get(interfaceC1648d);
        if (c1920d2 == null) {
            return false;
        }
        C1716b<InterfaceC1710g> m7917n = c1920d2.m7917n();
        C1716b<InterfaceC1710g> m7917n2 = c1920d.m7917n();
        if (m7917n != null && m7917n2 != null) {
            try {
                if (m7917n.m7048n() == m7917n2.m7048n()) {
                    this.f6787b.remove(interfaceC1648d);
                    C1716b.m7045b(m7917n2);
                    C1716b.m7045b(m7917n);
                    C1920d.m7902b(c1920d2);
                    m7572c();
                    return true;
                }
            } finally {
                C1716b.m7045b(m7917n2);
                C1716b.m7045b(m7917n);
                C1920d.m7902b(c1920d2);
            }
        }
        return false;
    }

    /* renamed from: c */
    public boolean m7578c(InterfaceC1648d interfaceC1648d) {
        C1920d remove;
        C1691j.m6971a(interfaceC1648d);
        synchronized (this) {
            remove = this.f6787b.remove(interfaceC1648d);
        }
        if (remove == null) {
            return false;
        }
        try {
            return remove.m7927x();
        } finally {
            remove.close();
        }
    }
}
