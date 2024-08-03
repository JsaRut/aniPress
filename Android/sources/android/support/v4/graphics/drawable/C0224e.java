package android.support.v4.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.support.v4.graphics.drawable.C0223d;
import android.util.Log;
import java.lang.reflect.Method;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: android.support.v4.graphics.drawable.e */
/* loaded from: classes.dex */
public class C0224e extends C0223d {

    /* renamed from: h */
    private static Method f968h;

    /* renamed from: android.support.v4.graphics.drawable.e$a */
    /* loaded from: classes.dex */
    private static class a extends C0223d.a {
        a(C0223d.a aVar, Resources resources) {
            super(aVar, resources);
        }

        @Override // android.support.v4.graphics.drawable.C0223d.a, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new C0224e(this, resources);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0224e(Drawable drawable) {
        super(drawable);
        m1217d();
    }

    C0224e(C0223d.a aVar, Resources resources) {
        super(aVar, resources);
        m1217d();
    }

    /* renamed from: d */
    private void m1217d() {
        if (f968h == null) {
            try {
                f968h = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
            } catch (Exception e2) {
                Log.w("WrappedDrawableApi21", "Failed to retrieve Drawable#isProjected() method", e2);
            }
        }
    }

    @Override // android.support.v4.graphics.drawable.C0223d
    /* renamed from: b */
    protected boolean mo1214b() {
        if (Build.VERSION.SDK_INT != 21) {
            return false;
        }
        Drawable drawable = this.f963g;
        return (drawable instanceof GradientDrawable) || (drawable instanceof DrawableContainer) || (drawable instanceof InsetDrawable) || (drawable instanceof RippleDrawable);
    }

    @Override // android.support.v4.graphics.drawable.C0223d
    /* renamed from: c */
    C0223d.a mo1215c() {
        return new a(this.f961e, null);
    }

    @Override // android.graphics.drawable.Drawable
    public Rect getDirtyBounds() {
        return this.f963g.getDirtyBounds();
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.f963g.getOutline(outline);
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f, float f2) {
        this.f963g.setHotspot(f, f2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        this.f963g.setHotspotBounds(i, i2, i3, i4);
    }

    @Override // android.support.v4.graphics.drawable.C0223d, android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        if (!super.setState(iArr)) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.support.v4.graphics.drawable.C0223d, android.graphics.drawable.Drawable, android.support.v4.graphics.drawable.InterfaceC0221b
    public void setTint(int i) {
        if (mo1214b()) {
            super.setTint(i);
        } else {
            this.f963g.setTint(i);
        }
    }

    @Override // android.support.v4.graphics.drawable.C0223d, android.graphics.drawable.Drawable, android.support.v4.graphics.drawable.InterfaceC0221b
    public void setTintList(ColorStateList colorStateList) {
        if (mo1214b()) {
            super.setTintList(colorStateList);
        } else {
            this.f963g.setTintList(colorStateList);
        }
    }

    @Override // android.support.v4.graphics.drawable.C0223d, android.graphics.drawable.Drawable, android.support.v4.graphics.drawable.InterfaceC0221b
    public void setTintMode(PorterDuff.Mode mode) {
        if (mo1214b()) {
            super.setTintMode(mode);
        } else {
            this.f963g.setTintMode(mode);
        }
    }
}
