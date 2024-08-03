package com.facebook.react.animated;

import com.facebook.react.animated.NativeAnimatedModule;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReadableMap;

/* renamed from: com.facebook.react.animated.o */
/* loaded from: classes.dex */
class C1049o implements NativeAnimatedModule.InterfaceC1031a {

    /* renamed from: a */
    final /* synthetic */ int f4324a;

    /* renamed from: b */
    final /* synthetic */ int f4325b;

    /* renamed from: c */
    final /* synthetic */ ReadableMap f4326c;

    /* renamed from: d */
    final /* synthetic */ Callback f4327d;

    /* renamed from: e */
    final /* synthetic */ NativeAnimatedModule f4328e;

    public C1049o(NativeAnimatedModule nativeAnimatedModule, int i, int i2, ReadableMap readableMap, Callback callback) {
        this.f4328e = nativeAnimatedModule;
        this.f4324a = i;
        this.f4325b = i2;
        this.f4326c = readableMap;
        this.f4327d = callback;
    }

    @Override // com.facebook.react.animated.NativeAnimatedModule.InterfaceC1031a
    /* renamed from: a */
    public void mo5104a(C1024H c1024h) {
        c1024h.m5113a(this.f4324a, this.f4325b, this.f4326c, this.f4327d);
    }
}
