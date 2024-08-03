package com.facebook.react.views.modal;

import android.app.Activity;
import android.content.DialogInterface;
import android.view.KeyEvent;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.views.modal.C1409g;
import p139d.p143b.p204k.p205a.C2038a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.facebook.react.views.modal.e */
/* loaded from: classes.dex */
public class DialogInterfaceOnKeyListenerC1407e implements DialogInterface.OnKeyListener {

    /* renamed from: a */
    final /* synthetic */ C1409g f5173a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DialogInterfaceOnKeyListenerC1407e(C1409g c1409g) {
        this.f5173a = c1409g;
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        C1409g.b bVar;
        C1409g.b bVar2;
        if (keyEvent.getAction() != 1) {
            return false;
        }
        if (i != 4) {
            Activity currentActivity = ((ReactContext) this.f5173a.getContext()).getCurrentActivity();
            if (currentActivity != null) {
                return currentActivity.onKeyUp(i, keyEvent);
            }
            return false;
        }
        bVar = this.f5173a.f5185h;
        C2038a.m8319a(bVar, "setOnRequestCloseListener must be called by the manager");
        bVar2 = this.f5173a.f5185h;
        bVar2.mo6027a(dialogInterface);
        return true;
    }
}
