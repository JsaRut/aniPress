package p139d.p143b.p169g.p178e;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import java.util.Arrays;
import p139d.p143b.p148c.p152d.C1691j;

/* renamed from: d.b.g.e.n */
/* loaded from: classes.dex */
public class C1798n extends Drawable implements InterfaceC1796l {

    /* renamed from: c */
    float[] f6577c;

    /* renamed from: a */
    private final float[] f6575a = new float[8];

    /* renamed from: b */
    final float[] f6576b = new float[8];

    /* renamed from: d */
    final Paint f6578d = new Paint(1);

    /* renamed from: e */
    private boolean f6579e = false;

    /* renamed from: f */
    private float f6580f = 0.0f;

    /* renamed from: g */
    private float f6581g = 0.0f;

    /* renamed from: h */
    private int f6582h = 0;

    /* renamed from: i */
    private boolean f6583i = false;

    /* renamed from: j */
    final Path f6584j = new Path();

    /* renamed from: k */
    final Path f6585k = new Path();

    /* renamed from: l */
    private int f6586l = 0;

    /* renamed from: m */
    private final RectF f6587m = new RectF();

    /* renamed from: n */
    private int f6588n = 255;

    public C1798n(int i) {
        m7383a(i);
    }

    @TargetApi(11)
    /* renamed from: a */
    public static C1798n m7381a(ColorDrawable colorDrawable) {
        return new C1798n(colorDrawable.getColor());
    }

    /* renamed from: a */
    private void m7382a() {
        float[] fArr;
        float[] fArr2;
        this.f6584j.reset();
        this.f6585k.reset();
        this.f6587m.set(getBounds());
        RectF rectF = this.f6587m;
        float f = this.f6580f;
        rectF.inset(f / 2.0f, f / 2.0f);
        int i = 0;
        if (this.f6579e) {
            this.f6585k.addCircle(this.f6587m.centerX(), this.f6587m.centerY(), Math.min(this.f6587m.width(), this.f6587m.height()) / 2.0f, Path.Direction.CW);
        } else {
            int i2 = 0;
            while (true) {
                fArr = this.f6576b;
                if (i2 >= fArr.length) {
                    break;
                }
                fArr[i2] = (this.f6575a[i2] + this.f6581g) - (this.f6580f / 2.0f);
                i2++;
            }
            this.f6585k.addRoundRect(this.f6587m, fArr, Path.Direction.CW);
        }
        RectF rectF2 = this.f6587m;
        float f2 = this.f6580f;
        rectF2.inset((-f2) / 2.0f, (-f2) / 2.0f);
        float f3 = this.f6581g + (this.f6583i ? this.f6580f : 0.0f);
        this.f6587m.inset(f3, f3);
        if (this.f6579e) {
            this.f6584j.addCircle(this.f6587m.centerX(), this.f6587m.centerY(), Math.min(this.f6587m.width(), this.f6587m.height()) / 2.0f, Path.Direction.CW);
        } else if (this.f6583i) {
            if (this.f6577c == null) {
                this.f6577c = new float[8];
            }
            while (true) {
                fArr2 = this.f6577c;
                if (i >= fArr2.length) {
                    break;
                }
                fArr2[i] = this.f6575a[i] - this.f6580f;
                i++;
            }
            this.f6584j.addRoundRect(this.f6587m, fArr2, Path.Direction.CW);
        } else {
            this.f6584j.addRoundRect(this.f6587m, this.f6575a, Path.Direction.CW);
        }
        float f4 = -f3;
        this.f6587m.inset(f4, f4);
    }

    @Override // p139d.p143b.p169g.p178e.InterfaceC1796l
    /* renamed from: a */
    public void mo7373a(float f) {
        if (this.f6581g != f) {
            this.f6581g = f;
            m7382a();
            invalidateSelf();
        }
    }

    /* renamed from: a */
    public void m7383a(int i) {
        if (this.f6586l != i) {
            this.f6586l = i;
            invalidateSelf();
        }
    }

    @Override // p139d.p143b.p169g.p178e.InterfaceC1796l
    /* renamed from: a */
    public void mo7374a(int i, float f) {
        if (this.f6582h != i) {
            this.f6582h = i;
            invalidateSelf();
        }
        if (this.f6580f != f) {
            this.f6580f = f;
            m7382a();
            invalidateSelf();
        }
    }

    @Override // p139d.p143b.p169g.p178e.InterfaceC1796l
    /* renamed from: a */
    public void mo7375a(boolean z) {
        this.f6579e = z;
        m7382a();
        invalidateSelf();
    }

    @Override // p139d.p143b.p169g.p178e.InterfaceC1796l
    /* renamed from: a */
    public void mo7376a(float[] fArr) {
        if (fArr == null) {
            Arrays.fill(this.f6575a, 0.0f);
        } else {
            C1691j.m6975a(fArr.length == 8, "radii should have exactly 8 values");
            System.arraycopy(fArr, 0, this.f6575a, 0, 8);
        }
        m7382a();
        invalidateSelf();
    }

    @Override // p139d.p143b.p169g.p178e.InterfaceC1796l
    /* renamed from: b */
    public void mo7377b(float f) {
        C1691j.m6975a(f >= 0.0f, "radius should be non negative");
        Arrays.fill(this.f6575a, f);
        m7382a();
        invalidateSelf();
    }

    @Override // p139d.p143b.p169g.p178e.InterfaceC1796l
    /* renamed from: b */
    public void mo7378b(boolean z) {
        if (this.f6583i != z) {
            this.f6583i = z;
            m7382a();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f6578d.setColor(C1791g.m7353a(this.f6586l, this.f6588n));
        this.f6578d.setStyle(Paint.Style.FILL);
        canvas.drawPath(this.f6584j, this.f6578d);
        if (this.f6580f != 0.0f) {
            this.f6578d.setColor(C1791g.m7353a(this.f6582h, this.f6588n));
            this.f6578d.setStyle(Paint.Style.STROKE);
            this.f6578d.setStrokeWidth(this.f6580f);
            canvas.drawPath(this.f6585k, this.f6578d);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f6588n;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return C1791g.m7352a(C1791g.m7353a(this.f6586l, this.f6588n));
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m7382a();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (i != this.f6588n) {
            this.f6588n = i;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
