package com.facebook.react.views.switchview;

import android.widget.CompoundButton;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerModule;

/* renamed from: com.facebook.react.views.switchview.c */
/* loaded from: classes.dex */
class C1444c implements CompoundButton.OnCheckedChangeListener {
    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        ((UIManagerModule) ((ReactContext) compoundButton.getContext()).getNativeModule(UIManagerModule.class)).getEventDispatcher().m5753a(new C1443b(compoundButton.getId(), z));
    }
}
