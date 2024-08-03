package com.facebook.react.fabric.mounting.mountitems;

import com.facebook.react.fabric.p125a.C1124b;

/* renamed from: com.facebook.react.fabric.mounting.mountitems.i */
/* loaded from: classes.dex */
public class C1137i implements InterfaceC1133e {

    /* renamed from: a */
    private final int f4431a;

    /* renamed from: b */
    private final int f4432b;

    /* renamed from: c */
    private final int f4433c;

    /* renamed from: d */
    private final int f4434d;

    /* renamed from: e */
    private final int f4435e;

    public C1137i(int i, int i2, int i3, int i4, int i5) {
        this.f4431a = i;
        this.f4432b = i2;
        this.f4433c = i3;
        this.f4434d = i4;
        this.f4435e = i5;
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.InterfaceC1133e
    /* renamed from: a */
    public void mo5243a(C1124b c1124b) {
        c1124b.m5225a(this.f4431a, this.f4432b, this.f4433c, this.f4434d, this.f4435e);
        throw null;
    }

    public String toString() {
        return "UpdateLayoutMountItem [" + this.f4431a + "] - x: " + this.f4432b + " - y: " + this.f4433c + " - height: " + this.f4435e + " - width: " + this.f4434d;
    }
}
