package com.facebook.react.animated;

import com.facebook.react.animated.NativeAnimatedModule;
import com.facebook.react.bridge.ReadableMap;

/* renamed from: com.facebook.react.animated.A */
/* loaded from: classes.dex */
class C1017A implements NativeAnimatedModule.InterfaceC1031a {

    /* renamed from: a */
    final /* synthetic */ int f4208a;

    /* renamed from: b */
    final /* synthetic */ ReadableMap f4209b;

    /* renamed from: c */
    final /* synthetic */ NativeAnimatedModule f4210c;

    public C1017A(NativeAnimatedModule nativeAnimatedModule, int i, ReadableMap readableMap) {
        this.f4210c = nativeAnimatedModule;
        this.f4208a = i;
        this.f4209b = readableMap;
    }

    @Override // com.facebook.react.animated.NativeAnimatedModule.InterfaceC1031a
    /* renamed from: a */
    public void mo5104a(C1024H c1024h) {
        c1024h.m5115a(this.f4208a, this.f4209b);
    }
}
