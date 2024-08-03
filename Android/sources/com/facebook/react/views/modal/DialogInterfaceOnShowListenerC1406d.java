package com.facebook.react.views.modal;

import android.content.DialogInterface;
import com.facebook.react.uimanager.events.C1333f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.facebook.react.views.modal.d */
/* loaded from: classes.dex */
public class DialogInterfaceOnShowListenerC1406d implements DialogInterface.OnShowListener {

    /* renamed from: a */
    final /* synthetic */ C1333f f5170a;

    /* renamed from: b */
    final /* synthetic */ C1409g f5171b;

    /* renamed from: c */
    final /* synthetic */ ReactModalHostManager f5172c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DialogInterfaceOnShowListenerC1406d(ReactModalHostManager reactModalHostManager, C1333f c1333f, C1409g c1409g) {
        this.f5172c = reactModalHostManager;
        this.f5170a = c1333f;
        this.f5171b = c1409g;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public void onShow(DialogInterface dialogInterface) {
        this.f5170a.m5753a(new C1411i(this.f5171b.getId()));
    }
}
