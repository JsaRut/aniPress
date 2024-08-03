package android.support.v7.widget;

import android.view.View;
import p000a.p005b.p009c.p019h.C0076J;

/* renamed from: android.support.v7.widget.Ba */
/* loaded from: classes.dex */
class C0391Ba extends C0076J {

    /* renamed from: a */
    private boolean f1976a = false;

    /* renamed from: b */
    final /* synthetic */ int f1977b;

    /* renamed from: c */
    final /* synthetic */ C0393Ca f1978c;

    public C0391Ba(C0393Ca c0393Ca, int i) {
        this.f1978c = c0393Ca;
        this.f1977b = i;
    }

    @Override // p000a.p005b.p009c.p019h.C0076J, p000a.p005b.p009c.p019h.InterfaceC0075I
    /* renamed from: a */
    public void mo348a(View view) {
        this.f1976a = true;
    }

    @Override // p000a.p005b.p009c.p019h.InterfaceC0075I
    /* renamed from: b */
    public void mo349b(View view) {
        if (this.f1976a) {
            return;
        }
        this.f1978c.f1997a.setVisibility(this.f1977b);
    }

    @Override // p000a.p005b.p009c.p019h.C0076J, p000a.p005b.p009c.p019h.InterfaceC0075I
    /* renamed from: c */
    public void mo350c(View view) {
        this.f1978c.f1997a.setVisibility(0);
    }
}
