package com.facebook.react.modules.image;

import android.net.Uri;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableMap;
import p139d.p143b.p169g.p170a.p171a.C1763c;
import p139d.p143b.p184i.p192f.C1893j;

/* renamed from: com.facebook.react.modules.image.c */
/* loaded from: classes.dex */
class AsyncTaskC1193c extends GuardedAsyncTask<Void, Void> {

    /* renamed from: a */
    final /* synthetic */ ReadableArray f4579a;

    /* renamed from: b */
    final /* synthetic */ Promise f4580b;

    /* renamed from: c */
    final /* synthetic */ ImageLoaderModule f4581c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncTaskC1193c(ImageLoaderModule imageLoaderModule, ReactContext reactContext, ReadableArray readableArray, Promise promise) {
        super(reactContext);
        this.f4581c = imageLoaderModule;
        this.f4579a = readableArray;
        this.f4580b = promise;
    }

    @Override // com.facebook.react.bridge.GuardedAsyncTask
    /* renamed from: a */
    public void doInBackgroundGuarded(Void... voidArr) {
        String str;
        WritableMap createMap = Arguments.createMap();
        C1893j m7207a = C1763c.m7207a();
        for (int i = 0; i < this.f4579a.size(); i++) {
            String string = this.f4579a.getString(i);
            Uri parse = Uri.parse(string);
            if (m7207a.m7688a(parse)) {
                str = "memory";
            } else if (m7207a.m7693b(parse)) {
                str = "disk";
            }
            createMap.putString(string, str);
        }
        this.f4580b.resolve(createMap);
    }
}
