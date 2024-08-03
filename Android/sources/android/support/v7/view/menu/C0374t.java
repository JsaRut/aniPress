package android.support.v7.view.menu;

import android.widget.PopupWindow;

/* renamed from: android.support.v7.view.menu.t */
/* loaded from: classes.dex */
public class C0374t implements PopupWindow.OnDismissListener {

    /* renamed from: a */
    final /* synthetic */ C0375u f1884a;

    public C0374t(C0375u c0375u) {
        this.f1884a = c0375u;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f1884a.mo2090d();
    }
}
