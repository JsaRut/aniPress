package com.facebook.react.views.checkbox;

import android.content.Context;
import android.support.v7.widget.C0458l;

/* renamed from: com.facebook.react.views.checkbox.a */
/* loaded from: classes.dex */
class C1386a extends C0458l {

    /* renamed from: b */
    private boolean f5110b;

    public C1386a(Context context) {
        super(context);
        this.f5110b = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m5979a(boolean z) {
        if (isChecked() != z) {
            super.setChecked(z);
        }
        this.f5110b = true;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        if (this.f5110b) {
            this.f5110b = false;
            super.setChecked(z);
        }
    }
}
