package p139d.p143b.p148c.p156h;

import java.util.IdentityHashMap;
import java.util.Map;
import p139d.p143b.p148c.p152d.C1691j;
import p139d.p143b.p148c.p153e.C1700a;

/* renamed from: d.b.c.h.e */
/* loaded from: classes.dex */
public class C1719e<T> {

    /* renamed from: a */
    private static final Map<Object, Integer> f6245a = new IdentityHashMap();

    /* renamed from: b */
    private T f6246b;

    /* renamed from: c */
    private int f6247c;

    /* renamed from: d */
    private final InterfaceC1718d<T> f6248d;

    /* renamed from: d.b.c.h.e$a */
    /* loaded from: classes.dex */
    public static class a extends RuntimeException {
        public a() {
            super("Null shared reference");
        }
    }

    public C1719e(T t, InterfaceC1718d<T> interfaceC1718d) {
        C1691j.m6971a(t);
        this.f6246b = t;
        C1691j.m6971a(interfaceC1718d);
        this.f6248d = interfaceC1718d;
        this.f6247c = 1;
        m7054a(t);
    }

    /* renamed from: a */
    private static void m7054a(Object obj) {
        synchronized (f6245a) {
            Integer num = f6245a.get(obj);
            if (num == null) {
                f6245a.put(obj, 1);
            } else {
                f6245a.put(obj, Integer.valueOf(num.intValue() + 1));
            }
        }
    }

    /* renamed from: a */
    public static boolean m7055a(C1719e<?> c1719e) {
        return c1719e != null && c1719e.m7062d();
    }

    /* renamed from: b */
    private static void m7056b(Object obj) {
        synchronized (f6245a) {
            Integer num = f6245a.get(obj);
            if (num == null) {
                C1700a.m7016d("SharedReference", "No entry in sLiveObjects for value of type %s", obj.getClass());
            } else if (num.intValue() == 1) {
                f6245a.remove(obj);
            } else {
                f6245a.put(obj, Integer.valueOf(num.intValue() - 1));
            }
        }
    }

    /* renamed from: e */
    private synchronized int m7057e() {
        m7058f();
        C1691j.m6974a(this.f6247c > 0);
        this.f6247c--;
        return this.f6247c;
    }

    /* renamed from: f */
    private void m7058f() {
        if (!m7055a((C1719e<?>) this)) {
            throw new a();
        }
    }

    /* renamed from: a */
    public synchronized void m7059a() {
        m7058f();
        this.f6247c++;
    }

    /* renamed from: b */
    public void m7060b() {
        T t;
        if (m7057e() == 0) {
            synchronized (this) {
                t = this.f6246b;
                this.f6246b = null;
            }
            this.f6248d.mo4987a(t);
            m7056b(t);
        }
    }

    /* renamed from: c */
    public synchronized T m7061c() {
        return this.f6246b;
    }

    /* renamed from: d */
    public synchronized boolean m7062d() {
        return this.f6247c > 0;
    }
}
