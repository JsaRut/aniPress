package com.facebook.react.modules.storage;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.ReactContext;

/* renamed from: com.facebook.react.modules.storage.h */
/* loaded from: classes.dex */
class AsyncTaskC1251h extends GuardedAsyncTask<Void, Void> {

    /* renamed from: a */
    final /* synthetic */ Callback f4699a;

    /* renamed from: b */
    final /* synthetic */ AsyncStorageModule f4700b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncTaskC1251h(AsyncStorageModule asyncStorageModule, ReactContext reactContext, Callback callback) {
        super(reactContext);
        this.f4700b = asyncStorageModule;
        this.f4699a = callback;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0041, code lost:            r13.pushString(r4.getString(0));     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004c, code lost:            if (r4.moveToNext() != false) goto L26;     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004e, code lost:            r4.close();        r12.f4699a.invoke(null, r13);     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005c, code lost:            return;     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003f, code lost:            if (r4.moveToFirst() != false) goto L9;     */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.facebook.react.bridge.GuardedAsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void doInBackgroundGuarded(java.lang.Void... r13) {
        /*
            r12 = this;
            com.facebook.react.modules.storage.AsyncStorageModule r13 = r12.f4700b
            boolean r13 = com.facebook.react.modules.storage.AsyncStorageModule.access$000(r13)
            r0 = 2
            r1 = 1
            r2 = 0
            r3 = 0
            if (r13 != 0) goto L1c
            com.facebook.react.bridge.Callback r13 = r12.f4699a
            java.lang.Object[] r0 = new java.lang.Object[r0]
            com.facebook.react.bridge.WritableMap r4 = com.facebook.react.modules.storage.C1245b.m5450a(r2)
            r0[r3] = r4
            r0[r1] = r2
            r13.invoke(r0)
            return
        L1c:
            com.facebook.react.bridge.WritableArray r13 = com.facebook.react.bridge.Arguments.createArray()
            java.lang.String[] r6 = new java.lang.String[r1]
            java.lang.String r4 = "key"
            r6[r3] = r4
            com.facebook.react.modules.storage.AsyncStorageModule r4 = r12.f4700b
            com.facebook.react.modules.storage.j r4 = com.facebook.react.modules.storage.AsyncStorageModule.access$100(r4)
            android.database.sqlite.SQLiteDatabase r4 = r4.m5466d()
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            java.lang.String r5 = "catalystLocalStorage"
            android.database.Cursor r4 = r4.query(r5, r6, r7, r8, r9, r10, r11)
            boolean r5 = r4.moveToFirst()     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L5f
            if (r5 == 0) goto L4e
        L41:
            java.lang.String r5 = r4.getString(r3)     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L5f
            r13.pushString(r5)     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L5f
            boolean r5 = r4.moveToNext()     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L5f
            if (r5 != 0) goto L41
        L4e:
            r4.close()
            com.facebook.react.bridge.Callback r4 = r12.f4699a
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r3] = r2
            r0[r1] = r13
            r4.invoke(r0)
            return
        L5d:
            r13 = move-exception
            goto L80
        L5f:
            r13 = move-exception
            java.lang.String r5 = "ReactNative"
            java.lang.String r6 = r13.getMessage()     // Catch: java.lang.Throwable -> L5d
            p139d.p143b.p148c.p153e.C1700a.m7007b(r5, r6, r13)     // Catch: java.lang.Throwable -> L5d
            com.facebook.react.bridge.Callback r5 = r12.f4699a     // Catch: java.lang.Throwable -> L5d
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L5d
            java.lang.String r13 = r13.getMessage()     // Catch: java.lang.Throwable -> L5d
            com.facebook.react.bridge.WritableMap r13 = com.facebook.react.modules.storage.C1245b.m5451a(r2, r13)     // Catch: java.lang.Throwable -> L5d
            r0[r3] = r13     // Catch: java.lang.Throwable -> L5d
            r0[r1] = r2     // Catch: java.lang.Throwable -> L5d
            r5.invoke(r0)     // Catch: java.lang.Throwable -> L5d
            r4.close()
            return
        L80:
            r4.close()
            throw r13
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.modules.storage.AsyncTaskC1251h.doInBackgroundGuarded(java.lang.Void[]):void");
    }
}
