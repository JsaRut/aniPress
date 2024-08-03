package com.facebook.react.views.scroll;

import com.facebook.react.uimanager.C1278N;
import com.facebook.react.uimanager.ViewGroupManager;
import p139d.p143b.p208m.p212d.p213a.InterfaceC2073a;

@InterfaceC2073a(name = ReactHorizontalScrollContainerViewManager.REACT_CLASS)
/* loaded from: classes.dex */
public class ReactHorizontalScrollContainerViewManager extends ViewGroupManager<C1422c> {
    public static final String REACT_CLASS = "AndroidHorizontalScrollContentView";

    @Override // com.facebook.react.uimanager.ViewManager
    public C1422c createViewInstance(C1278N c1278n) {
        return new C1422c(c1278n);
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }
}
