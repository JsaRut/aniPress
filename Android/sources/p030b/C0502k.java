package p030b;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* renamed from: b.k */
/* loaded from: classes.dex */
public class C0502k<TResult> {

    /* renamed from: d */
    private static volatile a f2555d;

    /* renamed from: j */
    private boolean f2561j;

    /* renamed from: k */
    private boolean f2562k;

    /* renamed from: l */
    private TResult f2563l;

    /* renamed from: m */
    private Exception f2564m;

    /* renamed from: n */
    private boolean f2565n;

    /* renamed from: o */
    private C0504m f2566o;

    /* renamed from: a */
    public static final ExecutorService f2552a = C0495d.m2629a();

    /* renamed from: b */
    private static final Executor f2553b = C0495d.m2630b();

    /* renamed from: c */
    public static final Executor f2554c = C0493b.m2628b();

    /* renamed from: e */
    private static C0502k<?> f2556e = new C0502k<>((Object) null);

    /* renamed from: f */
    private static C0502k<Boolean> f2557f = new C0502k<>(true);

    /* renamed from: g */
    private static C0502k<Boolean> f2558g = new C0502k<>(false);

    /* renamed from: h */
    private static C0502k<?> f2559h = new C0502k<>(true);

    /* renamed from: i */
    private final Object f2560i = new Object();

    /* renamed from: p */
    private List<InterfaceC0497f<TResult, Void>> f2567p = new ArrayList();

    /* renamed from: b.k$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        void m2654a(C0502k<?> c0502k, C0505n c0505n);
    }

    public C0502k() {
    }

    private C0502k(TResult tresult) {
        m2649b((C0502k<TResult>) tresult);
    }

    private C0502k(boolean z) {
        if (z) {
            m2653g();
        } else {
            m2649b((C0502k<TResult>) null);
        }
    }

    /* renamed from: a */
    public static <TResult> C0502k<TResult> m2636a(Exception exc) {
        C0503l c0503l = new C0503l();
        c0503l.m2656a(exc);
        return c0503l.m2655a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static <TResult> C0502k<TResult> m2637a(TResult tresult) {
        if (tresult == 0) {
            return (C0502k<TResult>) f2556e;
        }
        if (tresult instanceof Boolean) {
            return ((Boolean) tresult).booleanValue() ? (C0502k<TResult>) f2557f : (C0502k<TResult>) f2558g;
        }
        C0503l c0503l = new C0503l();
        c0503l.m2657a((C0503l) tresult);
        return c0503l.m2655a();
    }

    /* renamed from: a */
    public static <TResult> C0502k<TResult> m2638a(Callable<TResult> callable, Executor executor) {
        return m2639a(callable, executor, (C0496e) null);
    }

    /* renamed from: a */
    public static <TResult> C0502k<TResult> m2639a(Callable<TResult> callable, Executor executor, C0496e c0496e) {
        C0503l c0503l = new C0503l();
        try {
            executor.execute(new RunnableC0501j(c0496e, c0503l, callable));
        } catch (Exception e2) {
            c0503l.m2656a((Exception) new C0498g(e2));
        }
        return c0503l.m2655a();
    }

    /* renamed from: b */
    public static <TContinuationResult, TResult> void m2641b(C0503l<TContinuationResult> c0503l, InterfaceC0497f<TResult, TContinuationResult> interfaceC0497f, C0502k<TResult> c0502k, Executor executor, C0496e c0496e) {
        try {
            executor.execute(new RunnableC0500i(c0496e, c0503l, interfaceC0497f, c0502k));
        } catch (Exception e2) {
            c0503l.m2656a(new C0498g(e2));
        }
    }

    /* renamed from: c */
    public static a m2642c() {
        return f2555d;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: h */
    private void m2643h() {
        synchronized (this.f2560i) {
            Iterator<InterfaceC0497f<TResult, Void>> it = this.f2567p.iterator();
            while (it.hasNext()) {
                try {
                    it.next().mo2635a(this);
                } catch (RuntimeException e2) {
                    throw e2;
                } catch (Exception e3) {
                    throw new RuntimeException(e3);
                }
            }
            this.f2567p = null;
        }
    }

    /* renamed from: a */
    public <TContinuationResult> C0502k<TContinuationResult> m2644a(InterfaceC0497f<TResult, TContinuationResult> interfaceC0497f) {
        return m2645a(interfaceC0497f, f2553b, (C0496e) null);
    }

    /* renamed from: a */
    public <TContinuationResult> C0502k<TContinuationResult> m2645a(InterfaceC0497f<TResult, TContinuationResult> interfaceC0497f, Executor executor, C0496e c0496e) {
        boolean m2651e;
        C0503l c0503l = new C0503l();
        synchronized (this.f2560i) {
            m2651e = m2651e();
            if (!m2651e) {
                this.f2567p.add(new C0499h(this, c0503l, interfaceC0497f, executor, c0496e));
            }
        }
        if (m2651e) {
            m2641b(c0503l, interfaceC0497f, this, executor, c0496e);
        }
        return c0503l.m2655a();
    }

    /* renamed from: a */
    public Exception m2646a() {
        Exception exc;
        synchronized (this.f2560i) {
            if (this.f2564m != null) {
                this.f2565n = true;
                if (this.f2566o != null) {
                    this.f2566o.m2662a();
                    this.f2566o = null;
                }
            }
            exc = this.f2564m;
        }
        return exc;
    }

    /* renamed from: b */
    public TResult m2647b() {
        TResult tresult;
        synchronized (this.f2560i) {
            tresult = this.f2563l;
        }
        return tresult;
    }

    /* renamed from: b */
    public boolean m2648b(Exception exc) {
        synchronized (this.f2560i) {
            if (this.f2561j) {
                return false;
            }
            this.f2561j = true;
            this.f2564m = exc;
            this.f2565n = false;
            this.f2560i.notifyAll();
            m2643h();
            if (!this.f2565n && m2642c() != null) {
                this.f2566o = new C0504m(this);
            }
            return true;
        }
    }

    /* renamed from: b */
    public boolean m2649b(TResult tresult) {
        synchronized (this.f2560i) {
            if (this.f2561j) {
                return false;
            }
            this.f2561j = true;
            this.f2563l = tresult;
            this.f2560i.notifyAll();
            m2643h();
            return true;
        }
    }

    /* renamed from: d */
    public boolean m2650d() {
        boolean z;
        synchronized (this.f2560i) {
            z = this.f2562k;
        }
        return z;
    }

    /* renamed from: e */
    public boolean m2651e() {
        boolean z;
        synchronized (this.f2560i) {
            z = this.f2561j;
        }
        return z;
    }

    /* renamed from: f */
    public boolean m2652f() {
        boolean z;
        synchronized (this.f2560i) {
            z = m2646a() != null;
        }
        return z;
    }

    /* renamed from: g */
    public boolean m2653g() {
        synchronized (this.f2560i) {
            if (this.f2561j) {
                return false;
            }
            this.f2561j = true;
            this.f2562k = true;
            this.f2560i.notifyAll();
            m2643h();
            return true;
        }
    }
}
