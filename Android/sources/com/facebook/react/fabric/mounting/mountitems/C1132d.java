package com.facebook.react.fabric.mounting.mountitems;

import com.facebook.react.fabric.p125a.C1124b;

/* renamed from: com.facebook.react.fabric.mounting.mountitems.d */
/* loaded from: classes.dex */
public class C1132d implements InterfaceC1133e {

    /* renamed from: a */
    private int f4420a;

    /* renamed from: b */
    private int f4421b;

    /* renamed from: c */
    private int f4422c;

    public C1132d(int i, int i2, int i3) {
        this.f4420a = i;
        this.f4421b = i2;
        this.f4422c = i3;
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.InterfaceC1133e
    /* renamed from: a */
    public void mo5243a(C1124b c1124b) {
        c1124b.m5224a(this.f4421b, this.f4420a, this.f4422c);
        throw null;
    }

    public String toString() {
        return "InsertMountItem [" + this.f4420a + "] - parentTag: " + this.f4421b + " - index: " + this.f4422c;
    }
}
