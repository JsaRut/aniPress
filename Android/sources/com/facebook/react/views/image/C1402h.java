package com.facebook.react.views.image;

import android.graphics.Matrix;
import android.graphics.Rect;
import p139d.p143b.p169g.p178e.C1804t;

/* renamed from: com.facebook.react.views.image.h */
/* loaded from: classes.dex */
public class C1402h extends C1804t.a {

    /* renamed from: a */
    public static final C1804t.b f5163a = new C1402h();

    @Override // p139d.p143b.p169g.p178e.C1804t.a
    /* renamed from: a */
    public void mo6024a(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
        float min = Math.min(Math.min(f3, f4), 1.0f);
        float f5 = rect.left;
        float f6 = rect.top;
        matrix.setScale(min, min);
        matrix.postTranslate((int) (f5 + 0.5f), (int) (f6 + 0.5f));
    }

    public String toString() {
        return "start_inside";
    }
}
