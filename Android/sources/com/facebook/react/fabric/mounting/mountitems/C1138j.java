package com.facebook.react.fabric.mounting.mountitems;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableNativeMap;
import com.facebook.react.fabric.p125a.C1124b;

/* renamed from: com.facebook.react.fabric.mounting.mountitems.j */
/* loaded from: classes.dex */
public class C1138j implements InterfaceC1133e {

    /* renamed from: a */
    private final int f4436a;

    /* renamed from: b */
    private final ReadableMap f4437b;

    public C1138j(int i, ReadableNativeMap readableNativeMap) {
        this.f4436a = i;
        this.f4437b = readableNativeMap;
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.InterfaceC1133e
    /* renamed from: a */
    public void mo5243a(C1124b c1124b) {
        c1124b.m5227a(this.f4436a, this.f4437b);
        throw null;
    }

    public String toString() {
        return "UpdateLocalDataMountItem [" + this.f4436a + "] - localData: " + this.f4437b;
    }
}
