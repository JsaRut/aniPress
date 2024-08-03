package com.facebook.react.views.textinput;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.AbstractC1330c;
import com.facebook.react.uimanager.events.RCTEventEmitter;

/* renamed from: com.facebook.react.views.textinput.b */
/* loaded from: classes.dex */
public class C1481b extends AbstractC1330c<C1485f> {

    /* renamed from: f */
    private float f5474f;

    /* renamed from: g */
    private float f5475g;

    public C1481b(int i, float f, float f2) {
        super(i);
        this.f5474f = f;
        this.f5475g = f2;
    }

    /* renamed from: j */
    private WritableMap m6242j() {
        WritableMap createMap = Arguments.createMap();
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putDouble("width", this.f5474f);
        createMap2.putDouble("height", this.f5475g);
        createMap.putMap("contentSize", createMap2);
        createMap.putInt("target", m5723g());
        return createMap;
    }

    @Override // com.facebook.react.uimanager.events.AbstractC1330c
    /* renamed from: a */
    public void mo5714a(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(m5723g(), mo5715d(), m6242j());
    }

    @Override // com.facebook.react.uimanager.events.AbstractC1330c
    /* renamed from: d */
    public String mo5715d() {
        return "topContentSizeChange";
    }
}
