package com.facebook.react.views.toolbar.p133a;

import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.events.AbstractC1330c;
import com.facebook.react.uimanager.events.RCTEventEmitter;

/* renamed from: com.facebook.react.views.toolbar.a.a */
/* loaded from: classes.dex */
public class C1501a extends AbstractC1330c<C1501a> {

    /* renamed from: f */
    private final int f5537f;

    public C1501a(int i, int i2) {
        super(i);
        this.f5537f = i2;
    }

    @Override // com.facebook.react.uimanager.events.AbstractC1330c
    /* renamed from: a */
    public void mo5714a(RCTEventEmitter rCTEventEmitter) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putInt("position", m6280j());
        rCTEventEmitter.receiveEvent(m5723g(), mo5715d(), writableNativeMap);
    }

    @Override // com.facebook.react.uimanager.events.AbstractC1330c
    /* renamed from: a */
    public boolean mo5718a() {
        return false;
    }

    @Override // com.facebook.react.uimanager.events.AbstractC1330c
    /* renamed from: d */
    public String mo5715d() {
        return "topSelect";
    }

    /* renamed from: j */
    public int m6280j() {
        return this.f5537f;
    }
}
