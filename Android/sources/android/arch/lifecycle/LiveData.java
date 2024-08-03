package android.arch.lifecycle;

import android.arch.lifecycle.AbstractC0144d;
import p000a.p001a.p002a.p003a.C0002c;
import p000a.p001a.p002a.p004b.C0007c;

/* loaded from: classes.dex */
public abstract class LiveData<T> {

    /* renamed from: a */
    private static final Object f562a = new Object();

    /* renamed from: b */
    private final Object f563b = new Object();

    /* renamed from: c */
    private C0007c<InterfaceC0154n<T>, LiveData<T>.AbstractC0140a> f564c = new C0007c<>();

    /* renamed from: d */
    private int f565d = 0;

    /* renamed from: e */
    private volatile Object f566e;

    /* renamed from: f */
    private volatile Object f567f;

    /* renamed from: g */
    private int f568g;

    /* renamed from: h */
    private boolean f569h;

    /* renamed from: i */
    private boolean f570i;

    /* renamed from: j */
    private final Runnable f571j;

    /* loaded from: classes.dex */
    class LifecycleBoundObserver extends LiveData<T>.AbstractC0140a implements GenericLifecycleObserver {

        /* renamed from: e */
        final InterfaceC0146f f572e;

        LifecycleBoundObserver(InterfaceC0146f interfaceC0146f, InterfaceC0154n<T> interfaceC0154n) {
            super(interfaceC0154n);
            this.f572e = interfaceC0146f;
        }

        @Override // android.arch.lifecycle.LiveData.AbstractC0140a
        /* renamed from: a */
        void mo697a() {
            this.f572e.mo714a().mo712b(this);
        }

        @Override // android.arch.lifecycle.GenericLifecycleObserver
        /* renamed from: a */
        public void mo675a(InterfaceC0146f interfaceC0146f, AbstractC0144d.a aVar) {
            if (this.f572e.mo714a().mo710a() == AbstractC0144d.b.DESTROYED) {
                LiveData.this.mo693a((InterfaceC0154n) this.f574a);
            } else {
                m700a(mo699b());
            }
        }

        @Override // android.arch.lifecycle.LiveData.AbstractC0140a
        /* renamed from: a */
        boolean mo698a(InterfaceC0146f interfaceC0146f) {
            return this.f572e == interfaceC0146f;
        }

        @Override // android.arch.lifecycle.LiveData.AbstractC0140a
        /* renamed from: b */
        boolean mo699b() {
            return this.f572e.mo714a().mo710a().m713a(AbstractC0144d.b.STARTED);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.arch.lifecycle.LiveData$a */
    /* loaded from: classes.dex */
    public abstract class AbstractC0140a {

        /* renamed from: a */
        final InterfaceC0154n<T> f574a;

        /* renamed from: b */
        boolean f575b;

        /* renamed from: c */
        int f576c = -1;

        AbstractC0140a(InterfaceC0154n<T> interfaceC0154n) {
            this.f574a = interfaceC0154n;
        }

        /* renamed from: a */
        void mo697a() {
        }

        /* renamed from: a */
        void m700a(boolean z) {
            if (z == this.f575b) {
                return;
            }
            this.f575b = z;
            boolean z2 = LiveData.this.f565d == 0;
            LiveData.this.f565d += this.f575b ? 1 : -1;
            if (z2 && this.f575b) {
                LiveData.this.mo695b();
            }
            if (LiveData.this.f565d == 0 && !this.f575b) {
                LiveData.this.mo696c();
            }
            if (this.f575b) {
                LiveData.this.m690b(this);
            }
        }

        /* renamed from: a */
        boolean mo698a(InterfaceC0146f interfaceC0146f) {
            return false;
        }

        /* renamed from: b */
        abstract boolean mo699b();
    }

    public LiveData() {
        Object obj = f562a;
        this.f566e = obj;
        this.f567f = obj;
        this.f568g = -1;
        this.f571j = new RunnableC0151k(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private void m686a(LiveData<T>.AbstractC0140a abstractC0140a) {
        if (abstractC0140a.f575b) {
            if (!abstractC0140a.mo699b()) {
                abstractC0140a.m700a(false);
                return;
            }
            int i = abstractC0140a.f576c;
            int i2 = this.f568g;
            if (i >= i2) {
                return;
            }
            abstractC0140a.f576c = i2;
            abstractC0140a.f574a.m737a(this.f566e);
        }
    }

    /* renamed from: a */
    private static void m688a(String str) {
        if (C0002c.m0b().mo2a()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m690b(LiveData<T>.AbstractC0140a abstractC0140a) {
        if (this.f569h) {
            this.f570i = true;
            return;
        }
        this.f569h = true;
        do {
            this.f570i = false;
            if (abstractC0140a != null) {
                m686a((AbstractC0140a) abstractC0140a);
                abstractC0140a = null;
            } else {
                C0007c<InterfaceC0154n<T>, LiveData<T>.AbstractC0140a>.d m10b = this.f564c.m10b();
                while (m10b.hasNext()) {
                    m686a((AbstractC0140a) m10b.next().getValue());
                    if (this.f570i) {
                        break;
                    }
                }
            }
        } while (this.f570i);
        this.f569h = false;
    }

    /* renamed from: a */
    public void m692a(InterfaceC0146f interfaceC0146f, InterfaceC0154n<T> interfaceC0154n) {
        if (interfaceC0146f.mo714a().mo710a() == AbstractC0144d.b.DESTROYED) {
            return;
        }
        LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(interfaceC0146f, interfaceC0154n);
        LiveData<T>.AbstractC0140a mo5b = this.f564c.mo5b(interfaceC0154n, lifecycleBoundObserver);
        if (mo5b != null && !mo5b.mo698a(interfaceC0146f)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (mo5b != null) {
            return;
        }
        interfaceC0146f.mo714a().mo711a(lifecycleBoundObserver);
    }

    /* renamed from: a */
    public void mo693a(InterfaceC0154n<T> interfaceC0154n) {
        m688a("removeObserver");
        LiveData<T>.AbstractC0140a remove = this.f564c.remove(interfaceC0154n);
        if (remove == null) {
            return;
        }
        remove.mo697a();
        remove.m700a(false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void mo694a(T t) {
        m688a("setValue");
        this.f568g++;
        this.f566e = t;
        m690b((AbstractC0140a) null);
    }

    /* renamed from: b */
    protected void mo695b() {
    }

    /* renamed from: c */
    protected void mo696c() {
    }
}
