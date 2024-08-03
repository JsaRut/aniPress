package p031c.p032a.p072p.p073a.p088g;

import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: c.a.p.a.g.n */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC0786n implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    private final View f3447a;

    /* renamed from: b */
    private final ViewTreeObserverOnScrollChangedListenerC0787o f3448b;

    public ViewTreeObserverOnGlobalLayoutListenerC0786n(View view, ViewTreeObserverOnScrollChangedListenerC0787o viewTreeObserverOnScrollChangedListenerC0787o) {
        this.f3447a = view;
        this.f3448b = viewTreeObserverOnScrollChangedListenerC0787o;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        ViewTreeObserver viewTreeObserver = this.f3447a.getViewTreeObserver();
        if (Build.VERSION.SDK_INT >= 16) {
            viewTreeObserver.removeOnGlobalLayoutListener(this);
        } else {
            viewTreeObserver.removeGlobalOnLayoutListener(this);
        }
        ViewTreeObserverOnScrollChangedListenerC0787o viewTreeObserverOnScrollChangedListenerC0787o = this.f3448b;
        if (viewTreeObserverOnScrollChangedListenerC0787o != null) {
            viewTreeObserverOnScrollChangedListenerC0787o.onScrollChanged();
        }
    }
}
