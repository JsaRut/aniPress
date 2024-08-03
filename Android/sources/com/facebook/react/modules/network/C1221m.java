package com.facebook.react.modules.network;

import com.facebook.react.modules.core.DeviceEventManagerModule;
import okhttp3.Interceptor;
import okhttp3.Response;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.facebook.react.modules.network.m */
/* loaded from: classes.dex */
public class C1221m implements Interceptor {

    /* renamed from: a */
    final /* synthetic */ String f4628a;

    /* renamed from: b */
    final /* synthetic */ DeviceEventManagerModule.RCTDeviceEventEmitter f4629b;

    /* renamed from: c */
    final /* synthetic */ int f4630c;

    /* renamed from: d */
    final /* synthetic */ NetworkingModule f4631d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1221m(NetworkingModule networkingModule, String str, DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter, int i) {
        this.f4631d = networkingModule;
        this.f4628a = str;
        this.f4629b = rCTDeviceEventEmitter;
        this.f4630c = i;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        Response proceed = chain.proceed(chain.request());
        return proceed.newBuilder().body(new C1231w(proceed.body(), new C1220l(this))).build();
    }
}
