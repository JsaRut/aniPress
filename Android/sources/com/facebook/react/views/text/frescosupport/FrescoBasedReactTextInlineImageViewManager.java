package com.facebook.react.views.text.frescosupport;

import android.view.View;
import com.facebook.react.uimanager.C1278N;
import com.facebook.react.uimanager.ViewManager;
import p139d.p143b.p169g.p170a.p171a.C1763c;
import p139d.p143b.p169g.p175c.AbstractC1777e;
import p139d.p143b.p208m.p212d.p213a.InterfaceC2073a;

@InterfaceC2073a(name = FrescoBasedReactTextInlineImageViewManager.REACT_CLASS)
/* loaded from: classes.dex */
public class FrescoBasedReactTextInlineImageViewManager extends ViewManager<View, C1454a> {
    public static final String REACT_CLASS = "RCTTextInlineImage";
    private final Object mCallerContext;
    private final AbstractC1777e mDraweeControllerBuilder;

    public FrescoBasedReactTextInlineImageViewManager() {
        this(null, null);
    }

    public FrescoBasedReactTextInlineImageViewManager(AbstractC1777e abstractC1777e, Object obj) {
        this.mDraweeControllerBuilder = abstractC1777e;
        this.mCallerContext = obj;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public C1454a createShadowNodeInstance() {
        AbstractC1777e abstractC1777e = this.mDraweeControllerBuilder;
        if (abstractC1777e == null) {
            abstractC1777e = C1763c.m7212c();
        }
        return new C1454a(abstractC1777e, this.mCallerContext);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public View createViewInstance(C1278N c1278n) {
        throw new IllegalStateException("RCTTextInlineImage doesn't map into a native view");
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Class<? extends C1454a> getShadowNodeClass() {
        return C1454a.class;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(View view, Object obj) {
    }
}
