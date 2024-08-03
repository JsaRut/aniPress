package com.facebook.react.modules.dialog;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import com.facebook.react.modules.dialog.DialogModule;

/* renamed from: com.facebook.react.modules.dialog.a */
/* loaded from: classes.dex */
public class DialogFragmentC1184a extends DialogFragment implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final DialogModule.DialogInterfaceOnClickListenerC1182a f4561a;

    public DialogFragmentC1184a() {
        this.f4561a = null;
    }

    @SuppressLint({"ValidFragment"})
    public DialogFragmentC1184a(DialogModule.DialogInterfaceOnClickListenerC1182a dialogInterfaceOnClickListenerC1182a, Bundle bundle) {
        this.f4561a = dialogInterfaceOnClickListenerC1182a;
        setArguments(bundle);
    }

    /* renamed from: a */
    public static Dialog m5330a(Context context, Bundle bundle, DialogInterface.OnClickListener onClickListener) {
        AlertDialog.Builder title = new AlertDialog.Builder(context).setTitle(bundle.getString("title"));
        if (bundle.containsKey("button_positive")) {
            title.setPositiveButton(bundle.getString("button_positive"), onClickListener);
        }
        if (bundle.containsKey("button_negative")) {
            title.setNegativeButton(bundle.getString("button_negative"), onClickListener);
        }
        if (bundle.containsKey("button_neutral")) {
            title.setNeutralButton(bundle.getString("button_neutral"), onClickListener);
        }
        if (bundle.containsKey("message")) {
            title.setMessage(bundle.getString("message"));
        }
        if (bundle.containsKey("items")) {
            title.setItems(bundle.getCharSequenceArray("items"), onClickListener);
        }
        return title.create();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        DialogModule.DialogInterfaceOnClickListenerC1182a dialogInterfaceOnClickListenerC1182a = this.f4561a;
        if (dialogInterfaceOnClickListenerC1182a != null) {
            dialogInterfaceOnClickListenerC1182a.onClick(dialogInterface, i);
        }
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        return m5330a(getActivity(), getArguments(), this);
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        DialogModule.DialogInterfaceOnClickListenerC1182a dialogInterfaceOnClickListenerC1182a = this.f4561a;
        if (dialogInterfaceOnClickListenerC1182a != null) {
            dialogInterfaceOnClickListenerC1182a.onDismiss(dialogInterface);
        }
    }
}
