package p139d.p143b.p184i.p200n;

import android.graphics.Bitmap;
import java.util.Map;
import java.util.concurrent.Executor;
import p139d.p143b.p148c.p152d.C1687f;
import p139d.p143b.p148c.p152d.C1691j;
import p139d.p143b.p148c.p156h.C1716b;
import p139d.p143b.p184i.p189c.AbstractC1842f;
import p139d.p143b.p184i.p196j.AbstractC1918b;
import p139d.p143b.p184i.p196j.C1919c;
import p139d.p143b.p184i.p201o.InterfaceC2025e;
import p139d.p143b.p184i.p201o.InterfaceC2026f;
import p139d.p143b.p184i.p201o.InterfaceC2027g;

/* renamed from: d.b.i.n.la */
/* loaded from: classes.dex */
public class C1992la implements InterfaceC1996na<C1716b<AbstractC1918b>> {

    /* renamed from: a */
    private final InterfaceC1996na<C1716b<AbstractC1918b>> f7265a;

    /* renamed from: b */
    private final AbstractC1842f f7266b;

    /* renamed from: c */
    private final Executor f7267c;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d.b.i.n.la$a */
    /* loaded from: classes.dex */
    public class a extends AbstractC2005s<C1716b<AbstractC1918b>, C1716b<AbstractC1918b>> {

        /* renamed from: c */
        private final InterfaceC2002qa f7268c;

        /* renamed from: d */
        private final String f7269d;

        /* renamed from: e */
        private final InterfaceC2025e f7270e;

        /* renamed from: f */
        private boolean f7271f;

        /* renamed from: g */
        private C1716b<AbstractC1918b> f7272g;

        /* renamed from: h */
        private int f7273h;

        /* renamed from: i */
        private boolean f7274i;

        /* renamed from: j */
        private boolean f7275j;

        public a(InterfaceC1995n<C1716b<AbstractC1918b>> interfaceC1995n, InterfaceC2002qa interfaceC2002qa, String str, InterfaceC2025e interfaceC2025e, InterfaceC1998oa interfaceC1998oa) {
            super(interfaceC1995n);
            this.f7272g = null;
            this.f7273h = 0;
            this.f7274i = false;
            this.f7275j = false;
            this.f7268c = interfaceC2002qa;
            this.f7269d = str;
            this.f7270e = interfaceC2025e;
            interfaceC1998oa.mo8106a(new C1988ja(this, C1992la.this));
        }

        /* renamed from: a */
        private C1716b<AbstractC1918b> m8138a(AbstractC1918b abstractC1918b) {
            C1919c c1919c = (C1919c) abstractC1918b;
            C1716b<Bitmap> mo6000a = this.f7270e.mo6000a(c1919c.m7899t(), C1992la.this.f7266b);
            try {
                return C1716b.m7043a(new C1919c(mo6000a, abstractC1918b.mo7891o(), c1919c.m7898s(), c1919c.m7897r()));
            } finally {
                C1716b.m7045b(mo6000a);
            }
        }

