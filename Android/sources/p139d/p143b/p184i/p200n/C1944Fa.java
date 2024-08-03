package p139d.p143b.p184i.p200n;

import android.util.Pair;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import p139d.p143b.p148c.p152d.C1691j;

/* renamed from: d.b.i.n.Fa */
/* loaded from: classes.dex */
public class C1944Fa<T> implements InterfaceC1996na<T> {

    /* renamed from: a */
    private final InterfaceC1996na<T> f7124a;

    /* renamed from: b */
    private final int f7125b;

    /* renamed from: c */
    private int f7126c;

    /* renamed from: d */
    private final ConcurrentLinkedQueue<Pair<InterfaceC1995n<T>, InterfaceC1998oa>> f7127d;

    /* renamed from: e */
    private final Executor f7128e;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d.b.i.n.Fa$a */
    /* loaded from: classes.dex */
    public class a extends AbstractC2005s<T, T> {
        private a(InterfaceC1995n<T> interfaceC1995n) {
            super(interfaceC1995n);
        }

        /* renamed from: d */
        private void m7977d() {
            Pair pair;
            synchronized (C1944Fa.this) {
                pair = (Pair) C1944Fa.this.f7127d.poll();
                if (pair == null) {
                    C1944Fa.m7974b(C1944Fa.this);
                }
            }
            if (pair != null) {
                C1944Fa.this.f7128e.execute(new RunnableC1942Ea(this, pair));
            }
        }

        @Override // p139d.p143b.p184i.p200n.AbstractC2005s, p139d.p143b.p184i.p200n.AbstractC1973c
        /* renamed from: b */
        protected void mo7858b() {
            m8188c().mo8082a();
            m7977d();
        }

        @Override // p139d.p143b.p184i.p200n.AbstractC1973c
        /* renamed from: b */
        protected void mo7860b(T t, int i) {
            m8188c().mo8085a(t, i);
            if (AbstractC1973c.m8077a(i)) {
                m7977d();
            }
        }

        @Override // p139d.p143b.p184i.p200n.AbstractC2005s, p139d.p143b.p184i.p200n.AbstractC1973c
        /* renamed from: b */
        protected void mo7861b(Throwable th) {
            m8188c().mo8086a(th);
            m7977d();
        }
    }

    public C1944Fa(int i, Executor executor, InterfaceC1996na<T> interfaceC1996na) {
        this.f7125b = i;
        C1691j.m6971a(executor);
        this.f7128e = executor;
        C1691j.m6971a(interfaceC1996na);
        this.f7124a = interfaceC1996na;
        this.f7127d = new ConcurrentLinkedQueue<>();
        this.f7126c = 0;
    }

    /* renamed from: b */
    static /* synthetic */ int m7974b(C1944Fa c1944Fa) {
        int i = c1944Fa.f7126c;
        c1944Fa.f7126c = i - 1;
        return i;
    }

    @Override // p139d.p143b.p184i.p200n.InterfaceC1996na
    /* renamed from: a */
    public void mo7950a(InterfaceC1995n<T> interfaceC1995n, InterfaceC1998oa interfaceC1998oa) {
        boolean z;
        interfaceC1998oa.mo8111e().mo5339a(interfaceC1998oa.getId(), "ThrottlingProducer");
        synchronized (this) {
            z = true;
            if (this.f7126c >= this.f7125b) {
                this.f7127d.add(Pair.create(interfaceC1995n, interfaceC1998oa));
            } else {
                this.f7126c++;
                z = false;
            }
        }
        if (z) {
            return;
        }
        m7976b(interfaceC1995n, interfaceC1998oa);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m7976b(InterfaceC1995n<T> interfaceC1995n, InterfaceC1998oa interfaceC1998oa) {
        interfaceC1998oa.mo8111e().mo5345b(interfaceC1998oa.getId(), "ThrottlingProducer", null);
        this.f7124a.mo7950a(new a(interfaceC1995n), interfaceC1998oa);
    }
}
