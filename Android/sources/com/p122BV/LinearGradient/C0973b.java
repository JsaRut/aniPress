package com.p122BV.LinearGradient;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.C1374w;

/* renamed from: com.BV.LinearGradient.b */
/* loaded from: classes.dex */
public class C0973b extends View {

    /* renamed from: a */
    private final Paint f4032a;

    /* renamed from: b */
    private Path f4033b;

    /* renamed from: c */
    private RectF f4034c;

    /* renamed from: d */
    private LinearGradient f4035d;

    /* renamed from: e */
    private float[] f4036e;

    /* renamed from: f */
    private float[] f4037f;

    /* renamed from: g */
    private float[] f4038g;

    /* renamed from: h */
    private int[] f4039h;

    /* renamed from: i */
    private boolean f4040i;

    /* renamed from: j */
    private float[] f4041j;

    /* renamed from: k */
    private float f4042k;

    /* renamed from: l */
    private int[] f4043l;

    /* renamed from: m */
    private float[] f4044m;

    public C0973b(Context context) {
        super(context);
        this.f4032a = new Paint(1);
        this.f4037f = new float[]{0.0f, 0.0f};
        this.f4038g = new float[]{0.0f, 1.0f};
        this.f4040i = false;
        this.f4041j = new float[]{0.5f, 0.5f};
        this.f4042k = 45.0f;
        this.f4043l = new int[]{0, 0};
        this.f4044m = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
    }

    /* renamed from: a */
    private void m4827a() {
        int[] iArr = this.f4039h;
        if (iArr != null) {
            float[] fArr = this.f4036e;
            if (fArr == null || iArr.length == fArr.length) {
                float[] fArr2 = this.f4037f;
                float[] fArr3 = this.f4038g;
                if (this.f4040i && this.f4041j != null) {
                    float[] m4828a = m4828a(this.f4042k);
                    float[] fArr4 = this.f4041j;
                    float[] fArr5 = {fArr4[0] - (m4828a[0] / 2.0f), fArr4[1] - (m4828a[1] / 2.0f)};
                    fArr3 = new float[]{fArr4[0] + (m4828a[0] / 2.0f), fArr4[1] + (m4828a[1] / 2.0f)};
                    fArr2 = fArr5;
                }
                float f = fArr2[0];
                int[] iArr2 = this.f4043l;
                this.f4035d = new LinearGradient(iArr2[0] * f, fArr2[1] * iArr2[1], fArr3[0] * iArr2[0], fArr3[1] * iArr2[1], this.f4039h, this.f4036e, Shader.TileMode.CLAMP);
                this.f4032a.setShader(this.f4035d);
                invalidate();
            }
        }
    }

    /* renamed from: a */
    private float[] m4828a(float f) {
        float sqrt = (float) Math.sqrt(2.0d);
        double d2 = (f - 90.0f) * 0.017453292f;
        return new float[]{((float) Math.cos(d2)) * sqrt, ((float) Math.sin(d2)) * sqrt};
    }

    /* renamed from: b */
    private void m4829b() {
        if (this.f4033b == null) {
            this.f4033b = new Path();
            this.f4034c = new RectF();
        }
        this.f4033b.reset();
        RectF rectF = this.f4034c;
        int[] iArr = this.f4043l;
        rectF.set(0.0f, 0.0f, iArr[0], iArr[1]);
        this.f4033b.addRoundRect(this.f4034c, this.f4044m, Path.Direction.CW);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Path path = this.f4033b;
        if (path == null) {
            canvas.drawPaint(this.f4032a);
        } else {
            canvas.drawPath(path, this.f4032a);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        this.f4043l = new int[]{i, i2};
        m4829b();
        m4827a();
    }

    public void setAngle(float f) {
        this.f4042k = f;
        m4827a();
    }

    public void setAngleCenter(ReadableArray readableArray) {
        this.f4041j = new float[]{(float) readableArray.getDouble(0), (float) readableArray.getDouble(1)};
        m4827a();
    }

    public void setBorderRadii(ReadableArray readableArray) {
        float[] fArr = new float[readableArray.size()];
        for (int i = 0; i < fArr.length; i++) {
            fArr[i] = C1374w.m5959b((float) readableArray.getDouble(i));
        }
        this.f4044m = fArr;
        m4829b();
        m4827a();
    }

    public void setColors(ReadableArray readableArray) {
        int[] iArr = new int[readableArray.size()];
        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = readableArray.getInt(i);
        }
        this.f4039h = iArr;
        m4827a();
    }

    public void setEndPosition(ReadableArray readableArray) {
        this.f4038g = new float[]{(float) readableArray.getDouble(0), (float) readableArray.getDouble(1)};
        m4827a();
    }

    public void setLocations(ReadableArray readableArray) {
        float[] fArr = new float[readableArray.size()];
        for (int i = 0; i < fArr.length; i++) {
            fArr[i] = (float) readableArray.getDouble(i);
        }
        this.f4036e = fArr;
        m4827a();
    }

    public void setStartPosition(ReadableArray readableArray) {
        this.f4037f = new float[]{(float) readableArray.getDouble(0), (float) readableArray.getDouble(1)};
        m4827a();
    }

    public void setUseAngle(boolean z) {
        this.f4040i = z;
        m4827a();
    }
}
