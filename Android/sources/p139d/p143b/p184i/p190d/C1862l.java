package p139d.p143b.p184i.p190d;

import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import p030b.C0502k;
import p139d.p143b.p144a.InterfaceC1643a;
import p139d.p143b.p145b.p146a.InterfaceC1648d;
import p139d.p143b.p145b.p147b.InterfaceC1668n;
import p139d.p143b.p148c.p152d.C1691j;
import p139d.p143b.p148c.p153e.C1700a;
import p139d.p143b.p148c.p155g.C1714k;
import p139d.p143b.p148c.p155g.InterfaceC1710g;
import p139d.p143b.p148c.p155g.InterfaceC1711h;
import p139d.p143b.p184i.p196j.C1920d;

/* renamed from: d.b.i.d.l */
/* loaded from: classes.dex */
public class C1862l {

    /* renamed from: a */
    private static final Class<?> f6809a = C1862l.class;

    /* renamed from: b */
    private final InterfaceC1668n f6810b;

    /* renamed from: c */
    private final InterfaceC1711h f6811c;

    /* renamed from: d */
    private final C1714k f6812d;

    /* renamed from: e */
    private final Executor f6813e;

    /* renamed from: f */
    private final Executor f6814f;

    /* renamed from: g */
    private final C1849F f6815g = C1849F.m7571b();

    /* renamed from: h */
    private final InterfaceC1875y f6816h;

    public C1862l(InterfaceC1668n interfaceC1668n, InterfaceC1711h interfaceC1711h, C1714k c1714k, Executor executor, Executor executor2, InterfaceC1875y interfaceC1875y) {
        this.f6810b = interfaceC1668n;
        this.f6811c = interfaceC1711h;
        this.f6812d = c1714k;
        this.f6813e = executor;
        this.f6814f = executor2;
        this.f6816h = interfaceC1875y;
    }

    /* renamed from: b */
    private C0502k<C1920d> m7586b(InterfaceC1648d interfaceC1648d, C1920d c1920d) {
        C1700a.m7002b(f6809a, "Found image for %s in staging area", interfaceC1648d.mo6817a());
        this.f6816h.mo7565c(interfaceC1648d);
        return C0502k.m2637a(c1920d);
    }

    /* renamed from: b */
    private C0502k<C1920d> m7587b(InterfaceC1648d interfaceC1648d, AtomicBoolean atomicBoolean) {
        try {
            return C0502k.m2638a(new CallableC1857g(this, atomicBoolean, interfaceC1648d), this.f6813e);
        } catch (Exception e2) {
            C1700a.m7005b(f6809a, e2, "Failed to schedule disk-cache read for %s", interfaceC1648d.mo6817a());
            return C0502k.m2636a(e2);
        }
    }

    /* renamed from: c */
    public void m7590c(InterfaceC1648d interfaceC1648d, C1920d c1920d) {
        C1700a.m7002b(f6809a, "About to write to disk-cache for key %s", interfaceC1648d.mo6817a());
        try {
            this.f6810b.mo6908a(interfaceC1648d, new C1861k(this, c1920d));
            C1700a.m7002b(f6809a, "Successful disk-cache write for key %s", interfaceC1648d.mo6817a());
        } catch (IOException e2) {
            C1700a.m7005b(f6809a, e2, "Failed to write to disk-cache for key %s", interfaceC1648d.mo6817a());
        }
    }

