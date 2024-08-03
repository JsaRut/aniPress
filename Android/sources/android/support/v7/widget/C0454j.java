package android.support.v7.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import p000a.p005b.p009c.p019h.C0107v;
import p000a.p005b.p022d.p023a.C0121j;

/* renamed from: android.support.v7.widget.j */
/* loaded from: classes.dex */
public class C0454j {

    /* renamed from: a */
    private final View f2380a;

    /* renamed from: d */
    private C0475ta f2383d;

    /* renamed from: e */
    private C0475ta f2384e;

    /* renamed from: f */
    private C0475ta f2385f;

    /* renamed from: c */
    private int f2382c = -1;

    /* renamed from: b */
    private final C0464o f2381b = C0464o.m2506a();

    public C0454j(View view) {
        this.f2380a = view;
    }

    /* renamed from: b */
    private boolean m2463b(Drawable drawable) {
        if (this.f2385f == null) {
            this.f2385f = new C0475ta();
        }
        C0475ta c0475ta = this.f2385f;
        c0475ta.m2566a();
        ColorStateList m507b = C0107v.m507b(this.f2380a);
        if (m507b != null) {
            c0475ta.f2502d = true;
            c0475ta.f2499a = m507b;
        }
        PorterDuff.Mode m510c = C0107v.m510c(this.f2380a);
        if (m510c != null) {
            c0475ta.f2501c = true;
            c0475ta.f2500b = m510c;
        }
        if (!c0475ta.f2502d && !c0475ta.f2501c) {
            return false;
        }
        C0464o.m2509a(drawable, c0475ta, this.f2380a.getDrawableState());
        return true;
    }

    /* renamed from: d */
    private boolean m2464d() {
        int i = Build.VERSION.SDK_INT;
        return i > 21 ? this.f2383d != null : i == 21;
    }

    /* renamed from: a */
    public void m2465a() {
        Drawable background = this.f2380a.getBackground();
        if (background != null) {
            if (m2464d() && m2463b(background)) {
                return;
            }
            C0475ta c0475ta = this.f2384e;
            if (c0475ta == null && (c0475ta = this.f2383d) == null) {
                return;
            }
            C0464o.m2509a(background, c0475ta, this.f2380a.getDrawableState());
        }
    }

    /* renamed from: a */
    public void m2466a(int i) {
        this.f2382c = i;
        C0464o c0464o = this.f2381b;
        m2467a(c0464o != null ? c0464o.m2529b(this.f2380a.getContext(), i) : null);
        m2465a();
    }

    /* renamed from: a */
    void m2467a(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f2383d == null) {
                this.f2383d = new C0475ta();
            }
            C0475ta c0475ta = this.f2383d;
            c0475ta.f2499a = colorStateList;
            c0475ta.f2502d = true;
        } else {
            this.f2383d = null;
        }
        m2465a();
    }

    /* renamed from: a */
    public void m2468a(PorterDuff.Mode mode) {
        if (this.f2384e == null) {
            this.f2384e = new C0475ta();
        }
        C0475ta c0475ta = this.f2384e;
        c0475ta.f2500b = mode;
        c0475ta.f2501c = true;
        m2465a();
    }

    /* renamed from: a */
    public void m2469a(Drawable drawable) {
        this.f2382c = -1;
        m2467a((ColorStateList) null);
        m2465a();
    }

    /* renamed from: a */
    public void m2470a(AttributeSet attributeSet, int i) {
        C0479va m2571a = C0479va.m2571a(this.f2380a.getContext(), attributeSet, C0121j.ViewBackgroundHelper, i, 0);
        try {
            if (m2571a.m2589g(C0121j.ViewBackgroundHelper_android_background)) {
                this.f2382c = m2571a.m2588g(C0121j.ViewBackgroundHelper_android_background, -1);
                ColorStateList m2529b = this.f2381b.m2529b(this.f2380a.getContext(), this.f2382c);
                if (m2529b != null) {
                    m2467a(m2529b);
                }
            }
            if (m2571a.m2589g(C0121j.ViewBackgroundHelper_backgroundTint)) {
                C0107v.m498a(this.f2380a, m2571a.m2574a(C0121j.ViewBackgroundHelper_backgroundTint));
            }
            if (m2571a.m2589g(C0121j.ViewBackgroundHelper_backgroundTintMode)) {
                C0107v.m499a(this.f2380a, C0412M.m2262a(m2571a.m2582d(C0121j.ViewBackgroundHelper_backgroundTintMode, -1), null));
            }
        } finally {
            m2571a.m2576a();
        }
    }

    /* renamed from: b */
    public ColorStateList m2471b() {
        C0475ta c0475ta = this.f2384e;
        if (c0475ta != null) {
            return c0475ta.f2499a;
        }
        return null;
    }

    /* renamed from: b */
    public void m2472b(ColorStateList colorStateList) {
        if (this.f2384e == null) {
            this.f2384e = new C0475ta();
        }
        C0475ta c0475ta = this.f2384e;
        c0475ta.f2499a = colorStateList;
        c0475ta.f2502d = true;
        m2465a();
    }

    /* renamed from: c */
    public PorterDuff.Mode m2473c() {
        C0475ta c0475ta = this.f2384e;
        if (c0475ta != null) {
            return c0475ta.f2500b;
        }
        return null;
    }
}
