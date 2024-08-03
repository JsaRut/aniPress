package android.support.v7.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.support.v4.widget.C0297o;
import android.util.AttributeSet;
import android.widget.ImageView;
import p000a.p005b.p022d.p023a.C0121j;
import p000a.p005b.p022d.p024b.p025a.C0122a;

/* renamed from: android.support.v7.widget.s */
/* loaded from: classes.dex */
public class C0472s {

    /* renamed from: a */
    private final ImageView f2489a;

    /* renamed from: b */
    private C0475ta f2490b;

    /* renamed from: c */
    private C0475ta f2491c;

    /* renamed from: d */
    private C0475ta f2492d;

    public C0472s(ImageView imageView) {
        this.f2489a = imageView;
    }

    /* renamed from: a */
    private boolean m2554a(Drawable drawable) {
        if (this.f2492d == null) {
            this.f2492d = new C0475ta();
        }
        C0475ta c0475ta = this.f2492d;
        c0475ta.m2566a();
        ColorStateList m1686a = C0297o.m1686a(this.f2489a);
        if (m1686a != null) {
            c0475ta.f2502d = true;
            c0475ta.f2499a = m1686a;
        }
        PorterDuff.Mode m1689b = C0297o.m1689b(this.f2489a);
        if (m1689b != null) {
            c0475ta.f2501c = true;
            c0475ta.f2500b = m1689b;
        }
        if (!c0475ta.f2502d && !c0475ta.f2501c) {
            return false;
        }
        C0464o.m2509a(drawable, c0475ta, this.f2489a.getDrawableState());
        return true;
    }

    /* renamed from: e */
    private boolean m2555e() {
        int i = Build.VERSION.SDK_INT;
        return i > 21 ? this.f2490b != null : i == 21;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m2556a() {
        Drawable drawable = this.f2489a.getDrawable();
        if (drawable != null) {
            C0412M.m2264b(drawable);
        }
        if (drawable != null) {
            if (m2555e() && m2554a(drawable)) {
                return;
            }
            C0475ta c0475ta = this.f2491c;
            if (c0475ta == null && (c0475ta = this.f2490b) == null) {
                return;
            }
            C0464o.m2509a(drawable, c0475ta, this.f2489a.getDrawableState());
        }
    }

    /* renamed from: a */
    public void m2557a(int i) {
        if (i != 0) {
            Drawable m550b = C0122a.m550b(this.f2489a.getContext(), i);
            if (m550b != null) {
                C0412M.m2264b(m550b);
            }
            this.f2489a.setImageDrawable(m550b);
        } else {
            this.f2489a.setImageDrawable(null);
        }
        m2556a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m2558a(ColorStateList colorStateList) {
        if (this.f2491c == null) {
            this.f2491c = new C0475ta();
        }
        C0475ta c0475ta = this.f2491c;
        c0475ta.f2499a = colorStateList;
        c0475ta.f2502d = true;
        m2556a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m2559a(PorterDuff.Mode mode) {
        if (this.f2491c == null) {
            this.f2491c = new C0475ta();
        }
        C0475ta c0475ta = this.f2491c;
        c0475ta.f2500b = mode;
        c0475ta.f2501c = true;
        m2556a();
    }

    /* renamed from: a */
    public void m2560a(AttributeSet attributeSet, int i) {
        int m2588g;
        C0479va m2571a = C0479va.m2571a(this.f2489a.getContext(), attributeSet, C0121j.AppCompatImageView, i, 0);
        try {
            Drawable drawable = this.f2489a.getDrawable();
            if (drawable == null && (m2588g = m2571a.m2588g(C0121j.AppCompatImageView_srcCompat, -1)) != -1 && (drawable = C0122a.m550b(this.f2489a.getContext(), m2588g)) != null) {
                this.f2489a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                C0412M.m2264b(drawable);
            }
            if (m2571a.m2589g(C0121j.AppCompatImageView_tint)) {
                C0297o.m1687a(this.f2489a, m2571a.m2574a(C0121j.AppCompatImageView_tint));
            }
            if (m2571a.m2589g(C0121j.AppCompatImageView_tintMode)) {
                C0297o.m1688a(this.f2489a, C0412M.m2262a(m2571a.m2582d(C0121j.AppCompatImageView_tintMode, -1), null));
            }
        } finally {
            m2571a.m2576a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public ColorStateList m2561b() {
        C0475ta c0475ta = this.f2491c;
        if (c0475ta != null) {
            return c0475ta.f2499a;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public PorterDuff.Mode m2562c() {
        C0475ta c0475ta = this.f2491c;
        if (c0475ta != null) {
            return c0475ta.f2500b;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean m2563d() {
        return Build.VERSION.SDK_INT < 21 || !(this.f2489a.getBackground() instanceof RippleDrawable);
    }
}
