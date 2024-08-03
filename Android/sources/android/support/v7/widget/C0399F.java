package android.support.v7.widget;

import android.support.v7.widget.C0392C;
import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: android.support.v7.widget.F */
/* loaded from: classes.dex */
public class C0399F implements PopupWindow.OnDismissListener {

    /* renamed from: a */
    final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f2026a;

    /* renamed from: b */
    final /* synthetic */ C0392C.b f2027b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0399F(C0392C.b bVar, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        this.f2027b = bVar;
        this.f2026a = onGlobalLayoutListener;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        ViewTreeObserver viewTreeObserver = C0392C.this.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f2026a);
        }
    }
}
