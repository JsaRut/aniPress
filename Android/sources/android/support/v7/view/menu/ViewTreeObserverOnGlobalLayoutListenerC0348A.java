package android.support.v7.view.menu;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: android.support.v7.view.menu.A */
/* loaded from: classes.dex */
public class ViewTreeObserverOnGlobalLayoutListenerC0348A implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ ViewOnKeyListenerC0352C f1664a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ViewTreeObserverOnGlobalLayoutListenerC0348A(ViewOnKeyListenerC0352C viewOnKeyListenerC0352C) {
        this.f1664a = viewOnKeyListenerC0352C;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        if (!this.f1664a.mo1940b() || this.f1664a.f1686j.m2415k()) {
            return;
        }
        View view = this.f1664a.f1691o;
        if (view == null || !view.isShown()) {
            this.f1664a.dismiss();
        } else {
            this.f1664a.f1686j.mo1941c();
        }
    }
}
