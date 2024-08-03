package android.support.v7.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.TypedValue;
import p000a.p005b.p009c.p012b.C0035a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: android.support.v7.widget.qa */
/* loaded from: classes.dex */
public class C0469qa {

    /* renamed from: a */
    private static final ThreadLocal<TypedValue> f2477a = new ThreadLocal<>();

    /* renamed from: b */
    static final int[] f2478b = {-16842910};

    /* renamed from: c */
    static final int[] f2479c = {R.attr.state_focused};

    /* renamed from: d */
    static final int[] f2480d = {R.attr.state_activated};

    /* renamed from: e */
    static final int[] f2481e = {R.attr.state_pressed};

    /* renamed from: f */
    static final int[] f2482f = {R.attr.state_checked};

    /* renamed from: g */
    static final int[] f2483g = {R.attr.state_selected};

    /* renamed from: h */
    static final int[] f2484h = {-16842919, -16842908};

    /* renamed from: i */
    static final int[] f2485i = new int[0];

    /* renamed from: j */
    private static final int[] f2486j = new int[1];

    /* renamed from: a */
    public static int m2549a(Context context, int i) {
        ColorStateList m2553c = m2553c(context, i);
        if (m2553c != null && m2553c.isStateful()) {
            return m2553c.getColorForState(f2478b, m2553c.getDefaultColor());
        }
        TypedValue m2551a = m2551a();
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, m2551a, true);
        return m2550a(context, i, m2551a.getFloat());
    }

    /* renamed from: a */
    static int m2550a(Context context, int i, float f) {
        return C0035a.m172b(m2552b(context, i), Math.round(Color.alpha(r0) * f));
    }

    /* renamed from: a */
    private static TypedValue m2551a() {
        TypedValue typedValue = f2477a.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        f2477a.set(typedValue2);
        return typedValue2;
    }

    /* renamed from: b */
    public static int m2552b(Context context, int i) {
        int[] iArr = f2486j;
        iArr[0] = i;
        C0479va m2570a = C0479va.m2570a(context, (AttributeSet) null, iArr);
        try {
            return m2570a.m2573a(0, 0);
        } finally {
            m2570a.m2576a();
        }
    }

    /* renamed from: c */
    public static ColorStateList m2553c(Context context, int i) {
        int[] iArr = f2486j;
        iArr[0] = i;
        C0479va m2570a = C0479va.m2570a(context, (AttributeSet) null, iArr);
        try {
            return m2570a.m2574a(0);
        } finally {
            m2570a.m2576a();
        }
    }
}
