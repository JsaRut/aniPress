package p139d.p143b.p184i.p190d;

import android.graphics.Bitmap;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import p139d.p143b.p148c.p152d.C1691j;
import p139d.p143b.p148c.p152d.InterfaceC1692k;
import p139d.p143b.p148c.p152d.InterfaceC1694m;
import p139d.p143b.p148c.p155g.InterfaceC1705b;
import p139d.p143b.p148c.p156h.C1716b;

/* renamed from: d.b.i.d.q */
/* loaded from: classes.dex */
public class C1867q<K, V> implements InterfaceC1844A<K, V>, InterfaceC1705b {

    /* renamed from: a */
    static final long f6824a = TimeUnit.MINUTES.toMillis(5);

    /* renamed from: b */
    final C1864n<K, b<K, V>> f6825b;

    /* renamed from: c */
    final C1864n<K, b<K, V>> f6826c;

    /* renamed from: e */
    private final InterfaceC1850G<V> f6828e;

    /* renamed from: f */
    private final a f6829f;

    /* renamed from: g */
    private final InterfaceC1694m<C1845B> f6830g;

    /* renamed from: h */
    protected C1845B f6831h;

    /* renamed from: d */
    final Map<Bitmap, Object> f6827d = new WeakHashMap();

    /* renamed from: i */
    private long f6832i = SystemClock.uptimeMillis();

    /* renamed from: d.b.i.d.q$a */
    /* loaded from: classes.dex */
    public interface a {
    }

    /* renamed from: d.b.i.d.q$b */
    /* loaded from: classes.dex */
    public static class b<K, V> {

        /* renamed from: a */
        public final K f6833a;

        /* renamed from: b */
        public final C1716b<V> f6834b;

        /* renamed from: c */
        public int f6835c;

        /* renamed from: d */
        public boolean f6836d;

        /* renamed from: e */
        public final c<K> f6837e;

        private b(K k, C1716b<V> c1716b, c<K> cVar) {
            C1691j.m6971a(k);
            this.f6833a = k;
            C1716b<V> m7042a = C1716b.m7042a((C1716b) c1716b);
            C1691j.m6971a(m7042a);
            this.f6834b = m7042a;
            this.f6835c = 0;
            this.f6836d = false;
            this.f6837e = cVar;
        }

        /* renamed from: a */
        static <K, V> b<K, V> m7635a(K k, C1716b<V> c1716b, c<K> cVar) {
            return new b<>(k, c1716b, cVar);
        }
    }

    /* renamed from: d.b.i.d.q$c */
    /* loaded from: classes.dex */
    public interface c<K> {
        /* renamed from: a */
        void m7636a(K k, boolean z);
    }

    public C1867q(InterfaceC1850G<V> interfaceC1850G, a aVar, InterfaceC1694m<C1845B> interfaceC1694m) {
        this.f6828e = interfaceC1850G;
        this.f6825b = new C1864n<>(m7614a(interfaceC1850G));
        this.f6826c = new C1864n<>(m7614a(interfaceC1850G));
        this.f6829f = aVar;
        this.f6830g = interfaceC1694m;
        this.f6831h = this.f6830g.get();
    }

