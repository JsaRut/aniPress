package com.facebook.react.views.viewpager;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.AbstractC1330c;
import com.facebook.react.uimanager.events.RCTEventEmitter;

/* renamed from: com.facebook.react.views.viewpager.c */
/* loaded from: classes.dex */
class C1519c extends AbstractC1330c<C1519c> {

    /* renamed from: f */
    private final int f5628f;

    public C1519c(int i, int i2) {
        super(i);
        this.f5628f = i2;
    }

    /* renamed from: j */
    private WritableMap m6355j() {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("position", this.f5628f);
        return createMap;
    }

    @Override // com.facebook.react.uimanager.events.AbstractC1330c
    /* renamed from: a */
    public void mo5714a(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(m5723g(), mo5715d(), m6355j());
    }

    @Override // com.facebook.react.uimanager.events.AbstractC1330c
    /* renamed from: d */
    public String mo5715d() {
        return "topPageSelected";
    }
}
