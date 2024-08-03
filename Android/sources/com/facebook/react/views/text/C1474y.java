package com.facebook.react.views.text;

import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.uimanager.C1374w;

/* renamed from: com.facebook.react.views.text.y */
/* loaded from: classes.dex */
public class C1474y {

    /* renamed from: a */
    private boolean f5448a = true;

    /* renamed from: b */
    private float f5449b = Float.NaN;

    /* renamed from: c */
    private float f5450c = Float.NaN;

    /* renamed from: d */
    private float f5451d = Float.NaN;

    /* renamed from: e */
    private float f5452e = Float.NaN;

    /* renamed from: f */
    private float f5453f = Float.NaN;

    /* renamed from: g */
    private EnumC1447C f5454g = EnumC1447C.UNSET;

    /* renamed from: a */
    public C1474y m6219a(C1474y c1474y) {
        C1474y c1474y2 = new C1474y();
        c1474y2.f5448a = this.f5448a;
        c1474y2.f5449b = !Float.isNaN(c1474y.f5449b) ? c1474y.f5449b : this.f5449b;
        c1474y2.f5450c = !Float.isNaN(c1474y.f5450c) ? c1474y.f5450c : this.f5450c;
        c1474y2.f5451d = !Float.isNaN(c1474y.f5451d) ? c1474y.f5451d : this.f5451d;
        c1474y2.f5452e = !Float.isNaN(c1474y.f5452e) ? c1474y.f5452e : this.f5452e;
        c1474y2.f5453f = !Float.isNaN(c1474y.f5453f) ? c1474y.f5453f : this.f5453f;
        EnumC1447C enumC1447C = c1474y.f5454g;
        if (enumC1447C == EnumC1447C.UNSET) {
            enumC1447C = this.f5454g;
        }
        c1474y2.f5454g = enumC1447C;
        return c1474y2;
    }

    /* renamed from: a */
    public void m6220a(float f) {
        this.f5449b = f;
    }

    /* renamed from: a */
    public void m6221a(EnumC1447C enumC1447C) {
        this.f5454g = enumC1447C;
    }

    /* renamed from: a */
    public void m6222a(boolean z) {
        this.f5448a = z;
    }

    /* renamed from: a */
    public boolean m6223a() {
        return this.f5448a;
    }

    /* renamed from: b */
    public int m6224b() {
        float f = !Float.isNaN(this.f5449b) ? this.f5449b : 14.0f;
        return (int) Math.ceil(this.f5448a ? C1374w.m5958a(f, m6230e()) : C1374w.m5959b(f));
    }

    /* renamed from: b */
    public void m6225b(float f) {
        this.f5453f = f;
    }

    /* renamed from: c */
    public float m6226c() {
        if (Float.isNaN(this.f5451d)) {
            return Float.NaN;
        }
        return (this.f5448a ? C1374w.m5958a(this.f5451d, m6230e()) : C1374w.m5959b(this.f5451d)) / m6224b();
    }

    /* renamed from: c */
    public void m6227c(float f) {
        this.f5451d = f;
    }

    /* renamed from: d */
    public float m6228d() {
        if (Float.isNaN(this.f5450c)) {
            return Float.NaN;
        }
        float m5958a = this.f5448a ? C1374w.m5958a(this.f5450c, m6230e()) : C1374w.m5959b(this.f5450c);
        return !Float.isNaN(this.f5453f) && (this.f5453f > m5958a ? 1 : (this.f5453f == m5958a ? 0 : -1)) > 0 ? this.f5453f : m5958a;
    }

    /* renamed from: d */
    public void m6229d(float f) {
        this.f5450c = f;
    }

    /* renamed from: e */
    public float m6230e() {
        if (Float.isNaN(this.f5452e)) {
            return 0.0f;
        }
        return this.f5452e;
    }

    /* renamed from: e */
    public void m6231e(float f) {
        if (f != 0.0f && f < 1.0f) {
            throw new JSApplicationIllegalArgumentException("maxFontSizeMultiplier must be NaN, 0, or >= 1");
        }
        this.f5452e = f;
    }

    /* renamed from: f */
    public float m6232f() {
        return this.f5449b;
    }

    /* renamed from: g */
    public float m6233g() {
        return this.f5453f;
    }

    /* renamed from: h */
    public float m6234h() {
        return this.f5451d;
    }

    /* renamed from: i */
    public float m6235i() {
        return this.f5450c;
    }

    /* renamed from: j */
    public float m6236j() {
        return this.f5452e;
    }

    /* renamed from: k */
    public EnumC1447C m6237k() {
        return this.f5454g;
    }

    public String toString() {
        return "TextAttributes {\n  getAllowFontScaling(): " + m6223a() + "\n  getFontSize(): " + m6232f() + "\n  getEffectiveFontSize(): " + m6224b() + "\n  getHeightOfTallestInlineImage(): " + m6233g() + "\n  getLetterSpacing(): " + m6234h() + "\n  getEffectiveLetterSpacing(): " + m6226c() + "\n  getLineHeight(): " + m6235i() + "\n  getEffectiveLineHeight(): " + m6228d() + "\n  getTextTransform(): " + m6237k() + "\n  getMaxFontSizeMultiplier(): " + m6236j() + "\n  getEffectiveMaxFontSizeMultiplier(): " + m6230e() + "\n}";
    }
}
