package com.facebook.react.modules.network;

import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.common.p123a.C1099a;
import okhttp3.OkHttpClient;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.facebook.react.modules.network.p */
/* loaded from: classes.dex */
public class AsyncTaskC1224p extends GuardedAsyncTask<Void, Void> {

    /* renamed from: a */
    final /* synthetic */ int f4641a;

    /* renamed from: b */
    final /* synthetic */ NetworkingModule f4642b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncTaskC1224p(NetworkingModule networkingModule, ReactContext reactContext, int i) {
        super(reactContext);
        this.f4642b = networkingModule;
        this.f4641a = i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.bridge.GuardedAsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void doInBackgroundGuarded(Void... voidArr) {
        OkHttpClient okHttpClient;
        okHttpClient = this.f4642b.mClient;
        C1099a.m5165a(okHttpClient, Integer.valueOf(this.f4641a));
    }
}
