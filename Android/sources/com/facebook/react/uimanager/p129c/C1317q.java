package com.facebook.react.uimanager.p129c;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: com.facebook.react.uimanager.c.q */
/* loaded from: classes.dex */
class C1317q extends Animation implements InterfaceC1314n {

    /* renamed from: a */
    private final View f4850a;

    /* renamed from: b */
    private float f4851b;

    /* renamed from: c */
    private float f4852c;

    /* renamed from: d */
    private float f4853d;

    /* renamed from: e */
    private float f4854e;

    /* renamed from: f */
    private int f4855f;

    /* renamed from: g */
    private int f4856g;

    /* renamed from: h */
    private int f4857h;

    /* renamed from: i */
    private int f4858i;

    public C1317q(View view, int i, int i2, int i3, int i4) {
        this.f4850a = view;
        m5697b(i, i2, i3, i4);
    }

    /* renamed from: b */
    private void m5697b(int i, int i2, int i3, int i4) {
        this.f4851b = this.f4850a.getX() - this.f4850a.getTranslationX();
        this.f4852c = this.f4850a.getY() - this.f4850a.getTranslationY();
        this.f4855f = this.f4850a.getWidth();
        this.f4856g = this.f4850a.getHeight();
        this.f4853d = i - this.f4851b;
        this.f4854e = i2 - this.f4852c;
        this.f4857h = i3 - this.f4855f;
        this.f4858i = i4 - this.f4856g;
    }

    @Override // com.facebook.react.uimanager.p129c.InterfaceC1314n
    /* renamed from: a */
    public void mo5696a(int i, int i2, int i3, int i4) {
        m5697b(i, i2, i3, i4);
    }

    @Override // android.view.animation.Animation
    protected void applyTransformation(float f, Transformation transformation) {
        float f2 = this.f4851b + (this.f4853d * f);
        float f3 = this.f4852c + (this.f4854e * f);
        this.f4850a.layout(Math.round(f2), Math.round(f3), Math.round(f2 + this.f4855f + (this.f4857h * f)), Math.round(f3 + this.f4856g + (this.f4858i * f)));
    }

    @Override // android.view.animation.Animation
    public boolean willChangeBounds() {
        return true;
    }
}
