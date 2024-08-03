package com.facebook.react.views.text;

import android.view.View;
import com.facebook.react.uimanager.C1278N;
import com.facebook.react.uimanager.ViewManager;
import p139d.p143b.p208m.p212d.p213a.InterfaceC2073a;

@InterfaceC2073a(name = ReactRawTextManager.REACT_CLASS)
/* loaded from: classes.dex */
public class ReactRawTextManager extends ViewManager<View, C1461l> {
    public static final String REACT_CLASS = "RCTRawText";

    @Override // com.facebook.react.uimanager.ViewManager
    public C1461l createShadowNodeInstance() {
        return new C1461l();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public View createViewInstance(C1278N c1278n) {
        throw new IllegalStateException("Attempt to create a native view for RCTRawText");
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Class<? extends C1461l> getShadowNodeClass() {
        return C1461l.class;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(View view, Object obj) {
    }
}
