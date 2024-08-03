package p139d.p143b.p169g.p178e;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: d.b.g.e.i */
/* loaded from: classes.dex */
public class C1793i extends Drawable implements Drawable.Callback, InterfaceC1806v, InterfaceC1805u, InterfaceC1789e {

    /* renamed from: a */
    private static final Matrix f6558a = new Matrix();

    /* renamed from: b */
    private Drawable f6559b;

    /* renamed from: c */
    private final C1790f f6560c = new C1790f();

    /* renamed from: d */
    protected InterfaceC1806v f6561d;

    public C1793i(Drawable drawable) {
        this.f6559b = drawable;
        C1791g.m7354a(this.f6559b, this, this);
    }

    @Override // p139d.p143b.p169g.p178e.InterfaceC1789e
    /* renamed from: a */
    public Drawable mo7335a() {
        return getCurrent();
    }

    @Override // p139d.p143b.p169g.p178e.InterfaceC1789e
    /* renamed from: a */
    public Drawable mo7336a(Drawable drawable) {
        return mo7368b(drawable);
    }

    @Override // p139d.p143b.p169g.p178e.InterfaceC1806v
    /* renamed from: a */
    public void mo7341a(Matrix matrix) {
        m7369b(matrix);
    }

    @Override // p139d.p143b.p169g.p178e.InterfaceC1806v
    /* renamed from: a */
    public void mo7342a(RectF rectF) {
        InterfaceC1806v interfaceC1806v = this.f6561d;
        if (interfaceC1806v != null) {
            interfaceC1806v.mo7342a(rectF);
        } else {
            rectF.set(getBounds());
        }
    }

    @Override // p139d.p143b.p169g.p178e.InterfaceC1805u
    /* renamed from: a */
    public void mo7343a(InterfaceC1806v interfaceC1806v) {
        this.f6561d = interfaceC1806v;
    }

    /* renamed from: b */
    public Drawable mo7368b(Drawable drawable) {
        Drawable m7370c = m7370c(drawable);
        invalidateSelf();
        return m7370c;
    }

    /* renamed from: b */
    public void m7369b(Matrix matrix) {
        InterfaceC1806v interfaceC1806v = this.f6561d;
        if (interfaceC1806v != null) {
            interfaceC1806v.mo7341a(matrix);
        } else {
            matrix.reset();
        }
    }

    /* renamed from: c */
    protected Drawable m7370c(Drawable drawable) {
        Drawable drawable2 = this.f6559b;
        C1791g.m7354a(drawable2, null, null);
        C1791g.m7354a(drawable, null, null);
        C1791g.m7356a(drawable, this.f6560c);
        C1791g.m7355a(drawable, this);
        C1791g.m7354a(drawable, this, this);
        this.f6559b = drawable;
        return drawable2;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f6559b.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f6559b.getConstantState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f6559b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f6559b.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f6559b.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f6559b.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        return this.f6559b.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.f6559b.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f6559b.mutate();
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.f6559b.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i) {
        return this.f6559b.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        return this.f6559b.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f6560c.m7347a(i);
        this.f6559b.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f6560c.m7348a(colorFilter);
        this.f6559b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        this.f6560c.m7350a(z);
        this.f6559b.setDither(z);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.f6560c.m7351b(z);
        this.f6559b.setFilterBitmap(z);
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void setHotspot(float f, float f2) {
        this.f6559b.setHotspot(f, f2);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        super.setVisible(z, z2);
        return this.f6559b.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
