package com.facebook.react.uimanager;

import android.view.ViewGroup;
import com.facebook.react.uimanager.common.SizeMonitoringFrameLayout;

/* loaded from: classes.dex */
public class RootViewManager extends ViewGroupManager<ViewGroup> {
    public static final String REACT_CLASS = "RootView";

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public ViewGroup createViewInstance(C1278N c1278n) {
        return new SizeMonitoringFrameLayout(c1278n);
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }
}
