package p000a.p001a.p002a.p003a;

import java.util.concurrent.Executor;

/* renamed from: a.a.a.a.c */
/* loaded from: classes.dex */
public class C0002c extends AbstractC0004e {

    /* renamed from: a */
    private static volatile C0002c f0a;

    /* renamed from: b */
    private static final Executor f1b = new ExecutorC0000a();

    /* renamed from: c */
    private static final Executor f2c = new ExecutorC0001b();

    /* renamed from: e */
    private AbstractC0004e f4e = new C0003d();

    /* renamed from: d */
    private AbstractC0004e f3d = this.f4e;

    private C0002c() {
    }

    /* renamed from: b */
    public static C0002c m0b() {
        if (f0a != null) {
            return f0a;
        }
        synchronized (C0002c.class) {
            if (f0a == null) {
                f0a = new C0002c();
            }
        }
        return f0a;
    }

    @Override // p000a.p001a.p002a.p003a.AbstractC0004e
    /* renamed from: a */
    public void mo1a(Runnable runnable) {
        this.f3d.mo1a(runnable);
    }

    @Override // p000a.p001a.p002a.p003a.AbstractC0004e
    /* renamed from: a */
    public boolean mo2a() {
        return this.f3d.mo2a();
    }

    @Override // p000a.p001a.p002a.p003a.AbstractC0004e
    /* renamed from: b */
    public void mo3b(Runnable runnable) {
        this.f3d.mo3b(runnable);
    }
}
