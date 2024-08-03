package com.facebook.imagepipeline.memory;

import android.annotation.SuppressLint;
import android.util.SparseArray;
import android.util.SparseIntArray;
import java.util.Set;
import p139d.p143b.p148c.p152d.C1691j;
import p139d.p143b.p148c.p152d.C1693l;
import p139d.p143b.p148c.p152d.C1699r;
import p139d.p143b.p148c.p153e.C1700a;
import p139d.p143b.p148c.p155g.InterfaceC1706c;
import p139d.p143b.p148c.p155g.InterfaceC1708e;

/* renamed from: com.facebook.imagepipeline.memory.a */
/* loaded from: classes.dex */
public abstract class AbstractC0988a<V> implements InterfaceC1708e<V> {

    /* renamed from: a */
    private final Class<?> f4123a = getClass();

    /* renamed from: b */
    final InterfaceC1706c f4124b;

    /* renamed from: c */
    final C1010w f4125c;

    /* renamed from: d */
    final SparseArray<C0993f<V>> f4126d;

    /* renamed from: e */
    final Set<V> f4127e;

    /* renamed from: f */
    private boolean f4128f;

    /* renamed from: g */
    final a f4129g;

    /* renamed from: h */
    final a f4130h;

    /* renamed from: i */
    private final InterfaceC1011x f4131i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.facebook.imagepipeline.memory.a$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        int f4132a;

        /* renamed from: b */
        int f4133b;

        a() {
        }

        /* renamed from: a */
        public void m4999a(int i) {
            int i2;
            int i3 = this.f4133b;
            if (i3 < i || (i2 = this.f4132a) <= 0) {
                C1700a.m7016d("com.facebook.imagepipeline.memory.BasePool.Counter", "Unexpected decrement of %d. Current numBytes = %d, count = %d", Integer.valueOf(i), Integer.valueOf(this.f4133b), Integer.valueOf(this.f4132a));
            } else {
                this.f4132a = i2 - 1;
                this.f4133b = i3 - i;
            }
        }

