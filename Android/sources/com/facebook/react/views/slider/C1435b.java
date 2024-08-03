package com.facebook.react.views.slider;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.AbstractC1330c;
import com.facebook.react.uimanager.events.RCTEventEmitter;

/* renamed from: com.facebook.react.views.slider.b */
/* loaded from: classes.dex */
public class C1435b extends AbstractC1330c<C1435b> {

    /* renamed from: f */
    private final double f5304f;

    /* renamed from: g */
    private final boolean f5305g;

    public C1435b(int i, double d2, boolean z) {
        super(i);
        this.f5304f = d2;
        this.f5305g = z;
    }

    /* renamed from: l */
    private WritableMap m6114l() {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("target", m5723g());
        createMap.putDouble("value", m6115j());
        createMap.putBoolean("fromUser", m6116k());
        return createMap;
    }

    @Override // com.facebook.react.uimanager.events.AbstractC1330c
    /* renamed from: a */
    public void mo5714a(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(m5723g(), mo5715d(), m6114l());
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
    public double m6115j() {
        return this.f5304f;
    }

    /* renamed from: k */
    public boolean m6116k() {
        return this.f5305g;
    }
}
