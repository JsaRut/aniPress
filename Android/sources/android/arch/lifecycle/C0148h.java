package android.arch.lifecycle;

import android.arch.lifecycle.AbstractC0144d;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import p000a.p001a.p002a.p004b.C0005a;
import p000a.p001a.p002a.p004b.C0007c;

/* renamed from: android.arch.lifecycle.h */
/* loaded from: classes.dex */
public class C0148h extends AbstractC0144d {

    /* renamed from: c */
    private final WeakReference<InterfaceC0146f> f599c;

    /* renamed from: a */
    private C0005a<InterfaceC0145e, a> f597a = new C0005a<>();

    /* renamed from: d */
    private int f600d = 0;

    /* renamed from: e */
    private boolean f601e = false;

    /* renamed from: f */
    private boolean f602f = false;

    /* renamed from: g */
    private ArrayList<AbstractC0144d.b> f603g = new ArrayList<>();

    /* renamed from: b */
    private AbstractC0144d.b f598b = AbstractC0144d.b.INITIALIZED;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: android.arch.lifecycle.h$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        AbstractC0144d.b f604a;

        /* renamed from: b */
        GenericLifecycleObserver f605b;

        a(InterfaceC0145e interfaceC0145e, AbstractC0144d.b bVar) {
            this.f605b = C0150j.m730a(interfaceC0145e);
            this.f604a = bVar;
        }

