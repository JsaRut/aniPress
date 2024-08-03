package p030b;

/* renamed from: b.l */
/* loaded from: classes.dex */
public class C0503l<TResult> {

    /* renamed from: a */
    private final C0502k<TResult> f2568a = new C0502k<>();

    /* renamed from: a */
    public C0502k<TResult> m2655a() {
        return this.f2568a;
    }

    /* renamed from: a */
    public void m2656a(Exception exc) {
        if (!m2659b(exc)) {
            throw new IllegalStateException("Cannot set the error on a completed task.");
        }
    }

    /* renamed from: a */
    public void m2657a(TResult tresult) {
        if (!m2660b((C0503l<TResult>) tresult)) {
            throw new IllegalStateException("Cannot set the result of a completed task.");
        }
    }

    /* renamed from: b */
    public void m2658b() {
        if (!m2661c()) {
            throw new IllegalStateException("Cannot cancel a completed task.");
        }
    }

    /* renamed from: b */
    public boolean m2659b(Exception exc) {
        return this.f2568a.m2648b(exc);
    }

    /* renamed from: b */
    public boolean m2660b(TResult tresult) {
        return this.f2568a.m2649b((C0502k<TResult>) tresult);
    }

    /* renamed from: c */
    public boolean m2661c() {
        return this.f2568a.m2653g();
    }
}
