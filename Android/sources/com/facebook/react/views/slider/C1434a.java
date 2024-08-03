package com.facebook.react.views.slider;

import android.content.Context;
import android.os.Build;
import android.support.v7.widget.C0486z;
import android.util.AttributeSet;

/* renamed from: com.facebook.react.views.slider.a */
/* loaded from: classes.dex */
public class C1434a extends C0486z {

    /* renamed from: b */
    private static int f5298b = 128;

    /* renamed from: c */
    private double f5299c;

    /* renamed from: d */
    private double f5300d;

    /* renamed from: e */
    private double f5301e;

    /* renamed from: f */
    private double f5302f;

    /* renamed from: g */
    private double f5303g;

    public C1434a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5299c = 0.0d;
        this.f5300d = 0.0d;
        this.f5301e = 0.0d;
        this.f5302f = 0.0d;
        this.f5303g = 0.0d;
        m6110a();
    }

    /* renamed from: a */
    private void m6110a() {
        int i = Build.VERSION.SDK_INT;
        if (i < 23 || i >= 26) {
            return;
        }
        super.setStateListAnimator(null);
    }

    /* renamed from: b */
    private void m6111b() {
        if (this.f5302f == 0.0d) {
            double d2 = this.f5300d - this.f5299c;
            double d3 = f5298b;
            Double.isNaN(d3);
            this.f5303g = d2 / d3;
        }
        setMax(getTotalSteps());
        m6112c();
    }

    /* renamed from: c */
    private void m6112c() {
        double d2 = this.f5301e;
        double d3 = this.f5299c;
        double d4 = (d2 - d3) / (this.f5300d - d3);
        double totalSteps = getTotalSteps();
        Double.isNaN(totalSteps);
        setProgress((int) Math.round(d4 * totalSteps));
    }

    private double getStepValue() {
        double d2 = this.f5302f;
        return d2 > 0.0d ? d2 : this.f5303g;
    }

    private int getTotalSteps() {
        return (int) Math.ceil((this.f5300d - this.f5299c) / getStepValue());
    }

    /* renamed from: a */
    public double m6113a(int i) {
        if (i == getMax()) {
            return this.f5300d;
        }
        double d2 = i;
        double stepValue = getStepValue();
        Double.isNaN(d2);
        return (d2 * stepValue) + this.f5299c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setMaxValue(double d2) {
        this.f5300d = d2;
        m6111b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setMinValue(double d2) {
        this.f5299c = d2;
        m6111b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setStep(double d2) {
        this.f5302f = d2;
        m6111b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setValue(double d2) {
        this.f5301e = d2;
        m6112c();
    }
}
