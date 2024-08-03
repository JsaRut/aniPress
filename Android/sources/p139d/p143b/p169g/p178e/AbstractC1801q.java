package p139d.p143b.p169g.p178e;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.Arrays;
import p139d.p143b.p148c.p152d.C1691j;

/* renamed from: d.b.g.e.q */
/* loaded from: classes.dex */
public abstract class AbstractC1801q extends Drawable implements InterfaceC1796l, InterfaceC1805u {

    /* renamed from: B */
    private InterfaceC1806v f6610B;

    /* renamed from: a */
    private final Drawable f6611a;

    /* renamed from: k */
    float[] f6621k;

    /* renamed from: p */
    RectF f6626p;

    /* renamed from: v */
    Matrix f6632v;

    /* renamed from: w */
    Matrix f6633w;

    /* renamed from: b */
    protected boolean f6612b = false;

    /* renamed from: c */
    protected boolean f6613c = false;

    /* renamed from: d */
    protected float f6614d = 0.0f;

    /* renamed from: e */
    protected final Path f6615e = new Path();

    /* renamed from: f */
    protected boolean f6616f = true;

    /* renamed from: g */
    protected int f6617g = 0;

    /* renamed from: h */
    protected final Path f6618h = new Path();

    /* renamed from: i */
    private final float[] f6619i = new float[8];

    /* renamed from: j */
    final float[] f6620j = new float[8];

    /* renamed from: l */
    final RectF f6622l = new RectF();

    /* renamed from: m */
    final RectF f6623m = new RectF();

    /* renamed from: n */
    final RectF f6624n = new RectF();

    /* renamed from: o */
    final RectF f6625o = new RectF();

    /* renamed from: q */
    final Matrix f6627q = new Matrix();

    /* renamed from: r */
    final Matrix f6628r = new Matrix();

    /* renamed from: s */
    final Matrix f6629s = new Matrix();

    /* renamed from: t */
    final Matrix f6630t = new Matrix();

    /* renamed from: u */
    final Matrix f6631u = new Matrix();

    /* renamed from: x */
    final Matrix f6634x = new Matrix();

    /* renamed from: y */
    private float f6635y = 0.0f;

    /* renamed from: z */
    private boolean f6636z = false;

    /* renamed from: A */
    private boolean f6609A = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC1801q(Drawable drawable) {
        this.f6611a = drawable;
    }

    @Override // p139d.p143b.p169g.p178e.InterfaceC1796l
    /* renamed from: a */
    public void mo7373a(float f) {
        if (this.f6635y != f) {
            this.f6635y = f;
            this.f6609A = true;
            invalidateSelf();
        }
    }

    @Override // p139d.p143b.p169g.p178e.InterfaceC1796l
    /* renamed from: a */
    public void mo7374a(int i, float f) {
        if (this.f6617g == i && this.f6614d == f) {
            return;
        }
        this.f6617g = i;
        this.f6614d = f;
        this.f6609A = true;
        invalidateSelf();
    }

    @Override // p139d.p143b.p169g.p178e.InterfaceC1805u
    /* renamed from: a */
    public void mo7343a(InterfaceC1806v interfaceC1806v) {
        this.f6610B = interfaceC1806v;
    }

    @Override // p139d.p143b.p169g.p178e.InterfaceC1796l
    /* renamed from: a */
    public void mo7375a(boolean z) {
        this.f6612b = z;
        this.f6609A = true;
        invalidateSelf();
    }

