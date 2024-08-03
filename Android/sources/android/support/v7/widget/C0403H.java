package android.support.v7.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.widget.C0274D;
import android.support.v4.widget.InterfaceC0284b;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import p000a.p005b.p022d.p023a.C0121j;

/* renamed from: android.support.v7.widget.H */
/* loaded from: classes.dex */
public class C0403H {

    /* renamed from: a */
    private final TextView f2044a;

    /* renamed from: b */
    private C0475ta f2045b;

    /* renamed from: c */
    private C0475ta f2046c;

    /* renamed from: d */
    private C0475ta f2047d;

    /* renamed from: e */
    private C0475ta f2048e;

    /* renamed from: f */
    private C0475ta f2049f;

    /* renamed from: g */
    private C0475ta f2050g;

    /* renamed from: h */
    private final C0407J f2051h;

    /* renamed from: i */
    private int f2052i = 0;

    /* renamed from: j */
    private Typeface f2053j;

    /* renamed from: k */
    private boolean f2054k;

    public C0403H(TextView textView) {
        this.f2044a = textView;
        this.f2051h = new C0407J(this.f2044a);
    }

    /* renamed from: a */
    private static C0475ta m2202a(Context context, C0464o c0464o, int i) {
        ColorStateList m2529b = c0464o.m2529b(context, i);
        if (m2529b == null) {
            return null;
        }
        C0475ta c0475ta = new C0475ta();
        c0475ta.f2502d = true;
        c0475ta.f2499a = m2529b;
        return c0475ta;
    }

    /* renamed from: a */
    private void m2203a(Context context, C0479va c0479va) {
        String m2583d;
        Typeface typeface;
        this.f2052i = c0479va.m2582d(C0121j.TextAppearance_android_textStyle, this.f2052i);
        if (c0479va.m2589g(C0121j.TextAppearance_android_fontFamily) || c0479va.m2589g(C0121j.TextAppearance_fontFamily)) {
            this.f2053j = null;
            int i = c0479va.m2589g(C0121j.TextAppearance_fontFamily) ? C0121j.TextAppearance_fontFamily : C0121j.TextAppearance_android_fontFamily;
            if (!context.isRestricted()) {
                try {
                    this.f2053j = c0479va.m2575a(i, this.f2052i, new C0401G(this, new WeakReference(this.f2044a)));
                    this.f2054k = this.f2053j == null;
                } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.f2053j != null || (m2583d = c0479va.m2583d(i)) == null) {
                return;
            }
            this.f2053j = Typeface.create(m2583d, this.f2052i);
            return;
        }
        if (c0479va.m2589g(C0121j.TextAppearance_android_typeface)) {
            this.f2054k = false;
            int m2582d = c0479va.m2582d(C0121j.TextAppearance_android_typeface, 1);
            if (m2582d == 1) {
                typeface = Typeface.SANS_SERIF;
            } else if (m2582d == 2) {
                typeface = Typeface.SERIF;
            } else if (m2582d != 3) {
                return;
            } else {
                typeface = Typeface.MONOSPACE;
            }
            this.f2053j = typeface;
        }
    }

    /* renamed from: a */
    private void m2204a(Drawable drawable, C0475ta c0475ta) {
        if (drawable == null || c0475ta == null) {
            return;
        }
        C0464o.m2509a(drawable, c0475ta, this.f2044a.getDrawableState());
    }

    /* renamed from: b */
    private void m2205b(int i, float f) {
        this.f2051h.m2248a(i, f);
    }

    /* renamed from: a */
    public void m2206a() {
        if (this.f2045b != null || this.f2046c != null || this.f2047d != null || this.f2048e != null) {
            Drawable[] compoundDrawables = this.f2044a.getCompoundDrawables();
            m2204a(compoundDrawables[0], this.f2045b);
            m2204a(compoundDrawables[1], this.f2046c);
            m2204a(compoundDrawables[2], this.f2047d);
            m2204a(compoundDrawables[3], this.f2048e);
        }
        if (Build.VERSION.SDK_INT >= 17) {
            if (this.f2049f == null && this.f2050g == null) {
                return;
            }
            Drawable[] compoundDrawablesRelative = this.f2044a.getCompoundDrawablesRelative();
            m2204a(compoundDrawablesRelative[0], this.f2049f);
            m2204a(compoundDrawablesRelative[2], this.f2050g);
        }
    }

    /* renamed from: a */
    public void m2207a(int i) {
        this.f2051h.m2247a(i);
    }

    /* renamed from: a */
    public void m2208a(int i, float f) {
        if (InterfaceC0284b.f1253a || m2222h()) {
            return;
        }
        m2205b(i, f);
    }

    /* renamed from: a */
    public void m2209a(int i, int i2, int i3, int i4) {
        this.f2051h.m2249a(i, i2, i3, i4);
    }

