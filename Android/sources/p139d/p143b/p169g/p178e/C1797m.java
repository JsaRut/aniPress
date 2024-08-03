package p139d.p143b.p169g.p178e;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import java.lang.ref.WeakReference;

/* renamed from: d.b.g.e.m */
/* loaded from: classes.dex */
public class C1797m extends AbstractC1801q {

    /* renamed from: C */
    private final Paint f6571C;

    /* renamed from: D */
    private final Paint f6572D;

    /* renamed from: E */
    private final Bitmap f6573E;

    /* renamed from: F */
    private WeakReference<Bitmap> f6574F;

    public C1797m(Resources resources, Bitmap bitmap, Paint paint) {
        super(new BitmapDrawable(resources, bitmap));
        this.f6571C = new Paint();
        this.f6572D = new Paint(1);
        this.f6573E = bitmap;
        if (paint != null) {
            this.f6571C.set(paint);
        }
        this.f6571C.setFlags(1);
        this.f6572D.setStyle(Paint.Style.STROKE);
    }

    /* renamed from: d */
    private void m7379d() {
        WeakReference<Bitmap> weakReference = this.f6574F;
        if (weakReference == null || weakReference.get() != this.f6573E) {
            this.f6574F = new WeakReference<>(this.f6573E);
            Paint paint = this.f6571C;
            Bitmap bitmap = this.f6573E;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
            this.f6616f = true;
        }
        if (this.f6616f) {
            this.f6571C.getShader().setLocalMatrix(this.f6634x);
            this.f6616f = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p139d.p143b.p169g.p178e.AbstractC1801q
    /* renamed from: a */
    public boolean mo7380a() {
        return super.mo7380a() && this.f6573E != null;
    }

    @Override // p139d.p143b.p169g.p178e.AbstractC1801q, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (!mo7380a()) {
            super.draw(canvas);
            return;
        }
        m7387c();
        m7386b();
        m7379d();
        int save = canvas.save();
        canvas.concat(this.f6631u);
        canvas.drawPath(this.f6615e, this.f6571C);
        float f = this.f6614d;
        if (f > 0.0f) {
            this.f6572D.setStrokeWidth(f);
            this.f6572D.setColor(C1791g.m7353a(this.f6617g, this.f6571C.getAlpha()));
            canvas.drawPath(this.f6618h, this.f6572D);
        }
        canvas.restoreToCount(save);
    }

    @Override // p139d.p143b.p169g.p178e.AbstractC1801q, android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        super.setAlpha(i);
        if (i != this.f6571C.getAlpha()) {
            this.f6571C.setAlpha(i);
            super.setAlpha(i);
            invalidateSelf();
        }
    }

    @Override // p139d.p143b.p169g.p178e.AbstractC1801q, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
        this.f6571C.setColorFilter(colorFilter);
    }
}
