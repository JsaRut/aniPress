package android.support.v4.widget;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: android.support.v4.widget.j */
/* loaded from: classes.dex */
public class ViewOnApplyWindowInsetsListenerC0292j implements View.OnApplyWindowInsetsListener {

    /* renamed from: a */
    final /* synthetic */ C0293k f1306a;

    public ViewOnApplyWindowInsetsListenerC0292j(C0293k c0293k) {
        this.f1306a = c0293k;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        ((C0293k) view).m1650a(windowInsets, windowInsets.getSystemWindowInsetTop() > 0);
        return windowInsets.consumeSystemWindowInsets();
    }
}
