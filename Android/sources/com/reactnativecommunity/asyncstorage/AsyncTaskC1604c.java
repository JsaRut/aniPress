package com.reactnativecommunity.asyncstorage;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;

/* renamed from: com.reactnativecommunity.asyncstorage.c */
/* loaded from: classes.dex */
class AsyncTaskC1604c extends GuardedAsyncTask<Void, Void> {

    /* renamed from: a */
    final /* synthetic */ Callback f6021a;

    /* renamed from: b */
    final /* synthetic */ ReadableArray f6022b;

    /* renamed from: c */
    final /* synthetic */ AsyncStorageModule f6023c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncTaskC1604c(AsyncStorageModule asyncStorageModule, ReactContext reactContext, Callback callback, ReadableArray readableArray) {
        super(reactContext);
        this.f6023c = asyncStorageModule;
        this.f6021a = callback;
        this.f6022b = readableArray;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0092, code lost:            if (r7.moveToFirst() != false) goto L19;     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0094, code lost:            r8 = com.facebook.react.bridge.Arguments.createArray();        r8.pushString(r7.getString(0));        r8.pushString(r7.getString(1));        r15.pushArray(r8);        r6.remove(r7.getString(0));     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b4, code lost:            if (r7.moveToNext() != false) goto L41;     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b6, code lost:            r7.close();        r7 = r6.iterator();     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c1, code lost:            if (r7.hasNext() == false) goto L42;     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c3, code lost:            r8 = (java.lang.String) r7.next();        r9 = com.facebook.react.bridge.Arguments.createArray();        r9.pushString(r8);        r9.pushNull();        r15.pushArray(r9);     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d7, code lost:            r6.clear();        r14 = r3 + 999;     */
    @Override // com.facebook.react.bridge.GuardedAsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void doInBackgroundGuarded(java.lang.Void... r20) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.reactnativecommunity.asyncstorage.AsyncTaskC1604c.doInBackgroundGuarded(java.lang.Void[]):void");
    }
}
