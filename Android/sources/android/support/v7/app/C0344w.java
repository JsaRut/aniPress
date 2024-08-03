package android.support.v7.app;

import android.view.View;
import p000a.p005b.p009c.p019h.C0076J;
import p000a.p005b.p009c.p019h.C0107v;
import p000a.p005b.p009c.p019h.InterfaceC0075I;

/* renamed from: android.support.v7.app.w */
/* loaded from: classes.dex */
public class C0344w extends C0076J {

    /* renamed from: a */
    final /* synthetic */ LayoutInflaterFactory2C0345x f1585a;

    public C0344w(LayoutInflaterFactory2C0345x layoutInflaterFactory2C0345x) {
        this.f1585a = layoutInflaterFactory2C0345x;
    }

    @Override // p000a.p005b.p009c.p019h.InterfaceC0075I
    /* renamed from: b */
    public void mo349b(View view) {
        this.f1585a.f1622q.setAlpha(1.0f);
        this.f1585a.f1625t.m340a((InterfaceC0075I) null);
        this.f1585a.f1625t = null;
    }

    @Override // p000a.p005b.p009c.p019h.C0076J, p000a.p005b.p009c.p019h.InterfaceC0075I
    /* renamed from: c */
    public void mo350c(View view) {
        this.f1585a.f1622q.setVisibility(0);
        this.f1585a.f1622q.sendAccessibilityEvent(32);
        if (this.f1585a.f1622q.getParent() instanceof View) {
            C0107v.m533u((View) this.f1585a.f1622q.getParent());
        }
    }
}
