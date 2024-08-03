package android.support.v7.widget;

import android.support.v7.widget.C0392C;
import android.view.ViewTreeObserver;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: android.support.v7.widget.E */
/* loaded from: classes.dex */
public class ViewTreeObserverOnGlobalLayoutListenerC0397E implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ C0392C.b f2024a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ViewTreeObserverOnGlobalLayoutListenerC0397E(C0392C.b bVar) {
        this.f2024a = bVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        C0392C.b bVar = this.f2024a;
        if (!bVar.m2153b(C0392C.this)) {
            this.f2024a.dismiss();
        } else {
            this.f2024a.m2154l();
            super/*android.support.v7.widget.U*/.mo1941c();
        }
    }
}
