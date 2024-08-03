package com.facebook.react.views.checkbox;

import android.widget.CompoundButton;
import com.facebook.react.uimanager.C1278N;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.p127a.InterfaceC1294a;

/* loaded from: classes.dex */
public class ReactCheckBoxManager extends SimpleViewManager<C1386a> {
    private static final CompoundButton.OnCheckedChangeListener ON_CHECKED_CHANGE_LISTENER = new C1388c();
    private static final String REACT_CLASS = "AndroidCheckBox";

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(C1278N c1278n, C1386a c1386a) {
        c1386a.setOnCheckedChangeListener(ON_CHECKED_CHANGE_LISTENER);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public C1386a createViewInstance(C1278N c1278n) {
        return new C1386a(c1278n);
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @InterfaceC1294a(defaultBoolean = true, name = "enabled")
    public void setEnabled(C1386a c1386a, boolean z) {
        c1386a.setEnabled(z);
    }

    @InterfaceC1294a(name = "on")
    public void setOn(C1386a c1386a, boolean z) {
        c1386a.setOnCheckedChangeListener(null);
        c1386a.m5979a(z);
        c1386a.setOnCheckedChangeListener(ON_CHECKED_CHANGE_LISTENER);
    }
}
