package com.facebook.react.views.scroll;

import android.support.v4.util.C0267m;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.C1374w;
import com.facebook.react.uimanager.events.AbstractC1330c;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import p139d.p143b.p204k.p205a.C2038a;

/* renamed from: com.facebook.react.views.scroll.j */
/* loaded from: classes.dex */
public class C1429j extends AbstractC1330c<C1429j> {

    /* renamed from: f */
    private static final C0267m<C1429j> f5275f = new C0267m<>(3);

    /* renamed from: g */
    private int f5276g;

    /* renamed from: h */
    private int f5277h;

    /* renamed from: i */
    private double f5278i;

    /* renamed from: j */
    private double f5279j;

    /* renamed from: k */
    private int f5280k;

    /* renamed from: l */
    private int f5281l;

    /* renamed from: m */
    private int f5282m;

    /* renamed from: n */
    private int f5283n;

    /* renamed from: o */
    private EnumC1431l f5284o;

    private C1429j() {
    }

    /* renamed from: a */
    public static C1429j m6102a(int i, EnumC1431l enumC1431l, int i2, int i3, float f, float f2, int i4, int i5, int i6, int i7) {
        C1429j mo1326a = f5275f.mo1326a();
        if (mo1326a == null) {
            mo1326a = new C1429j();
        }
        mo1326a.m6103b(i, enumC1431l, i2, i3, f, f2, i4, i5, i6, i7);
        return mo1326a;
    }

    /* renamed from: b */
    private void m6103b(int i, EnumC1431l enumC1431l, int i2, int i3, float f, float f2, int i4, int i5, int i6, int i7) {
        super.m5717a(i);
        this.f5284o = enumC1431l;
        this.f5276g = i2;
        this.f5277h = i3;
        this.f5278i = f;
        this.f5279j = f2;
        this.f5280k = i4;
        this.f5281l = i5;
        this.f5282m = i6;
        this.f5283n = i7;
    }

    /* renamed from: j */
    private WritableMap m6104j() {
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble("top", 0.0d);
        createMap.putDouble("bottom", 0.0d);
        createMap.putDouble("left", 0.0d);
        createMap.putDouble("right", 0.0d);
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putDouble("x", C1374w.m5957a(this.f5276g));
        createMap2.putDouble("y", C1374w.m5957a(this.f5277h));
        WritableMap createMap3 = Arguments.createMap();
        createMap3.putDouble("width", C1374w.m5957a(this.f5280k));
        createMap3.putDouble("height", C1374w.m5957a(this.f5281l));
        WritableMap createMap4 = Arguments.createMap();
        createMap4.putDouble("width", C1374w.m5957a(this.f5282m));
        createMap4.putDouble("height", C1374w.m5957a(this.f5283n));
        WritableMap createMap5 = Arguments.createMap();
        createMap5.putDouble("x", this.f5278i);
        createMap5.putDouble("y", this.f5279j);
        WritableMap createMap6 = Arguments.createMap();
        createMap6.putMap("contentInset", createMap);
        createMap6.putMap("contentOffset", createMap2);
        createMap6.putMap("contentSize", createMap3);
        createMap6.putMap("layoutMeasurement", createMap4);
        createMap6.putMap("velocity", createMap5);
        createMap6.putInt("target", m5723g());
        createMap6.putBoolean("responderIgnoreScroll", true);
        return createMap6;
    }

    @Override // com.facebook.react.uimanager.events.AbstractC1330c
    /* renamed from: a */
    public void mo5714a(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(m5723g(), mo5715d(), m6104j());
    }

    @Override // com.facebook.react.uimanager.events.AbstractC1330c
    /* renamed from: a */
    public boolean mo5718a() {
        return this.f5284o == EnumC1431l.SCROLL;
    }

    @Override // com.facebook.react.uimanager.events.AbstractC1330c
    /* renamed from: c */
    public short mo5720c() {
        return (short) 0;
    }

    @Override // com.facebook.react.uimanager.events.AbstractC1330c
    /* renamed from: d */
    public String mo5715d() {
        EnumC1431l enumC1431l = this.f5284o;
        C2038a.m8318a(enumC1431l);
        return EnumC1431l.m6105a(enumC1431l);
    }

    @Override // com.facebook.react.uimanager.events.AbstractC1330c
    /* renamed from: i */
    public void mo5725i() {
        f5275f.mo1327a(this);
    }
}
