package com.facebook.react.views.art;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Region;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.p127a.InterfaceC1294a;

/* renamed from: com.facebook.react.views.art.a */
/* loaded from: classes.dex */
public class C1378a extends AbstractC1384g {

    /* renamed from: A */
    protected RectF f5093A;

    /* renamed from: a */
    private static RectF m5965a(float[] fArr) {
        if (fArr.length == 4) {
            return new RectF(fArr[0], fArr[1], fArr[0] + fArr[2], fArr[1] + fArr[3]);
        }
        throw new JSApplicationIllegalArgumentException("Clipping should be array of length 4 (e.g. [x, y, width, height])");
    }

    @Override // com.facebook.react.views.art.AbstractC1384g
    /* renamed from: a */
    public void mo5966a(Canvas canvas, Paint paint, float f) {
        float f2 = f * this.f5107x;
        if (f2 > 0.01f) {
            m5976b(canvas);
            RectF rectF = this.f5093A;
            if (rectF != null) {
                float f3 = rectF.left;
                float f4 = this.f5109z;
                canvas.clipRect(f3 * f4, rectF.top * f4, rectF.right * f4, rectF.bottom * f4, Region.Op.REPLACE);
            }
            for (int i = 0; i < mo5501e(); i++) {
                AbstractC1384g abstractC1384g = (AbstractC1384g) mo5502e(i);
                abstractC1384g.mo5966a(canvas, paint, f2);
                abstractC1384g.mo5489b();
            }
            m5975a(canvas);
        }
    }

    @Override // com.facebook.react.views.art.AbstractC1384g, com.facebook.react.uimanager.C1270F, com.facebook.react.uimanager.InterfaceC1269E
    /* renamed from: j */
    public boolean mo5507j() {
        return true;
    }

    @InterfaceC1294a(name = "clipping")
    public void setClipping(ReadableArray readableArray) {
        float[] m5978a = C1385h.m5978a(readableArray);
        if (m5978a != null) {
            this.f5093A = m5965a(m5978a);
            mo5535K();
        }
    }
}
