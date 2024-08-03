package com.facebook.react.fabric.mounting.mountitems;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.fabric.p125a.C1124b;

/* renamed from: com.facebook.react.fabric.mounting.mountitems.k */
/* loaded from: classes.dex */
public class C1139k implements InterfaceC1133e {

    /* renamed from: a */
    private final int f4438a;

    /* renamed from: b */
    private final ReadableMap f4439b;

    public C1139k(int i, ReadableMap readableMap) {
        this.f4438a = i;
        this.f4439b = readableMap;
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.InterfaceC1133e
    /* renamed from: a */
    public void mo5243a(C1124b c1124b) {
        c1124b.m5233b(this.f4438a, this.f4439b);
        throw null;
    }

    public String toString() {
        return "UpdatePropsMountItem [" + this.f4438a + "] - props: " + this.f4439b;
    }
}
