package android.support.v7.app;

import android.support.v7.widget.ActionBarOverlayLayout;
import android.view.View;
import p000a.p005b.p009c.p019h.C0076J;
import p000a.p005b.p009c.p019h.C0107v;

/* renamed from: android.support.v7.app.F */
/* loaded from: classes.dex */
public class C0318F extends C0076J {

    /* renamed from: a */
    final /* synthetic */ C0321I f1504a;

    public C0318F(C0321I c0321i) {
        this.f1504a = c0321i;
    }

    @Override // p000a.p005b.p009c.p019h.InterfaceC0075I
    /* renamed from: b */
    public void mo349b(View view) {
        View view2;
        C0321I c0321i = this.f1504a;
        if (c0321i.f1536w && (view2 = c0321i.f1524k) != null) {
            view2.setTranslationY(0.0f);
            this.f1504a.f1521h.setTranslationY(0.0f);
        }
        this.f1504a.f1521h.setVisibility(8);
        this.f1504a.f1521h.setTransitioning(false);
        C0321I c0321i2 = this.f1504a;
        c0321i2.f1510B = null;
        c0321i2.m1797l();
        ActionBarOverlayLayout actionBarOverlayLayout = this.f1504a.f1520g;
        if (actionBarOverlayLayout != null) {
            C0107v.m533u(actionBarOverlayLayout);
        }
    }
}
