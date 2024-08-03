package com.facebook.react.views.picker;

import com.facebook.react.uimanager.C1278N;
import p139d.p143b.p208m.p212d.p213a.InterfaceC2073a;

@InterfaceC2073a(name = ReactDropdownPickerManager.REACT_CLASS)
/* loaded from: classes.dex */
public class ReactDropdownPickerManager extends ReactPickerManager {
    public static final String REACT_CLASS = "AndroidDropdownPicker";

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public C1417c createViewInstance(C1278N c1278n) {
        return new C1417c(c1278n, 1);
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }
}
