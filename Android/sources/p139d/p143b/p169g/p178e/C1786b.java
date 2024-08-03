package p139d.p143b.p169g.p178e;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import p139d.p143b.p148c.p152d.C1691j;

/* renamed from: d.b.g.e.b */
/* loaded from: classes.dex */
public class C1786b extends Drawable implements Drawable.Callback, InterfaceC1806v, InterfaceC1805u {

    /* renamed from: a */
    private InterfaceC1806v f6532a;

    /* renamed from: c */
    private final Drawable[] f6534c;

    /* renamed from: d */
    private final InterfaceC1789e[] f6535d;

    /* renamed from: b */
    private final C1790f f6533b = new C1790f();

    /* renamed from: e */
    private final Rect f6536e = new Rect();

    /* renamed from: f */
    private boolean f6537f = false;

    /* renamed from: g */
    private boolean f6538g = false;

    /* renamed from: h */
    private boolean f6539h = false;

    public C1786b(Drawable[] drawableArr) {
        int i = 0;
        C1691j.m6971a(drawableArr);
        this.f6534c = drawableArr;
        while (true) {
            Drawable[] drawableArr2 = this.f6534c;
            if (i >= drawableArr2.length) {
                this.f6535d = new InterfaceC1789e[drawableArr2.length];
                return;
            } else {
                C1791g.m7354a(drawableArr2[i], this, this);
                i++;
            }
        }
    }

    /* renamed from: c */
    private InterfaceC1789e m7337c(int i) {
        return new C1785a(this, i);
    }

    /* renamed from: a */
    public int m7338a() {
        return this.f6534c.length;
    }

    /* renamed from: a */
    public Drawable m7339a(int i) {
        C1691j.m6974a(i >= 0);
        C1691j.m6974a(i < this.f6534c.length);
        return this.f6534c[i];
    }

    /* renamed from: a */
    public Drawable m7340a(int i, Drawable drawable) {
        C1691j.m6974a(i >= 0);
        C1691j.m6974a(i < this.f6534c.length);
        Drawable drawable2 = this.f6534c[i];
        if (drawable != drawable2) {
            if (drawable != null && this.f6539h) {
                drawable.mutate();
            }
            C1791g.m7354a(this.f6534c[i], null, null);
            C1791g.m7354a(drawable, null, null);
            C1791g.m7356a(drawable, this.f6533b);
            C1791g.m7355a(drawable, this);
            C1791g.m7354a(drawable, this, this);
            this.f6538g = false;
            this.f6534c[i] = drawable;
            invalidateSelf();
        }
        return drawable2;
    }

    @Override // p139d.p143b.p169g.p178e.InterfaceC1806v
    /* renamed from: a */
    public void mo7341a(Matrix matrix) {
        InterfaceC1806v interfaceC1806v = this.f6532a;
        if (interfaceC1806v != null) {
            interfaceC1806v.mo7341a(matrix);
        } else {
            matrix.reset();
        }
    }

    @Override // p139d.p143b.p169g.p178e.InterfaceC1806v
    /* renamed from: a */
    public void mo7342a(RectF rectF) {
        InterfaceC1806v interfaceC1806v = this.f6532a;
        if (interfaceC1806v != null) {
            interfaceC1806v.mo7342a(rectF);
        } else {
            rectF.set(getBounds());
        }
    }

    @Override // p139d.p143b.p169g.p178e.InterfaceC1805u
    /* renamed from: a */
    public void mo7343a(InterfaceC1806v interfaceC1806v) {
        this.f6532a = interfaceC1806v;
    }