    /* renamed from: a */
    private InterfaceC1850G<b<K, V>> m7614a(InterfaceC1850G<V> interfaceC1850G) {
        return new C1865o(this, interfaceC1850G);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: a */
    private synchronized ArrayList<b<K, V>> m7615a(int i, int i2) {
        int max = Math.max(i, 0);
        int max2 = Math.max(i2, 0);
        if (this.f6825b.m7605a() <= max && this.f6825b.m7612c() <= max2) {
            return null;
        }
        ArrayList<b<K, V>> arrayList = new ArrayList<>();
        while (true) {
            if (this.f6825b.m7605a() <= max && this.f6825b.m7612c() <= max2) {
                return arrayList;
            }
            K m7609b = this.f6825b.m7609b();
            this.f6825b.m7610b((C1864n<K, b<K, V>>) m7609b);
            arrayList.add(this.f6826c.m7610b((C1864n<K, b<K, V>>) m7609b));
        }
    }

    /* renamed from: a */
    private synchronized void m7616a(b<K, V> bVar) {
        C1691j.m6971a(bVar);
        C1691j.m6978b(bVar.f6835c > 0);
        bVar.f6835c--;
    }

    /* renamed from: a */
    private synchronized void m7618a(ArrayList<b<K, V>> arrayList) {
        if (arrayList != null) {
            Iterator<b<K, V>> it = arrayList.iterator();
            while (it.hasNext()) {
                m7623c(it.next());
            }
        }
    }

    /* renamed from: b */
    private synchronized void m7619b(b<K, V> bVar) {
        C1691j.m6971a(bVar);
        C1691j.m6978b(!bVar.f6836d);
        bVar.f6835c++;
    }

    /* renamed from: b */
    private void m7620b(ArrayList<b<K, V>> arrayList) {
        if (arrayList != null) {
            Iterator<b<K, V>> it = arrayList.iterator();
            while (it.hasNext()) {
                C1716b.m7045b(m7630h(it.next()));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:            if (m7634b() <= (r3.f6831h.f6780a - r4)) goto L50;     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private synchronized boolean m7621b(V r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            d.b.i.d.G<V> r0 = r3.f6828e     // Catch: java.lang.Throwable -> L28
            int r4 = r0.mo7579a(r4)     // Catch: java.lang.Throwable -> L28
            d.b.i.d.B r0 = r3.f6831h     // Catch: java.lang.Throwable -> L28
            int r0 = r0.f6784e     // Catch: java.lang.Throwable -> L28
            r1 = 1
            if (r4 > r0) goto L25
            int r0 = r3.m7632a()     // Catch: java.lang.Throwable -> L28
            d.b.i.d.B r2 = r3.f6831h     // Catch: java.lang.Throwable -> L28
            int r2 = r2.f6781b     // Catch: java.lang.Throwable -> L28
            int r2 = r2 - r1
            if (r0 > r2) goto L25
            int r0 = r3.m7634b()     // Catch: java.lang.Throwable -> L28
            d.b.i.d.B r2 = r3.f6831h     // Catch: java.lang.Throwable -> L28
            int r2 = r2.f6780a     // Catch: java.lang.Throwable -> L28
            int r2 = r2 - r4
            if (r0 > r2) goto L25
            goto L26
        L25:
            r1 = 0
        L26:
            monitor-exit(r3)
            return r1
        L28:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p139d.p143b.p184i.p190d.C1867q.m7621b(java.lang.Object):boolean");
    }

    /* renamed from: c */
    private void m7622c() {
        ArrayList<b<K, V>> m7615a;
        synchronized (this) {
            m7615a = m7615a(Math.min(this.f6831h.f6783d, this.f6831h.f6781b - m7632a()), Math.min(this.f6831h.f6782c, this.f6831h.f6780a - m7634b()));
            m7618a(m7615a);
        }
        m7620b((ArrayList) m7615a);
        m7624c(m7615a);
    }

    /* renamed from: c */
    private synchronized void m7623c(b<K, V> bVar) {
        C1691j.m6971a(bVar);
        C1691j.m6978b(!bVar.f6836d);
        bVar.f6836d = true;
    }

    /* renamed from: c */
    private void m7624c(ArrayList<b<K, V>> arrayList) {
        if (arrayList != null) {
            Iterator<b<K, V>> it = arrayList.iterator();
            while (it.hasNext()) {
                m7628f(it.next());
            }
        }
    }

    /* renamed from: d */
    private synchronized void m7625d() {
        if (this.f6832i + f6824a > SystemClock.uptimeMillis()) {
            return;
        }
        this.f6832i = SystemClock.uptimeMillis();
        this.f6831h = this.f6830g.get();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: d */
    private synchronized boolean m7626d(b<K, V> bVar) {
        boolean z;
        if (bVar.f6836d || bVar.f6835c != 0) {
            z = false;
        } else {
            this.f6825b.m7607a(bVar.f6833a, bVar);
            z = true;
        }
        return z;
    }

    /* renamed from: e */
    private static <K, V> void m7627e(b<K, V> bVar) {
        c<K> cVar;
        if (bVar == null || (cVar = bVar.f6837e) == null) {
            return;
        }
        cVar.m7636a(bVar.f6833a, true);
    }

    /* renamed from: f */
    private static <K, V> void m7628f(b<K, V> bVar) {
        c<K> cVar;
        if (bVar == null || (cVar = bVar.f6837e) == null) {
            return;
        }
        cVar.m7636a(bVar.f6833a, false);
    }

    /* renamed from: g */
    private synchronized C1716b<V> m7629g(b<K, V> bVar) {
        m7619b((b) bVar);
        return C1716b.m7044a(bVar.f6834b.m7048n(), new C1866p(this, bVar));
    }

    /* renamed from: h */
    private synchronized C1716b<V> m7630h(b<K, V> bVar) {
        C1691j.m6971a(bVar);
        return (bVar.f6836d && bVar.f6835c == 0) ? bVar.f6834b : null;
    }

    /* renamed from: i */
    public void m7631i(b<K, V> bVar) {
        boolean m7626d;
        C1716b<V> m7630h;
        C1691j.m6971a(bVar);
        synchronized (this) {
            m7616a(bVar);
            m7626d = m7626d(bVar);
            m7630h = m7630h(bVar);
        }
        C1716b.m7045b(m7630h);
        if (!m7626d) {
            bVar = null;
        }
        m7627e(bVar);
        m7625d();
        m7622c();
    }

    /* renamed from: a */
    public synchronized int m7632a() {
        return this.f6826c.m7605a() - this.f6825b.m7605a();
    }

    @Override // p139d.p143b.p184i.p190d.InterfaceC1844A
    /* renamed from: a */
    public int mo7551a(InterfaceC1692k<K> interfaceC1692k) {
        ArrayList<b<K, V>> m7611b;
        ArrayList<b<K, V>> m7611b2;
        synchronized (this) {
            m7611b = this.f6825b.m7611b((InterfaceC1692k) interfaceC1692k);
            m7611b2 = this.f6826c.m7611b((InterfaceC1692k) interfaceC1692k);
            m7618a(m7611b2);
        }
        m7620b((ArrayList) m7611b2);
        m7624c(m7611b);
        m7625d();
        m7622c();
        return m7611b2.size();
    }

    @Override // p139d.p143b.p184i.p190d.InterfaceC1844A
    /* renamed from: a */
    public C1716b<V> mo7552a(K k, C1716b<V> c1716b) {
        return m7633a(k, c1716b, null);
    }

    /* renamed from: a */
    public C1716b<V> m7633a(K k, C1716b<V> c1716b, c<K> cVar) {
        b<K, V> m7610b;
        C1716b<V> c1716b2;
        C1716b<V> c1716b3;
        C1691j.m6971a(k);
        C1691j.m6971a(c1716b);
        m7625d();
        synchronized (this) {
            m7610b = this.f6825b.m7610b((C1864n<K, b<K, V>>) k);
            b<K, V> m7610b2 = this.f6826c.m7610b((C1864n<K, b<K, V>>) k);
            c1716b2 = null;
            if (m7610b2 != null) {
                m7623c(m7610b2);
                c1716b3 = m7630h(m7610b2);
            } else {
                c1716b3 = null;
            }
            if (m7621b((C1867q<K, V>) c1716b.m7048n())) {
                b<K, V> m7635a = b.m7635a(k, c1716b, cVar);
                this.f6826c.m7607a(k, m7635a);
                c1716b2 = m7629g(m7635a);
            }
        }
        C1716b.m7045b(c1716b3);
        m7628f(m7610b);
        m7622c();
        return c1716b2;
    }

    /* renamed from: b */
    public synchronized int m7634b() {
        return this.f6826c.m7612c() - this.f6825b.m7612c();
    }

    @Override // p139d.p143b.p184i.p190d.InterfaceC1844A
    /* renamed from: b */
    public synchronized boolean mo7553b(InterfaceC1692k<K> interfaceC1692k) {
        return !this.f6826c.m7608a((InterfaceC1692k) interfaceC1692k).isEmpty();
    }

    @Override // p139d.p143b.p184i.p190d.InterfaceC1844A
    public C1716b<V> get(K k) {
        b<K, V> m7610b;
        C1716b<V> m7629g;
        C1691j.m6971a(k);
        synchronized (this) {
            m7610b = this.f6825b.m7610b((C1864n<K, b<K, V>>) k);
            b<K, V> m7606a = this.f6826c.m7606a((C1864n<K, b<K, V>>) k);
            m7629g = m7606a != null ? m7629g(m7606a) : null;
        }
        m7628f(m7610b);
        m7625d();
        m7622c();
        return m7629g;
    }
}
