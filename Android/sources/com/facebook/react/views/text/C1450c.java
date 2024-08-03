package com.facebook.react.views.text;

import android.content.res.AssetManager;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* renamed from: com.facebook.react.views.text.c */
/* loaded from: classes.dex */
public class C1450c extends MetricAffectingSpan implements InterfaceC1462m {

    /* renamed from: a */
    private final AssetManager f5338a;

    /* renamed from: b */
    private final int f5339b;

    /* renamed from: c */
    private final int f5340c;

    /* renamed from: d */
    private final String f5341d;

    public C1450c(int i, int i2, String str, AssetManager assetManager) {
        this.f5339b = i;
        this.f5340c = i2;
        this.f5341d = str;
        this.f5338a = assetManager;
    }

    /* renamed from: a */
    private static void m6138a(Paint paint, int i, int i2, String str, AssetManager assetManager) {
        Typeface typeface = paint.getTypeface();
        int i3 = 0;
        int style = typeface == null ? 0 : typeface.getStyle();
        if (i2 == 1 || ((style & 1) != 0 && i2 == -1)) {
            i3 = 1;
        }
        if (i == 2 || ((2 & style) != 0 && i == -1)) {
            i3 |= 2;
        }
        if (str != null) {
            typeface = C1459j.m6161a().m6163a(str, i3, assetManager);
        } else if (typeface != null) {
            typeface = Typeface.create(typeface, i3);
        }
        if (typeface != null) {
            paint.setTypeface(typeface);
        } else {
            paint.setTypeface(Typeface.defaultFromStyle(i3));
        }
        paint.setSubpixelText(true);
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        m6138a(textPaint, this.f5339b, this.f5340c, this.f5341d, this.f5338a);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        m6138a(textPaint, this.f5339b, this.f5340c, this.f5341d, this.f5338a);
    }
}