    @Override // p139d.p143b.p169g.p178e.InterfaceC1796l
    /* renamed from: a */
    public void mo7376a(float[] fArr) {
        if (fArr == null) {
            Arrays.fill(this.f6619i, 0.0f);
            this.f6613c = false;
        } else {
            C1691j.m6975a(fArr.length == 8, "radii should have exactly 8 values");
            System.arraycopy(fArr, 0, this.f6619i, 0, 8);
            this.f6613c = false;
            for (int i = 0; i < 8; i++) {
                this.f6613c |= fArr[i] > 0.0f;
            }
        }
        this.f6609A = true;
        invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo7380a() {
        return this.f6612b || this.f6613c || this.f6614d > 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public void m7386b() {
        float[] fArr;
        Path path;
        RectF rectF;
        float[] fArr2;
        if (this.f6609A) {
            this.f6618h.reset();
            RectF rectF2 = this.f6622l;
            float f = this.f6614d;
            rectF2.inset(f / 2.0f, f / 2.0f);
            if (this.f6612b) {
                this.f6618h.addCircle(this.f6622l.centerX(), this.f6622l.centerY(), Math.min(this.f6622l.width(), this.f6622l.height()) / 2.0f, Path.Direction.CW);
            } else {
                int i = 0;
                while (true) {
                    fArr = this.f6620j;
                    if (i >= fArr.length) {
                        break;
                    }
                    fArr[i] = (this.f6619i[i] + this.f6635y) - (this.f6614d / 2.0f);
                    i++;
                }
                this.f6618h.addRoundRect(this.f6622l, fArr, Path.Direction.CW);
            }
            RectF rectF3 = this.f6622l;
            float f2 = this.f6614d;
            rectF3.inset((-f2) / 2.0f, (-f2) / 2.0f);
            this.f6615e.reset();
            float f3 = this.f6635y + (this.f6636z ? this.f6614d : 0.0f);
            this.f6622l.inset(f3, f3);
            if (this.f6612b) {
                this.f6615e.addCircle(this.f6622l.centerX(), this.f6622l.centerY(), Math.min(this.f6622l.width(), this.f6622l.height()) / 2.0f, Path.Direction.CW);
            } else {
                if (this.f6636z) {
                    if (this.f6621k == null) {
                        this.f6621k = new float[8];
                    }
                    for (int i2 = 0; i2 < this.f6620j.length; i2++) {
                        this.f6621k[i2] = this.f6619i[i2] - this.f6614d;
                    }
                    path = this.f6615e;
                    rectF = this.f6622l;
                    fArr2 = this.f6621k;
                } else {
                    path = this.f6615e;
                    rectF = this.f6622l;
                    fArr2 = this.f6619i;
                }
                path.addRoundRect(rectF, fArr2, Path.Direction.CW);
            }
            float f4 = -f3;
            this.f6622l.inset(f4, f4);
            this.f6615e.setFillType(Path.FillType.WINDING);
            this.f6609A = false;
        }
    }

    @Override // p139d.p143b.p169g.p178e.InterfaceC1796l
    /* renamed from: b */
    public void mo7377b(float f) {
        C1691j.m6978b(f >= 0.0f);
        Arrays.fill(this.f6619i, f);
        this.f6613c = f != 0.0f;
        this.f6609A = true;
        invalidateSelf();
    }

    @Override // p139d.p143b.p169g.p178e.InterfaceC1796l
    /* renamed from: b */
    public void mo7378b(boolean z) {
        if (this.f6636z != z) {
            this.f6636z = z;
            this.f6609A = true;
            invalidateSelf();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public void m7387c() {
        Matrix matrix;
        InterfaceC1806v interfaceC1806v = this.f6610B;
        if (interfaceC1806v != null) {
            interfaceC1806v.mo7341a(this.f6629s);
            this.f6610B.mo7342a(this.f6622l);
        } else {
            this.f6629s.reset();
            this.f6622l.set(getBounds());
        }
        this.f6624n.set(0.0f, 0.0f, getIntrinsicWidth(), getIntrinsicHeight());
        this.f6625o.set(this.f6611a.getBounds());
        this.f6627q.setRectToRect(this.f6624n, this.f6625o, Matrix.ScaleToFit.FILL);
        if (this.f6636z) {
            RectF rectF = this.f6626p;
            if (rectF == null) {
                this.f6626p = new RectF(this.f6622l);
            } else {
                rectF.set(this.f6622l);
            }
            RectF rectF2 = this.f6626p;
            float f = this.f6614d;
            rectF2.inset(f, f);
            if (this.f6632v == null) {
                this.f6632v = new Matrix();
            }
            this.f6632v.setRectToRect(this.f6622l, this.f6626p, Matrix.ScaleToFit.FILL);
        } else {
            Matrix matrix2 = this.f6632v;
            if (matrix2 != null) {
                matrix2.reset();
            }
        }
        if (!this.f6629s.equals(this.f6630t) || !this.f6627q.equals(this.f6628r) || ((matrix = this.f6632v) != null && !matrix.equals(this.f6633w))) {
            this.f6616f = true;
            this.f6629s.invert(this.f6631u);
            this.f6634x.set(this.f6629s);
            if (this.f6636z) {
                this.f6634x.postConcat(this.f6632v);
            }
            this.f6634x.preConcat(this.f6627q);
            this.f6630t.set(this.f6629s);
            this.f6628r.set(this.f6627q);
            if (this.f6636z) {
                Matrix matrix3 = this.f6633w;
                if (matrix3 == null) {
                    this.f6633w = new Matrix(this.f6632v);
                } else {
                    matrix3.set(this.f6632v);
                }
            } else {
                Matrix matrix4 = this.f6633w;
                if (matrix4 != null) {
                    matrix4.reset();
                }
            }
        }
        if (this.f6622l.equals(this.f6623m)) {
            return;
        }
        this.f6609A = true;
        this.f6623m.set(this.f6622l);
    }

    @Override // android.graphics.drawable.Drawable
    public void clearColorFilter() {
        this.f6611a.clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f6611a.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f6611a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f6611a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f6611a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f6611a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f6611a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        this.f6611a.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f6611a.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(int i, PorterDuff.Mode mode) {
        this.f6611a.setColorFilter(i, mode);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f6611a.setColorFilter(colorFilter);
    }
}
