package com.facebook.react.modules.dialog;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogInterfaceOnCancelListenerC0201h;
import com.facebook.react.modules.dialog.DialogModule;

/* renamed from: com.facebook.react.modules.dialog.c */
/* loaded from: classes.dex */
public class DialogInterfaceOnClickListenerC1186c extends DialogInterfaceOnCancelListenerC0201h implements DialogInterface.OnClickListener {

    /* renamed from: ha */
    private final DialogModule.DialogInterfaceOnClickListenerC1182a f4566ha;

    public DialogInterfaceOnClickListenerC1186c() {
        this.f4566ha = null;
    }

    @SuppressLint({"ValidFragment"})
    public DialogInterfaceOnClickListenerC1186c(DialogModule.DialogInterfaceOnClickListenerC1182a dialogInterfaceOnClickListenerC1182a, Bundle bundle) {
        this.f4566ha = dialogInterfaceOnClickListenerC1182a;
        m993m(bundle);
    }

    @Override // android.support.v4.app.DialogInterfaceOnCancelListenerC0201h
    /* renamed from: n */
    public Dialog mo901n(Bundle bundle) {
        return DialogFragmentC1184a.m5330a(m968d(), m984i(), this);
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        DialogModule.DialogInterfaceOnClickListenerC1182a dialogInterfaceOnClickListenerC1182a = this.f4566ha;
        if (dialogInterfaceOnClickListenerC1182a != null) {
            dialogInterfaceOnClickListenerC1182a.onClick(dialogInterface, i);
        }
    }

    @Override // android.support.v4.app.DialogInterfaceOnCancelListenerC0201h, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        DialogModule.DialogInterfaceOnClickListenerC1182a dialogInterfaceOnClickListenerC1182a = this.f4566ha;
        if (dialogInterfaceOnClickListenerC1182a != null) {
            dialogInterfaceOnClickListenerC1182a.onDismiss(dialogInterface);
        }
    }
}
