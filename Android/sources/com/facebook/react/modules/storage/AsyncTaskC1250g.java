package com.facebook.react.modules.storage;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.ReactContext;
import p139d.p143b.p148c.p153e.C1700a;

/* renamed from: com.facebook.react.modules.storage.g */
/* loaded from: classes.dex */
class AsyncTaskC1250g extends GuardedAsyncTask<Void, Void> {

    /* renamed from: a */
    final /* synthetic */ Callback f4697a;

    /* renamed from: b */
    final /* synthetic */ AsyncStorageModule f4698b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncTaskC1250g(AsyncStorageModule asyncStorageModule, ReactContext reactContext, Callback callback) {
        super(reactContext);
        this.f4698b = asyncStorageModule;
        this.f4697a = callback;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.bridge.GuardedAsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void doInBackgroundGuarded(Void... voidArr) {
        C1253j c1253j;
        C1253j c1253j2;
        c1253j = this.f4698b.mReactDatabaseSupplier;
        if (!c1253j.m5465c()) {
            this.f4697a.invoke(C1245b.m5450a(null));
            return;
        }
        try {
            c1253j2 = this.f4698b.mReactDatabaseSupplier;
            c1253j2.m5463a();
            this.f4697a.invoke(new Object[0]);
        } catch (Exception e2) {
            C1700a.m7007b("ReactNative", e2.getMessage(), e2);
            this.f4697a.invoke(C1245b.m5451a(null, e2.getMessage()));
        }
    }
}
