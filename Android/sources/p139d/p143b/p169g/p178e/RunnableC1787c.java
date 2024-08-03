package p139d.p143b.p169g.p178e;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import p139d.p143b.p148c.p152d.C1691j;

/* renamed from: d.b.g.e.c */
/* loaded from: classes.dex */
public class RunnableC1787c extends C1793i implements Runnable, InterfaceC1788d {

    /* renamed from: e */
    private int f6540e;

    /* renamed from: f */
    private boolean f6541f;

    /* renamed from: g */
    float f6542g;

    /* renamed from: h */
    private boolean f6543h;

    public RunnableC1787c(Drawable drawable, int i) {
        this(drawable, i, true);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RunnableC1787c(Drawable drawable, int i, boolean z) {
        super(drawable);
        C1691j.m6971a(drawable);
        this.f6542g = 0.0f;
        this.f6543h = false;
        this.f6540e = i;
        this.f6541f = z;
    }

    /* renamed from: b */
    private int m7345b() {
        return (int) ((20.0f / this.f6540e) * 360.0f);
    }

    /* renamed from: c */
    private void m7346c() {
        if (this.f6543h) {
            return;
        }
        this.f6543h = true;
        scheduleSelf(this, SystemClock.uptimeMillis() + 20);
    }

    @Override // p139d.p143b.p169g.p178e.C1793i, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int save = canvas.save();
        Rect bounds = getBounds();
        int i = bounds.right - bounds.left;
        int i2 = bounds.bottom - bounds.top;
        float f = this.f6542g;
        if (!this.f6541f) {
            f = 360.0f - f;
        }
        canvas.rotate(f, bounds.left + (i / 2), bounds.top + (i2 / 2));
        super.draw(canvas);
        canvas.restoreToCount(save);
        m7346c();
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f6543h = false;
        this.f6542g += m7345b();
        invalidateSelf();
    }
}
