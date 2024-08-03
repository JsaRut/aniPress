package com.facebook.react.views.textinput;

import android.view.View;
import com.facebook.react.uimanager.C1278N;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.events.AbstractC1330c;
import com.facebook.react.uimanager.events.C1333f;

/* renamed from: com.facebook.react.views.textinput.n */
/* loaded from: classes.dex */
public class ViewOnFocusChangeListenerC1493n implements View.OnFocusChangeListener {

    /* renamed from: a */
    final /* synthetic */ C1278N f5522a;

    /* renamed from: b */
    final /* synthetic */ C1483d f5523b;

    /* renamed from: c */
    final /* synthetic */ ReactTextInputManager f5524c;

    public ViewOnFocusChangeListenerC1493n(ReactTextInputManager reactTextInputManager, C1278N c1278n, C1483d c1483d) {
        this.f5524c = reactTextInputManager;
        this.f5522a = c1278n;
        this.f5523b = c1483d;
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(View view, boolean z) {
        AbstractC1330c c1487h;
        C1333f eventDispatcher = ((UIManagerModule) this.f5522a.getNativeModule(UIManagerModule.class)).getEventDispatcher();
        if (z) {
            c1487h = new C1489j(this.f5523b.getId());
        } else {
            eventDispatcher.m5753a(new C1486g(this.f5523b.getId()));
            c1487h = new C1487h(this.f5523b.getId(), this.f5523b.getText().toString());
        }
        eventDispatcher.m5753a(c1487h);
    }
}
