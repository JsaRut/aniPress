package com.facebook.react.views.art;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import com.facebook.react.uimanager.C1348ha;
import com.facebook.react.uimanager.C1359n;
import com.facebook.react.uimanager.InterfaceC1269E;
import com.facebook.react.uimanager.p127a.InterfaceC1294a;
import p139d.p143b.p148c.p153e.C1700a;

/* renamed from: com.facebook.react.views.art.e */
/* loaded from: classes.dex */
public class TextureViewSurfaceTextureListenerC1382e extends C1359n implements TextureView.SurfaceTextureListener {

    /* renamed from: w */
    private Surface f5101w;

    /* renamed from: x */
    private Integer f5102x;

    /* renamed from: N */
    private void m5971N() {
        Surface surface = this.f5101w;
        if (surface == null || !surface.isValid()) {
            m5972e(this);
            return;
        }
        try {
            Canvas lockCanvas = this.f5101w.lockCanvas(null);
            lockCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
            if (this.f5102x != null) {
                lockCanvas.drawColor(this.f5102x.intValue());
            }
            Paint paint = new Paint();
            for (int i = 0; i < mo5501e(); i++) {
                AbstractC1384g abstractC1384g = (AbstractC1384g) mo5502e(i);
                abstractC1384g.mo5966a(lockCanvas, paint, 1.0f);
                abstractC1384g.mo5489b();
            }
            if (this.f5101w == null) {
                return;
            }
            this.f5101w.unlockCanvasAndPost(lockCanvas);
        } catch (IllegalArgumentException | IllegalStateException e2) {
            C1700a.m7006b("ReactNative", e2.getClass().getSimpleName() + " in Surface.unlockCanvasAndPost");
        }
    }

    /* renamed from: e */
    private void m5972e(InterfaceC1269E interfaceC1269E) {
        for (int i = 0; i < interfaceC1269E.mo5501e(); i++) {
            InterfaceC1269E mo5502e = interfaceC1269E.mo5502e(i);
            mo5502e.mo5489b();
            m5972e(mo5502e);
        }
    }

    @Override // com.facebook.react.uimanager.C1270F
    /* renamed from: a */
    public void mo5539a(C1348ha c1348ha) {
        super.mo5539a(c1348ha);
        m5971N();
        c1348ha.m5821a(mo5504g(), this);
    }

    @Override // com.facebook.react.uimanager.C1270F, com.facebook.react.uimanager.InterfaceC1269E
    /* renamed from: j */
    public boolean mo5507j() {
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        this.f5101w = new Surface(surfaceTexture);
        m5971N();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        surfaceTexture.release();
        this.f5101w = null;
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @InterfaceC1294a(customType = "Color", name = "backgroundColor")
    public void setBackgroundColor(Integer num) {
        this.f5102x = num;
        mo5535K();
    }

    @Override // com.facebook.react.uimanager.C1270F, com.facebook.react.uimanager.InterfaceC1269E
    /* renamed from: w */
    public boolean mo5520w() {
        return true;
    }
}
