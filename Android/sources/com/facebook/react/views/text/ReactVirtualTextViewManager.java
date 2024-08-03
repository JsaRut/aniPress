package com.facebook.react.views.text;

import android.view.View;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.C1278N;
import p139d.p143b.p208m.p212d.p213a.InterfaceC2073a;

@InterfaceC2073a(name = ReactVirtualTextViewManager.REACT_CLASS)
/* loaded from: classes.dex */
public class ReactVirtualTextViewManager extends BaseViewManager<View, C1471v> {
    public static final String REACT_CLASS = "RCTVirtualText";

    @Override // com.facebook.react.uimanager.ViewManager
    public C1471v createShadowNodeInstance() {
        return new C1471v();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public View createViewInstance(C1278N c1278n) {
        throw new IllegalStateException("Attempt to create a native view for RCTVirtualText");
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Class<C1471v> getShadowNodeClass() {
        return C1471v.class;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(View view, Object obj) {
    }
}
