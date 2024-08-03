package com.facebook.react.views.checkbox;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.AbstractC1330c;
import com.facebook.react.uimanager.events.RCTEventEmitter;

/* renamed from: com.facebook.react.views.checkbox.b */
/* loaded from: classes.dex */
class C1387b extends AbstractC1330c<C1387b> {

    /* renamed from: f */
    private final boolean f5111f;

    public C1387b(int i, boolean z) {
        super(i);
        this.f5111f = z;
    }

    /* renamed from: k */
    private WritableMap m5980k() {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("target", m5723g());
        createMap.putBoolean("value", m5981j());
        return createMap;
    }

    @Override // com.facebook.react.uimanager.events.AbstractC1330c
    /* renamed from: a */
    public void mo5714a(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(m5723g(), mo5715d(), m5980k());
    }

    @Override // com.facebook.react.uimanager.events.AbstractC1330c
    /* renamed from: c */
    public short mo5720c() {
        return (short) 0;
    }

    @Override // com.facebook.react.uimanager.events.AbstractC1330c
    /* renamed from: d */
    public String mo5715d() {
        return "topChange";
    }

    /* renamed from: j */
    public boolean m5981j() {
        return this.f5111f;
    }
}
