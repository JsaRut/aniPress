package com.facebook.react.views.text;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* renamed from: com.facebook.react.views.text.w */
/* loaded from: classes.dex */
public class C1472w extends CharacterStyle implements InterfaceC1462m {

    /* renamed from: a */
    private final float f5415a;

    /* renamed from: b */
    private final float f5416b;

    /* renamed from: c */
    private final float f5417c;

    /* renamed from: d */
    private final int f5418d;

    public C1472w(float f, float f2, float f3, int i) {
        this.f5415a = f;
        this.f5416b = f2;
        this.f5417c = f3;
        this.f5418d = i;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        textPaint.setShadowLayer(this.f5417c, this.f5415a, this.f5416b, this.f5418d);
    }
}
