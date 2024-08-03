package com.swmansion.gesturehandler.react;

import com.facebook.react.common.C1104f;
import com.facebook.react.uimanager.C1278N;
import com.facebook.react.uimanager.ViewGroupManager;
import java.util.Map;
import p139d.p143b.p208m.p212d.p213a.InterfaceC2073a;

@InterfaceC2073a(name = RNGestureHandlerRootViewManager.REACT_CLASS)
/* loaded from: classes.dex */
public class RNGestureHandlerRootViewManager extends ViewGroupManager<C1633k> {
    public static final String REACT_CLASS = "GestureHandlerRootView";

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public C1633k createViewInstance(C1278N c1278n) {
        return new C1633k(c1278n);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map getExportedCustomDirectEventTypeConstants() {
        return C1104f.m5177a("onGestureHandlerEvent", C1104f.m5176a("registrationName", "onGestureHandlerEvent"), "onGestureHandlerStateChange", C1104f.m5176a("registrationName", "onGestureHandlerStateChange"));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(C1633k c1633k) {
        c1633k.m6797e();
    }
}
