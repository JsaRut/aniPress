package com.facebook.react.modules.network;

import com.facebook.react.modules.core.DeviceEventManagerModule;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.facebook.react.modules.network.o */
/* loaded from: classes.dex */
public class C1223o implements InterfaceC1227s {

    /* renamed from: a */
    long f4637a = System.nanoTime();

    /* renamed from: b */
    final /* synthetic */ DeviceEventManagerModule.RCTDeviceEventEmitter f4638b;

    /* renamed from: c */
    final /* synthetic */ int f4639c;

    /* renamed from: d */
    final /* synthetic */ NetworkingModule f4640d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1223o(NetworkingModule networkingModule, DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter, int i) {
        this.f4640d = networkingModule;
        this.f4638b = rCTDeviceEventEmitter;
        this.f4639c = i;
    }

    @Override // com.facebook.react.modules.network.InterfaceC1227s
    /* renamed from: a */
    public void mo5423a(long j, long j2, boolean z) {
        boolean shouldDispatch;
        long nanoTime = System.nanoTime();
        if (!z) {
            shouldDispatch = NetworkingModule.shouldDispatch(nanoTime, this.f4637a);
            if (!shouldDispatch) {
                return;
            }
        }
        C1204B.m5397b(this.f4638b, this.f4639c, j, j2);
        this.f4637a = nanoTime;
    }
}
