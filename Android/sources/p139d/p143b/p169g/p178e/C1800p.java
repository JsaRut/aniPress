package p139d.p143b.p169g.p178e;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.Arrays;
import p139d.p143b.p148c.p152d.C1691j;

/* renamed from: d.b.g.e.p */
/* loaded from: classes.dex */
public class C1800p extends C1793i implements InterfaceC1796l {

    /* renamed from: e */
    a f6590e;

    /* renamed from: f */
    private final RectF f6591f;

    /* renamed from: g */
    private RectF f6592g;

    /* renamed from: h */
    private Matrix f6593h;

    /* renamed from: i */
    private final float[] f6594i;

    /* renamed from: j */
    final float[] f6595j;

    /* renamed from: k */
    final Paint f6596k;

    /* renamed from: l */
    private boolean f6597l;

    /* renamed from: m */
    private float f6598m;

    /* renamed from: n */
    private int f6599n;

    /* renamed from: o */
    private int f6600o;

    /* renamed from: p */
    private float f6601p;

    /* renamed from: q */
    private boolean f6602q;

    /* renamed from: r */
    private final Path f6603r;

    /* renamed from: s */
    private final Path f6604s;

    /* renamed from: t */
    private final RectF f6605t;

    /* renamed from: d.b.g.e.p$a */
    /* loaded from: classes.dex */
    public enum a {
        OVERLAY_COLOR,
        CLIPPING
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1800p(Drawable drawable) {
        super(drawable);
        C1691j.m6971a(drawable);
        this.f6590e = a.OVERLAY_COLOR;
        this.f6591f = new RectF();
        this.f6594i = new float[8];
        this.f6595j = new float[8];
        this.f6596k = new Paint(1);
        this.f6597l = false;
        this.f6598m = 0.0f;
        this.f6599n = 0;
        this.f6600o = 0;
        this.f6601p = 0.0f;
        this.f6602q = false;
        this.f6603r = new Path();
        this.f6604s = new Path();
        this.f6605t = new RectF();
    }

    /* renamed from: b */
    private void m7384b() {
        float[] fArr;
        this.f6603r.reset();
        this.f6604s.reset();
        this.f6605t.set(getBounds());
        RectF rectF = this.f6605t;
        float f = this.f6601p;
        rectF.inset(f, f);
        this.f6603r.addRect(this.f6605t, Path.Direction.CW);
        if (this.f6597l) {
            this.f6603r.addCircle(this.f6605t.centerX(), this.f6605t.centerY(), Math.min(this.f6605t.width(), this.f6605t.height()) / 2.0f, Path.Direction.CW);
        } else {
            this.f6603r.addRoundRect(this.f6605t, this.f6594i, Path.Direction.CW);
        }
        RectF rectF2 = this.f6605t;
        float f2 = this.f6601p;
        rectF2.inset(-f2, -f2);
        RectF rectF3 = this.f6605t;
        float f3 = this.f6598m;
        rectF3.inset(f3 / 2.0f, f3 / 2.0f);
        if (this.f6597l) {
            this.f6604s.addCircle(this.f6605t.centerX(), this.f6605t.centerY(), Math.min(this.f6605t.width(), this.f6605t.height()) / 2.0f, Path.Direction.CW);
        } else {
            int i = 0;
            while (true) {
                fArr = this.f6595j;
                if (i >= fArr.length) {
                    break;
                }
                fArr[i] = (this.f6594i[i] + this.f6601p) - (this.f6598m / 2.0f);
                i++;
            }
            this.f6604s.addRoundRect(this.f6605t, fArr, Path.Direction.CW);
        }
        RectF rectF4 = this.f6605t;
        float f4 = this.f6598m;
        rectF4.inset((-f4) / 2.0f, (-f4) / 2.0f);
    }

    @Override // p139d.p143b.p169g.p178e.InterfaceC1796l
    /* renamed from: a */
    public void mo7373a(float f) {
        this.f6601p = f;
        m7384b();
        invalidateSelf();
    }

    /* renamed from: a */
    public void m7385a(int i) {
        this.f6600o = i;
        invalidateSelf();
    }

    @Override // p139d.p143b.p169g.p178e.InterfaceC1796l
    /* renamed from: a */
    public void mo7374a(int i, float f) {
        this.f6599n = i;
        this.f6598m = f;
        m7384b();
        invalidateSelf();
    }

