package com.facebook.react.animated;

import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReadableMap;

/* renamed from: com.facebook.react.animated.j */
/* loaded from: classes.dex */
public class C1044j extends C1034Q {

    /* renamed from: h */
    private final C1024H f4312h;

    /* renamed from: i */
    private final int f4313i;

    /* renamed from: j */
    private final double f4314j;

    public C1044j(ReadableMap readableMap, C1024H c1024h) {
        this.f4312h = c1024h;
        this.f4313i = readableMap.getInt("input");
        this.f4314j = readableMap.getDouble("modulus");
    }

    @Override // com.facebook.react.animated.AbstractC1036b
    /* renamed from: a */
    public void mo5142a() {
        AbstractC1036b m5126d = this.f4312h.m5126d(this.f4313i);
        if (m5126d == null || !(m5126d instanceof C1034Q)) {
            throw new JSApplicationCausedNativeException("Illegal node ID set as an input for Animated.modulus node");
        }
        this.f4274e = ((C1034Q) m5126d).m5147d() % this.f4314j;
    }
}
