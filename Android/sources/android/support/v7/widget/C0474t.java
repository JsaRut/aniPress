package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.v4.widget.InterfaceC0276F;
import android.util.AttributeSet;
import android.widget.ImageView;
import p000a.p005b.p009c.p019h.InterfaceC0105t;

/* renamed from: android.support.v7.widget.t */
/* loaded from: classes.dex */
public class C0474t extends ImageView implements InterfaceC0105t, InterfaceC0276F {

    /* renamed from: a */
    private final C0454j f2497a;

    /* renamed from: b */
    private final C0472s f2498b;

    public C0474t(Context context) {
        this(context, null);
    }

    public C0474t(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C0474t(Context context, AttributeSet attributeSet, int i) {
        super(C0473sa.m2564a(context), attributeSet, i);
        this.f2497a = new C0454j(this);
        this.f2497a.m2470a(attributeSet, i);
        this.f2498b = new C0472s(this);
        this.f2498b.m2560a(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0454j c0454j = this.f2497a;
        if (c0454j != null) {
            c0454j.m2465a();
        }
        C0472s c0472s = this.f2498b;
        if (c0472s != null) {
            c0472s.m2556a();
        }
    }

    @Override // p000a.p005b.p009c.p019h.InterfaceC0105t
    public ColorStateList getSupportBackgroundTintList() {
        C0454j c0454j = this.f2497a;
        if (c0454j != null) {
            return c0454j.m2471b();
        }
        return null;
    }

    @Override // p000a.p005b.p009c.p019h.InterfaceC0105t
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0454j c0454j = this.f2497a;
        if (c0454j != null) {
            return c0454j.m2473c();
        }
        return null;
    }

    @Override // android.support.v4.widget.InterfaceC0276F
    public ColorStateList getSupportImageTintList() {
        C0472s c0472s = this.f2498b;
        if (c0472s != null) {
            return c0472s.m2561b();
        }
        return null;
    }

    @Override // android.support.v4.widget.InterfaceC0276F
    public PorterDuff.Mode getSupportImageTintMode() {
        C0472s c0472s = this.f2498b;
        if (c0472s != null) {
            return c0472s.m2562c();
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return this.f2498b.m2563d() && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0454j c0454j = this.f2497a;
        if (c0454j != null) {
            c0454j.m2469a(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0454j c0454j = this.f2497a;
        if (c0454j != null) {
            c0454j.m2466a(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C0472s c0472s = this.f2498b;
        if (c0472s != null) {
            c0472s.m2556a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        C0472s c0472s = this.f2498b;
        if (c0472s != null) {
            c0472s.m2556a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        C0472s c0472s = this.f2498b;
        if (c0472s != null) {
            c0472s.m2557a(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C0472s c0472s = this.f2498b;
        if (c0472s != null) {
            c0472s.m2556a();
        }
    }

    @Override // p000a.p005b.p009c.p019h.InterfaceC0105t
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0454j c0454j = this.f2497a;
        if (c0454j != null) {
            c0454j.m2472b(colorStateList);
        }
    }

    @Override // p000a.p005b.p009c.p019h.InterfaceC0105t
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0454j c0454j = this.f2497a;
        if (c0454j != null) {
            c0454j.m2468a(mode);
        }
    }

    @Override // android.support.v4.widget.InterfaceC0276F
    public void setSupportImageTintList(ColorStateList colorStateList) {
        C0472s c0472s = this.f2498b;
        if (c0472s != null) {
            c0472s.m2558a(colorStateList);
        }
    }

    @Override // android.support.v4.widget.InterfaceC0276F
    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C0472s c0472s = this.f2498b;
        if (c0472s != null) {
            c0472s.m2559a(mode);
        }
    }
}