    @Override // p139d.p143b.p169g.p178e.InterfaceC1796l
    /* renamed from: a */
    public void mo7375a(boolean z) {
        this.f6597l = z;
        m7384b();
        invalidateSelf();
    }

    @Override // p139d.p143b.p169g.p178e.InterfaceC1796l
    /* renamed from: a */
    public void mo7376a(float[] fArr) {
        if (fArr == null) {
            Arrays.fill(this.f6594i, 0.0f);
        } else {
            C1691j.m6975a(fArr.length == 8, "radii should have exactly 8 values");
            System.arraycopy(fArr, 0, this.f6594i, 0, 8);
        }
        m7384b();
        invalidateSelf();
    }

    @Override // p139d.p143b.p169g.p178e.InterfaceC1796l
    /* renamed from: b */
    public void mo7377b(float f) {
        Arrays.fill(this.f6594i, f);
        m7384b();
        invalidateSelf();
    }

    @Override // p139d.p143b.p169g.p178e.InterfaceC1796l
    /* renamed from: b */
    public void mo7378b(boolean z) {
        this.f6602q = z;
        m7384b();
        invalidateSelf();
    }

    @Override // p139d.p143b.p169g.p178e.C1793i, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f6591f.set(getBounds());
        int i = C1799o.f6589a[this.f6590e.ordinal()];
        if (i == 1) {
            int save = canvas.save();
            this.f6603r.setFillType(Path.FillType.EVEN_ODD);
            canvas.clipPath(this.f6603r);
            super.draw(canvas);
            canvas.restoreToCount(save);
        } else if (i == 2) {
            if (this.f6602q) {
                RectF rectF = this.f6592g;
                if (rectF == null) {
                    this.f6592g = new RectF(this.f6591f);
                    this.f6593h = new Matrix();
                } else {
                    rectF.set(this.f6591f);
                }
                RectF rectF2 = this.f6592g;
                float f = this.f6598m;
                rectF2.inset(f, f);
                this.f6593h.setRectToRect(this.f6591f, this.f6592g, Matrix.ScaleToFit.FILL);
                int save2 = canvas.save();
                canvas.clipRect(this.f6591f);
                canvas.concat(this.f6593h);
                super.draw(canvas);
                canvas.restoreToCount(save2);
            } else {
                super.draw(canvas);
            }
            this.f6596k.setStyle(Paint.Style.FILL);
            this.f6596k.setColor(this.f6600o);
            this.f6596k.setStrokeWidth(0.0f);
            this.f6603r.setFillType(Path.FillType.EVEN_ODD);
            canvas.drawPath(this.f6603r, this.f6596k);
            if (this.f6597l) {
                float width = ((this.f6591f.width() - this.f6591f.height()) + this.f6598m) / 2.0f;
                float height = ((this.f6591f.height() - this.f6591f.width()) + this.f6598m) / 2.0f;
                if (width > 0.0f) {
                    RectF rectF3 = this.f6591f;
                    float f2 = rectF3.left;
                    canvas.drawRect(f2, rectF3.top, f2 + width, rectF3.bottom, this.f6596k);
                    RectF rectF4 = this.f6591f;
                    float f3 = rectF4.right;
                    canvas.drawRect(f3 - width, rectF4.top, f3, rectF4.bottom, this.f6596k);
                }
                if (height > 0.0f) {
                    RectF rectF5 = this.f6591f;
                    float f4 = rectF5.left;
                    float f5 = rectF5.top;
                    canvas.drawRect(f4, f5, rectF5.right, f5 + height, this.f6596k);
                    RectF rectF6 = this.f6591f;
                    float f6 = rectF6.left;
                    float f7 = rectF6.bottom;
                    canvas.drawRect(f6, f7 - height, rectF6.right, f7, this.f6596k);
                }
            }
        }
        if (this.f6599n != 0) {
            this.f6596k.setStyle(Paint.Style.STROKE);
            this.f6596k.setColor(this.f6599n);
            this.f6596k.setStrokeWidth(this.f6598m);
            this.f6603r.setFillType(Path.FillType.EVEN_ODD);
            canvas.drawPath(this.f6604s, this.f6596k);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p139d.p143b.p169g.p178e.C1793i, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m7384b();
    }
}
