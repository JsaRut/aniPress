package p030b;

import java.util.concurrent.CancellationException;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: b.i */
/* loaded from: classes.dex */
public class RunnableC0500i implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C0496e f2545a;

    /* renamed from: b */
    final /* synthetic */ C0503l f2546b;

    /* renamed from: c */
    final /* synthetic */ InterfaceC0497f f2547c;

    /* renamed from: d */
    final /* synthetic */ C0502k f2548d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC0500i(C0496e c0496e, C0503l c0503l, InterfaceC0497f interfaceC0497f, C0502k c0502k) {
        this.f2545a = c0496e;
        this.f2546b = c0503l;
        this.f2547c = interfaceC0497f;
        this.f2548d = c0502k;
    }

    @Override // java.lang.Runnable
    public void run() {
        C0496e c0496e = this.f2545a;
        if (c0496e != null) {
            c0496e.m2634a();
            throw null;
        }
        try {
            this.f2546b.m2657a((C0503l) this.f2547c.mo2635a(this.f2548d));
        } catch (CancellationException unused) {
            this.f2546b.m2658b();
        } catch (Exception e2) {
            this.f2546b.m2656a(e2);
        }
    }
}
