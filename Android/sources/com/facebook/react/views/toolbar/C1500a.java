package com.facebook.react.views.toolbar;

import android.graphics.drawable.Drawable;
import p139d.p143b.p169g.p178e.C1793i;
import p139d.p143b.p184i.p196j.InterfaceC1921e;

/* renamed from: com.facebook.react.views.toolbar.a */
/* loaded from: classes.dex */
public class C1500a extends C1793i implements Drawable.Callback {

    /* renamed from: e */
    private final InterfaceC1921e f5536e;

    public C1500a(Drawable drawable, InterfaceC1921e interfaceC1921e) {
        super(drawable);
        this.f5536e = interfaceC1921e;
    }

    @Override // p139d.p143b.p169g.p178e.C1793i, android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f5536e.mo6292m();
    }

    @Override // p139d.p143b.p169g.p178e.C1793i, android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f5536e.mo6293n();
    }
}
