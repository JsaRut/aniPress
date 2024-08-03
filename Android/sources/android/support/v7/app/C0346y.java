package android.support.v7.app;

import android.support.v7.app.LayoutInflaterFactory2C0345x;
import android.view.View;
import android.widget.PopupWindow;
import p000a.p005b.p009c.p019h.C0076J;
import p000a.p005b.p009c.p019h.C0107v;
import p000a.p005b.p009c.p019h.InterfaceC0075I;

/* renamed from: android.support.v7.app.y */
/* loaded from: classes.dex */
class C0346y extends C0076J {

    /* renamed from: a */
    final /* synthetic */ LayoutInflaterFactory2C0345x.b f1662a;

    public C0346y(LayoutInflaterFactory2C0345x.b bVar) {
        this.f1662a = bVar;
    }

    @Override // p000a.p005b.p009c.p019h.InterfaceC0075I
    /* renamed from: b */
    public void mo349b(View view) {
        LayoutInflaterFactory2C0345x.this.f1622q.setVisibility(8);
        LayoutInflaterFactory2C0345x layoutInflaterFactory2C0345x = LayoutInflaterFactory2C0345x.this;
        PopupWindow popupWindow = layoutInflaterFactory2C0345x.f1623r;
        if (popupWindow != null) {
            popupWindow.dismiss();
        } else if (layoutInflaterFactory2C0345x.f1622q.getParent() instanceof View) {
            C0107v.m533u((View) LayoutInflaterFactory2C0345x.this.f1622q.getParent());
        }
        LayoutInflaterFactory2C0345x.this.f1622q.removeAllViews();
        LayoutInflaterFactory2C0345x.this.f1625t.m340a((InterfaceC0075I) null);
        LayoutInflaterFactory2C0345x.this.f1625t = null;
    }
}
