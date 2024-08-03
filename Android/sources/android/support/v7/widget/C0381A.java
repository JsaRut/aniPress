package android.support.v7.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.v4.graphics.drawable.C0220a;
import android.util.AttributeSet;
import android.widget.SeekBar;
import p000a.p005b.p009c.p019h.C0107v;
import p000a.p005b.p022d.p023a.C0121j;

/* renamed from: android.support.v7.widget.A */
/* loaded from: classes.dex */
public class C0381A extends C0480w {

    /* renamed from: d */
    private final SeekBar f1897d;

    /* renamed from: e */
    private Drawable f1898e;

    /* renamed from: f */
    private ColorStateList f1899f;

    /* renamed from: g */
    private PorterDuff.Mode f1900g;

    /* renamed from: h */
    private boolean f1901h;

    /* renamed from: i */
    private boolean f1902i;

    public C0381A(SeekBar seekBar) {
        super(seekBar);
        this.f1899f = null;
        this.f1900g = null;
        this.f1901h = false;
        this.f1902i = false;
        this.f1897d = seekBar;
    }

    /* renamed from: d */
    private void m2096d() {
        if (this.f1898e != null) {
            if (this.f1901h || this.f1902i) {
                this.f1898e = C0220a.m1209h(this.f1898e.mutate());
                if (this.f1901h) {
                    C0220a.m1195a(this.f1898e, this.f1899f);
                }
                if (this.f1902i) {
                    C0220a.m1198a(this.f1898e, this.f1900g);
                }
                if (this.f1898e.isStateful()) {
                    this.f1898e.setState(this.f1897d.getDrawableState());
                }
            }
        }
    }

    /* renamed from: a */
    public void m2097a(Canvas canvas) {
        if (this.f1898e != null) {
            int max = this.f1897d.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f1898e.getIntrinsicWidth();
                int intrinsicHeight = this.f1898e.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f1898e.setBounds(-i, -i2, i, i2);
                float width = ((this.f1897d.getWidth() - this.f1897d.getPaddingLeft()) - this.f1897d.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(this.f1897d.getPaddingLeft(), this.f1897d.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.f1898e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    /* renamed from: a */
    void m2098a(Drawable drawable) {
        Drawable drawable2 = this.f1898e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1898e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f1897d);
            C0220a.m1201a(drawable, C0107v.m518g(this.f1897d));
            if (drawable.isStateful()) {
                drawable.setState(this.f1897d.getDrawableState());
            }
            m2096d();
        }
        this.f1897d.invalidate();
    }

    @Override // android.support.v7.widget.C0480w
    /* renamed from: a */
    public void mo2099a(AttributeSet attributeSet, int i) {
        super.mo2099a(attributeSet, i);
        C0479va m2571a = C0479va.m2571a(this.f1897d.getContext(), attributeSet, C0121j.AppCompatSeekBar, i, 0);
        Drawable m2581c = m2571a.m2581c(C0121j.AppCompatSeekBar_android_thumb);
        if (m2581c != null) {
            this.f1897d.setThumb(m2581c);
        }
        m2098a(m2571a.m2579b(C0121j.AppCompatSeekBar_tickMark));
        if (m2571a.m2589g(C0121j.AppCompatSeekBar_tickMarkTintMode)) {
            this.f1900g = C0412M.m2262a(m2571a.m2582d(C0121j.AppCompatSeekBar_tickMarkTintMode, -1), this.f1900g);
            this.f1902i = true;
        }
        if (m2571a.m2589g(C0121j.AppCompatSeekBar_tickMarkTint)) {
            this.f1899f = m2571a.m2574a(C0121j.AppCompatSeekBar_tickMarkTint);
            this.f1901h = true;
        }
        m2571a.m2576a();
        m2096d();
    }

    /* renamed from: b */
    public void m2100b() {
        Drawable drawable = this.f1898e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f1897d.getDrawableState())) {
            this.f1897d.invalidateDrawable(drawable);
        }
    }

    /* renamed from: c */
    public void m2101c() {
        Drawable drawable = this.f1898e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }
}
