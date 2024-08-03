package com.facebook.react.fabric.mounting.mountitems;

import com.facebook.react.fabric.p125a.C1124b;
import com.facebook.react.uimanager.C1278N;

/* renamed from: com.facebook.react.fabric.mounting.mountitems.f */
/* loaded from: classes.dex */
public class C1134f implements InterfaceC1133e {

    /* renamed from: a */
    private final String f4423a;

    /* renamed from: b */
    private final int f4424b;

    /* renamed from: c */
    private final C1278N f4425c;

    public C1134f(C1278N c1278n, int i, String str) {
        this.f4425c = c1278n;
        this.f4423a = str;
        this.f4424b = i;
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.InterfaceC1133e
    /* renamed from: a */
    public void mo5243a(C1124b c1124b) {
        c1124b.m5230a(this.f4425c, this.f4423a);
        throw null;
    }

    public String toString() {
        return "[" + this.f4424b + "] - Preallocate " + this.f4423a;
    }
}
