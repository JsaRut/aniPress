package p139d.p143b.p161d;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import p139d.p143b.p148c.p150b.C1673a;
import p139d.p143b.p148c.p152d.C1690i;
import p139d.p143b.p148c.p152d.C1691j;
import p139d.p143b.p148c.p152d.InterfaceC1694m;

/* renamed from: d.b.d.k */
/* loaded from: classes.dex */
public class C1742k<T> implements InterfaceC1694m<InterfaceC1736e<T>> {

    /* renamed from: a */
    private final List<InterfaceC1694m<InterfaceC1736e<T>>> f6305a;

    /* renamed from: b */
    private final boolean f6306b;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d.b.d.k$a */
    /* loaded from: classes.dex */
    public class a extends AbstractC1734c<T> {

        /* renamed from: g */
        private ArrayList<InterfaceC1736e<T>> f6307g;

        /* renamed from: h */
        private int f6308h;

        /* renamed from: i */
        private int f6309i;

        /* renamed from: j */
        private AtomicInteger f6310j;

        /* renamed from: k */
        private Throwable f6311k;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d.b.d.k$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C2801a implements InterfaceC1739h<T> {

            /* renamed from: a */
            private int f6313a;

            public C2801a(int i) {
                this.f6313a = i;
            }

            @Override // p139d.p143b.p161d.InterfaceC1739h
            /* renamed from: a */
            public void mo7123a(InterfaceC1736e<T> interfaceC1736e) {
            }

            @Override // p139d.p143b.p161d.InterfaceC1739h
            /* renamed from: b */
            public void mo7124b(InterfaceC1736e<T> interfaceC1736e) {
                a.this.m7146a(this.f6313a, interfaceC1736e);
            }

            @Override // p139d.p143b.p161d.InterfaceC1739h
            /* renamed from: c */
            public void mo7125c(InterfaceC1736e<T> interfaceC1736e) {
                if (interfaceC1736e.mo7113a()) {
                    a.this.m7151b(this.f6313a, interfaceC1736e);
                } else if (interfaceC1736e.mo7117b()) {
                    a.this.m7146a(this.f6313a, interfaceC1736e);
                }
            }

            @Override // p139d.p143b.p161d.InterfaceC1739h
            /* renamed from: d */
            public void mo7126d(InterfaceC1736e<T> interfaceC1736e) {
                if (this.f6313a == 0) {
                    a.this.m7114a(interfaceC1736e.mo7119d());
                }
            }
        }

        public a() {
            if (C1742k.this.f6306b) {
                return;
            }
            m7154h();
        }

