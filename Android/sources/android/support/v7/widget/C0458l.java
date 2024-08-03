package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.v4.widget.InterfaceC0275E;
import android.util.AttributeSet;
import android.widget.CheckBox;
import p000a.p005b.p022d.p023a.C0112a;
import p000a.p005b.p022d.p024b.p025a.C0122a;

/* renamed from: android.support.v7.widget.l */
/* loaded from: classes.dex */
public class C0458l extends CheckBox implements InterfaceC0275E {

    /* renamed from: a */
    private final C0462n f2390a;

    public C0458l(Context context) {
        this(context, null);
    }

    public C0458l(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0112a.checkboxStyle);
    }

    public C0458l(Context context, AttributeSet attributeSet, int i) {
        super(C0473sa.m2564a(context), attributeSet, i);
        this.f2390a = new C0462n(this);
        this.f2390a.m2478a(attributeSet, i);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        C0462n c0462n = this.f2390a;
        return c0462n != null ? c0462n.m2474a(compoundPaddingLeft) : compoundPaddingLeft;
    }

    public ColorStateList getSupportButtonTintList() {
        C0462n c0462n = this.f2390a;
        if (c0462n != null) {
            return c0462n.m2479b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C0462n c0462n = this.f2390a;
        if (c0462n != null) {
            return c0462n.m2480c();
        }
        return null;
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(C0122a.m550b(getContext(), i));
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C0462n c0462n = this.f2390a;
        if (c0462n != null) {
            c0462n.m2481d();
        }
    }

    @Override // android.support.v4.widget.InterfaceC0275E
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C0462n c0462n = this.f2390a;
        if (c0462n != null) {
            c0462n.m2476a(colorStateList);
        }
    }

    @Override // android.support.v4.widget.InterfaceC0275E
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C0462n c0462n = this.f2390a;
        if (c0462n != null) {
            c0462n.m2477a(mode);
        }
    }
}
