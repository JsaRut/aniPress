package com.swmansion.gesturehandler.react;

import android.support.v4.util.C0267m;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.AbstractC1330c;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import p139d.p273d.p274a.C2686c;

/* renamed from: com.swmansion.gesturehandler.react.l */
/* loaded from: classes.dex */
public class C1634l extends AbstractC1330c<C1634l> {

    /* renamed from: f */
    private static final C0267m<C1634l> f6073f = new C0267m<>(7);

    /* renamed from: g */
    private WritableMap f6074g;

    private C1634l() {
    }

    /* renamed from: a */
    public static C1634l m6798a(C2686c c2686c, int i, int i2, InterfaceC1625c interfaceC1625c) {
        C1634l mo1326a = f6073f.mo1326a();
        if (mo1326a == null) {
            mo1326a = new C1634l();
        }
        mo1326a.m6799b(c2686c, i, i2, interfaceC1625c);
        return mo1326a;
    }

    /* renamed from: b */
    private void m6799b(C2686c c2686c, int i, int i2, InterfaceC1625c interfaceC1625c) {
        super.m5717a(c2686c.m11539m().getId());
        this.f6074g = Arguments.createMap();
        if (interfaceC1625c != null) {
            interfaceC1625c.mo6753a(c2686c, this.f6074g);
        }
        this.f6074g.putInt("handlerTag", c2686c.m11538l());
        this.f6074g.putInt("state", i);
        this.f6074g.putInt("oldState", i2);
    }

    @Override // com.facebook.react.uimanager.events.AbstractC1330c
    /* renamed from: a */
    public void mo5714a(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(m5723g(), "onGestureHandlerStateChange", this.f6074g);
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
        return "onGestureHandlerStateChange";
    }

    @Override // com.facebook.react.uimanager.events.AbstractC1330c
    /* renamed from: i */
    public void mo5725i() {
        this.f6074g = null;
        f6073f.mo1327a(this);
    }
}
