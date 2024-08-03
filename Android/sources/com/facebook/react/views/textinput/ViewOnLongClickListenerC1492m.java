package com.facebook.react.views.textinput;

import android.view.View;

/* renamed from: com.facebook.react.views.textinput.m */
/* loaded from: classes.dex */
class ViewOnLongClickListenerC1492m implements View.OnLongClickListener {

    /* renamed from: a */
    final /* synthetic */ boolean f5520a;

    /* renamed from: b */
    final /* synthetic */ ReactTextInputManager f5521b;

    public ViewOnLongClickListenerC1492m(ReactTextInputManager reactTextInputManager, boolean z) {
        this.f5521b = reactTextInputManager;
        this.f5520a = z;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        return this.f5520a;
    }
}
