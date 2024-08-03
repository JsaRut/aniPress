package p000a.p005b.p009c.p017f;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: a.b.c.f.j */
/* loaded from: classes.dex */
public class RunnableC0062j implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AtomicReference f210a;

    /* renamed from: b */
    final /* synthetic */ Callable f211b;

    /* renamed from: c */
    final /* synthetic */ ReentrantLock f212c;

    /* renamed from: d */
    final /* synthetic */ AtomicBoolean f213d;

    /* renamed from: e */
    final /* synthetic */ Condition f214e;

    /* renamed from: f */
    final /* synthetic */ C0063k f215f;

    public RunnableC0062j(C0063k c0063k, AtomicReference atomicReference, Callable callable, ReentrantLock reentrantLock, AtomicBoolean atomicBoolean, Condition condition) {
        this.f215f = c0063k;
        this.f210a = atomicReference;
        this.f211b = callable;
        this.f212c = reentrantLock;
        this.f213d = atomicBoolean;
        this.f214e = condition;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f210a.set(this.f211b.call());
        } catch (Exception unused) {
        }
        this.f212c.lock();
        try {
            this.f213d.set(false);
            this.f214e.signal();
        } finally {
            this.f212c.unlock();
        }
    }
}
