package com.facebook.react.views.textinput;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.AbstractC1330c;
import com.facebook.react.uimanager.events.RCTEventEmitter;

/* renamed from: com.facebook.react.views.textinput.f */
/* loaded from: classes.dex */
public class C1485f extends AbstractC1330c<C1485f> {

    /* renamed from: f */
    private String f5505f;

    /* renamed from: g */
    private int f5506g;

    public C1485f(int i, String str, int i2) {
        super(i);
        this.f5505f = str;
        this.f5506g = i2;
    }

    /* renamed from: j */
    private WritableMap m6268j() {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("text", this.f5505f);
        createMap.putInt("eventCount", this.f5506g);
        createMap.putInt("target", m5723g());
        return createMap;
    }

    @Override // com.facebook.react.uimanager.events.AbstractC1330c
    /* renamed from: a */
    public void mo5714a(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(m5723g(), mo5715d(), m6268j());
    }

    @Override // com.facebook.react.uimanager.events.AbstractC1330c
    /* renamed from: d */
    public String mo5715d() {
        return "topChange";
    }
}
