package p139d.p225c.p226a.p227a.p259k;

import android.graphics.Bitmap;
import android.text.Layout;

/* renamed from: d.c.a.a.k.b */
/* loaded from: classes.dex */
public class C2527b {

    /* renamed from: a */
    public final CharSequence f10389a;

    /* renamed from: b */
    public final Layout.Alignment f10390b;

    /* renamed from: c */
    public final Bitmap f10391c;

    /* renamed from: d */
    public final float f10392d;

    /* renamed from: e */
    public final int f10393e;

    /* renamed from: f */
    public final int f10394f;

    /* renamed from: g */
    public final float f10395g;

    /* renamed from: h */
    public final int f10396h;

    /* renamed from: i */
    public final float f10397i;

    /* renamed from: j */
    public final float f10398j;

    /* renamed from: k */
    public final boolean f10399k;

    /* renamed from: l */
    public final int f10400l;

    /* renamed from: m */
    public final int f10401m;

    /* renamed from: n */
    public final float f10402n;

    public C2527b(Bitmap bitmap, float f, int i, float f2, int i2, float f3, float f4) {
        this(null, null, bitmap, f2, 0, i2, f, i, Integer.MIN_VALUE, Float.MIN_VALUE, f3, f4, false, -16777216);
    }

    public C2527b(CharSequence charSequence) {
        this(charSequence, null, Float.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE);
    }

    public C2527b(CharSequence charSequence, Layout.Alignment alignment, float f, int i, int i2, float f2, int i3, float f3) {
        this(charSequence, alignment, f, i, i2, f2, i3, f3, false, -16777216);
    }

    public C2527b(CharSequence charSequence, Layout.Alignment alignment, float f, int i, int i2, float f2, int i3, float f3, int i4, float f4) {
        this(charSequence, alignment, null, f, i, i2, f2, i3, i4, f4, f3, Float.MIN_VALUE, false, -16777216);
    }

    public C2527b(CharSequence charSequence, Layout.Alignment alignment, float f, int i, int i2, float f2, int i3, float f3, boolean z, int i4) {
        this(charSequence, alignment, null, f, i, i2, f2, i3, Integer.MIN_VALUE, Float.MIN_VALUE, f3, Float.MIN_VALUE, z, i4);
    }

    private C2527b(CharSequence charSequence, Layout.Alignment alignment, Bitmap bitmap, float f, int i, int i2, float f2, int i3, int i4, float f3, float f4, float f5, boolean z, int i5) {
        this.f10389a = charSequence;
        this.f10390b = alignment;
        this.f10391c = bitmap;
        this.f10392d = f;
        this.f10393e = i;
        this.f10394f = i2;
        this.f10395g = f2;
        this.f10396h = i3;
        this.f10397i = f4;
        this.f10398j = f5;
        this.f10399k = z;
        this.f10400l = i5;
        this.f10401m = i4;
        this.f10402n = f3;
    }
}
