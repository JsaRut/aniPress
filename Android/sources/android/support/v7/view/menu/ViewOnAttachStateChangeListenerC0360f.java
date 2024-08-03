package android.support.v7.view.menu;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: android.support.v7.view.menu.f */
/* loaded from: classes.dex */
public class ViewOnAttachStateChangeListenerC0360f implements View.OnAttachStateChangeListener {

    /* renamed from: a */
    final /* synthetic */ ViewOnKeyListenerC0363i f1759a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ViewOnAttachStateChangeListenerC0360f(ViewOnKeyListenerC0363i viewOnKeyListenerC0363i) {
        this.f1759a = viewOnKeyListenerC0363i;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        ViewTreeObserver viewTreeObserver = this.f1759a.f1791z;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f1759a.f1791z = view.getViewTreeObserver();
            }
            ViewOnKeyListenerC0363i viewOnKeyListenerC0363i = this.f1759a;
            viewOnKeyListenerC0363i.f1791z.removeGlobalOnLayoutListener(viewOnKeyListenerC0363i.f1776k);
        }
        view.removeOnAttachStateChangeListener(this);
    }
}
