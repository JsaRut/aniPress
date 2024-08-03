package com.facebook.react.fabric.mounting.mountitems;

import com.facebook.react.fabric.jsi.EventEmitterWrapper;
import com.facebook.react.fabric.p125a.C1124b;

/* renamed from: com.facebook.react.fabric.mounting.mountitems.h */
/* loaded from: classes.dex */
public class C1136h implements InterfaceC1133e {

    /* renamed from: a */
    private final EventEmitterWrapper f4429a;

    /* renamed from: b */
    private final int f4430b;

    public C1136h(int i, EventEmitterWrapper eventEmitterWrapper) {
        this.f4430b = i;
        this.f4429a = eventEmitterWrapper;
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.InterfaceC1133e
    /* renamed from: a */
    public void mo5243a(C1124b c1124b) {
        c1124b.m5228a(this.f4430b, this.f4429a);
        throw null;
    }

    public String toString() {
        return "UpdateEventEmitterMountItem [" + this.f4430b + "]";
    }
}