        /* renamed from: a */
        private synchronized InterfaceC1736e<T> m7145a(int i) {
            InterfaceC1736e<T> interfaceC1736e;
            interfaceC1736e = null;
            if (this.f6307g != null && i < this.f6307g.size()) {
                interfaceC1736e = this.f6307g.set(i, null);
            }
            return interfaceC1736e;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public void m7146a(int i, InterfaceC1736e<T> interfaceC1736e) {
            m7148a((InterfaceC1736e) m7153c(i, interfaceC1736e));
            if (i == 0) {
                this.f6311k = interfaceC1736e.mo7118c();
            }
            m7156j();
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0024 A[LOOP:0: B:16:0x0022->B:17:0x0024, LOOP_END] */
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private void m7147a(int r4, p139d.p143b.p161d.InterfaceC1736e<T> r5, boolean r6) {
            /*
                r3 = this;
                monitor-enter(r3)
                int r0 = r3.f6308h     // Catch: java.lang.Throwable -> L31
                int r1 = r3.f6308h     // Catch: java.lang.Throwable -> L31
                d.b.d.e r2 = r3.m7150b(r4)     // Catch: java.lang.Throwable -> L31
                if (r5 != r2) goto L2f
                int r5 = r3.f6308h     // Catch: java.lang.Throwable -> L31
                if (r4 != r5) goto L10
                goto L2f
            L10:
                d.b.d.e r5 = r3.m7155i()     // Catch: java.lang.Throwable -> L31
                if (r5 == 0) goto L1f
                if (r6 == 0) goto L1d
                int r5 = r3.f6308h     // Catch: java.lang.Throwable -> L31
                if (r4 >= r5) goto L1d
                goto L1f
            L1d:
                r4 = r1
                goto L21
            L1f:
                r3.f6308h = r4     // Catch: java.lang.Throwable -> L31
            L21:
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L31
            L22:
                if (r0 <= r4) goto L2e
                d.b.d.e r5 = r3.m7145a(r0)
                r3.m7148a(r5)
                int r0 = r0 + (-1)
                goto L22
            L2e:
                return
            L2f:
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L31
                return
            L31:
                r4 = move-exception
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L31
                throw r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p139d.p143b.p161d.C1742k.a.m7147a(int, d.b.d.e, boolean):void");
        }

        /* renamed from: a */
        private void m7148a(InterfaceC1736e<T> interfaceC1736e) {
            if (interfaceC1736e != null) {
                interfaceC1736e.close();
            }
        }

        /* renamed from: b */
        private synchronized InterfaceC1736e<T> m7150b(int i) {
            return (this.f6307g == null || i >= this.f6307g.size()) ? null : this.f6307g.get(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public void m7151b(int i, InterfaceC1736e<T> interfaceC1736e) {
            m7147a(i, interfaceC1736e, interfaceC1736e.mo7117b());
            if (interfaceC1736e == m7155i()) {
                m7115a((a) null, i == 0 && interfaceC1736e.mo7117b());
            }
            m7156j();
        }

        /* renamed from: c */
        private synchronized InterfaceC1736e<T> m7153c(int i, InterfaceC1736e<T> interfaceC1736e) {
            if (interfaceC1736e == m7155i()) {
                return null;
            }
            if (interfaceC1736e != m7150b(i)) {
                return interfaceC1736e;
            }
            return m7145a(i);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* renamed from: h */
        private void m7154h() {
            if (this.f6310j != null) {
                return;
            }
            synchronized (this) {
                if (this.f6310j == null) {
                    this.f6310j = new AtomicInteger(0);
                    int size = C1742k.this.f6305a.size();
                    this.f6309i = size;
                    this.f6308h = size;
                    this.f6307g = new ArrayList<>(size);
                    for (int i = 0; i < size; i++) {
                        InterfaceC1736e<T> interfaceC1736e = (InterfaceC1736e) ((InterfaceC1694m) C1742k.this.f6305a.get(i)).get();
                        this.f6307g.add(interfaceC1736e);
                        interfaceC1736e.mo7111a(new C2801a(i), C1673a.m6936a());
                        if (interfaceC1736e.mo7113a()) {
                            break;
                        }
                    }
                }
            }
        }

        /* renamed from: i */
        private synchronized InterfaceC1736e<T> m7155i() {
            return m7150b(this.f6308h);
        }

        /* renamed from: j */
        private void m7156j() {
            Throwable th;
            if (this.f6310j.incrementAndGet() != this.f6309i || (th = this.f6311k) == null) {
                return;
            }
            mo7116a(th);
        }

        @Override // p139d.p143b.p161d.AbstractC1734c, p139d.p143b.p161d.InterfaceC1736e
        /* renamed from: a */
        public synchronized boolean mo7113a() {
            boolean z;
            if (C1742k.this.f6306b) {
                m7154h();
            }
            InterfaceC1736e<T> m7155i = m7155i();
            if (m7155i != null) {
                z = m7155i.mo7113a();
            }
            return z;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // p139d.p143b.p161d.AbstractC1734c, p139d.p143b.p161d.InterfaceC1736e
        public boolean close() {
            if (C1742k.this.f6306b) {
                m7154h();
            }
            synchronized (this) {
                if (!super.close()) {
                    return false;
                }
                ArrayList<InterfaceC1736e<T>> arrayList = this.f6307g;
                this.f6307g = null;
                if (arrayList == null) {
                    return true;
                }
                for (int i = 0; i < arrayList.size(); i++) {
                    m7148a((InterfaceC1736e) arrayList.get(i));
                }
                return true;
            }
        }

        @Override // p139d.p143b.p161d.AbstractC1734c, p139d.p143b.p161d.InterfaceC1736e
        public synchronized T getResult() {
            InterfaceC1736e<T> m7155i;
            if (C1742k.this.f6306b) {
                m7154h();
            }
            m7155i = m7155i();
            return m7155i != null ? m7155i.getResult() : null;
        }
    }

    private C1742k(List<InterfaceC1694m<InterfaceC1736e<T>>> list, boolean z) {
        C1691j.m6975a(!list.isEmpty(), "List of suppliers is empty!");
        this.f6305a = list;
        this.f6306b = z;
    }

    /* renamed from: a */
    public static <T> C1742k<T> m7142a(List<InterfaceC1694m<InterfaceC1736e<T>>> list, boolean z) {
        return new C1742k<>(list, z);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1742k) {
            return C1690i.m6963a(this.f6305a, ((C1742k) obj).f6305a);
        }
        return false;
    }

    @Override // p139d.p143b.p148c.p152d.InterfaceC1694m
    public InterfaceC1736e<T> get() {
        return new a();
    }

    public int hashCode() {
        return this.f6305a.hashCode();
    }

    public String toString() {
        C1690i.a m6961a = C1690i.m6961a(this);
        m6961a.m6967a("list", this.f6305a);
        return m6961a.toString();
    }
}
