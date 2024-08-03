package p139d.p143b.p169g.p174b;

import android.os.Handler;
import android.os.Looper;
import java.util.HashSet;
import java.util.Set;
import p139d.p143b.p148c.p152d.C1691j;

/* renamed from: d.b.g.b.b */
/* loaded from: classes.dex */
public class C1770b {

    /* renamed from: a */
    private static C1770b f6417a;

    /* renamed from: d */
    private final Runnable f6420d = new RunnableC1769a(this);

    /* renamed from: b */
    private final Set<a> f6418b = new HashSet();

    /* renamed from: c */
    private final Handler f6419c = new Handler(Looper.getMainLooper());

    /* renamed from: d.b.g.b.b$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        void mo7252a();
    }

    /* renamed from: b */
    public static synchronized C1770b m7248b() {
        C1770b c1770b;
        synchronized (C1770b.class) {
            if (f6417a == null) {
                f6417a = new C1770b();
            }
            c1770b = f6417a;
        }
        return c1770b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static void m7249c() {
        C1691j.m6978b(Looper.getMainLooper().getThread() == Thread.currentThread());
    }

    /* renamed from: a */
    public void m7250a(a aVar) {
        m7249c();
        this.f6418b.remove(aVar);
    }

    /* renamed from: b */
    public void m7251b(a aVar) {
        m7249c();
        if (this.f6418b.add(aVar) && this.f6418b.size() == 1) {
            this.f6419c.post(this.f6420d);
        }
    }
}
