package com.facebook.react.views.textinput;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.AbstractC1330c;
import com.facebook.react.uimanager.events.RCTEventEmitter;

/* renamed from: com.facebook.react.views.textinput.h */
/* loaded from: classes.dex */
class C1487h extends AbstractC1330c<C1487h> {

    /* renamed from: f */
    private String f5507f;

    public C1487h(int i, String str) {
        super(i);
        this.f5507f = str;
    }

    /* renamed from: j */
    private WritableMap m6270j() {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("target", m5723g());
        createMap.putString("text", this.f5507f);
        return createMap;
    }

    @Override // com.facebook.react.uimanager.events.AbstractC1330c
    /* renamed from: a */
    public void mo5714a(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(m5723g(), mo5715d(), m6270j());
    }

    @Override // com.facebook.react.uimanager.events.AbstractC1330c
    /* renamed from: a */
    public boolean mo5718a() {
        return false;
    }

    @Override // com.facebook.react.uimanager.events.AbstractC1330c
    /* renamed from: d */
    public String mo5715d() {
        return "topEndEditing";
    }
}
