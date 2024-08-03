package com.facebook.react.animated;

import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableMap;

/* renamed from: com.facebook.react.animated.N */
/* loaded from: classes.dex */
public class C1030N extends AbstractC1036b {

    /* renamed from: e */
    private final C1024H f4261e;

    /* renamed from: f */
    private final int f4262f;

    /* renamed from: g */
    private final int f4263g;

    /* renamed from: h */
    private final int f4264h;

    /* renamed from: i */
    private final JavaOnlyMap f4265i;

    public C1030N(ReadableMap readableMap, C1024H c1024h) {
        this.f4261e = c1024h;
        this.f4262f = readableMap.getInt("animationId");
        this.f4263g = readableMap.getInt("toValue");
        this.f4264h = readableMap.getInt("value");
        this.f4265i = JavaOnlyMap.deepClone(readableMap.getMap("animationConfig"));
    }

    @Override // com.facebook.react.animated.AbstractC1036b
    /* renamed from: a */
    public void mo5142a() {
        this.f4265i.putDouble("toValue", ((C1034Q) this.f4261e.m5126d(this.f4263g)).m5147d());
        this.f4261e.m5113a(this.f4262f, this.f4264h, this.f4265i, null);
    }
}
