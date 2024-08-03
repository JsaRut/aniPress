package com.reactnativecommunity.asyncstorage;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableMap;
import p139d.p143b.p148c.p153e.C1700a;

/* renamed from: com.reactnativecommunity.asyncstorage.e */
/* loaded from: classes.dex */
class AsyncTaskC1606e extends GuardedAsyncTask<Void, Void> {

    /* renamed from: a */
    final /* synthetic */ Callback f6027a;

    /* renamed from: b */
    final /* synthetic */ ReadableArray f6028b;

    /* renamed from: c */
    final /* synthetic */ AsyncStorageModule f6029c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncTaskC1606e(AsyncStorageModule asyncStorageModule, ReactContext reactContext, Callback callback, ReadableArray readableArray) {
        super(reactContext);
        this.f6029c = asyncStorageModule;
        this.f6027a = callback;
        this.f6028b = readableArray;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.facebook.react.bridge.GuardedAsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void doInBackgroundGuarded(Void... voidArr) {
        boolean ensureDatabase;
        C1613l c1613l;
        C1613l c1613l2;
        Callback callback;
        Object[] objArr;
        C1613l c1613l3;
        C1613l c1613l4;
        C1613l c1613l5;
        C1613l c1613l6;
        ensureDatabase = this.f6029c.ensureDatabase();
        WritableMap writableMap = null;
        try {
            if (!ensureDatabase) {
                this.f6027a.invoke(C1603b.m6724a(null));
                return;
            }
            try {
                c1613l3 = this.f6029c.mReactDatabaseSupplier;
                c1613l3.m6740d().beginTransaction();
                for (int i = 0; i < this.f6028b.size(); i += 999) {
                    int min = Math.min(this.f6028b.size() - i, 999);
                    c1613l6 = this.f6029c.mReactDatabaseSupplier;
                    c1613l6.m6740d().delete("catalystLocalStorage", C1602a.m6718a(min), C1602a.m6722a(this.f6028b, i, min));
                }
                c1613l4 = this.f6029c.mReactDatabaseSupplier;
                c1613l4.m6740d().setTransactionSuccessful();
                try {
                    c1613l5 = this.f6029c.mReactDatabaseSupplier;
                    c1613l5.m6740d().endTransaction();
                } catch (Exception e2) {
                    C1700a.m7007b("ReactNative", e2.getMessage(), e2);
                    writableMap = C1603b.m6725a(null, e2.getMessage());
                }
            } catch (Exception e3) {
                C1700a.m7007b("ReactNative", e3.getMessage(), e3);
                WritableMap m6725a = C1603b.m6725a(null, e3.getMessage());
                try {
                    c1613l2 = this.f6029c.mReactDatabaseSupplier;
                    c1613l2.m6740d().endTransaction();
                } catch (Exception e4) {
                    C1700a.m7007b("ReactNative", e4.getMessage(), e4);
                    if (m6725a == null) {
                        writableMap = C1603b.m6725a(null, e4.getMessage());
                    }
                }
                writableMap = m6725a;
            }
            if (writableMap != null) {
                callback = this.f6027a;
                objArr = new Object[]{writableMap};
            } else {
                callback = this.f6027a;
                objArr = new Object[0];
            }
            callback.invoke(objArr);
        } catch (Throwable th) {
            try {
                c1613l = this.f6029c.mReactDatabaseSupplier;
                c1613l.m6740d().endTransaction();
            } catch (Exception e5) {
                C1700a.m7007b("ReactNative", e5.getMessage(), e5);
                C1603b.m6725a(null, e5.getMessage());
            }
            throw th;
        }
    }
}