    /* renamed from: a */
    public void m2210a(Context context, int i) {
        ColorStateList m2574a;
        C0479va m2569a = C0479va.m2569a(context, i, C0121j.TextAppearance);
        if (m2569a.m2589g(C0121j.TextAppearance_textAllCaps)) {
            m2213a(m2569a.m2577a(C0121j.TextAppearance_textAllCaps, false));
        }
        if (Build.VERSION.SDK_INT < 23 && m2569a.m2589g(C0121j.TextAppearance_android_textColor) && (m2574a = m2569a.m2574a(C0121j.TextAppearance_android_textColor)) != null) {
            this.f2044a.setTextColor(m2574a);
        }
        if (m2569a.m2589g(C0121j.TextAppearance_android_textSize) && m2569a.m2580c(C0121j.TextAppearance_android_textSize, -1) == 0) {
            this.f2044a.setTextSize(0, 0.0f);
        }
        m2203a(context, m2569a);
        m2569a.m2576a();
        Typeface typeface = this.f2053j;
        if (typeface != null) {
            this.f2044a.setTypeface(typeface, this.f2052i);
        }
    }

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public void m2211a(AttributeSet attributeSet, int i) {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        boolean z;
        boolean z2;
        Context context = this.f2044a.getContext();
        C0464o m2506a = C0464o.m2506a();
        C0479va m2571a = C0479va.m2571a(context, attributeSet, C0121j.AppCompatTextHelper, i, 0);
        int m2588g = m2571a.m2588g(C0121j.AppCompatTextHelper_android_textAppearance, -1);
        if (m2571a.m2589g(C0121j.AppCompatTextHelper_android_drawableLeft)) {
            this.f2045b = m2202a(context, m2506a, m2571a.m2588g(C0121j.AppCompatTextHelper_android_drawableLeft, 0));
        }
        if (m2571a.m2589g(C0121j.AppCompatTextHelper_android_drawableTop)) {
            this.f2046c = m2202a(context, m2506a, m2571a.m2588g(C0121j.AppCompatTextHelper_android_drawableTop, 0));
        }
        if (m2571a.m2589g(C0121j.AppCompatTextHelper_android_drawableRight)) {
            this.f2047d = m2202a(context, m2506a, m2571a.m2588g(C0121j.AppCompatTextHelper_android_drawableRight, 0));
        }
        if (m2571a.m2589g(C0121j.AppCompatTextHelper_android_drawableBottom)) {
            this.f2048e = m2202a(context, m2506a, m2571a.m2588g(C0121j.AppCompatTextHelper_android_drawableBottom, 0));
        }
        if (Build.VERSION.SDK_INT >= 17) {
            if (m2571a.m2589g(C0121j.AppCompatTextHelper_android_drawableStart)) {
                this.f2049f = m2202a(context, m2506a, m2571a.m2588g(C0121j.AppCompatTextHelper_android_drawableStart, 0));
            }
            if (m2571a.m2589g(C0121j.AppCompatTextHelper_android_drawableEnd)) {
                this.f2050g = m2202a(context, m2506a, m2571a.m2588g(C0121j.AppCompatTextHelper_android_drawableEnd, 0));
            }
        }
        m2571a.m2576a();
        boolean z3 = this.f2044a.getTransformationMethod() instanceof PasswordTransformationMethod;
        boolean z4 = true;
        if (m2588g != -1) {
            C0479va m2569a = C0479va.m2569a(context, m2588g, C0121j.TextAppearance);
            if (z3 || !m2569a.m2589g(C0121j.TextAppearance_textAllCaps)) {
                z = false;
                z2 = false;
            } else {
                z2 = m2569a.m2577a(C0121j.TextAppearance_textAllCaps, false);
                z = true;
            }
            m2203a(context, m2569a);
            if (Build.VERSION.SDK_INT < 23) {
                ColorStateList m2574a = m2569a.m2589g(C0121j.TextAppearance_android_textColor) ? m2569a.m2574a(C0121j.TextAppearance_android_textColor) : null;
                colorStateList2 = m2569a.m2589g(C0121j.TextAppearance_android_textColorHint) ? m2569a.m2574a(C0121j.TextAppearance_android_textColorHint) : null;
                ColorStateList colorStateList3 = m2574a;
                colorStateList = m2569a.m2589g(C0121j.TextAppearance_android_textColorLink) ? m2569a.m2574a(C0121j.TextAppearance_android_textColorLink) : null;
                r10 = colorStateList3;
            } else {
                colorStateList = null;
                colorStateList2 = null;
            }
            m2569a.m2576a();
        } else {
            colorStateList = null;
            colorStateList2 = null;
            z = false;
            z2 = false;
        }
        C0479va m2571a2 = C0479va.m2571a(context, attributeSet, C0121j.TextAppearance, i, 0);
        if (z3 || !m2571a2.m2589g(C0121j.TextAppearance_textAllCaps)) {
            z4 = z;
        } else {
            z2 = m2571a2.m2577a(C0121j.TextAppearance_textAllCaps, false);
        }
        if (Build.VERSION.SDK_INT < 23) {
            if (m2571a2.m2589g(C0121j.TextAppearance_android_textColor)) {
                r10 = m2571a2.m2574a(C0121j.TextAppearance_android_textColor);
            }
            if (m2571a2.m2589g(C0121j.TextAppearance_android_textColorHint)) {
                colorStateList2 = m2571a2.m2574a(C0121j.TextAppearance_android_textColorHint);
            }
            if (m2571a2.m2589g(C0121j.TextAppearance_android_textColorLink)) {
                colorStateList = m2571a2.m2574a(C0121j.TextAppearance_android_textColorLink);
            }
        }
        if (Build.VERSION.SDK_INT >= 28 && m2571a2.m2589g(C0121j.TextAppearance_android_textSize) && m2571a2.m2580c(C0121j.TextAppearance_android_textSize, -1) == 0) {
            this.f2044a.setTextSize(0, 0.0f);
        }
        m2203a(context, m2571a2);
        m2571a2.m2576a();
        if (r10 != null) {
            this.f2044a.setTextColor(r10);
        }
        if (colorStateList2 != null) {
            this.f2044a.setHintTextColor(colorStateList2);
        }
        if (colorStateList != null) {
            this.f2044a.setLinkTextColor(colorStateList);
        }
        if (!z3 && z4) {
            m2213a(z2);
        }
        Typeface typeface = this.f2053j;
        if (typeface != null) {
            this.f2044a.setTypeface(typeface, this.f2052i);
        }
        this.f2051h.m2250a(attributeSet, i);
        if (InterfaceC0284b.f1253a && this.f2051h.m2256f() != 0) {
            int[] m2255e = this.f2051h.m2255e();
            if (m2255e.length > 0) {
                if (this.f2044a.getAutoSizeStepGranularity() != -1.0f) {
                    this.f2044a.setAutoSizeTextTypeUniformWithConfiguration(this.f2051h.m2253c(), this.f2051h.m2252b(), this.f2051h.m2254d(), 0);
                } else {
                    this.f2044a.setAutoSizeTextTypeUniformWithPresetSizes(m2255e, 0);
                }
            }
        }
        C0479va m2570a = C0479va.m2570a(context, attributeSet, C0121j.AppCompatTextView);
        int m2580c = m2570a.m2580c(C0121j.AppCompatTextView_firstBaselineToTopHeight, -1);
        int m2580c2 = m2570a.m2580c(C0121j.AppCompatTextView_lastBaselineToBottomHeight, -1);
        int m2580c3 = m2570a.m2580c(C0121j.AppCompatTextView_lineHeight, -1);
        m2570a.m2576a();
        if (m2580c != -1) {
            C0274D.m1434a(this.f2044a, m2580c);
        }
        if (m2580c2 != -1) {
            C0274D.m1438b(this.f2044a, m2580c2);
        }
        if (m2580c3 != -1) {
            C0274D.m1440c(this.f2044a, m2580c3);
        }
    }

