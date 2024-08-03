package com.facebook.react.common.futures;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public class SimpleSettableFuture<T> implements Future<T> {

    /* renamed from: a */
    private final CountDownLatch f4370a = new CountDownLatch(1);

    /* renamed from: b */
    private T f4371b;

    /* renamed from: c */
    private Exception f4372c;

    /* renamed from: b */
    private void m5186b() {
        if (this.f4370a.getCount() == 0) {
            throw new RuntimeException("Result has already been set!");
        }
    }

    /* renamed from: a */
    public T m5187a() {
        try {
            return get();
        } catch (InterruptedException | ExecutionException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* renamed from: a */
    public void m5188a(Exception exc) {
        m5186b();
        this.f4372c = exc;
        this.f4370a.countDown();
    }

    /* renamed from: a */
    public void m5189a(T t) {
        m5186b();
        this.f4371b = t;
        this.f4370a.countDown();
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.Future
    public T get() {
        this.f4370a.await();
        Exception exc = this.f4372c;
        if (exc == null) {
            return this.f4371b;
        }
        throw new ExecutionException(exc);
    }

    @Override // java.util.concurrent.Future
    public T get(long j, TimeUnit timeUnit) {
        if (!this.f4370a.await(j, timeUnit)) {
            throw new TimeoutException("Timed out waiting for result");
        }
        Exception exc = this.f4372c;
        if (exc == null) {
            return this.f4371b;
        }
        throw new ExecutionException(exc);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f4370a.getCount() == 0;
    }
}
