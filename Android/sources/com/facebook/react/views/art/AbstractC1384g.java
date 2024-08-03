package com.facebook.react.views.art;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.C1270F;
import com.facebook.react.uimanager.C1347h;
import com.facebook.react.uimanager.p127a.InterfaceC1294a;

/* renamed from: com.facebook.react.views.art.g */
/* loaded from: classes.dex */
public abstract class AbstractC1384g extends C1270F {

    /* renamed from: v */
    private static final float[] f5105v = new float[9];

    /* renamed from: w */
    private static final float[] f5106w = new float[9];

    /* renamed from: x */
    protected float f5107x = 1.0f;

    /* renamed from: y */
    private Matrix f5108y = new Matrix();

    /* renamed from: z */
    protected final float f5109z = C1347h.m5783b().density;

    /* renamed from: N */
    protected void m5974N() {
        float[] fArr = f5106w;
        float[] fArr2 = f5105v;
        fArr[0] = fArr2[0];
        fArr[1] = fArr2[2];
        float f = fArr2[4];
        float f2 = this.f5109z;
        fArr[2] = f * f2;
        fArr[3] = fArr2[1];
        fArr[4] = fArr2[3];
        fArr[5] = fArr2[5] * f2;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 1.0f;
        if (this.f5108y == null) {
            this.f5108y = new Matrix();
        }
        this.f5108y.setValues(f5106w);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void m5975a(Canvas canvas) {
        canvas.restore();
    }

    /* renamed from: a */
    public abstract void mo5966a(Canvas canvas, Paint paint, float f);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public final void m5976b(Canvas canvas) {
        canvas.save();
        Matrix matrix = this.f5108y;
        if (matrix != null) {
            canvas.concat(matrix);
        }
    }

    @Override // com.facebook.react.uimanager.C1270F, com.facebook.react.uimanager.InterfaceC1269E
    /* renamed from: j */
    public boolean mo5507j() {
        return true;
    }

    @InterfaceC1294a(defaultFloat = 1.0f, name = "opacity")
    public void setOpacity(float f) {
        this.f5107x = f;
        mo5535K();
    }

    @InterfaceC1294a(name = "transform")
    public void setTransform(ReadableArray readableArray) {
        if (readableArray != null) {
            int m5977a = C1385h.m5977a(readableArray, f5105v);
            if (m5977a == 6) {
                m5974N();
            } else if (m5977a != -1) {
                throw new JSApplicationIllegalArgumentException("Transform matrices must be of size 6");
            }
        } else {
            this.f5108y = null;
        }
        mo5535K();
    }
}