    /* renamed from: a */
    public void m2212a(WeakReference<TextView> weakReference, Typeface typeface) {
        if (this.f2054k) {
            this.f2053j = typeface;
            TextView textView = weakReference.get();
            if (textView != null) {
                textView.setTypeface(typeface, this.f2052i);
            }
        }
    }

    /* renamed from: a */
    public void m2213a(boolean z) {
        this.f2044a.setAllCaps(z);
    }

    /* renamed from: a */
    public void m2214a(boolean z, int i, int i2, int i3, int i4) {
        if (InterfaceC0284b.f1253a) {
            return;
        }
        m2216b();
    }

    /* renamed from: a */
    public void m2215a(int[] iArr, int i) {
        this.f2051h.m2251a(iArr, i);
    }

    /* renamed from: b */
    public void m2216b() {
        this.f2051h.m2246a();
    }

    /* renamed from: c */
    public int m2217c() {
        return this.f2051h.m2252b();
    }

    /* renamed from: d */
    public int m2218d() {
        return this.f2051h.m2253c();
    }

    /* renamed from: e */
    public int m2219e() {
        return this.f2051h.m2254d();
    }

    /* renamed from: f */
    public int[] m2220f() {
        return this.f2051h.m2255e();
    }

    /* renamed from: g */
    public int m2221g() {
        return this.f2051h.m2256f();
    }

    /* renamed from: h */
    public boolean m2222h() {
        return this.f2051h.m2257g();
    }
}
