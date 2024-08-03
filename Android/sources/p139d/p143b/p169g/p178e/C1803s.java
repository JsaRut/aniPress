package p139d.p143b.p169g.p178e;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import p139d.p143b.p148c.p152d.C1690i;
import p139d.p143b.p148c.p152d.C1691j;
import p139d.p143b.p169g.p178e.C1804t;

/* renamed from: d.b.g.e.s */
/* loaded from: classes.dex */
public class C1803s extends C1793i {

    /* renamed from: e */
    C1804t.b f6637e;

    /* renamed from: f */
    Object f6638f;

    /* renamed from: g */
    PointF f6639g;

    /* renamed from: h */
    int f6640h;

    /* renamed from: i */
    int f6641i;

    /* renamed from: j */
    Matrix f6642j;

    /* renamed from: k */
    private Matrix f6643k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1803s(Drawable drawable, C1804t.b bVar) {
        super(drawable);
        C1691j.m6971a(drawable);
        this.f6639g = null;
        this.f6640h = 0;
        this.f6641i = 0;
        this.f6643k = new Matrix();
        this.f6637e = bVar;
    }

    /* renamed from: d */
    private void m7388d() {
        boolean z;
        C1804t.b bVar = this.f6637e;
        boolean z2 = true;
        if (bVar instanceof C1804t.l) {
            Object state = ((C1804t.l) bVar).getState();
            z = state == null || !state.equals(this.f6638f);
            this.f6638f = state;
        } else {
            z = false;
        }
        if (this.f6640h == getCurrent().getIntrinsicWidth() && this.f6641i == getCurrent().getIntrinsicHeight()) {
            z2 = false;
        }
        if (z2 || z) {
            m7391b();
        }
    }

    @Override // p139d.p143b.p169g.p178e.C1793i, p139d.p143b.p169g.p178e.InterfaceC1806v
    /* renamed from: a */
    public void mo7341a(Matrix matrix) {
        m7369b(matrix);
        m7388d();
        Matrix matrix2 = this.f6642j;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
    }

    /* renamed from: a */
    public void m7389a(PointF pointF) {
        if (C1690i.m6963a(this.f6639g, pointF)) {
            return;
        }
        if (this.f6639g == null) {
            this.f6639g = new PointF();
        }
        this.f6639g.set(pointF);
        m7391b();
        invalidateSelf();
    }

    /* renamed from: a */
    public void m7390a(C1804t.b bVar) {
        if (C1690i.m6963a(this.f6637e, bVar)) {
            return;
        }
        this.f6637e = bVar;
        this.f6638f = null;
        m7391b();
        invalidateSelf();
    }

    @Override // p139d.p143b.p169g.p178e.C1793i
    /* renamed from: b */
    public Drawable mo7368b(Drawable drawable) {
        Drawable mo7368b = super.mo7368b(drawable);
        m7391b();
        return mo7368b;
    }

    /* renamed from: b */
    void m7391b() {
        Drawable current = getCurrent();
        Rect bounds = getBounds();
        int width = bounds.width();
        int height = bounds.height();
        int intrinsicWidth = current.getIntrinsicWidth();
        this.f6640h = intrinsicWidth;
        int intrinsicHeight = current.getIntrinsicHeight();
        this.f6641i = intrinsicHeight;
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            current.setBounds(bounds);
            this.f6642j = null;
            return;
        }
        if (intrinsicWidth == width && intrinsicHeight == height) {
            current.setBounds(bounds);
            this.f6642j = null;
            return;
        }
        if (this.f6637e == C1804t.b.f6644a) {
            current.setBounds(bounds);
            this.f6642j = null;
            return;
        }
        current.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        C1804t.b bVar = this.f6637e;
        Matrix matrix = this.f6643k;
        PointF pointF = this.f6639g;
        float f = pointF != null ? pointF.x : 0.5f;
        PointF pointF2 = this.f6639g;
        bVar.mo7394a(matrix, bounds, intrinsicWidth, intrinsicHeight, f, pointF2 != null ? pointF2.y : 0.5f);
        this.f6642j = this.f6643k;
    }

    /* renamed from: c */
    public C1804t.b m7392c() {
        return this.f6637e;
    }

    @Override // p139d.p143b.p169g.p178e.C1793i, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        m7388d();
        if (this.f6642j == null) {
            super.draw(canvas);
            return;
        }
        int save = canvas.save();
        canvas.clipRect(getBounds());
        canvas.concat(this.f6642j);
        super.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // p139d.p143b.p169g.p178e.C1793i, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        m7391b();
    }
}
