package com.facebook.react.modules.storage;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableMap;
import p139d.p143b.p148c.p153e.C1700a;

/* renamed from: com.facebook.react.modules.storage.f */
/* loaded from: classes.dex */
class AsyncTaskC1249f extends GuardedAsyncTask<Void, Void> {

    /* renamed from: a */
    final /* synthetic */ Callback f4694a;

    /* renamed from: b */
    final /* synthetic */ ReadableArray f4695b;

    /* renamed from: c */
    final /* synthetic */ AsyncStorageModule f4696c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncTaskC1249f(AsyncStorageModule asyncStorageModule, ReactContext reactContext, Callback callback, ReadableArray readableArray) {
        super(reactContext);
        this.f4696c = asyncStorageModule;
        this.f4694a = callback;
        this.f4695b = readableArray;
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
        C1253j c1253j7;
        C1253j c1253j8;
        C1253j c1253j9;
        C1253j c1253j10;
        ensureDatabase = this.f4696c.ensureDatabase();
        WritableMap writableMap = null;
        try {
            if (!ensureDatabase) {
                this.f4694a.invoke(C1245b.m5450a(null));
                return;
            }
            try {
                c1253j3 = this.f4696c.mReactDatabaseSupplier;
                c1253j3.m5466d().beginTransaction();
                for (int i = 0; i < this.f4695b.size(); i++) {
                    if (this.f4695b.getArray(i).size() != 2) {
                        WritableMap m5453c = C1245b.m5453c(null);
                        try {
                            c1253j6 = this.f4696c.mReactDatabaseSupplier;
                            c1253j6.m5466d().endTransaction();
                            return;
                        } catch (Exception e2) {
                            C1700a.m7007b("ReactNative", e2.getMessage(), e2);
                            if (m5453c == null) {
                                C1245b.m5451a(null, e2.getMessage());
                                return;
                            }
                            return;
                        }
                    }
                    if (this.f4695b.getArray(i).getString(0) == null) {
                        WritableMap m5452b = C1245b.m5452b(null);
                        try {
                            c1253j7 = this.f4696c.mReactDatabaseSupplier;
                            c1253j7.m5466d().endTransaction();
                            return;
                        } catch (Exception e3) {
                            C1700a.m7007b("ReactNative", e3.getMessage(), e3);
                            if (m5452b == null) {
                                C1245b.m5451a(null, e3.getMessage());
                                return;
                            }
                            return;
                        }
                    }
                    if (this.f4695b.getArray(i).getString(1) == null) {
                        WritableMap m5453c2 = C1245b.m5453c(null);
                        try {
                            c1253j8 = this.f4696c.mReactDatabaseSupplier;
                            c1253j8.m5466d().endTransaction();
                            return;
                        } catch (Exception e4) {
                            C1700a.m7007b("ReactNative", e4.getMessage(), e4);
                            if (m5453c2 == null) {
                                C1245b.m5451a(null, e4.getMessage());
                                return;
                            }
                            return;
                        }
                    }
                    c1253j9 = this.f4696c.mReactDatabaseSupplier;
                    if (!C1244a.m5447a(c1253j9.m5466d(), this.f4695b.getArray(i).getString(0), this.f4695b.getArray(i).getString(1))) {
                        WritableMap m5450a = C1245b.m5450a(null);
                        try {
                            c1253j10 = this.f4696c.mReactDatabaseSupplier;
                            c1253j10.m5466d().endTransaction();
                            return;
                        } catch (Exception e5) {
                            C1700a.m7007b("ReactNative", e5.getMessage(), e5);
                            if (m5450a == null) {
                                C1245b.m5451a(null, e5.getMessage());
                                return;
                            }
                            return;
                        }
                    }
                }
                c1253j4 = this.f4696c.mReactDatabaseSupplier;
                c1253j4.m5466d().setTransactionSuccessful();
                try {
                    c1253j5 = this.f4696c.mReactDatabaseSupplier;
                    c1253j5.m5466d().endTransaction();
                } catch (Exception e6) {
                    C1700a.m7007b("ReactNative", e6.getMessage(), e6);
                    writableMap = C1245b.m5451a(null, e6.getMessage());
                }
            } catch (Exception e7) {
                C1700a.m7007b("ReactNative", e7.getMessage(), e7);
                WritableMap m5451a = C1245b.m5451a(null, e7.getMessage());
                try {
                    c1253j2 = this.f4696c.mReactDatabaseSupplier;
                    c1253j2.m5466d().endTransaction();
                } catch (Exception e8) {
                    C1700a.m7007b("ReactNative", e8.getMessage(), e8);
                    if (m5451a == null) {
                        writableMap = C1245b.m5451a(null, e8.getMessage());
                    }
                }
                writableMap = m5451a;
            }
            if (writableMap != null) {
                callback = this.f4694a;
                objArr = new Object[]{writableMap};
            } else {
                callback = this.f4694a;
                objArr = new Object[0];
            }
            callback.invoke(objArr);
        } catch (Throwable th) {
            try {
                c1253j = this.f4696c.mReactDatabaseSupplier;
                c1253j.m5466d().endTransaction();
            } catch (Exception e9) {
                C1700a.m7007b("ReactNative", e9.getMessage(), e9);
                C1245b.m5451a(null, e9.getMessage());
            }
            throw th;
        }
    }
}
