package com.facebook.react.views.textinput;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.AbstractC1330c;
import com.facebook.react.uimanager.events.RCTEventEmitter;

/* renamed from: com.facebook.react.views.textinput.i */
/* loaded from: classes.dex */
public class C1488i extends AbstractC1330c<C1488i> {

    /* renamed from: f */
    private String f5508f;

    /* renamed from: g */
    private String f5509g;

    /* renamed from: h */
    private int f5510h;

    /* renamed from: i */
    private int f5511i;

    public C1488i(int i, String str, String str2, int i2, int i3) {
        super(i);
        this.f5508f = str;
        this.f5509g = str2;
        this.f5510h = i2;
        this.f5511i = i3;
    }

    /* renamed from: j */
    private WritableMap m6271j() {
        WritableMap createMap = Arguments.createMap();
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putDouble("start", this.f5510h);
        createMap2.putDouble("end", this.f5511i);
        createMap.putString("text", this.f5508f);
        createMap.putString("previousText", this.f5509g);
        createMap.putMap("range", createMap2);
        createMap.putInt("target", m5723g());
        return createMap;
    }

    @Override // com.facebook.react.uimanager.events.AbstractC1330c
    /* renamed from: a */
    public void mo5714a(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(m5723g(), mo5715d(), m6271j());
    }

    @Override // com.facebook.react.uimanager.events.AbstractC1330c
    /* renamed from: a */
    public boolean mo5718a() {
        return false;
    }

    @Override // com.facebook.react.uimanager.events.AbstractC1330c
    /* renamed from: d */
    public String mo5715d() {
        return "topTextInput";
    }
}
