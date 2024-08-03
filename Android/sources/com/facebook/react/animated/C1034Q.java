package com.facebook.react.animated;

import com.facebook.react.bridge.ReadableMap;

/* renamed from: com.facebook.react.animated.Q */
/* loaded from: classes.dex */
class C1034Q extends AbstractC1036b {

    /* renamed from: e */
    double f4274e;

    /* renamed from: f */
    double f4275f;

    /* renamed from: g */
    private InterfaceC1037c f4276g;

    public C1034Q() {
        this.f4274e = Double.NaN;
        this.f4275f = 0.0d;
    }

    public C1034Q(ReadableMap readableMap) {
        this.f4274e = Double.NaN;
        this.f4275f = 0.0d;
        this.f4274e = readableMap.getDouble("value");
        this.f4275f = readableMap.getDouble("offset");
    }

    /* renamed from: a */
    public void m5144a(InterfaceC1037c interfaceC1037c) {
        this.f4276g = interfaceC1037c;
    }

    /* renamed from: b */
    public void m5145b() {
        this.f4275f += this.f4274e;
        this.f4274e = 0.0d;
    }

    /* renamed from: c */
    public void m5146c() {
        this.f4274e += this.f4275f;
        this.f4275f = 0.0d;
    }

    /* renamed from: d */
    public double m5147d() {
        return this.f4275f + this.f4274e;
    }

    /* renamed from: e */
    public void m5148e() {
        InterfaceC1037c interfaceC1037c = this.f4276g;
        if (interfaceC1037c == null) {
            return;
        }
        interfaceC1037c.mo5105a(m5147d());
    }
}
