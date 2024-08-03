package com.facebook.react.views.picker.p132a;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.AbstractC1330c;
import com.facebook.react.uimanager.events.RCTEventEmitter;

/* renamed from: com.facebook.react.views.picker.a.a */
/* loaded from: classes.dex */
public class C1415a extends AbstractC1330c<C1415a> {

    /* renamed from: f */
    private final int f5192f;

    public C1415a(int i, int i2) {
        super(i);
        this.f5192f = i2;
    }

    /* renamed from: j */
    private WritableMap m6039j() {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("position", this.f5192f);
        return createMap;
    }

    @Override // com.facebook.react.uimanager.events.AbstractC1330c
    /* renamed from: a */
    public void mo5714a(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(m5723g(), mo5715d(), m6039j());
    }

    @Override // com.facebook.react.uimanager.events.AbstractC1330c
    /* renamed from: d */
    public String mo5715d() {
        return "topSelect";
    }
}
