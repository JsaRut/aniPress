package com.facebook.react.animated;

import com.facebook.react.animated.NativeAnimatedModule;
import com.facebook.react.bridge.ReadableMap;

/* renamed from: com.facebook.react.animated.w */
/* loaded from: classes.dex */
class C1057w implements NativeAnimatedModule.InterfaceC1031a {

    /* renamed from: a */
    final /* synthetic */ int f4347a;

    /* renamed from: b */
    final /* synthetic */ String f4348b;

    /* renamed from: c */
    final /* synthetic */ ReadableMap f4349c;

    /* renamed from: d */
    final /* synthetic */ NativeAnimatedModule f4350d;

    public C1057w(NativeAnimatedModule nativeAnimatedModule, int i, String str, ReadableMap readableMap) {
        this.f4350d = nativeAnimatedModule;
        this.f4347a = i;
        this.f4348b = str;
        this.f4349c = readableMap;
    }

    @Override // com.facebook.react.animated.NativeAnimatedModule.InterfaceC1031a
    /* renamed from: a */
    public void mo5104a(C1024H c1024h) {
        c1024h.m5117a(this.f4347a, this.f4348b, this.f4349c);
    }
}
