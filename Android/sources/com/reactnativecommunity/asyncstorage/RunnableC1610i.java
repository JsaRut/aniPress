package com.reactnativecommunity.asyncstorage;

import com.reactnativecommunity.asyncstorage.AsyncStorageModule;

/* renamed from: com.reactnativecommunity.asyncstorage.i */
/* loaded from: classes.dex */
class RunnableC1610i implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Runnable f6037a;

    /* renamed from: b */
    final /* synthetic */ AsyncStorageModule.ExecutorC1601a f6038b;

    public RunnableC1610i(AsyncStorageModule.ExecutorC1601a executorC1601a, Runnable runnable) {
        this.f6038b = executorC1601a;
        this.f6037a = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f6037a.run();
        } finally {
            this.f6038b.m6717a();
        }
    }
}
