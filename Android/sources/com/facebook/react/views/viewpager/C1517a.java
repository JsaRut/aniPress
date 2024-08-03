package com.facebook.react.views.viewpager;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.AbstractC1330c;
import com.facebook.react.uimanager.events.RCTEventEmitter;

/* renamed from: com.facebook.react.views.viewpager.a */
/* loaded from: classes.dex */
class C1517a extends AbstractC1330c<C1517a> {

    /* renamed from: f */
    private final int f5625f;

    /* renamed from: g */
    private final float f5626g;

    public C1517a(int i, int i2, float f) {
        super(i);
        this.f5625f = i2;
        this.f5626g = (Float.isInfinite(f) || Float.isNaN(f)) ? 0.0f : f;
    }

    /* renamed from: j */
    private WritableMap m6353j() {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("position", this.f5625f);
        createMap.putDouble("offset", this.f5626g);
        return createMap;
    }

    @Override // com.facebook.react.uimanager.events.AbstractC1330c
    /* renamed from: a */
    public void mo5714a(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(m5723g(), mo5715d(), m6353j());
    }

    @Override // com.facebook.react.uimanager.events.AbstractC1330c
    /* renamed from: d */
    public String mo5715d() {
        return "topPageScroll";
    }
}
