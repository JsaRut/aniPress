package com.swmansion.gesturehandler.react;

import android.support.v4.util.C0267m;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.AbstractC1330c;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import p139d.p273d.p274a.C2686c;

/* renamed from: com.swmansion.gesturehandler.react.b */
/* loaded from: classes.dex */
public class C1624b extends AbstractC1330c<C1624b> {

    /* renamed from: f */
    private static final C0267m<C1624b> f6054f = new C0267m<>(7);

    /* renamed from: g */
    private WritableMap f6055g;

    private C1624b() {
    }

    /* renamed from: a */
    public static C1624b m6764a(C2686c c2686c, InterfaceC1625c interfaceC1625c) {
        C1624b mo1326a = f6054f.mo1326a();
        if (mo1326a == null) {
            mo1326a = new C1624b();
        }
        mo1326a.m6765b(c2686c, interfaceC1625c);
        return mo1326a;
    }

    /* renamed from: b */
    private void m6765b(C2686c c2686c, InterfaceC1625c interfaceC1625c) {
        super.m5717a(c2686c.m11539m().getId());
        this.f6055g = Arguments.createMap();
        if (interfaceC1625c != null) {
            interfaceC1625c.mo6753a(c2686c, this.f6055g);
        }
        this.f6055g.putInt("handlerTag", c2686c.m11538l());
        this.f6055g.putInt("state", c2686c.m11537k());
    }

    @Override // com.facebook.react.uimanager.events.AbstractC1330c
    /* renamed from: a */
    public void mo5714a(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(m5723g(), "onGestureHandlerEvent", this.f6055g);
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
        return "onGestureHandlerEvent";
    }

    @Override // com.facebook.react.uimanager.events.AbstractC1330c
    /* renamed from: i */
    public void mo5725i() {
        this.f6055g = null;
        f6054f.mo1327a(this);
    }
}
