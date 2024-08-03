package android.support.v7.view.menu;

import android.support.v7.view.menu.ViewOnKeyListenerC0363i;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: android.support.v7.view.menu.e */
/* loaded from: classes.dex */
public class ViewTreeObserverOnGlobalLayoutListenerC0359e implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ ViewOnKeyListenerC0363i f1758a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ViewTreeObserverOnGlobalLayoutListenerC0359e(ViewOnKeyListenerC0363i viewOnKeyListenerC0363i) {
        this.f1758a = viewOnKeyListenerC0363i;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        if (!this.f1758a.mo1940b() || this.f1758a.f1775j.size() <= 0 || this.f1758a.f1775j.get(0).f1792a.m2415k()) {
            return;
        }
        View view = this.f1758a.f1782q;
        if (view == null || !view.isShown()) {
            this.f1758a.dismiss();
            return;
        }
        Iterator<ViewOnKeyListenerC0363i.a> it = this.f1758a.f1775j.iterator();
        while (it.hasNext()) {
            it.next().f1792a.mo1941c();
        }
    }
}
