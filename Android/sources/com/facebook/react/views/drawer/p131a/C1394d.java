package com.facebook.react.views.drawer.p131a;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.AbstractC1330c;
import com.facebook.react.uimanager.events.RCTEventEmitter;

/* renamed from: com.facebook.react.views.drawer.a.d */
/* loaded from: classes.dex */
public class C1394d extends AbstractC1330c<C1394d> {

    /* renamed from: f */
    private final int f5117f;

    public C1394d(int i, int i2) {
        super(i);
        this.f5117f = i2;
    }

    /* renamed from: k */
    private WritableMap m5990k() {
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble("drawerState", m5991j());
        return createMap;
    }

    @Override // com.facebook.react.uimanager.events.AbstractC1330c
    /* renamed from: a */
    public void mo5714a(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(m5723g(), mo5715d(), m5990k());
    }

    @Override // com.facebook.react.uimanager.events.AbstractC1330c
    /* renamed from: c */
    public short mo5720c() {
        return (short) 0;
    }

    @Override // com.facebook.react.uimanager.events.AbstractC1330c
    /* renamed from: d */
    public String mo5715d() {
        return "topDrawerStateChanged";
    }

    /* renamed from: j */
    public int m5991j() {
        return this.f5117f;
    }
}
