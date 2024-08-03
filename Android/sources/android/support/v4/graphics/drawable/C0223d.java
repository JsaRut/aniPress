package android.support.v4.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* renamed from: android.support.v4.graphics.drawable.d */
/* loaded from: classes.dex */
class C0223d extends Drawable implements Drawable.Callback, InterfaceC0222c, InterfaceC0221b {

    /* renamed from: a */
    static final PorterDuff.Mode f957a = PorterDuff.Mode.SRC_IN;

    /* renamed from: b */
    private int f958b;

    /* renamed from: c */
    private PorterDuff.Mode f959c;

    /* renamed from: d */
    private boolean f960d;

    /* renamed from: e */
    a f961e;

    /* renamed from: f */
    private boolean f962f;

    /* renamed from: g */
    Drawable f963g;

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: android.support.v4.graphics.drawable.d$a */
    /* loaded from: classes.dex */
    public static abstract class a extends Drawable.ConstantState {

        /* renamed from: a */
        int f964a;

        /* renamed from: b */
        Drawable.ConstantState f965b;

        /* renamed from: c */
        ColorStateList f966c;

        /* renamed from: d */
        PorterDuff.Mode f967d;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(a aVar, Resources resources) {
            this.f966c = null;
            this.f967d = C0223d.f957a;
            if (aVar != null) {
                this.f964a = aVar.f964a;
                this.f965b = aVar.f965b;
                this.f966c = aVar.f966c;
                this.f967d = aVar.f967d;
            }
        }

        /* renamed from: a */
        boolean m1216a() {
            return this.f965b != null;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            int i = this.f964a;
            Drawable.ConstantState constantState = this.f965b;
            return i | (constantState != null ? constantState.getChangingConfigurations() : 0);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return newDrawable(null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public abstract Drawable newDrawable(Resources resources);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v4.graphics.drawable.d$b */
    /* loaded from: classes.dex */
    public static class b extends a {
        b(a aVar, Resources resources) {
            super(aVar, resources);
        }

        @Override // android.support.v4.graphics.drawable.C0223d.a, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new C0223d(this, resources);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0223d(Drawable drawable) {
        this.f961e = mo1215c();
        mo1211a(drawable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0223d(a aVar, Resources resources) {
        this.f961e = aVar;
        m1212a(resources);
    }

    /* renamed from: a */
    private void m1212a(Resources resources) {
        Drawable.ConstantState constantState;
        a aVar = this.f961e;
        if (aVar == null || (constantState = aVar.f965b) == null) {
            return;
        }
        mo1211a(constantState.newDrawable(resources));
    }

    /* renamed from: a */
    private boolean m1213a(int[] iArr) {
        if (!mo1214b()) {
            return false;
        }
        a aVar = this.f961e;
        ColorStateList colorStateList = aVar.f966c;
        PorterDuff.Mode mode = aVar.f967d;
        if (colorStateList == null || mode == null) {
            this.f960d = false;
            clearColorFilter();
        } else {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!this.f960d || colorForState != this.f958b || mode != this.f959c) {
                setColorFilter(colorForState, mode);
                this.f958b = colorForState;
                this.f959c = mode;
                this.f960d = true;
                return true;
            }
        }
        return false;
    }

    @Override // android.support.v4.graphics.drawable.InterfaceC0222c
    /* renamed from: a */
    public final Drawable mo1210a() {
        return this.f963g;
    }

    @Override // android.support.v4.graphics.drawable.InterfaceC0222c
    /* renamed from: a */
    public final void mo1211a(Drawable drawable) {
        Drawable drawable2 = this.f963g;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f963g = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            a aVar = this.f961e;
            if (aVar != null) {
                aVar.f965b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    /* renamed from: b */
    protected boolean mo1214b() {
        return true;
    }

    /* renamed from: c */
    a mo1215c() {
        return new b(this.f961e, null);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f963g.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        a aVar = this.f961e;
        return changingConfigurations | (aVar != null ? aVar.getChangingConfigurations() : 0) | this.f963g.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        a aVar = this.f961e;
        if (aVar == null || !aVar.m1216a()) {
            return null;
        }
        this.f961e.f964a = getChangingConfigurations();
        return this.f961e;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f963g.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f963g.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f963g.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.f963g.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.f963g.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f963g.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        return this.f963g.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public int[] getState() {
        return this.f963g.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        return this.f963g.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return this.f963g.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        a aVar;
        ColorStateList colorStateList = (!mo1214b() || (aVar = this.f961e) == null) ? null : aVar.f966c;
        return (colorStateList != null && colorStateList.isStateful()) || this.f963g.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.f963g.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f962f && super.mutate() == this) {
            this.f961e = mo1215c();
            Drawable drawable = this.f963g;
            if (drawable != null) {
                drawable.mutate();
            }
            a aVar = this.f961e;
            if (aVar != null) {
                Drawable drawable2 = this.f963g;
                aVar.f965b = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.f962f = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f963g;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i) {
        return this.f963g.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f963g.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        this.f963g.setAutoMirrored(z);
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i) {
        this.f963g.setChangingConfigurations(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f963g.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        this.f963g.setDither(z);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.f963g.setFilterBitmap(z);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        return m1213a(iArr) || this.f963g.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable, android.support.v4.graphics.drawable.InterfaceC0221b
    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable, android.support.v4.graphics.drawable.InterfaceC0221b
    public void setTintList(ColorStateList colorStateList) {
        this.f961e.f966c = colorStateList;
        m1213a(getState());
    }

    @Override // android.graphics.drawable.Drawable, android.support.v4.graphics.drawable.InterfaceC0221b
    public void setTintMode(PorterDuff.Mode mode) {
        this.f961e.f967d = mode;
        m1213a(getState());
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f963g.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
