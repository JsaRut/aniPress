package p139d.p143b.p184i.p200n;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import p139d.p143b.p148c.p152d.C1691j;

/* renamed from: d.b.i.n.Ca */
/* loaded from: classes.dex */
public class C1938Ca {

    /* renamed from: a */
    private boolean f7113a = false;

    /* renamed from: b */
    private final Deque<Runnable> f7114b;

    /* renamed from: c */
    private final Executor f7115c;

    public C1938Ca(Executor executor) {
        C1691j.m6971a(executor);
        this.f7115c = executor;
        this.f7114b = new ArrayDeque();
    }

    /* renamed from: a */
    public synchronized void m7965a(Runnable runnable) {
        if (this.f7113a) {
            this.f7114b.add(runnable);
        } else {
            this.f7115c.execute(runnable);
        }
    }

    /* renamed from: b */
    public synchronized void m7966b(Runnable runnable) {
        this.f7114b.remove(runnable);
    }
}
