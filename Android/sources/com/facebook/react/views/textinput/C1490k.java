package com.facebook.react.views.textinput;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.AbstractC1330c;
import com.facebook.react.uimanager.events.RCTEventEmitter;

/* renamed from: com.facebook.react.views.textinput.k */
/* loaded from: classes.dex */
public class C1490k extends AbstractC1330c<C1488i> {

    /* renamed from: f */
    private String f5512f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1490k(int i, String str) {
        super(i);
        this.f5512f = str;
    }

    /* renamed from: j */
    private WritableMap m6273j() {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("key", this.f5512f);
        return createMap;
    }

    @Override // com.facebook.react.uimanager.events.AbstractC1330c
    /* renamed from: a */
    public void mo5714a(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(m5723g(), mo5715d(), m6273j());
    }

    @Override // com.facebook.react.uimanager.events.AbstractC1330c
    /* renamed from: a */
    public boolean mo5718a() {
        return false;
    }

    @Override // com.facebook.react.uimanager.events.AbstractC1330c
    /* renamed from: d */
    public String mo5715d() {
        return "topKeyPress";
    }
}
