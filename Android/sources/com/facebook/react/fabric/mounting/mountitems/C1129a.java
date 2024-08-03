package com.facebook.react.fabric.mounting.mountitems;

import com.facebook.react.fabric.p125a.C1124b;
import com.facebook.react.uimanager.C1278N;

/* renamed from: com.facebook.react.fabric.mounting.mountitems.a */
/* loaded from: classes.dex */
public class C1129a implements InterfaceC1133e {

    /* renamed from: a */
    private final String f4412a;

    /* renamed from: b */
    private final int f4413b;

    /* renamed from: c */
    private final C1278N f4414c;

    /* renamed from: d */
    private final boolean f4415d;

    public C1129a(C1278N c1278n, String str, int i, boolean z) {
        this.f4413b = i;
        this.f4414c = c1278n;
        this.f4412a = str;
        this.f4415d = z;
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.InterfaceC1133e
    /* renamed from: a */
    public void mo5243a(C1124b c1124b) {
        c1124b.m5231a(this.f4414c, this.f4412a, this.f4413b, this.f4415d);
        throw null;
    }

    public String toString() {
        return "CreateMountItem [" + this.f4413b + "] " + this.f4412a;
    }
}
