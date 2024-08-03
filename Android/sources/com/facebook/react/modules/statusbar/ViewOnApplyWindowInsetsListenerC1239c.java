package com.facebook.react.modules.statusbar;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: com.facebook.react.modules.statusbar.c */
/* loaded from: classes.dex */
class ViewOnApplyWindowInsetsListenerC1239c implements View.OnApplyWindowInsetsListener {

    /* renamed from: a */
    final /* synthetic */ C1240d f4671a;

    public ViewOnApplyWindowInsetsListenerC1239c(C1240d c1240d) {
        this.f4671a = c1240d;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(windowInsets);
        return onApplyWindowInsets.replaceSystemWindowInsets(onApplyWindowInsets.getSystemWindowInsetLeft(), 0, onApplyWindowInsets.getSystemWindowInsetRight(), onApplyWindowInsets.getSystemWindowInsetBottom());
    }
}
