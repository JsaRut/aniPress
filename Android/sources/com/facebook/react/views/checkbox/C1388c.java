package com.facebook.react.views.checkbox;

import android.content.Context;
import android.support.v7.widget.C0473sa;
import android.widget.CompoundButton;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerModule;

/* renamed from: com.facebook.react.views.checkbox.c */
/* loaded from: classes.dex */
class C1388c implements CompoundButton.OnCheckedChangeListener {
    /* renamed from: a */
    private ReactContext m5982a(CompoundButton compoundButton) {
        Context context = compoundButton.getContext();
        return (ReactContext) (context instanceof C0473sa ? ((C0473sa) context).getBaseContext() : compoundButton.getContext());
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        ((UIManagerModule) m5982a(compoundButton).getNativeModule(UIManagerModule.class)).getEventDispatcher().m5753a(new C1387b(compoundButton.getId(), z));
    }
}
