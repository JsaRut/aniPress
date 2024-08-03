package p139d.p143b.p148c.p156h;

import java.io.Closeable;
import p139d.p143b.p148c.p152d.C1691j;
import p139d.p143b.p148c.p153e.C1700a;

/* renamed from: d.b.c.h.b */
/* loaded from: classes.dex */
public final class C1716b<T> implements Cloneable, Closeable {

    /* renamed from: a */
    private static Class<C1716b> f6238a = C1716b.class;

    /* renamed from: b */
    private static final InterfaceC1718d<Closeable> f6239b = new C1715a();

    /* renamed from: c */
    private boolean f6240c = false;

    /* renamed from: d */
    private final C1719e<T> f6241d;

    private C1716b(C1719e<T> c1719e) {
        C1691j.m6971a(c1719e);
        this.f6241d = c1719e;
        c1719e.m7059a();
    }

    private C1716b(T t, InterfaceC1718d<T> interfaceC1718d) {
        this.f6241d = new C1719e<>(t, interfaceC1718d);
    }

    /* renamed from: a */
    public static <T> C1716b<T> m7042a(C1716b<T> c1716b) {
        if (c1716b != null) {
            return c1716b.m7047m();
        }
        return null;
    }

    /* renamed from: a */
    public static C1716b m7043a(Closeable closeable) {
        if (closeable == null) {
            return null;
        }
        return new C1716b(closeable, f6239b);
    }

    /* renamed from: a */
    public static <T> C1716b<T> m7044a(T t, InterfaceC1718d<T> interfaceC1718d) {
        if (t == null) {
            return null;
        }
        return new C1716b<>(t, interfaceC1718d);
    }

    /* renamed from: b */
    public static void m7045b(C1716b<?> c1716b) {
        if (c1716b != null) {
            c1716b.close();
        }
    }

    /* renamed from: c */
    public static boolean m7046c(C1716b<?> c1716b) {
        return c1716b != null && c1716b.m7050p();
    }

    /* renamed from: clone */
    public synchronized C1716b<T> m11778clone() {
        C1691j.m6978b(m7050p());
        return new C1716b<>(this.f6241d);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            if (this.f6240c) {
                return;
            }
            this.f6240c = true;
            this.f6241d.m7060b();
        }
    }

    protected void finalize() {
        try {
            synchronized (this) {
                if (this.f6240c) {
                    return;
                }
                C1700a.m7011c(f6238a, "Finalized without closing: %x %x (type = %s)", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(this.f6241d)), this.f6241d.m7061c().getClass().getName());
                close();
            }
        } finally {
            super.finalize();
        }
    }

    /* renamed from: m */
    public synchronized C1716b<T> m7047m() {
        if (!m7050p()) {
            return null;
        }
        return m11778clone();
    }

    /* renamed from: n */
    public synchronized T m7048n() {
        C1691j.m6978b(!this.f6240c);
        return this.f6241d.m7061c();
    }

    /* renamed from: o */
    public int m7049o() {
        if (m7050p()) {
            return System.identityHashCode(this.f6241d.m7061c());
        }
        return 0;
    }

    /* renamed from: p */
    public synchronized boolean m7050p() {
        return !this.f6240c;
    }
}
