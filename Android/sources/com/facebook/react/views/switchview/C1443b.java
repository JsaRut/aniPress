package com.facebook.react.views.switchview;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.AbstractC1330c;
import com.facebook.react.uimanager.events.RCTEventEmitter;

/* renamed from: com.facebook.react.views.switchview.b */
/* loaded from: classes.dex */
class C1443b extends AbstractC1330c<C1443b> {

    /* renamed from: f */
    private final boolean f5322f;

    public C1443b(int i, boolean z) {
        super(i);
        this.f5322f = z;
    }

    /* renamed from: k */
    private WritableMap m6128k() {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("target", m5723g());
        createMap.putBoolean("value", m6129j());
        return createMap;
    }

    @Override // com.facebook.react.uimanager.events.AbstractC1330c
    /* renamed from: a */
    public void mo5714a(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(m5723g(), mo5715d(), m6128k());
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
    public boolean m6129j() {
        return this.f5322f;
    }
}