        /* renamed from: b */
        public void m5000b(int i) {
            this.f4132a++;
            this.f4133b += i;
        }
    }

    /* renamed from: com.facebook.imagepipeline.memory.a$b */
    /* loaded from: classes.dex */
    public static class b extends RuntimeException {
        public b(Object obj) {
            super("Invalid size: " + obj.toString());
        }
    }

    /* renamed from: com.facebook.imagepipeline.memory.a$c */
    /* loaded from: classes.dex */
    public static class c extends RuntimeException {
        public c(int i, int i2, int i3, int i4) {
            super("Pool hard cap violation? Hard cap = " + i + " Used size = " + i2 + " Free size = " + i3 + " Request size = " + i4);
        }
    }

    public AbstractC0988a(InterfaceC1706c interfaceC1706c, C1010w c1010w, InterfaceC1011x interfaceC1011x) {
        C1691j.m6971a(interfaceC1706c);
        this.f4124b = interfaceC1706c;
        C1691j.m6971a(c1010w);
        this.f4125c = c1010w;
        C1691j.m6971a(interfaceC1011x);
        this.f4131i = interfaceC1011x;
        this.f4126d = new SparseArray<>();
        if (this.f4125c.f4193f) {
            m4982e();
        } else {
            m4980b(new SparseIntArray(0));
        }
        this.f4127e = C1693l.m6982b();
        this.f4130h = new a();
        this.f4129g = new a();
    }

    /* renamed from: a */
    private void m4979a(SparseIntArray sparseIntArray) {
        this.f4126d.clear();
        for (int i = 0; i < sparseIntArray.size(); i++) {
            int keyAt = sparseIntArray.keyAt(i);
            this.f4126d.put(keyAt, new C0993f<>(mo4996e(keyAt), sparseIntArray.valueAt(i), 0, this.f4125c.f4193f));
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: b */
    private synchronized void m4980b(SparseIntArray sparseIntArray) {
        C1691j.m6971a(sparseIntArray);
        this.f4126d.clear();
        SparseIntArray sparseIntArray2 = this.f4125c.f4190c;
        if (sparseIntArray2 != null) {
            for (int i = 0; i < sparseIntArray2.size(); i++) {
                int keyAt = sparseIntArray2.keyAt(i);
                this.f4126d.put(keyAt, new C0993f<>(mo4996e(keyAt), sparseIntArray2.valueAt(i), sparseIntArray.get(keyAt, 0), this.f4125c.f4193f));
            }
            this.f4128f = false;
        } else {
            this.f4128f = true;
        }
    }

    /* renamed from: d */
    private synchronized void m4981d() {
        boolean z;
        if (m4989b() && this.f4130h.f4133b != 0) {
            z = false;
            C1691j.m6978b(z);
        }
        z = true;
        C1691j.m6978b(z);
    }

    /* renamed from: e */
    private synchronized void m4982e() {
        SparseIntArray sparseIntArray = this.f4125c.f4190c;
        if (sparseIntArray != null) {
            m4979a(sparseIntArray);
            this.f4128f = false;
        } else {
            this.f4128f = true;
        }
    }

    @SuppressLint({"InvalidAccessToGuardedField"})
    /* renamed from: f */
    private void m4983f() {
        if (C1700a.m7000a(2)) {
            C1700a.m6993a(this.f4123a, "Used = (%d, %d); Free = (%d, %d)", Integer.valueOf(this.f4129g.f4132a), Integer.valueOf(this.f4129g.f4133b), Integer.valueOf(this.f4130h.f4132a), Integer.valueOf(this.f4130h.f4133b));
        }
    }

    /* renamed from: h */
    private synchronized C0993f<V> m4984h(int i) {
        return this.f4126d.get(i);
    }

    /* renamed from: a */
    protected abstract V mo4985a(int i);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void m4986a() {
        this.f4124b.mo7037a(this);
        this.f4131i.mo5047a(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0080, code lost:            r2.m5011a();     */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p139d.p143b.p148c.p155g.InterfaceC1708e, p139d.p143b.p148c.p156h.InterfaceC1718d
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo4987a(V r8) {
        /*
            r7 = this;
            p139d.p143b.p148c.p152d.C1691j.m6971a(r8)
            int r0 = r7.mo4991c(r8)
            int r1 = r7.mo4996e(r0)
            monitor-enter(r7)
            com.facebook.imagepipeline.memory.f r2 = r7.m4984h(r0)     // Catch: java.lang.Throwable -> Lac
            java.util.Set<V> r3 = r7.f4127e     // Catch: java.lang.Throwable -> Lac
            boolean r3 = r3.remove(r8)     // Catch: java.lang.Throwable -> Lac
            r4 = 2
            if (r3 != 0) goto L3d
            java.lang.Class<?> r2 = r7.f4123a     // Catch: java.lang.Throwable -> Lac
            java.lang.String r3 = "release (free, value unrecognized) (object, size) = (%x, %s)"
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> Lac
            r5 = 0
            int r6 = java.lang.System.identityHashCode(r8)     // Catch: java.lang.Throwable -> Lac
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> Lac
            r4[r5] = r6     // Catch: java.lang.Throwable -> Lac
            r5 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> Lac
            r4[r5] = r0     // Catch: java.lang.Throwable -> Lac
            p139d.p143b.p148c.p153e.C1700a.m6995a(r2, r3, r4)     // Catch: java.lang.Throwable -> Lac
            r7.mo4988b(r8)     // Catch: java.lang.Throwable -> Lac
            com.facebook.imagepipeline.memory.x r8 = r7.f4131i     // Catch: java.lang.Throwable -> Lac
        L39:
            r8.mo5050c(r1)     // Catch: java.lang.Throwable -> Lac
            goto La7
        L3d:
            if (r2 == 0) goto L7e
            boolean r3 = r2.m5017e()     // Catch: java.lang.Throwable -> Lac
            if (r3 != 0) goto L7e
            boolean r3 = r7.m4989b()     // Catch: java.lang.Throwable -> Lac
            if (r3 != 0) goto L7e
            boolean r3 = r7.mo4995d(r8)     // Catch: java.lang.Throwable -> Lac
            if (r3 != 0) goto L52
            goto L7e
        L52:
            r2.m5014b(r8)     // Catch: java.lang.Throwable -> Lac
            com.facebook.imagepipeline.memory.a$a r2 = r7.f4130h     // Catch: java.lang.Throwable -> Lac
            r2.m5000b(r1)     // Catch: java.lang.Throwable -> Lac
            com.facebook.imagepipeline.memory.a$a r2 = r7.f4129g     // Catch: java.lang.Throwable -> Lac
            r2.m4999a(r1)     // Catch: java.lang.Throwable -> Lac
            com.facebook.imagepipeline.memory.x r2 = r7.f4131i     // Catch: java.lang.Throwable -> Lac
            r2.mo5051d(r1)     // Catch: java.lang.Throwable -> Lac
            boolean r1 = p139d.p143b.p148c.p153e.C1700a.m7000a(r4)     // Catch: java.lang.Throwable -> Lac
            if (r1 == 0) goto La7
            java.lang.Class<?> r1 = r7.f4123a     // Catch: java.lang.Throwable -> Lac
            java.lang.String r2 = "release (reuse) (object, size) = (%x, %s)"
            int r8 = java.lang.System.identityHashCode(r8)     // Catch: java.lang.Throwable -> Lac
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> Lac
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> Lac
            p139d.p143b.p148c.p153e.C1700a.m6991a(r1, r2, r8, r0)     // Catch: java.lang.Throwable -> Lac
            goto La7
        L7e:
            if (r2 == 0) goto L83
            r2.m5011a()     // Catch: java.lang.Throwable -> Lac
        L83:
            boolean r2 = p139d.p143b.p148c.p153e.C1700a.m7000a(r4)     // Catch: java.lang.Throwable -> Lac
            if (r2 == 0) goto L9c
            java.lang.Class<?> r2 = r7.f4123a     // Catch: java.lang.Throwable -> Lac
            java.lang.String r3 = "release (free) (object, size) = (%x, %s)"
            int r4 = java.lang.System.identityHashCode(r8)     // Catch: java.lang.Throwable -> Lac
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> Lac
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> Lac
            p139d.p143b.p148c.p153e.C1700a.m6991a(r2, r3, r4, r0)     // Catch: java.lang.Throwable -> Lac
        L9c:
            r7.mo4988b(r8)     // Catch: java.lang.Throwable -> Lac
            com.facebook.imagepipeline.memory.a$a r8 = r7.f4129g     // Catch: java.lang.Throwable -> Lac
            r8.m4999a(r1)     // Catch: java.lang.Throwable -> Lac
            com.facebook.imagepipeline.memory.x r8 = r7.f4131i     // Catch: java.lang.Throwable -> Lac
            goto L39
        La7:
            r7.m4983f()     // Catch: java.lang.Throwable -> Lac
            monitor-exit(r7)     // Catch: java.lang.Throwable -> Lac
            return
        Lac:
            r8 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> Lac
            throw r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.memory.AbstractC0988a.mo4987a(java.lang.Object):void");
    }

    /* renamed from: b */
    protected abstract void mo4988b(V v);

    /* renamed from: b */
    synchronized boolean m4989b() {
        boolean z;
        z = this.f4129g.f4133b + this.f4130h.f4133b > this.f4125c.f4189b;
        if (z) {
            this.f4131i.mo5045a();
        }
        return z;
    }

    /* renamed from: b */
    synchronized boolean m4990b(int i) {
        int i2 = this.f4125c.f4188a;
        if (i > i2 - this.f4129g.f4133b) {
            this.f4131i.mo5048b();
            return false;
        }
        int i3 = this.f4125c.f4189b;
        if (i > i3 - (this.f4129g.f4133b + this.f4130h.f4133b)) {
            m4998g(i3 - i);
        }
        if (i <= i2 - (this.f4129g.f4133b + this.f4130h.f4133b)) {
            return true;
        }
        this.f4131i.mo5048b();
        return false;
    }

    /* renamed from: c */
    protected abstract int mo4991c(V v);

    /* renamed from: c */
    synchronized C0993f<V> m4992c(int i) {
        C0993f<V> c0993f = this.f4126d.get(i);
        if (c0993f == null && this.f4128f) {
            if (C1700a.m7000a(2)) {
                C1700a.m7002b(this.f4123a, "creating new bucket %s", Integer.valueOf(i));
            }
            C0993f<V> mo4997f = mo4997f(i);
            this.f4126d.put(i, mo4997f);
            return mo4997f;
        }
        return c0993f;
    }

    /* renamed from: c */
    synchronized void m4993c() {
        if (m4989b()) {
            m4998g(this.f4125c.f4189b);
        }
    }

    /* renamed from: d */
    protected abstract int mo4994d(int i);

    /* renamed from: d */
    protected boolean mo4995d(V v) {
        C1691j.m6971a(v);
        return true;
    }

    /* renamed from: e */
    protected abstract int mo4996e(int i);

    /* renamed from: f */
    C0993f<V> mo4997f(int i) {
        return new C0993f<>(mo4996e(i), Integer.MAX_VALUE, 0, this.f4125c.f4193f);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: g */
    synchronized void m4998g(int i) {
        int min = Math.min((this.f4129g.f4133b + this.f4130h.f4133b) - i, this.f4130h.f4133b);
        if (min <= 0) {
            return;
        }
        if (C1700a.m7000a(2)) {
            C1700a.m6992a(this.f4123a, "trimToSize: TargetSize = %d; Initial Size = %d; Bytes to free = %d", Integer.valueOf(i), Integer.valueOf(this.f4129g.f4133b + this.f4130h.f4133b), Integer.valueOf(min));
        }
        m4983f();
        for (int i2 = 0; i2 < this.f4126d.size() && min > 0; i2++) {
            C0993f<V> valueAt = this.f4126d.valueAt(i2);
            while (min > 0) {
                V mo5018f = valueAt.mo5018f();
                if (mo5018f == null) {
                    break;
                }
                mo4988b((AbstractC0988a<V>) mo5018f);
                min -= valueAt.f4144a;
                this.f4130h.m4999a(valueAt.f4144a);
            }
        }
        m4983f();
        if (C1700a.m7000a(2)) {
            C1700a.m6991a(this.f4123a, "trimToSize: TargetSize = %d; Final Size = %d", Integer.valueOf(i), Integer.valueOf(this.f4129g.f4133b + this.f4130h.f4133b));
        }
    }

    @Override // p139d.p143b.p148c.p155g.InterfaceC1708e
    public V get(int i) {
        V m5013b;
        m4981d();
        int mo4994d = mo4994d(i);
        synchronized (this) {
            C0993f<V> m4992c = m4992c(mo4994d);
            if (m4992c != null && (m5013b = m4992c.m5013b()) != null) {
                C1691j.m6978b(this.f4127e.add(m5013b));
                int mo4991c = mo4991c((AbstractC0988a<V>) m5013b);
                int mo4996e = mo4996e(mo4991c);
                this.f4129g.m5000b(mo4996e);
                this.f4130h.m4999a(mo4996e);
                this.f4131i.mo5049b(mo4996e);
                m4983f();
                if (C1700a.m7000a(2)) {
                    C1700a.m6991a(this.f4123a, "get (reuse) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(m5013b)), Integer.valueOf(mo4991c));
                }
                return m5013b;
            }
            int mo4996e2 = mo4996e(mo4994d);
            if (!m4990b(mo4996e2)) {
                throw new c(this.f4125c.f4188a, this.f4129g.f4133b, this.f4130h.f4133b, mo4996e2);
            }
            this.f4129g.m5000b(mo4996e2);
            if (m4992c != null) {
                m4992c.m5016d();
            }
            V v = null;
            try {
                v = mo4985a(mo4994d);
            } catch (Throwable th) {
                synchronized (this) {
                    this.f4129g.m4999a(mo4996e2);
                    C0993f<V> m4992c2 = m4992c(mo4994d);
                    if (m4992c2 != null) {
                        m4992c2.m5011a();
                    }
                    C1699r.m6986b(th);
                }
            }
            synchronized (this) {
                C1691j.m6978b(this.f4127e.add(v));
                m4993c();
                this.f4131i.mo5046a(mo4996e2);
                m4983f();
                if (C1700a.m7000a(2)) {
                    C1700a.m6991a(this.f4123a, "get (alloc) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(v)), Integer.valueOf(mo4994d));
                }
            }
            return v;
        }
    }
}
