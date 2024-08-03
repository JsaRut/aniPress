package com.facebook.react.views.textinput;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.AbstractC1330c;
import com.facebook.react.uimanager.events.RCTEventEmitter;

/* renamed from: com.facebook.react.views.textinput.p */
/* loaded from: classes.dex */
class C1495p extends AbstractC1330c<C1495p> {

    /* renamed from: f */
    private int f5528f;

    /* renamed from: g */
    private int f5529g;

    public C1495p(int i, int i2, int i3) {
        super(i);
        this.f5528f = i2;
        this.f5529g = i3;
    }

    /* renamed from: j */
    private WritableMap m6275j() {
        WritableMap createMap = Arguments.createMap();
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putInt("end", this.f5529g);
        createMap2.putInt("start", this.f5528f);
        createMap.putMap("selection", createMap2);
        return createMap;
    }

    @Override // com.facebook.react.uimanager.events.AbstractC1330c
    /* renamed from: a */
    public void mo5714a(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(m5723g(), mo5715d(), m6275j());
    }

    @Override // com.facebook.react.uimanager.events.AbstractC1330c
    /* renamed from: d */
    public String mo5715d() {
        return "topSelectionChange";
    }
}
