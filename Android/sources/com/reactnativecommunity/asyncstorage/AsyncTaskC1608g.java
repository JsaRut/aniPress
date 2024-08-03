package com.reactnativecommunity.asyncstorage;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.ReactContext;
import p139d.p143b.p148c.p153e.C1700a;

/* renamed from: com.reactnativecommunity.asyncstorage.g */
/* loaded from: classes.dex */
class AsyncTaskC1608g extends GuardedAsyncTask<Void, Void> {

    /* renamed from: a */
    final /* synthetic */ Callback f6033a;

    /* renamed from: b */
    final /* synthetic */ AsyncStorageModule f6034b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncTaskC1608g(AsyncStorageModule asyncStorageModule, ReactContext reactContext, Callback callback) {
        super(reactContext);
        this.f6034b = asyncStorageModule;
        this.f6033a = callback;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.bridge.GuardedAsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void doInBackgroundGuarded(Void... voidArr) {
        C1613l c1613l;
        C1613l c1613l2;
        c1613l = this.f6034b.mReactDatabaseSupplier;
        if (!c1613l.m6739c()) {
            this.f6033a.invoke(C1603b.m6724a(null));
            return;
        }
        try {
            c1613l2 = this.f6034b.mReactDatabaseSupplier;
            c1613l2.m6737a();
            this.f6033a.invoke(new Object[0]);
        } catch (Exception e2) {
            C1700a.m7007b("ReactNative", e2.getMessage(), e2);
            this.f6033a.invoke(C1603b.m6725a(null, e2.getMessage()));
        }
    }
}
