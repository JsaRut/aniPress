package p139d.p143b.p161d;

import java.util.List;
import p139d.p143b.p148c.p150b.C1673a;
import p139d.p143b.p148c.p152d.C1690i;
import p139d.p143b.p148c.p152d.C1691j;
import p139d.p143b.p148c.p152d.InterfaceC1694m;

/* renamed from: d.b.d.j */
/* loaded from: classes.dex */
public class C1741j<T> implements InterfaceC1694m<InterfaceC1736e<T>> {

    /* renamed from: a */
    private final List<InterfaceC1694m<InterfaceC1736e<T>>> f6299a;

    /* renamed from: d.b.d.j$a */
    /* loaded from: classes.dex */
    public class a extends AbstractC1734c<T> {

        /* renamed from: g */
        private int f6300g = 0;

        /* renamed from: h */
        private InterfaceC1736e<T> f6301h = null;

        /* renamed from: i */
        private InterfaceC1736e<T> f6302i = null;

        /* renamed from: d.b.d.j$a$a */
        /* loaded from: classes.dex */
        public class C2800a implements InterfaceC1739h<T> {
            private C2800a() {
            }

            /* synthetic */ C2800a(a aVar, C1740i c1740i) {
                this();
            }

            @Override // p139d.p143b.p161d.InterfaceC1739h
            /* renamed from: a */
            public void mo7123a(InterfaceC1736e<T> interfaceC1736e) {
            }

            @Override // p139d.p143b.p161d.InterfaceC1739h
            /* renamed from: b */
            public void mo7124b(InterfaceC1736e<T> interfaceC1736e) {
                a.this.m7136c(interfaceC1736e);
            }

            @Override // p139d.p143b.p161d.InterfaceC1739h
            /* renamed from: c */
            public void mo7125c(InterfaceC1736e<T> interfaceC1736e) {
                if (interfaceC1736e.mo7113a()) {
                    a.this.m7137d(interfaceC1736e);
                } else if (interfaceC1736e.mo7117b()) {
                    a.this.m7136c(interfaceC1736e);
                }
            }

            @Override // p139d.p143b.p161d.InterfaceC1739h
            /* renamed from: d */
            public void mo7126d(InterfaceC1736e<T> interfaceC1736e) {
                a.this.m7114a(Math.max(a.this.mo7119d(), interfaceC1736e.mo7119d()));
            }
        }

        public a() {
            if (m7141j()) {
                return;
            }
            mo7116a((Throwable) new RuntimeException("No data source supplier or supplier returned null."));
        }

