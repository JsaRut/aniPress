package android.support.v7.widget;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.graphics.drawable.C0220a;
import android.support.v4.widget.C0289g;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import p000a.p005b.p022d.p023a.C0121j;
import p000a.p005b.p022d.p024b.p025a.C0122a;

/* renamed from: android.support.v7.widget.n */
/* loaded from: classes.dex */
public class C0462n {

    /* renamed from: a */
    private final CompoundButton f2394a;

    /* renamed from: b */
    private ColorStateList f2395b = null;

    /* renamed from: c */
    private PorterDuff.Mode f2396c = null;

    /* renamed from: d */
    private boolean f2397d = false;

    /* renamed from: e */
    private boolean f2398e = false;

    /* renamed from: f */
    private boolean f2399f;

    public C0462n(CompoundButton compoundButton) {
        this.f2394a = compoundButton;
    }

    /* renamed from: a */
    public int m2474a(int i) {
        Drawable m1616a;
        return (Build.VERSION.SDK_INT >= 17 || (m1616a = C0289g.m1616a(this.f2394a)) == null) ? i : i + m1616a.getIntrinsicWidth();
    }

    /* renamed from: a */
    void m2475a() {
        Drawable m1616a = C0289g.m1616a(this.f2394a);
        if (m1616a != null) {
            if (this.f2397d || this.f2398e) {
                Drawable mutate = C0220a.m1209h(m1616a).mutate();
                if (this.f2397d) {
                    C0220a.m1195a(mutate, this.f2395b);
                }
                if (this.f2398e) {
                    C0220a.m1198a(mutate, this.f2396c);
                }
                if (mutate.isStateful()) {
                    mutate.setState(this.f2394a.getDrawableState());
                }
                this.f2394a.setButtonDrawable(mutate);
            }
        }
    }

    /* renamed from: a */
    public void m2476a(ColorStateList colorStateList) {
        this.f2395b = colorStateList;
        this.f2397d = true;
        m2475a();
    }

    /* renamed from: a */
    public void m2477a(PorterDuff.Mode mode) {
        this.f2396c = mode;
        this.f2398e = true;
        m2475a();
    }

    /* renamed from: a */
    public void m2478a(AttributeSet attributeSet, int i) {
        int resourceId;
        TypedArray obtainStyledAttributes = this.f2394a.getContext().obtainStyledAttributes(attributeSet, C0121j.CompoundButton, i, 0);
        try {
            if (obtainStyledAttributes.hasValue(C0121j.CompoundButton_android_button) && (resourceId = obtainStyledAttributes.getResourceId(C0121j.CompoundButton_android_button, 0)) != 0) {
                this.f2394a.setButtonDrawable(C0122a.m550b(this.f2394a.getContext(), resourceId));
            }
            if (obtainStyledAttributes.hasValue(C0121j.CompoundButton_buttonTint)) {
                C0289g.m1617a(this.f2394a, obtainStyledAttributes.getColorStateList(C0121j.CompoundButton_buttonTint));
            }
            if (obtainStyledAttributes.hasValue(C0121j.CompoundButton_buttonTintMode)) {
                C0289g.m1618a(this.f2394a, C0412M.m2262a(obtainStyledAttributes.getInt(C0121j.CompoundButton_buttonTintMode, -1), null));
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: b */
    public ColorStateList m2479b() {
        return this.f2395b;
    }

    /* renamed from: c */
    public PorterDuff.Mode m2480c() {
        return this.f2396c;
    }

    /* renamed from: d */
    public void m2481d() {
        if (this.f2399f) {
            this.f2399f = false;
        } else {
            this.f2399f = true;
            m2475a();
        }
    }
}
