package com.facebook.react.modules.network;

import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.ReactContext;

/* renamed from: com.facebook.react.modules.network.f */
/* loaded from: classes.dex */
public class AsyncTaskC1214f extends GuardedAsyncTask<Void, Void> {

    /* renamed from: a */
    final /* synthetic */ Runnable f4615a;

    /* renamed from: b */
    final /* synthetic */ C1217i f4616b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncTaskC1214f(C1217i c1217i, ReactContext reactContext, Runnable runnable) {
        super(reactContext);
        this.f4616b = c1217i;
        this.f4615a = runnable;
    }

    @Override // com.facebook.react.bridge.GuardedAsyncTask
    /* renamed from: a */
    public void doInBackgroundGuarded(Void... voidArr) {
        this.f4615a.run();
    }
}
