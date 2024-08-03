package p030b;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: b.j */
/* loaded from: classes.dex */
public class RunnableC0501j implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C0496e f2549a;

    /* renamed from: b */
    final /* synthetic */ C0503l f2550b;

    /* renamed from: c */
    final /* synthetic */ Callable f2551c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC0501j(C0496e c0496e, C0503l c0503l, Callable callable) {
        this.f2549a = c0496e;
        this.f2550b = c0503l;
        this.f2551c = callable;
    }

    @Override // java.lang.Runnable
    public void run() {
        C0496e c0496e = this.f2549a;
        if (c0496e != null) {
            c0496e.m2634a();
            throw null;
        }
        try {
            this.f2550b.m2657a((C0503l) this.f2551c.call());
        } catch (CancellationException unused) {
            this.f2550b.m2658b();
        } catch (Exception e2) {
            this.f2550b.m2656a(e2);
        }
    }
}
