package com.facebook.react.views.art;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.p127a.InterfaceC1294a;
import p139d.p143b.p148c.p153e.C1700a;

/* renamed from: com.facebook.react.views.art.b */
/* loaded from: classes.dex */
public class C1379b extends AbstractC1384g {

    /* renamed from: A */
    protected Path f5094A;

    /* renamed from: B */
    private float[] f5095B;

    /* renamed from: C */
    private float[] f5096C;

    /* renamed from: D */
    private float[] f5097D;

    /* renamed from: E */
    private float f5098E = 1.0f;

    /* renamed from: F */
    private int f5099F = 1;

    /* renamed from: G */
    private int f5100G = 1;

    /* renamed from: a */
    private float m5967a(float f, float f2) {
        float f3 = f % f2;
        return f3 < 0.0f ? f3 + f2 : f3;
    }

    /* renamed from: a */
    private Path m5968a(float[] fArr) {
        int i;
        int i2;
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        int i3 = 0;
        while (i3 < fArr.length) {
            int i4 = i3 + 1;
            int i5 = (int) fArr[i3];
            if (i5 != 0) {
                if (i5 == 1) {
                    path.close();
                    i3 = i4;
                } else if (i5 != 2) {
                    if (i5 == 3) {
                        int i6 = i4 + 1;
                        float f = fArr[i4];
                        float f2 = this.f5109z;
                        int i7 = i6 + 1;
                        float f3 = fArr[i6] * f2;
                        int i8 = i7 + 1;
                        float f4 = fArr[i7] * f2;
                        int i9 = i8 + 1;
                        float f5 = fArr[i8] * f2;
                        int i10 = i9 + 1;
                        i2 = i10 + 1;
                        path.cubicTo(f * f2, f3, f4, f5, fArr[i9] * f2, fArr[i10] * f2);
                    } else {
                        if (i5 != 4) {
                            throw new JSApplicationIllegalArgumentException("Unrecognized drawing instruction " + i5);
                        }
                        int i11 = i4 + 1;
                        float f6 = fArr[i4];
                        float f7 = this.f5109z;
                        float f8 = f6 * f7;
                        int i12 = i11 + 1;
                        float f9 = fArr[i11] * f7;
                        int i13 = i12 + 1;
                        float f10 = fArr[i12] * f7;
                        int i14 = i13 + 1;
                        float degrees = (float) Math.toDegrees(fArr[i13]);
                        int i15 = i14 + 1;
                        float degrees2 = (float) Math.toDegrees(fArr[i14]);
                        i2 = i15 + 1;
                        boolean z = fArr[i15] != 1.0f;
                        float f11 = degrees2 - degrees;
                        if (Math.abs(f11) >= 360.0f) {
                            path.addCircle(f8, f9, f10, z ? Path.Direction.CCW : Path.Direction.CW);
                        } else {
                            float m5967a = m5967a(f11, 360.0f);
                            if (z && m5967a < 360.0f) {
                                m5967a = (360.0f - m5967a) * (-1.0f);
                            }
                            path.arcTo(new RectF(f8 - f10, f9 - f10, f8 + f10, f9 + f10), degrees, m5967a);
                        }
                    }
                    i3 = i2;
                } else {
                    int i16 = i4 + 1;
                    float f12 = fArr[i4];
                    float f13 = this.f5109z;
                    i = i16 + 1;
                    path.lineTo(f12 * f13, fArr[i16] * f13);
                }
            } else {
                int i17 = i4 + 1;
                float f14 = fArr[i4];
                float f15 = this.f5109z;
                i = i17 + 1;
                path.moveTo(f14 * f15, fArr[i17] * f15);
            }
            i3 = i;
        }
        return path;
    }

    @Override // com.facebook.react.views.art.AbstractC1384g
    /* renamed from: a */
    public void mo5966a(Canvas canvas, Paint paint, float f) {
        float f2 = f * this.f5107x;
        if (f2 > 0.01f) {
            m5976b(canvas);
            if (this.f5094A == null) {
                throw new JSApplicationIllegalArgumentException("Shapes should have a valid path (d) prop");
            }
            if (m5969a(paint, f2)) {
                canvas.drawPath(this.f5094A, paint);
            }
            if (m5970b(paint, f2)) {
                canvas.drawPath(this.f5094A, paint);
            }
            m5975a(canvas);
        }
        mo5489b();
    }

