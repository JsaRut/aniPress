package p139d.p143b.p169g.p178e;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import p139d.p143b.p148c.p152d.C1691j;

/* renamed from: d.b.g.e.k */
/* loaded from: classes.dex */
public class C1795k extends C1793i {

    /* renamed from: e */
    final Matrix f6566e;

    /* renamed from: f */
    private int f6567f;

    /* renamed from: g */
    private int f6568g;

    /* renamed from: h */
    private final Matrix f6569h;

    /* renamed from: i */
    private final RectF f6570i;

    public C1795k(Drawable drawable, int i, int i2) {
        super(drawable);
        this.f6569h = new Matrix();
        this.f6570i = new RectF();
        C1691j.m6974a(i % 90 == 0);
        C1691j.m6974a(i2 >= 0 && i2 <= 8);
        this.f6566e = new Matrix();
        this.f6567f = i;
        this.f6568g = i2;
    }

    @Override // p139d.p143b.p169g.p178e.C1793i, p139d.p143b.p169g.p178e.InterfaceC1806v
    /* renamed from: a */
    public void mo7341a(Matrix matrix) {
        m7369b(matrix);
        if (this.f6566e.isIdentity()) {
            return;
        }
        matrix.preConcat(this.f6566e);
    }

    @Override // p139d.p143b.p169g.p178e.C1793i, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int i;
        if (this.f6567f <= 0 && ((i = this.f6568g) == 0 || i == 1)) {
            super.draw(canvas);
            return;
        }
        int save = canvas.save();
        canvas.concat(this.f6566e);
        super.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // p139d.p143b.p169g.p178e.C1793i, android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        int i = this.f6568g;
        return (i == 5 || i == 7 || this.f6567f % 180 != 0) ? super.getIntrinsicWidth() : super.getIntrinsicHeight();
    }

    @Override // p139d.p143b.p169g.p178e.C1793i, android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        int i = this.f6568g;
        return (i == 5 || i == 7 || this.f6567f % 180 != 0) ? super.getIntrinsicHeight() : super.getIntrinsicWidth();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p139d.p143b.p169g.p178e.C1793i, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        int i;
        Drawable current = getCurrent();
        if (this.f6567f <= 0 && ((i = this.f6568g) == 0 || i == 1)) {
            current.setBounds(rect);
            return;
        }
        int i2 = this.f6568g;
        if (i2 == 2) {
            this.f6566e.setScale(-1.0f, 1.0f);
        } else if (i2 == 7) {
            this.f6566e.setRotate(270.0f, rect.centerX(), rect.centerY());
            this.f6566e.postScale(-1.0f, 1.0f);
        } else if (i2 == 4) {
            this.f6566e.setScale(1.0f, -1.0f);
        } else if (i2 != 5) {
            this.f6566e.setRotate(this.f6567f, rect.centerX(), rect.centerY());
        } else {
            this.f6566e.setRotate(270.0f, rect.centerX(), rect.centerY());
            this.f6566e.postScale(1.0f, -1.0f);
        }
        this.f6569h.reset();
        this.f6566e.invert(this.f6569h);
        this.f6570i.set(rect);
        this.f6569h.mapRect(this.f6570i);
        RectF rectF = this.f6570i;
        current.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }
}
