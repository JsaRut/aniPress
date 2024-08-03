package p000a.p005b.p009c.p019h;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: a.b.c.h.u */
/* loaded from: classes.dex */
class ViewOnApplyWindowInsetsListenerC0106u implements View.OnApplyWindowInsetsListener {

    /* renamed from: a */
    final /* synthetic */ InterfaceC0102q f399a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ViewOnApplyWindowInsetsListenerC0106u(InterfaceC0102q interfaceC0102q) {
        this.f399a = interfaceC0102q;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        return (WindowInsets) C0078L.m353a(this.f399a.mo279a(view, C0078L.m352a(windowInsets)));
    }
}
