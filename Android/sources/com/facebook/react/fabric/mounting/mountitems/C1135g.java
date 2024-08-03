package com.facebook.react.fabric.mounting.mountitems;

import com.facebook.react.fabric.p125a.C1124b;

/* renamed from: com.facebook.react.fabric.mounting.mountitems.g */
/* loaded from: classes.dex */
public class C1135g implements InterfaceC1133e {

    /* renamed from: a */
    private int f4426a;

    /* renamed from: b */
    private int f4427b;

    /* renamed from: c */
    private int f4428c;

    public C1135g(int i, int i2, int i3) {
        this.f4426a = i;
        this.f4427b = i2;
        this.f4428c = i3;
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.InterfaceC1133e
    /* renamed from: a */
    public void mo5243a(C1124b c1124b) {
        c1124b.m5223a(this.f4427b, this.f4428c);
        throw null;
    }

    public String toString() {
        return "RemoveMountItem [" + this.f4426a + "] - parentTag: " + this.f4427b + " - index: " + this.f4428c;
    }
}
