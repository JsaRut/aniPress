package com.facebook.react.views.slider;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.AbstractC1330c;
import com.facebook.react.uimanager.events.RCTEventEmitter;

/* renamed from: com.facebook.react.views.slider.d */
/* loaded from: classes.dex */
public class C1437d extends AbstractC1330c<C1437d> {

    /* renamed from: f */
    private final double f5306f;

    public C1437d(int i, double d2) {
        super(i);
        this.f5306f = d2;
    }

    /* renamed from: k */
    private WritableMap m6117k() {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("target", m5723g());
        createMap.putDouble("value", m6118j());
        return createMap;
    }

    @Override // com.facebook.react.uimanager.events.AbstractC1330c
    /* renamed from: a */
    public void mo5714a(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(m5723g(), mo5715d(), m6117k());
    }

    @Override // com.facebook.react.uimanager.events.AbstractC1330c
    /* renamed from: a */
    public boolean mo5718a() {
        return false;
    }

    @Override // com.facebook.react.uimanager.events.AbstractC1330c
    /* renamed from: c */
    public short mo5720c() {
        return (short) 0;
    }

    @Override // com.facebook.react.uimanager.events.AbstractC1330c
    /* renamed from: d */
    public String mo5715d() {
        return "topSlidingComplete";
    }

    /* renamed from: j */
    public double m6118j() {
        return this.f5306f;
    }
}