    /* renamed from: b */
    public InterfaceC1789e m7344b(int i) {
        C1691j.m6974a(i >= 0);
        C1691j.m6974a(i < this.f6535d.length);
        InterfaceC1789e[] interfaceC1789eArr = this.f6535d;
        if (interfaceC1789eArr[i] == null) {
            interfaceC1789eArr[i] = m7337c(i);
        }
        return this.f6535d[i];
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.f6534c;
            if (i >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                drawable.draw(canvas);
            }
            i++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        int i = 0;
        int i2 = -1;
        while (true) {
            Drawable[] drawableArr = this.f6534c;
            if (i >= drawableArr.length) {
                break;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                i2 = Math.max(i2, drawable.getIntrinsicHeight());
            }
            i++;
        }
        if (i2 > 0) {
            return i2;
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        int i = 0;
        int i2 = -1;
        while (true) {
            Drawable[] drawableArr = this.f6534c;
            if (i >= drawableArr.length) {
                break;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                i2 = Math.max(i2, drawable.getIntrinsicWidth());
            }
            i++;
        }
        if (i2 > 0) {
            return i2;
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        if (this.f6534c.length == 0) {
            return -2;
        }
        int i = -1;
        int i2 = 1;
        while (true) {
            Drawable[] drawableArr = this.f6534c;
            if (i2 >= drawableArr.length) {
                return i;
            }
            Drawable drawable = drawableArr[i2];
            if (drawable != null) {
                i = Drawable.resolveOpacity(i, drawable.getOpacity());
            }
            i2++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        int i = 0;
        rect.left = 0;
        rect.top = 0;
        rect.right = 0;
        rect.bottom = 0;
        Rect rect2 = this.f6536e;
        while (true) {
            Drawable[] drawableArr = this.f6534c;
            if (i >= drawableArr.length) {
                return true;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                drawable.getPadding(rect2);
                rect.left = Math.max(rect.left, rect2.left);
                rect.top = Math.max(rect.top, rect2.top);
                rect.right = Math.max(rect.right, rect2.right);
                rect.bottom = Math.max(rect.bottom, rect2.bottom);
            }
            i++;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (!this.f6538g) {
            this.f6537f = false;
            int i = 0;
            while (true) {
                Drawable[] drawableArr = this.f6534c;
                boolean z = true;
                if (i >= drawableArr.length) {
                    break;
                }
                Drawable drawable = drawableArr[i];
                boolean z2 = this.f6537f;
                if (drawable == null || !drawable.isStateful()) {
                    z = false;
                }
                this.f6537f = z2 | z;
                i++;
            }
            this.f6538g = true;
        }
        return this.f6537f;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.f6534c;
            if (i >= drawableArr.length) {
                this.f6539h = true;
                return this;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                drawable.mutate();
            }
            i++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.f6534c;
            if (i >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                drawable.setBounds(rect);
            }
            i++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i) {
        int i2 = 0;
        boolean z = false;
        while (true) {
            Drawable[] drawableArr = this.f6534c;
            if (i2 >= drawableArr.length) {
                return z;
            }
            Drawable drawable = drawableArr[i2];
            if (drawable != null && drawable.setLevel(i)) {
                z = true;
            }
            i2++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        int i = 0;
        boolean z = false;
        while (true) {
            Drawable[] drawableArr = this.f6534c;
            if (i >= drawableArr.length) {
                return z;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null && drawable.setState(iArr)) {
                z = true;
            }
            i++;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f6533b.m7347a(i);
        int i2 = 0;
        while (true) {
            Drawable[] drawableArr = this.f6534c;
            if (i2 >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i2];
            if (drawable != null) {
                drawable.setAlpha(i);
            }
            i2++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f6533b.m7348a(colorFilter);
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.f6534c;
            if (i >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
            i++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        this.f6533b.m7350a(z);
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.f6534c;
            if (i >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                drawable.setDither(z);
            }
            i++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.f6533b.m7351b(z);
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.f6534c;
            if (i >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                drawable.setFilterBitmap(z);
            }
            i++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void setHotspot(float f, float f2) {
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.f6534c;
            if (i >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                drawable.setHotspot(f, f2);
            }
            i++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.f6534c;
            if (i >= drawableArr.length) {
                return visible;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                drawable.setVisible(z, z2);
            }
            i++;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
