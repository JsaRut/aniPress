package p139d.p143b.p169g.p178e;

import android.annotation.SuppressLint;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

/* renamed from: d.b.g.e.f */
/* loaded from: classes.dex */
public class C1790f {

    /* renamed from: a */
    private int f6544a = -1;

    /* renamed from: b */
    private boolean f6545b = false;

    /* renamed from: c */
    private ColorFilter f6546c = null;

    /* renamed from: d */
    private int f6547d = -1;

    /* renamed from: e */
    private int f6548e = -1;

    /* renamed from: a */
    public void m7347a(int i) {
        this.f6544a = i;
    }

    /* renamed from: a */
    public void m7348a(ColorFilter colorFilter) {
        this.f6546c = colorFilter;
        this.f6545b = true;
    }

    @SuppressLint({"Range"})
    /* renamed from: a */
    public void m7349a(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        int i = this.f6544a;
        if (i != -1) {
            drawable.setAlpha(i);
        }
        if (this.f6545b) {
            drawable.setColorFilter(this.f6546c);
        }
        int i2 = this.f6547d;
        if (i2 != -1) {
            drawable.setDither(i2 != 0);
        }
        int i3 = this.f6548e;
        if (i3 != -1) {
            drawable.setFilterBitmap(i3 != 0);
        }
    }

    /* renamed from: a */
    public void m7350a(boolean z) {
        this.f6547d = z ? 1 : 0;
    }

    /* renamed from: b */
    public void m7351b(boolean z) {
        this.f6548e = z ? 1 : 0;
    }
}
