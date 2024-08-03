package com.facebook.react.modules.storage;

import com.facebook.react.modules.storage.AsyncStorageModule;

/* renamed from: com.facebook.react.modules.storage.i */
/* loaded from: classes.dex */
class RunnableC1252i implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Runnable f4701a;

    /* renamed from: b */
    final /* synthetic */ AsyncStorageModule.ExecutorC1243a f4702b;

    public RunnableC1252i(AsyncStorageModule.ExecutorC1243a executorC1243a, Runnable runnable) {
        this.f4702b = executorC1243a;
        this.f4701a = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f4701a.run();
        } finally {
            this.f4702b.m5443a();
        }
    }
}
