package com.facebook.react.views.drawer.p131a;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.AbstractC1330c;
import com.facebook.react.uimanager.events.RCTEventEmitter;

/* renamed from: com.facebook.react.views.drawer.a.c */
/* loaded from: classes.dex */
public class C1393c extends AbstractC1330c<C1393c> {

    /* renamed from: f */
    private final float f5116f;

    public C1393c(int i, float f) {
        super(i);
        this.f5116f = f;
    }

    /* renamed from: k */
    private WritableMap m5988k() {
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble("offset", m5989j());
        return createMap;
    }

    @Override // com.facebook.react.uimanager.events.AbstractC1330c
    /* renamed from: a */
    public void mo5714a(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(m5723g(), mo5715d(), m5988k());
    }

    @Override // com.facebook.react.uimanager.events.AbstractC1330c
    /* renamed from: c */
    public short mo5720c() {
        return (short) 0;
    }

    @Override // com.facebook.react.uimanager.events.AbstractC1330c
    /* renamed from: d */
    public String mo5715d() {
        return "topDrawerSlide";
    }

    /* renamed from: j */
    public float m5989j() {
        return this.f5116f;
    }
}