        /* renamed from: a */
        private void m7131a(InterfaceC1736e<T> interfaceC1736e, boolean z) {
            InterfaceC1736e<T> interfaceC1736e2;
            synchronized (this) {
                if (interfaceC1736e == this.f6301h && interfaceC1736e != this.f6302i) {
                    if (this.f6302i != null && !z) {
                        interfaceC1736e2 = null;
                        m7134b(interfaceC1736e2);
                    }
                    InterfaceC1736e<T> interfaceC1736e3 = this.f6302i;
                    this.f6302i = interfaceC1736e;
                    interfaceC1736e2 = interfaceC1736e3;
                    m7134b(interfaceC1736e2);
                }
            }
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* renamed from: a */
        private synchronized boolean m7133a(InterfaceC1736e<T> interfaceC1736e) {
            boolean z;
            if (!m7121f() && interfaceC1736e == this.f6301h) {
                this.f6301h = null;
                z = true;
            }
            z = false;
            return z;
        }

        /* renamed from: b */
        private void m7134b(InterfaceC1736e<T> interfaceC1736e) {
            if (interfaceC1736e != null) {
                interfaceC1736e.close();
            }
        }

        /* renamed from: c */
        public void m7136c(InterfaceC1736e<T> interfaceC1736e) {
            if (m7133a((InterfaceC1736e) interfaceC1736e)) {
                if (interfaceC1736e != m7139h()) {
                    m7134b(interfaceC1736e);
                }
                if (m7141j()) {
                    return;
                }
                mo7116a(interfaceC1736e.mo7118c());
            }
        }

        /* renamed from: d */
        public void m7137d(InterfaceC1736e<T> interfaceC1736e) {
            m7131a((InterfaceC1736e) interfaceC1736e, interfaceC1736e.mo7117b());
            if (interfaceC1736e == m7139h()) {
                m7115a((a) null, interfaceC1736e.mo7117b());
            }
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* renamed from: e */
        private synchronized boolean m7138e(InterfaceC1736e<T> interfaceC1736e) {
            boolean z;
            if (m7121f()) {
                z = false;
            } else {
                this.f6301h = interfaceC1736e;
                z = true;
            }
            return z;
        }

        /* renamed from: h */
        private synchronized InterfaceC1736e<T> m7139h() {
            return this.f6302i;
        }

        /* renamed from: i */
        private synchronized InterfaceC1694m<InterfaceC1736e<T>> m7140i() {
            if (m7121f() || this.f6300g >= C1741j.this.f6299a.size()) {
                return null;
            }
            List list = C1741j.this.f6299a;
            int i = this.f6300g;
            this.f6300g = i + 1;
            return (InterfaceC1694m) list.get(i);
        }

        /* renamed from: j */
        private boolean m7141j() {
            InterfaceC1694m<InterfaceC1736e<T>> m7140i = m7140i();
            InterfaceC1736e<T> interfaceC1736e = m7140i != null ? m7140i.get() : null;
            if (!m7138e(interfaceC1736e) || interfaceC1736e == null) {
                m7134b(interfaceC1736e);
                return false;
            }
            interfaceC1736e.mo7111a(new C2800a(), C1673a.m6936a());
            return true;
        }

        @Override // p139d.p143b.p161d.AbstractC1734c, p139d.p143b.p161d.InterfaceC1736e
        /* renamed from: a */
        public synchronized boolean mo7113a() {
            boolean z;
            InterfaceC1736e<T> m7139h = m7139h();
            if (m7139h != null) {
                z = m7139h.mo7113a();
            }
            return z;
        }

        @Override // p139d.p143b.p161d.AbstractC1734c, p139d.p143b.p161d.InterfaceC1736e
        public boolean close() {
            synchronized (this) {
                if (!super.close()) {
                    return false;
                }
                InterfaceC1736e<T> interfaceC1736e = this.f6301h;
                this.f6301h = null;
                InterfaceC1736e<T> interfaceC1736e2 = this.f6302i;
                this.f6302i = null;
                m7134b(interfaceC1736e2);
                m7134b(interfaceC1736e);
                return true;
            }
        }

        @Override // p139d.p143b.p161d.AbstractC1734c, p139d.p143b.p161d.InterfaceC1736e
        public synchronized T getResult() {
            InterfaceC1736e<T> m7139h;
            m7139h = m7139h();
            return m7139h != null ? m7139h.getResult() : null;
        }
    }

    private C1741j(List<InterfaceC1694m<InterfaceC1736e<T>>> list) {
        C1691j.m6975a(!list.isEmpty(), "List of suppliers is empty!");
        this.f6299a = list;
    }

    /* renamed from: a */
    public static <T> C1741j<T> m7129a(List<InterfaceC1694m<InterfaceC1736e<T>>> list) {
        return new C1741j<>(list);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1741j) {
            return C1690i.m6963a(this.f6299a, ((C1741j) obj).f6299a);
        }
        return false;
    }

    @Override // p139d.p143b.p148c.p152d.InterfaceC1694m
    public InterfaceC1736e<T> get() {
        return new a();
    }

    public int hashCode() {
        return this.f6299a.hashCode();
    }

    public String toString() {
        C1690i.a m6961a = C1690i.m6961a(this);
        m6961a.m6967a("list", this.f6299a);
        return m6961a.toString();
    }
}