        /* renamed from: a */
        private Map<String, String> m8140a(InterfaceC2002qa interfaceC2002qa, String str, InterfaceC2025e interfaceC2025e) {
            if (interfaceC2002qa.mo5343a(str)) {
                return C1687f.m6957a("Postprocessor", interfaceC2025e.getName());
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public void m8145b(C1716b<AbstractC1918b> c1716b, int i) {
            C1691j.m6974a(C1716b.m7046c(c1716b));
            if (!m8146b(c1716b.m7048n())) {
                m8148c(c1716b, i);
                return;
            }
            this.f7268c.mo5339a(this.f7269d, "PostprocessorProducer");
            try {
                try {
                    C1716b<AbstractC1918b> m8138a = m8138a(c1716b.m7048n());
                    this.f7268c.mo5345b(this.f7269d, "PostprocessorProducer", m8140a(this.f7268c, this.f7269d, this.f7270e));
                    m8148c(m8138a, i);
                    C1716b.m7045b(m8138a);
                } catch (Exception e2) {
                    this.f7268c.mo5341a(this.f7269d, "PostprocessorProducer", e2, m8140a(this.f7268c, this.f7269d, this.f7270e));
                    m8149c(e2);
                    C1716b.m7045b(null);
                }
            } catch (Throwable th) {
                C1716b.m7045b(null);
                throw th;
            }
        }

        /* renamed from: b */
        private boolean m8146b(AbstractC1918b abstractC1918b) {
            return abstractC1918b instanceof C1919c;
        }

        /* renamed from: c */
        private void m8148c(C1716b<AbstractC1918b> c1716b, int i) {
            boolean m8077a = AbstractC1973c.m8077a(i);
            if ((m8077a || m8154f()) && !(m8077a && m8153e())) {
                return;
            }
            m8188c().mo8085a(c1716b, i);
        }

        /* renamed from: c */
        private void m8149c(Throwable th) {
            if (m8153e()) {
                m8188c().mo8086a(th);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public void m8150d() {
            boolean m8156h;
            synchronized (this) {
                this.f7275j = false;
                m8156h = m8156h();
            }
            if (m8156h) {
                m8157i();
            }
        }

        /* renamed from: d */
        private void m8151d(C1716b<AbstractC1918b> c1716b, int i) {
            synchronized (this) {
                if (this.f7271f) {
                    return;
                }
                C1716b<AbstractC1918b> c1716b2 = this.f7272g;
                this.f7272g = C1716b.m7042a((C1716b) c1716b);
                this.f7273h = i;
                this.f7274i = true;
                boolean m8156h = m8156h();
                C1716b.m7045b(c1716b2);
                if (m8156h) {
                    m8157i();
                }
            }
        }

        /* renamed from: e */
        private boolean m8153e() {
            synchronized (this) {
                if (this.f7271f) {
                    return false;
                }
                C1716b<AbstractC1918b> c1716b = this.f7272g;
                this.f7272g = null;
                this.f7271f = true;
                C1716b.m7045b(c1716b);
                return true;
            }
        }

        /* renamed from: f */
        private synchronized boolean m8154f() {
            return this.f7271f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g */
        public void m8155g() {
            if (m8153e()) {
                m8188c().mo8082a();
            }
        }

        /* renamed from: h */
        private synchronized boolean m8156h() {
            if (this.f7271f || !this.f7274i || this.f7275j || !C1716b.m7046c(this.f7272g)) {
                return false;
            }
            this.f7275j = true;
            return true;
        }

        /* renamed from: i */
        private void m8157i() {
            C1992la.this.f7267c.execute(new RunnableC1990ka(this));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p139d.p143b.p184i.p200n.AbstractC1973c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo7860b(C1716b<AbstractC1918b> c1716b, int i) {
            if (C1716b.m7046c(c1716b)) {
                m8151d(c1716b, i);
            } else if (AbstractC1973c.m8077a(i)) {
                m8148c((C1716b<AbstractC1918b>) null, i);
            }
        }

        @Override // p139d.p143b.p184i.p200n.AbstractC2005s, p139d.p143b.p184i.p200n.AbstractC1973c
        /* renamed from: b */
        protected void mo7858b() {
            m8155g();
        }

        @Override // p139d.p143b.p184i.p200n.AbstractC2005s, p139d.p143b.p184i.p200n.AbstractC1973c
        /* renamed from: b */
        protected void mo7861b(Throwable th) {
            m8149c(th);
        }
    }

    /* renamed from: d.b.i.n.la$b */
    /* loaded from: classes.dex */
    class b extends AbstractC2005s<C1716b<AbstractC1918b>, C1716b<AbstractC1918b>> implements InterfaceC2027g {

        /* renamed from: c */
        private boolean f7277c;

        /* renamed from: d */
        private C1716b<AbstractC1918b> f7278d;

        private b(a aVar, InterfaceC2026f interfaceC2026f, InterfaceC1998oa interfaceC1998oa) {
            super(aVar);
            this.f7277c = false;
            this.f7278d = null;
            interfaceC2026f.m8286a(this);
            interfaceC1998oa.mo8106a(new C1994ma(this, C1992la.this));
        }

        /* renamed from: a */
        private void m8159a(C1716b<AbstractC1918b> c1716b) {
            synchronized (this) {
                if (this.f7277c) {
                    return;
                }
                C1716b<AbstractC1918b> c1716b2 = this.f7278d;
                this.f7278d = C1716b.m7042a((C1716b) c1716b);
                C1716b.m7045b(c1716b2);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public boolean m8161d() {
            synchronized (this) {
                if (this.f7277c) {
                    return false;
                }
                C1716b<AbstractC1918b> c1716b = this.f7278d;
                this.f7278d = null;
                this.f7277c = true;
                C1716b.m7045b(c1716b);
                return true;
            }
        }

        /* renamed from: e */
        private void m8162e() {
            synchronized (this) {
                if (this.f7277c) {
                    return;
                }
                C1716b<AbstractC1918b> m7042a = C1716b.m7042a((C1716b) this.f7278d);
                try {
                    m8188c().mo8085a(m7042a, 0);
                } finally {
                    C1716b.m7045b(m7042a);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p139d.p143b.p184i.p200n.AbstractC1973c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo7860b(C1716b<AbstractC1918b> c1716b, int i) {
            if (AbstractC1973c.m8079b(i)) {
                return;
            }
            m8159a(c1716b);
            m8162e();
        }

        @Override // p139d.p143b.p184i.p200n.AbstractC2005s, p139d.p143b.p184i.p200n.AbstractC1973c
        /* renamed from: b */
        protected void mo7858b() {
            if (m8161d()) {
                m8188c().mo8082a();
            }
        }

        @Override // p139d.p143b.p184i.p200n.AbstractC2005s, p139d.p143b.p184i.p200n.AbstractC1973c
        /* renamed from: b */
        protected void mo7861b(Throwable th) {
            if (m8161d()) {
                m8188c().mo8086a(th);
            }
        }
    }

    /* renamed from: d.b.i.n.la$c */
    /* loaded from: classes.dex */
    class c extends AbstractC2005s<C1716b<AbstractC1918b>, C1716b<AbstractC1918b>> {
        private c(a aVar) {
            super(aVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p139d.p143b.p184i.p200n.AbstractC1973c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo7860b(C1716b<AbstractC1918b> c1716b, int i) {
            if (AbstractC1973c.m8079b(i)) {
                return;
            }
            m8188c().mo8085a(c1716b, i);
        }
    }

    public C1992la(InterfaceC1996na<C1716b<AbstractC1918b>> interfaceC1996na, AbstractC1842f abstractC1842f, Executor executor) {
        C1691j.m6971a(interfaceC1996na);
        this.f7265a = interfaceC1996na;
        this.f7266b = abstractC1842f;
        C1691j.m6971a(executor);
        this.f7267c = executor;
    }

    @Override // p139d.p143b.p184i.p200n.InterfaceC1996na
    /* renamed from: a */
    public void mo7950a(InterfaceC1995n<C1716b<AbstractC1918b>> interfaceC1995n, InterfaceC1998oa interfaceC1998oa) {
        InterfaceC2002qa mo8111e = interfaceC1998oa.mo8111e();
        InterfaceC2025e m8240f = interfaceC1998oa.mo8109c().m8240f();
        a aVar = new a(interfaceC1995n, mo8111e, interfaceC1998oa.getId(), m8240f, interfaceC1998oa);
        this.f7265a.mo7950a(m8240f instanceof InterfaceC2026f ? new b(aVar, (InterfaceC2026f) m8240f, interfaceC1998oa) : new c(aVar), interfaceC1998oa);
    }
}
