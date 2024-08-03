package me.listenzz.modal;

import android.annotation.TargetApi;
import android.view.View;
import android.view.WindowInsets;

/* renamed from: me.listenzz.modal.c */
/* loaded from: classes.dex */
class ViewOnApplyWindowInsetsListenerC2741c implements View.OnApplyWindowInsetsListener {
    @Override // android.view.View.OnApplyWindowInsetsListener
    @TargetApi(21)
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(windowInsets);
        return onApplyWindowInsets.replaceSystemWindowInsets(onApplyWindowInsets.getSystemWindowInsetLeft(), 0, onApplyWindowInsets.getSystemWindowInsetRight(), onApplyWindowInsets.getSystemWindowInsetBottom());
    }
}
