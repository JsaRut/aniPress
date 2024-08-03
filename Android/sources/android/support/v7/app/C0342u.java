package android.support.v7.app;

import android.view.View;
import p000a.p005b.p009c.p019h.C0076J;
import p000a.p005b.p009c.p019h.InterfaceC0075I;

/* renamed from: android.support.v7.app.u */
/* loaded from: classes.dex */
class C0342u extends C0076J {

    /* renamed from: a */
    final /* synthetic */ RunnableC0343v f1583a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0342u(RunnableC0343v runnableC0343v) {
        this.f1583a = runnableC0343v;
    }

    @Override // p000a.p005b.p009c.p019h.InterfaceC0075I
    /* renamed from: b */
    public void mo349b(View view) {
        this.f1583a.f1584a.f1622q.setAlpha(1.0f);
        this.f1583a.f1584a.f1625t.m340a((InterfaceC0075I) null);
        this.f1583a.f1584a.f1625t = null;
    }

    @Override // p000a.p005b.p009c.p019h.C0076J, p000a.p005b.p009c.p019h.InterfaceC0075I
    /* renamed from: c */
    public void mo350c(View view) {
        this.f1583a.f1584a.f1622q.setVisibility(0);
    }
}
