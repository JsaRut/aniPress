package p139d.p143b.p184i.p200n;

import android.util.Pair;
import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import p139d.p143b.p148c.p152d.C1691j;
import p139d.p143b.p148c.p152d.C1693l;
import p139d.p143b.p184i.p191e.EnumC1880d;

/* renamed from: d.b.i.n.aa */
/* loaded from: classes.dex */
public abstract class AbstractC1970aa<K, T extends Closeable> implements InterfaceC1996na<T> {

    /* renamed from: a */
    final Map<K, AbstractC1970aa<K, T>.a> f7196a = new HashMap();

    /* renamed from: b */
    private final InterfaceC1996na<T> f7197b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d.b.i.n.aa$a */
    /* loaded from: classes.dex */
    public class a {

        /* renamed from: a */
        private final K f7198a;

        /* renamed from: b */
        private final CopyOnWriteArraySet<Pair<InterfaceC1995n<T>, InterfaceC1998oa>> f7199b = C1693l.m6981a();

        /* renamed from: c */
        private T f7200c;

        /* renamed from: d */
        private float f7201d;

        /* renamed from: e */
        private int f7202e;

        /* renamed from: f */
        private C1977e f7203f;

        /* renamed from: g */
        private AbstractC1970aa<K, T>.a.C2802a f7204g;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d.b.i.n.aa$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C2802a extends AbstractC1973c<T> {
            private C2802a() {
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // p139d.p143b.p184i.p200n.AbstractC1973c
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void mo7860b(T t, int i) {
                a.this.m8068a(this, t, i);
            }

            @Override // p139d.p143b.p184i.p200n.AbstractC1973c
            /* renamed from: b */
            protected void mo7858b() {
                a.this.m8066a(this);
            }

            @Override // p139d.p143b.p184i.p200n.AbstractC1973c
            /* renamed from: b */
            protected void mo7859b(float f) {
                a.this.m8067a(this, f);
            }

            @Override // p139d.p143b.p184i.p200n.AbstractC1973c
            /* renamed from: b */
            protected void mo7861b(Throwable th) {
                a.this.m8069a(this, th);
            }
        }

        public a(K k) {
            this.f7198a = k;
        }

        /* renamed from: a */
        private void m8051a(Pair<InterfaceC1995n<T>, InterfaceC1998oa> pair, InterfaceC1998oa interfaceC1998oa) {
            interfaceC1998oa.mo8106a(new C1968Z(this, pair));
        }

        /* renamed from: a */
        private void m8053a(Closeable closeable) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (IOException e2) {
                    throw new RuntimeException(e2);
                }
            }
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* renamed from: a */
        private synchronized boolean m8054a() {
            boolean z;
            Iterator<Pair<InterfaceC1995n<T>, InterfaceC1998oa>> it = this.f7199b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                if (((InterfaceC1998oa) it.next().second).mo8112f()) {
                    z = true;
                    break;
                }
            }
            return z;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* renamed from: b */
        private synchronized boolean m8056b() {
            boolean z;
            Iterator<Pair<InterfaceC1995n<T>, InterfaceC1998oa>> it = this.f7199b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = true;
                    break;
                }
                if (!((InterfaceC1998oa) it.next().second).mo8110d()) {
                    z = false;
                    break;
                }
            }
            return z;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* renamed from: c */
        private synchronized EnumC1880d m8057c() {
            EnumC1880d enumC1880d;
            enumC1880d = EnumC1880d.LOW;
            Iterator<Pair<InterfaceC1995n<T>, InterfaceC1998oa>> it = this.f7199b.iterator();
            while (it.hasNext()) {
                enumC1880d = EnumC1880d.m7659a(enumC1880d, ((InterfaceC1998oa) it.next().second).mo8107b());
            }
            return enumC1880d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public void m8060d() {
            synchronized (this) {
                boolean z = true;
                C1691j.m6974a(this.f7203f == null);
                if (this.f7204g != null) {
                    z = false;
                }
                C1691j.m6974a(z);
                if (this.f7199b.isEmpty()) {
                    AbstractC1970aa.this.m8047a((AbstractC1970aa) this.f7198a, (AbstractC1970aa<AbstractC1970aa, T>.a) this);
                    return;
                }
                InterfaceC1998oa interfaceC1998oa = (InterfaceC1998oa) this.f7199b.iterator().next().second;
                this.f7203f = new C1977e(interfaceC1998oa.mo8109c(), interfaceC1998oa.getId(), interfaceC1998oa.mo8111e(), interfaceC1998oa.mo8103a(), interfaceC1998oa.mo8113g(), m8056b(), m8054a(), m8057c());
                this.f7204g = new C2802a();
                AbstractC1970aa.this.f7197b.mo7950a(this.f7204g, this.f7203f);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public synchronized List<InterfaceC2000pa> m8061e() {
            if (this.f7203f == null) {
                return null;
            }
            return this.f7203f.m8105a(m8054a());
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public synchronized List<InterfaceC2000pa> m8063f() {
            if (this.f7203f == null) {
                return null;
            }
            return this.f7203f.m8108b(m8056b());
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g */
        public synchronized List<InterfaceC2000pa> m8065g() {
            if (this.f7203f == null) {
                return null;
            }
            return this.f7203f.m8104a(m8057c());
        }

        /* renamed from: a */
        public void m8066a(AbstractC1970aa<K, T>.a.C2802a c2802a) {
            synchronized (this) {
                if (this.f7204g != c2802a) {
                    return;
                }
                this.f7204g = null;
                this.f7203f = null;
                m8053a(this.f7200c);
                this.f7200c = null;
                m8060d();
            }
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* renamed from: a */
        public void m8067a(AbstractC1970aa<K, T>.a.C2802a c2802a, float f) {
            synchronized (this) {
                if (this.f7204g != c2802a) {
                    return;
                }
                this.f7201d = f;
                Iterator<Pair<InterfaceC1995n<T>, InterfaceC1998oa>> it = this.f7199b.iterator();
                while (it.hasNext()) {
                    Pair<InterfaceC1995n<T>, InterfaceC1998oa> next = it.next();
                    synchronized (next) {
                        ((InterfaceC1995n) next.first).mo8083a(f);
                    }
                }
            }
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* renamed from: a */
        public void m8068a(AbstractC1970aa<K, T>.a.C2802a c2802a, T t, int i) {
            synchronized (this) {
                if (this.f7204g != c2802a) {
                    return;
                }
                m8053a(this.f7200c);
                this.f7200c = null;
                Iterator<Pair<InterfaceC1995n<T>, InterfaceC1998oa>> it = this.f7199b.iterator();
                if (AbstractC1973c.m8079b(i)) {
                    this.f7200c = (T) AbstractC1970aa.this.mo8049a((AbstractC1970aa) t);
                    this.f7202e = i;
                } else {
                    this.f7199b.clear();
                    AbstractC1970aa.this.m8047a((AbstractC1970aa) this.f7198a, (AbstractC1970aa<AbstractC1970aa, T>.a) this);
                }
                while (it.hasNext()) {
                    Pair<InterfaceC1995n<T>, InterfaceC1998oa> next = it.next();
                    synchronized (next) {
                        ((InterfaceC1995n) next.first).mo8085a(t, i);
                    }
                }
            }
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* renamed from: a */
        public void m8069a(AbstractC1970aa<K, T>.a.C2802a c2802a, Throwable th) {
            synchronized (this) {
                if (this.f7204g != c2802a) {
                    return;
                }
                Iterator<Pair<InterfaceC1995n<T>, InterfaceC1998oa>> it = this.f7199b.iterator();
                this.f7199b.clear();
                AbstractC1970aa.this.m8047a((AbstractC1970aa) this.f7198a, (AbstractC1970aa<AbstractC1970aa, T>.a) this);
                m8053a(this.f7200c);
                this.f7200c = null;
                while (it.hasNext()) {
                    Pair<InterfaceC1995n<T>, InterfaceC1998oa> next = it.next();
                    synchronized (next) {
                        ((InterfaceC1995n) next.first).mo8086a(th);
                    }
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public boolean m8070a(InterfaceC1995n<T> interfaceC1995n, InterfaceC1998oa interfaceC1998oa) {
            Pair<InterfaceC1995n<T>, InterfaceC1998oa> create = Pair.create(interfaceC1995n, interfaceC1998oa);
            synchronized (this) {
                if (AbstractC1970aa.this.m8048b(this.f7198a) != this) {
                    return false;
                }
                this.f7199b.add(create);
                List<InterfaceC2000pa> m8063f = m8063f();
                List<InterfaceC2000pa> m8065g = m8065g();
                List<InterfaceC2000pa> m8061e = m8061e();
                Closeable closeable = this.f7200c;
                float f = this.f7201d;
                int i = this.f7202e;
                C1977e.m8101c(m8063f);
                C1977e.m8102d(m8065g);
                C1977e.m8100b(m8061e);
                synchronized (create) {
                    synchronized (this) {
                        if (closeable != this.f7200c) {
                            closeable = null;
                        } else if (closeable != null) {
                            closeable = AbstractC1970aa.this.mo8049a((AbstractC1970aa) closeable);
                        }
                    }
                    if (closeable != null) {
                        if (f > 0.0f) {
                            interfaceC1995n.mo8083a(f);
                        }
                        interfaceC1995n.mo8085a(closeable, i);
                        m8053a(closeable);
                    }
                }
                m8051a(create, interfaceC1998oa);
                return true;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC1970aa(InterfaceC1996na<T> interfaceC1996na) {
        this.f7197b = interfaceC1996na;
    }

    /* renamed from: a */
    private synchronized AbstractC1970aa<K, T>.a m8044a(K k) {
        AbstractC1970aa<K, T>.a aVar;
        aVar = new a(k);
        this.f7196a.put(k, aVar);
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public synchronized void m8047a(K k, AbstractC1970aa<K, T>.a aVar) {
        if (this.f7196a.get(k) == aVar) {
            this.f7196a.remove(k);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public synchronized AbstractC1970aa<K, T>.a m8048b(K k) {
        return this.f7196a.get(k);
    }

    /* renamed from: a */
    protected abstract T mo8049a(T t);

    /* renamed from: a */
    protected abstract K mo8050a(InterfaceC1998oa interfaceC1998oa);

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p139d.p143b.p184i.p200n.InterfaceC1996na
    /* renamed from: a */
    public void mo7950a(InterfaceC1995n<T> interfaceC1995n, InterfaceC1998oa interfaceC1998oa) {
        boolean z;
        AbstractC1970aa<K, T>.a m8048b;
        K mo8050a = mo8050a(interfaceC1998oa);
        do {
            z = false;
            synchronized (this) {
                m8048b = m8048b(mo8050a);
                if (m8048b == null) {
                    m8048b = m8044a((AbstractC1970aa<K, T>) mo8050a);
                    z = true;
                }
            }
        } while (!m8048b.m8070a(interfaceC1995n, interfaceC1998oa));
        if (z) {
            m8048b.m8060d();
        }
    }
}
