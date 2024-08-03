package com.facebook.react.views.webview.p134a;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.AbstractC1330c;
import com.facebook.react.uimanager.events.RCTEventEmitter;

/* renamed from: com.facebook.react.views.webview.a.d */
/* loaded from: classes.dex */
public class C1528d extends AbstractC1330c<C1528d> {

    /* renamed from: f */
    private final String f5650f;

    public C1528d(int i, String str) {
        super(i);
        this.f5650f = str;
    }

    @Override // com.facebook.react.uimanager.events.AbstractC1330c
    /* renamed from: a */
    public void mo5714a(RCTEventEmitter rCTEventEmitter) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("data", this.f5650f);
        rCTEventEmitter.receiveEvent(m5723g(), "topMessage", createMap);
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
        return "topMessage";
    }
}
