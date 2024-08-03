package com.facebook.react.fabric.mounting.mountitems;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.fabric.p125a.C1124b;

/* renamed from: com.facebook.react.fabric.mounting.mountitems.c */
/* loaded from: classes.dex */
public class C1131c implements InterfaceC1133e {

    /* renamed from: a */
    private final int f4417a;

    /* renamed from: b */
    private final int f4418b;

    /* renamed from: c */
    private final ReadableArray f4419c;

    public C1131c(int i, int i2, ReadableArray readableArray) {
        this.f4417a = i;
        this.f4418b = i2;
        this.f4419c = readableArray;
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.InterfaceC1133e
    /* renamed from: a */
    public void mo5243a(C1124b c1124b) {
        UiThreadUtil.assertOnUiThread();
        c1124b.m5226a(this.f4417a, this.f4418b, this.f4419c);
        throw null;
    }

    public String toString() {
        return "DispatchCommandMountItem [" + this.f4417a + "] " + this.f4418b;
    }
}