    /* renamed from: d */
    private boolean m7592d(InterfaceC1648d interfaceC1648d) {
        C1920d m7576b = this.f6815g.m7576b(interfaceC1648d);
        if (m7576b != null) {
            m7576b.close();
            C1700a.m7002b(f6809a, "Found image for %s in staging area", interfaceC1648d.mo6817a());
            this.f6816h.mo7565c(interfaceC1648d);
            return true;
        }
        C1700a.m7002b(f6809a, "Did not find image for %s in staging area", interfaceC1648d.mo6817a());
        this.f6816h.mo7568f();
        try {
            return this.f6810b.mo6912d(interfaceC1648d);
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: e */
    public InterfaceC1710g m7593e(InterfaceC1648d interfaceC1648d) {
        try {
            C1700a.m7002b(f6809a, "Disk cache read for %s", interfaceC1648d.mo6817a());
            InterfaceC1643a mo6907a = this.f6810b.mo6907a(interfaceC1648d);
            if (mo6907a == null) {
                C1700a.m7002b(f6809a, "Disk cache miss for %s", interfaceC1648d.mo6817a());
                this.f6816h.mo7566d();
                return null;
            }
            C1700a.m7002b(f6809a, "Found entry in disk cache for %s", interfaceC1648d.mo6817a());
            this.f6816h.mo7558a();
            InputStream mo6805a = mo6907a.mo6805a();
            try {
                InterfaceC1710g mo5036a = this.f6811c.mo5036a(mo6805a, (int) mo6907a.size());
                mo6805a.close();
                C1700a.m7002b(f6809a, "Successful read from disk cache for %s", interfaceC1648d.mo6817a());
                return mo5036a;
            } catch (Throwable th) {
                mo6805a.close();
                throw th;
            }
        } catch (IOException e2) {
            C1700a.m7005b(f6809a, e2, "Exception reading from cache for %s", interfaceC1648d.mo6817a());
            this.f6816h.mo7564c();
            throw e2;
        }
    }

    /* renamed from: a */
    public C0502k<C1920d> m7594a(InterfaceC1648d interfaceC1648d, AtomicBoolean atomicBoolean) {
        C1920d m7576b = this.f6815g.m7576b(interfaceC1648d);
        return m7576b != null ? m7586b(interfaceC1648d, m7576b) : m7587b(interfaceC1648d, atomicBoolean);
    }

    /* renamed from: a */
    public void m7595a(InterfaceC1648d interfaceC1648d, C1920d c1920d) {
        C1691j.m6971a(interfaceC1648d);
        C1691j.m6974a(C1920d.m7904e(c1920d));
        this.f6815g.m7574a(interfaceC1648d, c1920d);
        C1920d m7901a = C1920d.m7901a(c1920d);
        try {
            this.f6814f.execute(new RunnableC1858h(this, interfaceC1648d, m7901a));
        } catch (Exception e2) {
            C1700a.m7005b(f6809a, e2, "Failed to schedule disk-cache write for %s", interfaceC1648d.mo6817a());
            this.f6815g.m7577b(interfaceC1648d, c1920d);
            C1920d.m7902b(m7901a);
        }
    }

    /* renamed from: a */
    public boolean m7596a(InterfaceC1648d interfaceC1648d) {
        return this.f6815g.m7575a(interfaceC1648d) || this.f6810b.mo6910b(interfaceC1648d);
    }

    /* renamed from: b */
    public C0502k<Void> m7597b() {
        this.f6815g.m7573a();
        try {
            return C0502k.m2638a(new CallableC1860j(this), this.f6814f);
        } catch (Exception e2) {
            C1700a.m7005b(f6809a, e2, "Failed to schedule disk-cache clear", new Object[0]);
            return C0502k.m2636a(e2);
        }
    }

    /* renamed from: b */
    public boolean m7598b(InterfaceC1648d interfaceC1648d) {
        if (m7596a(interfaceC1648d)) {
            return true;
        }
        return m7592d(interfaceC1648d);
    }

    /* renamed from: c */
    public C0502k<Void> m7599c(InterfaceC1648d interfaceC1648d) {
        C1691j.m6971a(interfaceC1648d);
        this.f6815g.m7578c(interfaceC1648d);
        try {
            return C0502k.m2638a(new CallableC1859i(this, interfaceC1648d), this.f6814f);
        } catch (Exception e2) {
            C1700a.m7005b(f6809a, e2, "Failed to schedule disk-cache remove for %s", interfaceC1648d.mo6817a());
            return C0502k.m2636a(e2);
        }
    }
}