        /* renamed from: a */
        void m729a(InterfaceC0146f interfaceC0146f, AbstractC0144d.a aVar) {
            AbstractC0144d.b m715a = C0148h.m715a(aVar);
            this.f604a = C0148h.m716a(this.f604a, m715a);
            this.f605b.mo675a(interfaceC0146f, aVar);
            this.f604a = m715a;
        }
    }

    public C0148h(InterfaceC0146f interfaceC0146f) {
        this.f599c = new WeakReference<>(interfaceC0146f);
    }

    /* renamed from: a */
    static AbstractC0144d.b m715a(AbstractC0144d.a aVar) {
        switch (C0147g.f595a[aVar.ordinal()]) {
            case 1:
            case 2:
                return AbstractC0144d.b.CREATED;
            case 3:
            case 4:
                return AbstractC0144d.b.STARTED;
            case 5:
                return AbstractC0144d.b.RESUMED;
            case 6:
                return AbstractC0144d.b.DESTROYED;
            default:
                throw new IllegalArgumentException("Unexpected event value " + aVar);
        }
    }

    /* renamed from: a */
    static AbstractC0144d.b m716a(AbstractC0144d.b bVar, AbstractC0144d.b bVar2) {
        return (bVar2 == null || bVar2.compareTo(bVar) >= 0) ? bVar : bVar2;
    }

    /* renamed from: a */
    private void m717a(InterfaceC0146f interfaceC0146f) {
        Iterator<Map.Entry<InterfaceC0145e, a>> descendingIterator = this.f597a.descendingIterator();
        while (descendingIterator.hasNext() && !this.f602f) {
            Map.Entry<InterfaceC0145e, a> next = descendingIterator.next();
            a value = next.getValue();
            while (value.f604a.compareTo(this.f598b) > 0 && !this.f602f && this.f597a.contains(next.getKey())) {
                AbstractC0144d.a m718b = m718b(value.f604a);
                m725d(m715a(m718b));
                value.m729a(interfaceC0146f, m718b);
                m722c();
            }
        }
    }

    /* renamed from: b */
    private static AbstractC0144d.a m718b(AbstractC0144d.b bVar) {
        int i = C0147g.f596b[bVar.ordinal()];
        if (i == 1) {
            throw new IllegalArgumentException();
        }
        if (i == 2) {
            return AbstractC0144d.a.ON_DESTROY;
        }
        if (i == 3) {
            return AbstractC0144d.a.ON_STOP;
        }
        if (i == 4) {
            return AbstractC0144d.a.ON_PAUSE;
        }
        if (i == 5) {
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException("Unexpected state value " + bVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    private void m719b(InterfaceC0146f interfaceC0146f) {
        C0007c<InterfaceC0145e, a>.d m10b = this.f597a.m10b();
        while (m10b.hasNext() && !this.f602f) {
            Map.Entry next = m10b.next();
            a aVar = (a) next.getValue();
            while (aVar.f604a.compareTo(this.f598b) < 0 && !this.f602f && this.f597a.contains(next.getKey())) {
                m725d(aVar.f604a);
                aVar.m729a(interfaceC0146f, m726e(aVar.f604a));
                m722c();
            }
        }
    }

    /* renamed from: b */
    private boolean m720b() {
        if (this.f597a.size() == 0) {
            return true;
        }
        AbstractC0144d.b bVar = this.f597a.m9a().getValue().f604a;
        AbstractC0144d.b bVar2 = this.f597a.m11c().getValue().f604a;
        return bVar == bVar2 && this.f598b == bVar2;
    }

    /* renamed from: c */
    private AbstractC0144d.b m721c(InterfaceC0145e interfaceC0145e) {
        Map.Entry<InterfaceC0145e, a> m6b = this.f597a.m6b(interfaceC0145e);
        AbstractC0144d.b bVar = null;
        AbstractC0144d.b bVar2 = m6b != null ? m6b.getValue().f604a : null;
        if (!this.f603g.isEmpty()) {
            bVar = this.f603g.get(r0.size() - 1);
        }
        return m716a(m716a(this.f598b, bVar2), bVar);
    }

    /* renamed from: c */
    private void m722c() {
        this.f603g.remove(r0.size() - 1);
    }

    /* renamed from: c */
    private void m723c(AbstractC0144d.b bVar) {
        if (this.f598b == bVar) {
            return;
        }
        this.f598b = bVar;
        if (this.f601e || this.f600d != 0) {
            this.f602f = true;
            return;
        }
        this.f601e = true;
        m724d();
        this.f601e = false;
    }

    /* renamed from: d */
    private void m724d() {
        InterfaceC0146f interfaceC0146f = this.f599c.get();
        if (interfaceC0146f == null) {
            Log.w("LifecycleRegistry", "LifecycleOwner is garbage collected, you shouldn't try dispatch new events from it.");
            return;
        }
        while (!m720b()) {
            this.f602f = false;
            if (this.f598b.compareTo(this.f597a.m9a().getValue().f604a) < 0) {
                m717a(interfaceC0146f);
            }
            Map.Entry<InterfaceC0145e, a> m11c = this.f597a.m11c();
            if (!this.f602f && m11c != null && this.f598b.compareTo(m11c.getValue().f604a) > 0) {
                m719b(interfaceC0146f);
            }
        }
        this.f602f = false;
    }

    /* renamed from: d */
    private void m725d(AbstractC0144d.b bVar) {
        this.f603g.add(bVar);
    }

    /* renamed from: e */
    private static AbstractC0144d.a m726e(AbstractC0144d.b bVar) {
        int i = C0147g.f596b[bVar.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return AbstractC0144d.a.ON_START;
            }
            if (i == 3) {
                return AbstractC0144d.a.ON_RESUME;
            }
            if (i == 4) {
                throw new IllegalArgumentException();
            }
            if (i != 5) {
                throw new IllegalArgumentException("Unexpected state value " + bVar);
            }
        }
        return AbstractC0144d.a.ON_CREATE;
    }

    @Override // android.arch.lifecycle.AbstractC0144d
    /* renamed from: a */
    public AbstractC0144d.b mo710a() {
        return this.f598b;
    }

    /* renamed from: a */
    public void m727a(AbstractC0144d.b bVar) {
        m723c(bVar);
    }

    @Override // android.arch.lifecycle.AbstractC0144d
    /* renamed from: a */
    public void mo711a(InterfaceC0145e interfaceC0145e) {
        InterfaceC0146f interfaceC0146f;
        AbstractC0144d.b bVar = this.f598b;
        AbstractC0144d.b bVar2 = AbstractC0144d.b.DESTROYED;
        if (bVar != bVar2) {
            bVar2 = AbstractC0144d.b.INITIALIZED;
        }
        a aVar = new a(interfaceC0145e, bVar2);
        if (this.f597a.mo5b(interfaceC0145e, aVar) == null && (interfaceC0146f = this.f599c.get()) != null) {
            boolean z = this.f600d != 0 || this.f601e;
            AbstractC0144d.b m721c = m721c(interfaceC0145e);
            this.f600d++;
            while (aVar.f604a.compareTo(m721c) < 0 && this.f597a.contains(interfaceC0145e)) {
                m725d(aVar.f604a);
                aVar.m729a(interfaceC0146f, m726e(aVar.f604a));
                m722c();
                m721c = m721c(interfaceC0145e);
            }
            if (!z) {
                m724d();
            }
            this.f600d--;
        }
    }

    /* renamed from: b */
    public void m728b(AbstractC0144d.a aVar) {
        m723c(m715a(aVar));
    }

    @Override // android.arch.lifecycle.AbstractC0144d
    /* renamed from: b */
    public void mo712b(InterfaceC0145e interfaceC0145e) {
        this.f597a.remove(interfaceC0145e);
    }
}
