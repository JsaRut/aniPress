package com.facebook.react.animated;

import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReadableMap;

/* renamed from: com.facebook.react.animated.f */
/* loaded from: classes.dex */
public class C1040f extends C1034Q {

    /* renamed from: h */
    private final C1024H f4294h;

    /* renamed from: i */
    private final int f4295i;

    /* renamed from: j */
    private final double f4296j;

    /* renamed from: k */
    private final double f4297k;

    /* renamed from: l */
    private double f4298l = 0.0d;

    public C1040f(ReadableMap readableMap, C1024H c1024h) {
        this.f4294h = c1024h;
        this.f4295i = readableMap.getInt("input");
        this.f4296j = readableMap.getDouble("min");
        this.f4297k = readableMap.getDouble("max");
        this.f4274e = 0.0d;
    }

    /* renamed from: f */
    private double m5153f() {
        AbstractC1036b m5126d = this.f4294h.m5126d(this.f4295i);
        if (m5126d == null || !(m5126d instanceof C1034Q)) {
            throw new JSApplicationCausedNativeException("Illegal node ID set as an input for Animated.DiffClamp node");
        }
        return ((C1034Q) m5126d).m5147d();
    }

    @Override // com.facebook.react.animated.AbstractC1036b
    /* renamed from: a */
    public void mo5142a() {
        double m5153f = m5153f();
        double d2 = m5153f - this.f4298l;
        this.f4298l = m5153f;
        this.f4274e = Math.min(Math.max(this.f4274e + d2, this.f4296j), this.f4297k);
    }
}
