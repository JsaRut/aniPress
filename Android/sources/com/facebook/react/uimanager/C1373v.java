package com.facebook.react.uimanager;

import android.support.v4.util.C0267m;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.AbstractC1330c;
import com.facebook.react.uimanager.events.RCTEventEmitter;

/* renamed from: com.facebook.react.uimanager.v */
/* loaded from: classes.dex */
public class C1373v extends AbstractC1330c<C1373v> {

    /* renamed from: f */
    private static final C0267m<C1373v> f5082f = new C0267m<>(20);

    /* renamed from: g */
    private int f5083g;

    /* renamed from: h */
    private int f5084h;

    /* renamed from: i */
    private int f5085i;

    /* renamed from: j */
    private int f5086j;

    private C1373v() {
    }

    /* renamed from: b */
    public static C1373v m5954b(int i, int i2, int i3, int i4, int i5) {
        C1373v mo1326a = f5082f.mo1326a();
        if (mo1326a == null) {
            mo1326a = new C1373v();
        }
        mo1326a.m5955a(i, i2, i3, i4, i5);
        return mo1326a;
    }

    /* renamed from: a */
    protected void m5955a(int i, int i2, int i3, int i4, int i5) {
        super.m5717a(i);
        this.f5083g = i2;
        this.f5084h = i3;
        this.f5085i = i4;
        this.f5086j = i5;
    }

    @Override // com.facebook.react.uimanager.events.AbstractC1330c
    /* renamed from: a */
    public void mo5714a(RCTEventEmitter rCTEventEmitter) {
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble("x", C1374w.m5957a(this.f5083g));
        createMap.putDouble("y", C1374w.m5957a(this.f5084h));
        createMap.putDouble("width", C1374w.m5957a(this.f5085i));
        createMap.putDouble("height", C1374w.m5957a(this.f5086j));
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putMap("layout", createMap);
        createMap2.putInt("target", m5723g());
        rCTEventEmitter.receiveEvent(m5723g(), mo5715d(), createMap2);
    }

    @Override // com.facebook.react.uimanager.events.AbstractC1330c
    /* renamed from: d */
    public String mo5715d() {
        return "topLayout";
    }

    @Override // com.facebook.react.uimanager.events.AbstractC1330c
    /* renamed from: i */
    public void mo5725i() {
        f5082f.mo1327a(this);
    }
}
