package com.facebook.react.views.art;

import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.C1278N;
import com.facebook.yoga.YogaMeasureFunction;
import p139d.p143b.p208m.p212d.p213a.InterfaceC2073a;

@InterfaceC2073a(name = ARTSurfaceViewManager.REACT_CLASS)
/* loaded from: classes.dex */
public class ARTSurfaceViewManager extends BaseViewManager<C1380c, TextureViewSurfaceTextureListenerC1382e> {
    private static final YogaMeasureFunction MEASURE_FUNCTION = new C1381d();
    public static final String REACT_CLASS = "ARTSurfaceView";

    @Override // com.facebook.react.uimanager.ViewManager
    public TextureViewSurfaceTextureListenerC1382e createShadowNodeInstance() {
        TextureViewSurfaceTextureListenerC1382e textureViewSurfaceTextureListenerC1382e = new TextureViewSurfaceTextureListenerC1382e();
        textureViewSurfaceTextureListenerC1382e.m5544a(MEASURE_FUNCTION);
        return textureViewSurfaceTextureListenerC1382e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public C1380c createViewInstance(C1278N c1278n) {
        return new C1380c(c1278n);
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Class<TextureViewSurfaceTextureListenerC1382e> getShadowNodeClass() {
        return TextureViewSurfaceTextureListenerC1382e.class;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    public void setBackgroundColor(C1380c c1380c, int i) {
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(C1380c c1380c, Object obj) {
        c1380c.setSurfaceTextureListener((TextureViewSurfaceTextureListenerC1382e) obj);
    }
}
