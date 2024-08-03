package com.facebook.react.views.webview.p134a;

import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.AbstractC1330c;
import com.facebook.react.uimanager.events.RCTEventEmitter;

/* renamed from: com.facebook.react.views.webview.a.c */
/* loaded from: classes.dex */
public class C1527c extends AbstractC1330c<C1527c> {

    /* renamed from: f */
    private WritableMap f5649f;

    public C1527c(int i, WritableMap writableMap) {
        super(i);
        this.f5649f = writableMap;
    }

    @Override // com.facebook.react.uimanager.events.AbstractC1330c
    /* renamed from: a */
    public void mo5714a(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(m5723g(), mo5715d(), this.f5649f);
    }

    @Override // com.facebook.react.uimanager.events.AbstractC1330c
    /* renamed from: a */
    public boolean mo5718a() {
        return false;
    }

    @Override // com.facebook.react.uimanager.events.AbstractC1330c
    /* renamed from: c */
    public short mo5720c() {
        return (short) 0;
    }

    @Override // com.facebook.react.uimanager.events.AbstractC1330c
    /* renamed from: d */
    public String mo5715d() {
        return "topLoadingStart";
    }
}
