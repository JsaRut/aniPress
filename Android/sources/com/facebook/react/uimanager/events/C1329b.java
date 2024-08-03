package com.facebook.react.uimanager.events;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.C1374w;

/* renamed from: com.facebook.react.uimanager.events.b */
/* loaded from: classes.dex */
public class C1329b extends AbstractC1330c<C1329b> {

    /* renamed from: f */
    private final int f4863f;

    /* renamed from: g */
    private final int f4864g;

    public C1329b(int i, int i2, int i3) {
        super(i);
        this.f4863f = i2;
        this.f4864g = i3;
    }

    @Override // com.facebook.react.uimanager.events.AbstractC1330c
    /* renamed from: a */
    public void mo5714a(RCTEventEmitter rCTEventEmitter) {
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble("width", C1374w.m5957a(this.f4863f));
        createMap.putDouble("height", C1374w.m5957a(this.f4864g));
        rCTEventEmitter.receiveEvent(m5723g(), "topContentSizeChange", createMap);
    }

    @Override // com.facebook.react.uimanager.events.AbstractC1330c
    /* renamed from: d */
    public String mo5715d() {
        return "topContentSizeChange";
    }
}
