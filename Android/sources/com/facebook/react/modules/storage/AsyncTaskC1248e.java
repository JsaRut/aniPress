package com.facebook.react.modules.storage;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableMap;
import p139d.p143b.p148c.p153e.C1700a;

/* renamed from: com.facebook.react.modules.storage.e */
/* loaded from: classes.dex */
class AsyncTaskC1248e extends GuardedAsyncTask<Void, Void> {

    /* renamed from: a */
    final /* synthetic */ Callback f4691a;

    /* renamed from: b */
    final /* synthetic */ ReadableArray f4692b;

    /* renamed from: c */
    final /* synthetic */ AsyncStorageModule f4693c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncTaskC1248e(AsyncStorageModule asyncStorageModule, ReactContext reactContext, Callback callback, ReadableArray readableArray) {
        super(reactContext);
        this.f4693c = asyncStorageModule;
        this.f4691a = callback;
        this.f4692b = readableArray;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.facebook.react.bridge.GuardedAsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void doInBackgroundGuarded(Void... voidArr) {
        boolean ensureDatabase;
        C1253j c1253j;
        C1253j c1253j2;
        Callback callback;
        Object[] objArr;
        C1253j c1253j3;
        C1253j c1253j4;
        C1253j c1253j5;
        C1253j c1253j6;
        ensureDatabase = this.f4693c.ensureDatabase();
        WritableMap writableMap = null;
        try {
            if (!ensureDatabase) {
                this.f4691a.invoke(C1245b.m5450a(null));
                return;
            }
            try {
                c1253j3 = this.f4693c.mReactDatabaseSupplier;
                c1253j3.m5466d().beginTransaction();
                for (int i = 0; i < this.f4692b.size(); i += 999) {
                    int min = Math.min(this.f4692b.size() - i, 999);
                    c1253j6 = this.f4693c.mReactDatabaseSupplier;
                    c1253j6.m5466d().delete("catalystLocalStorage", C1244a.m5444a(min), C1244a.m5448a(this.f4692b, i, min));
                }
                c1253j4 = this.f4693c.mReactDatabaseSupplier;
                c1253j4.m5466d().setTransactionSuccessful();
                try {
                    c1253j5 = this.f4693c.mReactDatabaseSupplier;
                    c1253j5.m5466d().endTransaction();
                } catch (Exception e2) {
                    C1700a.m7007b("ReactNative", e2.getMessage(), e2);
                    writableMap = C1245b.m5451a(null, e2.getMessage());
                }
            } catch (Exception e3) {
                C1700a.m7007b("ReactNative", e3.getMessage(), e3);
                WritableMap m5451a = C1245b.m5451a(null, e3.getMessage());
                try {
                    c1253j2 = this.f4693c.mReactDatabaseSupplier;
                    c1253j2.m5466d().endTransaction();
                } catch (Exception e4) {
                    C1700a.m7007b("ReactNative", e4.getMessage(), e4);
                    if (m5451a == null) {
                        writableMap = C1245b.m5451a(null, e4.getMessage());
                    }
                }
                writableMap = m5451a;
            }
            if (writableMap != null) {
                callback = this.f4691a;
                objArr = new Object[]{writableMap};
            } else {
                callback = this.f4691a;
                objArr = new Object[0];
            }
            callback.invoke(objArr);
        } catch (Throwable th) {
            try {
                c1253j = this.f4693c.mReactDatabaseSupplier;
                c1253j.m5466d().endTransaction();
            } catch (Exception e5) {
                C1700a.m7007b("ReactNative", e5.getMessage(), e5);
                C1245b.m5451a(null, e5.getMessage());
            }
            throw th;
        }
    }
}
