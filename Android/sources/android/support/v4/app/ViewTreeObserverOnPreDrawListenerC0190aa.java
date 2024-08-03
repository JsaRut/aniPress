package android.support.v4.app;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: android.support.v4.app.aa */
/* loaded from: classes.dex */
class ViewTreeObserverOnPreDrawListenerC0190aa implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: a */
    private final View f720a;

    /* renamed from: b */
    private ViewTreeObserver f721b;

    /* renamed from: c */
    private final Runnable f722c;

    private ViewTreeObserverOnPreDrawListenerC0190aa(View view, Runnable runnable) {
        this.f720a = view;
        this.f721b = view.getViewTreeObserver();
        this.f722c = runnable;
    }

    /* renamed from: a */
    public static ViewTreeObserverOnPreDrawListenerC0190aa m844a(View view, Runnable runnable) {
        ViewTreeObserverOnPreDrawListenerC0190aa viewTreeObserverOnPreDrawListenerC0190aa = new ViewTreeObserverOnPreDrawListenerC0190aa(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC0190aa);
        view.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC0190aa);
        return viewTreeObserverOnPreDrawListenerC0190aa;
    }

    /* renamed from: a */
    public void m845a() {
        (this.f721b.isAlive() ? this.f721b : this.f720a.getViewTreeObserver()).removeOnPreDrawListener(this);
        this.f720a.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        m845a();
        this.f722c.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.f721b = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        m845a();
    }
}
