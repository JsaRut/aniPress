package com.facebook.react.views.modal;

import android.content.DialogInterface;
import com.facebook.react.uimanager.events.C1333f;
import com.facebook.react.views.modal.C1409g;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.facebook.react.views.modal.c */
/* loaded from: classes.dex */
public class C1405c implements C1409g.b {

    /* renamed from: a */
    final /* synthetic */ C1333f f5167a;

    /* renamed from: b */
    final /* synthetic */ C1409g f5168b;

    /* renamed from: c */
    final /* synthetic */ ReactModalHostManager f5169c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1405c(ReactModalHostManager reactModalHostManager, C1333f c1333f, C1409g c1409g) {
        this.f5169c = reactModalHostManager;
        this.f5167a = c1333f;
        this.f5168b = c1409g;
    }

    @Override // com.facebook.react.views.modal.C1409g.b
    /* renamed from: a */
    public void mo6027a(DialogInterface dialogInterface) {
        this.f5167a.m5753a(new C1410h(this.f5168b.getId()));
    }
}
