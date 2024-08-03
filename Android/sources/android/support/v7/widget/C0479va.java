package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import p000a.p005b.p009c.p010a.p011a.C0030h;
import p000a.p005b.p022d.p024b.p025a.C0122a;

/* renamed from: android.support.v7.widget.va */
/* loaded from: classes.dex */
public class C0479va {

    /* renamed from: a */
    private final Context f2509a;

    /* renamed from: b */
    private final TypedArray f2510b;

    /* renamed from: c */
    private TypedValue f2511c;

    private C0479va(Context context, TypedArray typedArray) {
        this.f2509a = context;
        this.f2510b = typedArray;
    }

    /* renamed from: a */
    public static C0479va m2569a(Context context, int i, int[] iArr) {
        return new C0479va(context, context.obtainStyledAttributes(i, iArr));
    }

    /* renamed from: a */
    public static C0479va m2570a(Context context, AttributeSet attributeSet, int[] iArr) {
        return new C0479va(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    /* renamed from: a */
    public static C0479va m2571a(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new C0479va(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    /* renamed from: a */
    public float m2572a(int i, float f) {
        return this.f2510b.getFloat(i, f);
    }

    /* renamed from: a */
    public int m2573a(int i, int i2) {
        return this.f2510b.getColor(i, i2);
    }

    /* renamed from: a */
    public ColorStateList m2574a(int i) {
        int resourceId;
        ColorStateList m547a;
        return (!this.f2510b.hasValue(i) || (resourceId = this.f2510b.getResourceId(i, 0)) == 0 || (m547a = C0122a.m547a(this.f2509a, resourceId)) == null) ? this.f2510b.getColorStateList(i) : m547a;
    }

    /* renamed from: a */
    public Typeface m2575a(int i, int i2, C0030h.a aVar) {
        int resourceId = this.f2510b.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f2511c == null) {
            this.f2511c = new TypedValue();
        }
        return C0030h.m135a(this.f2509a, resourceId, this.f2511c, i2, aVar);
    }

    /* renamed from: a */
    public void m2576a() {
        this.f2510b.recycle();
    }

    /* renamed from: a */
    public boolean m2577a(int i, boolean z) {
        return this.f2510b.getBoolean(i, z);
    }

    /* renamed from: b */
    public int m2578b(int i, int i2) {
        return this.f2510b.getDimensionPixelOffset(i, i2);
    }

    /* renamed from: b */
    public Drawable m2579b(int i) {
        int resourceId;
        return (!this.f2510b.hasValue(i) || (resourceId = this.f2510b.getResourceId(i, 0)) == 0) ? this.f2510b.getDrawable(i) : C0122a.m550b(this.f2509a, resourceId);
    }

    /* renamed from: c */
    public int m2580c(int i, int i2) {
        return this.f2510b.getDimensionPixelSize(i, i2);
    }

    /* renamed from: c */
    public Drawable m2581c(int i) {
        int resourceId;
        if (!this.f2510b.hasValue(i) || (resourceId = this.f2510b.getResourceId(i, 0)) == 0) {
            return null;
        }
        return C0464o.m2506a().m2526a(this.f2509a, resourceId, true);
    }

    /* renamed from: d */
    public int m2582d(int i, int i2) {
        return this.f2510b.getInt(i, i2);
    }

    /* renamed from: d */
    public String m2583d(int i) {
        return this.f2510b.getString(i);
    }

    /* renamed from: e */
    public int m2584e(int i, int i2) {
        return this.f2510b.getInteger(i, i2);
    }

    /* renamed from: e */
    public CharSequence m2585e(int i) {
        return this.f2510b.getText(i);
    }

    /* renamed from: f */
    public int m2586f(int i, int i2) {
        return this.f2510b.getLayoutDimension(i, i2);
    }

    /* renamed from: f */
    public CharSequence[] m2587f(int i) {
        return this.f2510b.getTextArray(i);
    }

    /* renamed from: g */
    public int m2588g(int i, int i2) {
        return this.f2510b.getResourceId(i, i2);
    }

    /* renamed from: g */
    public boolean m2589g(int i) {
        return this.f2510b.hasValue(i);
    }
}
