package p139d.p143b.p169g.p178e;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: d.b.g.e.j */
/* loaded from: classes.dex */
public class C1794j extends C1793i {

    /* renamed from: e */
    private Matrix f6562e;

    /* renamed from: f */
    private Matrix f6563f;

    /* renamed from: g */
    private int f6564g;

    /* renamed from: h */
    private int f6565h;

    /* renamed from: b */
    private void m7371b() {
        Matrix matrix;
        Drawable current = getCurrent();
        Rect bounds = getBounds();
        int intrinsicWidth = current.getIntrinsicWidth();
        this.f6564g = intrinsicWidth;
        int intrinsicHeight = current.getIntrinsicHeight();
        this.f6565h = intrinsicHeight;
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            current.setBounds(bounds);
            matrix = null;
        } else {
            current.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            matrix = this.f6562e;
        }
        this.f6563f = matrix;
    }

    /* renamed from: c */
    private void m7372c() {
        if (this.f6564g == getCurrent().getIntrinsicWidth() && this.f6565h == getCurrent().getIntrinsicHeight()) {
            return;
        }
        m7371b();
    }

    @Override // p139d.p143b.p169g.p178e.C1793i, p139d.p143b.p169g.p178e.InterfaceC1806v
    /* renamed from: a */
    public void mo7341a(Matrix matrix) {
        super.mo7341a(matrix);
        Matrix matrix2 = this.f6563f;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
    }

    @Override // p139d.p143b.p169g.p178e.C1793i
    /* renamed from: b */
    public Drawable mo7368b(Drawable drawable) {
        Drawable mo7368b = super.mo7368b(drawable);
        m7371b();
        return mo7368b;
    }

    @Override // p139d.p143b.p169g.p178e.C1793i, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        m7372c();
        if (this.f6563f == null) {
            super.draw(canvas);
            return;
        }
        int save = canvas.save();
        canvas.clipRect(getBounds());
        canvas.concat(this.f6563f);
        super.draw(canvas);
        canvas.restoreToCount(save);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p139d.p143b.p169g.p178e.C1793i, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m7371b();
    }
}