    /* renamed from: a */
    public boolean m5969a(Paint paint, float f) {
        int[] iArr;
        float[] fArr;
        float[] fArr2 = this.f5096C;
        int i = 0;
        if (fArr2 == null || fArr2.length <= 0) {
            return false;
        }
        paint.reset();
        paint.setFlags(1);
        paint.setStyle(Paint.Style.FILL);
        float[] fArr3 = this.f5096C;
        int i2 = (int) fArr3[0];
        if (i2 == 0) {
            float f2 = fArr3.length > 4 ? fArr3[4] * f * 255.0f : f * 255.0f;
            float[] fArr4 = this.f5096C;
            paint.setARGB((int) f2, (int) (fArr4[1] * 255.0f), (int) (fArr4[2] * 255.0f), (int) (fArr4[3] * 255.0f));
            return true;
        }
        if (i2 != 1) {
            C1700a.m7015d("ReactNative", "ART: Color type " + i2 + " not supported!");
        } else {
            int i3 = 5;
            if (fArr3.length < 5) {
                C1700a.m7015d("ReactNative", "[ARTShapeShadowNode setupFillPaint] expects 5 elements, received " + this.f5096C.length);
                return false;
            }
            float f3 = fArr3[1];
            float f4 = this.f5109z;
            float f5 = f3 * f4;
            float f6 = fArr3[2] * f4;
            float f7 = fArr3[3] * f4;
            float f8 = fArr3[4] * f4;
            int length = (fArr3.length - 5) / 5;
            if (length > 0) {
                int[] iArr2 = new int[length];
                float[] fArr5 = new float[length];
                while (i < length) {
                    float[] fArr6 = this.f5096C;
                    fArr5[i] = fArr6[(length * 4) + i3 + i];
                    int i4 = (i * 4) + i3;
                    iArr2[i] = Color.argb((int) (fArr6[i4 + 3] * 255.0f), (int) (fArr6[i4 + 0] * 255.0f), (int) (fArr6[i4 + 1] * 255.0f), (int) (fArr6[i4 + 2] * 255.0f));
                    i++;
                    i3 = 5;
                }
                iArr = iArr2;
                fArr = fArr5;
            } else {
                iArr = null;
                fArr = null;
            }
            paint.setShader(new LinearGradient(f5, f6, f7, f8, iArr, fArr, Shader.TileMode.CLAMP));
        }
        return true;
    }

    /* renamed from: b */
    public boolean m5970b(Paint paint, float f) {
        float[] fArr;
        Paint.Cap cap;
        Paint.Join join;
        if (this.f5098E == 0.0f || (fArr = this.f5095B) == null || fArr.length == 0) {
            return false;
        }
        paint.reset();
        paint.setFlags(1);
        paint.setStyle(Paint.Style.STROKE);
        int i = this.f5099F;
        if (i == 0) {
            cap = Paint.Cap.BUTT;
        } else if (i == 1) {
            cap = Paint.Cap.ROUND;
        } else {
            if (i != 2) {
                throw new JSApplicationIllegalArgumentException("strokeCap " + this.f5099F + " unrecognized");
            }
            cap = Paint.Cap.SQUARE;
        }
        paint.setStrokeCap(cap);
        int i2 = this.f5100G;
        if (i2 == 0) {
            join = Paint.Join.MITER;
        } else if (i2 == 1) {
            join = Paint.Join.ROUND;
        } else {
            if (i2 != 2) {
                throw new JSApplicationIllegalArgumentException("strokeJoin " + this.f5100G + " unrecognized");
            }
            join = Paint.Join.BEVEL;
        }
        paint.setStrokeJoin(join);
        paint.setStrokeWidth(this.f5098E * this.f5109z);
        float[] fArr2 = this.f5095B;
        int i3 = (int) (fArr2.length > 3 ? fArr2[3] * f * 255.0f : f * 255.0f);
        float[] fArr3 = this.f5095B;
        paint.setARGB(i3, (int) (fArr3[0] * 255.0f), (int) (fArr3[1] * 255.0f), (int) (fArr3[2] * 255.0f));
        float[] fArr4 = this.f5097D;
        if (fArr4 != null && fArr4.length > 0) {
            paint.setPathEffect(new DashPathEffect(fArr4, 0.0f));
        }
        return true;
    }

    @InterfaceC1294a(name = "fill")
    public void setFill(ReadableArray readableArray) {
        this.f5096C = C1385h.m5978a(readableArray);
        mo5535K();
    }

    @InterfaceC1294a(name = "d")
    public void setShapePath(ReadableArray readableArray) {
        this.f5094A = m5968a(C1385h.m5978a(readableArray));
        mo5535K();
    }

    @InterfaceC1294a(name = "stroke")
    public void setStroke(ReadableArray readableArray) {
        this.f5095B = C1385h.m5978a(readableArray);
        mo5535K();
    }

    @InterfaceC1294a(defaultInt = 1, name = "strokeCap")
    public void setStrokeCap(int i) {
        this.f5099F = i;
        mo5535K();
    }

    @InterfaceC1294a(name = "strokeDash")
    public void setStrokeDash(ReadableArray readableArray) {
        this.f5097D = C1385h.m5978a(readableArray);
        mo5535K();
    }

    @InterfaceC1294a(defaultInt = 1, name = "strokeJoin")
    public void setStrokeJoin(int i) {
        this.f5100G = i;
        mo5535K();
    }

    @InterfaceC1294a(defaultFloat = 1.0f, name = "strokeWidth")
    public void setStrokeWidth(float f) {
        this.f5098E = f;
        mo5535K();
    }
}
