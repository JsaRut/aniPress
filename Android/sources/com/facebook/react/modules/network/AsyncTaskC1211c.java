package com.facebook.react.modules.network;

import android.webkit.CookieManager;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.GuardedResultAsyncTask;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.modules.network.C1217i;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.facebook.react.modules.network.c */
/* loaded from: classes.dex */
public class AsyncTaskC1211c extends GuardedResultAsyncTask<Boolean> {

    /* renamed from: a */
    final /* synthetic */ Callback f4607a;

    /* renamed from: b */
    final /* synthetic */ C1217i f4608b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncTaskC1211c(C1217i c1217i, ReactContext reactContext, Callback callback) {
        super(reactContext);
        this.f4608b = c1217i;
        this.f4607a = callback;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.bridge.GuardedResultAsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecuteGuarded(Boolean bool) {
        this.f4607a.invoke(bool);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.facebook.react.bridge.GuardedResultAsyncTask
    public Boolean doInBackgroundGuarded() {
        C1217i.a aVar;
        CookieManager m5414c = this.f4608b.m5414c();
        if (m5414c != null) {
            m5414c.removeAllCookie();
        }
        aVar = this.f4608b.f4621b;
        aVar.m5419a();
        return true;
    }
}
