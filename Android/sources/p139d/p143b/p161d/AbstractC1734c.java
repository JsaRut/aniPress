package p139d.p143b.p161d;

import android.util.Pair;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

/* renamed from: d.b.d.c */
/* loaded from: classes.dex */
public abstract class AbstractC1734c<T> implements InterfaceC1736e<T> {

    /* renamed from: c */
    private T f6290c = null;

    /* renamed from: d */
    private Throwable f6291d = null;

    /* renamed from: e */
    private float f6292e = 0.0f;

    /* renamed from: b */
    private boolean f6289b = false;

    /* renamed from: a */
    private a f6288a = a.IN_PROGRESS;

    /* renamed from: f */
    private final ConcurrentLinkedQueue<Pair<InterfaceC1739h<T>, Executor>> f6293f = new ConcurrentLinkedQueue<>();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d.b.d.c$a */
    /* loaded from: classes.dex */
    public enum a {
        IN_PROGRESS,
        SUCCESS,
        FAILURE
    }

    /* renamed from: a */
    private void m7105a(InterfaceC1739h<T> interfaceC1739h, Executor executor, boolean z, boolean z2) {
        executor.execute(new RunnableC1732a(this, z, interfaceC1739h, z2));
    }

    /* renamed from: b */
    private synchronized boolean m7106b(float f) {
        if (!this.f6289b && this.f6288a == a.IN_PROGRESS) {
            if (f < this.f6292e) {
                return false;
            }
            this.f6292e = f;
            return true;
        }
        return false;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:31:0x0039
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
        */
    /* renamed from: b */
    private boolean m7107b(T r4, boolean r5) {
        /*
            r3 = this;
            r0 = 0
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L3c
            boolean r1 = r3.f6289b     // Catch: java.lang.Throwable -> L39
            if (r1 != 0) goto L2d
            d.b.d.c$a r1 = r3.f6288a     // Catch: java.lang.Throwable -> L39
            d.b.d.c$a r2 = p139d.p143b.p161d.AbstractC1734c.a.IN_PROGRESS     // Catch: java.lang.Throwable -> L39
            if (r1 == r2) goto Ld
            goto L2d
        Ld:
            if (r5 == 0) goto L17
            d.b.d.c$a r5 = p139d.p143b.p161d.AbstractC1734c.a.SUCCESS     // Catch: java.lang.Throwable -> L39
            r3.f6288a = r5     // Catch: java.lang.Throwable -> L39
            r5 = 1065353216(0x3f800000, float:1.0)
            r3.f6292e = r5     // Catch: java.lang.Throwable -> L39
        L17:
            T r5 = r3.f6290c     // Catch: java.lang.Throwable -> L39
            if (r5 == r4) goto L24
            T r5 = r3.f6290c     // Catch: java.lang.Throwable -> L39
            r3.f6290c = r4     // Catch: java.lang.Throwable -> L21
            r4 = r5
            goto L25
        L21:
            r4 = move-exception
            r0 = r5
            goto L3a
        L24:
            r4 = r0
        L25:
            r5 = 1
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L35
            if (r4 == 0) goto L2c
            r3.mo7112a(r4)
        L2c:
            return r5
        L2d:
            r5 = 0
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L35
            if (r4 == 0) goto L34
            r3.mo7112a(r4)
        L34:
            return r5
        L35:
            r5 = move-exception
            r0 = r4
            r4 = r5
            goto L3a
        L39:
            r4 = move-exception
        L3a:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L39
            throw r4     // Catch: java.lang.Throwable -> L3c
        L3c:
            r4 = move-exception
            if (r0 == 0) goto L42
            r3.mo7112a(r0)
        L42:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p139d.p143b.p161d.AbstractC1734c.m7107b(java.lang.Object, boolean):boolean");
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: b */
    private synchronized boolean m7108b(Throwable th) {
        boolean z;
        if (!this.f6289b && this.f6288a == a.IN_PROGRESS) {
            this.f6288a = a.FAILURE;
            this.f6291d = th;
            z = true;
        }
        z = false;
        return z;
    }

    /* renamed from: h */
    private void m7109h() {
        boolean m7120e = m7120e();
        boolean m7110i = m7110i();
        Iterator<Pair<InterfaceC1739h<T>, Executor>> it = this.f6293f.iterator();
        while (it.hasNext()) {
            Pair<InterfaceC1739h<T>, Executor> next = it.next();
            m7105a((InterfaceC1739h) next.first, (Executor) next.second, m7120e, m7110i);
        }
    }

    /* renamed from: i */
    private synchronized boolean m7110i() {
        boolean z;
        if (m7121f()) {
            z = mo7117b() ? false : true;
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    @Override // p139d.p143b.p161d.InterfaceC1736e
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo7111a(p139d.p143b.p161d.InterfaceC1739h<T> r3, java.util.concurrent.Executor r4) {
        /*
            r2 = this;
            p139d.p143b.p148c.p152d.C1691j.m6971a(r3)
            p139d.p143b.p148c.p152d.C1691j.m6971a(r4)
            monitor-enter(r2)
            boolean r0 = r2.f6289b     // Catch: java.lang.Throwable -> L41
            if (r0 == 0) goto Ld
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L41
            return
        Ld:
            d.b.d.c$a r0 = r2.f6288a     // Catch: java.lang.Throwable -> L41
            d.b.d.c$a r1 = p139d.p143b.p161d.AbstractC1734c.a.IN_PROGRESS     // Catch: java.lang.Throwable -> L41
            if (r0 != r1) goto L1c
            java.util.concurrent.ConcurrentLinkedQueue<android.util.Pair<d.b.d.h<T>, java.util.concurrent.Executor>> r0 = r2.f6293f     // Catch: java.lang.Throwable -> L41
            android.util.Pair r1 = android.util.Pair.create(r3, r4)     // Catch: java.lang.Throwable -> L41
            r0.add(r1)     // Catch: java.lang.Throwable -> L41
        L1c:
            boolean r0 = r2.mo7113a()     // Catch: java.lang.Throwable -> L41
            if (r0 != 0) goto L31
            boolean r0 = r2.mo7117b()     // Catch: java.lang.Throwable -> L41
            if (r0 != 0) goto L31
            boolean r0 = r2.m7110i()     // Catch: java.lang.Throwable -> L41
            if (r0 == 0) goto L2f
            goto L31
        L2f:
            r0 = 0
            goto L32
        L31:
            r0 = 1
        L32:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L41
            if (r0 == 0) goto L40
            boolean r0 = r2.m7120e()
            boolean r1 = r2.m7110i()
            r2.m7105a(r3, r4, r0, r1)
        L40:
            return
        L41:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L41
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p139d.p143b.p161d.AbstractC1734c.mo7111a(d.b.d.h, java.util.concurrent.Executor):void");
    }

    /* renamed from: a */
    protected void mo7112a(T t) {
    }

    @Override // p139d.p143b.p161d.InterfaceC1736e
    /* renamed from: a */
    public synchronized boolean mo7113a() {
        return this.f6290c != null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public boolean m7114a(float f) {
        boolean m7106b = m7106b(f);
        if (m7106b) {
            m7122g();
        }
        return m7106b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public boolean m7115a(T t, boolean z) {
        boolean m7107b = m7107b(t, z);
        if (m7107b) {
            m7109h();
        }
        return m7107b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo7116a(Throwable th) {
        boolean m7108b = m7108b(th);
        if (m7108b) {
            m7109h();
        }
        return m7108b;
    }

    @Override // p139d.p143b.p161d.InterfaceC1736e
    /* renamed from: b */
    public synchronized boolean mo7117b() {
        return this.f6288a != a.IN_PROGRESS;
    }

    @Override // p139d.p143b.p161d.InterfaceC1736e
    /* renamed from: c */
    public synchronized Throwable mo7118c() {
        return this.f6291d;
    }

    @Override // p139d.p143b.p161d.InterfaceC1736e
    public boolean close() {
        synchronized (this) {
            if (this.f6289b) {
                return false;
            }
            this.f6289b = true;
            T t = this.f6290c;
            this.f6290c = null;
            if (t != null) {
                mo7112a((AbstractC1734c<T>) t);
            }
            if (!mo7117b()) {
                m7109h();
            }
            synchronized (this) {
                this.f6293f.clear();
            }
            return true;
        }
    }

    @Override // p139d.p143b.p161d.InterfaceC1736e
    /* renamed from: d */
    public synchronized float mo7119d() {
        return this.f6292e;
    }

    /* renamed from: e */
    public synchronized boolean m7120e() {
        return this.f6288a == a.FAILURE;
    }

    /* renamed from: f */
    public synchronized boolean m7121f() {
        return this.f6289b;
    }

    /* renamed from: g */
    protected void m7122g() {
        Iterator<Pair<InterfaceC1739h<T>, Executor>> it = this.f6293f.iterator();
        while (it.hasNext()) {
            Pair<InterfaceC1739h<T>, Executor> next = it.next();
            ((Executor) next.second).execute(new RunnableC1733b(this, (InterfaceC1739h) next.first));
        }
    }

    @Override // p139d.p143b.p161d.InterfaceC1736e
    public synchronized T getResult() {
        return this.f6290c;
    }
}
