package com.reactnativecommunity.asyncstorage;

import android.database.sqlite.SQLiteStatement;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableMap;
import p139d.p143b.p148c.p153e.C1700a;

/* renamed from: com.reactnativecommunity.asyncstorage.d */
/* loaded from: classes.dex */
class AsyncTaskC1605d extends GuardedAsyncTask<Void, Void> {

    /* renamed from: a */
    final /* synthetic */ Callback f6024a;

    /* renamed from: b */
    final /* synthetic */ ReadableArray f6025b;

    /* renamed from: c */
    final /* synthetic */ AsyncStorageModule f6026c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncTaskC1605d(AsyncStorageModule asyncStorageModule, ReactContext reactContext, Callback callback, ReadableArray readableArray) {
        super(reactContext);
        this.f6026c = asyncStorageModule;
        this.f6024a = callback;
        this.f6025b = readableArray;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.facebook.react.bridge.GuardedAsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void doInBackgroundGuarded(Void... voidArr) {
        boolean ensureDatabase;
        C1613l c1613l;
        C1613l c1613l2;
        C1613l c1613l3;
        Callback callback;
        Object[] objArr;
        C1613l c1613l4;
        C1613l c1613l5;
        C1613l c1613l6;
        C1613l c1613l7;
        C1613l c1613l8;
        C1613l c1613l9;
        ensureDatabase = this.f6026c.ensureDatabase();
        WritableMap writableMap = null;
        if (!ensureDatabase) {
            this.f6024a.invoke(C1603b.m6724a(null));
            return;
        }
        c1613l = this.f6026c.mReactDatabaseSupplier;
        SQLiteStatement compileStatement = c1613l.m6740d().compileStatement("INSERT OR REPLACE INTO catalystLocalStorage VALUES (?, ?);");
        try {
            try {
                c1613l4 = this.f6026c.mReactDatabaseSupplier;
                c1613l4.m6740d().beginTransaction();
                for (int i = 0; i < this.f6025b.size(); i++) {
                    if (this.f6025b.getArray(i).size() != 2) {
                        WritableMap m6727c = C1603b.m6727c(null);
                        try {
                            c1613l7 = this.f6026c.mReactDatabaseSupplier;
                            c1613l7.m6740d().endTransaction();
                            return;
                        } catch (Exception e2) {
                            C1700a.m7007b("ReactNative", e2.getMessage(), e2);
                            if (m6727c == null) {
                                C1603b.m6725a(null, e2.getMessage());
                                return;
                            }
                            return;
                        }
                    }
                    if (this.f6025b.getArray(i).getString(0) == null) {
                        WritableMap m6726b = C1603b.m6726b(null);
                        try {
                            c1613l8 = this.f6026c.mReactDatabaseSupplier;
                            c1613l8.m6740d().endTransaction();
                            return;
                        } catch (Exception e3) {
                            C1700a.m7007b("ReactNative", e3.getMessage(), e3);
                            if (m6726b == null) {
                                C1603b.m6725a(null, e3.getMessage());
                                return;
                            }
                            return;
                        }
                    }
                    if (this.f6025b.getArray(i).getString(1) == null) {
                        WritableMap m6727c2 = C1603b.m6727c(null);
                        try {
                            c1613l9 = this.f6026c.mReactDatabaseSupplier;
                            c1613l9.m6740d().endTransaction();
                            return;
                        } catch (Exception e4) {
                            C1700a.m7007b("ReactNative", e4.getMessage(), e4);
                            if (m6727c2 == null) {
                                C1603b.m6725a(null, e4.getMessage());
                                return;
                            }
                            return;
                        }
                    }
                    compileStatement.clearBindings();
                    compileStatement.bindString(1, this.f6025b.getArray(i).getString(0));
                    compileStatement.bindString(2, this.f6025b.getArray(i).getString(1));
                    compileStatement.execute();
                }
                c1613l5 = this.f6026c.mReactDatabaseSupplier;
                c1613l5.m6740d().setTransactionSuccessful();
                try {
                    c1613l6 = this.f6026c.mReactDatabaseSupplier;
                    c1613l6.m6740d().endTransaction();
                } catch (Exception e5) {
                    C1700a.m7007b("ReactNative", e5.getMessage(), e5);
                    writableMap = C1603b.m6725a(null, e5.getMessage());
                }
            } catch (Exception e6) {
                C1700a.m7007b("ReactNative", e6.getMessage(), e6);
                WritableMap m6725a = C1603b.m6725a(null, e6.getMessage());
                try {
                    c1613l2 = this.f6026c.mReactDatabaseSupplier;
                    c1613l2.m6740d().endTransaction();
                } catch (Exception e7) {
                    C1700a.m7007b("ReactNative", e7.getMessage(), e7);
                    if (m6725a == null) {
                        writableMap = C1603b.m6725a(null, e7.getMessage());
                    }
                }
                writableMap = m6725a;
            }
            if (writableMap != null) {
                callback = this.f6024a;
                objArr = new Object[]{writableMap};
            } else {
                callback = this.f6024a;
                objArr = new Object[0];
            }
            callback.invoke(objArr);
        } catch (Throwable th) {
            try {
                c1613l3 = this.f6026c.mReactDatabaseSupplier;
                c1613l3.m6740d().endTransaction();
            } catch (Exception e8) {
                C1700a.m7007b("ReactNative", e8.getMessage(), e8);
                C1603b.m6725a(null, e8.getMessage());
            }
            throw th;
        }
    }
}
