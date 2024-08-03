package p139d.p143b.p169g.p179f;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import p139d.p143b.p169g.p178e.C1793i;
import p139d.p143b.p169g.p178e.InterfaceC1807w;
import p139d.p143b.p169g.p178e.InterfaceC1808x;

/* renamed from: d.b.g.f.c */
/* loaded from: classes.dex */
public class C1811c extends C1793i implements InterfaceC1807w {

    /* renamed from: e */
    Drawable f6689e;

    /* renamed from: f */
    private InterfaceC1808x f6690f;

    public C1811c(Drawable drawable) {
        super(drawable);
        this.f6689e = null;
    }

    @Override // p139d.p143b.p169g.p178e.InterfaceC1807w
    /* renamed from: a */
    public void mo7395a(InterfaceC1808x interfaceC1808x) {
        this.f6690f = interfaceC1808x;
    }

    /* renamed from: d */
    public void m7444d(Drawable drawable) {
        this.f6689e = drawable;
        invalidateSelf();
    }

    @Override // p139d.p143b.p169g.p178e.C1793i, android.graphics.drawable.Drawable
    @SuppressLint({"WrongCall"})
    public void draw(Canvas canvas) {
        if (isVisible()) {
            InterfaceC1808x interfaceC1808x = this.f6690f;
            if (interfaceC1808x != null) {
                interfaceC1808x.onDraw();
            }
            super.draw(canvas);
            Drawable drawable = this.f6689e;
            if (drawable != null) {
                drawable.setBounds(getBounds());
                this.f6689e.draw(canvas);
            }
        }
    }

    @Override // p139d.p143b.p169g.p178e.C1793i, android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return -1;
    }

    @Override // p139d.p143b.p169g.p178e.C1793i, android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return -1;
    }

    @Override // p139d.p143b.p169g.p178e.C1793i, android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        InterfaceC1808x interfaceC1808x = this.f6690f;
        if (interfaceC1808x != null) {
            interfaceC1808x.mo7396a(z);
        }
        return super.setVisible(z, z2);
    }
}
