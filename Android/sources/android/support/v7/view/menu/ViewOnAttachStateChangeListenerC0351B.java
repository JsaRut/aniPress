package android.support.v7.view.menu;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: android.support.v7.view.menu.B */
/* loaded from: classes.dex */
public class ViewOnAttachStateChangeListenerC0351B implements View.OnAttachStateChangeListener {

    /* renamed from: a */
    final /* synthetic */ ViewOnKeyListenerC0352C f1677a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ViewOnAttachStateChangeListenerC0351B(ViewOnKeyListenerC0352C viewOnKeyListenerC0352C) {
        this.f1677a = viewOnKeyListenerC0352C;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        ViewTreeObserver viewTreeObserver = this.f1677a.f1693q;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f1677a.f1693q = view.getViewTreeObserver();
            }
            ViewOnKeyListenerC0352C viewOnKeyListenerC0352C = this.f1677a;
            viewOnKeyListenerC0352C.f1693q.removeGlobalOnLayoutListener(viewOnKeyListenerC0352C.f1687k);
        }
        view.removeOnAttachStateChangeListener(this);
    }
}
