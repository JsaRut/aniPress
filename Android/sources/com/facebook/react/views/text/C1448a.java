package com.facebook.react.views.text;

import android.annotation.TargetApi;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

@TargetApi(21)
/* renamed from: com.facebook.react.views.text.a */
/* loaded from: classes.dex */
public class C1448a extends MetricAffectingSpan implements InterfaceC1462m {

    /* renamed from: a */
    private final float f5336a;

    public C1448a(float f) {
        this.f5336a = f;
    }

    /* renamed from: a */
    private void m6137a(TextPaint textPaint) {
        if (Float.isNaN(this.f5336a)) {
            return;
        }
        textPaint.setLetterSpacing(this.f5336a);
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        m6137a(textPaint);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        m6137a(textPaint);
    }
}
