package com.facebook.react.views.viewpager;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.AbstractC1330c;
import com.facebook.react.uimanager.events.RCTEventEmitter;

/* renamed from: com.facebook.react.views.viewpager.b */
/* loaded from: classes.dex */
class C1518b extends AbstractC1330c<C1518b> {

    /* renamed from: f */
    private final String f5627f;

    public C1518b(int i, String str) {
        super(i);
        this.f5627f = str;
    }

    /* renamed from: j */
    private WritableMap m6354j() {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("pageScrollState", this.f5627f);
        return createMap;
    }

    @Override // com.facebook.react.uimanager.events.AbstractC1330c
    /* renamed from: a */
    public void mo5714a(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(m5723g(), mo5715d(), m6354j());
    }

    @Override // com.facebook.react.uimanager.events.AbstractC1330c
    /* renamed from: d */
    public String mo5715d() {
        return "topPageScrollStateChanged";
    }
}
