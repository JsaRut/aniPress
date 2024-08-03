package com.facebook.react.views.switchview;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.C0467pa;

/* renamed from: com.facebook.react.views.switchview.a */
/* loaded from: classes.dex */
class C1442a extends C0467pa {

    /* renamed from: O */
    private boolean f5319O;

    /* renamed from: P */
    private Integer f5320P;

    /* renamed from: Q */
    private Integer f5321Q;

    public C1442a(Context context) {
        super(context);
        this.f5319O = true;
        this.f5320P = null;
        this.f5321Q = null;
    }

    /* renamed from: b */
    private void m6121b(boolean z) {
        if (this.f5321Q == null && this.f5320P == null) {
            return;
        }
        m6125b(z ? this.f5321Q : this.f5320P);
    }

    /* renamed from: a */
    void m6122a(Drawable drawable, Integer num) {
        if (num == null) {
            drawable.clearColorFilter();
        } else {
            drawable.setColorFilter(num.intValue(), PorterDuff.Mode.MULTIPLY);
        }
    }

    /* renamed from: a */
    public void m6123a(Integer num) {
        m6122a(super.getThumbDrawable(), num);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m6124a(boolean z) {
        if (isChecked() != z) {
            super.setChecked(z);
            m6121b(z);
        }
        this.f5319O = true;
    }

    /* renamed from: b */
    public void m6125b(Integer num) {
        m6122a(super.getTrackDrawable(), num);
    }

    /* renamed from: c */
    public void m6126c(Integer num) {
        if (num == this.f5320P) {
            return;
        }
        this.f5320P = num;
        if (isChecked()) {
            return;
        }
        m6125b(this.f5320P);
    }

    /* renamed from: d */
    public void m6127d(Integer num) {
        if (num == this.f5321Q) {
            return;
        }
        this.f5321Q = num;
        if (isChecked()) {
            m6125b(this.f5321Q);
        }
    }

    @Override // android.support.v7.widget.C0467pa, android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        if (!this.f5319O || isChecked() == z) {
            return;
        }
        this.f5319O = false;
        super.setChecked(z);
        m6121b(z);
    }
}
