package p000a.p001a.p002a.p003a;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: a.a.a.a.d */
/* loaded from: classes.dex */
public class C0003d extends AbstractC0004e {

    /* renamed from: a */
    private final Object f5a = new Object();

    /* renamed from: b */
    private ExecutorService f6b = Executors.newFixedThreadPool(2);

    /* renamed from: c */
    private volatile Handler f7c;

    @Override // p000a.p001a.p002a.p003a.AbstractC0004e
    /* renamed from: a */
    public void mo1a(Runnable runnable) {
        this.f6b.execute(runnable);
    }

    @Override // p000a.p001a.p002a.p003a.AbstractC0004e
    /* renamed from: a */
    public boolean mo2a() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    @Override // p000a.p001a.p002a.p003a.AbstractC0004e
    /* renamed from: b */
    public void mo3b(Runnable runnable) {
        if (this.f7c == null) {
            synchronized (this.f5a) {
                if (this.f7c == null) {
                    this.f7c = new Handler(Looper.getMainLooper());
                }
            }
        }
        this.f7c.post(runnable);
    }
}
